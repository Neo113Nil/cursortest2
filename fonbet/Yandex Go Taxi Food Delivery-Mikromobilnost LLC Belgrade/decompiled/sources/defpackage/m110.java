package defpackage;

import com.yandex.go.layers.api.presentation.mapkit.MapKitObjectType;
import com.yandex.go.navigation.screen.c;

/* loaded from: classes5.dex */
public final class m110 implements l110 {
    public final c a;
    public final ml00 b;
    public final ah00 c;
    public final kf00 d;
    public final n110 e;
    public final yit f;

    public m110(c cVar, ml00 ml00Var, ah00 ah00Var, kf00 kf00Var, n110 n110Var, yit yitVar) {
        this.a = cVar;
        this.b = ml00Var;
        this.c = ah00Var;
        this.d = kf00Var;
        this.e = n110Var;
        this.f = yitVar;
    }

    public final void a(sls slsVar) {
        n110 n110Var = this.e;
        sls slsVar2 = n110Var.a;
        yit yitVar = this.f;
        if (slsVar2 != slsVar) {
            if (slsVar2 != null) {
                slsVar2.hashCode();
            }
            yitVar.getClass();
        } else {
            if (slsVar2 != null) {
                slsVar2.hashCode();
            }
            yitVar.getClass();
            this.b.b.remove(MapKitObjectType.MASS_TRANSIT_STOP);
            n110Var.a = null;
        }
    }

    public final void b(sls slsVar) {
        this.e.a = slsVar;
        if (slsVar != null) {
            slsVar.hashCode();
        }
        this.f.getClass();
        this.b.b.put(MapKitObjectType.MASS_TRANSIT_STOP, new qa0(11, new k200(15, this)));
    }
}
