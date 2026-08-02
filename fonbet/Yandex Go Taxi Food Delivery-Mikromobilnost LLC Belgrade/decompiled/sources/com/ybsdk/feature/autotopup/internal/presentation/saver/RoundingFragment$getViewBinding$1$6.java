package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.ybsdk.core.analytics.generated.delegates.RoundingEvents$RoundingSettingsButtonClickButton;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import defpackage.bk11;
import defpackage.ezk0;
import defpackage.g8e;
import defpackage.ozk0;
import defpackage.p1b;
import defpackage.sls;
import defpackage.uc5;
import defpackage.us3;
import defpackage.z1x0;
import defpackage.z94;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class RoundingFragment$getViewBinding$1$6 extends FunctionReferenceImpl implements sls {
    public RoundingFragment$getViewBinding$1$6(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onSecondaryClick", "onSecondaryClick()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        us3 us3Var = bVar.J;
        RoundingParams roundingParams = bVar.C;
        us3Var.r(roundingParams, (RoundingState) bVar.X(), RoundingEvents$RoundingSettingsButtonClickButton.DEACTIVATE_BUTTON);
        ezk0 ezk0Var = (ezk0) ((RoundingState) bVar.X()).e.a();
        if (ezk0Var != null) {
            bk11 bk11Var = ezk0Var.h;
            BottomSheetDialogView.State state = new BottomSheetDialogView.State((d) new BottomSheetDialogView.State.a(g8e.i(Text.Companion, bk11Var.a), new Text.Constant(bk11Var.b), null, null, null, null, HProv.PP_SAME_MEDIA), new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.HORIZONTAL, new YbButtonView.a(new Text.Constant(bk11Var.c), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Constant(bk11Var.d), null, null, null, null, null, null, false, false, null, 4094), null, 8), (h) null, false, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (com.ybsdk.widgets.common.bottomsheet.c) null, false, (z1x0) null, (z1x0) null, false, false, 65532);
            z94 z94Var = us3Var.a.e0;
            z94Var.a.a("rounding.settings.sure_deactivate.shown", g8e.w(1, "agreement_id", roundingParams.getAgreementId()));
            bVar.Z(new ozk0(state));
        }
        return zy11.a;
    }
}
