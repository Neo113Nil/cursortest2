package xsna;

import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* compiled from: GiftsCatalogDelegate.kt */
/* loaded from: classes6.dex */
public final class nzt {
    public final boolean a;
    public final jrh b;
    public boolean c;
    public String d;
    public final bpn0 e = new bpn0(new c5f(this, 21));

    /* compiled from: GiftsCatalogDelegate.kt */
    public static final class a {

        /* compiled from: GiftsCatalogDelegate.kt */
        /* renamed from: xsna.nzt$a$a, reason: collision with other inner class name */
        public static final class C3428a {
            public final String a;

            public C3428a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3428a) && epx.f(this.a, ((C3428a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CatalogStaticUrl(viewUrl="), this.a, ')');
            }
        }

        public static String a(C3428a c3428a, List list, String str, String str2, List list2, boolean z) {
            Uri.Builder builder = new Uri.Builder();
            boolean z2 = !z;
            if (z2) {
                ieq0.a(builder);
            }
            if (str != null) {
                builder.appendQueryParameter("ref", str);
            }
            if (!list2.isEmpty()) {
                builder.appendQueryParameter("gift_ids", j5g.g0(list2, StringUtils.COMMA, null, null, 0, null, 62));
            }
            if (!list.isEmpty()) {
                builder.appendQueryParameter("recipient_ids", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
            }
            if (str2 != null) {
                builder.appendQueryParameter("text", str2);
            }
            if (z2) {
                builder.appendQueryParameter("from_entrypoint", "1");
            }
            boolean M = dhr0.M();
            builder.appendQueryParameter("lang", ply.a());
            builder.appendQueryParameter("scheme", !M ? "bright_light" : "space_gray");
            builder.appendQueryParameter("appearance", !M ? "light" : "dark");
            String uri = builder.build().toString();
            StringBuilder sb = new StringBuilder(c3428a.a);
            if (z2) {
                sb.append("#");
            }
            sb.append(uri);
            return sb.toString();
        }
    }

    public nzt(boolean z, jrh jrhVar) {
        this.a = z;
        this.b = jrhVar;
    }
}
