package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Merchant;
import com.yandex.fintechsdk.flows.payment.kit.api.model.Payer;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.go.places.map.ui.pinwar.b;
import ru.yandex.taxi.layers.presentation.mapnotification.MapNotificationsMuteRepository;
import ru.yandex.taxi.settings.domain.d;
import ru.yandex.taxi.settings.presentation.settings.a;

/* loaded from: classes6.dex */
public final class b15 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final n3w i;

    public b15(k7g k7gVar, l7g l7gVar, n7g n7gVar, k7g k7gVar2, m7g m7gVar, n3w n3wVar, g1n0 g1n0Var, mam0 mam0Var) {
        this.a = 3;
        this.b = k7gVar;
        this.c = l7gVar;
        this.d = n7gVar;
        this.e = k7gVar2;
        this.f = m7gVar;
        this.i = n3wVar;
        this.g = g1n0Var;
        this.h = mam0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [uo21] */
    @Override // defpackage.yvf0
    public final Object get() {
        jgc0 jgc0Var;
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.g;
        n3w n3wVar = this.i;
        xvf0 xvf0Var5 = this.e;
        xvf0 xvf0Var6 = this.c;
        xvf0 xvf0Var7 = this.b;
        switch (i) {
            case 0:
                return new z05((Context) xvf0Var7.get(), (v2a0) xvf0Var6.get(), (xzd) xvf0Var2.get(), (DefaultEnvironment) xvf0Var5.get(), (Merchant) xvf0Var.get(), (Payer) xvf0Var4.get(), (Scenario) xvf0Var3.get(), (s3a0) n3wVar.a);
            case 1:
                a3v a3vVar = (a3v) xvf0Var7.get();
                bt00 bt00Var = (bt00) xvf0Var6.get();
                b bVar = (b) xvf0Var2.get();
                l56 l56Var = (l56) xvf0Var5.get();
                jgc0 jgc0Var2 = (jgc0) xvf0Var.get();
                ?? r1 = (uo21) xvf0Var4.get();
                ah00 ah00Var = (ah00) xvf0Var3.get();
                hgc0 hgc0Var = (hgc0) n3wVar.a;
                if (jl40.l(hgc0Var, fgc0.a)) {
                    jgc0Var = null;
                } else {
                    if (!(hgc0Var instanceof ggc0)) {
                        w511.b();
                        return null;
                    }
                    jgc0Var = ((ggc0) hgc0Var).a ? jgc0Var2 : r1;
                }
                return new a3c0(bVar, a3vVar, bt00Var, l56Var, jgc0Var, ah00Var);
            case 2:
                return new a((d) xvf0Var7.get(), (j2g0) xvf0Var6.get(), (i1g0) xvf0Var2.get(), (ru.yandex.taxi.settings.domain.b) xvf0Var5.get(), (wh9) xvf0Var.get(), (q3g0) xvf0Var4.get(), (o4g0) xvf0Var3.get(), (w550) n3wVar.a);
            default:
                return new ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.a((w030) xvf0Var7.get(), (fva0) xvf0Var6.get(), this.d, (MapNotificationsMuteRepository) xvf0Var5.get(), this.f, (can0) n3wVar.a, (sbo0) xvf0Var4.get(), (ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.domain.a) xvf0Var3.get());
        }
    }

    public /* synthetic */ b15(v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var, v7p v7pVar3, xvf0 xvf0Var2, xvf0 xvf0Var3, v7p v7pVar4, n3w n3wVar, int i) {
        this.a = i;
        this.b = v7pVar;
        this.c = v7pVar2;
        this.d = xvf0Var;
        this.e = v7pVar3;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.h = v7pVar4;
        this.i = n3wVar;
    }

    public b15(rsj rsjVar, x4g x4gVar, x4g x4gVar2, xvf0 xvf0Var, o4g o4gVar, vd vdVar, z4g z4gVar, x4g x4gVar3, n3w n3wVar) {
        this.a = 1;
        this.b = x4gVar;
        this.c = x4gVar2;
        this.d = xvf0Var;
        this.e = o4gVar;
        this.f = vdVar;
        this.g = z4gVar;
        this.h = x4gVar3;
        this.i = n3wVar;
    }
}
