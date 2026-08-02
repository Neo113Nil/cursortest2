package com.ybsdk.feature.transfer.version2.internal.screens;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.core.utils.ColorModel;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonStatusBar;
import com.ybsdk.feature.divkit.common.screen.api.DivkitHeader;
import com.ybsdk.feature.divkit.common.screen.api.DivkitScreenConfig;
import com.ybsdk.feature.transfer.version2.api.TransferMainResultScreenParams;
import com.ybsdk.feature.transfer.version2.api.TransferMainScreenArguments;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainScreenParams;
import com.ybsdk.feature.transfer.version2.internal.screens.result.TransferMainResultFragment;
import defpackage.csl;
import defpackage.mob1;
import defpackage.qoi0;
import defpackage.ung0;
import defpackage.w511;
import defpackage.wu01;

/* loaded from: classes3.dex */
public final class a {
    public final csl a;

    public a(csl cslVar) {
        this.a = cslVar;
    }

    public static FragmentScreen b(InternetPaymentFormInputScreenParams internetPaymentFormInputScreenParams) {
        return new FragmentScreen("InternetPaymentFormInputFragment", false, internetPaymentFormInputScreenParams, TransitionPolicyType.POPUP, qoi0.a(InternetPaymentFormInputFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 2, null);
    }

    public static OpenScreenRequirement c(TransferScenario transferScenario) {
        switch (transferScenario == null ? -1 : wu01.a[transferScenario.ordinal()]) {
            case -1:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                return OpenScreenRequirement.WithBuid.INSTANCE;
            case 0:
            default:
                w511.b();
                return null;
            case 13:
                return OpenScreenRequirement.WithUid.INSTANCE;
        }
    }

    public static FragmentScreen d(TransferMainResultScreenParams transferMainResultScreenParams) {
        return new FragmentScreen("TransferMainResultScreen", false, transferMainResultScreenParams, TransitionPolicyType.POPUP, qoi0.a(TransferMainResultFragment.class), c(transferMainResultScreenParams.getScenario()), 2, null);
    }

    public static Screen e() {
        return TransferMainScreenMarker.INSTANCE;
    }

    public static FragmentScreen f(TransferMainScreenArguments transferMainScreenArguments) {
        TransitionPolicyType transitionPolicyType = TransitionPolicyType.DEFAULT;
        return new FragmentScreen("TransferMainScreen", false, new TransferMainScreenParams(transferMainScreenArguments), transitionPolicyType, qoi0.a(TransferMainFragment.class), c(transferMainScreenArguments.getScenario()), 2, null);
    }

    public final FragmentScreen a() {
        boolean z = false;
        return this.a.b("v1/transfers/cross_border/countries_selection", null, "cross_border_countries_selection", new DivkitScreenConfig(z, new DivkitHeader(null, null), new DivkitCommonStatusBar(new ColorModel.Attr(ung0.ybColor_background_primary), mob1.c(false, true)), new DivkitCommonStatusBar(new ColorModel.Attr(ung0.ybColor_background_primary), mob1.c(false, true)), true, true, null, 64, null), null, "");
    }
}
