package defpackage;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.screens.notice.data.a;
import com.ybsdk.screens.notice.domain.entities.TopupValueEntity;
import com.ybsdk.screens.notice.presentation.c;

/* loaded from: classes3.dex */
public final class ayz0 implements zxz0 {
    public final ho9 a;

    public ayz0(ho9 ho9Var) {
        this.a = ho9Var;
    }

    public final c a(TopupValueEntity topupValueEntity, String str) {
        ho9 ho9Var = this.a;
        return new c(str, topupValueEntity, (AppAnalyticsReporter) ho9Var.a.get(), (j3h) ho9Var.b.get(), (tfl0) ho9Var.c.get(), (a) ho9Var.d.get());
    }
}
