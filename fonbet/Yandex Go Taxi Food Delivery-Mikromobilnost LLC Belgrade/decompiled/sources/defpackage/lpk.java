package defpackage;

import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class lpk implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;

    static {
        ngd0.m(Double.valueOf(0.0d));
        ngd0.m(200L);
        ngd0.m(DivAnimationInterpolator.EASE_IN_OUT);
        ngd0.m(0L);
    }

    public lpk(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        jpk jpkVar = (jpk) ft6.b.n3.getValue();
        lb7 lb7Var = ft6.a;
        jpkVar.getClass();
        return jpk.d(lb7Var, this);
    }
}
