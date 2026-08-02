package xsna;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import ru.ok.android.sdk.SharedKt;

/* compiled from: DefaultSecureStripper.kt */
/* loaded from: classes.dex */
public final class hml {
    public static final List<String> b;
    public static final hml c;
    public final ArrayList a = new ArrayList();

    /* compiled from: DefaultSecureStripper.kt */
    public static abstract class a {
        public final Regex a;
        public final izs<zk10, CharSequence> b;

        /* compiled from: DefaultSecureStripper.kt */
        /* renamed from: xsna.hml$a$a, reason: collision with other inner class name */
        public static final class C3010a extends a {
            public final Regex c;
            public final izs<zk10, CharSequence> d;

            /* JADX WARN: Multi-variable type inference failed */
            public C3010a(Regex regex, izs<? super zk10, ? extends CharSequence> izsVar) {
                super(regex, izsVar);
                this.c = regex;
                this.d = izsVar;
            }

            @Override // xsna.hml.a
            public final Regex a() {
                return this.c;
            }

            @Override // xsna.hml.a
            public final izs<zk10, CharSequence> b() {
                return this.d;
            }
        }

        /* compiled from: DefaultSecureStripper.kt */
        public static final class b extends a {
            public final Regex c;
            public final String d;

            public b(Regex regex, String str) {
                super(regex, new s56(str, 1));
                this.c = regex;
                this.d = str;
            }

            @Override // xsna.hml.a
            public final Regex a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StringReplacement(regex=");
                sb.append(this.c);
                sb.append(", replacementString=");
                return ho8.a(sb, this.d, ')');
            }
        }

        public a() {
            throw null;
        }

        public a(Regex regex, izs izsVar) {
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
        hml hmlVar = new hml();
        List<String> list = l;
        String a2 = i5s.a(new StringBuilder("("), j5g.g0(list, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62), ")=[a-zA-Z0-9._%-]+");
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        a.C3010a c3010a = new a.C3010a(new Regex(a2, regexOption), new da4(2));
        ArrayList arrayList = hmlVar.a;
        arrayList.add(c3010a);
        arrayList.add(new a.C3010a(new Regex(i5s.a(new StringBuilder("("), j5g.g0(list, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62), "):[a-zA-Z0-9._%-]+"), regexOption), new iej(1)));
        arrayList.add(new a.C3010a(new Regex(i5s.a(new StringBuilder("\"("), j5g.g0(list, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62), ")\":\"[a-zA-Z0-9._%-]+\""), regexOption), new fml(0)));
        arrayList.add(new a.C3010a(new Regex(i5s.a(new StringBuilder("\\{\"key\":\"("), j5g.g0(list, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, 62), ")\",\"value\":\"[a-zA-Z0-9._%-]+\""), regexOption), new gml(0)));
        arrayList.add(new a.b(new Regex("Bearer [a-zA-Z0-9._%-]+"), Matcher.quoteReplacement("Bearer <HIDE> ")));
        c = hmlVar;
    }
}
