package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import defpackage.da20;
import defpackage.ea20;
import defpackage.hm91;
import defpackage.szz0;
import defpackage.x920;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.Executors;

/* loaded from: classes11.dex */
public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
    private TracingControllerManager tracingControllerManager;

    public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager, ea20 ea20Var) {
        super(ea20Var);
        this.tracingControllerManager = tracingControllerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.IChannelDelegate, defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        szz0 szz0Var;
        FileOutputStream fileOutputStream;
        TracingControllerManager.init();
        szz0Var = TracingControllerManager.tracingController;
        String str = x920Var.a;
        str.getClass();
        switch (str) {
            case "isTracing":
                if (szz0Var == null) {
                    da20Var.success(Boolean.FALSE);
                    break;
                } else {
                    da20Var.success(Boolean.valueOf(szz0Var.a()));
                    break;
                }
            case "stop":
                if (szz0Var != null && hm91.d("TRACING_CONTROLLER_BASIC_USAGE")) {
                    String str2 = (String) x920Var.a("filePath");
                    if (str2 != null) {
                        try {
                            fileOutputStream = new FileOutputStream(str2);
                        } catch (FileNotFoundException unused) {
                            da20Var.success(Boolean.FALSE);
                            return;
                        }
                    } else {
                        fileOutputStream = null;
                    }
                    da20Var.success(Boolean.valueOf(szz0Var.c(fileOutputStream, Executors.newSingleThreadExecutor())));
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
            case "start":
                if (szz0Var != null && hm91.d("TRACING_CONTROLLER_BASIC_USAGE")) {
                    Map<String, Object> map = (Map) x920Var.a("settings");
                    TracingSettings tracingSettings = new TracingSettings();
                    tracingSettings.parse2(map);
                    szz0Var.b(TracingControllerManager.buildTracingConfig(tracingSettings));
                    da20Var.success(Boolean.TRUE);
                    break;
                } else {
                    da20Var.success(Boolean.FALSE);
                    break;
                }
            default:
                da20Var.notImplemented();
                break;
        }
    }
}
