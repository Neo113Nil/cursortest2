package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.VerticalType;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class fy1 {
    public final ck31 a;

    public fy1(ck31 ck31Var) {
        this.a = ck31Var;
    }

    public final jsa1 a(String str) {
        Object obj;
        Iterator it = ((k) this.a).j().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((za31) obj).d, str)) {
                break;
            }
        }
        za31 za31Var = (za31) obj;
        if (za31Var != null) {
            oa31 oa31Var = za31Var.a;
            VerticalType verticalType = oa31Var.c;
            if (oa31Var.e()) {
                return new ey1(null, str);
            }
            if (verticalType == VerticalType.NAVIGATOR) {
                return new dy1(str);
            }
            if (oa31Var.b()) {
                return new by1(str);
            }
            if (verticalType == VerticalType.MIXED) {
                return new cy1(str, null, null);
            }
        }
        return null;
    }
}
