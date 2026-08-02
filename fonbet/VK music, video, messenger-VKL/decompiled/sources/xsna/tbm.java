package xsna;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import xsna.dcm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class tbm implements izs {
    public final /* synthetic */ dcm b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ tbm(dcm dcmVar, long j, int i, long j2) {
        this.b = dcmVar;
        this.c = j;
        this.d = i;
        this.e = j2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list = (List) obj;
        dcm dcmVar = this.b;
        ConcurrentHashMap<Long, dcm.a> concurrentHashMap = dcmVar.f;
        long j = this.c;
        dcm.a aVar = concurrentHashMap.get(Long.valueOf(j));
        boolean z = aVar != null ? aVar.c : false;
        if (list.size() >= 15 || z) {
            return io.reactivex.rxjava3.core.x.k(new Pair(list, Boolean.TRUE));
        }
        return new io.reactivex.rxjava3.internal.operators.single.d0(dcmVar.d.b(dcmVar, new gem(j)).l(new lp0(new acm(dcmVar, this.d, j, this.e, 0), 17)).l(new r41(new ve0(22), 22)), new com.vk.movika.sdk.base.hooks.k(list, 21), null);
    }
}
