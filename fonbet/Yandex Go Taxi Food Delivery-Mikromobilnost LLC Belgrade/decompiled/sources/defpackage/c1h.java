package defpackage;

import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes13.dex */
public final class c1h {
    public final lb20 a;

    public c1h(lb20 lb20Var) {
        this.a = lb20Var;
    }

    public final void a(boolean z, String str, k791 k791Var) {
        boolean equals = k791Var.equals(v3h.b);
        lb20 lb20Var = this.a;
        if (equals) {
            ((mb20) lb20Var).b(z ? "ExternalNavigation.RemoteNotificationFailure" : "ExternalNavigation.OpenURLFailure", b.i(new Pair("deeplink_url", str), new Pair("error_name", "InvalidURLStringError"), new Pair("error_msg", "")));
        } else if (k791Var instanceof w3h) {
            ((mb20) lb20Var).b(z ? "ExternalNavigation.RemoteNotificationSuccess" : "ExternalNavigation.OpenURLSuccess", g8e.z("deeplink_url", str));
        }
    }
}
