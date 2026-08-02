package xsna;

import android.view.View;
import com.vk.core.view.components.text.VkText;
import xsna.tg0;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class ug0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ug0(View view, Object obj, int i) {
        this.b = i;
        this.c = view;
        this.d = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fxx0 fxx0Var;
        switch (this.b) {
            case 0:
                tg0.a aVar = (tg0.a) this.d;
                if (aVar.n.getLineCount() > 1) {
                    f4m.t(iah0.a(0), aVar.o);
                    aVar.o.setVisibility(8);
                    return;
                } else {
                    f4m.t(iah0.a(2), aVar.o);
                    aVar.o.setVisibility(0);
                    return;
                }
            case 1:
                e290 e290Var = (e290) this.d;
                VkText vkText = e290Var.l;
                if (vkText == null) {
                    vkText = null;
                }
                if (vkText.getLineCount() > 1) {
                    VkText vkText2 = e290Var.m;
                    if (vkText2 == null) {
                        vkText2 = null;
                    }
                    f4m.t(iah0.a(0), vkText2);
                    VkText vkText3 = e290Var.m;
                    (vkText3 != null ? vkText3 : null).setVisibility(8);
                    return;
                }
                VkText vkText4 = e290Var.m;
                if (vkText4 == null) {
                    vkText4 = null;
                }
                f4m.t(iah0.a(2), vkText4);
                VkText vkText5 = e290Var.m;
                (vkText5 != null ? vkText5 : null).setVisibility(0);
                return;
            default:
                ohd0 ohd0Var = ((bqn0) this.d).b.f;
                String str = (String) this.c;
                synchronized (ohd0Var.k) {
                    try {
                        uyx0 c = ohd0Var.c(str);
                        fxx0Var = c != null ? c.a : null;
                    } finally {
                    }
                }
                if (fxx0Var == null || !fxx0Var.c()) {
                    return;
                }
                synchronized (((bqn0) this.d).d) {
                    ((bqn0) this.d).g.put(bdl.c(fxx0Var), fxx0Var);
                    bqn0 bqn0Var = (bqn0) this.d;
                    ((bqn0) this.d).h.put(bdl.c(fxx0Var), wux0.a(bqn0Var.i, fxx0Var, bqn0Var.c.a(), (bqn0) this.d));
                }
                return;
        }
    }

    public ug0(bqn0 bqn0Var, String str) {
        this.b = 2;
        this.d = bqn0Var;
        this.c = str;
    }
}
