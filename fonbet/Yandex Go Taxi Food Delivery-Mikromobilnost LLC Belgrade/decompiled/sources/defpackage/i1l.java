package defpackage;

import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class i1l implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;
    public final exq e;
    public final exq f;

    static {
        ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
        Double valueOf = Double.valueOf(1.0d);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(Boolean.FALSE);
    }

    public i1l(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4, exq exqVar5, exq exqVar6) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
        this.e = exqVar5;
        this.f = exqVar6;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        g1l g1lVar = (g1l) ft6.b.z5.getValue();
        lb7 lb7Var = ft6.a;
        g1lVar.getClass();
        return g1l.d(lb7Var, this);
    }
}
