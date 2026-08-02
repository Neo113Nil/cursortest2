package defpackage;

import ru.yandex.taxi.design.utils.DividerType;
import ru.yandex.taxi.logistics.explicit_comment_courier.requirement.common.DeliveryExplicitCommentRequirementBaseView;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class f9i implements h9i {
    public final /* synthetic */ DeliveryExplicitCommentRequirementBaseView a;

    public f9i(DeliveryExplicitCommentRequirementBaseView deliveryExplicitCommentRequirementBaseView) {
        this.a = deliveryExplicitCommentRequirementBaseView;
    }

    @Override // defpackage.h9i
    public final void applyTheme(ThemeType themeType) {
        g9i g9iVar;
        g9iVar = this.a.binding;
        xvy0.b(g9iVar.b, themeType, false, new c90(20));
    }

    @Override // defpackage.h9i
    public final void dg(qzh qzhVar) {
        g9i g9iVar;
        g9i g9iVar2;
        g9i g9iVar3;
        g9i g9iVar4;
        g9i g9iVar5;
        g9i g9iVar6;
        int i = qzhVar.a ? 0 : 8;
        DeliveryExplicitCommentRequirementBaseView deliveryExplicitCommentRequirementBaseView = this.a;
        deliveryExplicitCommentRequirementBaseView.setVisibility(i);
        g9iVar = deliveryExplicitCommentRequirementBaseView.binding;
        g9iVar.c.setTitle(qzhVar.b);
        g9iVar2 = deliveryExplicitCommentRequirementBaseView.binding;
        g9iVar2.c.setSubtitle(qzhVar.c);
        if (qzhVar.d) {
            g9iVar5 = deliveryExplicitCommentRequirementBaseView.binding;
            g9iVar5.b.setBackgroundAttr(xng0.bgMain);
            g9iVar6 = deliveryExplicitCommentRequirementBaseView.binding;
            g9iVar6.b.setTopDivider(DividerType.MARGIN);
            return;
        }
        g9iVar3 = deliveryExplicitCommentRequirementBaseView.binding;
        g9iVar3.b.setBackgroundResource(f1h0.round_section_bg_top);
        g9iVar4 = deliveryExplicitCommentRequirementBaseView.binding;
        g9iVar4.b.setTopDivider(DividerType.NONE);
    }
}
