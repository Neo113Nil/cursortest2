package com.yandex.go.drive.sdkintegration.presentation;

import android.content.Context;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.go.address.models.Address;
import com.yandex.go.drive.delegates.b;
import com.yandex.go.drive.sdkintegration.domain.session.e;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mobile.drive.sdk.DriveSdkView;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardCollapseSource;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardExpansionSource;
import com.yandex.mobile.drive.sdk.full.GeoPoint;
import com.yandex.mobile.drive.sdk.full.model.MapAddressData;
import com.yandex.mobile.drive.sdk.map.MapMobileSdkPlugin;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.ah00;
import defpackage.b230;
import defpackage.bfm;
import defpackage.bzj;
import defpackage.c0g;
import defpackage.cv51;
import defpackage.dem;
import defpackage.e230;
import defpackage.em00;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.h5b1;
import defpackage.idm;
import defpackage.jl40;
import defpackage.jvx;
import defpackage.kvx;
import defpackage.l8x;
import defpackage.mqg0;
import defpackage.n751;
import defpackage.odm;
import defpackage.oem;
import defpackage.ovx;
import defpackage.pcm;
import defpackage.pdm;
import defpackage.qdm;
import defpackage.qr6;
import defpackage.rdm;
import defpackage.rem;
import defpackage.rh;
import defpackage.rz8;
import defpackage.s6z;
import defpackage.sdm;
import defpackage.shf;
import defpackage.sls;
import defpackage.t1r0;
import defpackage.tcc;
import defpackage.tem;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.u1w;
import defpackage.u8y;
import defpackage.vf41;
import defpackage.w030;
import defpackage.w511;
import defpackage.whf;
import defpackage.x651;
import defpackage.xdm;
import defpackage.xjg;
import defpackage.y651;
import defpackage.yzh;
import defpackage.zch;
import defpackage.zgl;
import defpackage.zoy0;
import defpackage.zzs;
import io.flutter.embedding.android.RenderMode;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.modal.WebContainerModalView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001nB\u0083\u0001\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0014¢\u0006\u0004\b%\u0010&J\u0017\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0017¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0014¢\u0006\u0004\b-\u0010.J\u0015\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002012\b\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u0002012\b\u00105\u001a\u0004\u0018\u000108¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u000201H\u0014¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u000201H\u0014¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u000201H\u0014¢\u0006\u0004\b>\u0010<J\u0017\u0010?\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b?\u00103J\u001f\u0010C\u001a\u0002012\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@H\u0002¢\u0006\u0004\bC\u0010DR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010GR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010KR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010LR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010MR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010NR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010OR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010PR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010U\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010X\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010YR\u0018\u0010[\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010YR*\u0010^\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR*\u0010d\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010_\u001a\u0004\be\u0010a\"\u0004\bf\u0010cR0\u0010h\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u000201\u0018\u00010g8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010m¨\u0006o"}, d2 = {"Lcom/yandex/go/drive/sdkintegration/presentation/DriveHostView;", "Lru/yandex/taxi/widget/ModalView;", "Landroid/content/Context;", "context", "Lidm;", "driveDependencies", "Ltse;", "mainScope", "Lw030;", "modalViewCoordinator", "Lah00;", "mapController", "Lrz8;", "carParksLayerHolder", "Lcom/yandex/go/drive/delegates/b;", "driveAccountManager", "Ltem;", "authorizationInteractor", "Lrem;", "drivePlusRouter", "Loem;", "drivePaymentMethodsProvider", "Lvf41;", "webContainerModalViewFactory", "Lpcm;", "driveAnalyticsReporter", "Lh3y;", "Lky11;", "unifiedPollingRepository", "Lcv51;", "ybScreenNavigator", "<init>", "(Landroid/content/Context;Lidm;Ltse;Lw030;Lah00;Lrz8;Lcom/yandex/go/drive/delegates/b;Ltem;Lrem;Loem;Lvf41;Lpcm;Lh3y;Lcv51;)V", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "()I", "Le230;", "insetsType", "()Le230;", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "contentView", "()Landroid/view/View;", "Lovx;", "param", "Lzy11;", "launch", "(Lovx;)V", "Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardExpansionSource;", "source", "notifySummaryExpanded", "(Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardExpansionSource;)V", "Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardCollapseSource;", "notifySummaryCollapsed", "(Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardCollapseSource;)V", "onAppearAnimationComplete", "()V", "onAttachedToWindow", "onDetachedFromWindow", "doLaunch", "", "supportChatUrl", "authToken", "openSupportChat", "(Ljava/lang/String;Ljava/lang/String;)V", "Lidm;", "Ltse;", "Lw030;", "Lah00;", "Lrz8;", "Lcom/yandex/go/drive/delegates/b;", "Ltem;", "Lrem;", "Loem;", "Lvf41;", "Lpcm;", "Lh3y;", "Lcv51;", "Lcom/yandex/mobile/drive/sdk/DriveSdkView;", "sdkView", "Lcom/yandex/mobile/drive/sdk/DriveSdkView;", "pendingLaunchParam", "Lovx;", "Ll8x;", "mapAttachJob", "Ll8x;", "permissionResultJob", "activityResultJob", "newIntentJob", "Lkotlin/Function0;", "hideHandler", "Lsls;", "getHideHandler", "()Lsls;", "setHideHandler", "(Lsls;)V", "defaultModeHandler", "getDefaultModeHandler", "setDefaultModeHandler", "Lkotlin/Function1;", "draggableHandler", "Ltls;", "getDraggableHandler", "()Ltls;", "setDraggableHandler", "(Ltls;)V", "zch", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DriveHostView extends ModalView {
    private l8x activityResultJob;
    private final tem authorizationInteractor;
    private final rz8 carParksLayerHolder;
    private sls defaultModeHandler;
    private tls draggableHandler;
    private final b driveAccountManager;
    private final pcm driveAnalyticsReporter;
    private final idm driveDependencies;
    private final oem drivePaymentMethodsProvider;
    private final rem drivePlusRouter;
    private sls hideHandler;
    private final tse mainScope;
    private l8x mapAttachJob;
    private final ah00 mapController;
    private final w030 modalViewCoordinator;
    private l8x newIntentJob;
    private ovx pendingLaunchParam;
    private l8x permissionResultJob;
    private final DriveSdkView sdkView;
    private final h3y unifiedPollingRepository;
    private final vf41 webContainerModalViewFactory;
    private final cv51 ybScreenNavigator;

    public DriveHostView(Context context, idm idmVar, tse tseVar, w030 w030Var, ah00 ah00Var, rz8 rz8Var, b bVar, tem temVar, rem remVar, oem oemVar, vf41 vf41Var, pcm pcmVar, h3y h3yVar, cv51 cv51Var) {
        super(context);
        String str;
        zzs B;
        this.driveDependencies = idmVar;
        this.mainScope = tseVar;
        this.modalViewCoordinator = w030Var;
        this.mapController = ah00Var;
        this.carParksLayerHolder = rz8Var;
        this.driveAccountManager = bVar;
        this.authorizationInteractor = temVar;
        this.drivePlusRouter = remVar;
        this.drivePaymentMethodsProvider = oemVar;
        this.webContainerModalViewFactory = vf41Var;
        this.driveAnalyticsReporter = pcmVar;
        this.unifiedPollingRepository = h3yVar;
        this.ybScreenNavigator = cv51Var;
        c0g c0gVar = (c0g) idmVar;
        int i = xdm.a[((whf) c0gVar.z.Di.get()).a().ordinal()];
        s6z s6zVar = null;
        if (i != 1) {
            str = "light";
            if (i != 2) {
                if (i == 3) {
                    str = "system";
                } else if (i != 4) {
                    w511.b();
                    throw null;
                }
            }
        } else {
            str = "dark";
        }
        Address h = c0gVar.z.A1().c().h();
        if (h != null && (B = h.B()) != null) {
            s6zVar = new s6z(B.b, B.a);
        }
        DriveSdkView driveSdkView = new DriveSdkView(context, null, 0, s6zVar, str, true, RenderMode.texture, null, false, 390, null);
        this.sdkView = driveSdkView;
        driveSdkView.setListener(new zch(this));
        addView(driveSdkView);
        setDismissOnTouchOutside(false);
        setAnimateOnAppearing(false);
        setDismissOnBackPressed(false);
        this.animateOnAppearing = false;
        zgl zglVar = new zgl(15);
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.o(driveSdkView, zglVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n751 _init_$lambda$0(View view, n751 n751Var) {
        u1w g = n751Var.a.g(1);
        x651 x651Var = new x651(n751Var);
        bzj f = n751Var.a.f();
        y651 y651Var = x651Var.a;
        if (f != null) {
            u1w a = f.a();
            int i = Build.VERSION.SDK_INT;
            y651Var.i(new bzj(i >= 33 ? rh.b(g.e(), a.e()) : i >= 30 ? qr6.b(g.e(), a.e()) : new DisplayCutout(g.e(), null, null, null, null)));
        }
        return y651Var.h();
    }

    private final void doLaunch(ovx param) {
        MapAddressData mapAddressData = null;
        this.pendingLaunchParam = null;
        t1r0 t1r0Var = (t1r0) ((e) ((c0g) this.driveDependencies).z.Va.get()).h.get();
        shf a = t1r0Var != null ? t1r0Var.a() : null;
        if (param instanceof jvx) {
            sdm sdmVar = ((jvx) param).a;
            if (jl40.l(sdmVar, pdm.a)) {
                DriveSdkView.start$default(this.sdkView, a, null, 2, null);
                return;
            }
            if (sdmVar instanceof odm) {
                this.sdkView.start(a, ((odm) sdmVar).a);
                return;
            }
            if (sdmVar instanceof qdm) {
                this.sdkView.startWithOffer(a, ((qdm) sdmVar).a);
                return;
            } else if (sdmVar instanceof rdm) {
                this.sdkView.startWithRide(a, ((rdm) sdmVar).a);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (!(param instanceof kvx)) {
            w511.b();
            return;
        }
        dem demVar = ((kvx) param).a;
        DriveSdkView driveSdkView = this.sdkView;
        Address address = demVar.a;
        if (address != null) {
            zzs B = address.B();
            mapAddressData = new MapAddressData(new GeoPoint(B.a, B.b), address.D1());
        }
        MapAddressData mapAddressData2 = mapAddressData;
        List<Address> list = demVar.b;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (Address address2 : list) {
            zzs B2 = address2.B();
            arrayList.add(new MapAddressData(new GeoPoint(B2.a, B2.b), address2.D1()));
        }
        driveSdkView.showOfferSummary(mapAddressData2, arrayList, demVar.d, demVar.c, null, a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openSupportChat(String supportChatUrl, String authToken) {
        if (this.modalViewCoordinator.i(WebContainerModalView.class) != null) {
            return;
        }
        CoreWebViewConfig.Companion.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = supportChatUrl;
        aVar.c = authToken;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        this.modalViewCoordinator.s(vf41.a(this.webContainerModalViewFactory, uiWebViewConfig, null, null, null, 254), true);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.transparent;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    /* renamed from: contentView */
    public View getContent() {
        return this.sdkView;
    }

    public final sls getDefaultModeHandler() {
        return this.defaultModeHandler;
    }

    public final tls getDraggableHandler() {
        return this.draggableHandler;
    }

    public final sls getHideHandler() {
        return this.hideHandler;
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public e230 insetsType() {
        return b230.a;
    }

    public final void launch(ovx param) {
        this.pendingLaunchParam = param;
        if (isAttachedToWindow()) {
            doLaunch(param);
        }
    }

    public final void notifySummaryCollapsed(DriveSummaryCardCollapseSource source) {
        this.sdkView.notifySummaryCollapsed(source);
    }

    public final void notifySummaryExpanded(DriveSummaryCardExpansionSource source) {
        this.sdkView.notifySummaryExpanded(source);
    }

    @Override // ru.yandex.taxi.widget.ModalView
    public void onAppearAnimationComplete() {
        super.onAppearAnimationComplete();
        requestFocus();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.driveAccountManager.f = this.authorizationInteractor;
        yzh yzhVar = new yzh(this);
        bfm bfmVar = bfm.i;
        bfmVar.getClass();
        h5b1.a(new xjg(bfmVar, yzhVar, false, 25));
        this.mapAttachJob = tje.N(this.mainScope, null, null, new DriveHostView$onAttachedToWindow$2(this, null), 3);
        ovx ovxVar = this.pendingLaunchParam;
        if (ovxVar != null) {
            doLaunch(ovxVar);
        }
        this.permissionResultJob = tje.N(this.mainScope, null, null, new DriveHostView$onAttachedToWindow$4(this, null), 3);
        this.activityResultJob = tje.N(this.mainScope, null, null, new DriveHostView$onAttachedToWindow$5(this, null), 3);
        this.newIntentJob = tje.N(this.mainScope, null, null, new DriveHostView$onAttachedToWindow$6(this, null), 3);
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        u8y u8yVar;
        super.onDetachedFromWindow();
        this.driveAccountManager.f = null;
        l8x l8xVar = this.mapAttachJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        l8x l8xVar2 = this.permissionResultJob;
        if (l8xVar2 != null) {
            l8xVar2.a(null);
        }
        l8x l8xVar3 = this.activityResultJob;
        if (l8xVar3 != null) {
            l8xVar3.a(null);
        }
        l8x l8xVar4 = this.newIntentJob;
        if (l8xVar4 != null) {
            l8xVar4.a(null);
        }
        bfm bfmVar = bfm.i;
        zoy0 zoy0Var = new zoy0();
        bfmVar.getClass();
        h5b1.a(new xjg(bfmVar, zoy0Var, false, 25));
        this.sdkView.setListener(null);
        TaxiMapView h = ((gh00) this.mapController).h();
        bfmVar.getClass();
        em00 em00Var = MapMobileSdkPlugin.Companion;
        MapWindow mapWindow = h != null ? h.getMapWindow() : null;
        em00Var.getClass();
        u8yVar = MapMobileSdkPlugin.lease;
        if (mapWindow != null) {
            if (!jl40.l(u8yVar != null ? u8yVar.a : null, mapWindow)) {
                return;
            }
        }
        if (u8yVar != null) {
            int i = u8yVar.f - 1;
            u8yVar.f = i;
            if (i > 0) {
                return;
            }
        }
        MapMobileSdkPlugin.lease = null;
        em00.a();
    }

    @Override // ru.yandex.taxi.widget.ModalView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return false;
    }

    public final void setDefaultModeHandler(sls slsVar) {
        this.defaultModeHandler = slsVar;
    }

    public final void setDraggableHandler(tls tlsVar) {
        this.draggableHandler = tlsVar;
    }

    public final void setHideHandler(sls slsVar) {
        this.hideHandler = slsVar;
    }
}
