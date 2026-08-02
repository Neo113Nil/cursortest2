package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.auth.main.AuthModel;
import com.vk.auth.main.TermsLink;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: LegalInfoOpenerDelegate.kt */
/* loaded from: classes15.dex */
public class q1z {
    public final Context a;
    public izs<? super String, String> b;
    public izs<? super String, String> c;
    public gzs<? extends List<TermsLink>> d;

    /* compiled from: LegalInfoOpenerDelegate.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, String> {
        @Override // xsna.izs
        public final String invoke(String str) {
            return ((AuthModel) this.receiver).l(str);
        }
    }

    /* compiled from: LegalInfoOpenerDelegate.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<String, String> {
        @Override // xsna.izs
        public final String invoke(String str) {
            return ((AuthModel) this.receiver).c(str);
        }
    }

    public q1z(Context context) {
        this.a = context;
        r55 r55Var = r55.a;
        this.b = new b(1, r55.h(), AuthModel.class, "getTermsLink", "getTermsLink(Ljava/lang/String;)Ljava/lang/String;", 0);
        this.c = new a(1, r55.h(), AuthModel.class, "getPrivacyLink", "getPrivacyLink(Ljava/lang/String;)Ljava/lang/String;", 0);
        this.d = r55.h().k();
    }

    public static Uri g(String str) {
        String a2 = ply.a();
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("lang");
        return (queryParameter == null || queryParameter.length() == 0) ? parse.buildUpon().appendQueryParameter("lang", a2).build() : parse;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final void a(String str) {
        par0 par0Var = par0.a;
        String concat = "[LegalOpenerDelegate] handleUrl: urlName=".concat(str);
        par0Var.getClass();
        par0.a(concat);
        switch (str.hashCode()) {
            case -1977362948:
                if (str.equals("service_policy")) {
                    r55 r55Var = r55.a;
                    b(g(this.c.invoke(r55.h().a().d)));
                    return;
                }
                break;
            case -1722951811:
                if (str.equals("service_terms")) {
                    r55 r55Var2 = r55.a;
                    c(g(this.b.invoke(r55.h().a().d)));
                    return;
                }
                break;
            case -530546090:
                if (str.equals("vkc_terms")) {
                    r55 r55Var3 = r55.a;
                    e(g("https://id." + a0a.d + "/terms"));
                    return;
                }
                break;
            case 627476035:
                if (str.equals("vkc_policy")) {
                    r55 r55Var4 = r55.a;
                    d(g("https://id." + a0a.d + "/privacy"));
                    return;
                }
                break;
        }
        List<TermsLink> invoke = this.d.invoke();
        if (!(invoke instanceof Collection) || !invoke.isEmpty()) {
            Iterator<T> it = invoke.iterator();
            while (it.hasNext()) {
                if (epx.f(((TermsLink) it.next()).d, str)) {
                    f(Uri.parse(str));
                    return;
                }
            }
        }
        par0 par0Var2 = par0.a;
        String concat2 = "can't find handler for link ".concat(str);
        par0Var2.getClass();
        par0.b(concat2);
    }

    public void b(Uri uri) {
        f(uri);
    }

    public void c(Uri uri) {
        f(uri);
    }

    public void d(Uri uri) {
        f(uri);
    }

    public void e(Uri uri) {
        f(uri);
    }

    public final void f(Uri uri) {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(this.a, uri);
    }
}
