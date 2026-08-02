package com.ybsdk.feature.kyc.internal.screens.photov2;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.kyc.internal.screens.photo.model.KycBottomSheetContent$Type;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import defpackage.bnx;
import defpackage.c03;
import defpackage.df6;
import defpackage.dzh0;
import defpackage.g8e;
import defpackage.gox;
import defpackage.iox;
import defpackage.jl40;
import defpackage.sls;
import defpackage.tnx;
import defpackage.uc5;
import defpackage.unr0;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class KycPhotoV2Fragment$getViewBinding$1$2 extends FunctionReferenceImpl implements sls {
    public KycPhotoV2Fragment$getViewBinding$1$2(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onBackPress", "onBackPress()V", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        bnx bnxVar;
        b bVar = (b) this.receiver;
        bVar.H.F.a.a("kyc_online_2.photo.exit.click", g8e.w(1, "page_index", b.m0(((gox) bVar.X()).c)));
        c03 c03Var = ((gox) bVar.X()).e;
        int i = 0;
        if (c03Var != null) {
            Iterator it = c03Var.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (jl40.l((tnx) it.next(), ((gox) bVar.X()).c)) {
                    break;
                }
                i++;
            }
        }
        df6 df6Var = bVar.I;
        if (i == 0) {
            df6Var.getClass();
            bnxVar = new bnx(new Text.Resource(dzh0.ybsdk_kyc_sheet_exit_title), new Text.Resource(dzh0.ybsdk_kyc_sheet_exit_body), KycBottomSheetContent$Type.EXIT_WARNING, new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.VERTICAL_REVERSE, new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_kyc_sheet_exit_button_no), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_kyc_sheet_exit_button_yes), null, null, null, null, null, null, false, false, null, 4094), null, 8));
        } else {
            df6Var.getClass();
            bnxVar = new bnx(new Text.Resource(dzh0.ybsdk_kyc_sheet_no_turning_back_title), new Text.Resource(dzh0.ybsdk_kyc_sheet_no_turning_back_body), KycBottomSheetContent$Type.EXIT_WARNING, new YbButtonViewGroup.b(YbButtonViewGroup.Orientation.VERTICAL_REVERSE, new YbButtonView.a(unr0.h(Text.Companion, dzh0.ybsdk_kyc_sheet_no_turning_back_button_no), null, null, null, null, null, null, false, false, null, 4094), new YbButtonView.a(new Text.Resource(dzh0.ybsdk_kyc_sheet_no_turning_back_button_yes), null, null, null, null, null, null, false, false, null, 4094), null, 8));
        }
        bVar.Z(new iox(bnxVar));
        return zy11.a;
    }
}
