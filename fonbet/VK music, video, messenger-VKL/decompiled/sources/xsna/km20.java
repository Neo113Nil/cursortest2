package xsna;

import android.annotation.SuppressLint;

/* compiled from: MigrationHelper.kt */
/* loaded from: classes3.dex */
public final class km20 implements w8i {
    public final sin0 b;
    public final bpn0 c = new bpn0(new tvj(this, 23));

    public km20(sin0 sin0Var) {
        this.b = sin0Var;
    }

    @SuppressLint({"CheckResult"})
    public final void a() {
        itg0.l(new io.reactivex.rxjava3.internal.operators.completable.m(new jm20(this, 0)).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()));
    }

    public final void b() {
        this.b.execSQL("ALTER TABLE audio_track ADD COLUMN corrupted_reason INTEGER DEFAULT NULL");
    }

    public final void c() {
        sin0 sin0Var = this.b;
        vr.d(sin0Var, "CREATE TABLE IF NOT EXISTS audio_track (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    uid TEXT NOT NULL,\n    mid TEXT NOT NULL, \n    access_key TEXT, \n    track_code TEXT, \n    downloading_state INTEGER NOT NULL, \n    title TEXT, \n    subtitle TEXT, \n    artist_name_fallback TEXT,\n    main_artists TEXT,\n    featured_artists TEXT,\n    thumb TEXT,\n    storage TEXT,\n    url TEXT, \n    manifest_url TEXT, \n    duration INTEGER, \n    date INTEGER, \n    is_explicit INTEGER NOT NULL, \n    lyrics_id INTEGER, \n    is_focus_track INTEGER, \n    main_color TEXT, \n    content_restriction INTEGER NOT NULL, \n    json_raw TEXT NOT NULL\n)", "CREATE UNIQUE INDEX IF NOT EXISTS index_audio_track_uid_mid ON audio_track (uid, mid)", "CREATE TABLE IF NOT EXISTS playlist (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    uid TEXT NOT NULL,\n    pid TEXT NOT NULL,\n    owner_id TEXT,\n    access_key TEXT,\n    track_code TEXT NOT NULL,\n    downloading_state INTEGER NOT NULL,\n    type INTEGER NOT NULL DEFAULT 0,\n    title TEXT,\n    subtitle TEXT,\n    description TEXT,\n    year INTEGER NOT NULL DEFAULT 0,\n    genres TEXT,\n    content_restriction INTEGER NOT NULL,\n    is_explicit INTEGER NOT NULL DEFAULT 0,\n    is_curator INTEGER NOT NULL DEFAULT 0,\n    is_exclusive INTEGER NOT NULL DEFAULT 0,\n    json_raw TEXT NOT NULL\n)", "CREATE UNIQUE INDEX IF NOT EXISTS index_playlist_uid_pid ON playlist (uid, pid)");
        vr.d(sin0Var, "CREATE INDEX IF NOT EXISTS index_playlist_type ON playlist (type)", "CREATE TABLE IF NOT EXISTS playlists_to_tracks (\n    uid TEXT NOT NULL,\n    music_track_id TEXT NOT NULL,\n    playlist_id TEXT NOT NULL,\n    PRIMARY KEY(uid, music_track_id, playlist_id)\n)", "CREATE INDEX IF NOT EXISTS index_playlists_to_tracks_music_track_id ON playlists_to_tracks(music_track_id)", "CREATE INDEX IF NOT EXISTS index_playlists_to_tracks_playlist_id ON playlists_to_tracks(playlist_id)");
        sin0Var.execSQL("CREATE INDEX IF NOT EXISTS index_playlists_to_tracks_uid ON playlists_to_tracks(uid)");
        a();
    }

    public final void d() {
        vr.d(this.b, "ALTER TABLE audio_restriction ADD COLUMN button_type TEXT DEFAULT NULL;", "ALTER TABLE audio_restriction ADD COLUMN button_title TEXT DEFAULT NULL;", "ALTER TABLE audio_restriction ADD COLUMN button_url TEXT DEFAULT NULL;", "ALTER TABLE audio_restriction ADD COLUMN image TEXT DEFAULT NULL;");
    }

    public final void e() {
        this.b.execSQL("CREATE TABLE IF NOT EXISTS audio_reaction (title text NOT NULL, subtitle text NOT NULL, reactions TEXT NOT NULL, PRIMARY KEY(`title`, `subtitle`, `reactions`))");
    }

    public final void f() {
        sin0 sin0Var = this.b;
        vr.d(sin0Var, "CREATE TABLE IF NOT EXISTS audio_book (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    uid TEXT NOT NULL,\n    book_id INTEGER NOT NULL,\n    title TEXT NOT NULL,\n    annotation TEXT NOT NULL,\n    minimum_age INTEGER NOT NULL,\n    is_explicit INTEGER NOT NULL,\n    duration INTEGER NOT NULL,\n    updated_at INTEGER NOT NULL,\n    cover_image TEXT,\n    copyright TEXT,\n    release_date INTEGER,\n    is_favorite INTEGER NOT NULL,\n    access_status TEXT NOT NULL,\n    track_code TEXT NOT NULL,\n    context_flags_mask INTEGER NOT NULL,\n    restriction TEXT,\n    downloading_state INTEGER NOT NULL,\n    json_raw TEXT NOT NULL\n)", "CREATE UNIQUE INDEX IF NOT EXISTS index_audio_book_uid_book_id ON audio_book (uid, book_id)", "CREATE TABLE IF NOT EXISTS audio_book_chapter (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    uid TEXT NOT NULL,\n    chapter_id TEXT NOT NULL,\n    title TEXT NOT NULL,\n    url TEXT,\n    duration INTEGER,\n    progress_time INTEGER NOT NULL,\n    progress_status TEXT NOT NULL,\n    track_code TEXT,\n    special_project_id INTEGER,\n    context_flags_mask INTEGER,\n    manifest_url TEXT,\n    downloading_state INTEGER NOT NULL,\n    storage TEXT,\n    json_raw TEXT NOT NULL\n)", "CREATE UNIQUE INDEX IF NOT EXISTS index_audio_book_chapter_uid_chapter_id ON audio_book_chapter (uid, chapter_id)");
        vr.d(sin0Var, "CREATE TABLE IF NOT EXISTS audio_book_to_chapters (\n    uid TEXT NOT NULL,\n    chapter_id TEXT NOT NULL,\n    book_id INTEGER NOT NULL,\n    PRIMARY KEY (uid, chapter_id, book_id)\n)", "CREATE INDEX IF NOT EXISTS index_audio_book_to_chapters_uid ON audio_book_to_chapters (uid)", "CREATE INDEX IF NOT EXISTS index_audio_book_to_chapters_chapter_id ON audio_book_to_chapters (chapter_id)", "CREATE INDEX IF NOT EXISTS index_audio_book_to_chapters_book_id ON audio_book_to_chapters (book_id)");
    }

    public final void g() {
        sin0 sin0Var = this.b;
        vr.d(sin0Var, "CREATE TABLE IF NOT EXISTS podcast (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    uid TEXT NOT NULL,\n    podcast_id INTEGER NOT NULL,\n    owner_id TEXT NOT NULL,\n    podcast_title TEXT,\n    playlist_id INTEGER NOT NULL,\n    thumb TEXT,\n    subtitle_badge INTEGER NOT NULL,\n    subtitle TEXT,\n    can_subscribe INTEGER NOT NULL,\n    is_subscribed INTEGER NOT NULL,\n    track_code TEXT,\n    downloading_state INTEGER NOT NULL,\n    json_raw TEXT NOT NULL\n)", "CREATE UNIQUE INDEX IF NOT EXISTS index_podcast_uid_owner_id ON podcast (uid, owner_id)", "CREATE TABLE IF NOT EXISTS episode (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    uid TEXT NOT NULL,\n    mid TEXT NOT NULL,\n    track_code TEXT,\n    title TEXT,\n    artist TEXT,\n    url TEXT,\n    duration INTEGER,\n    date INTEGER,\n    is_explicit INTEGER NOT NULL,\n    is_focus_track INTEGER,\n    plays INTEGER NOT NULL,\n    is_favorite INTEGER NOT NULL,\n    position INTEGER NOT NULL,\n    description TEXT,\n    cover TEXT,\n    post_id TEXT,\n    is_donut INTEGER NOT NULL,\n    downloading_state INTEGER NOT NULL,\n    storage TEXT,\n    manifest_url TEXT,\n    json_raw TEXT NOT NULL\n)", "CREATE UNIQUE INDEX IF NOT EXISTS index_episode_uid_mid ON episode (uid, mid)");
        vr.d(sin0Var, "CREATE TABLE IF NOT EXISTS podcast_to_episodes (\n    uid TEXT NOT NULL,\n    mid TEXT NOT NULL,\n    podcast_owner_id TEXT NOT NULL,\n    PRIMARY KEY (uid, mid, podcast_owner_id)\n)", "CREATE INDEX IF NOT EXISTS index_podcast_to_episodes_uid ON podcast_to_episodes (uid)", "CREATE INDEX IF NOT EXISTS index_podcast_to_episodes_mid ON podcast_to_episodes (mid)", "CREATE INDEX IF NOT EXISTS index_podcast_to_episodes_podcast_owner_id ON podcast_to_episodes (podcast_owner_id)");
    }

    public final void h() {
        sin0 sin0Var = this.b;
        sin0Var.execSQL("CREATE TABLE IF NOT EXISTS auto_download_track (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, \n    uid TEXT NOT NULL,\n    mid TEXT NOT NULL, \n    access_key TEXT, \n    track_code TEXT, \n    downloading_state INTEGER NOT NULL, \n    title TEXT, \n    subtitle TEXT, \n    artist_name_fallback TEXT,\n    main_artists TEXT,\n    featured_artists TEXT,\n    thumb TEXT,\n    storage TEXT,\n    url TEXT, \n    manifest_url TEXT, \n    duration INTEGER, \n    date INTEGER, \n    is_explicit INTEGER NOT NULL, \n    lyrics_id INTEGER, \n    is_focus_track INTEGER, \n    main_color TEXT, \n    content_restriction INTEGER NOT NULL, \n    size_in_bytes INTEGER,\n    auto_download_date INTEGER,\n    auto_download_type INTEGER,\n    json_raw TEXT NOT NULL\n)");
        sin0Var.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS index_auto_download_track_uid_mid ON auto_download_track (uid, mid)");
    }

    public final void i() {
        sin0 sin0Var = this.b;
        sin0Var.execSQL("ALTER TABLE auto_download_track ADD COLUMN initial_auto_download_date INTEGER DEFAULT NULL");
        sin0Var.execSQL("UPDATE auto_download_track SET initial_auto_download_date = auto_download_date WHERE auto_download_date IS NOT NULL");
    }

    public final void j() {
        this.b.execSQL("ALTER TABLE audio_track ADD COLUMN release_audio_id TEXT DEFAULT NULL;");
    }
}
