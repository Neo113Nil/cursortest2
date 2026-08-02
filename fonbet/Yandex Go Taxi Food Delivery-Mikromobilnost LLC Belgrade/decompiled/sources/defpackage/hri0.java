package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationFragment;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;

/* loaded from: classes2.dex */
public final class hri0 {
    public static FragmentScreen a(CodeConfirmationParams codeConfirmationParams, OpenScreenRequirement openScreenRequirement) {
        return new FragmentScreen("CodeConfirmationScreen", false, codeConfirmationParams, null, qoi0.a(CodeConfirmationFragment.class), openScreenRequirement, 10, null);
    }
}
