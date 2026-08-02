package defpackage;

import android.content.SharedPreferences;
import android.media.ImageReader;
import androidx.core.view.OneShotPreDrawListener;
import androidx.customview.widget.a;
import com.google.android.material.search.SearchBar;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.lightside.slab.SlabController;
import com.yandex.go.flex.common.facade.routers.views.SlidableFlexView;
import com.yandex.go.places.impl.ui.search.SearchModalView;
import com.yandex.go.safety.center.share.notification.ShareNotificationView;
import com.yandex.go.shortcuts.impl.advertisement.ShortcutInfoModalView;
import com.yandex.go.shortcuts.impl.view.adapter.r;
import com.yandex.go.something_wrong_screen.ui.SomethingWrongOnboardingScreenModalView;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.main.h;
import com.yandex.go.taxi.order.search.ui.search.SearchViews;
import com.ybsdk.widgets.common.snackbar.Snackbar;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.favorites.rides.settings_modal.ui.SettingsModalView;
import ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView;
import ru.yandex.taxi.preorder.source.data.TaxiMainControlElementEvent;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.preorder.summary.requirements.sole.SoleRequirementModalView;
import ru.yandex.taxi.sdc.router.e;
import ru.yandex.taxi.share_favorites.view.ShareFavoritesModalView;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;
import ru.yandex.taxi.summary.solid.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class mmp0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mmp0(SlidableFlexView slidableFlexView, phr phrVar) {
        this.a = 23;
        this.b = slidableFlexView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                e eVar = (e) obj;
                pzt0 pzt0Var = eVar.p;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                eVar.b.d = true;
                n0 n0Var = eVar.k;
                zy11 zy11Var = zy11.a;
                n0Var.g(zy11Var);
                eVar.o.g(zy11Var);
                return;
            case 1:
                ((s) ((pmp0) obj).F).c();
                return;
            case 2:
                ((SearchBar) obj).lambda$startOnLoadAnimation$0();
                return;
            case 3:
                SearchModalView.showKeyboard$lambda$0((SearchModalView) obj);
                return;
            case 4:
                SearchViews.onAttachedToWindow$lambda$0((SearchViews) obj);
                return;
            case 5:
                r rVar = (r) obj;
                rVar.W.postInvalidateOnAnimation();
                ((k3s0) rVar.R).c++;
                OneShotPreDrawListener.add(rVar.W, new i8m(20, rVar));
                return;
            case 6:
                ((nfq0) obj).c();
                return;
            case 7:
                ((ImageReader) obj).close();
                return;
            case 8:
                b5r0 b5r0Var = (b5r0) obj;
                b5r0Var.e.invoke(b5r0Var.a);
                return;
            case 9:
                ((blz0) obj).a.e.invoke();
                return;
            case 10:
                ((SettingsModalView) obj).onBackPressed();
                return;
            case 11:
                ((ShareFavoritesModalView) obj).onBackPressed();
                return;
            case 12:
                ShareNotificationView._init_$lambda$0((ShareNotificationView) obj);
                return;
            case 13:
                ((dor0) obj).x.onDismiss();
                return;
            case 14:
                ((gor0) obj).c.x.onDismiss();
                return;
            case 15:
                ((qor0) obj).a();
                return;
            case 16:
                oo2 oo2Var = (oo2) obj;
                synchronized (((ArrayDeque) oo2Var.w)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) oo2Var.a).edit();
                    String str = (String) oo2Var.b;
                    StringBuilder sb = new StringBuilder();
                    Iterator it = ((ArrayDeque) oo2Var.w).iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append((String) oo2Var.c);
                    }
                    edit.putString(str, sb.toString()).commit();
                }
                return;
            case 17:
                ((ShortcutInfoModalView) obj).onBackPressed();
                return;
            case 18:
                ShortcutsMainScreen.onAttachedToWindow$lambda$0((ShortcutsMainScreen) obj);
                return;
            case 19:
                h hVar = (h) obj;
                ((q2s0) hVar.Dg()).F1();
                hVar.M.a.g(TaxiMainControlElementEvent.DISABLE);
                return;
            case 20:
                ShortcutsView._init_$resetShortcutSections((y3s0) obj);
                return;
            case 21:
                xe6 xe6Var = (xe6) obj;
                xe6Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) xe6Var.e;
                a aVar = sideSheetBehavior.B;
                if (aVar != null && aVar.h()) {
                    xe6Var.a(xe6Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.A == 2) {
                        sideSheetBehavior.v(xe6Var.b);
                        return;
                    }
                    return;
                }
            case 22:
                ((SlabController) obj).dispatchAttached();
                return;
            case 23:
                SlidableFlexView.attachFab$lambda$0((SlidableFlexView) obj, null);
                return;
            case 24:
                SlideableFlexModalView.invalidateVisibleBoundsRunnable$lambda$0((SlideableFlexModalView) obj);
                return;
            case 25:
                ((SliderButtonView) obj).slideToStart();
                return;
            case 26:
                Snackbar.animateDismiss$lambda$4((Snackbar) obj);
                return;
            case 27:
                SoleRequirementModalView._init_$lambda$0((SoleRequirementModalView) obj);
                return;
            case 28:
                ((d) obj).l = true;
                return;
            default:
                ((SomethingWrongOnboardingScreenModalView) obj).dismiss();
                return;
        }
    }

    public /* synthetic */ mmp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
