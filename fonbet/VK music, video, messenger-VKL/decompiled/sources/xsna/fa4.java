package xsna;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import xsna.dcm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class fa4 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fa4(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                ((ha4) this.d).b.remove(Long.valueOf(this.c));
                break;
            default:
                dcm dcmVar = (dcm) this.d;
                ConcurrentHashMap<Long, dcm.a> concurrentHashMap = dcmVar.f;
                long j = this.c;
                Long valueOf = Long.valueOf(j);
                final f6g f6gVar = new f6g((byte) 0, 4);
                concurrentHashMap.computeIfPresent(valueOf, new BiFunction() { // from class: xsna.xbm
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return (dcm.a) f6g.this.invoke(obj, obj2);
                    }
                });
                dcmVar.i.remove(Long.valueOf(j));
                break;
        }
    }
}
