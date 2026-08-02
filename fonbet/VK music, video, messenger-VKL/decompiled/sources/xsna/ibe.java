package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clips_grid_block.domain.RetryLimitExceededException;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.jbe;
import xsna.wih0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ibe implements izs {
    public final /* synthetic */ jbe b;
    public final /* synthetic */ jbe.a c;
    public final /* synthetic */ int d;

    public /* synthetic */ ibe(jbe jbeVar, jbe.a aVar, int i) {
        this.b = jbeVar;
        this.c = aVar;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        jbe jbeVar = this.b;
        io.reactivex.rxjava3.subjects.d<jbe.a> dVar = jbeVar.b;
        qih0 qih0Var = (qih0) obj;
        List<wih0> list = qih0Var.a;
        PaginationKey paginationKey = qih0Var.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof wih0.a) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((wih0.a) it.next()).a);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof SdkClipVideoFile) {
                arrayList3.add(next);
            }
        }
        boolean f = epx.f(paginationKey, PaginationKey.LoadedFull.b);
        String zb = paginationKey.zb();
        ArrayList u0 = j5g.u0(arrayList3, this.c.a);
        if (u0.size() >= 4) {
            List H0 = j5g.H0(u0, 4);
            dVar.onNext(new jbe.a(j5g.S(u0, 4), zb, f));
            return io.reactivex.rxjava3.core.x.k(H0);
        }
        int i = this.d;
        if (i >= 3) {
            return io.reactivex.rxjava3.core.x.i(new RetryLimitExceededException(0));
        }
        dVar.onNext(new jbe.a(u0, zb, f));
        return jbeVar.a(i + 1);
    }
}
