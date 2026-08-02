package com.yandex.go.intercity.flex.dashboard.point_selection;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.intercity.flex.dashboard.point_selection.IntercityPointSelectionModalView;
import com.yandex.go.routeselector.analytics.EditPointAnalytics$ButtonName;
import com.yandex.go.routeselector.analytics.EditPointAnalytics$PointType;
import com.yandex.go.routeselector.analytics.EditPointAnalytics$Screen;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a3v;
import defpackage.anw;
import defpackage.b1;
import defpackage.cma1;
import defpackage.cwa1;
import defpackage.cyx;
import defpackage.dhv;
import defpackage.dnw;
import defpackage.enw;
import defpackage.fnw;
import defpackage.ga0;
import defpackage.gau;
import defpackage.inw;
import defpackage.jnw;
import defpackage.knw;
import defpackage.lnw;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.pth0;
import defpackage.qdb1;
import defpackage.qoi0;
import defpackage.qu;
import defpackage.reu;
import defpackage.rg7;
import defpackage.sih0;
import defpackage.vnw;
import defpackage.w511;
import defpackage.wow;
import defpackage.xkr;
import defpackage.xow;
import defpackage.xw31;
import defpackage.ymw;
import defpackage.ysd0;
import defpackage.zmw;
import defpackage.zzs;
import java.util.HashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.common_models.net.map_object.j0;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment;
import ru.yandex.taxi.layers.experiments.m;
import ru.yandex.taxi.layers.presentation.optimalview.c;
import ru.yandex.taxi.map_common.b;
import ru.yandex.taxi.widget.ArrowsView;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002,-BC\b\u0007\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u001f\u0010\u0015J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0013H\u0014¢\u0006\u0004\b%\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010+¨\u0006."}, d2 = {"Lcom/yandex/go/intercity/flex/dashboard/point_selection/IntercityPointSelectionModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lxkr;", "Landroid/content/Context;", "context", "Lfnw;", "presenter", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "mapObservationPresenter", "Lanw;", "pointSelectionPayload", "Lknw;", "getToPointOverlay", "La3v;", "focusCoordinator", "Lpav;", "imageLoader", "<init>", "(Landroid/content/Context;Lfnw;Lru/yandex/taxi/layers/presentation/optimalview/c;Lanw;Lknw;La3v;Lpav;)V", "Lzy11;", "setupMapPresenter", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lxkr;", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "onAttachedToWindow", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "Lfnw;", "Lru/yandex/taxi/layers/presentation/optimalview/c;", "Lanw;", "Lknw;", "La3v;", "Lpav;", "wow", "xow", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class IntercityPointSelectionModalView extends SlideableBindingModalView<xkr> {
    private final a3v focusCoordinator;
    private final knw getToPointOverlay;
    private final pav imageLoader;
    private final c mapObservationPresenter;
    private final anw pointSelectionPayload;
    private final fnw presenter;

    public IntercityPointSelectionModalView(Context context, fnw fnwVar, c cVar, anw anwVar, knw knwVar, a3v a3vVar, pav pavVar) {
        super(context);
        this.presenter = fnwVar;
        this.mapObservationPresenter = cVar;
        this.pointSelectionPayload = anwVar;
        this.getToPointOverlay = knwVar;
        this.focusCoordinator = a3vVar;
        this.imageLoader = pavVar;
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        final int i = 0;
        setDismissOnTouchOutside(false);
        setArrowState(ArrowsView.State.GONE);
        setDismissOnBackPressed(false);
        qdb1.b(this, new Runnable(this) { // from class: vow
            public final /* synthetic */ IntercityPointSelectionModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                IntercityPointSelectionModalView intercityPointSelectionModalView = this.b;
                switch (i2) {
                    case 0:
                        intercityPointSelectionModalView.onBackPressed();
                        break;
                    default:
                        IntercityPointSelectionModalView._init_$lambda$0(intercityPointSelectionModalView);
                        break;
                }
            }
        });
        qdb1.d(this, new dhv(9, knwVar));
        final int i2 = 1;
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: vow
            public final /* synthetic */ IntercityPointSelectionModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                IntercityPointSelectionModalView intercityPointSelectionModalView = this.b;
                switch (i22) {
                    case 0:
                        intercityPointSelectionModalView.onBackPressed();
                        break;
                    default:
                        IntercityPointSelectionModalView._init_$lambda$0(intercityPointSelectionModalView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(IntercityPointSelectionModalView intercityPointSelectionModalView) {
        EditPointAnalytics$PointType editPointAnalytics$PointType;
        fnw fnwVar = intercityPointSelectionModalView.presenter;
        b1 b1Var = fnwVar.E;
        int i = dnw.a[fnwVar.z.a.ordinal()];
        if (i == 1) {
            editPointAnalytics$PointType = EditPointAnalytics$PointType.Source;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            editPointAnalytics$PointType = EditPointAnalytics$PointType.Destination;
        }
        EditPointAnalytics$Screen editPointAnalytics$Screen = EditPointAnalytics$Screen.IntercityCheckout;
        EditPointAnalytics$ButtonName editPointAnalytics$ButtonName = EditPointAnalytics$ButtonName.Done;
        b1Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("point_type", editPointAnalytics$PointType.getEventValue());
        hashMap.put(MetaDataField.SCREEN_FIELD, editPointAnalytics$Screen.getEventValue());
        hashMap.put("button_name", editPointAnalytics$ButtonName.getEventValue());
        b1Var.a.a("EditPoint.Tapped", hashMap, 2, new HashMap());
        reu reuVar = fnwVar.B;
        ymw ymwVar = fnwVar.F;
        a aVar = (a) reuVar.b;
        if (ymwVar != null) {
            aVar.r(new gau(26, ymwVar));
        } else {
            aVar.r(new qu(9));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$onLocationButtonPressed(knw knwVar) {
        lnw lnwVar = knwVar.c;
        Route route = lnwVar.E;
        if (route == null) {
            ((inw) lnwVar.Dg()).F(cwa1.d((zzs) lnwVar.B.d.b));
        } else {
            ((inw) lnwVar.Dg()).v(route.getGeometry().getPoints());
        }
    }

    private final void setupMapPresenter() {
        c cVar = this.mapObservationPresenter;
        cVar.E = this.pointSelectionPayload.b.b.a;
        cVar.D = true;
        m mVar = ScreenModeMapProvidersExperiment.ZoomMode.Companion;
        cVar.J = true;
        cVar.L = 300.0f;
        cVar.Lg(new xow());
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public xkr bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(pth0.flex_point_selection_modal, parent, false);
        int i = sih0.point_selection_modal_confirm_button;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            LinearLayout linearLayout = (LinearLayout) inflate;
            int i2 = sih0.point_selection_modal_title;
            ListTitleComponent listTitleComponent = (ListTitleComponent) cma1.O(i2, inflate);
            if (listTitleComponent != null) {
                i2 = sih0.point_selection_stop_point;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
                if (listItemComponent != null) {
                    return new xkr(linearLayout, buttonComponent, listTitleComponent, listItemComponent);
                }
            }
            i = i2;
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setupMapPresenter();
        fnw fnwVar = this.presenter;
        fnwVar.Bg(new wow(this));
        vnw vnwVar = fnwVar.A;
        vnwVar.a.a.add(vnwVar);
        cyx cyxVar = fnwVar.x;
        anw anwVar = fnwVar.z;
        cyxVar.b(anwVar.b);
        ysd0 ysd0Var = fnwVar.C;
        enw enwVar = fnwVar.G;
        enwVar.getClass();
        ((b) ysd0Var).a(j0.class, enwVar);
        zmw zmwVar = (zmw) fnwVar.Dg();
        rg7 rg7Var = anwVar.e;
        zmwVar.j8(new ga0(rg7Var.a, rg7Var.b, false));
        fnwVar.Kg(anwVar.c);
        knw knwVar = this.getToPointOverlay;
        knwVar.c.Bg(new jnw(knwVar));
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.go.intercity.flex.dashboard.point_selection.IntercityPointSelectionModalView$onAttachedToWindow$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    IntercityPointSelectionModalView.this.focusCoordinator.b8(qoi0.a(IntercityPointSelectionModalView.class));
                    IntercityPointSelectionModalView.this.focusCoordinator.Td(IntercityPointSelectionModalView.this.getContentHeight(), qoi0.a(IntercityPointSelectionModalView.class));
                }
            });
            return;
        }
        this.focusCoordinator.b8(qoi0.a(IntercityPointSelectionModalView.class));
        this.focusCoordinator.Td(getContentHeight(), qoi0.a(IntercityPointSelectionModalView.class));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.presenter.Cg();
        this.mapObservationPresenter.Cg();
        this.getToPointOverlay.c.Cg();
        this.focusCoordinator.t4(qoi0.a(IntercityPointSelectionModalView.class));
        this.focusCoordinator.a0(qoi0.a(IntercityPointSelectionModalView.class));
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getX(), (int) event.getY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }
}
