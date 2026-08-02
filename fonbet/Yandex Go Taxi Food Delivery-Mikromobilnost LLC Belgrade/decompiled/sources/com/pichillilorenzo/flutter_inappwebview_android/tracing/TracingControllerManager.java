package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import defpackage.ea20;
import defpackage.hm91;
import defpackage.pzz0;
import defpackage.qzz0;
import defpackage.rzz0;
import defpackage.szz0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class TracingControllerManager implements Disposable {
    protected static final String LOG_TAG = "TracingControllerMan";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
    public static szz0 tracingController;
    public TracingControllerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public TracingControllerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new TracingControllerChannelDelegate(this, new ea20(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    public static qzz0 buildTracingConfig(TracingSettings tracingSettings) {
        ArrayList arrayList;
        pzz0 pzz0Var = new pzz0();
        Iterator<Object> it = tracingSettings.categories.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = pzz0Var.b;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (next instanceof String) {
                arrayList.addAll(Arrays.asList((String) next));
            }
            if (next instanceof Integer) {
                pzz0Var.a = new int[]{((Integer) next).intValue()}[0] | pzz0Var.a;
            }
        }
        Integer num = tracingSettings.tracingMode;
        if (num != null) {
            pzz0Var.c = num.intValue();
        }
        return new qzz0(pzz0Var.a, pzz0Var.c, arrayList);
    }

    public static void init() {
        if (tracingController == null && hm91.d("TRACING_CONTROLLER_BASIC_USAGE")) {
            tracingController = rzz0.a;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        TracingControllerChannelDelegate tracingControllerChannelDelegate = this.channelDelegate;
        if (tracingControllerChannelDelegate != null) {
            tracingControllerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }
}
