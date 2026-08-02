package com.yandex.go.tariffcard.modal;

import android.widget.FrameLayout;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import defpackage.cix0;
import defpackage.cma1;
import defpackage.cvw;
import defpackage.e230;
import defpackage.ejx0;
import defpackage.jhu0;
import defpackage.khx0;
import defpackage.oxv0;
import defpackage.qje;
import defpackage.s5w0;
import defpackage.t1w;
import defpackage.vdm;
import defpackage.w130;
import defpackage.xng0;
import defpackage.zjj0;
import defpackage.zy11;
import kotlin.Metadata;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.SlideableModalView;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001,B9\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001aH\u0014¢\u0006\u0004\b%\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010)R\u0014\u0010+\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u0019¨\u0006-"}, d2 = {"Lcom/yandex/go/tariffcard/modal/TariffOptionsCardModalView;", "Lru/yandex/taxi/widget/SlideableModalView;", "Lkhx0;", "navigator", "Lcom/yandex/go/tariffcard/ui/TariffOptionsCardView;", "tariffOptionsCardView", "Landroid/widget/FrameLayout;", "contentView", "", "initialState", "Lejx0;", "tariffOptionsShowRequirementsInteractor", "<init>", "(Lkhx0;Lcom/yandex/go/tariffcard/ui/TariffOptionsCardView;Landroid/widget/FrameLayout;ILejx0;)V", "Lzy11;", "initBackPressedCallback", "()V", "initBackground", "scheduleShowAnimation", "initBottomSheet", "onAttachedToWindow", "Le230;", "insetsType", "()Le230;", "getTopPadding", "()I", "", "canDragToExpandFromAnchored", "()Z", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Lzjj0;", "scrollParams", "showTariffRequirements", "(Lzjj0;)V", "hasCustomBackground", "Lkhx0;", "Lcom/yandex/go/tariffcard/ui/TariffOptionsCardView;", "Landroid/widget/FrameLayout;", "Lejx0;", "getCardContentViewLayoutRes", "cardContentViewLayoutRes", "fix0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffOptionsCardModalView extends SlideableModalView {
    private final FrameLayout contentView;
    private final khx0 navigator;
    private final TariffOptionsCardView tariffOptionsCardView;
    private final ejx0 tariffOptionsShowRequirementsInteractor;

    public TariffOptionsCardModalView(khx0 khx0Var, TariffOptionsCardView tariffOptionsCardView, FrameLayout frameLayout, int i, ejx0 ejx0Var) {
        super(frameLayout, Integer.valueOf(i));
        this.navigator = khx0Var;
        this.tariffOptionsCardView = tariffOptionsCardView;
        this.contentView = frameLayout;
        this.tariffOptionsShowRequirementsInteractor = ejx0Var;
    }

    private final void initBackPressedCallback() {
        setOnBackPressedListener(new cix0(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initBackPressedCallback$lambda$0(TariffOptionsCardModalView tariffOptionsCardModalView) {
        ((vdm) ((jhu0) tariffOptionsCardModalView.navigator).a).r(new oxv0(29));
    }

    private final void initBackground() {
        cvw.g0(qje.t(xng0.bgMain, getContext()), 0, getBottomSheet());
    }

    private final void initBottomSheet() {
        getBottomSheetBehavior().L(this.tariffOptionsCardView);
        getBottomSheet().getLayoutParams().height = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 insetsType$lambda$0(TariffOptionsCardModalView tariffOptionsCardModalView, t1w t1wVar) {
        TariffOptionsCardView tariffOptionsCardView = tariffOptionsCardModalView.tariffOptionsCardView;
        tariffOptionsCardView.setPadding(tariffOptionsCardView.getPaddingLeft(), tariffOptionsCardView.getPaddingTop(), tariffOptionsCardView.getPaddingRight(), t1wVar.g);
        return zy11.a;
    }

    private final void scheduleShowAnimation() {
        this.tariffOptionsCardView.setAlpha(0.0f);
        postDelayed(new cix0(this, 1), 300L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleShowAnimation$lambda$0(TariffOptionsCardModalView tariffOptionsCardModalView) {
        cma1.z0(tariffOptionsCardModalView.tariffOptionsCardView, null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        initBackground();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: canDragToExpandFromAnchored */
    public boolean getCanDragToExpandedState() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getCardContentViewLayoutRes() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: hasCustomBackground */
    public boolean getHasCustomBackgroundColor() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return new w130(2, new s5w0(11, this));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initBackPressedCallback();
        initBackground();
        initBottomSheet();
        this.tariffOptionsCardView.onGoingToExpand();
        this.contentView.addView(this.tariffOptionsCardView);
        scheduleShowAnimation();
    }

    public final void showTariffRequirements(zjj0 scrollParams) {
        this.tariffOptionsShowRequirementsInteractor.a(scrollParams, this.tariffOptionsCardView, getStatusBarHeight());
    }
}
