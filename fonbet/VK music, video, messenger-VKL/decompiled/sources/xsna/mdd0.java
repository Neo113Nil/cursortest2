package xsna;

import com.vk.dto.donut.DonutLevel;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.ndd0;
import xsna.qdd0;
import xsna.xcd0;

/* compiled from: PrivacyEditDonutLevelsFeature.kt */
/* loaded from: classes18.dex */
public final class mdd0 extends wk50<udd0, rdd0, xcd0, ndd0> {
    public final /* synthetic */ wb7 f;
    public final DonutLevel g;
    public final List<DonutLevel> h;

    public mdd0(DonutLevel donutLevel, List<DonutLevel> list) {
        super(xcd0.b.b, new odd0(new rdd0(0)));
        this.f = new wb7();
        this.g = donutLevel;
        this.h = list;
    }

    @Override // xsna.wk50
    public final void N(rdd0 rdd0Var, xcd0 xcd0Var) {
        Object obj;
        rdd0 rdd0Var2 = rdd0Var;
        xcd0 xcd0Var2 = xcd0Var;
        if (!xcd0Var2.equals(xcd0.b.b)) {
            if (xcd0Var2 instanceof xcd0.c) {
                T(new ndd0.b(((xcd0.c) xcd0Var2).b));
                return;
            } else {
                if (!(xcd0Var2 instanceof xcd0.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (!((xcd0.a) xcd0Var2).equals(xcd0.a.C3994a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((f4z) this.f.b).b(new qdd0.a(rdd0Var2.c));
                return;
            }
        }
        List<DonutLevel> list = this.h;
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
        T(new ndd0.a(donutLevel3, list));
    }
}
