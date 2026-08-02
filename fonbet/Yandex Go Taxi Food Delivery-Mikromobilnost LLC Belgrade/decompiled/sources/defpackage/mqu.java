package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.foundation.lazy.layout.h;
import androidx.compose.foundation.pager.d;
import androidx.viewpager.widget.ViewPager;
import com.yandex.go.inapp_calls.dynamic.InAppCallsDynamicApiImpl;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardTariffSelectorContainerView;
import com.yandex.go.taxi.intercity.dashboard.impl.presentation.routing.e;
import com.yandex.go.user_profile.main_menu.profile.presentation.MainMenuUserProfileView;
import com.yandex.mapkit.indoor.IndoorLevel;
import com.yandex.mapkit.indoor.IndoorPlan;
import com.yandex.messaging.internal.view.chat.input.InputTextController;
import com.ybsdk.core.utils.ext.a;
import com.ybsdk.feature.kyc.internal.screens.photo.KycPhotoFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.order.view.HorizontalButtonsView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

/* loaded from: classes14.dex */
public final /* synthetic */ class mqu implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mqu(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sls
    public final Object invoke() {
        zy11 renderSourceState$lambda$0;
        zy11 subscribeForTextChanges$lambda$2;
        zy11 bindTariffUiState$lambda$0;
        View consumeSideEffect$lambda$20;
        Object obj;
        zy11 renderAvatarState$lambda$0$0;
        int i = 1;
        switch (this.a) {
            case 0:
                renderSourceState$lambda$0 = HorizontalButtonsView.renderSourceState$lambda$0((HorizontalButtonsView) this.b, (o7j) this.c);
                return renderSourceState$lambda$0;
            case 1:
                return ((m3v) this.b).a.a(new tv5((String) this.c, 1));
            case 2:
                return ((nac) this.b).b(new obv((String) this.c, null, 6, 0));
            case 3:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.b;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.c;
                if (!ref$BooleanRef.element) {
                    Drawable drawable = (Drawable) ref$ObjectRef.element;
                    if (drawable != null) {
                        a.i(drawable);
                    }
                    ref$BooleanRef.element = true;
                }
                return zy11.a;
            case 4:
                ygv ygvVar = (ygv) this.b;
                ViewPager viewPager = (ViewPager) this.c;
                ygvVar.w.clear();
                ygvVar.b(0.0f, viewPager.getCurrentItem());
                viewPager.addOnPageChangeListener(ygvVar);
                return Boolean.TRUE;
            case 5:
                InAppCallsDynamicApiImpl.n((pjv) this.b, (rl7) this.c);
                return zy11.a;
            case 6:
                qjv qjvVar = (qjv) this.b;
                rl7 rl7Var = (rl7) this.c;
                q501 q501Var = nl7.b;
                Context a = com.yandex.go.inapp_calls.dynamic.a.a(qjvVar.a);
                tzt tztVar = new tzt(12, qjvVar);
                if (!nl7.A) {
                    ny61.r("invoke CallsGoPlugin.init(...) before call function");
                    return null;
                }
                if (q501.z()) {
                    ny61.r("Flutter Engine with call already exist. Use `hasActiveCall` to check it and `expandCall` to expand active call");
                    return null;
                }
                xw80 xw80Var = rl7Var.h;
                if (xw80Var == null) {
                    ny61.g("You must to provide outgoingCallArgs");
                    return null;
                }
                nl7.z = tztVar;
                xw80Var.h = true;
                xw80Var.i = false;
                Configuration configuration = a.getResources().getConfiguration();
                boolean z = configuration.getLayoutDirection() == 1;
                r1 = (configuration.uiMode & 48) != 16;
                rl7Var.m = z;
                rl7Var.l = r1;
                q501.E(a, rl7Var);
                a.startActivity(q501.v(a));
                return zy11.a;
            case 7:
                IndoorPlan indoorPlan = (IndoorPlan) this.b;
                String str = (String) this.c;
                Pair pair = new Pair(DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onActivePlanFocused");
                List<IndoorLevel> levels = indoorPlan.getLevels();
                ArrayList arrayList = new ArrayList(tcc.n(levels, 10));
                for (IndoorLevel indoorLevel : levels) {
                    arrayList.add(b.i(new Pair("id", indoorLevel.getId()), new Pair("name", indoorLevel.getName()), new Pair("isUnderground", Boolean.valueOf(indoorLevel.getIsUnderground()))));
                }
                return b.i(pair, new Pair("levels", arrayList), new Pair("activeLevelId", indoorPlan.getActiveLevelId()), new Pair("refId", str));
            case 8:
                jxq0 jxq0Var = (jxq0) this.b;
                tls tlsVar = (tls) this.c;
                tlsVar.invoke(new tuv(jxq0Var.h));
                tlsVar.invoke(new ruv(jxq0Var.g));
                return zy11.a;
            case 9:
                subscribeForTextChanges$lambda$2 = InputTextController.subscribeForTextChanges$lambda$2((InputTextController) this.b, (TextWatcher) this.c);
                return subscribeForTextChanges$lambda$2;
            case 10:
                e eVar = (e) this.b;
                eVar.A(eVar.G, (o1n) this.c, new ovm(eVar, i));
                return zy11.a;
            case 11:
                e eVar2 = (e) this.b;
                eVar2.A(eVar2.K.a(new ofw(eVar2, r1 ? 1 : 0), eVar2.g0, new k6x(), new dir()), (vdw) this.c, sy60.Q2);
                return zy11.a;
            case 12:
                e eVar3 = (e) this.b;
                eVar3.A(eVar3.H, (vxm) this.c, sy60.Q2);
                return zy11.a;
            case 13:
                bindTariffUiState$lambda$0 = IntercityDashboardTariffSelectorContainerView.bindTariffUiState$lambda$0((IntercityDashboardTariffSelectorContainerView) this.b, (pkw) this.c);
                return bindTariffUiState$lambda$0;
            case 14:
                IntercityDashboardTariffSelectorContainerView.multipleTariffsAdapter$lambda$0((IntercityDashboardTariffSelectorContainerView) ((alw) this.b).R.b, (pkw) this.c);
                return zy11.a;
            case 15:
                t1t0 t1t0Var = (t1t0) this.b;
                hzk hzkVar = (hzk) this.c;
                if (t1t0Var != null && t1t0Var.equals(((just.adapter.snapping.b) hzkVar.a).d)) {
                    ((just.adapter.snapping.b) hzkVar.a).a();
                }
                return zy11.a;
            case 16:
                consumeSideEffect$lambda$20 = KycPhotoFragment.consumeSideEffect$lambda$20((KycPhotoFragment) this.b, (qas0) this.c);
                return consumeSideEffect$lambda$20;
            case 17:
                qxi qxiVar = (qxi) this.b;
                androidx.compose.foundation.lazy.grid.b bVar = (androidx.compose.foundation.lazy.grid.b) this.c;
                z3y z3yVar = (z3y) qxiVar.getValue();
                return new b4y(bVar, z3yVar, new h((d6w) bVar.d.e.getValue(), z3yVar));
            case 18:
                qxi qxiVar2 = (qxi) this.b;
                d dVar = (d) this.c;
                o890 o890Var = (o890) qxiVar2.getValue();
                return new p890(dVar, o890Var, new h((d6w) ((w5y) dVar.d.y).getValue(), o890Var));
            case 19:
                androidx.compose.foundation.lazy.b bVar2 = (androidx.compose.foundation.lazy.b) this.b;
                tls tlsVar2 = (tls) this.c;
                List list = bVar2.j().k;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (((Boolean) tlsVar2.invoke((n6y) list.get(i2))).booleanValue()) {
                        return Integer.valueOf(i2);
                    }
                }
                return null;
            case 20:
                return new e7y((l1m0) this.b, b.f(), (j1m0) this.c);
            case 21:
                ((ImageView) this.b).setImageDrawable(c.k(y3h0.ic_list_shortcut_default, ((com.yandex.go.shortcuts.impl.view.adapter.h) this.c).a));
                return zy11.a;
            case 22:
                ((tls) this.b).invoke(((wnb) this.c).b);
                return zy11.a;
            case 23:
                boj0 boj0Var = (boj0) this.b;
                ru.yandex.taxi.superapp.orders.ui.c cVar = new ru.yandex.taxi.superapp.orders.ui.c((Context) boj0Var.y, (ru.yandex.taxi.design.utils.a) this.c);
                cVar.e = new uhx(4, boj0Var);
                return cVar;
            case 24:
                yz8 yz8Var = (yz8) this.b;
                return new a09(((jtq0) this.c).d(), yz8Var.a, yz8Var.b);
            case 25:
                ((nnz) ((com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c) this.b).Dg()).j0((m58) this.c);
                return zy11.a;
            case 26:
                kxz kxzVar = (kxz) this.b;
                tls tlsVar3 = (tls) this.c;
                List list2 = kxzVar.b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (obj2 instanceof ixz) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ixz) obj).e) {
                        }
                    } else {
                        obj = null;
                    }
                }
                ixz ixzVar = (ixz) obj;
                tlsVar3.invoke(new xwz(ixzVar != null ? ixzVar.a : null));
                return zy11.a;
            case 27:
                ((rwz) ((com.yandex.go.loyalty.impl.selector.domain.d) this.b).k.get()).b((String) this.c);
                return zy11.a;
            case 28:
                ((u500) this.b).a((tis0) this.c);
                return zy11.a;
            default:
                renderAvatarState$lambda$0$0 = MainMenuUserProfileView.renderAvatarState$lambda$0$0((MainMenuUserProfileView) this.b, (r600) this.c);
                return renderAvatarState$lambda$0$0;
        }
    }
}
