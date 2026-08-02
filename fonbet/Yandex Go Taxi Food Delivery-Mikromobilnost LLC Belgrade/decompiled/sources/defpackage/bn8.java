package defpackage;

import com.ybsdk.feature.card.api.CardRenameScreenParams;
import com.ybsdk.feature.card.internal.interactors.k;
import com.ybsdk.feature.card.internal.presentation.cardrename.a;
import com.ybsdk.widgets.common.shimmer.b;

/* loaded from: classes3.dex */
public final class bn8 implements zm8 {
    public final an8 a;

    public bn8(an8 an8Var) {
        this.a = an8Var;
    }

    public final a a(CardRenameScreenParams cardRenameScreenParams) {
        an8 an8Var = this.a;
        return new a(cardRenameScreenParams, (k) ((yc8) an8Var.c).get(), (xm8) ((owf) an8Var.w).get(), (b) ((owf) an8Var.x).get(), (tfl0) ((owf) an8Var.b).get());
    }
}
