package xsna;

import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalLoopVh;
import java.util.ArrayList;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class rev implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rev(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((HorizontalLoopVh) this.d).m.snapToTargetExistingView();
                break;
            case 1:
                tzc0 tzc0Var = ((pzc0) this.c).b;
                if (tzc0Var != null) {
                    tzc0Var.d(lzc0.f, (ArrayList) this.d);
                    break;
                }
                break;
            default:
                ((ed01) this.c).g();
                if (!fai.G()) {
                    boolean z = ((oyz0) this.d).c != 0;
                    ((oyz0) this.d).c = 0L;
                    if (z) {
                        ((oyz0) this.d).b();
                        break;
                    }
                } else {
                    ((ed01) this.c).d().s(this);
                    break;
                }
                break;
        }
    }

    public rev(oyz0 oyz0Var, ed01 ed01Var) {
        this.b = 2;
        this.d = oyz0Var;
        this.c = ed01Var;
    }
}
