package xsna;

import android.os.storage.StorageManager;
import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: DiskSpaceAllocator.kt */
/* loaded from: classes8.dex */
public final class rbn {
    public static final long f;
    public final mrk0 a;
    public final StorageManager b;
    public final kq c;
    public final i100 d;
    public long e;

    static {
        zno.a aVar = zno.c;
        f = zno.e(eoo.e(1, DurationUnit.MINUTES));
    }

    public rbn(mrk0 mrk0Var, StorageManager storageManager, kq kqVar, up70 up70Var) {
        this.a = mrk0Var;
        this.b = storageManager;
        this.c = kqVar;
        this.d = up70Var;
    }
}
