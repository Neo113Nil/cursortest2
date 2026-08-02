package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.notifications.core.item.NotificationImage;
import com.vk.notifications.core.item.a;
import java.util.List;

/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class wr3 implements zzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ List c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ Object e;

    public wr3(List list, a.c cVar, izs izsVar) {
        this.c = list;
        this.e = cVar;
        this.d = izsVar;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.b) {
            case 0:
                Object obj5 = (ksy) obj;
                int intValue = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar.J(obj5) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar.o(intValue) ? 32 : 16;
                }
                if (aVar.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    yq3 yq3Var = (yq3) this.c.get(intValue);
                    aVar.K(-2039544244);
                    com.vk.core.compose.component.cell.content.j0 a = Cell$Left.Main.a.C0731a.a(kai.c(-1559894230, new tr3(yq3Var, (mtk0) this.e), aVar), aVar);
                    String str = yq3Var.b;
                    if (str == null) {
                        str = "";
                    }
                    com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.a(str, null, null, 1, null, null, aVar, 12610560, 102), null, null, null, aVar, 196608, 30);
                    izs izsVar = this.d;
                    boolean J = aVar.J(izsVar) | aVar.J(yq3Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new ur3(izsVar, yq3Var);
                        aVar.R(x);
                    }
                    wiu0.b(null, false, a, a2, null, (gzs) x, null, aVar, 0, 83);
                    aVar.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                ksy ksyVar = (ksy) obj;
                int intValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (aVar2.J(ksyVar) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= aVar2.o(intValue3) ? 32 : 16;
                }
                if (aVar2.t(i2 & 1, (i2 & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(802480018, i2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    NotificationImage notificationImage = (NotificationImage) this.c.get(intValue3);
                    aVar2.K(2084846600);
                    oi70.b(notificationImage, ((a.c) this.e).b, this.d, aVar2, 0);
                    aVar2.j();
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

    public wr3(List list, izs izsVar, mtk0 mtk0Var) {
        this.c = list;
        this.d = izsVar;
        this.e = mtk0Var;
    }
}
