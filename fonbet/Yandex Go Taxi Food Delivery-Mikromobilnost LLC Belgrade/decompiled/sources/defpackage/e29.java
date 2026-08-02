package defpackage;

import android.graphics.PointF;
import com.yandex.go.loyalty.api.data.model.common.ColorDto;
import com.yandex.go.loyalty.api.data.model.common.ColorSettings;
import com.yandex.go.loyalty.api.data.model.common.LinearColorSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.plus.repository.c;

/* loaded from: classes9.dex */
public final class e29 implements d29 {
    public final c a;
    public final hld0 b;

    public e29(c cVar, hld0 hld0Var) {
        this.a = cVar;
        this.b = hld0Var;
    }

    public final zl4 a() {
        qxw0 qxw0Var;
        znp0 znp0Var = this.a.a.a;
        if (znp0Var == null) {
            return b();
        }
        yn11 yn11Var = znp0Var.g;
        if (yn11Var == null || (qxw0Var = (qxw0) yn11Var.a(qxw0.class)) == null) {
            return b();
        }
        if (qxw0Var.b() && !qxw0Var.d.isEmpty()) {
            ColorSettings colorSettings = (ColorSettings) qxw0Var.d.get(0);
            LinearColorSettings b = colorSettings.getB();
            if (colorSettings.getA() != ColorSettings.Type.LINEAR || b == null) {
                return b();
            }
            List<ColorDto> a = b.getA();
            ArrayList arrayList = new ArrayList(tcc.n(a, 10));
            for (ColorDto colorDto : a) {
                arrayList.add(Integer.valueOf(lhc.f(q5z.Q(0, colorDto.getA()), Math.abs((int) ((colorDto.getC() / 100.0f) * 255.0f)) & 255)));
            }
            int[] I0 = a.I0(arrayList);
            List a2 = b.getA();
            ArrayList arrayList2 = new ArrayList(tcc.n(a2, 10));
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                arrayList2.add(Float.valueOf(((ColorDto) it.next()).getB()));
            }
            gzt gztVar = new gzt(I0, a.G0(arrayList2), b.getD(), b.d(), b.c());
            String str = (String) qxw0Var.b.get(qxw0Var.c);
            if (str == null) {
                str = "";
            }
            return new zl4(gztVar, str);
        }
        return b();
    }

    public final zl4 b() {
        return new zl4(new gzt(qke.a, qke.b, 90.0f, new PointF(0.0f, 0.0f), new PointF(1.0f, 0.0f)), this.b.a.getString(kyh0.plus_promo_badge_label));
    }
}
