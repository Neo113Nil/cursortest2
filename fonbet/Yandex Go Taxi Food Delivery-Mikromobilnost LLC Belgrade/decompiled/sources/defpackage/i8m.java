package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.appcompat.widget.ForwardingListener;
import androidx.biometric.FingerprintDialogFragment;
import androidx.core.view.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import androidx.heifwriter.d;
import androidx.preference.EditTextPreferenceDialogFragmentCompat;
import androidx.recyclerview.widget.FlexStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.yandex.go.navigator.driving.DrivingModalView;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersListModalView;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersModalView;
import com.yandex.go.navigator.gas_stations.overview.GasStationsOverviewView;
import com.yandex.go.navigator.main_screen.f;
import com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.WeakHashMap;
import kotlin.TypeCastException;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.map_common.map.o;
import ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$onAttach$1$visit$$inlined$suspendCallbackApi$2;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes14.dex */
public final class i8m implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ i8m(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01f7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int scrollViewMaxHeight;
        int scrollViewMaxHeight2;
        pz40 pz40Var;
        bys bysVar;
        int i2 = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                j8m j8mVar = (j8m) obj;
                View view = j8mVar.r;
                RecyclerView recyclerView = j8mVar.s;
                if (view == null || recyclerView == null) {
                    return;
                }
                if (view.getWidth() != 0 && view.getHeight() != 0) {
                    Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
                    recyclerView.offsetDescendantRectToMyCoords(view, rect);
                    rect.offset(0, (int) view.getTranslationY());
                    int intValue = ((Number) j8mVar.v.getValue()).intValue();
                    int i3 = intValue - rect.top;
                    int height = intValue - (recyclerView.getHeight() - rect.bottom);
                    if (i3 > 0) {
                        i = -j8mVar.r(i3, intValue);
                    } else if (height > 0) {
                        i = j8mVar.r(height, intValue);
                    }
                    if (i != 0) {
                        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                        recyclerView.scrollBy(0, i);
                        int computeVerticalScrollOffset2 = recyclerView.computeVerticalScrollOffset() - computeVerticalScrollOffset;
                        if (computeVerticalScrollOffset2 != 0) {
                            j8mVar.u += computeVerticalScrollOffset2;
                            j8mVar.d.invalidate();
                        }
                    }
                    WeakHashMap weakHashMap = b.a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                i = 0;
                if (i != 0) {
                }
                WeakHashMap weakHashMap2 = b.a;
                recyclerView.postOnAnimation(this);
                return;
            case 1:
                DrawableContainerCompat drawableContainerCompat = (DrawableContainerCompat) obj;
                drawableContainerCompat.animate(true);
                drawableContainerCompat.invalidateSelf();
                return;
            case 2:
                ((bwi) obj).cancel();
                return;
            case 3:
                ((Animator) obj).start();
                return;
            case 4:
                DrivingModalView drivingModalView = (DrivingModalView) obj;
                int height2 = DrivingModalView.access$getBinding(drivingModalView).k.getHeight();
                scrollViewMaxHeight = drivingModalView.getScrollViewMaxHeight();
                if (height2 > scrollViewMaxHeight) {
                    NestedScrollViewAdvanced nestedScrollViewAdvanced = DrivingModalView.access$getBinding(drivingModalView).l;
                    ViewGroup.LayoutParams layoutParams = nestedScrollViewAdvanced.getLayoutParams();
                    if (layoutParams == null) {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    scrollViewMaxHeight2 = drivingModalView.getScrollViewMaxHeight();
                    layoutParams.height = scrollViewMaxHeight2;
                    nestedScrollViewAdvanced.setLayoutParams(layoutParams);
                    drivingModalView.updateShadowVisibility();
                    return;
                }
                return;
            case 5:
                ((ngn) obj).a();
                return;
            case 6:
                ((EditTextPreferenceDialogFragmentCompat) obj).scheduleShowSoftInputInner();
                return;
            case 7:
                l lVar = (l) obj;
                ValueAnimator valueAnimator = lVar.S;
                int i4 = lVar.T;
                if (i4 == 1) {
                    valueAnimator.cancel();
                } else if (i4 != 2) {
                    return;
                }
                lVar.T = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 8:
                ((FingerprintDialogFragment) obj).resetDialog();
                return;
            case 9:
                ((FlexStaggeredGridLayoutManager) obj).z1();
                return;
            case 10:
                ((ForwardingListener) obj).onLongPress();
                return;
            case 11:
                ((Fragment) obj).callStartTransitionListener(false);
                return;
            case 12:
                g gVar = (g) obj;
                if (gVar.b.isEmpty()) {
                    return;
                }
                gVar.e();
                return;
            case 13:
                yds ydsVar = (yds) obj;
                ydsVar.A = false;
                ydsVar.h();
                return;
            case 14:
                ((euy) obj).cancel(true);
                return;
            case 15:
                ((GasStationsFiltersListModalView) obj).updateShadowVisibility();
                return;
            case 16:
                ((GasStationsFiltersModalView) obj).updateShadowVisibility();
                return;
            case 17:
                GasStationsOverviewView gasStationsOverviewView = (GasStationsOverviewView) obj;
                pz40Var = gasStationsOverviewView.isStationCardsDisplayedStateFlow;
                bysVar = gasStationsOverviewView.adapter;
                Boolean valueOf = Boolean.valueOf(bysVar.getItemCount() > 0);
                r0 r0Var = (r0) pz40Var;
                r0Var.getClass();
                r0Var.m(null, valueOf);
                return;
            case 18:
                r1s r1sVar = (r1s) obj;
                j6u j6uVar = (j6u) r1sVar.w;
                if (j6uVar.a.getAndSet(null) != null) {
                    ((Handler) r1sVar.b).removeCallbacks(j6uVar);
                    return;
                }
                return;
            case 19:
                try {
                    ((d) obj).a();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 20:
                k3s0 k3s0Var = (k3s0) ((lys) obj).R;
                int i5 = k3s0Var.c - 1;
                k3s0Var.c = i5;
                if (i5 <= 0) {
                    k3s0Var.a.g(zy11Var);
                    return;
                }
                return;
            case 21:
                adv advVar = (adv) obj;
                if (advVar.f) {
                    long uptimeMillis = advVar.b.uptimeMillis();
                    long j = (uptimeMillis - advVar.g) + advVar.e;
                    advVar.e = j;
                    long min = Math.min(j, advVar.d);
                    advVar.e = min;
                    if (min != advVar.d) {
                        advVar.g = uptimeMillis;
                        advVar.a.postOnAnimation(this);
                        return;
                    } else {
                        Runnable runnable = advVar.c;
                        if (runnable != null) {
                            runnable.run();
                            return;
                        }
                        return;
                    }
                }
                return;
            case 22:
                lry lryVar = (lry) obj;
                lryVar.b = null;
                lryVar.a = null;
                return;
            case 23:
                ((qyy) obj).a();
                return;
            case 24:
                ((o) ((c) obj).y).d();
                return;
            case 25:
                r0 r0Var2 = ((f) obj).e;
                Boolean bool = Boolean.TRUE;
                r0Var2.getClass();
                r0Var2.m(null, bool);
                return;
            case 26:
                ((MassTransitModeRouterImpl$onAttach$1$visit$$inlined$suspendCallbackApi$2) obj).invoke(zy11Var);
                return;
            case 27:
                ModalView modalView = (ModalView) obj;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) modalView.getLayoutParams();
                marginLayoutParams.topMargin = modalView.getTopOffset();
                modalView.setLayoutParams(marginLayoutParams);
                return;
            case 28:
                lcb1.d((MoneyInputEditView) obj);
                return;
            default:
                ((ru.yandex.taxi.masstransit.detailedroute.overlay.d) obj).I.c();
                return;
        }
    }
}
