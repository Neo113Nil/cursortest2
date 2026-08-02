package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.card.internal.interactors.c;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionScreenParams;
import com.ybsdk.feature.card.internal.presentation.carddeletion.a;

/* loaded from: classes3.dex */
public final class dd8 implements bd8 {
    public final bc a;

    public dd8(bc bcVar) {
        this.a = bcVar;
    }

    public final a a(CardDeletionScreenParams cardDeletionScreenParams) {
        bc bcVar = this.a;
        return new a((c) ((yc8) bcVar.a).get(), (qn8) ((owf) bcVar.b).get(), (al8) ((owf) bcVar.c).get(), (AppAnalyticsReporter) ((owf) bcVar.w).get(), (tfl0) ((owf) bcVar.x).get(), cardDeletionScreenParams);
    }
}
