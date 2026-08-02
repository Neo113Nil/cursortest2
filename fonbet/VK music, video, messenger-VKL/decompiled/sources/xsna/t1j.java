package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.r2j;

/* compiled from: ConfigureRoomsViewRenderer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class t1j extends FunctionReferenceImpl implements izs<r2j.c, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(r2j.c cVar) {
        r2j.c cVar2 = cVar;
        u1j u1jVar = (u1j) this.receiver;
        int i = u1j.G;
        u1jVar.getClass();
        if (cVar2 instanceof r2j.c.a) {
            cvk.u(((r2j.c.a) cVar2).a, false);
        } else if (cVar2 instanceof r2j.c.d) {
            r2j.c.d dVar = (r2j.c.d) cVar2;
            cvk.w(u1jVar.getContext().getString(dVar.a, dVar.b), false);
        }
        return s3q0.a;
    }
}
