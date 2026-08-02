package defpackage;

import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class ehl implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;
    public final exq e;

    static {
        ngd0.m(Double.valueOf(0.8d));
        ngd0.m(Boolean.FALSE);
        ngd0.m(Boolean.TRUE);
        ngd0.m(1L);
    }

    public ehl(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4, exq exqVar5) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
        this.e = exqVar5;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((bhl) ft6.b.C8.getValue()).b(ft6.a, this);
    }
}
