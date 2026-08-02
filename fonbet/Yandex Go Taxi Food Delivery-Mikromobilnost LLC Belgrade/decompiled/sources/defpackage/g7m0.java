package defpackage;

import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;
import java.util.List;

/* loaded from: classes3.dex */
public final class g7m0 implements ev31 {
    public final mdm0 a;
    public final List b = scc.g(new krc(new nbv(txg0.ybsdk_ic_locked_outline, null), null, unr0.h(Text.Companion, dzh0.ybsdk_savings_lock_money_bullet_1)), new krc(new nbv(txg0.ybsdk_ic_alert_outline_circle, null), null, new Text.Resource(dzh0.ybsdk_savings_lock_money_bullet_2)), new krc(new nbv(txg0.ybsdk_ic_like_outline, null), null, new Text.Resource(dzh0.ybsdk_savings_lock_money_bullet_3)));

    public g7m0(mdm0 mdm0Var) {
        this.a = mdm0Var;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        z6m0 z6m0Var = (z6m0) obj;
        boolean z = z6m0Var.c;
        YbButtonView.a aVar = new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_savings_lock_money_primary_button), null, null, null, null, null, null, false, z6m0Var.c, null, 3070);
        ColorModel.Attr attr = new ColorModel.Attr(ung0.ybColor_fill_default_50);
        CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = CommunicationFullScreenView$State$Type.DESCRIPTION;
        String str = z6m0Var.a;
        Text constant = str != null ? new Text.Constant(str) : new Text.Resource(dzh0.ybsdk_savings_lock_money_title);
        String str2 = z6m0Var.b;
        Text constant2 = str2 != null ? new Text.Constant(str2) : new Text.Resource(dzh0.ybsdk_savings_lock_money_text);
        ndm0 ndm0Var = (ndm0) this.a;
        ndm0Var.getClass();
        return new e7m0(attr, new vrc(communicationFullScreenView$State$Type, constant, null, null, constant2, null, null, null, attr, fob1.b(ndm0Var.a.l().getSpendingLock()), this.b, new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.HORIZONTAL, aVar, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_savings_lock_money_secondary_button), null, null, z ? new ColorModel.Attr(ung0.ybColor_button_disabled) : new ColorModel.Attr(ung0.ybColor_button_secondaryNormal), z ? new ColorModel.Attr(ung0.ybColor_textIcon_quaternary) : new ColorModel.Attr(ung0.ybColor_textIcon_primary), null, null, false, false, null, 4070), null, 8), null, 0, 0, null, null, null, 0, false, null, null, null, null, null, null, -5908, 3));
    }
}
