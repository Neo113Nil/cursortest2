package defpackage;

import android.content.Context;
import com.yandex.go.explorer.impl.data.repositories.b;
import com.yandex.go.explorer.impl.navigation.appsettings.a;
import com.yandex.go.payments.shared.family.invites.ui.FamilyInviteView;
import com.yandex.go.proxyprovision.j;
import com.yandex.go.yb.data.u;
import com.yandex.go.yb.domain.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.logistics.sdk.promotions.impl.PromotionsApi;
import ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui.c;
import ru.yandex.taxi.preorder.extraphone.e;
import ru.yandex.taxi.router.d;
import ru.yandex.taxi.summary.requirements.list.interactors.y;
import ru.yandex.taxi.superapp.i;
import ru.yandex.taxi.superapp.r;
import ru.yandex.taxi.superapp.v;

/* loaded from: classes5.dex */
public final class cto implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;

    public /* synthetic */ cto(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.c;
        xvf0 xvf0Var3 = this.b;
        switch (i) {
            case 0:
                return new a((Context) ((jzf) xvf0Var3).get(), (y50) ((jzf) xvf0Var2).get(), (g) ((jzf) xvf0Var).get());
            case 1:
                return new b((ato) ((hro) xvf0Var3).get(), (tt2) ((jzf) xvf0Var2).get(), (puo) xvf0Var.get());
            case 2:
                return new ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.data.a(i5m.a(xvf0Var3), i5m.a(xvf0Var2), (gwo) ((c7n) xvf0Var).get());
            case 3:
                return new kwo((Context) ((qzf) xvf0Var3).get(), (c) ((bo2) xvf0Var2).get(), (hwy0) ((qzf) xvf0Var).get());
            case 4:
                h1p h1pVar = (h1p) xvf0Var3.get();
                Set set = (Set) ((szf) xvf0Var2).get();
                h870 h870Var = (h870) ((zi60) xvf0Var).get();
                ArrayList arrayList = new ArrayList();
                for (Object obj : set) {
                    if (!h870.class.isInstance((vx2) obj)) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashSet i2 = v4r0.i(kotlin.collections.a.N0(arrayList), h870Var);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = i2.iterator();
                while (it.hasNext()) {
                    tx2 a = ((vx2) it.next()).a(h1pVar);
                    if (a != null) {
                        arrayList2.add(a);
                    }
                }
                return kotlin.collections.a.N0(arrayList2);
            case 5:
                tse tseVar = (tse) xvf0Var3.get();
                h1p h1pVar2 = (h1p) xvf0Var2.get();
                cxq0 cxq0Var = ((fcn) ((jzf) xvf0Var).get()).a;
                return new com.yandex.go.superapp.biometrics.a(tseVar, h1pVar2, (ty5) ((xvf0) cxq0Var.b).get(), (rqo) ((xvf0) cxq0Var.c).get(), (com.yandex.go.superapp.biometrics.domain.a) ((aj0) cxq0Var.w).get(), (com.yandex.go.superapp.biometrics.domain.b) ((o10) cxq0Var.x).get());
            case 6:
                hhs0 hhs0Var = (hhs0) ((tzf) xvf0Var3).get();
                tse tseVar2 = (tse) xvf0Var2.get();
                return new i((ru.yandex.taxi.am.token.a) hhs0Var.b, (tdn) hhs0Var.c, (x6w0) xvf0Var.get(), tseVar2);
            case 7:
                ((tzf) xvf0Var3).get();
                return new ru.yandex.taxi.delegates.b((com.yandex.go.superapp.impl.interactor.c) ((szf) xvf0Var2).get(), (tse) xvf0Var.get());
            case 8:
                x9w0 x9w0Var = (x9w0) ((szf) xvf0Var3).get();
                h1p h1pVar3 = (h1p) xvf0Var2.get();
                return new fho((yrv0) x9w0Var.a.a.get(), (rvq0) xvf0Var.get(), h1pVar3);
            case 9:
                jhu0 jhu0Var = (jhu0) ((szf) xvf0Var3).get();
                return new d((tse) xvf0Var2.get(), (j) jhu0Var.a, (s2p) xvf0Var.get());
            case 10:
                return new t020((h1p) xvf0Var2.get(), (s2p) xvf0Var.get(), (ru.yandex.taxi.messenger.a) ((wor0) ((szf) xvf0Var3).get()).a);
            case 11:
                amp0 amp0Var = (amp0) ((tzf) xvf0Var3).get();
                return new h6w0((ru.yandex.taxi.am.g) amp0Var.a, (cba0) amp0Var.b, (yrv0) amp0Var.c, (h1p) xvf0Var2.get(), (s2p) xvf0Var.get());
            case 12:
                jhu0 jhu0Var2 = (jhu0) ((tzf) xvf0Var3).get();
                return new r((tse) xvf0Var2.get(), (ru.yandex.taxi.stories.domain.b) jhu0Var2.a, (s2p) xvf0Var.get());
            case 13:
                ((tzf) xvf0Var3).get();
                return new viw0((h1p) xvf0Var2.get(), (s2p) xvf0Var.get());
            case 14:
                fcj0 fcj0Var = (fcj0) ((szf) xvf0Var3).get();
                return new v((o) fcj0Var.a, (u) fcj0Var.b, (tt2) fcj0Var.c, (as51) fcj0Var.d, (c8w0) fcj0Var.e, (tse) xvf0Var2.get(), (s2p) xvf0Var.get());
            case 15:
                return new bf8((e) xvf0Var3.get(), (dqe0) ((w0g) xvf0Var2).get(), (v4p) ((u0g) xvf0Var).get());
            case 16:
                return new jdj(23, (e) xvf0Var3.get(), (dqe0) xvf0Var2.get(), (u1n) ((c4p) xvf0Var).get());
            case 17:
                return new FamilyInviteView((Context) ((tzf) xvf0Var3).get(), (bbp) xvf0Var2.get(), (pav) ((wzf) xvf0Var).get());
            case 18:
                return new com.yandex.go.navigator.favorites.analylics.a((ub50) ((wz30) xvf0Var3).get(), (eb50) xvf0Var2.get(), (com.yandex.go.navigator.main_screen.experiement.e) xvf0Var.get());
            case 19:
                return new com.yandex.go.navigator.floating_control_buttons.a((m901) xvf0Var3.get(), (com.yandex.go.navigator.map_interactions.parkings.c) xvf0Var2.get(), (r1l0) ((upk0) xvf0Var).get());
            case 20:
                return new r3s((l6s) xvf0Var3.get(), (ru.yandex.logistics.cargo_form.async.impl.interactor.b) ((m1g) xvf0Var2).get(), (ru.yandex.logistics.sdk.cargo_form.core.impl.repository.c) xvf0Var.get());
            case 21:
                return new b4s((nv8) ((n3w) xvf0Var3).a, (yv8) ((n3w) xvf0Var2).a, (a4s) ((v7p) xvf0Var).get());
            case 22:
                return new h4s((String) ((fxf) xvf0Var3).get(), (l6s) ((cuo) xvf0Var2).get(), (qnh) ((fxf) xvf0Var).get());
            case 23:
                return new y5s((o4s) ((n1g) xvf0Var3).get(), (jwh) xvf0Var2.get(), (gd3) xvf0Var.get());
            case 24:
                return new com.yandex.messaging.internal.chat.info.settings.domain.a((y4t) ((k0n) xvf0Var3).get(), (com.yandex.messaging.internal.backendconfig.b) ((wrh) xvf0Var2).get(), (kse) xvf0Var.get());
            case 25:
                return new p9t((ibt) xvf0Var3.get(), (com.yandex.messaging.chat.c) ((cto) xvf0Var2).get(), (kse) xvf0Var.get());
            case 26:
                return new com.yandex.messaging.chat.c((oeb) ((peb) xvf0Var3).get(), (rft) ((f9t) xvf0Var2).get(), (kse) xvf0Var.get());
            case 27:
                return new ru.yandex.taxi.logistics.sdk.promotions.impl.a((PromotionsApi) ((h1t) xvf0Var3).get(), (vsf0) xvf0Var2.get(), (btf0) ((tgb0) xvf0Var).get());
            case 28:
                return new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.u((y) ((xv8) xvf0Var3).get(), (com.yandex.go.summary.mapper.a) ((s3f0) xvf0Var2).get(), (viv0) xvf0Var.get());
            default:
                return new com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.v((ru.yandex.taxi.requirements.glued.interactor.c) ((iv0) xvf0Var3).get(), (com.yandex.go.summary.mapper.a) ((s3f0) xvf0Var2).get(), (viv0) xvf0Var.get());
        }
    }
}
