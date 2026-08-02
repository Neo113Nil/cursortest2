package defpackage;

import android.content.Context;
import com.yandex.go.shortcuts.impl.ui.shortcutview.a;
import com.yandex.go.walking.navigation.impl.guidance.interactor.n;
import com.yandex.go.walking.navigation.impl.guidance.service.e;
import com.yandex.go.zone.repository.h;
import com.yandex.go.zone.repository.k;
import com.yandex.go.zone.repository.l;
import com.ybsdk.rconfig.b;
import com.ybsdk.screens.initial.deeplink.i;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.j;
import ru.yandex.taxi.widget.c;

/* loaded from: classes.dex */
public final class fq21 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;

    public /* synthetic */ fq21(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.e;
        xvf0 xvf0Var2 = this.d;
        xvf0 xvf0Var3 = this.b;
        xvf0 xvf0Var4 = this.c;
        switch (i) {
            case 0:
                lx4 lx4Var = (lx4) xvf0Var3.get();
                cug cugVar = (cug) ((im21) xvf0Var4).get();
                zf zfVar = (zf) ((x) xvf0Var2).get();
                ((x) xvf0Var).get();
                return new eq21(lx4Var, cugVar, zfVar);
            case 1:
                return new lg31((Context) xvf0Var3.get(), (c) xvf0Var4.get(), (t4s0) ((u9g) xvf0Var2).get(), (a) ((rqt) xvf0Var).get());
            case 2:
                return new n((tse) xvf0Var3.get(), (q541) xvf0Var4.get(), (a341) xvf0Var2.get(), (b741) ((d441) xvf0Var).get());
            case 3:
                return new e((Context) ((d6g) xvf0Var4).get(), (tse) xvf0Var3.get(), (k0b0) ((d6g) xvf0Var2).get(), (k441) ((d6g) xvf0Var).get());
            case 4:
                return new com.yandex.go.walking.navigation.impl.navigation_core.guidance.c((dne0) ((d6g) xvf0Var3).get(), (tt2) ((d6g) xvf0Var4).get(), (e41) ((gd) xvf0Var2).get(), (g311) ((n3w) xvf0Var).a);
            case 5:
                return new i((b) xvf0Var3.get(), (qpi0) xvf0Var4.get(), (a3h) xvf0Var2.get(), (p450) ((jv21) xvf0Var).get());
            case 6:
                return new hp51((rqo) xvf0Var3.get(), (com.yandex.go.payments.yb.domain.b) ((jc60) xvf0Var4).get(), (wrz) ((zd51) xvf0Var2).get(), (ryh) ((x) xvf0Var).get());
            case 7:
                return r501.o((jj3) xvf0Var3.get(), (ru.yandex.taxi.am.e) xvf0Var4.get(), (g) xvf0Var2.get(), (j) ((sve) xvf0Var).get());
            case 8:
                return new ru.yandex.taxi.location.zerokm.a((ru.yandex.taxi.location.zerokm.datasource.a) xvf0Var3.get(), i5m.a(xvf0Var4), (y810) ((sp00) xvf0Var2).get(), (zuj0) xvf0Var.get());
            case 9:
                return new h((eex) xvf0Var3.get(), (k) ((hd61) xvf0Var4).get(), (tt2) xvf0Var2.get(), (jtq0) xvf0Var.get());
            default:
                return new l((ms2) ((eqh) xvf0Var4).get(), (lx4) xvf0Var3.get(), (t61) ((zd51) xvf0Var2).get(), (zf) ((zd51) xvf0Var).get());
        }
    }

    public /* synthetic */ fq21(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, int i, boolean z) {
        this.a = i;
        this.c = xvf0Var;
        this.b = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
    }
}
