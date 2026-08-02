package xsna;

import android.view.View;
import android.widget.ScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.common.collect.ImmutableList;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import com.vk.dto.common.data.VKList;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.newsfeed.posting.donut_teaser.domain.interactor.TextValidationState;
import java.util.List;
import kotlin.Pair;
import xsna.ajz0;
import xsna.l5v0;
import xsna.xoy0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class x310 implements io.reactivex.rxjava3.functions.l, ModalBottomSheetBehavior.e, Tooltip.c, io.reactivex.rxjava3.functions.m, m6o, j7j, io.reactivex.rxjava3.functions.c, ajz0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x310(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.ajz0.a
    public void a(wfy0 wfy0Var, int i, dhz0 dhz0Var, View view) {
        xoy0.b bVar = (xoy0.b) this.c;
        if (bVar != null) {
            ((pbz0) bVar).g(wfy0Var, i, dhz0Var, view);
        }
    }

    @Override // xsna.j7j
    public void accept(Object obj) {
        ((ImmutableList.a) this.c).c((wkk) obj);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 17:
                return (Boolean) ((cf3) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((cf3) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.m6o
    public double b(double d) {
        pjp0 pjp0Var = (pjp0) this.c;
        double d2 = pjp0Var.b;
        double d3 = pjp0Var.c;
        double d4 = pjp0Var.d;
        return d >= pjp0Var.e * d4 ? (Math.pow(d - pjp0Var.f, 1.0d / pjp0Var.a) - d3) / d2 : (d - pjp0Var.g) / d4;
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        ((wmd0) this.c).invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0051 A[ADDED_TO_REGION] */
    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(float f, int i) {
        boolean z;
        ScrollView scrollView;
        boolean z2;
        pr20 pr20Var = (pr20) this.c;
        RecyclerView recyclerView = pr20Var.n;
        if (recyclerView == null) {
            recyclerView = null;
        }
        FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = pr20Var.n;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        if (f4m.h(recyclerView2)) {
            View y = flexboxLayoutManager.y(0, flexboxLayoutManager.getChildCount(), true);
            if ((y == null ? -1 : flexboxLayoutManager.getPosition(y)) == 0) {
                z = true;
                scrollView = pr20Var.l;
                if (scrollView == null) {
                    scrollView = null;
                }
                if (f4m.h(scrollView)) {
                    ScrollView scrollView2 = pr20Var.l;
                    if ((scrollView2 != null ? scrollView2 : null).getScrollY() == 0) {
                        z2 = true;
                        return f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (z || z2);
                    }
                }
                z2 = false;
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
            }
        }
        z = false;
        scrollView = pr20Var.l;
        if (scrollView == null) {
        }
        if (f4m.h(scrollView)) {
        }
        z2 = false;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 3:
                return ((Boolean) ((oey) this.c).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((ij8) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((hxm0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (p410) ((op3) this.c).invoke(obj);
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
            case 10:
            case 17:
            case 20:
            default:
                return (WebApiApplication) ((bi6) this.c).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.t) ((ij8) this.c).invoke(obj);
            case 5:
                return (List) ((eqq) this.c).invoke(obj);
            case 8:
                return (io.reactivex.rxjava3.core.b0) ((tvi0) this.c).invoke(obj);
            case 9:
                return (io.reactivex.rxjava3.core.o) ((b4u) this.c).invoke(obj);
            case 11:
                return (String) ((hxm0) this.c).invoke(obj);
            case 12:
                return (Dialog) ((alj0) this.c).invoke(obj);
            case 13:
                return (TextValidationState) ((hxm0) this.c).invoke(obj);
            case 14:
                return (wvo0) ((alj0) this.c).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.b0) ((alj0) this.c).invoke(obj);
            case 16:
                return (UsersDiscoverPresenter.a) ((hxm0) this.c).invoke(obj);
            case 18:
                return (VKList) ((lzl0) this.c).invoke(obj);
            case 19:
                return (Pair) ((hxm0) this.c).invoke(obj);
            case 21:
                return (l5v0.a.c) ((hxm0) this.c).invoke(obj);
            case 22:
                return (io.reactivex.rxjava3.core.t) ((gqq0) this.c).invoke(obj);
            case 23:
                return (it80) ((hxm0) this.c).invoke(obj);
        }
    }
}
