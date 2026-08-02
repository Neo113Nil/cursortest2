package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeFragment;
import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinScreenParams;

/* loaded from: classes3.dex */
public final class pn8 {
    public final al8 a;

    public pn8(al8 al8Var) {
        this.a = al8Var;
    }

    public static FragmentScreen a(String str) {
        return new FragmentScreen("CardPinCodeScreen", false, new CardPinScreenParams(str), null, qoi0.a(CardPinCodeFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null);
    }
}
