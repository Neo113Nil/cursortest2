package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.loading.a;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.card.api.entities.CardCarouselProductType;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsScreenArguments;
import com.ybsdk.feature.card.internal.presentation.carddetails.InitialPosition;

/* loaded from: classes3.dex */
public abstract class ofb1 {
    public static FragmentScreen a(cf8 cf8Var, String str, boolean z, String str2, String str3, CardCarouselProductType cardCarouselProductType, String str4, int i) {
        boolean z2 = (i & 2) != 0 ? false : z;
        String str5 = (i & 4) != 0 ? null : str2;
        String str6 = (i & 8) != 0 ? null : str3;
        CardCarouselProductType cardCarouselProductType2 = (i & 32) != 0 ? null : cardCarouselProductType;
        String str7 = (i & 128) != 0 ? null : str4;
        ((df8) cf8Var).c.getClass();
        return new FragmentScreen("CardDetails", false, new CardDetailsScreenArguments(str, (str5 == null && str6 == null && cardCarouselProductType2 == null && !z2) ? null : new InitialPosition(str5, str6, z2, cardCarouselProductType2), false, false, str7), null, qoi0.a(CardDetailsFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null);
    }

    public static f530 b(f530 f530Var, boolean z, eur0 eur0Var, int i) {
        f530 a;
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            eur0Var = yx91.a;
        }
        boolean z2 = (i & 8) != 0;
        if (!z) {
            return f530Var;
        }
        a = b.a(f530Var, m.a(), new a(z2, eur0Var, 0));
        return a;
    }
}
