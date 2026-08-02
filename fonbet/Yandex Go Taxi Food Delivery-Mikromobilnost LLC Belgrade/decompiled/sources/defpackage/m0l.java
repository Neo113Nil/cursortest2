package defpackage;

import com.yandex.div2.DivAnimationDirection;
import com.yandex.div2.DivAnimationInterpolator;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class m0l implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;
    public final exq e;
    public final exq f;
    public final exq g;
    public final exq h;
    public final exq i;
    public final exq j;
    public final exq k;

    static {
        ngd0.m(DivAnimationDirection.NORMAL);
        ngd0.m(DivAnimationInterpolator.LINEAR);
        ngd0.m(1L);
        ngd0.m(0L);
    }

    public m0l(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4, exq exqVar5, exq exqVar6, exq exqVar7, exq exqVar8, exq exqVar9, exq exqVar10, exq exqVar11) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
        this.e = exqVar5;
        this.f = exqVar6;
        this.g = exqVar7;
        this.h = exqVar8;
        this.i = exqVar9;
        this.j = exqVar10;
        this.k = exqVar11;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((k0l) ft6.b.q5.getValue()).b(ft6.a, this);
    }
}
