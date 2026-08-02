package xsna;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import xsna.gy8;

/* compiled from: SimpleCacheHolder.kt */
/* loaded from: classes8.dex */
public final class opj0 {
    public static final ConcurrentHashMap<File, androidx.media3.datasource.cache.c> a = new ConcurrentHashMap<>();

    public static androidx.media3.datasource.cache.c a(File file, dzy dzyVar, hdl hdlVar) throws Cache.CacheException {
        ConcurrentHashMap<File, androidx.media3.datasource.cache.c> concurrentHashMap = a;
        androidx.media3.datasource.cache.c cVar = concurrentHashMap.get(file);
        if (cVar != null) {
            cVar.j();
            return cVar;
        }
        androidx.media3.datasource.cache.c cVar2 = new androidx.media3.datasource.cache.c(file, dzyVar, hdlVar, false);
        try {
            cVar2.j();
            concurrentHashMap.put(file, cVar2);
            return cVar2;
        } catch (Cache.CacheException e) {
            cVar2.o();
            throw e;
        }
    }

    public static void b(File file, hdl hdlVar) {
        String hexString;
        androidx.media3.datasource.cache.c remove = a.remove(file);
        if (remove != null) {
            remove.o();
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    file.delete();
                    return;
                }
                long n = androidx.media3.datasource.cache.c.n(listFiles);
                if (n != -1) {
                    try {
                        hexString = Long.toHexString(n);
                    } catch (DatabaseIOException unused) {
                        ahn.F("Failed to delete file metadata: " + n);
                    }
                    try {
                        String str = "ExoPlayerCacheFileMetadata" + hexString;
                        SQLiteDatabase writableDatabase = hdlVar.b.getWritableDatabase();
                        writableDatabase.beginTransactionNonExclusive();
                        try {
                            bor0.b(writableDatabase, 2, hexString);
                            writableDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.endTransaction();
                            try {
                                gy8.a.i(hdlVar, Long.toHexString(n));
                            } catch (DatabaseIOException unused2) {
                                ahn.F("Failed to delete file metadata: " + n);
                            }
                        } catch (Throwable th) {
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    } catch (SQLException e) {
                        throw new DatabaseIOException(e);
                    }
                }
                y2r0.Z(file);
            }
        }
    }
}
