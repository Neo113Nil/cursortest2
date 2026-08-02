package xsna;

import com.vk.core.exceptions.DisposableException;
import xsna.uxd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q46 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q46(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((r46) this.c).k(uxd0.c.a);
                break;
            case 1:
                afm afmVar = (afm) this.c;
                afmVar.w = null;
                dfm dfmVar = afmVar.z;
                if (dfmVar != null) {
                    dfmVar.c();
                    break;
                }
                break;
            case 2:
                ((e4n) this.c).m = null;
                break;
            case 3:
                l7w l7wVar = (l7w) this.c;
                if (l7wVar.e.decrementAndGet() == 0) {
                    l7wVar.d.e();
                    break;
                }
                break;
            default:
                yp80 yp80Var = (yp80) this.c;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
        }
    }
}
