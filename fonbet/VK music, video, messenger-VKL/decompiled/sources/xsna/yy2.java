package xsna;

import android.net.Uri;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.List;
import okhttp3.Interceptor;

/* compiled from: ApiMethodCompositeInterceptor.kt */
/* loaded from: classes.dex */
public final class yy2 implements Interceptor, uz80 {
    public final a[] a;

    /* compiled from: ApiMethodCompositeInterceptor.kt */
    public interface a {
        okhttp3.p a(okhttp3.p pVar, String str);
    }

    public yy2(a... aVarArr) {
        this.a = aVarArr;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "ApiMethodComposite";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        okhttp3.p request = aVar.request();
        for (a aVar2 : this.a) {
            Uri parse = Uri.parse(request.a.i);
            List<String> pathSegments = parse.getPathSegments();
            request = aVar2.a(request, 1 < pathSegments.size() ? pathSegments.get(1) : j5g.g0(parse.getPathSegments(), BundleUtil.UNDERLINE_TAG, null, null, 0, null, 62));
        }
        return aVar.a(request);
    }
}
