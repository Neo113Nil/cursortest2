package defpackage;

import android.widget.ImageView;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.communication.CommunicationFullScreenView$State$Type;

/* loaded from: classes3.dex */
public final class f4m0 implements ev31 {
    public final mdm0 a;

    public f4m0(mdm0 mdm0Var) {
        this.a = mdm0Var;
    }

    @Override // defpackage.ev31
    public final Object q(Object obj) {
        YbButtonView.a aVar;
        y3m0 y3m0Var = (y3m0) obj;
        String str = y3m0Var.e;
        Text i = str != null ? g8e.i(Text.Companion, str) : unr0.h(Text.Companion, dzh0.ybsdk_common_close);
        boolean z = y3m0Var.c;
        YbButtonView.a aVar2 = new YbButtonView.a(i, null, null, null, null, null, null, false, z, null, 3070);
        ColorModel.Attr attr = z ? new ColorModel.Attr(ung0.ybColor_textIcon_quaternary) : new ColorModel.Attr(ung0.ybColor_textIcon_primary);
        ColorModel.Attr attr2 = y3m0Var.c ? new ColorModel.Attr(ung0.ybColor_button_disabled) : new ColorModel.Attr(ung0.ybColor_button_secondaryNormal);
        if (jl40.l(y3m0Var.g, Boolean.TRUE)) {
            String str2 = y3m0Var.f;
            aVar = new YbButtonView.a(str2 != null ? g8e.i(Text.Companion, str2) : unr0.h(Text.Companion, dzh0.ybsdk_card_deletion_cancel_button_title), null, null, attr2, attr, null, null, false, false, null, 4070);
        } else {
            aVar = null;
        }
        YbButtonView.a aVar3 = aVar;
        ColorModel.Attr attr3 = new ColorModel.Attr(ung0.ybColor_fill_color7_100);
        CommunicationFullScreenView$State$Type communicationFullScreenView$State$Type = CommunicationFullScreenView$State$Type.DESCRIPTION;
        String str3 = y3m0Var.a;
        Text i2 = str3 != null ? g8e.i(Text.Companion, str3) : unr0.h(Text.Companion, dzh0.ybsdk_savings_savings_account_close_title);
        String str4 = y3m0Var.b;
        Text i3 = str4 != null ? g8e.i(Text.Companion, str4) : unr0.h(Text.Companion, dzh0.ybsdk_savings_savings_account_close_text);
        String str5 = y3m0Var.d;
        rbv c = fob1.c(str5, str5, new i1m0(6));
        if (c == null) {
            ndm0 ndm0Var = (ndm0) this.a;
            ndm0Var.getClass();
            c = fob1.b(ndm0Var.a.l().getSaverClosing());
        }
        return new d4m0(attr3, new vrc(communicationFullScreenView$State$Type, i2, null, null, i3, null, null, null, attr3, c, null, new YbButtonViewGroup.b(null, aVar2, aVar3, null, 9), new urc(kp50.r(28), 0, kp50.r(28), 0), 0, 0, null, null, ImageView.ScaleType.FIT_END, 0, false, null, null, null, null, null, null, -17052436, 3));
    }
}
