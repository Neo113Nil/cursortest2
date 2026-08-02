package xsna;

import com.vk.core.exceptions.DisposableException;
import xsna.flw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class h66 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h66(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.disposables.b) this.c).dispose();
                break;
            case 1:
                yp80 yp80Var = (yp80) this.c;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            default:
                ((wkw0) this.c).T(new flw0.b(true));
                break;
        }
    }
}
