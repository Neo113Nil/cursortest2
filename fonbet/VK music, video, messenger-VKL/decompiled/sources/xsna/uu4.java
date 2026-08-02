package xsna;

import android.view.View;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import xsna.x8a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class uu4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uu4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                vu4 vu4Var = (vu4) this.c;
                View view = vu4Var.g;
                if (view != null) {
                    view.setKeepScreenOn(false);
                }
                vu4Var.E.b("releaseRecorder");
                io.reactivex.rxjava3.disposables.b bVar = vu4Var.C;
                if (bVar != null) {
                    bVar.dispose();
                }
                vu4Var.C = null;
                vu4Var.B = "";
                vu4Var.A = 0L;
                break;
            case 1:
                ((z99) this.c).e();
                break;
            case 2:
                xyb xybVar = (xyb) this.c;
                xybVar.w = null;
                azb azbVar = xybVar.A;
                if (azbVar != null) {
                    azbVar.b();
                    break;
                }
                break;
            case 3:
                ((akl) this.c).m = false;
                break;
            case 4:
                ((asm) this.c).c();
                break;
            case 5:
                ((MsgViewHeaderComponent) this.c).k.a();
                break;
            default:
                ((o8a0) this.c).i.b(x8a0.a.a);
                break;
        }
    }
}
