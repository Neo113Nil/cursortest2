package com.yandex.go.places.impl.ui.main.map.filters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.places.common.ui.ControlButtonView;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.VisibleRegion;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.b01;
import defpackage.cma1;
import defpackage.dib1;
import defpackage.dug0;
import defpackage.e6c0;
import defpackage.g0c;
import defpackage.gh00;
import defpackage.h030;
import defpackage.hr7;
import defpackage.i3y;
import defpackage.i4b0;
import defpackage.ibc0;
import defpackage.iru;
import defpackage.lki;
import defpackage.m2y;
import defpackage.mi00;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.n3v;
import defpackage.n5c0;
import defpackage.ni00;
import defpackage.ny61;
import defpackage.o6h0;
import defpackage.pav;
import defpackage.qd00;
import defpackage.qoi0;
import defpackage.rbc0;
import defpackage.t9b0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uuh0;
import defpackage.y130;
import defpackage.zxs;
import defpackage.zy11;
import java.util.Collections;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001cB=\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020#H\u0014¢\u0006\u0004\b)\u0010%J\u000f\u0010*\u001a\u00020\u0018H\u0014¢\u0006\u0004\b*\u0010\u001aJ\u0017\u0010-\u001a\u00020\u00182\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u001b2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020\u001b2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u000203H\u0014¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u001b2\u0006\u00108\u001a\u0002032\u0006\u00109\u001a\u000203H\u0014¢\u0006\u0004\b:\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010?R\u0016\u0010@\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010J\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010%R\u001b\u0010M\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010D\u001a\u0004\bL\u0010%R\u001b\u0010P\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010D\u001a\u0004\bO\u0010%R\u001b\u0010S\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010D\u001a\u0004\bR\u0010%R\u001b\u0010V\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010D\u001a\u0004\bU\u0010%R\u001b\u0010Y\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010D\u001a\u0004\bX\u0010%R\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020#8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\ba\u0010%¨\u0006d"}, d2 = {"Lcom/yandex/go/places/impl/ui/main/map/filters/PlacesCategoryFiltersModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Le6c0;", "Ln3v;", "Landroid/content/Context;", "context", "Lcom/yandex/go/places/impl/ui/main/map/filters/f;", "presenter", "Lpav;", "imageLoader", "La3v;", "focusCoordinator", "Lah00;", "mapController", "Ltt2;", "appDispatchers", "<init>", "(Landroid/content/Context;Lcom/yandex/go/places/impl/ui/main/map/filters/f;Lpav;La3v;Lah00;Ltt2;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Le6c0;", "", "isReadyForDelayedGone", "()Z", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "getTopPadding", "()I", "Ly130;", "insetsType", "()Ly130;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "isApplyShadow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lh030;", "listener", "setAccessibilityListener", "(Lh030;)V", "Ljava/lang/Runnable;", "onAnimateShowStartAction", "onAnimateShowEndAction", "animateShow", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "startAction", "endAction", "animateDismiss", "Lcom/yandex/go/places/impl/ui/main/map/filters/f;", "Lpav;", "La3v;", "Lah00;", "Ltt2;", "hasRenderedCategoryFilters", "Z", "Lrbc0;", "mapCategoryFiltersAdapter$delegate", "Li3y;", "getMapCategoryFiltersAdapter", "()Lrbc0;", "mapCategoryFiltersAdapter", "bookingImageSize$delegate", "getBookingImageSize", "bookingImageSize", "bookingImageOverlapMargin$delegate", "getBookingImageOverlapMargin", "bookingImageOverlapMargin", "middleMargin$delegate", "getMiddleMargin", "middleMargin", "topMargin$delegate", "getTopMargin", "topMargin", "bottomMargin$delegate", "getBottomMargin", "bottomMargin", "categoriesMargin$delegate", "getCategoriesMargin", "categoriesMargin", "Lhr7;", "mapListener", "Lhr7;", "Landroid/view/View;", "getDelayedGoneLayoutReadyView", "()Landroid/view/View;", "delayedGoneLayoutReadyView", "getCornerRadius", UrbanAdsBottomSheetFragment.CORNER_RADIUS, "com/yandex/go/places/impl/ui/main/map/filters/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlacesCategoryFiltersModalView extends SlideableBindingModalView<e6c0> implements n3v {
    public static final int $stable = 8;
    private final tt2 appDispatchers;

    /* renamed from: bookingImageOverlapMargin$delegate, reason: from kotlin metadata */
    private final i3y bookingImageOverlapMargin;

    /* renamed from: bookingImageSize$delegate, reason: from kotlin metadata */
    private final i3y bookingImageSize;

    /* renamed from: bottomMargin$delegate, reason: from kotlin metadata */
    private final i3y bottomMargin;

    /* renamed from: categoriesMargin$delegate, reason: from kotlin metadata */
    private final i3y categoriesMargin;
    private final a3v focusCoordinator;
    private boolean hasRenderedCategoryFilters;
    private final pav imageLoader;

    /* renamed from: mapCategoryFiltersAdapter$delegate, reason: from kotlin metadata */
    private final i3y mapCategoryFiltersAdapter;
    private final ah00 mapController;
    private final hr7 mapListener;

    /* renamed from: middleMargin$delegate, reason: from kotlin metadata */
    private final i3y middleMargin;
    private final f presenter;

    /* renamed from: topMargin$delegate, reason: from kotlin metadata */
    private final i3y topMargin;

    public PlacesCategoryFiltersModalView(Context context, f fVar, pav pavVar, a3v a3vVar, ah00 ah00Var, tt2 tt2Var) {
        super(context);
        this.presenter = fVar;
        this.imageLoader = pavVar;
        this.focusCoordinator = a3vVar;
        this.mapController = ah00Var;
        this.appDispatchers = tt2Var;
        int i = 15;
        t9b0 t9b0Var = new t9b0(i, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.mapCategoryFiltersAdapter = kotlin.a.b(lazyThreadSafetyMode, t9b0Var);
        this.bookingImageSize = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, i));
        this.bookingImageOverlapMargin = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, 16));
        this.middleMargin = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, 17));
        this.topMargin = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, 18));
        this.bottomMargin = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, 19));
        this.categoriesMargin = kotlin.a.b(lazyThreadSafetyMode, new qd00(context, 20));
        this.mapListener = new b01(25, this);
        setCardMode(SlideableModalView.CardMode.FULLSCREEN);
        getBottomSheet().setBackgroundColor(getContext().getColor(mqg0.transparent));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int bookingImageOverlapMargin_delegate$lambda$0(Context context) {
        return tje.r(dug0.discovery_booking_item_icons_overlap_margin, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int bookingImageSize_delegate$lambda$0(Context context) {
        return tje.r(dug0.discovery_booking_item_icon_size, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int bottomMargin_delegate$lambda$0(Context context) {
        return tje.r(dug0.discovery_organizations_map_focus_rect_bottom_margin, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int categoriesMargin_delegate$lambda$0(Context context) {
        return tje.r(dug0.discovery_organizations_header_filter_chips_insets, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBookingImageOverlapMargin() {
        return ((Number) this.bookingImageOverlapMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBookingImageSize() {
        return ((Number) this.bookingImageSize.getValue()).intValue();
    }

    private final int getBottomMargin() {
        return ((Number) this.bottomMargin.getValue()).intValue();
    }

    private final int getCategoriesMargin() {
        return ((Number) this.categoriesMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final rbc0 getMapCategoryFiltersAdapter() {
        return (rbc0) this.mapCategoryFiltersAdapter.getValue();
    }

    private final int getMiddleMargin() {
        return ((Number) this.middleMargin.getValue()).intValue();
    }

    private final int getTopMargin() {
        return ((Number) this.topMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rbc0 mapCategoryFiltersAdapter_delegate$lambda$0(PlacesCategoryFiltersModalView placesCategoryFiltersModalView) {
        pav pavVar = placesCategoryFiltersModalView.imageLoader;
        PlacesCategoryFiltersModalView$mapCategoryFiltersAdapter$2$1 placesCategoryFiltersModalView$mapCategoryFiltersAdapter$2$1 = new PlacesCategoryFiltersModalView$mapCategoryFiltersAdapter$2$1(1, placesCategoryFiltersModalView.presenter, f.class, "onFilterClicked", "onFilterClicked(Lcom/yandex/go/places/models/domain/entities/PlacesMapScreenCategoryFilter;)V", 0);
        lki lkiVar = new lki(6);
        int i = ni00.a0;
        g0c a = qoi0.a(ibc0.class);
        return new rbc0(lkiVar, Collections.singletonList(new zxs(a.a(), 0, null, EmptyList.a, null, new mi00(pavVar, placesCategoryFiltersModalView$mapCategoryFiltersAdapter$2$1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mapListener$lambda$0(PlacesCategoryFiltersModalView placesCategoryFiltersModalView, CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        f fVar = placesCategoryFiltersModalView.presenter;
        VisibleRegion a = ((gh00) placesCategoryFiltersModalView.mapController).e.a();
        float j = ((gh00) placesCategoryFiltersModalView.mapController).j();
        fVar.getClass();
        fVar.G.c(j, ru.yandex.taxi.map.utils.a.D(a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int middleMargin_delegate$lambda$0(Context context) {
        return tje.r(mrg0.go_design_m_space, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 onAttachedToWindow$lambda$0(PlacesCategoryFiltersModalView placesCategoryFiltersModalView, TaxiMapView taxiMapView) {
        f fVar = placesCategoryFiltersModalView.presenter;
        VisibleRegion a = ((gh00) placesCategoryFiltersModalView.mapController).e.a();
        float j = ((gh00) placesCategoryFiltersModalView.mapController).j();
        fVar.getClass();
        fVar.G.c(j, ru.yandex.taxi.map.utils.a.D(a));
        ((gh00) placesCategoryFiltersModalView.mapController).e(placesCategoryFiltersModalView.mapListener);
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int topMargin_delegate$lambda$0(Context context) {
        return tje.r(mrg0.go_design_l_space, context);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateDismiss(Runnable startAction, Runnable endAction) {
        startAction.run();
        endAction.run();
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void animateShow(Runnable onAnimateShowStartAction, Runnable onAnimateShowEndAction) {
        onAnimateShowStartAction.run();
        onAnimateShowEndAction.run();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        getBottomSheet().setBackgroundColor(getContext().getColor(mqg0.transparent));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public e6c0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View O;
        View O2;
        View inflate = inflater.inflate(uuh0.places_category_filters_modal_view, parent, false);
        int i = o6h0.back_button;
        ControlButtonView controlButtonView = (ControlButtonView) cma1.O(i, inflate);
        if (controlButtonView != null && (O = cma1.O((i = o6h0.booking_container), inflate)) != null) {
            n5c0 o = n5c0.o(O);
            i = o6h0.buttons_container;
            if (((LinearLayout) cma1.O(i, inflate)) != null) {
                i = o6h0.compass_button;
                ControlButtonView controlButtonView2 = (ControlButtonView) cma1.O(i, inflate);
                if (controlButtonView2 != null && (O2 = cma1.O((i = o6h0.header_container), inflate)) != null) {
                    int i2 = o6h0.back_button;
                    GoImageView goImageView = (GoImageView) cma1.O(i2, O2);
                    if (goImageView != null) {
                        GoLinearLayout goLinearLayout = (GoLinearLayout) O2;
                        i2 = o6h0.logo;
                        GoImageView goImageView2 = (GoImageView) cma1.O(i2, O2);
                        if (goImageView2 != null) {
                            i2 = o6h0.place_address;
                            RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, O2);
                            if (robotoTextView != null) {
                                i2 = o6h0.place_info_container;
                                if (((GoLinearLayout) cma1.O(i2, O2)) != null) {
                                    i2 = o6h0.place_title;
                                    if (((RobotoTextView) cma1.O(i2, O2)) != null) {
                                        m2y m2yVar = new m2y((ViewGroup) goLinearLayout, (View) goImageView, (View) goImageView2, robotoTextView, 6);
                                        i = o6h0.location_focusing_button;
                                        ControlButtonView controlButtonView3 = (ControlButtonView) cma1.O(i, inflate);
                                        if (controlButtonView3 != null) {
                                            i = o6h0.map_category_filters;
                                            RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                                            if (recyclerView != null) {
                                                i = o6h0.minus_button;
                                                ControlButtonView controlButtonView4 = (ControlButtonView) cma1.O(i, inflate);
                                                if (controlButtonView4 != null) {
                                                    i = o6h0.plus_button;
                                                    ControlButtonView controlButtonView5 = (ControlButtonView) cma1.O(i, inflate);
                                                    if (controlButtonView5 != null) {
                                                        return new e6c0((GoConstraintLayout) inflate, controlButtonView, o, controlButtonView2, m2yVar, controlButtonView3, recyclerView, controlButtonView4, controlButtonView5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ny61.t("Missing required view with ID: ".concat(O2.getResources().getResourceName(i2)));
                    return null;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: getCornerRadius */
    public int getCornersRadius() {
        return 0;
    }

    @Override // defpackage.n3v
    public View getDelayedGoneLayoutReadyView() {
        return getBinding().g;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    public int getTopPadding() {
        return 0;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public y130 insetsType() {
        return new y130(3, null);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView
    /* renamed from: isApplyShadow */
    public boolean getIsCollapsable() {
        return false;
    }

    @Override // defpackage.n3v
    public boolean isReadyForDelayedGone() {
        RecyclerView recyclerView = getBinding().g;
        if (!this.hasRenderedCategoryFilters) {
            return false;
        }
        if (recyclerView.getVisibility() == 0) {
            return recyclerView.getWidth() > 0 && recyclerView.getHeight() > 0 && recyclerView.getChildCount() != 0;
        }
        return true;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setOnTouchOutsideListener(null);
        setDismissOnTouchOutside(false);
        this.focusCoordinator.q3(this, getMiddleMargin(), getTopMargin(), getMiddleMargin(), getBottomMargin());
        ah00 ah00Var = this.mapController;
        ((gh00) ah00Var).q(new i4b0(17, this));
        f fVar = this.presenter;
        fVar.Bg(new a(this));
        tje.N(fVar.Jg(), null, null, new PlacesCategoryFiltersPresenter$subscribeToMapCategoryFilters$$inlined$safeCollectIn$1(new com.yandex.go.places.impl.domain.interactors.map.b(fVar.E.a.c), null, fVar), 3);
        tje.N(fVar.Jg(), null, null, new PlacesCategoryFiltersPresenter$subscribeToThemeSwitch$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(fVar.P.a()), null, fVar), 3);
        tje.N(fVar.Jg(), null, null, new PlacesCategoryFiltersPresenter$getMapCategoryFilters$1(fVar, null), 3);
        tje.N(fVar.Jg(), null, null, new PlacesCategoryFiltersPresenter$renderHeader$1(fVar, null), 3);
        tje.N(fVar.Jg(), null, null, new PlacesCategoryFiltersPresenter$renderBookings$1(fVar, null), 3);
        tje.N(fVar.Jg(), null, null, new PlacesCategoryFiltersPresenter$listenCameraRotationState$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.t(new c(dib1.c(fVar.M))), null, fVar), 3);
        RecyclerView recyclerView = getBinding().g;
        recyclerView.setAdapter(getMapCategoryFiltersAdapter());
        recyclerView.addItemDecoration(new iru(getCategoriesMargin()));
        e6c0 binding = getBinding();
        ru.yandex.taxi.design.utils.c.z(new PlacesCategoryFiltersModalView$onAttachedToWindow$3$1(0, this.presenter, f.class, "onZoomInButtonClicked", "onZoomInButtonClicked()V", 0), binding.i);
        ru.yandex.taxi.design.utils.c.z(new PlacesCategoryFiltersModalView$onAttachedToWindow$3$2(0, this.presenter, f.class, "onZoomOutButtonClicked", "onZoomOutButtonClicked()V", 0), binding.h);
        ru.yandex.taxi.design.utils.c.z(new PlacesCategoryFiltersModalView$onAttachedToWindow$3$3(0, this.presenter, f.class, "onLocationFocusingButtonClicked", "onLocationFocusingButtonClicked()V", 0), binding.f);
        ru.yandex.taxi.design.utils.c.z(new PlacesCategoryFiltersModalView$onAttachedToWindow$3$4(0, this.presenter, f.class, "onCompassButtonClicked", "onCompassButtonClicked()V", 0), binding.d);
        ru.yandex.taxi.design.utils.c.z(new PlacesCategoryFiltersModalView$onAttachedToWindow$3$5(0, this.presenter, f.class, "onBackButtonClicked", "onBackButtonClicked()V", 0), binding.b);
        ru.yandex.taxi.design.utils.c.z(new PlacesCategoryFiltersModalView$onAttachedToWindow$3$6(0, this.presenter, f.class, "onBackButtonClicked", "onBackButtonClicked()V", 0), (GoImageView) binding.e.d);
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        ((gh00) this.mapController).u(this.mapListener);
        this.focusCoordinator.Lc(this, null);
        super.onDetachedFromWindow();
        this.presenter.Cg();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, defpackage.g030
    public void setAccessibilityListener(h030 listener) {
    }
}
