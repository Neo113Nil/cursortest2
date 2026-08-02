package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.ui.semantics.f;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.NestedScrollableHost;
import com.adjust.sdk.Constants;
import ru.yandex.taxi.masstransit.d;
import ru.yandex.taxi.masstransit.main.router.b;
import ru.yandex.taxi.masstransit.router.g;
import ru.yandex.taxi.masstransit.router.l;
import ru.yandex.taxi.widget.recycler.PositionLayoutManager;

/* loaded from: classes6.dex */
public final /* synthetic */ class pi30 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ pi30(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        oq30 oq30Var = oq30.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                d.Q(((b010) obj).a, oq30Var);
                return zy11Var;
            case 1:
                d.Q(((b010) obj).a, oq30Var);
                return zy11Var;
            case 2:
                f.d((mnq0) obj);
                return zy11Var;
            case 3:
                f.d((mnq0) obj);
                return zy11Var;
            case 4:
                rz00 rz00Var = (rz00) obj;
                rz00Var.a.a0(rz00Var.b, new xq30(rz00Var.c, rz00Var.w));
                return zy11Var;
            case 5:
                f.p((mnq0) obj, 0);
                return zy11Var;
            case 6:
                sz00 sz00Var = (sz00) obj;
                sz00Var.a.a0(sz00Var.b, new xq30(sz00Var.c, sz00Var.w));
                return zy11Var;
            case 7:
                f.p((mnq0) obj, 0);
                return zy11Var;
            case 8:
                d.Q(((c010) obj).b, oq30Var);
                return zy11Var;
            case 9:
                d.Q(((c010) obj).b, oq30Var);
                return zy11Var;
            case 10:
                d.Q(((c010) obj).b, oq30Var);
                return zy11Var;
            case 11:
                ((cp30) obj).m();
                return zy11Var;
            case 12:
                i26 i26Var = (i26) obj;
                switch (i26Var.a) {
                    case 0:
                        ((sls) i26Var.b).invoke();
                        return zy11Var;
                    case 1:
                        ((g700) i26Var.b).invoke();
                        return zy11Var;
                    default:
                        ((je30) i26Var.b).T();
                        return zy11Var;
                }
            case 13:
                hz30 hz30Var = (hz30) obj;
                if (!(hz30Var instanceof bs30) && ((!(hz30Var instanceof yi40) || ((yi40) hz30Var).a == null) && (!(hz30Var instanceof zi40) || ((zi40) hz30Var).a == null))) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                return zy11Var;
            case 15:
                uo30 uo30Var = (uo30) obj;
                switch (uo30Var.a) {
                    case 0:
                        ((b) uo30Var.b).r(new pi30(10));
                        return zy11Var;
                    default:
                        zsa zsaVar = (zsa) uo30Var.b;
                        zsaVar.r(new qu(9));
                        ((m020) zsaVar.F).invoke();
                        return zy11Var;
                }
            case 16:
                ((oy30) obj).a.r(new pi30(22));
                return zy11Var;
            case 17:
                oy30 oy30Var = (oy30) obj;
                iz1 iz1Var = oy30Var.a;
                t3g t3gVar = oy30Var.b;
                su30 d = ((ru.yandex.taxi.masstransit.datasource.routing.f) ((x3g) t3gVar.f).t.get()).d();
                if (d != null) {
                    iz1Var.D((l) ((o08) t3gVar.w).get(), new qk40(d, ck40.a), new cb0(12, iz1Var, t3gVar));
                }
                return zy11Var;
            case 18:
                hz30 hz30Var2 = (hz30) obj;
                if (!(hz30Var2 instanceof jm30) && !(hz30Var2 instanceof r440) && !(hz30Var2 instanceof lj40)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                return Integer.valueOf(((hz30) obj).b());
            case 20:
                ((gx30) obj).e();
                return zy11Var;
            case 21:
                ((lf00) obj).b().h();
                return zy11Var;
            case 22:
                ((ny30) obj).a.r(new pi30(20));
                return zy11Var;
            case 23:
                ViewGroup viewGroup = (ViewGroup) obj;
                NestedScrollableHost nestedScrollableHost = (NestedScrollableHost) LayoutInflater.from(viewGroup.getContext()).inflate(uqh0.mt_routes_viewpager_layout, viewGroup, false);
                RecyclerView recyclerView = (RecyclerView) nestedScrollableHost.findViewById(reh0.routes);
                if (recyclerView != null) {
                    PositionLayoutManager positionLayoutManager = new PositionLayoutManager(recyclerView.getContext());
                    positionLayoutManager.d0 = new ak00(17);
                    recyclerView.setLayoutManager(positionLayoutManager);
                    recyclerView.addItemDecoration(new vqu(tje.u(8, viewGroup.getContext())));
                }
                return nestedScrollableHost;
            case 24:
                return new qy30((NestedScrollableHost) obj);
            case 25:
                ((ep30) obj).a.r(new pi30(11));
                return zy11Var;
            case 26:
                return Long.valueOf(((k110) obj).d);
            case 27:
                ((g) obj).n1();
                return zy11Var;
            case 28:
                m2k0 m2k0Var = (m2k0) obj;
                m2k0Var.y(cyk0.c(24.0f));
                m2k0Var.g(true);
                m2k0Var.j(1);
                return zy11Var;
            default:
                return new i(k.e(sb2.K(600, 100, null, 4), 2), k.f(sb2.K(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6), 2));
        }
    }
}
