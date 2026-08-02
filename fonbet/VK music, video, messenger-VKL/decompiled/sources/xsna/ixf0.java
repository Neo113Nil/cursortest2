package xsna;

import com.facebook.common.memory.PooledByteBuffer;

/* compiled from: RemoveImageTransformMetaDataProducer.kt */
/* loaded from: classes12.dex */
public final class ixf0 implements thd0<uvf<PooledByteBuffer>> {
    public final thd0<rip> a;

    /* compiled from: RemoveImageTransformMetaDataProducer.kt */
    public final class a extends wtl<rip, uvf<PooledByteBuffer>> {
        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            rip ripVar = (rip) obj;
            uvf uvfVar = null;
            try {
                if (rip.x(ripVar) && ripVar != null) {
                    uvfVar = uvf.o(ripVar.b);
                }
                this.b.b(i, uvfVar);
            } finally {
                uvf.q(uvfVar);
            }
        }
    }

    public ixf0(thd0<rip> thd0Var) {
        this.a = thd0Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<uvf<PooledByteBuffer>> l7jVar, uhd0 uhd0Var) {
        this.a.b(new a(l7jVar), uhd0Var);
    }
}
