package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.edu.common.api.di.EduCommonComponent;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rhm implements izs {
    public final /* synthetic */ Peer b;
    public final /* synthetic */ m420 c;
    public final /* synthetic */ shm d;
    public final /* synthetic */ ArrayList e;

    public /* synthetic */ rhm(Peer peer, m420 m420Var, shm shmVar, ArrayList arrayList) {
        this.b = peer;
        this.c = m420Var;
        this.d = shmVar;
        this.e = arrayList;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        e7p g2 = ((EduCommonComponent) this.d.p.getValue()).g2();
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((x120) it.next()).a);
        }
        return e7p.b(g2, arrayList2, Source.ACTUAL).l(new pj4(new wje(this.c, 14), 18));
    }
}
