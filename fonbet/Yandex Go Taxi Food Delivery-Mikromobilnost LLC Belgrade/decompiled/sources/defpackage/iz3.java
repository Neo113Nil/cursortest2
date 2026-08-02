package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultFragment;
import com.ybsdk.feature.autotopup.internal.presentation.result.AutoTopupResultParams;

/* loaded from: classes3.dex */
public final class iz3 {
    public static FragmentScreen a(AutoTopupResultParams autoTopupResultParams) {
        return new FragmentScreen("AutoTopupResultScreen", false, autoTopupResultParams, null, qoi0.a(AutoTopupResultFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null);
    }
}
