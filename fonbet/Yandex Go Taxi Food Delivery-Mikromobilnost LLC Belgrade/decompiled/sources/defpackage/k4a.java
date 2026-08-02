package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.div.core.expression.variables.a;
import com.yandex.go.intercity.flex.dashboard.presentation.g;
import com.yandex.go.intercity.flex.dashboard.presentation.h;
import com.yandex.go.scooters.insurance.suggest.d;
import kotlin.Pair;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.summary.requirements.list.interactors.k0;

/* loaded from: classes12.dex */
public final class k4a implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final n3w c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;

    public k4a(xvf0 xvf0Var, n3w n3wVar, n3w n3wVar2, v7p v7pVar, ahu ahuVar, xvf0 xvf0Var2) {
        this.a = 8;
        this.b = xvf0Var;
        this.d = n3wVar;
        this.c = n3wVar2;
        this.e = v7pVar;
        this.f = ahuVar;
        this.g = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.g;
        xvf0 xvf0Var4 = this.d;
        n3w n3wVar = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new j4a((fva0) xvf0Var5.get(), (vn9) xvf0Var4.get(), (ol9) xvf0Var2.get(), (n4a) xvf0Var.get(), (s4a) n3wVar.a, (w030) xvf0Var3.get(), 0);
            case 1:
                return new fl5((tig) xvf0Var5.get(), (ujg) n3wVar.a, (w030) xvf0Var4.get(), this.e, (ipv) xvf0Var.get(), (tjg) xvf0Var3.get());
            case 2:
                Context context = (Context) xvf0Var5.get();
                boolean booleanValue = ((Boolean) xvf0Var4.get()).booleanValue();
                y6k y6kVar = (y6k) xvf0Var2.get();
                unf unfVar = (unf) xvf0Var.get();
                iu31 iu31Var = (iu31) xvf0Var3.get();
                rwo rwoVar = (rwo) n3wVar.a;
                tjk tjkVar = new tjk(new dcq0(context, booleanValue));
                tjkVar.j = new a(null);
                tjkVar.b = y6kVar;
                tjkVar.b(new a6v());
                tjkVar.b(new xw41());
                tjkVar.e = new kof(unfVar, iu31Var, rwoVar);
                tjkVar.b(new mxe0());
                tjkVar.h = new dzj(context, 3);
                tjkVar.i = gw00.e(new Pair("display", new dzj(context, 0)));
                tjkVar.p = true;
                tjkVar.q = false;
                return tjkVar.a();
            case 3:
                return new h((flex.engine.a) xvf0Var5.get(), (g) xvf0Var4.get(), (tt2) xvf0Var2.get(), (a) xvf0Var.get(), (wgr) xvf0Var3.get(), (Lifecycle) n3wVar.a);
            case 4:
                return new khj0((tse) xvf0Var5.get(), (k0) xvf0Var4.get(), (ru.yandex.taxi.summary.requirements.list.router.a) xvf0Var2.get(), (ru.yandex.taxi.preorder.summary.tariffpage.requirements.a) n3wVar.a, (lot0) xvf0Var.get(), (f580) xvf0Var3.get());
            case 5:
                return new fl5((w030) xvf0Var5.get(), (fva0) xvf0Var4.get(), this.e, this.f, (o8n0) xvf0Var3.get(), (s8n0) n3wVar.a);
            case 6:
                return new fl5((w030) xvf0Var5.get(), (fva0) xvf0Var4.get(), (hcn0) xvf0Var2.get(), (dcn0) n3wVar.a, (MapNotificationsMuteRepository) xvf0Var.get(), this.g);
            case 7:
                return new d((w030) xvf0Var5.get(), this.d, this.e, this.f, (bun0) xvf0Var3.get(), (xtn0) n3wVar.a);
            default:
                return new kpw0((i130) xvf0Var5.get(), (gpw0) xvf0Var4.get(), (jpw0) n3wVar.a, (rqw0) xvf0Var2.get(), this.f, this.g, 0);
        }
    }

    public /* synthetic */ k4a(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, n3w n3wVar, n3w n3wVar2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = n3wVar;
        this.c = n3wVar2;
    }

    public k4a(n3w n3wVar, n3w n3wVar2, k4g k4gVar, l4g l4gVar, xat xatVar, p6f p6fVar) {
        this.a = 1;
        this.b = n3wVar;
        this.c = n3wVar2;
        this.d = k4gVar;
        this.e = l4gVar;
        this.f = xatVar;
        this.g = p6fVar;
    }

    public /* synthetic */ k4a(xvf0 xvf0Var, xvf0 xvf0Var2, v7p v7pVar, n3w n3wVar, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.e = v7pVar;
        this.c = n3wVar;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
    }

    public k4a(qxf qxfVar, xvf0 xvf0Var, lxf lxfVar, n3w n3wVar, n3w n3wVar2, qxf qxfVar2) {
        this.a = 0;
        this.b = qxfVar;
        this.d = xvf0Var;
        this.e = lxfVar;
        this.f = n3wVar;
        this.c = n3wVar2;
        this.g = qxfVar2;
    }

    public k4a(rxk rxkVar, kk kkVar, n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, n3w n3wVar2) {
        this.a = 2;
        this.b = kkVar;
        this.d = n3wVar;
        this.e = xvf0Var;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.c = n3wVar2;
    }
}
