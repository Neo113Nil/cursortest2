package xsna;

import android.net.Uri;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.Interceptor;
import okhttp3.l;
import okhttp3.u;
import okhttp3.v;

/* compiled from: HlsManifestProxyInterceptor.kt */
/* loaded from: classes2.dex */
public final class g9v implements Interceptor, uz80 {
    public final dev0 a;

    public g9v(dev0 dev0Var) {
        this.a = dev0Var;
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "HlsManifest";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        String str;
        Boolean bool;
        okhttp3.u a = aVar.a(aVar.request());
        if (!this.a.enable()) {
            return a;
        }
        okhttp3.v vVar = a.h;
        if (vVar != null) {
            okhttp3.l lVar = aVar.request().a;
            int size = lVar.f.size();
            try {
                str = (String) j5g.i0(drm0.c0((CharSequence) j5g.i0(lVar.f), new String[]{"."}, 0, 6));
            } catch (Exception unused) {
                str = "";
            }
            if (brm0.v(str, "m3u8", false)) {
                l.a f = lVar.f();
                f.g = null;
                ArrayList arrayList = f.f;
                arrayList.remove(size - 1);
                if (arrayList.isEmpty()) {
                    arrayList.add("");
                }
                okhttp3.l b = f.b();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(vVar.byteStream(), emb.b), 8192);
                ArrayList arrayList2 = new ArrayList();
                a0a.a(bufferedReader, new ape0(arrayList2, 17));
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    try {
                        bool = Boolean.valueOf(Uri.parse(str2).isAbsolute());
                    } catch (Throwable unused2) {
                        bool = null;
                    }
                    boolean booleanValue = bool != null ? bool.booleanValue() : true;
                    if (!brm0.B(str2, "#", false) && !booleanValue) {
                        str2 = b + '/' + str2;
                    }
                    arrayList3.add(str2);
                }
                String g0 = j5g.g0(arrayList3, "\n", null, null, 0, null, 62);
                v.b bVar = okhttp3.v.Companion;
                okhttp3.m contentType = vVar.contentType();
                bVar.getClass();
                okhttp3.w a2 = v.b.a(g0, contentType);
                x2r0.c(a);
                u.a w = a.w();
                w.g = a2;
                return w.c();
            }
        }
        return a;
    }
}
