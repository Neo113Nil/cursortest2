package xsna;

import android.view.ViewStub;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: DialogFooterActionsVc.kt */
/* loaded from: classes2.dex */
public final class tdm implements p7f0 {
    public final Object b;
    public final Object c;
    public Object d;

    public tdm(ViewStub viewStub) {
        viewStub.getContext();
        ImFeatures imFeatures = ImFeatures.IM_CHAT_TOOLBAR_REDESIGN;
        imFeatures.getClass();
        viewStub.setLayoutResource(com.vk.toggle.b.A.a(imFeatures) ? R.layout.vkim_dialog_footer_actions_milkshake : R.layout.vkim_dialog_footer_actions_old);
        this.b = viewStub.inflate();
        this.c = new bpn0(new bih(this, 10));
        this.d = new bpn0(new h1j(this, 4));
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        Object obj2 = this.d;
        if (obj2 != null) {
            return obj2;
        }
        Object invoke = ((gzs) this.c).invoke();
        this.d = invoke;
        return invoke;
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        if (epx.f(this.d, obj2)) {
            return;
        }
        this.d = obj2;
        ((izs) this.b).invoke(obj2);
    }

    public tdm(gzs gzsVar, izs izsVar) {
        this.b = izsVar;
        this.c = gzsVar;
    }

    public tdm(List list, List list2, List list3) {
        this.b = list;
        this.c = list2;
        this.d = list3;
    }
}
