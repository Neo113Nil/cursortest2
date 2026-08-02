package xsna;

import com.vk.geo.impl.model.Coordinate;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: GeoSideEffectChannel.kt */
/* loaded from: classes2.dex */
public final class fnt implements wj50<com.vk.geo.impl.presentation.h> {
    public final f4z<com.vk.geo.impl.presentation.h> a = new f4z<>();
    public final a<Coordinate> b = new a<>();

    /* compiled from: GeoSideEffectChannel.kt */
    public static final class a<V> implements Runnable {
        public final AtomicReference<V> b = new AtomicReference<>(null);
        public final AtomicReference<izs<V, s3q0>> c = new AtomicReference<>(null);

        @Override // java.lang.Runnable
        public final void run() {
            V v;
            izs izsVar = this.c.get();
            if (izsVar == null || (v = this.b.get()) == null) {
                return;
            }
            izsVar.invoke(v);
        }
    }

    @Override // xsna.wj50
    public final fq9 a(izs izsVar, f5z f5zVar) {
        return this.a.a(izsVar, f5zVar);
    }

    @Override // xsna.wj50
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(com.vk.geo.impl.presentation.h hVar) {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.d, new Object[]{"GeoFeature/SideEffects", hVar});
        }
        this.a.b(hVar);
    }
}
