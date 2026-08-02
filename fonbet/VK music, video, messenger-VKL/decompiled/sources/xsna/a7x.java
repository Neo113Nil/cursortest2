package xsna;

import android.os.Trace;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class a7x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a7x(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                c7x c7xVar = (c7x) this.c;
                Throwable th = (Throwable) this.d;
                c7xVar.f(th);
                return c7xVar.e(th);
            default:
                bhl0 bhl0Var = (bhl0) this.c;
                Iterable iterable = (Iterable) this.d;
                Trace.beginSection(ndp0.f("lazy StorageManager.dialogAppearanceStorage"));
                try {
                    return new aam(bhl0Var.B(), iterable);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
