package defpackage;

import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.scooters.data.h;
import ru.yandex.taxi.widget.c;

/* loaded from: classes13.dex */
public final class j0p0 extends ad5 {
    public final d3a A;
    public final ehn0 B;
    public final xdf x;
    public final c y;
    public final h z;

    public j0p0(xdf xdfVar, c cVar, h hVar, d3a d3aVar, ehn0 ehn0Var) {
        super(i0p0.class);
        this.x = xdfVar;
        this.y = cVar;
        this.z = hVar;
        this.A = d3aVar;
        this.B = ehn0Var;
    }

    public static final String Kg(j0p0 j0p0Var, FormattedText formattedText, c6z c6zVar, int i, fef fefVar) {
        String obj = c.f(j0p0Var.y, f9s.a(f9s.c(j0p0Var.x, fefVar, f9s.e(formattedText, c6zVar)), new ii8(i, 19)), false, null, 14).toString();
        if (evu0.J(obj)) {
            return null;
        }
        return obj;
    }
}
