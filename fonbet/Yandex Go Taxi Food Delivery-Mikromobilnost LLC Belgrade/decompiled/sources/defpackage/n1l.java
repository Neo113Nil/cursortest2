package defpackage;

import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class n1l implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;
    public final exq e;

    static {
        ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
        Double valueOf = Double.valueOf(1.0d);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
    }

    public n1l(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4, exq exqVar5) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
        this.e = exqVar5;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        l1l l1lVar = (l1l) ft6.b.C5.getValue();
        lb7 lb7Var = ft6.a;
        l1lVar.getClass();
        return l1l.d(lb7Var, this);
    }
}
