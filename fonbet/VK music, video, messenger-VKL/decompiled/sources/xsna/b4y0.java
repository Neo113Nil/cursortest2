package xsna;

import android.net.Uri;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.Interceptor;
import okhttp3.p;

/* compiled from: XOwnerInterceptor.kt */
/* loaded from: classes17.dex */
public final class b4y0 implements Interceptor, uz80 {
    public final Set<String> a;
    public final Set<String> b;
    public final izs<String, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public b4y0(Set<String> set, Set<String> set2, izs<? super String, s3q0> izsVar) {
        this.a = set;
        this.b = set2;
        this.c = izsVar;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "XOwner";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.p request = aVar.request();
        Uri parse = Uri.parse(request.a.i);
        List<String> pathSegments = parse.getPathSegments();
        String g0 = 1 < pathSegments.size() ? pathSegments.get(1) : j5g.g0(parse.getPathSegments(), BundleUtil.UNDERLINE_TAG, null, null, 0, null, 62);
        Set<String> set = this.a;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (brm0.B(g0, (String) it.next(), true)) {
                    if (!this.b.contains(g0)) {
                        p.a b = request.b();
                        b.c.b("X-Owner", "shift");
                        request = b.b();
                        this.c.invoke(g0);
                    }
                }
            }
        }
        return aVar.a(request);
    }
}
