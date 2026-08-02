package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mja0 implements yzs {
    public final /* synthetic */ izs b;
    public final /* synthetic */ kja0 c;
    public final /* synthetic */ lja0 d;

    public /* synthetic */ mja0(izs izsVar, kja0 kja0Var, lja0 lja0Var) {
        this.b = izsVar;
        this.c = kja0Var;
        this.d = lja0Var;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
        int intValue = ((Integer) obj3).intValue();
        aVar.K(-417641602);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-417641602, intValue, -1, "com.vk.profile.design.utils.click.pictureClick.<anonymous> (PictureClickModifier.kt:22)");
        }
        Object x = aVar.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = androidx.compose.runtime.k.b(zhf0.e);
            aVar.R(x);
        }
        wh50 wh50Var = (wh50) x;
        Object x2 = aVar.x();
        if (x2 == c0012a) {
            x2 = new f2k(1, wh50Var);
            aVar.R(x2);
        }
        q630 o = egi.o(q630.a.a, (izs) x2);
        izs izsVar = this.b;
        kja0 kja0Var = this.c;
        lja0 lja0Var = this.d;
        Object[] objArr = {izsVar, kja0Var, lja0Var};
        boolean J = aVar.J(lja0Var) | aVar.J(izsVar) | aVar.y(kja0Var);
        Object x3 = aVar.x();
        if (J || x3 == c0012a) {
            x3 = new nja0(lja0Var, izsVar, kja0Var, wh50Var);
            aVar.R(x3);
        }
        q630 c = skn0.c(o, objArr, (PointerInputEventHandler) x3);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return c;
    }
}
