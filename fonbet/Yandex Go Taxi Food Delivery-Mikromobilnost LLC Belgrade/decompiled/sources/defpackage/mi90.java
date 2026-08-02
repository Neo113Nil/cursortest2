package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.transfer.utils.TransferScenario;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;

/* loaded from: classes3.dex */
public final class mi90 {
    public static FragmentScreen a(PartnersFragment.Arguments arguments) {
        OpenScreenRequirement openScreenRequirement;
        TransitionPolicyType transitionPolicyType = TransitionPolicyType.DEFAULT;
        boolean z = !arguments.getSkipPartnerCheck();
        TransferScenario transferScenario = arguments.getTransferScenario();
        switch (transferScenario == null ? -1 : li90.a[transferScenario.ordinal()]) {
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
                openScreenRequirement = OpenScreenRequirement.WithBuid.INSTANCE;
                break;
            case 0:
            default:
                w511.b();
                return null;
            case 12:
            case 13:
                openScreenRequirement = OpenScreenRequirement.WithUid.INSTANCE;
                break;
        }
        return new FragmentScreen("PartnersScreen", z, arguments, transitionPolicyType, qoi0.a(PartnersFragment.class), openScreenRequirement);
    }
}
