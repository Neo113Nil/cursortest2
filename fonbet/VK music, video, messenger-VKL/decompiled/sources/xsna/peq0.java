package xsna;

import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import kotlin.text.Regex;

/* compiled from: UriWrapper.kt */
/* loaded from: classes17.dex */
public final class peq0 {
    public final Uri a;
    public String[] b;
    public Matcher c;
    public final String d;
    public final bpn0 e;
    public boolean f;

    public peq0(Uri uri, String[] strArr) {
        this.a = uri;
        this.b = strArr;
        this.c = null;
        this.d = uri.getQueryParameter("section");
        this.e = new bpn0(new orj0(this, 14));
    }

    public static /* synthetic */ boolean p(peq0 peq0Var, Regex regex, Regex regex2, Regex regex3, int i) {
        if ((i & 2) != 0) {
            regex2 = regex;
        }
        if ((i & 4) != 0) {
            regex3 = null;
        }
        return peq0Var.n(regex, regex2, regex3, (i & 8) != 0 ? 0 : 1);
    }

    public final String a(int i) {
        return this.c.group(i);
    }

    public final int b(int i) {
        String group = this.c.group(i);
        bpn0 bpn0Var = cqm0.a;
        try {
            return Integer.parseInt(group);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final long c(int i) {
        return cqm0.l(this.c.group(i));
    }

    public final String d(int i) {
        if (i < 0 || i > this.c.groupCount()) {
            return null;
        }
        return this.c.group(i);
    }

    public final peq0 e() {
        return (peq0) this.e.getValue();
    }

    public final String[] f() {
        return this.b;
    }

    public final String g() {
        return this.d;
    }

    public final Uri h() {
        return this.a;
    }

    public final boolean i() {
        return this.f;
    }

    public final boolean j(String... strArr) {
        for (String str : strArr) {
            String queryParameter = this.a.getQueryParameter(str);
            if (queryParameter == null || queryParameter.length() == 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean k(String str) {
        return epx.f(this.a.getHost(), str);
    }

    public final String l() {
        String lastPathSegment = this.a.getLastPathSegment();
        return lastPathSegment == null ? "" : lastPathSegment;
    }

    public final boolean m(int i, String str) {
        if (i < 0) {
            return false;
        }
        String[] strArr = this.b;
        if (i < strArr.length) {
            return epx.f(strArr[i], str) || epx.f(this.b[i], str.concat(DomExceptionUtils.SEPARATOR));
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(Regex regex, Regex regex2, Regex regex3, int i) {
        boolean matches;
        boolean z;
        if (i >= 0 && i < this.b.length) {
            Matcher matcher = regex.k().matcher(this.b[i]);
            this.c = matcher;
            if (regex != regex2) {
                matcher.matches();
                matches = regex2.f(this.b[i]);
            } else {
                matches = matcher.matches();
            }
            if (matches) {
                if (!(regex3 != null && regex3.f(this.b[i]))) {
                    z = true;
                    if (!z) {
                        return true;
                    }
                }
            }
            z = false;
            if (!z) {
            }
        }
        return false;
    }

    public final String q(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.b;
        if (strArr.length > i) {
            return strArr[i];
        }
        return null;
    }

    public final String r(String str) {
        return this.a.getQueryParameter(str);
    }

    public final String s(String... strArr) {
        Object obj;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(this.a.getQueryParameter(str));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((String) obj) != null) {
                break;
            }
        }
        return (String) obj;
    }

    public final int t(String str) {
        String queryParameter = this.a.getQueryParameter(str);
        bpn0 bpn0Var = cqm0.a;
        try {
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final long u(String str) {
        return cqm0.l(this.a.getQueryParameter(str));
    }

    public final LinkedHashMap v() {
        return jeq0.a(this.a);
    }

    public final void w(String[] strArr) {
        this.b = strArr;
    }

    public final void x() {
        this.f = true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public peq0(Uri uri) {
        this(uri, new String[]{r0 == null ? "" : r0});
        String path = uri.getPath();
    }
}
