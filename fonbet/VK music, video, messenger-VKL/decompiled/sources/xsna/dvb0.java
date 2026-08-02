package xsna;

import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* compiled from: PoolConfig.java */
/* loaded from: classes.dex */
public final class dvb0 {
    public final fvb0 a;
    public final u370 b;
    public final fvb0 c;
    public final n370 d;
    public final fvb0 e;
    public final u370 f;
    public final fvb0 g;
    public final u370 h;
    public final String i;
    public final int j;

    /* compiled from: PoolConfig.java */
    public static final class a {
    }

    public dvb0(a aVar) {
        if (lhs.d()) {
            lhs.a("PoolConfig()");
        }
        this.a = vbl.a();
        this.b = u370.c();
        int i = xel.a;
        int i2 = i * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i3 = 131072; i3 <= 4194304; i3 *= 2) {
            sparseIntArray.put(i3, i);
        }
        this.c = new fvb0(4194304, i2, sparseIntArray, xel.a);
        this.d = n370.b();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(8192, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(SQLiteDatabase.OPEN_PRIVATECACHE, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, 2);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i4 = min < 16777216 ? 3145728 : min < 33554432 ? 6291456 : 12582912;
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        this.e = new fvb0(i4, min2 < 16777216 ? min2 / 2 : (min2 / 4) * 3, sparseIntArray2, -1);
        this.f = u370.c();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.g = new fvb0(81920, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, sparseIntArray3, -1);
        this.h = u370.c();
        this.i = "legacy";
        this.j = 4194304;
        if (lhs.d()) {
            lhs.b();
        }
    }
}
