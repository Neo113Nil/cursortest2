package defpackage;

import android.view.View;

/* loaded from: classes15.dex */
public final class pu31 {
    public final x22 a;

    public pu31(x22 x22Var) {
        this.a = x22Var;
    }

    public final void a(View view, String str, String str2) {
        view.setTag(e9h0.messaging_analytics_view_name, new m4j0(str, str2));
        if (view.getTag(e9h0.messaging_analytics_view_logger) == null) {
            ou31 ou31Var = new ou31(this);
            view.setTag(e9h0.messaging_analytics_view_logger, "logger");
            ou31Var.a(view);
        }
    }
}
