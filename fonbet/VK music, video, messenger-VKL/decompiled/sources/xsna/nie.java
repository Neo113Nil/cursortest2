package xsna;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import com.vk.im.ui.components.common.LinkAction;
import com.vk.toggle.features.ImFeatures;
import java.util.List;
import java.util.concurrent.TimeUnit;
import xsna.cwb0;

/* compiled from: ClipsItemFocusListenerAdapter.kt */
/* loaded from: classes17.dex */
public final class nie implements e7e, k6o, vb80 {
    public final Object b;
    public final Object c;

    public /* synthetic */ nie(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.k6o
    public void c(double d, q94 q94Var, wmj wmjVar) {
        if (((d4q) this.b).d(wmjVar)) {
            ((k6o) this.c).c(d, q94Var, wmjVar);
        }
    }

    @Override // xsna.e7e
    public void i(int i, hfz hfzVar, boolean z) {
        ((urf) this.c).n((String) this.b, i, hfzVar, z);
    }

    @Override // xsna.k6o
    public List j(q94 q94Var) {
        return ((k6o) this.c).j(q94Var);
    }

    @Override // xsna.vb80
    public void k(ClickableSpan clickableSpan, View view) {
        d3b d3bVar = (d3b) this.b;
        bzb0 bzb0Var = d3bVar.b;
        com.vk.im.popup.a aVar = d3bVar.c;
        Context context = d3bVar.a;
        if (clickableSpan instanceof j420) {
            d3bVar.d.c(context, ((j420) clickableSpan).e);
            return;
        }
        if (clickableSpan instanceof ifq0) {
            String a = ((ifq0) clickableSpan).a();
            Integer b = ((sf20) this.c).b(view);
            cwb0.i0 i0Var = new cwb0.i0(e43.l(LinkAction.OPEN, LinkAction.COPY));
            t35 t35Var = new t35(d3bVar, context, a, b);
            ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures.getClass();
            if (com.vk.toggle.b.A.a(imFeatures)) {
                aVar.c(gwb0.a(i0Var), t35Var, new j3b(0, d3bVar, d3b.class, "dismissPopup", "dismissPopup()V", 0, 0));
                return;
            }
            bzb0Var.b(i0Var, t35Var, new k3b(0, d3bVar, d3b.class, "dismissPopup", "dismissPopup()V", 0, 0));
            return;
        }
        if (clickableSpan instanceof jcp) {
            String str = ((jcp) clickableSpan).e;
            cwb0.i0 i0Var2 = new cwb0.i0(e43.l(LinkAction.EMAIL, LinkAction.COPY));
            rw rwVar = new rw(d3bVar, context, str, 4);
            ImFeatures imFeatures2 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures2.getClass();
            if (com.vk.toggle.b.A.a(imFeatures2)) {
                aVar.c(gwb0.a(i0Var2), rwVar, new e3b(0, d3bVar, d3b.class, "dismissPopup", "dismissPopup()V", 0));
                return;
            }
            bzb0Var.b(i0Var2, rwVar, new f3b(0, d3bVar, d3b.class, "dismissPopup", "dismissPopup()V", 0));
            return;
        }
        if (!(clickableSpan instanceof jvu)) {
            if (clickableSpan instanceof t3a0) {
                d3bVar.b(((t3a0) clickableSpan).e);
                return;
            } else {
                if (clickableSpan instanceof y7o0) {
                    d3bVar.b(((y7o0) clickableSpan).e);
                    return;
                }
                return;
            }
        }
        String str2 = ((jvu) clickableSpan).e;
        cwb0.i0 i0Var3 = new cwb0.i0(e43.l(LinkAction.OPEN, LinkAction.COPY));
        hs1 hs1Var = new hs1(d3bVar, context, str2);
        ImFeatures imFeatures3 = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures3.getClass();
        if (com.vk.toggle.b.A.a(imFeatures3)) {
            aVar.c(gwb0.a(i0Var3), hs1Var, new g3b(0, d3bVar, d3b.class, "dismissPopup", "dismissPopup()V", 0, 0));
            return;
        }
        bzb0Var.b(i0Var3, hs1Var, new a23(0, d3bVar, d3b.class, "dismissPopup", "dismissPopup()V", 0, 1));
    }

    public nie(zos zosVar) {
        this.b = zosVar;
        this.c = new ayo0(TimeUnit.SECONDS.toMillis(3L));
    }
}
