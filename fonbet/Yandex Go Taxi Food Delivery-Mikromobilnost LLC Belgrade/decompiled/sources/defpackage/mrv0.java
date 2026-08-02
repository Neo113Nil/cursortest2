package defpackage;

import com.yandex.go.navigator.domain.t;
import com.yandex.go.navigator.domain.v;
import com.yandex.go.navigator.driving.c0;
import com.yandex.go.navigator.driving.p0;
import com.yandex.go.payments.domain.m0;
import com.yandex.go.superapp.discovery.map.impl.domain.interactors.y;
import com.yandex.messaging.internal.view.chat.ChatSearchToolbarBrick;
import com.yandex.messaging.internal.view.chat.c;
import com.yandex.messaging.ui.timeline.b;
import ru.yandex.taxi.preorder.summary.tariffpage.data.vertical.a;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;
import ru.yandex.taxi.surge.interactor.e;

/* loaded from: classes12.dex */
public final class mrv0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;

    public /* synthetic */ mrv0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.f;
        xvf0 xvf0Var6 = this.e;
        xvf0 xvf0Var7 = this.c;
        xvf0 xvf0Var8 = this.b;
        switch (i) {
            case 0:
                return new lrv0((trv0) xvf0Var8.get(), (e) xvf0Var7.get(), this.d, (oep0) xvf0Var6.get(), (tt2) xvf0Var5.get(), (vpw0) xvf0Var4.get(), (n3h) xvf0Var3.get(), (ouw0) xvf0Var2.get());
            case 1:
                return new y((f7c0) xvf0Var8.get(), (a211) xvf0Var7.get(), (ww9) xvf0Var.get(), (fin0) xvf0Var6.get(), (tux0) xvf0Var5.get(), (tuv0) xvf0Var4.get(), (ah00) xvf0Var3.get(), (tse) xvf0Var2.get());
            case 2:
                return new ru.yandex.taxi.preorder.summary.tariffpage.interactors.e((m0) xvf0Var8.get(), (pwy0) xvf0Var7.get(), (ekz) xvf0Var.get(), (jk31) xvf0Var6.get(), (a) xvf0Var5.get(), (SummaryStateTracker) xvf0Var4.get(), (tt2) xvf0Var3.get(), (fco) xvf0Var2.get());
            case 3:
                return new ycz0((ChatSearchToolbarBrick) xvf0Var8.get(), (c) xvf0Var7.get(), (com.yandex.messaging.internal.view.chat.e) xvf0Var.get(), i5m.a(xvf0Var6), i5m.a(xvf0Var5), i5m.a(xvf0Var4), (dbb) xvf0Var3.get(), (b) xvf0Var2.get());
            default:
                return new ywz0((com.yandex.go.navigator.repository.c) xvf0Var8.get(), (t) xvf0Var7.get(), (vff) xvf0Var.get(), (bp4) xvf0Var6.get(), (ce00) xvf0Var5.get(), (c0) xvf0Var4.get(), (p0) xvf0Var3.get(), (v) xvf0Var2.get());
        }
    }
}
