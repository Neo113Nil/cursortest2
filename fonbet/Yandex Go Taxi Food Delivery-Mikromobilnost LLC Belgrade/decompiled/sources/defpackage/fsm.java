package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes4.dex */
public final class fsm implements zls {
    public final /* synthetic */ oz40 A;
    public final /* synthetic */ trm a;
    public final /* synthetic */ float b;
    public final /* synthetic */ a c;
    public final /* synthetic */ a w;
    public final /* synthetic */ a x;
    public final /* synthetic */ qrm y;
    public final /* synthetic */ sls z;

    public fsm(trm trmVar, float f, a aVar, a aVar2, a aVar3, qrm qrmVar, sls slsVar, oz40 oz40Var) {
        this.a = trmVar;
        this.b = f;
        this.c = aVar;
        this.w = aVar2;
        this.x = aVar3;
        this.y = qrmVar;
        this.z = slsVar;
        this.A = oz40Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar = (fid) obj2;
        if ((((Number) obj3).intValue() & 17) == 16) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        com.yx360.design.compose.atoms.modal.a.c(this.a, ((y7m) this.A.getValue()).a, this.b, this.c, this.w, this.x, this.y, this.z, fidVar, 221184);
        return zy11.a;
    }
}
