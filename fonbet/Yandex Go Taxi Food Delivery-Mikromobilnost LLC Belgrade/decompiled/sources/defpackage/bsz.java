package defpackage;

import android.content.Context;
import com.yandex.go.lifecycle.processor.b;
import com.yandex.go.lottie_loader.data.repositories.d;
import com.yandex.go.lottie_loader.domain.interactors.a;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.map_common.map.o;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.map_common.map.r;
import ru.yandex.taxi.settings.main.c;

/* loaded from: classes.dex */
public final class bsz implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ bsz(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new a((d) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 1:
                return new com.yandex.go.lottie_loader.data.api.a((on2) xvf0Var.get(), (tt2) xvf0Var2.get());
            case 2:
                return new kjz(3, (wnt) xvf0Var2.get(), (pdc) xvf0Var.get());
            case 3:
                return new rwz((tj60) xvf0Var.get(), (Context) xvf0Var2.get());
            case 4:
                return new c9v(19, (fga0) xvf0Var2.get(), (jaa0) xvf0Var.get());
            case 5:
                return new j02((mf00) xvf0Var2.get(), (com.yandex.go.mainscreen.superapp.impl.fragment.a) xvf0Var.get(), 1);
            case 6:
                return new a200((t9f0) xvf0Var2.get(), (w100) xvf0Var.get());
            case 7:
                return new c200((d200) xvf0Var2.get(), (b200) xvf0Var.get());
            case 8:
                return new x300((by2) xvf0Var2.get(), (b) xvf0Var.get());
            case 9:
                return new c(xvf0Var2, (com.yandex.go.lifecycle.a) xvf0Var.get());
            case 10:
                return new d800((ufb0) xvf0Var2.get(), (i130) xvf0Var.get(), 0);
            case 11:
                return qtb1.q((MainScreenBehavior) xvf0Var2.get(), i5m.a(xvf0Var));
            case 12:
                return new s900((flex.engine.a) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 13:
                return new wc00((tyz0) xvf0Var2.get(), (cd00) xvf0Var.get());
            case 14:
                return new ru.yandex.taxi.map_common.map.experiment.b((nbj) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 15:
                return new to00((ah00) xvf0Var2.get(), (ru.yandex.taxi.map_common.map.utils.a) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.map_common.style.a((ru.yandex.taxi.map_common.style.domain.a) xvf0Var2.get(), (vs00) xvf0Var.get());
            case 17:
                return new o((el00) xvf0Var2.get(), (vlm) xvf0Var.get());
            case 18:
                return new az00((h010) xvf0Var2.get(), (x111) xvf0Var.get());
            case 19:
                return new fz00((p) xvf0Var2.get(), (r) xvf0Var.get());
            case 20:
                return new iz00((h010) xvf0Var2.get(), (x111) xvf0Var.get());
            case 21:
                return new t010((h010) xvf0Var2.get(), (x111) xvf0Var.get());
            case 22:
                return new ru.yandex.taxi.masstransit.deeplink.c(i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 23:
                return new ru.yandex.taxi.masstransit.deeplink.d(i5m.a(xvf0Var2), i5m.a(xvf0Var));
            case 24:
                return new u110((h010) xvf0Var2.get(), (x111) xvf0Var.get());
            case 25:
                return new y110((tt2) xvf0Var.get(), (x210) xvf0Var2.get());
            case 26:
                return new jh10((ney0) xvf0Var2.get(), (kse) xvf0Var.get());
            case 27:
                return new mn10((tv11) xvf0Var.get(), (com.yandex.go.ultima_mode.preferences.a) xvf0Var2.get());
            case 28:
                return new vz10();
            default:
                return new com.yandex.messaging.internal.avatar.a((ab4) xvf0Var.get(), i5m.a(xvf0Var2));
        }
    }
}
