package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes5.dex */
public final class kv60 implements z910 {
    public static final jzz b = new jzz();
    public final float a;

    public kv60(float f) {
        this.a = f;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        final o l0 = ((x910) list.get(1)).l0(j);
        final int min = (int) ((Math.min(l0.a, l0.b) / this.a) * uvb0.a);
        final o l02 = ((x910) list.get(0)).l0(p8e.b(0, l0.a + min, 0, l0.b + min, 5));
        final o l03 = ((x910) list.get(2)).l0(j);
        final int i = l03.b / 2;
        final int i2 = l03.a / 2;
        return kVar.w(l02.a, l02.b, b.f(), new tls() { // from class: jv60
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a aVar = (o.a) obj;
                o oVar = o.this;
                int i3 = (-oVar.b) / 2;
                int i4 = i;
                aVar.g(oVar, 0, i3 - i4, 0.0f);
                aVar.g(l0, min / 2, ((-oVar.b) / 2) - i4, 0.0f);
                aVar.g(l03, (oVar.a / 2) - i2, (oVar.b / 2) - i4, 0.0f);
                return zy11.a;
            }
        });
    }
}
