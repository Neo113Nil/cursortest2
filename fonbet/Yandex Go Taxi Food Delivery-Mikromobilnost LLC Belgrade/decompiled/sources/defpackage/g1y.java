package defpackage;

import androidx.compose.ui.layout.h;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.k;
import java.util.List;

/* loaded from: classes10.dex */
public final class g1y extends a1y {
    public final /* synthetic */ i b;
    public final /* synthetic */ wls c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1y(i iVar, wls wlsVar, String str) {
        super(str);
        this.b = iVar;
        this.c = wlsVar;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        i iVar = this.b;
        h hVar = iVar.A;
        hVar.a = kVar.getLayoutDirection();
        hVar.b = kVar.getDensity();
        hVar.c = kVar.u0();
        boolean d0 = kVar.d0();
        wls wlsVar = this.c;
        if (d0 || iVar.a.A == null) {
            iVar.w = 0;
            aa10 aa10Var = (aa10) wlsVar.invoke(hVar, new n8e(j));
            return new f1y(aa10Var, iVar, iVar.w, aa10Var, 1);
        }
        iVar.x = 0;
        aa10 aa10Var2 = (aa10) wlsVar.invoke(iVar.B, new n8e(j));
        return new f1y(aa10Var2, iVar, iVar.x, aa10Var2, 0);
    }
}
