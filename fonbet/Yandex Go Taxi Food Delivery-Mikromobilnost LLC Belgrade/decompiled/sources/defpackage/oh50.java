package defpackage;

import com.yandex.go.address.models.Address;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.experiments.k;

/* loaded from: classes5.dex */
public final class oh50 {
    public final r0 a;
    public final gci0 b;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (defpackage.evu0.y(r5, r0 == null ? ((defpackage.avj0) r6.b).h(defpackage.pzh0.delivery_ndd_pickup_point_uri_substring) : r0, false) != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public oh50(ji50 ji50Var, qh50 qh50Var) {
        boolean a = ji50Var.a();
        Object obj = mh50.c;
        if (a && (ji50Var instanceof hi50)) {
            Address address = ((hi50) ji50Var).e;
            String uri = address != null ? address.getUri() : null;
            k kVar = qh50Var.a;
            if (uri != null) {
                String str = kVar.b().t.d;
                String str2 = evu0.J(str) ? null : str;
            } else {
                int i = ph50.a[kVar.b().t.c.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        w511.b();
                        throw null;
                    }
                }
                obj = lh50.c;
            }
        }
        r0 c = bvf0.c(obj);
        this.a = c;
        this.b = e.d(c);
    }

    public final nh50 a() {
        return (nh50) this.a.getValue();
    }
}
