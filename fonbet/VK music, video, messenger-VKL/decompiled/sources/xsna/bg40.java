package xsna;

import android.database.sqlite.SQLiteDatabase;
import com.ironsource.C4583ua;
import com.vkontakte.android.audio.player.SavedTrack;

/* compiled from: MusicDatabaseHelper.java */
/* loaded from: classes7.dex */
public final class bg40 {
    public static final int a = 2;
    public static final int b = 3;
    public static final int c = 4;
    public static final int d = 5;
    public static final int e = 6;
    public static final int f = 7;
    public static final int g = 8;
    public static final int h = 9;
    public static final int i = 10;
    public static final int j = 11;
    public static final int k = 12;
    public static final int l = 13;
    public static final int m = 14;
    public static final int n = 15;
    public static final int o = 16;
    public static final int p = 17;
    public static final int q = 18;
    public static final int r = 19;
    public static final int s = 20;
    public static final int t = 21;
    public static final int u = 22;
    public static final int v = 23;
    public static final int w = 24;
    public static final int x = 25;
    public static final int y = 26;
    public static final int z = 27;

    /* compiled from: MusicDatabaseHelper.java */
    public static abstract class a<T extends SavedTrack> extends quk<T> {
        @Override // xsna.quk
        public final SQLiteDatabase b() {
            return bwk.b(e43.a).getWritableDatabase();
        }
    }

    public static String[] a() {
        return kuk.a(kuk.d, "artist", "title", "duration", "url", C4583ua.b, "oid", "lyrics_id", "lyrics_text", "restriction", "genre", "is_explicit", "subtitle", "ad_params", "track_code", "date", "album_part_nubmer", "is_focus_track", "shared_videos_allowed", "in_clips_favorite_allowed", "in_clips_favorite", "special_project_id", "dislike_Active", "can_download", "legal_notice_type", "like", "removed_by_dislike");
    }
}
