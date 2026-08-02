package androidx.compose.material;

import defpackage.bts;
import defpackage.dmh;
import defpackage.fid;
import defpackage.h8w;
import defpackage.jmy0;
import defpackage.ldc;
import defpackage.oz40;
import defpackage.zls;

/* loaded from: classes10.dex */
public final class f implements zls {
    public final /* synthetic */ jmy0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ h8w w;

    public f(jmy0 jmy0Var, boolean z, boolean z2, h8w h8wVar) {
        this.a = jmy0Var;
        this.b = z;
        this.c = z2;
        this.w = h8wVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InputPhase inputPhase = (InputPhase) obj;
        ((Number) obj3).intValue();
        bts btsVar = (bts) ((fid) obj2);
        btsVar.e0(1423138213);
        boolean z = inputPhase == InputPhase.UnfocusedEmpty ? false : this.c;
        dmh dmhVar = (dmh) this.a;
        dmhVar.getClass();
        btsVar.e0(727091888);
        oz40 n = androidx.compose.runtime.f.n(new ldc(!this.b ? dmhVar.r : z ? dmhVar.s : ((Boolean) androidx.compose.foundation.interaction.a.b(this.w, btsVar, 0).getValue()).booleanValue() ? dmhVar.p : dmhVar.q), btsVar);
        btsVar.t(false);
        long j = ((ldc) n.getValue()).a;
        btsVar.t(false);
        return new ldc(j);
    }
}
