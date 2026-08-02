package defpackage;

import ru.yandex.taxi.common_models.net.map_object.LabelType;
import ru.yandex.taxi.common_models.net.map_object.MapObjectType;

/* loaded from: classes9.dex */
public final class pfq0 implements iaq0, zd80 {
    public final qfq0 a;

    public pfq0(qfq0 qfq0Var) {
        this.a = qfq0Var;
    }

    public final void a(p370 p370Var) {
        fkp fkpVar;
        if (p370Var != null) {
            Float valueOf = Float.valueOf(1.0f);
            Float[] fArr = new Float[2];
            for (int i = 0; i < 2; i++) {
                fArr[i] = Float.valueOf(0.0f);
            }
            fArr[0] = Float.valueOf(0.5f);
            fArr[1] = valueOf;
            zlp zlpVar = new zlp(new zzs(p370Var.v().getLatitude(), p370Var.v().getLongitude(), 0, null, null, 28));
            MapObjectType mapObjectType = MapObjectType.ADVERT;
            bxu0 bxu0Var = new bxu0(new hxu0(p370Var.q(), fArr, 39), 61);
            f0k f0kVar = new f0k(new Float[]{valueOf, Float.valueOf(21.0f)}, 18);
            Float[] fArr2 = {Float.valueOf(10.0f), Float.valueOf(18.0f)};
            fkpVar = new fkp("selected_organizations_pin", new jmp(new hqx(String.valueOf(p370Var.w()), LabelType.DEFAULT, fArr2, Float.valueOf(0.45f / y6i0.e((p370Var.w() != null ? r0.length() : 0) / 18, new d6w(1, 3, 1))), 520), bxu0Var, f0kVar, mapObjectType, 508), zlpVar);
        } else {
            fkpVar = null;
        }
        this.a.a.l(fkpVar);
    }
}
