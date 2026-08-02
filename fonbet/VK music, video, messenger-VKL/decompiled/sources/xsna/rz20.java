package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class rz20 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rz20(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                p230 p230Var = (p230) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(681448774, intValue, -1, "com.vk.video.ui.upload.impl.publish.presentation.author.compose.modal.Modal.<anonymous>.<anonymous>.<anonymous> (Modal.kt:68)");
                    }
                    ae80.a(384, aVar, p230Var.d.b, izsVar, s200.E(q630.a.a, 12, 6));
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                yjl yjlVar = (yjl) this.c;
                Object obj4 = (yvj) this.d;
                jj jjVar = (jj) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(jjVar) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1020747412, intValue2, -1, "com.vk.design.demo.presentation.screens.TabsScreenContent.Content.<anonymous>.<anonymous> (TabsScreenContent.kt:93)");
                    }
                    boolean z = yjlVar.k() == 0;
                    boolean y = aVar2.y(obj4) | aVar2.J(yjlVar);
                    Object x = aVar2.x();
                    Object obj5 = a.C0011a.a;
                    if (y || x == obj5) {
                        x = new fy0(22, obj4, yjlVar);
                        aVar2.R(x);
                    }
                    int i = ((intValue2 << 12) & 57344) | 384;
                    jjVar.b(z, (gzs) x, sli.a, null, aVar2, i, 8);
                    boolean z2 = yjlVar.k() == 1;
                    boolean y2 = aVar2.y(obj4) | aVar2.J(yjlVar);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == obj5) {
                        x2 = new g4(23, obj4, yjlVar);
                        aVar2.R(x2);
                    }
                    jjVar.b(z2, (gzs) x2, sli.b, null, aVar2, i, 8);
                    boolean z3 = yjlVar.k() == 2;
                    boolean y3 = aVar2.y(obj4) | aVar2.J(yjlVar);
                    Object x3 = aVar2.x();
                    if (y3 || x3 == obj5) {
                        x3 = new h4(17, obj4, yjlVar);
                        aVar2.R(x3);
                    }
                    jjVar.b(z3, (gzs) x3, sli.c, null, aVar2, i, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
