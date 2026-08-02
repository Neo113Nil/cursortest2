package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.feature.card.internal.interactors.g;
import com.ybsdk.feature.card.internal.presentation.cardlimit.a;

/* loaded from: classes3.dex */
public final class ni8 implements mi8 {
    public final bc a;

    public ni8(bc bcVar) {
        this.a = bcVar;
    }

    public final a a(String str) {
        bc bcVar = this.a;
        return new a((tfl0) ((owf) bcVar.a).get(), (qn8) ((owf) bcVar.b).get(), (g) ((dx7) bcVar.c).get(), str, (AppAnalyticsReporter) ((owf) bcVar.w).get(), (oi8) ((pi8) bcVar.x).get());
    }
}
