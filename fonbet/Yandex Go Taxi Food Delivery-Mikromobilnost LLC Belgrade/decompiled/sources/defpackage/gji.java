package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.XYPoint;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.utils.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class gji implements muw {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Participant b;
    public final /* synthetic */ f4c0 c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gji(apf apfVar, f4c0 f4c0Var, Participant participant) {
        this.d = apfVar;
        this.c = f4c0Var;
        this.b = participant;
    }

    @Override // defpackage.muw
    public final ro00 a() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                apf apfVar = (apf) obj;
                a aVar = (a) apfVar.c;
                f4c0 f4c0Var = this.c;
                XYPoint d = aVar.d((Point) f4c0Var.h);
                float j = ((gh00) ((ah00) apfVar.w)).j();
                ro00 ro00Var = ro00.d;
                return vuz.u(this.b, f4c0Var, d, j, null, 496);
            default:
                p370 p370Var = (p370) obj;
                ro00 ro00Var2 = ro00.d;
                a aVar2 = (a) p370Var.w;
                f4c0 f4c0Var2 = this.c;
                return vuz.u(this.b, f4c0Var2, aVar2.d((Point) f4c0Var2.h), ((gh00) ((ah00) p370Var.c)).j(), null, 496);
        }
    }

    public /* synthetic */ gji(Participant participant, f4c0 f4c0Var, p370 p370Var) {
        this.b = participant;
        this.c = f4c0Var;
        this.d = p370Var;
    }
}
