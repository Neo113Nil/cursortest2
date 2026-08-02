package defpackage;

import androidx.compose.runtime.internal.a;
import ru.yandex.taxi.favorites.address.impl.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class iep implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ iep(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new iep(bVar, 1);
                ((agd) yfdVar).g = new a(-1584212691, new alb0(yfdVar, bVar), true);
                break;
            default:
                bVar.H.d((tep) obj, bVar.o(), bVar.J);
                break;
        }
        return zy11Var;
    }
}
