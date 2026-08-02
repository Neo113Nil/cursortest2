package defpackage;

import com.ybsdk.feature.status.screen.api.StatusScreenParams;
import com.ybsdk.feature.status.screen.internal.data.c;
import com.ybsdk.feature.status.screen.internal.ui.b;

/* loaded from: classes3.dex */
public final class j9u0 implements i9u0 {
    public final fcj0 a;

    public j9u0(fcj0 fcj0Var) {
        this.a = fcj0Var;
    }

    public final b a(StatusScreenParams statusScreenParams) {
        fcj0 fcj0Var = this.a;
        return new b(statusScreenParams, (c) ((gaq0) fcj0Var.a).get(), (j3h) ((o9g) fcj0Var.b).get(), (com.ybsdk.widgets.common.shimmer.b) ((o9g) fcj0Var.c).get(), (k9u0) ((o9g) fcj0Var.d).get(), (tfl0) ((o9g) fcj0Var.e).get());
    }
}
