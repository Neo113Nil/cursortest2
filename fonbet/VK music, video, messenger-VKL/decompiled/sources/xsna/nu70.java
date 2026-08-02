package xsna;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: OfflineMusicDatabaseHelperOld.kt */
/* loaded from: classes3.dex */
public final class nu70 extends SQLiteOpenHelper {
    public static final /* synthetic */ int b = 0;

    /* compiled from: OfflineMusicDatabaseHelperOld.kt */
    public static final class a {
        public static nu70 a() {
            boolean z;
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            try {
                z = context.getDatabasePath("offline_music_keys").exists();
            } catch (SecurityException unused) {
                z = false;
            }
            if (z) {
                return new nu70();
            }
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public nu70() {
        super((r0 == null ? null : r0).getApplicationContext(), "offline_music_keys", (SQLiteDatabase.CursorFactory) null, 12);
        Context context = e43.a;
    }

    public final void m() {
        synchronized (this) {
            try {
                close();
            } catch (Exception e) {
                L.i(e);
            }
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            context.deleteDatabase("offline_music_keys");
        }
    }

    public final LinkedHashMap n() {
        DownloadingState downloadingState;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        readableDatabase.beginTransaction();
        try {
            int i = 0;
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT\n    id, \n    uid, \n    pid, \n    value, \n    download_state\n    FROM playlists ", new String[0]);
            while (rawQuery.moveToNext()) {
                try {
                    int i2 = rawQuery.getInt(4);
                    String string = rawQuery.getString(3);
                    if (string != null) {
                        int i3 = rawQuery.getInt(i);
                        Integer valueOf = Integer.valueOf(i3);
                        int i4 = rawQuery.getInt(1);
                        String string2 = rawQuery.getString(2);
                        Playlist playlist = new Playlist(new JSONObject(string));
                        if (i2 == 0) {
                            downloadingState = DownloadingState.NotLoaded.b;
                        } else if (i2 == 1) {
                            downloadingState = DownloadingState.Downloaded.b;
                        } else if (i2 == 2) {
                            downloadingState = DownloadingState.PendingDownload.b;
                        } else if (i2 == 3) {
                            downloadingState = DownloadingState.PartlyDownloaded.b;
                        } else {
                            if (i2 != 4) {
                                throw new IllegalStateException("Incorrect download state value");
                            }
                            downloadingState = DownloadingState.Corrupted.b;
                        }
                        linkedHashMap.put(valueOf, new vbb0(i3, i4, string2, Playlist.zb(playlist, null, null, null, downloadingState, -1, 254), i2));
                        i = 0;
                    }
                } finally {
                }
            }
            s3q0 s3q0Var = s3q0.a;
            rawQuery.close();
            readableDatabase.setTransactionSuccessful();
            return linkedHashMap;
        } finally {
            readableDatabase.endTransaction();
        }
    }

    public final ArrayList o(Map map, Map map2) {
        String str;
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        readableDatabase.beginTransaction();
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT uid, music_track_id, playlist_id FROM playlists_to_tracks", new String[0]);
            while (rawQuery.moveToNext()) {
                try {
                    int i = rawQuery.getInt(1);
                    int i2 = rawQuery.getInt(2);
                    ud50 ud50Var = (ud50) map.get(Integer.valueOf(i));
                    if (ud50Var != null) {
                        String str2 = ud50Var.c;
                        if (i2 != Integer.MIN_VALUE) {
                            vbb0 vbb0Var = (vbb0) map2.get(Integer.valueOf(i2));
                            str = vbb0Var != null ? vbb0Var.c : null;
                        } else {
                            str = "-2147483648";
                        }
                        if (str != null) {
                            arrayList.add(new vfb0(rawQuery.getInt(0), str2, str));
                        }
                    }
                } finally {
                }
            }
            s3q0 s3q0Var = s3q0.a;
            rawQuery.close();
            readableDatabase.setTransactionSuccessful();
            return arrayList;
        } finally {
            readableDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            cdi.w(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onCreate(sQLiteDatabase);
        L.g("HlsDatabaseHelper", new SQLiteException(efz.a(i, i2, "Trying to downgrade db version from ", " to ")));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i < 10) {
                cdi.w(sQLiteDatabase);
                return;
            }
            if (i < 11) {
                sQLiteDatabase.execSQL("ALTER TABLE music_tracks ADD COLUMN manifest_url text DEFAULT NULL");
            }
            if (i < 12) {
                cdi.F(sQLiteDatabase);
                return;
            }
            throw new IllegalStateException("Unimplemented migration for offline_music_keys from " + i + " to " + i2);
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(th);
            cdi.w(sQLiteDatabase);
        }
    }

    public final LinkedHashMap p() {
        DownloadingState downloadingState;
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT\n    id, \n    uid, \n    mid, \n    value, \n    download_state, \n    manifest_url\n    FROM music_tracks ", new String[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (rawQuery.moveToNext()) {
            try {
                int i = rawQuery.getInt(4);
                String string = rawQuery.getString(3);
                if (string != null) {
                    int i2 = rawQuery.getInt(0);
                    Integer valueOf = Integer.valueOf(i2);
                    Integer valueOf2 = Integer.valueOf(i2);
                    int i3 = rawQuery.getInt(1);
                    String string2 = rawQuery.getString(2);
                    MusicTrack musicTrack = new MusicTrack(new JSONObject(string));
                    if (i == 0) {
                        downloadingState = DownloadingState.NotLoaded.b;
                    } else if (i == 1) {
                        downloadingState = DownloadingState.Downloaded.b;
                    } else if (i == 2) {
                        downloadingState = DownloadingState.PendingDownload.b;
                    } else if (i == 3) {
                        downloadingState = DownloadingState.PartlyDownloaded.b;
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("Incorrect download state value");
                        }
                        downloadingState = DownloadingState.Corrupted.b;
                    }
                    linkedHashMap.put(valueOf, new ud50(valueOf2, i3, string2, MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, downloadingState, false, false, null, null, null, -1, 1048571), i, rawQuery.getString(5)));
                }
            } finally {
            }
        }
        s3q0 s3q0Var = s3q0.a;
        rawQuery.close();
        return linkedHashMap;
    }
}
