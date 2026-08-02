package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes6.dex */
public final class jk11 implements z910 {
    public static final jk11 a = new jk11();

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        aa10 w2;
        aa10 w3;
        if (list.isEmpty()) {
            w3 = kVar.w(0, 0, b.f(), new p0u(5));
            return w3;
        }
        if (list.size() != 1) {
            w = kVar.w(0, 0, b.f(), new p0u(5));
            return w;
        }
        o l0 = ((x910) list.get(0)).l0(j);
        w2 = kVar.w(l0.a, l0.b, b.f(), new q83(l0, 18));
        return w2;
    }
}
