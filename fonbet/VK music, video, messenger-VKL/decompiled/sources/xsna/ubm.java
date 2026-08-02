package xsna;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import kotlin.Pair;
import xsna.dcm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ubm implements izs {
    public final /* synthetic */ dcm b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;

    public /* synthetic */ ubm(dcm dcmVar, long j, int i) {
        this.b = dcmVar;
        this.c = j;
        this.d = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        List list = (List) pair.d();
        boolean booleanValue = ((Boolean) pair.g()).booleanValue();
        ConcurrentHashMap<Long, dcm.a> concurrentHashMap = this.b.f;
        Long valueOf = Long.valueOf(this.c);
        final ybm ybmVar = new ybm(this.d, list, booleanValue);
        concurrentHashMap.compute(valueOf, new BiFunction() { // from class: xsna.zbm
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                return (dcm.a) ybm.this.invoke(obj2, obj3);
            }
        });
        return s3q0.a;
    }
}
