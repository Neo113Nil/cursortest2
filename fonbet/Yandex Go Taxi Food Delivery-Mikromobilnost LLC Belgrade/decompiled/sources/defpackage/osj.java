package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.base.ui.views.MapButtonsView;
import com.yandex.go.places.impl.ui.main.DiscoveryMainModalView;
import com.yandex.go.places.models.ui.PlacesNativeScreenTabName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.a;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class osj implements tsj {
    public final /* synthetic */ DiscoveryMainModalView a;

    public osj(DiscoveryMainModalView discoveryMainModalView) {
        this.a = discoveryMainModalView;
    }

    @Override // defpackage.tsj
    public final void Kb(etj etjVar) {
        jsj jsjVar;
        t1w currentInsets;
        View inflate;
        int i;
        pav pavVar;
        String tabIconUrl;
        List list;
        boolean z = etjVar instanceof dtj;
        DiscoveryMainModalView discoveryMainModalView = this.a;
        if (!z) {
            if (!(etjVar instanceof ctj)) {
                w511.b();
                return;
            }
            jsjVar = discoveryMainModalView.flexModalViewContentContainer;
            jsjVar.a.setVisibility(0);
            DiscoveryMainModalView.access$getBinding(discoveryMainModalView).h.setVisibility(8);
            currentInsets = discoveryMainModalView.getCurrentInsets();
            discoveryMainModalView.setContainersBottomMargin(currentInsets.d);
            return;
        }
        DiscoveryMainModalView.access$getBinding(discoveryMainModalView).h.setVisibility(0);
        List list2 = ((dtj) etjVar).a;
        Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                int height = DiscoveryMainModalView.access$getBinding(discoveryMainModalView).h.getHeight();
                ViewGroup.LayoutParams layoutParams = DiscoveryMainModalView.access$getBinding(discoveryMainModalView).h.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (layoutParams instanceof ViewGroup.MarginLayoutParams ? layoutParams : null);
                discoveryMainModalView.setContainersBottomMargin(height + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
                return;
            }
            btj btjVar = (btj) it.next();
            inflate = LayoutInflater.from(discoveryMainModalView.getContext()).inflate(uuh0.organizations_discovery_tabbar_item, (ViewGroup) null, false);
            i = o6h0.badge;
            if (((RobotoTextView) cma1.O(i, inflate)) == null) {
                break;
            }
            i = o6h0.icon;
            GoImageView goImageView = (GoImageView) cma1.O(i, inflate);
            if (goImageView == null) {
                break;
            }
            i = o6h0.tab_title;
            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i, inflate);
            if (robotoTextView == null) {
                break;
            }
            GoConstraintLayout goConstraintLayout = (GoConstraintLayout) inflate;
            em80 em80Var = new em80(goConstraintLayout, goImageView, robotoTextView);
            GoLinearLayout goLinearLayout = DiscoveryMainModalView.access$getBinding(discoveryMainModalView).h;
            String str = btjVar.d;
            String str2 = btjVar.a;
            robotoTextView.setText(str);
            goConstraintLayout.setTag(str2);
            goConstraintLayout.setContentDescription(btjVar.d);
            goConstraintLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2, 1.0f));
            mia1.c(goConstraintLayout);
            c.z(new ymj(5, discoveryMainModalView, btjVar), goConstraintLayout);
            pavVar = discoveryMainModalView.imageLoader;
            lbm a = pavVar.a(goImageView);
            tabIconUrl = discoveryMainModalView.getTabIconUrl(btjVar, jl40.l(str2, ((btj) a.P(list2)).a));
            ((nac) a).c(tabIconUrl);
            goLinearLayout.addView(goConstraintLayout);
            list = discoveryMainModalView.tabViewBindings;
            list.add(em80Var);
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.e75
    public final void b(float f, boolean z) {
        MapButtonsView rightSideButtonsContainer;
        rightSideButtonsContainer = this.a.getRightSideButtonsContainer();
        rightSideButtonsContainer.updateCompassButton(z, f);
    }

    @Override // defpackage.e75
    public final void c(boolean z) {
        MapButtonsView rightSideButtonsContainer;
        rightSideButtonsContainer = this.a.getRightSideButtonsContainer();
        rightSideButtonsContainer.updateLocationFocusingButton(z);
    }

    @Override // defpackage.d75
    public final Lifecycle getLifecycle() {
        return this.a.getLifecycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tsj
    public final void i5() {
        View content;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AnchorBottomSheetBehavior bottomSheetBehavior;
        RecyclerView recyclerView3;
        DiscoveryMainModalView discoveryMainModalView = this.a;
        content = discoveryMainModalView.getContent();
        if (content instanceof RecyclerView) {
            WeakHashMap weakHashMap = b.a;
            if (ViewCompat$Api21Impl.j(content)) {
                recyclerView = (RecyclerView) content;
                discoveryMainModalView.nestedScrollingView = recyclerView;
                bottomSheetBehavior = discoveryMainModalView.getBottomSheetBehavior();
                recyclerView3 = discoveryMainModalView.nestedScrollingView;
                bottomSheetBehavior.L(recyclerView3);
            }
        }
        if (content instanceof ViewGroup) {
            ArrayList i = scc.i(content);
            while (!i.isEmpty()) {
                ViewGroup viewGroup = (ViewGroup) kp50.L(i);
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        recyclerView2 = null;
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt != null && (childAt instanceof RecyclerView)) {
                        WeakHashMap weakHashMap2 = b.a;
                        if (ViewCompat$Api21Impl.j(childAt)) {
                            recyclerView2 = (RecyclerView) childAt;
                            break;
                        }
                    }
                    if (childAt instanceof ViewGroup) {
                        i.add(childAt);
                    }
                    i2++;
                }
                if (recyclerView2 != null) {
                    recyclerView = recyclerView2;
                    break;
                }
            }
        }
        recyclerView = null;
        discoveryMainModalView.nestedScrollingView = recyclerView;
        bottomSheetBehavior = discoveryMainModalView.getBottomSheetBehavior();
        recyclerView3 = discoveryMainModalView.nestedScrollingView;
        bottomSheetBehavior.L(recyclerView3);
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        List list;
        pav pavVar;
        String tabIconUrl;
        itj itjVar = (itj) obj;
        boolean z = itjVar.c;
        String str = itjVar.b;
        DiscoveryMainModalView discoveryMainModalView = this.a;
        discoveryMainModalView.isMapTabOpened = z;
        discoveryMainModalView.shouldShowExpandedTopScrim = itjVar.d;
        discoveryMainModalView.hasRenderedUiState = true;
        discoveryMainModalView.setBottomSheetBackgroundColor();
        discoveryMainModalView.refreshExpandedTopScrim();
        int height = DiscoveryMainModalView.access$getBinding(discoveryMainModalView).h.getHeight();
        ViewGroup.LayoutParams layoutParams = DiscoveryMainModalView.access$getBinding(discoveryMainModalView).h.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i = 0;
        discoveryMainModalView.setContainersBottomMargin(height + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0));
        if (jl40.l(str, PlacesNativeScreenTabName.PUBLICATIONS.getId())) {
            return;
        }
        list = discoveryMainModalView.tabViewBindings;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            em80 em80Var = (em80) obj2;
            pavVar = discoveryMainModalView.imageLoader;
            lbm a = pavVar.a(em80Var.b);
            tabIconUrl = discoveryMainModalView.getTabIconUrl((btj) itjVar.e.get(i), jl40.l(em80Var.a.getTag(), str));
            ((nac) a).c(tabIconUrl);
            i = i2;
        }
    }
}
