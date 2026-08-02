package com.yandex.mobile.drive.sdk.map;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import com.yandex.mapkit.MapKit;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.map.MapType;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.OffscreenMapWindow;
import com.yandex.mapkit.mapview.MapTexture;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.ca20;
import defpackage.cib1;
import defpackage.da20;
import defpackage.ea20;
import defpackage.g8e;
import defpackage.gt00;
import defpackage.i4n;
import defpackage.j73;
import defpackage.jl40;
import defpackage.kht;
import defpackage.klb1;
import defpackage.kzo;
import defpackage.l40;
import defpackage.lbp0;
import defpackage.lht;
import defpackage.m3z;
import defpackage.ny61;
import defpackage.r30;
import defpackage.ssr;
import defpackage.tcc;
import defpackage.tsr;
import defpackage.tt5;
import defpackage.vi00;
import defpackage.wrr;
import defpackage.wsr;
import defpackage.x920;
import defpackage.xuy0;
import defpackage.yr00;
import io.flutter.embedding.engine.renderer.f;
import io.flutter.view.TextureRegistry$SurfaceTextureEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0006J\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ\u001f\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0006J\u0017\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010(\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/yandex/mobile/drive/sdk/map/MapAndroidPluginBase;", "Ltsr;", "Lr30;", "Lca20;", "Landroid/content/ComponentCallbacks2;", "<init>", "()V", "Ll40;", "binding", "Lzy11;", "attach", "(Ll40;)V", "detach", "Lssr;", "onAttachedToEngine", "(Lssr;)V", "onAttachedToActivity", "onDetachedFromActivityForConfigChanges", "onReattachedToActivityForConfigChanges", "onDetachedFromActivity", "onDetachedFromEngine", "Lx920;", "call", "Lda20;", TarifficatorScenarioActivity.RESULT_KEY, "onMethodCall", "(Lx920;Lda20;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "", "level", "onTrimMemory", "(I)V", "Landroid/app/Application;", "app", "Landroid/app/Application;", "Lxuy0;", "textureRegistry", "Lxuy0;", "Ltt5;", "binaryMessenger", "Ltt5;", "Lea20;", "channel", "Lea20;", "Lgt00;", "handler", "Lgt00;", "Lcom/yandex/mobile/drive/sdk/map/tools/a;", "mapStylizer", "Lcom/yandex/mobile/drive/sdk/map/tools/a;", "drive_map_mobile_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public class MapAndroidPluginBase implements tsr, r30, ca20, ComponentCallbacks2 {
    private Application app;
    private tt5 binaryMessenger;
    private ea20 channel;
    private gt00 handler;
    private com.yandex.mobile.drive.sdk.map.tools.a mapStylizer;
    private xuy0 textureRegistry;

    private final void attach(l40 binding) {
        if (this.handler != null) {
            return;
        }
        ea20 ea20Var = this.channel;
        if (ea20Var != null) {
            ea20Var.b(this);
        }
        Activity activity = (Activity) ((wrr) binding).b;
        Application application = activity.getApplication();
        xuy0 xuy0Var = this.textureRegistry;
        tt5 tt5Var = this.binaryMessenger;
        com.yandex.mobile.drive.sdk.map.tools.a aVar = this.mapStylizer;
        if (aVar != null) {
            this.handler = new gt00(application, activity, xuy0Var, tt5Var, aVar);
        } else {
            ny61.g("Required value was null.");
        }
    }

    private final void detach() {
        ea20 ea20Var = this.channel;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
        gt00 gt00Var = this.handler;
        if (gt00Var != null) {
            LinkedHashMap linkedHashMap = gt00Var.f;
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                gt00.a((vi00) ((Map.Entry) it.next()).getValue());
            }
            linkedHashMap.clear();
        }
        this.handler = null;
    }

    @Override // defpackage.r30
    public void onAttachedToActivity(l40 binding) {
        attach(binding);
    }

    @Override // defpackage.tsr
    public void onAttachedToEngine(ssr binding) {
        Application application = (Application) binding.a;
        tt5 tt5Var = binding.c;
        this.channel = new ea20(tt5Var, "drive_map");
        this.textureRegistry = binding.d;
        this.binaryMessenger = tt5Var;
        application.registerComponentCallbacks(this);
        this.app = application;
        this.mapStylizer = new com.yandex.mobile.drive.sdk.map.tools.a(application.getResources().getAssets());
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
    }

    @Override // defpackage.r30
    public void onDetachedFromActivity() {
        detach();
    }

    @Override // defpackage.r30
    public void onDetachedFromActivityForConfigChanges() {
        detach();
    }

    @Override // defpackage.tsr
    public void onDetachedFromEngine(ssr binding) {
        ((Application) binding.a).unregisterComponentCallbacks(this);
        detach();
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public void onMethodCall(x920 call, da20 result) {
        SurfaceTexture surfaceTexture;
        MapTexture mapTexture;
        OffscreenMapWindow offscreenMapWindow;
        wsr wsrVar;
        String str;
        MapTexture mapTexture2;
        MapWindow mapWindow;
        gt00 gt00Var = this.handler;
        if (gt00Var == null) {
            result.error("illegal_state", "Plugin isn't configured properly", null);
            return;
        }
        LinkedHashMap linkedHashMap = gt00Var.f;
        String str2 = call.a;
        if (str2 != null) {
            switch (str2.hashCode()) {
                case -804429082:
                    if (str2.equals("configure")) {
                        String str3 = (String) klb1.a(call, "mapId");
                        yr00 f = cib1.f(call);
                        if (str3 == null || f == null) {
                            result.error("message_format_error", null, null);
                            return;
                        }
                        vi00 vi00Var = (vi00) linkedHashMap.get(str3);
                        if (vi00Var != null) {
                            int i = f.a;
                            int i2 = f.b;
                            TextureRegistry$SurfaceTextureEntry textureRegistry$SurfaceTextureEntry = vi00Var.b;
                            if (textureRegistry$SurfaceTextureEntry != null && (surfaceTexture = textureRegistry$SurfaceTextureEntry.surfaceTexture()) != null) {
                                surfaceTexture.setDefaultBufferSize(i, i2);
                            }
                            MapTexture mapTexture3 = vi00Var.a;
                            if (mapTexture3 != null) {
                                mapTexture3.onTextureSizeChanged(i, i2);
                            }
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 110550847:
                    if (str2.equals("touch")) {
                        String str4 = (String) klb1.a(call, "mapId");
                        MotionEvent e = cib1.e(call, null);
                        if (str4 == null || e == null) {
                            result.error("message_format_error", null, null);
                            return;
                        }
                        vi00 vi00Var2 = (vi00) linkedHashMap.get(str4);
                        if (vi00Var2 != null && (mapTexture = vi00Var2.a) != null) {
                            mapTexture.onTouchEvent(e);
                        }
                        e.recycle();
                        result.success(null);
                        return;
                    }
                    break;
                case 871091088:
                    if (str2.equals("initialize")) {
                        yr00 f2 = cib1.f(call);
                        if (f2 == null) {
                            result.error("message_format_error", null, null);
                            return;
                        }
                        String str5 = (String) klb1.a(call, "offscreenMapId");
                        boolean l = jl40.l(klb1.b(call, "useDefaultStyle"), Boolean.FALSE);
                        int i3 = f2.a;
                        int i4 = f2.b;
                        if (str5 != null) {
                            OffscreenMapWindow createOffscreenMapWindow = MapKitFactory.getInstance().createOffscreenMapWindow(i3, i4);
                            mapWindow = createOffscreenMapWindow.getMapWindow();
                            com.yandex.mapkit.map.Map map = mapWindow.getMap();
                            map.setMapType(MapType.VECTOR_MAP);
                            map.setModelsEnabled(false);
                            map.set2DMode(true);
                            mapTexture2 = null;
                            wsrVar = null;
                            str = str5;
                            offscreenMapWindow = createOffscreenMapWindow;
                        } else {
                            wsr c = ((f) gt00Var.c).c();
                            String valueOf = String.valueOf(c.a);
                            MapTexture mapTexture4 = new MapTexture(gt00Var.b, i3, i4);
                            mapTexture4.setTexture(c.b.surfaceTexture(), i3, i4);
                            offscreenMapWindow = null;
                            wsrVar = c;
                            str = valueOf;
                            mapTexture2 = mapTexture4;
                            mapWindow = mapTexture4.getMapWindow();
                        }
                        kzo kzoVar = new kzo(gt00Var.d, g8e.o("map_view_", str));
                        i4n i4nVar = new i4n(mapWindow, new m3z(), null, i3, i4);
                        String str6 = str;
                        MapTexture mapTexture5 = mapTexture2;
                        List A = j73.A(new lbp0[]{new com.yandex.mobile.drive.sdk.map.handlers.a(i4nVar, null, kzoVar, offscreenMapWindow, !l ? gt00Var.e : null), mapTexture5 != null ? new lht(gt00Var.a, mapTexture5) : null});
                        ArrayList arrayList = new ArrayList(tcc.n(A, 10));
                        Iterator it = A.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((lbp0) it.next()).a());
                        }
                        linkedHashMap.put(str6, new vi00(str6, mapTexture5, wsrVar, kzoVar, i4nVar, new kht(3, arrayList)));
                        result.success(kotlin.collections.b.h(str5 == null ? new Pair("texture_id", str6) : new Pair("offscreen_id", str5)));
                        return;
                    }
                    break;
                case 1275675573:
                    if (str2.equals("onAppResumed")) {
                        MapKit mapKitFactory = MapKitFactory.getInstance();
                        if (mapKitFactory != null) {
                            mapKitFactory.onStart();
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 1365729168:
                    if (str2.equals("onAppPaused")) {
                        MapKit mapKitFactory2 = MapKitFactory.getInstance();
                        if (mapKitFactory2 != null) {
                            mapKitFactory2.onStop();
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 1671767583:
                    if (str2.equals("dispose")) {
                        String str7 = (String) klb1.a(call, "mapId");
                        if (str7 == null) {
                            result.error("message_format_error", null, null);
                            return;
                        }
                        vi00 vi00Var3 = (vi00) linkedHashMap.remove(str7);
                        if (vi00Var3 != null) {
                            gt00.a(vi00Var3);
                        }
                        result.success(null);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // defpackage.r30
    public void onReattachedToActivityForConfigChanges(l40 binding) {
        attach(binding);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        xuy0 xuy0Var = this.textureRegistry;
        if (xuy0Var != null) {
            ((f) xuy0Var).d(level);
        }
    }
}
