package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import ru.ok.android.sdk.SharedKt;

/* compiled from: SecureInfoStripper.kt */
/* loaded from: classes.dex */
public final class p2i0 {
    public static final List<String> b;
    public static final p2i0 c;
    public final ArrayList a = new ArrayList();

    /* compiled from: SecureInfoStripper.kt */
    public static final class a {
        public static p2i0 a(Collection collection) {
            p2i0 p2i0Var = new p2i0();
            Collection collection2 = collection;
            String a = zr.a("(", j5g.g0(collection2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62), ")=[a-zA-Z0-9._%-]+");
            RegexOption regexOption = RegexOption.IGNORE_CASE;
            p2i0Var.b(new Regex(a, regexOption), new nrw(1));
            p2i0Var.b(new Regex(zr.a("(", j5g.g0(collection2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62), "):[a-zA-Z0-9._%-]+"), regexOption), new bx90(1));
            p2i0Var.b(new Regex(zr.a("\"(", j5g.g0(collection2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62), ")\":\"[a-zA-Z0-9._%-]+\""), regexOption), new epy(2));
            p2i0Var.b(new Regex(zr.a("\\{\"key\":\"(", j5g.g0(collection2, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62), ")\",\"value\":\"[a-zA-Z0-9._%-]+\""), regexOption), new x33(1));
            return p2i0Var;
        }
    }

    /* compiled from: SecureInfoStripper.kt */
    public static abstract class b {
        public final Regex a;
        public final izs<zk10, CharSequence> b;

        /* compiled from: SecureInfoStripper.kt */
        public static final class a extends b {
            public final Regex c;
            public final izs<zk10, CharSequence> d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Regex regex, izs<? super zk10, ? extends CharSequence> izsVar) {
                super(regex, izsVar);
                this.c = regex;
                this.d = izsVar;
            }

            @Override // xsna.p2i0.b
            public final Regex a() {
                return this.c;
            }

            @Override // xsna.p2i0.b
            public final izs<zk10, CharSequence> b() {
                return this.d;
            }
        }

        /* compiled from: SecureInfoStripper.kt */
        /* renamed from: xsna.p2i0$b$b, reason: collision with other inner class name */
        /* loaded from: classes15.dex */
        public static final class C3486b extends b {
            public final Regex c;
            public final String d;

            public C3486b(Regex regex, String str) {
                super(regex, new s56(str, 1));
                this.c = regex;
                this.d = str;
            }

            @Override // xsna.p2i0.b
            public final Regex a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3486b)) {
                    return false;
                }
                C3486b c3486b = (C3486b) obj;
                return epx.f(this.c, c3486b.c) && epx.f(this.d, c3486b.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "StringReplacement(regex=" + this.c + ", replacementString=" + this.d + ")";
            }
        }

        public b() {
            throw null;
        }

        public b(Regex regex, izs izsVar) {
            this.a = regex;
            this.b = izsVar;
        }

        public Regex a() {
            return this.a;
        }

        public izs<zk10, CharSequence> b() {
            return this.b;
        }
    }

    static {
        List<String> l = e43.l("sign", "key", SharedKt.PARAM_ACCESS_TOKEN, "access_tokens", "wat", "wrt", "webview_access_token", "webview_refresh_token", "exchange_token", "exchange_tokens", "common_token", "message", "httoken");
        b = l;
        c = a.a(l);
    }

    public final String a(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            str = str != null ? bVar.a().h(str, bVar.b()) : null;
        }
        return str == null ? "" : str;
    }

    public final void b(Regex regex, izs izsVar) {
        this.a.add(new b.a(regex, izsVar));
    }
}
