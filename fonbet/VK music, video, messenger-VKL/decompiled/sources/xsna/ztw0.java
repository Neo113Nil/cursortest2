package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.buw0;
import xsna.duw0;

/* compiled from: VoipParticipantSettingsReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class ztw0 extends FunctionReferenceImpl implements izs<buw0, duw0.a> {
    @Override // xsna.izs
    public final duw0.a invoke(buw0 buw0Var) {
        buw0 buw0Var2 = buw0Var;
        ((auw0) this.receiver).getClass();
        if (buw0Var2.b) {
            return duw0.a.c.a;
        }
        Throwable th = buw0Var2.c;
        if (th != null) {
            return new duw0.a.C2755a(th);
        }
        buw0.b bVar = buw0Var2.e;
        sew0 sew0Var = bVar.d;
        String str = bVar.e;
        buw0.d dVar = buw0Var2.f;
        boolean z = dVar.b;
        buw0.a aVar = buw0Var2.g;
        return new duw0.a.b(new duw0.a.b.c(sew0Var, str, z, aVar.a), (bVar.b || !buw0Var2.d.b || dVar.a) ? duw0.a.b.d.C2761a.a : new duw0.a.b.d.C2762b(!z, !dVar.c, !dVar.d), new duw0.a.b.C2756a(aVar.d, aVar.e, aVar.f != null, aVar.g), new duw0.a.b.C2757b(aVar.b ? new duw0.a.b.C2757b.InterfaceC2758a.C2760b(dVar.e) : duw0.a.b.C2757b.InterfaceC2758a.C2759a.a, aVar.c ? new duw0.a.b.C2757b.InterfaceC2758a.C2760b(bVar.c) : duw0.a.b.C2757b.InterfaceC2758a.C2759a.a));
    }
}
