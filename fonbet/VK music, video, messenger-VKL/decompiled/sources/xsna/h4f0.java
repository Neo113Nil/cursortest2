package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.im.ui.components.theme_chooser.b;
import xsna.oml0;
import xsna.wll0;
import xsna.xll0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class h4f0 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h4f0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((j4f0) this.c).e((k4f0) obj);
                break;
            case 1:
                ((gqe0) this.c).invoke(obj);
                break;
            case 2:
                ((gqe0) this.c).invoke(obj);
                break;
            case 3:
                ((gqe0) this.c).invoke(obj);
                break;
            case 4:
                fpl0 fpl0Var = (fpl0) this.c;
                Throwable th = (Throwable) obj;
                if (!((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).J())) {
                    fpl0Var.e(oml0.i.a);
                    fpl0Var.c(new xll0.a.t(th));
                    break;
                } else {
                    fpl0Var.e(new oml0.h(wll0.a.a));
                    break;
                }
                break;
            case 5:
                ((gqe0) this.c).invoke(obj);
                break;
            case 6:
                ((mp3) this.c).invoke(obj);
                break;
            case 7:
                ((qvm0) this.c).invoke(obj);
                break;
            case 8:
                ((gqe0) this.c).invoke(obj);
                break;
            case 9:
                ((b.a) this.c).invoke(obj);
                break;
            case 10:
                ((gqe0) this.c).invoke(obj);
                break;
            case 11:
                ((r50) this.c).invoke(obj);
                break;
            case 12:
                ((t810) this.c).invoke(obj);
                break;
            case 13:
                ((gqe0) this.c).invoke(obj);
                break;
            case 14:
                ((gqe0) this.c).invoke(obj);
                break;
            case 15:
                ((gqe0) this.c).invoke(obj);
                break;
            case 16:
                ((gqe0) this.c).invoke(obj);
                break;
            case 17:
                ((meh) this.c).invoke(obj);
                break;
            case 18:
                ((gqe0) this.c).invoke(obj);
                break;
            default:
                ((ixu0) this.c).invoke(obj);
                break;
        }
    }
}
