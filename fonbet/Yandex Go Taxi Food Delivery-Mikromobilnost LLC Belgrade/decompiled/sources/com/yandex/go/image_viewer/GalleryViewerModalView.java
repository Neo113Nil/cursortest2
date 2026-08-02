package com.yandex.go.image_viewer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.go.image_viewer.GalleryViewerModalView;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.cma1;
import defpackage.ct31;
import defpackage.ej1;
import defpackage.fam;
import defpackage.fss;
import defpackage.gam;
import defpackage.i3y;
import defpackage.iss;
import defpackage.jss;
import defpackage.kps0;
import defpackage.lss;
import defpackage.m810;
import defpackage.mqg0;
import defpackage.mum;
import defpackage.nss;
import defpackage.nth0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.qih0;
import defpackage.sls;
import defpackage.tje;
import defpackage.v130;
import defpackage.vsq;
import defpackage.yrs;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.StoryProgressComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u001c\u0010\u0017J\u001f\u0010!\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020#H\u0014¢\u0006\u0004\b*\u0010%J\u000f\u0010+\u001a\u00020#H\u0014¢\u0006\u0004\b+\u0010%J\u000f\u0010,\u001a\u00020#H\u0014¢\u0006\u0004\b,\u0010%J\u000f\u0010-\u001a\u00020#H\u0014¢\u0006\u0004\b-\u0010%R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00101R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u000f8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0017¨\u0006F"}, d2 = {"Lcom/yandex/go/image_viewer/GalleryViewerModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Ljss;", "Landroid/content/Context;", "context", "Lnss;", "payload", "Llss;", "navigator", "Lfss;", "galleryViewerAnalyticsProxy", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lnss;Llss;Lfss;Lpav;)V", "", "dp", "dpAsPx", "(I)I", "Lv130;", "insetsType", "()Lv130;", "getTopPadding", "()I", "", "isArrowsPermanentlyHidden", "()Z", "isApplyShadow", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Ljss;", "Lzy11;", "onAttachedToWindow", "()V", "Landroid/view/MotionEvent;", "ev", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "onTouchOutside", "onSlideOut", "onBackPressed", "Lnss;", "Llss;", "Lfss;", "Lpav;", "currentImageIndex", CA20Status.STATUS_USER_I, "wasManuallyScrolled", "Z", "Lct31;", "pageChangeCallback", "Lct31;", "Lgam;", "draggableHeaderBehaviour$delegate", "Li3y;", "getDraggableHeaderBehaviour", "()Lgam;", "draggableHeaderBehaviour", "Lyrs;", "sliderAdapter$delegate", "getSliderAdapter", "()Lyrs;", "sliderAdapter", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GalleryViewerModalView extends SlideableBindingModalView<jss> {
    private int currentImageIndex;

    /* renamed from: draggableHeaderBehaviour$delegate, reason: from kotlin metadata */
    private final i3y draggableHeaderBehaviour;
    private final fss galleryViewerAnalyticsProxy;
    private final pav imageLoader;
    private final lss navigator;
    private final ct31 pageChangeCallback;
    private final nss payload;

    /* renamed from: sliderAdapter$delegate, reason: from kotlin metadata */
    private final i3y sliderAdapter;
    private boolean wasManuallyScrolled;

    public GalleryViewerModalView(Context context, nss nssVar, lss lssVar, fss fssVar, pav pavVar) {
        super(context);
        this.payload = nssVar;
        this.navigator = lssVar;
        this.galleryViewerAnalyticsProxy = fssVar;
        this.imageLoader = pavVar;
        this.currentImageIndex = nssVar.b;
        sls slsVar = new sls(this) { // from class: hss
            public final /* synthetic */ GalleryViewerModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                gam draggableHeaderBehaviour_delegate$lambda$0;
                yrs sliderAdapter_delegate$lambda$0;
                zy11 lambda$0$0;
                int i = r2;
                GalleryViewerModalView galleryViewerModalView = this.b;
                switch (i) {
                    case 0:
                        draggableHeaderBehaviour_delegate$lambda$0 = GalleryViewerModalView.draggableHeaderBehaviour_delegate$lambda$0(galleryViewerModalView);
                        return draggableHeaderBehaviour_delegate$lambda$0;
                    case 1:
                        sliderAdapter_delegate$lambda$0 = GalleryViewerModalView.sliderAdapter_delegate$lambda$0(galleryViewerModalView);
                        return sliderAdapter_delegate$lambda$0;
                    default:
                        lambda$0$0 = GalleryViewerModalView.lambda$0$0(galleryViewerModalView);
                        return lambda$0$0;
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.draggableHeaderBehaviour = a.b(lazyThreadSafetyMode, slsVar);
        final int i = 1;
        this.sliderAdapter = a.b(lazyThreadSafetyMode, new sls(this) { // from class: hss
            public final /* synthetic */ GalleryViewerModalView b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                gam draggableHeaderBehaviour_delegate$lambda$0;
                yrs sliderAdapter_delegate$lambda$0;
                zy11 lambda$0$0;
                int i2 = i;
                GalleryViewerModalView galleryViewerModalView = this.b;
                switch (i2) {
                    case 0:
                        draggableHeaderBehaviour_delegate$lambda$0 = GalleryViewerModalView.draggableHeaderBehaviour_delegate$lambda$0(galleryViewerModalView);
                        return draggableHeaderBehaviour_delegate$lambda$0;
                    case 1:
                        sliderAdapter_delegate$lambda$0 = GalleryViewerModalView.sliderAdapter_delegate$lambda$0(galleryViewerModalView);
                        return sliderAdapter_delegate$lambda$0;
                    default:
                        lambda$0$0 = GalleryViewerModalView.lambda$0$0(galleryViewerModalView);
                        return lambda$0$0;
                }
            }
        });
        jss binding = getBinding();
        AppCompatImageView appCompatImageView = binding.b;
        boolean z = nssVar.c;
        appCompatImageView.setVisibility(z ? 0 : 8);
        if (z) {
            final int i2 = 2;
            c.z(new sls(this) { // from class: hss
                public final /* synthetic */ GalleryViewerModalView b;

                {
                    this.b = this;
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    gam draggableHeaderBehaviour_delegate$lambda$0;
                    yrs sliderAdapter_delegate$lambda$0;
                    zy11 lambda$0$0;
                    int i22 = i2;
                    GalleryViewerModalView galleryViewerModalView = this.b;
                    switch (i22) {
                        case 0:
                            draggableHeaderBehaviour_delegate$lambda$0 = GalleryViewerModalView.draggableHeaderBehaviour_delegate$lambda$0(galleryViewerModalView);
                            return draggableHeaderBehaviour_delegate$lambda$0;
                        case 1:
                            sliderAdapter_delegate$lambda$0 = GalleryViewerModalView.sliderAdapter_delegate$lambda$0(galleryViewerModalView);
                            return sliderAdapter_delegate$lambda$0;
                        default:
                            lambda$0$0 = GalleryViewerModalView.lambda$0$0(galleryViewerModalView);
                            return lambda$0$0;
                    }
                }
            }, binding.b);
        }
        StoryProgressComponent storyProgressComponent = binding.d;
        ViewGroup.LayoutParams layoutParams = storyProgressComponent.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            throw null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, tje.t(context).heightPixels - dpAsPx(48), ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        storyProgressComponent.setLayoutParams(layoutParams2);
        iss issVar = new iss(this, binding);
        this.pageChangeCallback = issVar;
        ScalingContentViewPager scalingContentViewPager = binding.e;
        scalingContentViewPager.setAdapter(getSliderAdapter());
        scalingContentViewPager.addOnPageChangeListener(issVar);
        c.z(new GalleryViewerModalView$1$5(0, this, GalleryViewerModalView.class, "onBackPressed", "onBackPressed()V", 0), binding.c);
    }

    private final int dpAsPx(int dp) {
        return m810.b(dp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gam draggableHeaderBehaviour_delegate$lambda$0(GalleryViewerModalView galleryViewerModalView) {
        return new gam(galleryViewerModalView.dpAsPx(56));
    }

    private final gam getDraggableHeaderBehaviour() {
        return (gam) this.draggableHeaderBehaviour.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yrs getSliderAdapter() {
        return (yrs) this.sliderAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 lambda$0$0(GalleryViewerModalView galleryViewerModalView) {
        String str;
        kps0 kps0Var = (kps0) kotlin.collections.a.S(galleryViewerModalView.currentImageIndex, galleryViewerModalView.payload.a);
        if (kps0Var != null && (str = kps0Var.c) != null) {
            galleryViewerModalView.payload.d.invoke(str);
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yrs sliderAdapter_delegate$lambda$0(GalleryViewerModalView galleryViewerModalView) {
        return new yrs(galleryViewerModalView.getBinding().e, galleryViewerModalView.imageLoader);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.black;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public jss bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(nth0.gallery_viewer_modal_view, getCardContentContainer(), false);
        int i = qih0.complaint_button;
        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i, inflate);
        if (appCompatImageView != null) {
            i = qih0.content_close_button;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i, inflate);
            if (appCompatImageView2 != null) {
                i = qih0.image_progress_component;
                StoryProgressComponent storyProgressComponent = (StoryProgressComponent) cma1.O(i, inflate);
                if (storyProgressComponent != null) {
                    i = qih0.image_slider;
                    ScalingContentViewPager scalingContentViewPager = (ScalingContentViewPager) cma1.O(i, inflate);
                    if (scalingContentViewPager != null) {
                        return new jss((ScalingContentFrameLayout) inflate, appCompatImageView, appCompatImageView2, storyProgressComponent, scalingContentViewPager);
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCardCornerRadius() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public v130 insetsType() {
        return new v130(3);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isArrowsPermanentlyHidden */
    public boolean getWithCloseButton() {
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        jss binding = getBinding();
        StoryProgressComponent storyProgressComponent = binding.d;
        storyProgressComponent.setVisibility(this.payload.a.size() > 1 ? 0 : 8);
        storyProgressComponent.setMediaCount(this.payload.a.size());
        yrs sliderAdapter = getSliderAdapter();
        List list = this.payload.a;
        ArrayList arrayList = sliderAdapter.f;
        arrayList.clear();
        arrayList.addAll(list);
        sliderAdapter.f();
        getSliderAdapter().c.setCurrentItem(this.currentImageIndex, false);
        if (!this.payload.a.isEmpty()) {
            binding.d.setCurrentMedia(this.currentImageIndex + 1).invalidateComponent();
        }
        gam draggableHeaderBehaviour = getDraggableHeaderBehaviour();
        View cardContentView = getCardContentView();
        ViewGroup bottomSheet = getBottomSheet();
        AnchorBottomSheetBehavior<View> bottomSheetBehavior = getBottomSheetBehavior();
        draggableHeaderBehaviour.getClass();
        bottomSheetBehavior.q0 = new fam(c.o(cardContentView), bottomSheet, new int[2], draggableHeaderBehaviour, bottomSheetBehavior, 0);
        bottomSheetBehavior.M = null;
        bottomSheetBehavior.J(true);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        this.galleryViewerAnalyticsProxy.v(this.currentImageIndex + 1);
        lss lssVar = this.navigator;
        kps0 kps0Var = (kps0) kotlin.collections.a.S(this.currentImageIndex, this.payload.a);
        ((ej1) ((mum) lssVar).a).r(new vsq(kps0Var != null ? kps0Var.a : null, 6));
        super.onBackPressed();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ScalingContentViewPager scalingContentViewPager = getBinding().e;
        scalingContentViewPager.clearOnPageChangeListeners();
        scalingContentViewPager.setAdapter(null);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        gam draggableHeaderBehaviour = getDraggableHeaderBehaviour();
        draggableHeaderBehaviour.getClass();
        if (ev.getAction() == 0) {
            draggableHeaderBehaviour.b = (int) ev.getY();
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public void onSlideOut() {
        this.galleryViewerAnalyticsProxy.v(this.currentImageIndex + 1);
        lss lssVar = this.navigator;
        kps0 kps0Var = (kps0) kotlin.collections.a.S(this.currentImageIndex, this.payload.a);
        ((ej1) ((mum) lssVar).a).r(new vsq(kps0Var != null ? kps0Var.a : null, 6));
        super.onSlideOut();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onTouchOutside() {
        this.galleryViewerAnalyticsProxy.v(this.currentImageIndex + 1);
        lss lssVar = this.navigator;
        kps0 kps0Var = (kps0) kotlin.collections.a.S(this.currentImageIndex, this.payload.a);
        ((ej1) ((mum) lssVar).a).r(new vsq(kps0Var != null ? kps0Var.a : null, 6));
        super.onTouchOutside();
    }
}
