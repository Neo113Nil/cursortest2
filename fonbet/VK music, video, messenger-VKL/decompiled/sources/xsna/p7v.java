package xsna;

import com.vk.core.tips.Tooltip;
import com.vk.stat.scheme.CommonOnboardingStat$TypeUiHintItem;
import xsna.l7v;

/* compiled from: HintsManagerImpl.kt */
/* loaded from: classes2.dex */
public final class p7v implements Tooltip.c {
    public final /* synthetic */ l7v.b b;

    public p7v(l7v.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.core.tips.Tooltip.c
    public final void c(int i) {
        l7v.b bVar = this.b;
        ykt0 ykt0Var = bVar.h;
        bpn0 bpn0Var = bVar.b;
        if (ykt0Var != null) {
            ykt0Var.invoke(Integer.valueOf(i));
        }
        if (i == 0 || i == 2) {
            u6v u6vVar = (u6v) bpn0Var.getValue();
            u6vVar.getClass();
            u6vVar.a(CommonOnboardingStat$TypeUiHintItem.Action.HIDE);
        } else {
            u6v u6vVar2 = (u6v) bpn0Var.getValue();
            u6vVar2.getClass();
            u6vVar2.a(CommonOnboardingStat$TypeUiHintItem.Action.CLICK);
        }
    }
}
