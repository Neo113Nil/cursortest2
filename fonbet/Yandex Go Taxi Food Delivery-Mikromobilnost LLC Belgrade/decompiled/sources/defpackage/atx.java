package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;

/* loaded from: classes.dex */
public final class atx {
    public final AtomicReference a = new AtomicReference(null);

    public final void a(zzs zzsVar) {
        Long l = zzsVar.e;
        final long longValue = l != null ? l.longValue() : System.currentTimeMillis();
        final zzs zzsVar2 = new zzs(zzsVar.a, zzsVar.b, 0, null, Long.valueOf(longValue), 12);
        this.a.updateAndGet(new UnaryOperator() { // from class: zsx
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                zzs zzsVar3 = (zzs) obj;
                if (zzsVar3 != null) {
                    Long l2 = zzsVar3.e;
                    if ((l2 != null ? l2.longValue() : 0L) >= longValue) {
                        return zzsVar3;
                    }
                }
                return zzsVar2;
            }
        });
    }
}
