package defpackage;

import kotlin.a;

/* loaded from: classes13.dex */
public final class ff {
    public final i3y a;

    public ff(dne0 dne0Var) {
        this.a = a.a(new ef(dne0Var, 0));
    }

    public static String e(String str) {
        return g8e.o("error_text_", str);
    }

    public static String f(String str) {
        return g8e.o("loading_text_", str);
    }

    public static String g(String str) {
        return g8e.o("order_context_", str);
    }

    public static String h(String str) {
        return g8e.o("payment_url_", str);
    }

    public final void a() {
        String l = d().l("active_order_id", null);
        d().w("active_order_id");
        if (l != null) {
            d().w(h(l));
            d().w(f(l));
            d().w(e(l));
            d().w(g(l));
            c(l);
        }
    }

    public final void b(String str) {
        if (jl40.l(d().l("active_order_id", null), str)) {
            d().w("active_order_id");
            d().w(h(str));
            d().w(f(str));
            d().w(e(str));
            d().w(g(str));
        }
    }

    public final void c(String str) {
        d().w("notification_title_" + str);
        d().w("notification_subtitle_" + str);
        d().w("notification_image_tag_" + str);
        d().w("notification_cancel_button_title_" + str);
        d().w("notification_shimmering_" + str);
        d().w("terminal_notification_pending_" + str);
    }

    public final cne0 d() {
        return (cne0) this.a.getValue();
    }
}
