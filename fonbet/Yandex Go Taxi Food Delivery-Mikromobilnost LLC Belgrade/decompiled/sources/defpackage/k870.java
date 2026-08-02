package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.support.a;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes5.dex */
public final class k870 {
    public final a a;
    public final ko21 b;
    public final fn21 c;

    public k870(a aVar, ko21 ko21Var, fn21 fn21Var) {
        this.a = aVar;
        this.b = ko21Var;
        this.c = fn21Var;
    }

    public final void a(o2y0 o2y0Var, String str) {
        String str2 = o2y0Var.b().a;
        String Hg = ((h) this.c).Hg();
        String v = Hg == null ? null : cvu0.v(cvu0.v(cvu0.v(str, "{language_code}", this.b.a().a(), false), "{user_id}", Hg, false), "{order_id}", str2, false);
        if (v != null) {
            this.a.a(v);
        }
    }
}
