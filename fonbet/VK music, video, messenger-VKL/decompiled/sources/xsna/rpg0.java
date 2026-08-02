package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import xsna.tra0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class rpg0 implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ rpg0(nzx0 nzx0Var, int i, tra0 tra0Var, int i2, ep10 ep10Var) {
        this.e = nzx0Var;
        this.c = i;
        this.f = tra0Var;
        this.d = i2;
        this.g = ep10Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                tra0[] tra0VarArr = (tra0[]) this.e;
                androidx.compose.foundation.layout.k kVar = (androidx.compose.foundation.layout.k) this.f;
                int[] iArr = (int[]) this.g;
                tra0.a aVar = (tra0.a) obj;
                int length = tra0VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    tra0 tra0Var = tra0VarArr[i];
                    int i3 = i2 + 1;
                    Object c = tra0Var.c();
                    opg0 opg0Var = c instanceof opg0 ? (opg0) c : null;
                    ejk ejkVar = opg0Var != null ? opg0Var.c : null;
                    int i4 = this.c;
                    aVar.q(tra0Var, iArr[i2], ejkVar != null ? ejkVar.a(i4, tra0Var.c, LayoutDirection.Ltr, tra0Var, this.d) : kVar.b.a(tra0Var.c, i4), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    i++;
                    i2 = i3;
                }
                break;
            default:
                nzx0 nzx0Var = (nzx0) this.e;
                tra0.a.w((tra0.a) obj, (tra0) this.f, nzx0Var.r.invoke(new q9x(((this.c - r1.b) << 32) | ((this.d - r1.c) & 4294967295L)), ((ep10) this.g).getLayoutDirection()).a);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ rpg0(tra0[] tra0VarArr, androidx.compose.foundation.layout.k kVar, int i, int i2, int[] iArr) {
        this.e = tra0VarArr;
        this.f = kVar;
        this.c = i;
        this.d = i2;
        this.g = iArr;
    }
}
