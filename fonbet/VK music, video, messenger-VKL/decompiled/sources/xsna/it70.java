package xsna;

import androidx.room.l;
import com.ironsource.X3;
import com.vk.music.offline.core.database.OfflineAudioDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.nxn0;

/* compiled from: OfflineAudioDatabase_Impl.kt */
/* loaded from: classes.dex */
public final class it70 extends androidx.room.l {
    public final /* synthetic */ OfflineAudioDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it70(OfflineAudioDatabase_Impl offlineAudioDatabase_Impl) {
        super(10, "e7bd7c030e473ea3d3895e4df95097cb", "311e0f67f6a23f7fb73cf5ed9702ab02");
        this.d = offlineAudioDatabase_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `audio_restriction` (`id` INTEGER NOT NULL, `title` TEXT NOT NULL, `description` TEXT NOT NULL, `image` TEXT, `button_title` TEXT, `button_url` TEXT, `button_type` TEXT, PRIMARY KEY(`id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `audio_reaction` (`title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `reactions` TEXT NOT NULL, PRIMARY KEY(`title`, `subtitle`, `reactions`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `audio_track` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `mid` TEXT NOT NULL, `access_key` TEXT, `track_code` TEXT, `downloading_state` INTEGER NOT NULL, `title` TEXT, `subtitle` TEXT, `artist_name_fallback` TEXT, `main_artists` TEXT, `featured_artists` TEXT, `thumb` TEXT, `storage` TEXT, `url` TEXT, `manifest_url` TEXT, `corrupted_reason` INTEGER, `duration` INTEGER, `date` INTEGER, `is_explicit` INTEGER NOT NULL, `lyrics_id` INTEGER, `is_focus_track` INTEGER, `main_color` TEXT, `content_restriction` INTEGER NOT NULL, `json_raw` TEXT NOT NULL, `release_audio_id` TEXT)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_audio_track_uid_mid` ON `audio_track` (`uid`, `mid`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `playlist` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `pid` TEXT NOT NULL, `owner_id` TEXT, `access_key` TEXT, `track_code` TEXT NOT NULL, `downloading_state` INTEGER NOT NULL, `type` INTEGER NOT NULL, `title` TEXT, `subtitle` TEXT, `description` TEXT, `year` INTEGER NOT NULL, `genres` TEXT, `content_restriction` INTEGER NOT NULL, `is_explicit` INTEGER NOT NULL, `is_curator` INTEGER NOT NULL, `is_exclusive` INTEGER NOT NULL, `json_raw` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_playlist_uid_pid` ON `playlist` (`uid`, `pid`)");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_playlist_type` ON `playlist` (`type`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `playlists_to_tracks` (`uid` TEXT NOT NULL, `music_track_id` TEXT NOT NULL, `playlist_id` TEXT NOT NULL, PRIMARY KEY(`uid`, `music_track_id`, `playlist_id`))");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_playlists_to_tracks_uid` ON `playlists_to_tracks` (`uid`)");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_playlists_to_tracks_music_track_id` ON `playlists_to_tracks` (`music_track_id`)");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_playlists_to_tracks_playlist_id` ON `playlists_to_tracks` (`playlist_id`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `audio_book` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `book_id` INTEGER NOT NULL, `title` TEXT NOT NULL, `annotation` TEXT NOT NULL, `minimum_age` INTEGER NOT NULL, `is_explicit` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `updated_at` INTEGER NOT NULL, `cover_image` TEXT, `copyright` TEXT, `release_date` INTEGER, `is_favorite` INTEGER NOT NULL, `access_status` TEXT NOT NULL, `track_code` TEXT NOT NULL, `context_flags_mask` INTEGER NOT NULL, `restriction` TEXT, `downloading_state` INTEGER NOT NULL, `json_raw` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_audio_book_uid_book_id` ON `audio_book` (`uid`, `book_id`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `audio_book_chapter` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `chapter_id` TEXT NOT NULL, `title` TEXT NOT NULL, `url` TEXT, `duration` INTEGER, `progress_time` INTEGER NOT NULL, `progress_status` TEXT NOT NULL, `track_code` TEXT, `special_project_id` INTEGER, `context_flags_mask` INTEGER, `manifest_url` TEXT, `downloading_state` INTEGER NOT NULL, `storage` TEXT, `json_raw` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_audio_book_chapter_uid_chapter_id` ON `audio_book_chapter` (`uid`, `chapter_id`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `audio_book_to_chapters` (`uid` TEXT NOT NULL, `chapter_id` TEXT NOT NULL, `book_id` INTEGER NOT NULL, PRIMARY KEY(`uid`, `chapter_id`, `book_id`))");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_audio_book_to_chapters_uid` ON `audio_book_to_chapters` (`uid`)");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_audio_book_to_chapters_chapter_id` ON `audio_book_to_chapters` (`chapter_id`)");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_audio_book_to_chapters_book_id` ON `audio_book_to_chapters` (`book_id`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `podcast` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `podcast_id` INTEGER NOT NULL, `owner_id` TEXT NOT NULL, `podcast_title` TEXT, `playlist_id` INTEGER NOT NULL, `thumb` TEXT, `subtitle_badge` INTEGER NOT NULL, `subtitle` TEXT, `can_subscribe` INTEGER NOT NULL, `is_subscribed` INTEGER NOT NULL, `track_code` TEXT, `downloading_state` INTEGER NOT NULL, `json_raw` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_podcast_uid_owner_id` ON `podcast` (`uid`, `owner_id`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `episode` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `mid` TEXT NOT NULL, `track_code` TEXT, `title` TEXT, `artist` TEXT, `url` TEXT, `duration` INTEGER, `date` INTEGER, `is_explicit` INTEGER NOT NULL, `is_focus_track` INTEGER, `plays` INTEGER NOT NULL, `is_favorite` INTEGER NOT NULL, `position` INTEGER NOT NULL, `description` TEXT, `cover` TEXT, `post_id` TEXT, `is_donut` INTEGER NOT NULL, `downloading_state` INTEGER NOT NULL, `storage` TEXT, `manifest_url` TEXT, `json_raw` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_episode_uid_mid` ON `episode` (`uid`, `mid`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `podcast_to_episodes` (`uid` TEXT NOT NULL, `mid` TEXT NOT NULL, `podcast_owner_id` TEXT NOT NULL, PRIMARY KEY(`uid`, `mid`, `podcast_owner_id`))");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_podcast_to_episodes_uid` ON `podcast_to_episodes` (`uid`)");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_podcast_to_episodes_mid` ON `podcast_to_episodes` (`mid`)");
        p7i.e(hyg0Var, "CREATE INDEX IF NOT EXISTS `index_podcast_to_episodes_podcast_owner_id` ON `podcast_to_episodes` (`podcast_owner_id`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `auto_download_track` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `uid` TEXT NOT NULL, `mid` TEXT NOT NULL, `access_key` TEXT, `track_code` TEXT, `downloading_state` INTEGER NOT NULL, `title` TEXT, `subtitle` TEXT, `artist_name_fallback` TEXT, `main_artists` TEXT, `featured_artists` TEXT, `thumb` TEXT, `storage` TEXT, `url` TEXT, `manifest_url` TEXT, `duration` INTEGER, `date` INTEGER, `is_explicit` INTEGER NOT NULL, `lyrics_id` INTEGER, `is_focus_track` INTEGER, `main_color` TEXT, `content_restriction` INTEGER NOT NULL, `size_in_bytes` INTEGER, `auto_download_date` INTEGER, `initial_auto_download_date` INTEGER, `auto_download_type` INTEGER, `json_raw` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE UNIQUE INDEX IF NOT EXISTS `index_auto_download_track_uid_mid` ON `auto_download_track` (`uid`, `mid`)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e7bd7c030e473ea3d3895e4df95097cb')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `audio_restriction`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `audio_reaction`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `audio_track`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `playlist`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `playlists_to_tracks`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `audio_book`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `audio_book_chapter`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `audio_book_to_chapters`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `podcast`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `episode`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `podcast_to_episodes`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `auto_download_track`");
    }

    @Override // androidx.room.l
    public final void d(hyg0 hyg0Var) {
        this.d.r(hyg0Var);
    }

    @Override // androidx.room.l
    public final void f(hyg0 hyg0Var) {
        urk.a(hyg0Var);
    }

    @Override // androidx.room.l
    public final l.a g(hyg0 hyg0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap.put("title", new nxn0.a(0, "title", "TEXT", null, true, 1));
        linkedHashMap.put("description", new nxn0.a(0, "description", "TEXT", null, true, 1));
        linkedHashMap.put("image", new nxn0.a(0, "image", "TEXT", null, false, 1));
        linkedHashMap.put("button_title", new nxn0.a(0, "button_title", "TEXT", null, false, 1));
        linkedHashMap.put("button_url", new nxn0.a(0, "button_url", "TEXT", null, false, 1));
        nxn0 nxn0Var = new nxn0("audio_restriction", linkedHashMap, b690.a(linkedHashMap, "button_type", new nxn0.a(0, "button_type", "TEXT", null, false, 1)), new LinkedHashSet());
        nxn0 a = nxn0.b.a(hyg0Var, "audio_restriction");
        if (!nxn0Var.equals(a)) {
            return new l.a(false, t3j0.a("audio_restriction(com.vk.music.offline.core.database.entity.AudioRestrictionEntity).\n Expected:\n", nxn0Var, "\n Found:\n", a));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("title", new nxn0.a(1, "title", "TEXT", null, true, 1));
        linkedHashMap2.put("subtitle", new nxn0.a(2, "subtitle", "TEXT", null, true, 1));
        nxn0 nxn0Var2 = new nxn0("audio_reaction", linkedHashMap2, b690.a(linkedHashMap2, "reactions", new nxn0.a(3, "reactions", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a2 = nxn0.b.a(hyg0Var, "audio_reaction");
        if (!nxn0Var2.equals(a2)) {
            return new l.a(false, t3j0.a("audio_reaction(com.vk.music.offline.core.database.entity.AudioReactionConfigEntity).\n Expected:\n", nxn0Var2, "\n Found:\n", a2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap3.put("uid", new nxn0.a(0, "uid", "TEXT", null, true, 1));
        linkedHashMap3.put("mid", new nxn0.a(0, "mid", "TEXT", null, true, 1));
        linkedHashMap3.put("access_key", new nxn0.a(0, "access_key", "TEXT", null, false, 1));
        linkedHashMap3.put("track_code", new nxn0.a(0, "track_code", "TEXT", null, false, 1));
        linkedHashMap3.put("downloading_state", new nxn0.a(0, "downloading_state", "INTEGER", null, true, 1));
        linkedHashMap3.put("title", new nxn0.a(0, "title", "TEXT", null, false, 1));
        linkedHashMap3.put("subtitle", new nxn0.a(0, "subtitle", "TEXT", null, false, 1));
        linkedHashMap3.put("artist_name_fallback", new nxn0.a(0, "artist_name_fallback", "TEXT", null, false, 1));
        linkedHashMap3.put("main_artists", new nxn0.a(0, "main_artists", "TEXT", null, false, 1));
        linkedHashMap3.put("featured_artists", new nxn0.a(0, "featured_artists", "TEXT", null, false, 1));
        linkedHashMap3.put("thumb", new nxn0.a(0, "thumb", "TEXT", null, false, 1));
        linkedHashMap3.put(X3.a.k, new nxn0.a(0, X3.a.k, "TEXT", null, false, 1));
        linkedHashMap3.put("url", new nxn0.a(0, "url", "TEXT", null, false, 1));
        linkedHashMap3.put("manifest_url", new nxn0.a(0, "manifest_url", "TEXT", null, false, 1));
        linkedHashMap3.put("corrupted_reason", new nxn0.a(0, "corrupted_reason", "INTEGER", null, false, 1));
        linkedHashMap3.put("duration", new nxn0.a(0, "duration", "INTEGER", null, false, 1));
        linkedHashMap3.put("date", new nxn0.a(0, "date", "INTEGER", null, false, 1));
        linkedHashMap3.put("is_explicit", new nxn0.a(0, "is_explicit", "INTEGER", null, true, 1));
        linkedHashMap3.put("lyrics_id", new nxn0.a(0, "lyrics_id", "INTEGER", null, false, 1));
        linkedHashMap3.put("is_focus_track", new nxn0.a(0, "is_focus_track", "INTEGER", null, false, 1));
        linkedHashMap3.put("main_color", new nxn0.a(0, "main_color", "TEXT", null, false, 1));
        linkedHashMap3.put("content_restriction", new nxn0.a(0, "content_restriction", "INTEGER", null, true, 1));
        linkedHashMap3.put("json_raw", new nxn0.a(0, "json_raw", "TEXT", null, true, 1));
        LinkedHashSet a3 = b690.a(linkedHashMap3, "release_audio_id", new nxn0.a(0, "release_audio_id", "TEXT", null, false, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new nxn0.d("index_audio_track_uid_mid", e43.l("uid", "mid"), e43.l("ASC", "ASC"), true));
        nxn0 nxn0Var3 = new nxn0("audio_track", linkedHashMap3, a3, linkedHashSet);
        nxn0 a4 = nxn0.b.a(hyg0Var, "audio_track");
        if (!nxn0Var3.equals(a4)) {
            return new l.a(false, t3j0.a("audio_track(com.vk.music.offline.core.database.entity.MusicTrackEntity).\n Expected:\n", nxn0Var3, "\n Found:\n", a4));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap4.put("uid", new nxn0.a(0, "uid", "TEXT", null, true, 1));
        linkedHashMap4.put("pid", new nxn0.a(0, "pid", "TEXT", null, true, 1));
        linkedHashMap4.put("owner_id", new nxn0.a(0, "owner_id", "TEXT", null, false, 1));
        linkedHashMap4.put("access_key", new nxn0.a(0, "access_key", "TEXT", null, false, 1));
        linkedHashMap4.put("track_code", new nxn0.a(0, "track_code", "TEXT", null, true, 1));
        linkedHashMap4.put("downloading_state", new nxn0.a(0, "downloading_state", "INTEGER", null, true, 1));
        linkedHashMap4.put("type", new nxn0.a(0, "type", "INTEGER", null, true, 1));
        linkedHashMap4.put("title", new nxn0.a(0, "title", "TEXT", null, false, 1));
        linkedHashMap4.put("subtitle", new nxn0.a(0, "subtitle", "TEXT", null, false, 1));
        linkedHashMap4.put("description", new nxn0.a(0, "description", "TEXT", null, false, 1));
        linkedHashMap4.put("year", new nxn0.a(0, "year", "INTEGER", null, true, 1));
        linkedHashMap4.put("genres", new nxn0.a(0, "genres", "TEXT", null, false, 1));
        linkedHashMap4.put("content_restriction", new nxn0.a(0, "content_restriction", "INTEGER", null, true, 1));
        linkedHashMap4.put("is_explicit", new nxn0.a(0, "is_explicit", "INTEGER", null, true, 1));
        linkedHashMap4.put("is_curator", new nxn0.a(0, "is_curator", "INTEGER", null, true, 1));
        linkedHashMap4.put("is_exclusive", new nxn0.a(0, "is_exclusive", "INTEGER", null, true, 1));
        LinkedHashSet a5 = b690.a(linkedHashMap4, "json_raw", new nxn0.a(0, "json_raw", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new nxn0.d("index_playlist_uid_pid", e43.l("uid", "pid"), e43.l("ASC", "ASC"), true));
        linkedHashSet2.add(new nxn0.d("index_playlist_type", e43.k("type"), e43.k("ASC"), false));
        nxn0 nxn0Var4 = new nxn0("playlist", linkedHashMap4, a5, linkedHashSet2);
        nxn0 a6 = nxn0.b.a(hyg0Var, "playlist");
        if (!nxn0Var4.equals(a6)) {
            return new l.a(false, t3j0.a("playlist(com.vk.music.offline.core.database.entity.PlaylistEntity).\n Expected:\n", nxn0Var4, "\n Found:\n", a6));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("uid", new nxn0.a(1, "uid", "TEXT", null, true, 1));
        linkedHashMap5.put("music_track_id", new nxn0.a(2, "music_track_id", "TEXT", null, true, 1));
        LinkedHashSet a7 = b690.a(linkedHashMap5, "playlist_id", new nxn0.a(3, "playlist_id", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        linkedHashSet3.add(new nxn0.d("index_playlists_to_tracks_uid", e43.k("uid"), e43.k("ASC"), false));
        linkedHashSet3.add(new nxn0.d("index_playlists_to_tracks_music_track_id", e43.k("music_track_id"), e43.k("ASC"), false));
        linkedHashSet3.add(new nxn0.d("index_playlists_to_tracks_playlist_id", e43.k("playlist_id"), e43.k("ASC"), false));
        nxn0 nxn0Var5 = new nxn0("playlists_to_tracks", linkedHashMap5, a7, linkedHashSet3);
        nxn0 a8 = nxn0.b.a(hyg0Var, "playlists_to_tracks");
        if (!nxn0Var5.equals(a8)) {
            return new l.a(false, t3j0.a("playlists_to_tracks(com.vk.music.offline.core.database.entity.PlaylistsToTracksEntity).\n Expected:\n", nxn0Var5, "\n Found:\n", a8));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap6.put("uid", new nxn0.a(0, "uid", "TEXT", null, true, 1));
        linkedHashMap6.put("book_id", new nxn0.a(0, "book_id", "INTEGER", null, true, 1));
        linkedHashMap6.put("title", new nxn0.a(0, "title", "TEXT", null, true, 1));
        linkedHashMap6.put("annotation", new nxn0.a(0, "annotation", "TEXT", null, true, 1));
        linkedHashMap6.put("minimum_age", new nxn0.a(0, "minimum_age", "INTEGER", null, true, 1));
        linkedHashMap6.put("is_explicit", new nxn0.a(0, "is_explicit", "INTEGER", null, true, 1));
        linkedHashMap6.put("duration", new nxn0.a(0, "duration", "INTEGER", null, true, 1));
        linkedHashMap6.put("updated_at", new nxn0.a(0, "updated_at", "INTEGER", null, true, 1));
        linkedHashMap6.put("cover_image", new nxn0.a(0, "cover_image", "TEXT", null, false, 1));
        linkedHashMap6.put("copyright", new nxn0.a(0, "copyright", "TEXT", null, false, 1));
        linkedHashMap6.put("release_date", new nxn0.a(0, "release_date", "INTEGER", null, false, 1));
        linkedHashMap6.put("is_favorite", new nxn0.a(0, "is_favorite", "INTEGER", null, true, 1));
        linkedHashMap6.put("access_status", new nxn0.a(0, "access_status", "TEXT", null, true, 1));
        linkedHashMap6.put("track_code", new nxn0.a(0, "track_code", "TEXT", null, true, 1));
        linkedHashMap6.put("context_flags_mask", new nxn0.a(0, "context_flags_mask", "INTEGER", null, true, 1));
        linkedHashMap6.put("restriction", new nxn0.a(0, "restriction", "TEXT", null, false, 1));
        linkedHashMap6.put("downloading_state", new nxn0.a(0, "downloading_state", "INTEGER", null, true, 1));
        LinkedHashSet a9 = b690.a(linkedHashMap6, "json_raw", new nxn0.a(0, "json_raw", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new nxn0.d("index_audio_book_uid_book_id", e43.l("uid", "book_id"), e43.l("ASC", "ASC"), true));
        nxn0 nxn0Var6 = new nxn0("audio_book", linkedHashMap6, a9, linkedHashSet4);
        nxn0 a10 = nxn0.b.a(hyg0Var, "audio_book");
        if (!nxn0Var6.equals(a10)) {
            return new l.a(false, t3j0.a("audio_book(com.vk.music.offline.core.database.entity.AudioBookEntity).\n Expected:\n", nxn0Var6, "\n Found:\n", a10));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap7.put("uid", new nxn0.a(0, "uid", "TEXT", null, true, 1));
        linkedHashMap7.put("chapter_id", new nxn0.a(0, "chapter_id", "TEXT", null, true, 1));
        linkedHashMap7.put("title", new nxn0.a(0, "title", "TEXT", null, true, 1));
        linkedHashMap7.put("url", new nxn0.a(0, "url", "TEXT", null, false, 1));
        linkedHashMap7.put("duration", new nxn0.a(0, "duration", "INTEGER", null, false, 1));
        linkedHashMap7.put("progress_time", new nxn0.a(0, "progress_time", "INTEGER", null, true, 1));
        linkedHashMap7.put("progress_status", new nxn0.a(0, "progress_status", "TEXT", null, true, 1));
        linkedHashMap7.put("track_code", new nxn0.a(0, "track_code", "TEXT", null, false, 1));
        linkedHashMap7.put("special_project_id", new nxn0.a(0, "special_project_id", "INTEGER", null, false, 1));
        linkedHashMap7.put("context_flags_mask", new nxn0.a(0, "context_flags_mask", "INTEGER", null, false, 1));
        linkedHashMap7.put("manifest_url", new nxn0.a(0, "manifest_url", "TEXT", null, false, 1));
        linkedHashMap7.put("downloading_state", new nxn0.a(0, "downloading_state", "INTEGER", null, true, 1));
        linkedHashMap7.put(X3.a.k, new nxn0.a(0, X3.a.k, "TEXT", null, false, 1));
        LinkedHashSet a11 = b690.a(linkedHashMap7, "json_raw", new nxn0.a(0, "json_raw", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new nxn0.d("index_audio_book_chapter_uid_chapter_id", e43.l("uid", "chapter_id"), e43.l("ASC", "ASC"), true));
        nxn0 nxn0Var7 = new nxn0("audio_book_chapter", linkedHashMap7, a11, linkedHashSet5);
        nxn0 a12 = nxn0.b.a(hyg0Var, "audio_book_chapter");
        if (!nxn0Var7.equals(a12)) {
            return new l.a(false, t3j0.a("audio_book_chapter(com.vk.music.offline.core.database.entity.ChapterEntity).\n Expected:\n", nxn0Var7, "\n Found:\n", a12));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("uid", new nxn0.a(1, "uid", "TEXT", null, true, 1));
        linkedHashMap8.put("chapter_id", new nxn0.a(2, "chapter_id", "TEXT", null, true, 1));
        LinkedHashSet a13 = b690.a(linkedHashMap8, "book_id", new nxn0.a(3, "book_id", "INTEGER", null, true, 1));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new nxn0.d("index_audio_book_to_chapters_uid", e43.k("uid"), e43.k("ASC"), false));
        linkedHashSet6.add(new nxn0.d("index_audio_book_to_chapters_chapter_id", e43.k("chapter_id"), e43.k("ASC"), false));
        linkedHashSet6.add(new nxn0.d("index_audio_book_to_chapters_book_id", e43.k("book_id"), e43.k("ASC"), false));
        nxn0 nxn0Var8 = new nxn0("audio_book_to_chapters", linkedHashMap8, a13, linkedHashSet6);
        nxn0 a14 = nxn0.b.a(hyg0Var, "audio_book_to_chapters");
        if (!nxn0Var8.equals(a14)) {
            return new l.a(false, t3j0.a("audio_book_to_chapters(com.vk.music.offline.core.database.entity.AudioBookToChaptersEntity).\n Expected:\n", nxn0Var8, "\n Found:\n", a14));
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap9.put("uid", new nxn0.a(0, "uid", "TEXT", null, true, 1));
        linkedHashMap9.put("podcast_id", new nxn0.a(0, "podcast_id", "INTEGER", null, true, 1));
        linkedHashMap9.put("owner_id", new nxn0.a(0, "owner_id", "TEXT", null, true, 1));
        linkedHashMap9.put("podcast_title", new nxn0.a(0, "podcast_title", "TEXT", null, false, 1));
        linkedHashMap9.put("playlist_id", new nxn0.a(0, "playlist_id", "INTEGER", null, true, 1));
        linkedHashMap9.put("thumb", new nxn0.a(0, "thumb", "TEXT", null, false, 1));
        linkedHashMap9.put("subtitle_badge", new nxn0.a(0, "subtitle_badge", "INTEGER", null, true, 1));
        linkedHashMap9.put("subtitle", new nxn0.a(0, "subtitle", "TEXT", null, false, 1));
        linkedHashMap9.put("can_subscribe", new nxn0.a(0, "can_subscribe", "INTEGER", null, true, 1));
        linkedHashMap9.put("is_subscribed", new nxn0.a(0, "is_subscribed", "INTEGER", null, true, 1));
        linkedHashMap9.put("track_code", new nxn0.a(0, "track_code", "TEXT", null, false, 1));
        linkedHashMap9.put("downloading_state", new nxn0.a(0, "downloading_state", "INTEGER", null, true, 1));
        LinkedHashSet a15 = b690.a(linkedHashMap9, "json_raw", new nxn0.a(0, "json_raw", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new nxn0.d("index_podcast_uid_owner_id", e43.l("uid", "owner_id"), e43.l("ASC", "ASC"), true));
        nxn0 nxn0Var9 = new nxn0("podcast", linkedHashMap9, a15, linkedHashSet7);
        nxn0 a16 = nxn0.b.a(hyg0Var, "podcast");
        if (!nxn0Var9.equals(a16)) {
            return new l.a(false, t3j0.a("podcast(com.vk.music.offline.core.database.entity.PodcastEntity).\n Expected:\n", nxn0Var9, "\n Found:\n", a16));
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap10.put("uid", new nxn0.a(0, "uid", "TEXT", null, true, 1));
        linkedHashMap10.put("mid", new nxn0.a(0, "mid", "TEXT", null, true, 1));
        linkedHashMap10.put("track_code", new nxn0.a(0, "track_code", "TEXT", null, false, 1));
        linkedHashMap10.put("title", new nxn0.a(0, "title", "TEXT", null, false, 1));
        linkedHashMap10.put("artist", new nxn0.a(0, "artist", "TEXT", null, false, 1));
        linkedHashMap10.put("url", new nxn0.a(0, "url", "TEXT", null, false, 1));
        linkedHashMap10.put("duration", new nxn0.a(0, "duration", "INTEGER", null, false, 1));
        linkedHashMap10.put("date", new nxn0.a(0, "date", "INTEGER", null, false, 1));
        linkedHashMap10.put("is_explicit", new nxn0.a(0, "is_explicit", "INTEGER", null, true, 1));
        linkedHashMap10.put("is_focus_track", new nxn0.a(0, "is_focus_track", "INTEGER", null, false, 1));
        linkedHashMap10.put("plays", new nxn0.a(0, "plays", "INTEGER", null, true, 1));
        linkedHashMap10.put("is_favorite", new nxn0.a(0, "is_favorite", "INTEGER", null, true, 1));
        linkedHashMap10.put(X3.i.L, new nxn0.a(0, X3.i.L, "INTEGER", null, true, 1));
        linkedHashMap10.put("description", new nxn0.a(0, "description", "TEXT", null, false, 1));
        linkedHashMap10.put("cover", new nxn0.a(0, "cover", "TEXT", null, false, 1));
        linkedHashMap10.put("post_id", new nxn0.a(0, "post_id", "TEXT", null, false, 1));
        linkedHashMap10.put("is_donut", new nxn0.a(0, "is_donut", "INTEGER", null, true, 1));
        linkedHashMap10.put("downloading_state", new nxn0.a(0, "downloading_state", "INTEGER", null, true, 1));
        linkedHashMap10.put(X3.a.k, new nxn0.a(0, X3.a.k, "TEXT", null, false, 1));
        linkedHashMap10.put("manifest_url", new nxn0.a(0, "manifest_url", "TEXT", null, false, 1));
        LinkedHashSet a17 = b690.a(linkedHashMap10, "json_raw", new nxn0.a(0, "json_raw", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new nxn0.d("index_episode_uid_mid", e43.l("uid", "mid"), e43.l("ASC", "ASC"), true));
        nxn0 nxn0Var10 = new nxn0("episode", linkedHashMap10, a17, linkedHashSet8);
        nxn0 a18 = nxn0.b.a(hyg0Var, "episode");
        if (!nxn0Var10.equals(a18)) {
            return new l.a(false, t3j0.a("episode(com.vk.music.offline.core.database.entity.EpisodeEntity).\n Expected:\n", nxn0Var10, "\n Found:\n", a18));
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("uid", new nxn0.a(1, "uid", "TEXT", null, true, 1));
        linkedHashMap11.put("mid", new nxn0.a(2, "mid", "TEXT", null, true, 1));
        LinkedHashSet a19 = b690.a(linkedHashMap11, "podcast_owner_id", new nxn0.a(3, "podcast_owner_id", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new nxn0.d("index_podcast_to_episodes_uid", e43.k("uid"), e43.k("ASC"), false));
        linkedHashSet9.add(new nxn0.d("index_podcast_to_episodes_mid", e43.k("mid"), e43.k("ASC"), false));
        linkedHashSet9.add(new nxn0.d("index_podcast_to_episodes_podcast_owner_id", e43.k("podcast_owner_id"), e43.k("ASC"), false));
        nxn0 nxn0Var11 = new nxn0("podcast_to_episodes", linkedHashMap11, a19, linkedHashSet9);
        nxn0 a20 = nxn0.b.a(hyg0Var, "podcast_to_episodes");
        if (!nxn0Var11.equals(a20)) {
            return new l.a(false, t3j0.a("podcast_to_episodes(com.vk.music.offline.core.database.entity.PodcastToEpisodesEntity).\n Expected:\n", nxn0Var11, "\n Found:\n", a20));
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap12.put("uid", new nxn0.a(0, "uid", "TEXT", null, true, 1));
        linkedHashMap12.put("mid", new nxn0.a(0, "mid", "TEXT", null, true, 1));
        linkedHashMap12.put("access_key", new nxn0.a(0, "access_key", "TEXT", null, false, 1));
        linkedHashMap12.put("track_code", new nxn0.a(0, "track_code", "TEXT", null, false, 1));
        linkedHashMap12.put("downloading_state", new nxn0.a(0, "downloading_state", "INTEGER", null, true, 1));
        linkedHashMap12.put("title", new nxn0.a(0, "title", "TEXT", null, false, 1));
        linkedHashMap12.put("subtitle", new nxn0.a(0, "subtitle", "TEXT", null, false, 1));
        linkedHashMap12.put("artist_name_fallback", new nxn0.a(0, "artist_name_fallback", "TEXT", null, false, 1));
        linkedHashMap12.put("main_artists", new nxn0.a(0, "main_artists", "TEXT", null, false, 1));
        linkedHashMap12.put("featured_artists", new nxn0.a(0, "featured_artists", "TEXT", null, false, 1));
        linkedHashMap12.put("thumb", new nxn0.a(0, "thumb", "TEXT", null, false, 1));
        linkedHashMap12.put(X3.a.k, new nxn0.a(0, X3.a.k, "TEXT", null, false, 1));
        linkedHashMap12.put("url", new nxn0.a(0, "url", "TEXT", null, false, 1));
        linkedHashMap12.put("manifest_url", new nxn0.a(0, "manifest_url", "TEXT", null, false, 1));
        linkedHashMap12.put("duration", new nxn0.a(0, "duration", "INTEGER", null, false, 1));
        linkedHashMap12.put("date", new nxn0.a(0, "date", "INTEGER", null, false, 1));
        linkedHashMap12.put("is_explicit", new nxn0.a(0, "is_explicit", "INTEGER", null, true, 1));
        linkedHashMap12.put("lyrics_id", new nxn0.a(0, "lyrics_id", "INTEGER", null, false, 1));
        linkedHashMap12.put("is_focus_track", new nxn0.a(0, "is_focus_track", "INTEGER", null, false, 1));
        linkedHashMap12.put("main_color", new nxn0.a(0, "main_color", "TEXT", null, false, 1));
        linkedHashMap12.put("content_restriction", new nxn0.a(0, "content_restriction", "INTEGER", null, true, 1));
        linkedHashMap12.put("size_in_bytes", new nxn0.a(0, "size_in_bytes", "INTEGER", null, false, 1));
        linkedHashMap12.put("auto_download_date", new nxn0.a(0, "auto_download_date", "INTEGER", null, false, 1));
        linkedHashMap12.put("initial_auto_download_date", new nxn0.a(0, "initial_auto_download_date", "INTEGER", null, false, 1));
        linkedHashMap12.put("auto_download_type", new nxn0.a(0, "auto_download_type", "INTEGER", null, false, 1));
        LinkedHashSet a21 = b690.a(linkedHashMap12, "json_raw", new nxn0.a(0, "json_raw", "TEXT", null, true, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new nxn0.d("index_auto_download_track_uid_mid", e43.l("uid", "mid"), e43.l("ASC", "ASC"), true));
        nxn0 nxn0Var12 = new nxn0("auto_download_track", linkedHashMap12, a21, linkedHashSet10);
        nxn0 a22 = nxn0.b.a(hyg0Var, "auto_download_track");
        return !nxn0Var12.equals(a22) ? new l.a(false, t3j0.a("auto_download_track(com.vk.music.offline.core.database.entity.AutoDownloadTrackEntity).\n Expected:\n", nxn0Var12, "\n Found:\n", a22)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
