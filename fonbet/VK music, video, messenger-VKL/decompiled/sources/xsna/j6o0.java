package xsna;

import java.util.List;
import xsna.xhl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class j6o0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j6o0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                k6o0 k6o0Var = (k6o0) this.c;
                k6o0Var.e.b(this.d, (xhl0.a) this.e);
                break;
            default:
                ((com.my.tracker.obfuscated.d) this.c).a((Exception) this.d, (List) this.e);
                break;
        }
    }
}
