package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes4.dex */
public final /* synthetic */ class dsm implements wls {
    public final /* synthetic */ qrm A;
    public final /* synthetic */ sls B;
    public final /* synthetic */ int a;
    public final /* synthetic */ trm b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float w;
    public final /* synthetic */ a x;
    public final /* synthetic */ a y;
    public final /* synthetic */ a z;

    public /* synthetic */ dsm(trm trmVar, float f, float f2, a aVar, a aVar2, a aVar3, qrm qrmVar, sls slsVar, int i, int i2) {
        this.a = i2;
        this.b = trmVar;
        this.c = f;
        this.w = f2;
        this.x = aVar;
        this.y = aVar2;
        this.z = aVar3;
        this.A = qrmVar;
        this.B = slsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(221185);
                com.yx360.design.compose.atoms.modal.a.c(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(221185);
                com.yx360.design.compose.atoms.modal.a.b(this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
