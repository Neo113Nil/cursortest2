package xsna;

import android.content.DialogInterface;
import com.vk.core.exceptions.DisposableException;
import xsna.h1p0;
import xsna.ytm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class bum implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bum(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((fum) this.c).O(ytm.g.b);
                break;
            case 1:
                yp80 yp80Var = (yp80) this.c;
                if (yp80Var != null) {
                    yp80Var.onError(new DisposableException());
                    break;
                }
                break;
            case 2:
                ((h1p0.b) this.c).m.a();
                break;
            case 3:
                ((DialogInterface) this.c).dismiss();
                break;
            default:
                wwv0 wwv0Var = (wwv0) this.c;
                if (!wwv0Var.i() && !wwv0Var.e && !wwv0Var.g) {
                    wwv0Var.getView().Rl();
                    break;
                }
                break;
        }
    }
}
