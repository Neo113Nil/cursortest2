package xsna;

import com.vk.dto.donut.DonutLevel;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bdd0;
import xsna.wcd0;
import xsna.zcd0;

/* compiled from: PrivacyEditDonutLevelsBottomSheetFeature.kt */
/* loaded from: classes18.dex */
public final class add0 extends wk50<ldd0, edd0, zcd0, bdd0> {
    public final List<DonutLevel> f;
    public final DonutLevel g;
    public final f4z h;

    public add0(DonutLevel donutLevel, List list) {
        super(zcd0.a.b, new cdd0(new edd0(0)));
        this.f = list;
        this.g = donutLevel;
        this.h = new f4z();
    }

    @Override // xsna.wk50
    public final void N(edd0 edd0Var, zcd0 zcd0Var) {
        Object obj;
        edd0 edd0Var2 = edd0Var;
        zcd0 zcd0Var2 = zcd0Var;
        if (!zcd0Var2.equals(zcd0.a.b)) {
            if (zcd0Var2 instanceof zcd0.b) {
                this.h.b(new wcd0.a(edd0Var2.c));
                return;
            } else {
                if (!(zcd0Var2 instanceof zcd0.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                T(new bdd0.b(((zcd0.c) zcd0Var2).b));
                return;
            }
        }
        List<DonutLevel> list = this.f;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            DonutLevel donutLevel = (DonutLevel) obj;
            DonutLevel donutLevel2 = this.g;
            if (donutLevel2 != null && donutLevel.b == donutLevel2.b) {
                break;
            }
        }
        DonutLevel donutLevel3 = (DonutLevel) obj;
        if (donutLevel3 == null) {
            donutLevel3 = (DonutLevel) j5g.Y(list);
        }
        T(new bdd0.a(donutLevel3, list));
    }
}
