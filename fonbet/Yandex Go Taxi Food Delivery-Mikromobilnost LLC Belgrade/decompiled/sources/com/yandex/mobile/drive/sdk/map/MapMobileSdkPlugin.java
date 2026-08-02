package com.yandex.mobile.drive.sdk.map;

import android.app.Application;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.bvf0;
import defpackage.cib1;
import defpackage.da20;
import defpackage.ea20;
import defpackage.em00;
import defpackage.i4n;
import defpackage.ike;
import defpackage.jl40;
import defpackage.klb1;
import defpackage.q4g;
import defpackage.ssr;
import defpackage.tl00;
import defpackage.tse;
import defpackage.tt5;
import defpackage.u8y;
import defpackage.v8y;
import defpackage.x920;
import defpackage.yr00;
import defpackage.zvi;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 %2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001&B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\fR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/yandex/mobile/drive/sdk/map/MapMobileSdkPlugin;", "Lcom/yandex/mobile/drive/sdk/map/MapAndroidPluginBase;", "Ltsr;", "Lca20;", "<init>", "()V", "Lx920;", "call", "Lda20;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "onLeaseMethodCall", "(Lx920;Lda20;)V", "Ltl00;", "getOrCreateHandler", "()Ltl00;", "Lssr;", "binding", "onAttachedToEngine", "(Lssr;)V", "onDetachedFromEngine", "onMethodCall", "Lea20;", "channel", "Lea20;", "geocoderChannel", "handler", "Ltl00;", "Landroid/app/Application;", "app", "Landroid/app/Application;", "Ltt5;", "binaryMessenger", "Ltt5;", "Ltse;", "scope", "Ltse;", "Companion", "em00", "drive_map_mobile_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MapMobileSdkPlugin extends MapAndroidPluginBase {
    private static u8y lease;
    private static tl00 pendingLeaseGranter;
    private Application app;
    private tt5 binaryMessenger;
    private ea20 channel;
    private ea20 geocoderChannel;
    private tl00 handler;
    private tse scope;
    public static final em00 Companion = new em00();
    private static final List<v8y> pendingRequests = new ArrayList();

    private final tl00 getOrCreateHandler() {
        tl00 tl00Var = this.handler;
        if (tl00Var != null) {
            return tl00Var;
        }
        tl00 tl00Var2 = new tl00(this.binaryMessenger);
        this.handler = tl00Var2;
        return tl00Var2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void onLeaseMethodCall(x920 call, da20 result) {
        tl00 orCreateHandler = getOrCreateHandler();
        String str = call.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1530387395:
                    if (str.equals("start_lease")) {
                        yr00 f = cib1.f(call);
                        if (f == null) {
                            result.error("message_format_error", null, null);
                            return;
                        }
                        u8y u8yVar = lease;
                        if (u8yVar == null) {
                            pendingLeaseGranter = orCreateHandler;
                            pendingRequests.add(new v8y(f, result));
                            return;
                        } else {
                            Companion.getClass();
                            String c = em00.c(orCreateHandler, u8yVar, f, true);
                            em00.b(c);
                            result.success(c);
                            return;
                        }
                    }
                    break;
                case -804429082:
                    if (str.equals("configure")) {
                        yr00 f2 = cib1.f(call);
                        if (f2 == null) {
                            result.error("message_format_error", null, null);
                            return;
                        }
                        q4g q4gVar = orCreateHandler.d;
                        if (q4gVar != null) {
                            i4n i4nVar = (i4n) q4gVar.c;
                            i4nVar.a = f2.a;
                            i4nVar.b = f2.b;
                        }
                        result.success(null);
                        return;
                    }
                    break;
                case 110550847:
                    if (str.equals("touch")) {
                        u8y u8yVar2 = lease;
                        MotionEvent e = cib1.e(call, u8yVar2 != null ? (Rect) u8yVar2.c.invoke() : null);
                        if (e == null) {
                            result.error("message_format_error", null, null);
                            return;
                        }
                        q4g q4gVar2 = orCreateHandler.d;
                        if (q4gVar2 != null) {
                            ((zvi) q4gVar2.w).invoke(e);
                        }
                        e.recycle();
                        result.success(null);
                        return;
                    }
                    break;
                case 1944971766:
                    if (str.equals("end_lease")) {
                        Companion.getClass();
                        em00.a();
                        orCreateHandler.a();
                        u8y u8yVar3 = lease;
                        if (u8yVar3 != null) {
                            u8yVar3.e = null;
                        }
                        result.success(null);
                        return;
                    }
                    break;
            }
        }
        result.notImplemented();
    }

    @Override // com.yandex.mobile.drive.sdk.map.MapAndroidPluginBase, defpackage.tsr
    public void onAttachedToEngine(ssr binding) {
        super.onAttachedToEngine(binding);
        tt5 tt5Var = binding.c;
        ea20 ea20Var = new ea20(tt5Var, "leased_map");
        this.channel = ea20Var;
        ea20Var.b(this);
        ike b = bvf0.b();
        this.binaryMessenger = tt5Var;
        this.scope = b;
        ea20 ea20Var2 = new ea20(tt5Var, "drive_geocoder_channel");
        ea20Var2.b(new a(b));
        this.geocoderChannel = ea20Var2;
        this.app = (Application) binding.a;
    }

    @Override // com.yandex.mobile.drive.sdk.map.MapAndroidPluginBase, defpackage.tsr
    public void onDetachedFromEngine(ssr binding) {
        super.onDetachedFromEngine(binding);
        ea20 ea20Var = this.channel;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
        tl00 tl00Var = this.handler;
        if (tl00Var != null) {
            tl00Var.a();
        }
        this.handler = null;
        pendingLeaseGranter = null;
        ea20 ea20Var2 = this.geocoderChannel;
        if (ea20Var2 != null) {
            ea20Var2.b(null);
        }
        tse tseVar = this.scope;
        if (tseVar != null) {
            bvf0.j(tseVar, null);
        }
        Companion.getClass();
        em00.a();
    }

    @Override // com.yandex.mobile.drive.sdk.map.MapAndroidPluginBase, defpackage.ca20
    public void onMethodCall(x920 call, da20 result) {
        if (jl40.l(klb1.a(call, "leasing"), Boolean.TRUE)) {
            onLeaseMethodCall(call, result);
        } else {
            super.onMethodCall(call, result);
        }
    }
}
