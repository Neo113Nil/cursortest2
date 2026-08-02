package xsna;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Trace;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.log.L;
import com.vk.music.offline.api.model.moosic.VkMusicOldAudioBookEntity;
import com.vk.music.offline.api.model.moosic.VkMusicOldAudioBookPersonEntity;
import com.vk.music.offline.api.model.moosic.VkMusicOldPlaylistEntity;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;

/* compiled from: MoosicOldOfflineDatabaseHelper.kt */
/* loaded from: classes3.dex */
public final class q830 extends SQLiteOpenHelper {
    public static final /* synthetic */ int c = 0;
    public final int b;

    /* compiled from: MoosicOldOfflineDatabaseHelper.kt */
    public static final class a {
        public static q830 a(int i, Context context) {
            boolean z;
            try {
                z = context.getDatabasePath(i + ".sqlite").exists();
            } catch (SecurityException unused) {
                z = false;
            }
            if (z) {
                return new q830(i);
            }
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q830(int i) {
        super((r0 == null ? null : r0).getApplicationContext(), l6g.a(i, ".sqlite"), (SQLiteDatabase.CursorFactory) null, 75);
        Context context = e43.a;
        this.b = i;
    }

    public static LinkedHashMap h(q830 q830Var, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = j5g.U0(set, 500, 500, true).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            String g = xqm0.g("\n                    SELECT A._id, A.serverId, A.name, A.tracks, A.updatedAt, \n                    (\n                        SELECT serverId\n                        FROM Photos\n                        WHERE _id = A.cover\n                        LIMIT 1\n                    ) AS coverId,\n                    IFNULL((\n                        SELECT GROUP_CONCAT(child)\n                        FROM (\n                            SELECT child\n                            FROM AlbumsTracksLinks\n                            WHERE parent = A._id\n                            ORDER BY position\n                        )\n                    ), '') AS tracksIds\n                    FROM Albums A\n                    WHERE A._id IN (" + j5g.g0(list, StringUtils.COMMA, null, null, 0, new tr0(28), 30) + ")\n                ");
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                kq.d((Number) it2.next(), arrayList);
            }
            Cursor rawQuery = q830Var.getReadableDatabase().rawQuery(g, (String[]) arrayList.toArray(new String[0]));
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                if (rawQuery.moveToFirst()) {
                    while (!rawQuery.isAfterLast()) {
                        int i = rawQuery.getInt(0);
                        if (rawQuery.getInt(1) != 0) {
                            linkedHashMap.put(Integer.valueOf(i), q830Var.c(rawQuery));
                        }
                        rawQuery.moveToNext();
                    }
                }
                try {
                    rawQuery.close();
                } finally {
                    Trace.endSection();
                }
            } finally {
            }
        }
        return linkedHashMap;
    }

    public static LinkedHashMap m(q830 q830Var, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = j5g.U0(set, 500, 500, true).iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            StringBuilder a2 = t33.a("\n                    SELECT P._id, P.serverId, P.name, P.tracks, P.updatedAt, P.flags,\n                    (\n                        SELECT serverId\n                        FROM Photos\n                        WHERE _id = P.cover\n                        LIMIT 1\n                    ) AS coverId,\n                    IFNULL((\n                        SELECT GROUP_CONCAT(child)\n                        FROM (\n                            SELECT child\n                            FROM PlaylistsTracksLinks\n                            WHERE parent = P._id\n                            ORDER BY position\n                        )\n                    ), '') AS tracksIds\n                    FROM Playlists P\n                    WHERE P._id IN (", j5g.g0(list, StringUtils.COMMA, null, null, 0, new tr0(28), 30), ") \n                    and not (P.flags & ");
            a2.append(1 << VkMusicOldPlaylistEntity.Flags.DEFAULT.ordinal());
            a2.append(")\n                    and not (P.flags & ");
            a2.append(1 << VkMusicOldPlaylistEntity.Flags.DOWNLOADS.ordinal());
            a2.append(")\n                ");
            String g = xqm0.g(a2.toString());
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                kq.d((Number) it2.next(), arrayList);
            }
            Cursor rawQuery = q830Var.getReadableDatabase().rawQuery(g, (String[]) arrayList.toArray(new String[0]));
            Trace.beginSection(ndp0.f("Cursor.forEach"));
            try {
                if (rawQuery.moveToFirst()) {
                    while (!rawQuery.isAfterLast()) {
                        int i = rawQuery.getInt(0);
                        if (rawQuery.getInt(1) != 0) {
                            linkedHashMap.put(Integer.valueOf(i), q830Var.k(rawQuery));
                        }
                        rawQuery.moveToNext();
                    }
                }
                try {
                    rawQuery.close();
                } finally {
                    Trace.endSection();
                }
            } finally {
            }
        }
        return linkedHashMap;
    }

    public static Set o(Map map) {
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            g5g.y(((c6v0) it.next()).m, arrayList);
        }
        return j5g.S0(arrayList);
    }

    public static Set p(Map map) {
        Collection values = map.values();
        ArrayList arrayList = new ArrayList();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            g5g.y(((c6v0) it.next()).l, arrayList);
        }
        return j5g.S0(arrayList);
    }

    public final int b(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM AlbumsTracksLinks ATL\nLEFT JOIN Albums A on ATL.parent = A._id\nLEFT JOIN Tracks T on ATL.child = T._id\nWHERE T.downloadState = 2 and A.serverId = ?", new String[]{str});
            try {
                rawQuery.moveToFirst();
                int i = rawQuery.getInt(0);
                s3q0 s3q0Var = s3q0.a;
                rawQuery.close();
                return i;
            } finally {
            }
        } catch (Exception e) {
            L.i(e);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    public final VkMusicOldPlaylistEntity c(Cursor cursor) {
        ?? r1;
        String str;
        int i = cursor.getInt(0);
        String string = cursor.getString(5);
        String string2 = cursor.getString(6);
        if (string2 == null || string2.length() == 0) {
            r1 = EmptyList.b;
        } else {
            List c0 = drm0.c0(string2, new String[]{StringUtils.COMMA}, 0, 6);
            r1 = new ArrayList(c5g.u(c0, 10));
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                r1.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
        }
        List list = r1;
        int i2 = cursor.getInt(1);
        String string3 = cursor.getString(2);
        int i3 = cursor.getInt(3);
        long j = cursor.getLong(4);
        if (string != null) {
            str = "photos_cache/" + this.b + '/' + string;
        } else {
            str = null;
        }
        return new VkMusicOldPlaylistEntity(i, i2, string3, i3, j, string, str, list, true);
    }

    /* JADX WARN: Finally extract failed */
    public final VkMusicOldAudioBookEntity i(Cursor cursor) {
        String string = cursor.getString(11);
        int i = 0;
        int i2 = cursor.getInt(0);
        int i3 = 1;
        int i4 = cursor.getInt(1);
        int i5 = 2;
        String string2 = cursor.getString(2);
        int i6 = 3;
        String string3 = cursor.getString(3);
        int i7 = cursor.getInt(4);
        int i8 = cursor.getInt(5);
        long j = cursor.getLong(6);
        String string4 = cursor.getString(7);
        int i9 = cursor.getInt(8);
        int i10 = cursor.getInt(9);
        int i11 = cursor.getInt(10);
        Cursor rawQuery = getReadableDatabase().rawQuery("         SELECT\n             T._id,\n             T.serverId,\n\tT.audioBookServerId,\n             T.path,\n             T.encryptionIV,\n             T.encryptionKeyAlias,\n             T.size,\n             T.name,\n             T.artistName,\n             T.duration,\n             T.addedAt,\n             T.flags,\n             T.listenProgress,\n             T.listenState,\n             T.url,\n             (\n                 SELECT serverId\n                 FROM Photos\n                 WHERE _id = T.cover\n                 LIMIT 1\n             ) AS coverId\n         FROM AudioBookChapters T\nLEFT JOIN AudioBooksChaptersLinks L ON L.child = T._id\nWHERE L.parent = ?\n            AND T.downloadState = 2\n         ORDER BY T.addedAt", new String[]{String.valueOf(i2)});
        ArrayList arrayList = new ArrayList();
        while (rawQuery.moveToNext()) {
            try {
                String string5 = rawQuery.getString(15);
                arrayList.add(new com.vk.music.offline.api.model.moosic.a(rawQuery.getInt(i), rawQuery.getString(i3), rawQuery.getString(i5), rawQuery.getString(14), new EncryptedFileInfo(rawQuery.getString(i6), rawQuery.getBlob(4), rawQuery.getString(5)), rawQuery.getLong(6), string5, rawQuery.getString(7), rawQuery.getString(8), rawQuery.getLong(9), rawQuery.getLong(10), rawQuery.getInt(11), rawQuery.getInt(12), rawQuery.getInt(13)));
                i = 0;
                i3 = 1;
                i5 = 2;
                i6 = 3;
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        }
        s3q0 s3q0Var = s3q0.a;
        rawQuery.close();
        rawQuery = getReadableDatabase().rawQuery("         SELECT\nT.serverId,\nT.name,\nT.description,\nL.role,\n             (\n                 SELECT serverId\n                 FROM Photos\n                 WHERE _id = T.cover\n                 LIMIT 1\n             ) AS coverId\n         FROM AudioBookPersons T\nLEFT JOIN AudioBooksPersonsLinks L ON L.child = T._id\nWHERE L.parent = ?", new String[]{String.valueOf(i2)});
        ArrayList arrayList2 = new ArrayList();
        while (rawQuery.moveToNext()) {
            try {
                String string6 = rawQuery.getString(4);
                arrayList2.add(new VkMusicOldAudioBookPersonEntity(Integer.parseInt(rawQuery.getString(0)), rawQuery.getInt(3), rawQuery.getString(1), rawQuery.getString(2), string6));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        }
        s3q0 s3q0Var2 = s3q0.a;
        rawQuery.close();
        rawQuery = getReadableDatabase().rawQuery("         SELECT\nT.serverId,\nT.name\n         FROM AudioBookPublishers T\nLEFT JOIN AudioBooksPublishersLinks L ON L.child = T._id\nWHERE L.parent = ?", new String[]{String.valueOf(i2)});
        ArrayList arrayList3 = new ArrayList();
        while (rawQuery.moveToNext()) {
            try {
                arrayList3.add(new z5v0(Integer.parseInt(rawQuery.getString(0)), rawQuery.getString(1)));
            } catch (Throwable th22) {
                try {
                    throw th22;
                } finally {
                }
            }
        }
        s3q0 s3q0Var3 = s3q0.a;
        rawQuery.close();
        rawQuery = getReadableDatabase().rawQuery("         SELECT\nT.serverId,\nT.name\n         FROM AudioBookGenres T\nLEFT JOIN AudioBooksGenresLinks L ON L.child = T._id\nWHERE L.parent = ?", new String[]{String.valueOf(i2)});
        ArrayList arrayList4 = new ArrayList();
        while (rawQuery.moveToNext()) {
            try {
                arrayList4.add(new y5v0(Integer.parseInt(rawQuery.getString(0)), rawQuery.getString(1)));
                i11 = i11;
            } finally {
            }
        }
        int i12 = i11;
        s3q0 s3q0Var4 = s3q0.a;
        rawQuery.close();
        return new VkMusicOldAudioBookEntity(i2, i4, string2, string3, i7, i8, j, string, string4, Integer.valueOf(i9), i12, arrayList, arrayList2, arrayList3, arrayList4, i10);
    }

    public final int j(String str) {
        try {
            Cursor rawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM PlaylistsTracksLinks PTL\nLEFT JOIN Playlists P on PTL.parent = P._id\nLEFT JOIN Tracks T on PTL.child = T._id\nWHERE T.downloadState = 2 and P.serverId = ?", new String[]{str});
            try {
                rawQuery.moveToFirst();
                int i = rawQuery.getInt(0);
                s3q0 s3q0Var = s3q0.a;
                rawQuery.close();
                return i;
            } finally {
            }
        } catch (Exception e) {
            L.i(e);
            return 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    public final VkMusicOldPlaylistEntity k(Cursor cursor) {
        ?? r1;
        String str;
        String string = cursor.getString(6);
        int i = cursor.getInt(0);
        String string2 = cursor.getString(7);
        if (string2 == null || string2.length() == 0) {
            r1 = EmptyList.b;
        } else {
            List c0 = drm0.c0(string2, new String[]{StringUtils.COMMA}, 0, 6);
            r1 = new ArrayList(c5g.u(c0, 10));
            Iterator it = c0.iterator();
            while (it.hasNext()) {
                r1.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
        }
        List list = r1;
        int i2 = cursor.getInt(1);
        String string3 = cursor.getString(2);
        int i3 = cursor.getInt(3);
        long j = cursor.getLong(4);
        if (string != null) {
            str = "photos_cache/" + this.b + '/' + string;
        } else {
            str = null;
        }
        return new VkMusicOldPlaylistEntity(i, i2, string3, i3, j, string, str, list, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[Catch: all -> 0x006c, LOOP:2: B:22:0x0096->B:24:0x009c, LOOP_END, TryCatch #1 {all -> 0x006c, blocks: (B:3:0x0012, B:5:0x0018, B:8:0x0036, B:11:0x003d, B:12:0x0054, B:14:0x005a, B:18:0x0078, B:21:0x007f, B:22:0x0096, B:24:0x009c, B:27:0x00b4, B:28:0x00b1, B:29:0x0073, B:31:0x00fc), top: B:2:0x0012 }] */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinkedHashMap n() {
        ?? r9;
        List list;
        Iterator it;
        Cursor rawQuery = getReadableDatabase().rawQuery("SELECT\n    T._id,\n    T.moosicId,\n    T.vkId,\n    T.path,\n    T.encryptionIV,\n    T.encryptionKeyAlias,\n    T.size,\n    T.name,\n    T.artistName,\n    T.duration,\n    T.addedAt,\n    T.flags,\n    IFNULL((\n        SELECT GROUP_CONCAT(parent)\n        FROM PlaylistsTracksLinks\n        WHERE child = T._id\n    ), '') AS playlistIds,\n    IFNULL((\n        SELECT GROUP_CONCAT(parent)\n        FROM AlbumsTracksLinks\n        WHERE child = T._id\n    ), '') AS albumIds,\n    (\n        SELECT serverId\n        FROM Photos\n        WHERE _id = T.cover\n        LIMIT 1\n    ) AS coverId\nFROM Tracks T\nWHERE T.downloadState = 2\nORDER BY T.addedAt", new String[0]);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (rawQuery.moveToNext()) {
            try {
                String string = rawQuery.getString(1);
                String string2 = rawQuery.getString(12);
                String string3 = rawQuery.getString(13);
                String string4 = rawQuery.getString(14);
                if (string2 != null && string2.length() != 0) {
                    List c0 = drm0.c0(string2, new String[]{StringUtils.COMMA}, 0, 6);
                    r9 = new ArrayList(c5g.u(c0, 10));
                    Iterator it2 = c0.iterator();
                    while (it2.hasNext()) {
                        r9.add(Integer.valueOf(Integer.parseInt((String) it2.next())));
                    }
                    List list2 = r9;
                    if (string3 != null && string3.length() != 0) {
                        List c02 = drm0.c0(string3, new String[]{StringUtils.COMMA}, 0, 6);
                        list = new ArrayList(c5g.u(c02, 10));
                        it = c02.iterator();
                        while (it.hasNext()) {
                            list.add(Integer.valueOf(Integer.parseInt((String) it.next())));
                        }
                        linkedHashMap.put(string, new c6v0(rawQuery.getInt(0), string, rawQuery.getString(2), new EncryptedFileInfo(rawQuery.getString(3), rawQuery.getBlob(4), rawQuery.getString(5)), rawQuery.getLong(6), string4, rawQuery.getString(7), rawQuery.getString(8), rawQuery.getLong(9), rawQuery.getLong(10), rawQuery.getInt(11), list2, list));
                    }
                    list = EmptyList.b;
                    linkedHashMap.put(string, new c6v0(rawQuery.getInt(0), string, rawQuery.getString(2), new EncryptedFileInfo(rawQuery.getString(3), rawQuery.getBlob(4), rawQuery.getString(5)), rawQuery.getLong(6), string4, rawQuery.getString(7), rawQuery.getString(8), rawQuery.getLong(9), rawQuery.getLong(10), rawQuery.getInt(11), list2, list));
                }
                r9 = EmptyList.b;
                List list22 = r9;
                if (string3 != null) {
                    List c022 = drm0.c0(string3, new String[]{StringUtils.COMMA}, 0, 6);
                    list = new ArrayList(c5g.u(c022, 10));
                    it = c022.iterator();
                    while (it.hasNext()) {
                    }
                    linkedHashMap.put(string, new c6v0(rawQuery.getInt(0), string, rawQuery.getString(2), new EncryptedFileInfo(rawQuery.getString(3), rawQuery.getBlob(4), rawQuery.getString(5)), rawQuery.getLong(6), string4, rawQuery.getString(7), rawQuery.getString(8), rawQuery.getLong(9), rawQuery.getLong(10), rawQuery.getInt(11), list22, list));
                }
                list = EmptyList.b;
                linkedHashMap.put(string, new c6v0(rawQuery.getInt(0), string, rawQuery.getString(2), new EncryptedFileInfo(rawQuery.getString(3), rawQuery.getBlob(4), rawQuery.getString(5)), rawQuery.getLong(6), string4, rawQuery.getString(7), rawQuery.getString(8), rawQuery.getLong(9), rawQuery.getLong(10), rawQuery.getInt(11), list22, list));
            } finally {
            }
        }
        s3q0 s3q0Var = s3q0.a;
        rawQuery.close();
        return linkedHashMap;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
