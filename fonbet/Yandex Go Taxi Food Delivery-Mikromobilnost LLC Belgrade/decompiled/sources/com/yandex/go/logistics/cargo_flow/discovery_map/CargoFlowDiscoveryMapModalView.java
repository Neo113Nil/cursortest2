package com.yandex.go.logistics.cargo_flow.discovery_map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import defpackage.a3v;
import defpackage.ah00;
import defpackage.aoi;
import defpackage.bvf0;
import defpackage.i3y;
import defpackage.ju8;
import defpackage.ku8;
import defpackage.ltj;
import defpackage.mq00;
import defpackage.mqg0;
import defpackage.ny61;
import defpackage.po21;
import defpackage.qdb1;
import defpackage.sls;
import defpackage.stj;
import defpackage.tje;
import defpackage.tse;
import defpackage.tth0;
import defpackage.u90;
import defpackage.xni;
import defpackage.xw31;
import defpackage.y8g;
import kotlin.Metadata;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.widget.SlideableBindingModalView;
import ru.yandex.taxi.widget.SlideableModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003BO\b\u0007\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u000e\b\u0001\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001d\u0010\u0016J\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\u0016J\u000f\u0010*\u001a\u00020\u000bH\u0016¢\u0006\u0004\b*\u0010\u0016J\u000f\u0010+\u001a\u00020\u000bH\u0016¢\u0006\u0004\b+\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u0012\u0004\b-\u0010\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lcom/yandex/go/logistics/cargo_flow/discovery_map/CargoFlowDiscoveryMapModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lstj;", "Lmq00;", "Landroid/content/Context;", "context", "Ltse;", "mainScope", "Lltj;", "discoveryMapDependencies", "Lkotlin/Function0;", "Lzy11;", "onBackPressed", "La3v;", "focusCoordinator", "Lah00;", "mapController", "Lpo21;", "userLocationInteractor", "<init>", "(Landroid/content/Context;Ltse;Lltj;Lsls;La3v;Lah00;Lpo21;)V", "onLocationButtonClick", "()V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lstj;", "", "title", "subtitle", "showMessage", "(Ljava/lang/String;Ljava/lang/String;)V", "hideMessage", "showFirstUsageHint", "hideFirstUsageHint", "Ltse;", "getMainScope$annotations", "Lsls;", "La3v;", "Lah00;", "Lpo21;", "Lxni;", "screenEngine$delegate", "Li3y;", "getScreenEngine", "()Lxni;", "screenEngine", "Landroid/view/View$OnLayoutChangeListener;", "focusCoordinatorChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CargoFlowDiscoveryMapModalView extends SlideableBindingModalView<stj> implements mq00 {
    private final a3v focusCoordinator;
    private final View.OnLayoutChangeListener focusCoordinatorChangeListener;
    private final tse mainScope;
    private final ah00 mapController;
    private final sls onBackPressed;

    /* renamed from: screenEngine$delegate, reason: from kotlin metadata */
    private final i3y screenEngine;
    private final po21 userLocationInteractor;

    public CargoFlowDiscoveryMapModalView(Context context, tse tseVar, ltj ltjVar, sls slsVar, a3v a3vVar, ah00 ah00Var, po21 po21Var) {
        super(context);
        this.mainScope = tseVar;
        this.onBackPressed = slsVar;
        this.focusCoordinator = a3vVar;
        this.mapController = ah00Var;
        this.userLocationInteractor = po21Var;
        int i = 0;
        this.screenEngine = kotlin.a.a(new ju8(i, ltjVar));
        u90 u90Var = new u90(11, this);
        this.focusCoordinatorChangeListener = u90Var;
        getCardContentView().addOnLayoutChangeListener(u90Var);
        getBottomSheet().setBackgroundResource(mqg0.transparent);
        setEnableBackgroundOnAppearing(false);
        setCardMode(SlideableModalView.CardMode.FIXED_CARD);
        setDismissOnTouchOutside(false);
        setOnTouchOutsideListener(null);
        qdb1.b(this, new ku8(this, i));
        qdb1.d(this, new ku8(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void focusCoordinatorChangeListener$lambda$0(CargoFlowDiscoveryMapModalView cargoFlowDiscoveryMapModalView, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        cargoFlowDiscoveryMapModalView.focusCoordinator.Td(c.h(27, cargoFlowDiscoveryMapModalView.getCardContentView()) + cargoFlowDiscoveryMapModalView.getCardContentView().getMeasuredHeight(), new CargoFlowDiscoveryMapModalView$focusCoordinatorChangeListener$1$1(0, cargoFlowDiscoveryMapModalView, CargoFlowDiscoveryMapModalView.class, "hashCode", "hashCode()I", 0));
    }

    private static /* synthetic */ void getMainScope$annotations() {
    }

    private final xni getScreenEngine() {
        return (xni) this.screenEngine.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLocationButtonClick() {
        tje.N(this.mainScope, null, null, new CargoFlowDiscoveryMapModalView$onLocationButtonClick$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xni screenEngine_delegate$lambda$0(ltj ltjVar) {
        aoi k;
        synchronized (bvf0.g) {
            y8g y8gVar = bvf0.e;
            if (y8gVar == null) {
                y8gVar = null;
            }
            k = y8gVar.c().k(ltjVar);
        }
        return k;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public stj bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        if (parent != null) {
            inflater.inflate(tth0.discovery_map_modal_view, parent);
            return new stj(parent);
        }
        ny61.t("parent");
        return null;
    }

    @Override // defpackage.mq00
    public /* bridge */ void collapseForZoom() {
    }

    @Override // defpackage.mq00
    public void hideFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void hideMessage() {
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getScreenEngine().b(getCardContentContainer());
        post(new ku8(this, 2));
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onBackPressed() {
        super.onBackPressed();
        this.onBackPressed.invoke();
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        getScreenEngine().a();
        this.focusCoordinator.t4(new CargoFlowDiscoveryMapModalView$onDetachedFromWindow$1(0, this, CargoFlowDiscoveryMapModalView.class, "hashCode", "hashCode()I", 0));
        getCardContentView().removeOnLayoutChangeListener(this.focusCoordinatorChangeListener);
        super.onDetachedFromWindow();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (xw31.l((int) event.getRawX(), (int) event.getRawY(), 0, getCardContentView())) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override // defpackage.mq00
    public void showFirstUsageHint() {
    }

    @Override // defpackage.mq00
    public void showMessage(String title, String subtitle) {
    }
}
