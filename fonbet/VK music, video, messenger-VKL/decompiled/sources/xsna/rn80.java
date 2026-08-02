package xsna;

import android.net.Uri;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.ironsource.B5;
import java.util.List;
import java.util.Set;

/* compiled from: OneVideoStoryCacheKeyFactory.kt */
/* loaded from: classes.dex */
public final class rn80 implements xw8 {
    public static final qn80[] c = (qn80[]) qn80.h().toArray(new qn80[0]);
    public final Set<Integer> b = rl3.y0(new Integer[]{6, 8});

    @Override // xsna.xw8
    public final String k(evk evkVar) {
        int i;
        Uri uri = evkVar.a;
        List<String> pathSegments = uri.getPathSegments();
        StringBuilder sb = new StringBuilder();
        String str = (String) j5g.a0(pathSegments);
        if (str != null && drm0.D(str, ".m3u8", false)) {
            sb.append("/mp=m3u8");
        }
        qn80[] qn80VarArr = c;
        int length = qn80VarArr.length;
        boolean z = false;
        while (i < length) {
            qn80 qn80Var = qn80VarArr[i];
            String queryParameter = uri.getQueryParameter(qn80Var.i());
            if (queryParameter == null) {
                String i2 = qn80Var.i();
                int indexOf = pathSegments.indexOf(i2);
                queryParameter = ((epx.f(i2, qn80.MDCT.i()) || epx.f(i2, qn80.VIDEO.i())) && indexOf >= 0 && indexOf < pathSegments.size()) ? (String) j5g.i0(pathSegments) : (indexOf < 0 || indexOf > pathSegments.size() + (-2)) ? null : pathSegments.get(indexOf + 1);
                i = queryParameter == null ? i + 1 : 0;
            }
            if (qn80Var == qn80.CONTENT_TYPE && j5g.P(this.b, arm0.m(10, queryParameter))) {
                z = true;
            }
            sb.append(DomExceptionUtils.SEPARATOR + qn80Var.i() + B5.U + queryParameter);
        }
        if (z) {
            sb.append("/host=" + uri.getHost());
        }
        String sb2 = sb.toString();
        return sb2.length() == 0 ? uri.toString() : sb2;
    }
}
