package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.ybsdk.core.analytics.generated.delegates.RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import defpackage.asi0;
import defpackage.bk11;
import defpackage.f42;
import defpackage.g8e;
import defpackage.l0p;
import defpackage.p1b;
import defpackage.qx3;
import defpackage.sls;
import defpackage.uc5;
import defpackage.wx3;
import defpackage.z1x0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AutoTopupRegularFragment$getViewBinding$1$16 extends FunctionReferenceImpl implements sls {
    public AutoTopupRegularFragment$getViewBinding$1$16(uc5 uc5Var) {
        super(0, uc5Var, a.class, "onSecondaryClick", "onSecondaryClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        f42 f42Var = aVar.L;
        RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton = RegularAutotopupEvents$RegularAutotopupSettingsButtonClickButton.DEACTIVATE_BUTTON;
        AutoTopupRegularParams autoTopupRegularParams = aVar.B;
        f42Var.F(regularAutotopupEvents$RegularAutotopupSettingsButtonClickButton, autoTopupRegularParams, (qx3) aVar.X());
        l0p l0pVar = f42Var.b.c0;
        l0pVar.a.a("regular_autotopup.deactivate.open", g8e.w(1, "agreement_id", autoTopupRegularParams.getAgreementId()));
        asi0 asi0Var = (asi0) ((qx3) aVar.X()).e.a();
        if (asi0Var != null) {
            bk11 bk11Var = asi0Var.g;
            aVar.Z(new wx3(new BottomSheetDialogView.State((d) new BottomSheetDialogView.State.a(g8e.i(Text.Companion, bk11Var.a), new Text.Constant(bk11Var.b), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.HORIZONTAL, new YbButtonView.a(new Text.Constant(bk11Var.c), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Constant(bk11Var.d), null, null, null, null, null, null, false, false, null, 4094), null, 8), (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (com.ybsdk.widgets.common.bottomsheet.c) null, false, (z1x0) null, (z1x0) null, false, false, 65532)));
        }
        return zy11.a;
    }
}
