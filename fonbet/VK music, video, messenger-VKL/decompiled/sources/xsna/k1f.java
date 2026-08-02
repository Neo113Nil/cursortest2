package xsna;

import android.view.View;
import com.vk.superapp.api.dto.auth.UserItem;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.bqr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class k1f implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k1f(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.b) {
            case 0:
                l1f l1fVar = (l1f) this.c;
                l1fVar.l.a((j1f) this.d);
                break;
            case 1:
                o2q o2qVar = (o2q) this.c;
                o2qVar.m.b((UserItem) this.d);
                break;
            case 2:
                nrd0 nrd0Var = (nrd0) this.c;
                ird0 ird0Var = (ird0) this.d;
                ArrayList arrayList = ird0Var.c;
                krd0 krd0Var = ird0Var.d;
                ya yaVar = new ya(28, nrd0Var, ird0Var);
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        String str = ird0Var.a;
                        emd0 emd0Var = new emd0(nrd0Var.itemView.getContext(), new dmd0());
                        emd0Var.T0();
                        emd0Var.c(new d5j(emd0Var.S0()));
                        emd0Var.w0(str);
                        emd0Var.U0(new jai(-1611457290, new p00(arrayList2, 8), true));
                        nrd0Var.q = emd0Var.I0(null);
                        break;
                    } else {
                        krd0 krd0Var2 = (krd0) it.next();
                        String str2 = krd0Var2.c;
                        if (krd0Var2.a != krd0Var.a) {
                            z = false;
                        }
                        arrayList2.add(new cmd0(str2, z, krd0Var2.f, new cy0(22, yaVar, krd0Var2)));
                    }
                }
            default:
                ((izs) this.c).invoke(Integer.valueOf(((bqr0.b) this.d).getAbsoluteAdapterPosition()));
                break;
        }
    }
}
