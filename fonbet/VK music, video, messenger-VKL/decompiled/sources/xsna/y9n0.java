package xsna;

import android.app.Dialog;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.dto.common.actions.Action;
import com.vk.dto.menu.SideMenuItem;
import com.vk.dto.menu.SideMenuItems;
import com.vk.multiaccount.api.domain.model.VkClientOpenSwitcherConfig;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.LkPage;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.toggle.features.VkpFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.p820;

/* compiled from: SuperAppMenuV3PresenterImpl.kt */
/* loaded from: classes6.dex */
public final class y9n0 implements w9n0 {
    public final x9n0 b;
    public final s9n0 c;
    public final hlu0 d;
    public final jlu0 e;
    public final b25 f;
    public io.reactivex.rxjava3.disposables.c g;

    /* compiled from: SuperAppMenuV3PresenterImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkClientOpenSwitcherConfig.values().length];
            try {
                iArr[VkClientOpenSwitcherConfig.OPEN_AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkClientOpenSwitcherConfig.OPEN_SWITCHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LkPage.values().length];
            try {
                iArr2[LkPage.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[LkPage.RECOMMENDATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public y9n0(x9n0 x9n0Var, s9n0 s9n0Var, hlu0 hlu0Var, jlu0 jlu0Var, b25 b25Var) {
        this.b = x9n0Var;
        this.c = s9n0Var;
        this.d = hlu0Var;
        this.e = jlu0Var;
        this.f = b25Var;
    }

    public static void b(ArrayList arrayList, int i, int i2) {
        boolean d = q7n0.a().e().d("bugs");
        boolean d2 = q7n0.a().e().d("debug");
        if (d) {
            arrayList.add(new p820.c(i, i2, "bugs"));
            i2++;
        }
        if (d2) {
            arrayList.add(new p820.c(i, i2, "debug"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // xsna.w9n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q5(p820 p820Var) {
        LkPage lkPage;
        b25 b25Var;
        Map map;
        ww50 v;
        x9n0 x9n0Var = this.b;
        FragmentActivity activity = x9n0Var.getActivity();
        if (activity == null) {
            return;
        }
        this.c.b = p820Var;
        Dialog dialog = x9n0Var.s;
        nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
        if (nw20Var != null) {
            nw20Var.N0 = true;
            nw20Var.O0 = true;
            ModalBottomSheetBehavior<ViewGroup> modalBottomSheetBehavior = nw20Var.i;
            if (modalBottomSheetBehavior != null) {
                modalBottomSheetBehavior.D = false;
            }
        }
        x9n0Var.l1 = true;
        FragmentActivity activity2 = x9n0Var.getActivity();
        if (activity2 != null && (v = s200.v(activity2)) != null) {
            v.S(x9n0Var.o1);
        }
        if (!(p820Var instanceof p820.a)) {
            if (p820Var instanceof p820.b) {
                Action action = ((p820.b) p820Var).c.f;
                if (action != null) {
                    qex0.a().a(activity, action);
                    return;
                }
                return;
            }
            if (!(p820Var instanceof p820.c)) {
                throw new NoWhenBranchMatchedException();
            }
            ww50<?> v2 = s200.v(activity);
            if (v2 != null) {
                q7n0.a().e().c(v2, ((p820.c) p820Var).c);
                return;
            }
            return;
        }
        ProfileNavigationInfo profileNavigationInfo = ((p820.a) p820Var).a;
        if ((profileNavigationInfo != null ? profileNavigationInfo.e : null) != ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING) {
            if ((profileNavigationInfo != null ? profileNavigationInfo.e : null) != ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING_WELL_PROTECT) {
                VkpFeatures vkpFeatures = VkpFeatures.AUTO_BOOST_RECOMMENDATIONS;
                vkpFeatures.getClass();
                if (com.vk.toggle.b.A.a(vkpFeatures)) {
                    lkPage = LkPage.RECOMMENDATIONS;
                    b25Var = this.f;
                    if (b25Var.s(b25Var.c()) == null) {
                        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                        SuperappUiRouterBridge superappUiRouterBridge2 = superappUiRouterBridge != null ? superappUiRouterBridge : null;
                        int i = a.$EnumSwitchMapping$1[lkPage.ordinal()];
                        if (i == 1) {
                            map = jgp.b;
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            map = dt.b(NotificationCompat.CATEGORY_RECOMMENDATION, "1");
                        }
                        superappUiRouterBridge2.V(activity, map);
                        return;
                    }
                    return;
                }
            }
        }
        lkPage = LkPage.DEFAULT;
        b25Var = this.f;
        if (b25Var.s(b25Var.c()) == null) {
        }
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.gm6
    public final void d() {
        io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new bp0(this, 5));
        asu0 asu0Var = asu0.a;
        asu0Var.getClass();
        io.reactivex.rxjava3.disposables.c subscribe = new io.reactivex.rxjava3.internal.operators.observable.c0(io.reactivex.rxjava3.core.q.q(s0Var.r0(asu0.i()), v9n0.a().a0(asu0.i()).U(new kxa0(new mmm0(this, 2), 8))).a0(asu0Var.d()), new tmz(new l850(this, 18), 18), io.reactivex.rxjava3.internal.functions.a.c).subscribe(new ow40(new ape0(this, 14), 19));
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g = subscribe;
    }

    public final o820 g(ProfileNavigationInfo profileNavigationInfo) {
        int i;
        int i2;
        String str;
        dlj0 f = q7n0.a().e().f();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new p820.a(profileNavigationInfo));
        if (f.b.isEmpty()) {
            arrayList.add(new p820.c(1, 0, "faves"));
            arrayList.add(new p820.c(1, 1, "documents"));
            arrayList.add(new p820.c(2, 0, "vk_pay"));
            arrayList.add(new p820.c(3, 0, "settings"));
            i = 4;
        } else {
            i = 1;
            int i3 = 0;
            for (Object obj : f.b) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    e43.t();
                    throw null;
                }
                SideMenuItems sideMenuItems = (SideMenuItems) obj;
                ArrayList arrayList2 = new ArrayList(c5g.u(sideMenuItems, 10));
                Iterator<SideMenuItem> it = sideMenuItems.iterator();
                int i5 = 0;
                while (it.hasNext()) {
                    SideMenuItem next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        e43.t();
                        throw null;
                    }
                    arrayList2.add(new p820.b(i, i5, next));
                    i5 = i6;
                }
                if (!arrayList2.isEmpty()) {
                    i++;
                }
                g5g.y(arrayList2, arrayList);
                i3 = i4;
            }
        }
        if (this.d.a()) {
            int i7 = a.$EnumSwitchMapping$0[this.e.d(MultiAccountEntryPoint.SuperappMenu.d).ordinal()];
            if (i7 == 1) {
                str = "add_account";
            } else {
                if (i7 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "switch_account";
            }
            arrayList.add(new p820.c(i, 0, str));
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (q7n0.a().e().d("qr_scanner")) {
            arrayList.add(new p820.c(i, i2, "qr_scanner"));
        }
        p820 p820Var = (p820) j5g.k0(arrayList);
        if (p820Var == null || !epx.f(p820Var.c(), "expert_card")) {
            b(arrayList, i, 0);
        } else {
            b(arrayList, p820Var.e(), p820Var.d() + 1);
        }
        return new o820(arrayList);
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar = this.g;
        if (cVar != null) {
            cVar.dispose();
        }
        this.g = null;
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
