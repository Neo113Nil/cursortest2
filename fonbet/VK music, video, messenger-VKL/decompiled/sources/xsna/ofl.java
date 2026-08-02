package xsna;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class ofl implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ofl(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                return ((cy0) this.c).invoke();
            default:
                String str = (String) this.c;
                wy2 wy2Var = vx2.e;
                if (wy2Var == null) {
                    return null;
                }
                wy2Var.p(new tkv(str, true, 6));
                return s3q0.a;
        }
    }
}
