package defpackage;

import com.yandex.plus.core.analytics.logging.PlusLogTag;
import defpackage.e6d0;

/* loaded from: classes8.dex */
public final class chz implements m6d0 {
    public static void b(StringBuilder sb, f6d0 f6d0Var) {
        sb.append("requestMethod=" + f6d0Var.a);
        sb.append('\n');
        sb.append("requestUrl=".concat(f6d0Var.b));
        sb.append('\n');
        sb.append("requestId=" + ((String) f6d0Var.c.get("X-Request-Id")));
        sb.append('\n');
    }

    @Override // defpackage.m6d0
    public final void a(e6d0 e6d0Var) {
        String str;
        if (e6d0Var instanceof e6d0.b) {
            e6d0.b bVar = (e6d0.b) e6d0Var;
            StringBuilder t = qv10.t("Network request SUCCESS\n");
            b(t, bVar.b);
            t.append("parsedResponse=" + bVar.a);
            skd0.b(PlusLogTag.SDK, t.toString());
            return;
        }
        if (!(e6d0Var instanceof e6d0.a)) {
            w511.b();
            return;
        }
        e6d0.a aVar = (e6d0.a) e6d0Var;
        StringBuilder t2 = qv10.t("Network request ERROR\n");
        b(t2, aVar.getB());
        if (aVar instanceof e6d0.a.AbstractC0093a) {
            e6d0.a.AbstractC0093a abstractC0093a = (e6d0.a.AbstractC0093a) aVar;
            if (abstractC0093a instanceof e6d0.a.AbstractC0093a.C0094a) {
                str = "Backend";
            } else {
                if (!(abstractC0093a instanceof e6d0.a.AbstractC0093a.b)) {
                    w511.b();
                    return;
                }
                str = "HTTP";
            }
            t2.append("errorType=".concat(str));
            t2.append('\n');
            t2.append("code=" + abstractC0093a.getB());
            t2.append('\n');
            t2.append("message=" + abstractC0093a.getC());
            t2.append('\n');
            t2.append("errorBody=" + abstractC0093a.getD());
        } else if (aVar instanceof e6d0.a.b) {
            t2.append("errorType=NETWORK");
            t2.append('\n');
            t2.append("cause=" + ((e6d0.a.b) aVar).getB());
        } else if (aVar instanceof e6d0.a.d) {
            t2.append("errorType=PARSE");
            t2.append('\n');
            t2.append("cause=" + ((e6d0.a.d) aVar).getB());
        } else {
            if (!(aVar instanceof e6d0.a.c)) {
                w511.b();
                return;
            }
            t2.append("errorType=OTHER");
            t2.append('\n');
            t2.append("cause=" + ((e6d0.a.c) aVar).getB());
        }
        skd0.c(PlusLogTag.SDK, t2.toString(), null);
    }
}
