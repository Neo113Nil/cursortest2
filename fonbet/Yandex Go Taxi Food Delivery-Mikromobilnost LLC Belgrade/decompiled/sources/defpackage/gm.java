package defpackage;

import com.squareup.moshi.Moshi;
import com.yandex.delivery.utils.push.impl.a;
import com.yandex.go.preorder.navigation.g;
import java.util.Set;
import ru.yandex.taxi.am.h;

/* loaded from: classes9.dex */
public final class gm implements v7p {
    public final /* synthetic */ int a;
    public final y2r0 b;
    public final xvf0 c;
    public final xvf0 d;

    public gm(ziv zivVar, y2r0 y2r0Var, xvf0 xvf0Var) {
        this.a = 3;
        this.c = zivVar;
        this.b = y2r0Var;
        this.d = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        y2r0 y2r0Var = this.b;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        switch (i) {
            case 0:
                h3y a = i5m.a(y2r0Var);
                return new h((tt2) xvf0Var.get(), (hit) xvf0Var2.get(), a);
            case 1:
                return new a((Set) y2r0Var.get(), (st2) xvf0Var2.get(), (Moshi) xvf0Var.get());
            case 2:
                return new nfh((qmp) xvf0Var2.get(), (g) xvf0Var.get(), (Set) y2r0Var.get());
            case 3:
                return new com.yandex.go.analytics.realtime.a((alv) xvf0Var2.get(), (Set) y2r0Var.get(), (tt2) xvf0Var.get());
            default:
                return new am2((lvz) xvf0Var2.get(), (x1f0) xvf0Var.get(), y2r0Var);
        }
    }

    public /* synthetic */ gm(y2r0 y2r0Var, xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = y2r0Var;
        this.c = xvf0Var;
        this.d = xvf0Var2;
    }

    public /* synthetic */ gm(xvf0 xvf0Var, xvf0 xvf0Var2, y2r0 y2r0Var, int i) {
        this.a = i;
        this.c = xvf0Var;
        this.d = xvf0Var2;
        this.b = y2r0Var;
    }
}
