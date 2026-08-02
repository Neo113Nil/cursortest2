package xsna;

import com.vk.antispam.SpammerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.aw2;
import xsna.ew2;
import xsna.sv2;

/* compiled from: AntispamFeature.kt */
/* loaded from: classes14.dex */
public final class zv2 extends wk50<iw2, fw2, sv2, aw2> {
    public final f4z f;

    public zv2(SpammerModel spammerModel) {
        super(new sv2.c(spammerModel), new bw2(spammerModel));
        this.f = new f4z();
    }

    @Override // xsna.wk50
    public final void N(fw2 fw2Var, sv2 sv2Var) {
        fw2 fw2Var2 = fw2Var;
        sv2 sv2Var2 = sv2Var;
        if (sv2Var2 instanceof sv2.c) {
            T(new aw2.b(((sv2.c) sv2Var2).b));
            return;
        }
        if (sv2Var2 instanceof sv2.a) {
            sv2.a aVar = (sv2.a) sv2Var2;
            T(new aw2.a(aVar.b, aVar.c));
            return;
        }
        boolean equals = sv2Var2.equals(sv2.d.b);
        f4z f4zVar = this.f;
        if (!equals) {
            if (!sv2Var2.equals(sv2.b.b)) {
                throw new NoWhenBranchMatchedException();
            }
            f4zVar.b(ew2.a.a);
            return;
        }
        List<lhk0> list = fw2Var2.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((lhk0) obj).b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((lhk0) it.next()).a);
        }
        f4zVar.b(new ew2.b(arrayList2));
    }
}
