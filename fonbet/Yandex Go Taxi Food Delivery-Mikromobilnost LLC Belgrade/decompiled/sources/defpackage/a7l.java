package defpackage;

import com.yandex.div2.DivRadialGradientRelativeRadius$Value;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class a7l implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;
    public final exq e;

    static {
        Double valueOf = Double.valueOf(0.5d);
        ngd0.m(valueOf);
        ngd0.m(valueOf);
        ngd0.m(DivRadialGradientRelativeRadius$Value.FARTHEST_CORNER);
    }

    public a7l(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4, exq exqVar5) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
        this.e = exqVar5;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((c6l) ft6.b.C6.getValue()).b(ft6.a, this);
    }
}
