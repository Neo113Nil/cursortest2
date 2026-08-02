package androidx.compose.material;

import defpackage.bts;
import defpackage.ck11;
import defpackage.fid;
import defpackage.rx01;
import defpackage.sb2;
import defpackage.ubn;
import defpackage.zls;

/* loaded from: classes10.dex */
public final /* synthetic */ class g implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rx01 rx01Var = (rx01) obj;
        ((Integer) obj3).getClass();
        bts btsVar = (bts) ((fid) obj2);
        btsVar.e0(1849239065);
        InputPhase inputPhase = InputPhase.Focused;
        InputPhase inputPhase2 = InputPhase.UnfocusedEmpty;
        Object K = rx01Var.a(inputPhase, inputPhase2) ? sb2.K(67, 0, ubn.d, 2) : (rx01Var.a(inputPhase2, inputPhase) || rx01Var.a(InputPhase.UnfocusedNotEmpty, inputPhase2)) ? new ck11(83, 67, ubn.d) : sb2.G(0.0f, 0.0f, 7, null);
        btsVar.t(false);
        return K;
    }
}
