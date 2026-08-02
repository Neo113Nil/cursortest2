package xsna;

import com.vk.dto.common.Peer;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.voip.ui.broadcast.fragments.config.BroadcastConfigFragment;
import com.vk.voip.ui.groupcalls.grid.GroupCallGridContainerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i22 implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i22(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                ((h22) this.c).invoke(obj);
                break;
            case 1:
                ((v9) this.c).invoke(obj);
                break;
            case 2:
                ((fo6) this.c).invoke(obj);
                break;
            case 3:
                fo6 fo6Var = (fo6) this.c;
                int i = BroadcastConfigFragment.U;
                fo6Var.invoke(obj);
                break;
            case 4:
                ((v9) this.c).invoke(obj);
                break;
            case 5:
                ((v9) this.c).invoke(obj);
                break;
            case 6:
                ((z5a) this.c).invoke(obj);
                break;
            case 7:
                ((v9) this.c).invoke(obj);
                break;
            case 8:
                ((md) this.c).invoke(obj);
                break;
            case 9:
                ((lp1) this.c).invoke(obj);
                break;
            case 10:
                ((oj) this.c).invoke(obj);
                break;
            case 11:
                ((fo6) this.c).invoke(obj);
                break;
            case 12:
                ((ojg) this.c).invoke(obj);
                break;
            case 13:
                ((ozh) this.c).invoke(obj);
                break;
            case 14:
                ((t9e) this.c).invoke(obj);
                break;
            case 15:
                ((ozh) this.c).invoke(obj);
                break;
            case 16:
                ((qp3) this.c).invoke(obj);
                break;
            case 17:
                ((zem) this.c).invoke(obj);
                break;
            case 18:
                vtm vtmVar = (vtm) this.c;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(com.vk.dto.common.a.b((Peer) it.next()));
                }
                vtmVar.h.getClass();
                qv20 qv20Var = qv20.c;
                a1w a1wVar = q1w.a;
                if (a1wVar == null) {
                    a1wVar = null;
                }
                a1wVar.D(qv20Var, new mwt(arrayList));
                break;
            case 19:
                ((ozh) this.c).invoke(obj);
                break;
            case 20:
                ((fo6) this.c).invoke(obj);
                break;
            case 21:
                ((ozh) this.c).invoke(obj);
                break;
            case 22:
                ((ozh) this.c).invoke(obj);
                break;
            case 23:
                ((ozh) this.c).invoke(obj);
                break;
            case 24:
                ((oj) this.c).invoke(obj);
                break;
            case 25:
                ((ozh) this.c).invoke(obj);
                break;
            case 26:
                ozh ozhVar = (ozh) this.c;
                qcy<Object>[] qcyVarArr = GoodFragment.U0;
                ozhVar.invoke(obj);
                break;
            case 27:
                td5 td5Var = (td5) this.c;
                int i2 = GroupCallGridContainerView.i;
                td5Var.invoke(obj);
                break;
            case 28:
                ((fo6) this.c).invoke(obj);
                break;
            default:
                ((z8f) this.c).invoke(obj);
                break;
        }
    }
}
