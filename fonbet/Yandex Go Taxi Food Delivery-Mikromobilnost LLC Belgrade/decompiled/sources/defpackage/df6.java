package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.kyc.internal.screens.photo.model.KycBottomSheetContent$Type;
import com.ybsdk.rconfig.model.ThemedImage;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;

/* loaded from: classes3.dex */
public final class df6 {
    public final opx a;

    public df6(opx opxVar) {
        this.a = opxVar;
    }

    public final enx a(tnx tnxVar) {
        boolean equals = tnxVar.equals(qnx.b);
        opx opxVar = this.a;
        if (equals) {
            YbButtonViewGroup.b bVar = new YbButtonViewGroup.b(null, new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_kyc_camera_error_button), null, null, null, null, null, null, false, false, null, 4094), null, null, 13);
            if8 if8Var = (if8) opxVar;
            ThemedImage guideMainPageLeft = if8Var.a.f().getGuideMainPageLeft();
            rbv h = guideMainPageLeft != null ? if8.h(guideMainPageLeft) : null;
            ThemedImage guideMainPageRight = if8Var.a.f().getGuideMainPageRight();
            rbv h2 = guideMainPageRight != null ? if8.h(guideMainPageRight) : null;
            if (h != null && h2 != null) {
                return new cnx(new b800(new Text.Resource(dzh0.ybsdk_kyc_sheet_main_page_title), new Text.Resource(dzh0.ybsdk_kyc_sheet_main_page_body), new a800(h, new Text.Resource(dzh0.ybsdk_kyc_sheet_main_page_good_way), new nbv(cyg0.ybsdk_ic_positive, null)), new a800(h2, new Text.Resource(dzh0.ybsdk_kyc_sheet_main_page_bad_way), new nbv(cyg0.ybsdk_ic_negative, null))), KycBottomSheetContent$Type.GUIDE, bVar);
            }
        } else if (tnxVar.equals(snx.b)) {
            ThemedImage guideSelfie = ((if8) opxVar).a.f().getGuideSelfie();
            rbv h3 = guideSelfie != null ? if8.h(guideSelfie) : null;
            if (h3 != null) {
                return new dnx(new anq0(h3, scc.g(new zmq0(new nbv(cyg0.ybsdk_ic_happy_face, null), new Text.Resource(dzh0.ybsdk_kyc_sheet_selfie_bullet_face)), new zmq0(new nbv(cyg0.ybsdk_ic_no_star, null), new Text.Resource(dzh0.ybsdk_kyc_sheet_selfie_bullet_head))), new Text.Resource(dzh0.ybsdk_kyc_sheet_selfie_title), new Text.Resource(dzh0.ybsdk_kyc_sheet_selfie_body)), KycBottomSheetContent$Type.GUIDE, new YbButtonViewGroup.b(null, new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_kyc_camera_error_button), null, null, null, null, null, null, false, false, null, 4094), null, null, 13));
            }
        } else if (!tnxVar.equals(rnx.b) && !(tnxVar instanceof pnx)) {
            w511.b();
        }
        return null;
    }
}
