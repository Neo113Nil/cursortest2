package xsna;

import android.net.Uri;
import com.huawei.hms.framework.common.BundleUtil;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import xsna.zjv;

/* compiled from: XOwnerInterceptor.kt */
/* loaded from: classes.dex */
public final class a4y0 implements ojv, uz80 {
    public static final List<String> d = Collections.singletonList("shift");
    public final Set<String> a;
    public final Set<String> b;
    public final izs<String, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public a4y0(Set<String> set, Set<String> set2, izs<? super String, s3q0> izsVar) {
        this.a = set;
        this.b = set2;
        this.c = izsVar;
    }

    @Override // xsna.ojv
    public final mkv a(zjv.a aVar) {
        ckv b = aVar.b();
        if (zjy.b(b)) {
            Uri c = b.i().c();
            List<String> pathSegments = c.getPathSegments();
            String g0 = 1 < pathSegments.size() ? pathSegments.get(1) : j5g.g0(c.getPathSegments(), BundleUtil.UNDERLINE_TAG, null, null, 0, null, 62);
            Set<String> set = this.a;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (brm0.B(g0, (String) it.next(), true)) {
                        if (!this.b.contains(g0)) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(b.e());
                            linkedHashMap.put("X-Owner", d);
                            s3q0 s3q0Var = s3q0.a;
                            b = ckv.a(b, null, linkedHashMap, null, null, 27);
                            this.c.invoke(g0);
                        }
                    }
                }
            }
        }
        return aVar.c(b);
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "XOwner";
    }
}
