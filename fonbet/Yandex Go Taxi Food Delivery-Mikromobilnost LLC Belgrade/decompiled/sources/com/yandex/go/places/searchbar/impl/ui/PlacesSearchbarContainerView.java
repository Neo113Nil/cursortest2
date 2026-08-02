package com.yandex.go.places.searchbar.impl.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.places.searchbar.impl.ui.scroll_up.ScrollUpButtonView;
import com.yandex.go.places.searchbar.impl.ui.searchbar.PlacesSearchbarView;
import defpackage.dfc0;
import defpackage.gec0;
import defpackage.gfc0;
import defpackage.gug0;
import defpackage.i4b0;
import defpackage.kjp0;
import defpackage.mc;
import defpackage.oy80;
import defpackage.pav;
import defpackage.q6c0;
import defpackage.sls;
import defpackage.t1w;
import defpackage.tje;
import defpackage.v66;
import defpackage.xzr;
import defpackage.zec0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002,-BC\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yandex/go/places/searchbar/impl/ui/PlacesSearchbarContainerView;", "Lcom/yandex/go/design/view/GoFrameLayout;", "Landroid/content/Context;", "context", "Lcom/yandex/go/places/searchbar/impl/ui/scroll_up/ScrollUpButtonView;", "scrollUpButton", "Lzec0;", "searchbarViewFactory", "Lcom/yandex/go/places/searchbar/impl/presentation/a;", "presenter", "Lv66;", "contentBlurDelegate", "", "allowSearch", "<init>", "(Landroid/content/Context;Lcom/yandex/go/places/searchbar/impl/ui/scroll_up/ScrollUpButtonView;Lzec0;Lcom/yandex/go/places/searchbar/impl/presentation/a;Lv66;Z)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lcom/yandex/go/places/searchbar/impl/presentation/a;", "Lv66;", "Z", "", "bottomPadding", CA20Status.STATUS_USER_I, "blurTopOffset", "Ldfc0;", "searchbarViewDimens", "Ldfc0;", "Lcom/yandex/go/places/searchbar/impl/ui/searchbar/PlacesSearchbarView;", "searchbarView", "Lcom/yandex/go/places/searchbar/impl/ui/searchbar/PlacesSearchbarView;", "Lgec0;", "animator", "Lgec0;", "com/yandex/go/places/searchbar/impl/ui/b", "kec0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesSearchbarContainerView extends GoFrameLayout {
    private final boolean allowSearch;
    private final gec0 animator;
    private final int blurTopOffset;
    private final int bottomPadding;
    private final v66 contentBlurDelegate;
    private final com.yandex.go.places.searchbar.impl.presentation.a presenter;
    private final PlacesSearchbarView searchbarView;
    private final dfc0 searchbarViewDimens;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarContainerView$3, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((com.yandex.go.places.searchbar.impl.presentation.a) this.receiver).B.b();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarContainerView$5, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((com.yandex.go.places.searchbar.impl.presentation.a) this.receiver).getClass();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarContainerView$6, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            ((com.yandex.go.places.searchbar.impl.presentation.a) this.receiver).getClass();
            return zy11.a;
        }
    }

    public PlacesSearchbarContainerView(Context context, ScrollUpButtonView scrollUpButtonView, zec0 zec0Var, com.yandex.go.places.searchbar.impl.presentation.a aVar, v66 v66Var, boolean z) {
        super(context, null, 0, 0, 14, null);
        this.presenter = aVar;
        this.contentBlurDelegate = v66Var;
        this.allowSearch = z;
        this.bottomPadding = tje.r(gug0.places_searchbar_margin_bottom, getContext());
        this.blurTopOffset = tje.r(gug0.places_searchbar_blur_top_offset, getContext());
        dfc0 dfc0Var = new dfc0(this, z);
        this.searchbarViewDimens = dfc0Var;
        PlacesSearchbarContainerView$searchbarView$1 placesSearchbarContainerView$searchbarView$1 = new PlacesSearchbarContainerView$searchbarView$1(1, aVar, com.yandex.go.places.searchbar.impl.presentation.a.class, "handleAction", "handleAction(Lcom/yandex/go/places/models/domain/entities/Action;)V", 0);
        mc mcVar = ((gfc0) zec0Var).a;
        PlacesSearchbarView placesSearchbarView = new PlacesSearchbarView((Context) mcVar.a.get(), (pav) mcVar.b.get(), dfc0Var, placesSearchbarContainerView$searchbarView$1);
        this.searchbarView = placesSearchbarView;
        setClipToPadding(false);
        setClipChildren(false);
        tje.i(this, 80, new i4b0(24, this));
        placesSearchbarView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 8388691;
        addView(placesSearchbarView, layoutParams);
        setTouchDelegate(placesSearchbarView.getContainerTouchDelegate());
        int r = tje.r(gug0.places_searchbar_size_collapsed, getContext());
        c.z(new AnonymousClass3(0, aVar, com.yandex.go.places.searchbar.impl.presentation.a.class, "scrollUp", "scrollUp()V", 0), scrollUpButtonView);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(r, r);
        layoutParams2.gravity = 8388693;
        layoutParams2.setMarginEnd(-r);
        addView(scrollUpButtonView, layoutParams2);
        this.animator = new gec0(context, new oy80(16, placesSearchbarView.getContainerTouchDelegate(), v66Var), new q6c0(placesSearchbarView, dfc0Var), new kjp0(scrollUpButtonView), new AnonymousClass5(0, aVar, com.yandex.go.places.searchbar.impl.presentation.a.class, "onSearchbarExpanded", "onSearchbarExpanded()V", 0), new AnonymousClass6(0, aVar, com.yandex.go.places.searchbar.impl.presentation.a.class, "onSearchbarCollapsed", "onSearchbarCollapsed()V", 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(PlacesSearchbarContainerView placesSearchbarContainerView, t1w t1wVar) {
        int i = placesSearchbarContainerView.bottomPadding + t1wVar.d;
        placesSearchbarContainerView.setPadding(placesSearchbarContainerView.getPaddingLeft(), placesSearchbarContainerView.getPaddingTop(), placesSearchbarContainerView.getPaddingRight(), i);
        v66 v66Var = placesSearchbarContainerView.contentBlurDelegate;
        if (v66Var == null) {
            return false;
        }
        v66Var.d(new xzr(placesSearchbarContainerView, i, 3), null);
        return false;
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        v66 v66Var = this.contentBlurDelegate;
        if (v66Var != null) {
            v66Var.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        q6c0 q6c0Var = this.animator.h;
        if (q6c0Var == null || !((ValueAnimator) q6c0Var.w).isRunning()) {
            return super.dispatchTouchEvent(ev);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.presenter.Kg(new b(this));
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
