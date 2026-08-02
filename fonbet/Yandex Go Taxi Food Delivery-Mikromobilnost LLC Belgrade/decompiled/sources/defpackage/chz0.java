package defpackage;

import com.yandex.go.taxi.order.models.api.net.dto.objects.Tips;
import com.yandex.go.taxi.order.tipssuggest.domain.a;

/* loaded from: classes14.dex */
public final class chz0 extends bd5 {
    public final nfz0 A;
    public final to31 B;
    public final a850 C;
    public jfz0 D;
    public final c1x0 w;
    public final tgz0 x;
    public final rgz0 y;
    public final a z;

    public chz0(c1x0 c1x0Var, tgz0 tgz0Var, rgz0 rgz0Var, a aVar, nfz0 nfz0Var, to31 to31Var, a850 a850Var) {
        super(bhz0.class);
        this.w = c1x0Var;
        this.x = tgz0Var;
        this.y = rgz0Var;
        this.z = aVar;
        this.A = nfz0Var;
        this.B = to31Var;
        this.C = a850Var;
    }

    public final void Hg() {
        String str;
        jfz0 jfz0Var = this.D;
        if (jfz0Var != null && (str = jfz0Var.f) != null) {
            this.z.g(new Tips(String.valueOf(Integer.parseInt(str))));
        }
        ((ra9) this.w.a).r(new qu(9));
    }
}
