package com.yandex.mobile.drive.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardCollapseSource;
import com.yandex.mobile.drive.sdk.full.DriveSummaryCardExpansionSource;
import com.yandex.mobile.drive.sdk.full.model.MapAddressData;
import defpackage.a9z;
import defpackage.at5;
import defpackage.bcz;
import defpackage.cr7;
import defpackage.ea20;
import defpackage.efm;
import defpackage.hdm;
import defpackage.jfm;
import defpackage.mfm;
import defpackage.mx60;
import defpackage.oyr;
import defpackage.qc;
import defpackage.s6z;
import defpackage.shf;
import defpackage.shm;
import defpackage.t8j;
import defpackage.tcc;
import defpackage.tls;
import defpackage.zm91;
import defpackage.zvi;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.flutter.embedding.android.FlutterEmbedViewDelegate;
import io.flutter.embedding.android.FlutterViewContainer;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001aBe\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010\u001eJK\u0010'\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0#2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010%\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00192\b\u0010,\u001a\u0004\u0018\u00010/¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00192\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00192\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0019H\u0014¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0019H\u0014¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\fH\u0016¢\u0006\u0004\b:\u0010;J-\u0010A\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00062\u000e\u0010>\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0=2\u0006\u0010@\u001a\u00020?¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020\u00192\u0006\u0010D\u001a\u00020C¢\u0006\u0004\bE\u0010FJ'\u0010I\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010C¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u0019¢\u0006\u0004\bK\u00108J#\u0010O\u001a\u00020\u00192\u0012\u0010N\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00190LH\u0002¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010QR\u0014\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR(\u00103\u001a\u0004\u0018\u0001022\b\u0010U\u001a\u0004\u0018\u0001028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b3\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010Z\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R(\u0010N\u001a\u0004\u0018\u00010\\2\b\u0010N\u001a\u0004\u0018\u00010\\8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`¨\u0006b"}, d2 = {"Lcom/yandex/mobile/drive/sdk/DriveSdkView;", "Lio/flutter/embedding/android/FlutterViewContainer;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "", "defStyleAttr", "Ls6z;", "possibleLocation", "", DivkitThemeChangeListener.THEME_VARIABLE_NAME, "", "legacyChrome", "Lio/flutter/embedding/android/RenderMode;", "renderMode", "Lio/flutter/embedding/android/TransparencyMode;", "transparencyMode", "registerPlugins", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;ILs6z;Ljava/lang/String;ZLio/flutter/embedding/android/RenderMode;Lio/flutter/embedding/android/TransparencyMode;Z)V", "Lshf;", "initialSession", "Landroid/net/Uri;", "link", "Lzy11;", "start", "(Lshf;Landroid/net/Uri;)V", "offerId", "startWithOffer", "(Lshf;Ljava/lang/String;)V", "sessionId", "startWithRide", "Lcom/yandex/mobile/drive/sdk/full/model/MapAddressData;", "startingPoint", "", "destinations", "carNumber", "complementaryOfferId", "showOfferSummary", "(Lcom/yandex/mobile/drive/sdk/full/model/MapAddressData;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lshf;)V", "openDeeplink", "(Landroid/net/Uri;)V", "Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardCollapseSource;", "source", "notifySummaryCollapsed", "(Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardCollapseSource;)V", "Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardExpansionSource;", "notifySummaryExpanded", "(Lcom/yandex/mobile/drive/sdk/full/DriveSummaryCardExpansionSource;)V", "Lio/flutter/embedding/engine/FlutterEngine;", "flutterEngine", "configureFlutterEngine", "(Lio/flutter/embedding/engine/FlutterEngine;)V", "cleanUpFlutterEngine", "onAttachedToWindow", "()V", "onDetachedFromWindow", "popSystemNavigator", "()Z", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "resultCode", Constants.KEY_DATA, "onActivityResult", "(IILandroid/content/Intent;)V", "onUserLeaveHint", "Lkotlin/Function1;", "Lefm;", "listener", "whenReady", "(Ltls;)V", "Z", "Lcom/yandex/mobile/drive/sdk/DriveSdkView$a;", "legacyView", "Lcom/yandex/mobile/drive/sdk/DriveSdkView$a;", "value", "Lio/flutter/embedding/engine/FlutterEngine;", "getFlutterEngine", "()Lio/flutter/embedding/engine/FlutterEngine;", "Lmx60;", "onBackPressedCallback", "Lmx60;", "Lhdm;", "getListener", "()Lhdm;", "setListener", "(Lhdm;)V", "a", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DriveSdkView extends FlutterViewContainer {
    private FlutterEngine flutterEngine;
    private final a legacyView;
    private final mx60 onBackPressedCallback;
    private final boolean registerPlugins;

    public static final class a {
        public efm a;
        public final ArrayList b = new ArrayList();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DriveSdkView(Context context, AttributeSet attributeSet, int i, s6z s6zVar, String str, boolean z, RenderMode renderMode, TransparencyMode transparencyMode, boolean z2) {
        super(context, attributeSet, i, renderMode, transparencyMode, r11, z);
        ArrayList arrayList = new ArrayList();
        zm91.a("device", oyr.q(Build.BRAND, Extension.DOT_CHAR, Build.MODEL, Extension.DOT_CHAR, Build.DEVICE), arrayList);
        zm91.a("manufacturer", Build.MANUFACTURER, arrayList);
        zm91.a("osVersion", "Android" + Build.VERSION.SDK_INT, arrayList);
        zm91.a(DivkitThemeChangeListener.THEME_VARIABLE_NAME, str == null ? "light" : str, arrayList);
        zm91.a("legacyChrome", String.valueOf(z), arrayList);
        zm91.a("lat", String.valueOf(s6zVar != null ? Double.valueOf(s6zVar.b) : null), arrayList);
        zm91.a("lon", String.valueOf(s6zVar != null ? Double.valueOf(s6zVar.a) : null), arrayList);
        this.registerPlugins = z2;
        this.legacyView = new a();
        this.onBackPressedCallback = new qc(9, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _set_listener_$lambda$0(hdm hdmVar, efm efmVar) {
        mfm mfmVar = efmVar.b;
        if (mfmVar != null) {
            mfmVar.a = hdmVar;
        }
        jfm jfmVar = efmVar.c;
        if (jfmVar != null) {
            jfmVar.a = hdmVar;
        }
        shm shmVar = efmVar.d;
        if (shmVar != null) {
            shmVar.a = hdmVar;
        }
        efmVar.a = hdmVar;
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 notifySummaryCollapsed$lambda$4(DriveSummaryCardCollapseSource driveSummaryCardCollapseSource, efm efmVar) {
        mfm mfmVar = efmVar.b;
        if (mfmVar != null) {
            HashMap h = b.h(new Pair("source", driveSummaryCardCollapseSource != null ? driveSummaryCardCollapseSource.getRaw() : null));
            ea20 ea20Var = mfmVar.b;
            if (ea20Var != null) {
                ea20Var.a("notify_summary_collapsed", h, null);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 notifySummaryExpanded$lambda$5(DriveSummaryCardExpansionSource driveSummaryCardExpansionSource, efm efmVar) {
        mfm mfmVar = efmVar.b;
        if (mfmVar != null) {
            HashMap h = b.h(new Pair("source", driveSummaryCardExpansionSource != null ? driveSummaryCardExpansionSource.getRaw() : null));
            ea20 ea20Var = mfmVar.b;
            if (ea20Var != null) {
                ea20Var.a("notify_summary_expanded", h, null);
            }
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 openDeeplink$lambda$3(Uri uri, efm efmVar) {
        mfm mfmVar = efmVar.b;
        if (mfmVar != null) {
            HashMap h = b.h(new Pair("link", uri.toString()));
            ea20 ea20Var = mfmVar.b;
            if (ea20Var != null) {
                ea20Var.a(com.adjust.sdk.Constants.DEEPLINK, h, null);
            }
        }
        return zy11.a;
    }

    public static /* synthetic */ void showOfferSummary$default(DriveSdkView driveSdkView, MapAddressData mapAddressData, List list, String str, String str2, String str3, shf shfVar, int i, Object obj) {
        if ((i & 32) != 0) {
            shfVar = null;
        }
        driveSdkView.showOfferSummary(mapAddressData, list, str, str2, str3, shfVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 showOfferSummary$lambda$2(MapAddressData mapAddressData, List list, String str, String str2, String str3, shf shfVar, efm efmVar) {
        mfm mfmVar = efmVar.b;
        if (mfmVar != null) {
            Pair pair = new Pair("starting_point", mapAddressData != null ? mapAddressData.a() : null);
            List list2 = list;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((MapAddressData) it.next()).a());
            }
            HashMap h = b.h(pair, new Pair("destinations", arrayList), new Pair("offer_id", str), new Pair("car_number", str2), new Pair("complementary_offer_id", str3), new Pair("session", shfVar != null ? shfVar.a() : null));
            ea20 ea20Var = mfmVar.b;
            if (ea20Var != null) {
                ea20Var.a("show_offer_summary", h, null);
            }
        }
        return zy11.a;
    }

    public static /* synthetic */ void start$default(DriveSdkView driveSdkView, shf shfVar, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            shfVar = null;
        }
        if ((i & 2) != 0) {
            uri = null;
        }
        driveSdkView.start(shfVar, uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 start$lambda$1(shf shfVar, Uri uri, efm efmVar) {
        mfm mfmVar = efmVar.b;
        if (mfmVar != null) {
            HashMap h = b.h(new Pair("session", shfVar != null ? shfVar.a() : null), new Pair("link", uri != null ? uri.toString() : null));
            ea20 ea20Var = mfmVar.b;
            if (ea20Var != null) {
                ea20Var.a("start", h, null);
            }
        }
        return zy11.a;
    }

    private final void whenReady(tls listener) {
        a aVar = this.legacyView;
        efm efmVar = aVar.a;
        if (efmVar != null) {
            listener.invoke(efmVar);
        } else {
            aVar.b.add(listener);
        }
    }

    @Override // io.flutter.embedding.android.FlutterViewContainer, defpackage.gtr
    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
        super.cleanUpFlutterEngine(flutterEngine);
        this.flutterEngine = null;
        efm efmVar = this.legacyView.a;
        if (efmVar != null) {
            bcz bczVar = com.yandex.mobile.drive.drive_native_features.b.A;
            bczVar.a.remove(efmVar.f);
            a9z a9zVar = efmVar.e;
            if (a9zVar != null) {
                a9zVar.a.a(null);
            }
        }
        a aVar = this.legacyView;
        aVar.a = null;
        aVar.b.clear();
    }

    @Override // io.flutter.embedding.android.FlutterViewContainer, defpackage.gtr
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);
        if (this.registerPlugins) {
            GeneratedPluginRegistrant.registerWith(flutterEngine);
        }
        this.flutterEngine = flutterEngine;
        efm efmVar = new efm(flutterEngine);
        a aVar = this.legacyView;
        aVar.a = efmVar;
        ArrayList arrayList = aVar.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(efmVar);
        }
        arrayList.clear();
    }

    public final FlutterEngine getFlutterEngine() {
        return this.flutterEngine;
    }

    public final hdm getListener() {
        efm efmVar = this.legacyView.a;
        if (efmVar != null) {
            return efmVar.a;
        }
        return null;
    }

    public final void notifySummaryCollapsed(DriveSummaryCardCollapseSource source) {
        whenReady(new zvi(24, source));
    }

    public final void notifySummaryExpanded(DriveSummaryCardExpansionSource source) {
        whenReady(new zvi(22, source));
    }

    public final void onActivityResult(int requestCode, int resultCode, Intent data) {
        FlutterEmbedViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override // io.flutter.embedding.android.FlutterViewContainer, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getActivity().getOnBackPressedDispatcher().b(this.onBackPressedCallback);
    }

    @Override // io.flutter.embedding.android.FlutterViewContainer, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.onBackPressedCallback.g();
    }

    public final void onNewIntent(Intent intent) {
        FlutterEmbedViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onNewIntent(intent);
        }
    }

    public final void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        FlutterEmbedViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    public final void onUserLeaveHint() {
        FlutterEmbedViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.onUserLeaveHint();
        }
    }

    public final void openDeeplink(Uri link) {
        whenReady(new cr7(1, link));
    }

    @Override // io.flutter.embedding.android.FlutterViewContainer, defpackage.xvc0
    public boolean popSystemNavigator() {
        this.onBackPressedCallback.h(false);
        getActivity().getOnBackPressedDispatcher().c();
        this.onBackPressedCallback.h(true);
        return true;
    }

    @Override // io.flutter.embedding.android.FlutterViewContainer, defpackage.xvc0
    public /* bridge */ /* synthetic */ void setFrameworkHandlesBack(boolean z) {
    }

    public final void setListener(hdm hdmVar) {
        whenReady(new zvi(23, hdmVar));
    }

    public final void showOfferSummary(MapAddressData startingPoint, List<MapAddressData> destinations, String offerId, String carNumber, String complementaryOfferId, shf initialSession) {
        whenReady(new at5(startingPoint, destinations, offerId, carNumber, complementaryOfferId, initialSession));
    }

    public final void start(shf initialSession, Uri link) {
        whenReady(new t8j(9, initialSession, link));
    }

    public final void startWithOffer(shf initialSession, String offerId) {
        start(initialSession, Uri.parse("yandexdrive://".concat("offers/" + offerId + "?utm_source=go_vertical")));
    }

    public final void startWithRide(shf initialSession, String sessionId) {
        start(initialSession, Uri.parse("yandexdrive://".concat("sessions/".concat(sessionId))));
    }

    public DriveSdkView(Context context, AttributeSet attributeSet, int i, s6z s6zVar) {
        this(context, attributeSet, i, s6zVar, null, false, null, null, false, 496, null);
    }

    public DriveSdkView(Context context, AttributeSet attributeSet, int i, s6z s6zVar, String str) {
        this(context, attributeSet, i, s6zVar, str, false, null, null, false, 480, null);
    }

    public DriveSdkView(Context context, AttributeSet attributeSet, int i, s6z s6zVar, String str, boolean z) {
        this(context, attributeSet, i, s6zVar, str, z, null, null, false, 448, null);
    }

    public DriveSdkView(Context context, AttributeSet attributeSet, int i, s6z s6zVar, String str, boolean z, RenderMode renderMode) {
        this(context, attributeSet, i, s6zVar, str, z, renderMode, null, false, 384, null);
    }

    public DriveSdkView(Context context, AttributeSet attributeSet, int i, s6z s6zVar, String str, boolean z, RenderMode renderMode, TransparencyMode transparencyMode) {
        this(context, attributeSet, i, s6zVar, str, z, renderMode, transparencyMode, false, 256, null);
    }

    public DriveSdkView(Context context, AttributeSet attributeSet, s6z s6zVar) {
        this(context, attributeSet, 0, s6zVar, null, false, null, null, false, 500, null);
    }

    public /* synthetic */ DriveSdkView(Context context, AttributeSet attributeSet, int i, s6z s6zVar, String str, boolean z, RenderMode renderMode, TransparencyMode transparencyMode, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, s6zVar, (i2 & 16) != 0 ? null : str, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? RenderMode.surface : renderMode, (i2 & 128) != 0 ? TransparencyMode.transparent : transparencyMode, (i2 & 256) != 0 ? true : z2);
    }

    public DriveSdkView(Context context, s6z s6zVar) {
        this(context, null, 0, s6zVar, null, false, null, null, false, 502, null);
    }
}
