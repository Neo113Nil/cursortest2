package defpackage;

import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class q0h {
    public final o3h a;
    public final qqc b;

    public q0h(o3h o3hVar, qqc qqcVar) {
        this.a = o3hVar;
        this.b = qqcVar;
    }

    public final r100 a(Uri uri) {
        if (!c(uri)) {
            return null;
        }
        String authority = uri.getAuthority();
        if (d((authority == null || evu0.J(authority)) ? "" : authority.toLowerCase(Locale.ROOT)) == null) {
            return null;
        }
        return new r100();
    }

    public final Uri b(Uri uri) {
        Uri.Builder builder = new Uri.Builder();
        ((pux0) this.a).getClass();
        Uri.Builder scheme = builder.scheme(pux0.c);
        List<String> pathSegments = uri.getPathSegments();
        if (!pathSegments.isEmpty()) {
            scheme.authority((String) a.P(pathSegments));
            Iterator it = a.J(pathSegments, 1).iterator();
            while (it.hasNext()) {
                scheme.appendPath((String) it.next());
            }
        }
        return scheme.encodedQuery(uri.getEncodedQuery()).encodedFragment(uri.getEncodedFragment()).build();
    }

    public final boolean c(Uri uri) {
        ((pux0) this.a).getClass();
        List list = pux0.b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cvu0.t((String) it.next(), uri.getScheme(), true)) {
                return true;
            }
        }
        return false;
    }

    public final h0h d(String str) {
        Object obj;
        Iterator it = this.b.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((h0h) obj).c(str)) {
                break;
            }
        }
        return (h0h) obj;
    }
}
