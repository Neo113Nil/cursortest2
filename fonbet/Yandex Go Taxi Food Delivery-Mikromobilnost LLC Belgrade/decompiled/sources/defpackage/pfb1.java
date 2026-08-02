package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.loading.a;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.feature.card.internal.network.dto.CardSkinLayerResponse;
import com.ybsdk.feature.card.internal.network.dto.CardSkinResponse;

/* loaded from: classes3.dex */
public abstract class pfb1 {
    public static long a(int i) {
        return i * (-1);
    }

    public static f530 b(f530 f530Var, boolean z, int i) {
        f530 a;
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = (i & 16) != 0;
        if (!z) {
            return f530Var;
        }
        a = b.a(f530Var, m.a(), new a(z2, yx91.a, 1));
        return a;
    }

    public static final jq51 c(CardSkinResponse cardSkinResponse) {
        ThemedImageUrlEntity themedImageUrlEntity = new ThemedImageUrlEntity(cardSkinResponse.getDefault().getImage().getLight(), cardSkinResponse.getDefault().getImage().getDark());
        CardSkinLayerResponse samsung = cardSkinResponse.getSamsung();
        return new jq51(themedImageUrlEntity, samsung != null ? new ThemedImageUrlEntity(samsung.getImage().getLight(), samsung.getImage().getDark()) : null);
    }
}
