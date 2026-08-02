package xsna;

import com.vk.api.generated.donut.dto.DonutCheckCensoredValidateResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.eya;
import xsna.p410;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xxa implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ wk50 d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xxa(wk50 wk50Var, Object obj, int i, int i2) {
        this.b = i2;
        this.d = wk50Var;
        this.e = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                yxa yxaVar = (yxa) this.d;
                String str = (String) this.e;
                List<String> d = ((DonutCheckCensoredValidateResponseDto) obj).d();
                if (d == null) {
                    d = EmptyList.b;
                }
                List<String> list = d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (!epx.f((String) it.next(), "0")) {
                            yxaVar.T(eya.f.b);
                            break;
                        }
                    }
                }
                dy2 dy2Var = yxaVar.g;
                UserId e = fkq0.e(yxaVar.f);
                dy2Var.getClass();
                tfx tfxVar = new tfx("donut.addLevel", new hr(13), new defpackage.j0(16));
                tfx.n(tfxVar, "owner_id", e, 0L, 0L, 12);
                tfx.o(tfxVar, "title", str, 0, 512, 4);
                tfx.l(tfxVar, "price", this.c, 0, 0, 8);
                a7f0.a.f(yxaVar, rsg0.W(yfb.x(tfxVar), 7), new tm0(yxaVar, 18), new g60(yxaVar, 20), 1);
                break;
            default:
                a410 a410Var = (a410) this.d;
                Map<Integer, n210> map = ((x410) this.e).k;
                int i = this.c;
                n210 n210Var = map.get(Integer.valueOf(i));
                if (n210Var != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.put(Integer.valueOf(i), n210.a(n210Var, false, true, null, 126975));
                    map = linkedHashMap;
                }
                a410Var.T(new p410.j(map));
                break;
        }
        return s3q0.a;
    }
}
