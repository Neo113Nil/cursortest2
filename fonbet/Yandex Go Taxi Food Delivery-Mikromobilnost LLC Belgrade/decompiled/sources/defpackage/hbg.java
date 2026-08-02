package defpackage;

import com.yandex.go.delivery.tracking.l;
import com.yandex.go.urbanads.b;
import ru.yandex.taxi.logistics.payment.a;
import ru.yandex.taxi.logistics.photocomment.c;

/* loaded from: classes5.dex */
public final class hbg implements xvf0 {
    public final /* synthetic */ int a;
    public final z4m0 b;

    public /* synthetic */ hbg(z4m0 z4m0Var, int i) {
        this.a = i;
        this.b = z4m0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        z4m0 z4m0Var = this.b;
        switch (i) {
            case 0:
                return (g701) z4m0Var.b;
            case 1:
                l lVar = (l) z4m0Var.c;
                q5z.h(lVar);
                return lVar;
            case 2:
                return (m5i) z4m0Var.w;
            case 3:
                return (x501) z4m0Var.y;
            case 4:
                return (c) z4m0Var.z;
            case 5:
                a aVar = (a) z4m0Var.x;
                q5z.h(aVar);
                return aVar;
            default:
                b bVar = (b) z4m0Var.A;
                q5z.h(bVar);
                return bVar;
        }
    }
}
