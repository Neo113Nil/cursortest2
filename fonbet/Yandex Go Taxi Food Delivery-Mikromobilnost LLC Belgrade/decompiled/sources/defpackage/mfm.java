package defpackage;

import android.net.Uri;
import com.yandex.go.drive.delegates.b;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.mobile.drive.sdk.DriveSdkGoPluginFlutterErrorCode;
import com.yandex.mobile.drive.sdk.full.Environment;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import ru.yandex.taxi.cashback.analytics.CashbackCardContext;

/* loaded from: classes15.dex */
public final class mfm implements tsr, ca20 {
    public hdm a;
    public ea20 b;

    public mfm() {
        bfm.i.g.add(new lfm(new WeakReference(this), 0));
    }

    public final void a() {
        bfm bfmVar = bfm.i;
        HashMap hashMap = new HashMap();
        hashMap.put("headers", bfmVar.b());
        hashMap.put("is_log_enabled", (Boolean) bfmVar.f.get());
        ExecutorService executorService = g1.a;
        String g = cha1.g();
        Environment environment = (Environment) bfmVar.a.get();
        if (environment == null) {
            environment = Environment.STABLE;
        }
        if (environment == Environment.QA) {
            g = Uri.parse(g).buildUpon().appendQueryParameter("backend_cluster", "qa").build().toString();
        }
        hashMap.put("base_url", g);
        try {
            String property = System.getProperty("http.proxyHost");
            if (property != null && !evu0.J(property)) {
                String property2 = System.getProperty("http.proxyPort");
                if (property2 == null) {
                    property2 = "8080";
                }
                Integer l = bvu0.l(10, property2);
                hashMap.put("proxy", property + ":" + (l != null ? l.intValue() : 8080));
            }
        } catch (Throwable unused) {
        }
        ea20 ea20Var = this.b;
        if (ea20Var != null) {
            ea20Var.a("configure_sdk", hashMap, null);
        }
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        tt5 tt5Var = ssrVar.c;
        this.b = new ea20(tt5Var, "drive_sdk_go");
        wzt0 wzt0Var = wzt0.b;
        List asList = Arrays.asList("drive_sdk_go", 10);
        wzt0Var.getClass();
        ckn cknVar = new ckn(2);
        vzt0 vzt0Var = wzt0Var.a;
        vzt0Var.k(cknVar, "resize");
        vzt0Var.k(cknVar, asList);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(cknVar.size());
        allocateDirect.put(cknVar.a(), 0, cknVar.size());
        allocateDirect.flip();
        int remaining = allocateDirect.remaining();
        byte[] bArr = new byte[remaining];
        allocateDirect.get(bArr);
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(remaining);
        allocateDirect2.put(bArr);
        tt5Var.l("dev.flutter/channel-buffers", allocateDirect2);
        ea20 ea20Var = this.b;
        if (ea20Var != null) {
            ea20Var.b(this);
        }
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ea20 ea20Var = this.b;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
        this.b = null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        h3y h3yVar;
        b bVar;
        h3y h3yVar2;
        sls defaultModeHandler;
        sls hideHandler;
        tls draggableHandler;
        rem remVar;
        Object obj = x920Var.b;
        String str = x920Var.a;
        if (this.a == null) {
            ((ba20) da20Var).error(DriveSdkGoPluginFlutterErrorCode.MissingDelegate.getRaw(), "DriveSDK has no delegate and can't pass Flutter's requests to the client app", null);
            return;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            oy11 oy11Var = oy11.a;
            switch (hashCode) {
                case -2045519814:
                    if (str.equals("ride_started")) {
                        String str2 = (String) obj;
                        if (str2 == null) {
                            ((ba20) da20Var).error(DriveSdkGoPluginFlutterErrorCode.MissingArguments.getRaw(), str.concat(" requires rideId"), null);
                            return;
                        }
                        hdm hdmVar = this.a;
                        if (hdmVar != null) {
                            h3yVar = ((DriveHostView) ((zch) hdmVar).a).unifiedPollingRepository;
                            ((ky11) h3yVar.get()).e(str2, oy11Var);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -1367842086:
                    if (str.equals("open_support")) {
                        String str3 = (String) obj;
                        if (str3 == null) {
                            ((ba20) da20Var).error(DriveSdkGoPluginFlutterErrorCode.MissingArguments.getRaw(), str.concat(" requires link"), null);
                            return;
                        }
                        hdm hdmVar2 = this.a;
                        if (hdmVar2 != null) {
                            DriveHostView driveHostView = (DriveHostView) ((zch) hdmVar2).a;
                            bVar = driveHostView.driveAccountManager;
                            ucm b = bVar.b();
                            if (b != null) {
                                driveHostView.openSupportChat(str3, b.c);
                            }
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -977068071:
                    if (str.equals("ride_finished")) {
                        String str4 = (String) obj;
                        if (str4 == null) {
                            ((ba20) da20Var).error(DriveSdkGoPluginFlutterErrorCode.MissingArguments.getRaw(), str.concat(" requires rideId"), null);
                            return;
                        }
                        hdm hdmVar3 = this.a;
                        if (hdmVar3 != null) {
                            h3yVar2 = ((DriveHostView) ((zch) hdmVar3).a).unifiedPollingRepository;
                            ((ky11) h3yVar2.get()).b(str4, oy11Var);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case -650453791:
                    if (str.equals("default_mode")) {
                        hdm hdmVar4 = this.a;
                        if (hdmVar4 != null && (defaultModeHandler = ((DriveHostView) ((zch) hdmVar4).a).getDefaultModeHandler()) != null) {
                            defaultModeHandler.invoke();
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 679829581:
                    if (str.equals("hide_drive")) {
                        hdm hdmVar5 = this.a;
                        if (hdmVar5 != null && (hideHandler = ((DriveHostView) ((zch) hdmVar5).a).getHideHandler()) != null) {
                            hideHandler.invoke();
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 984490480:
                    if (str.equals("set_draggable")) {
                        Boolean bool = (Boolean) obj;
                        if (bool == null) {
                            ((ba20) da20Var).error(DriveSdkGoPluginFlutterErrorCode.MissingArguments.getRaw(), str.concat(" requires isDraggable"), null);
                            return;
                        }
                        hdm hdmVar6 = this.a;
                        if (hdmVar6 != null && (draggableHandler = ((DriveHostView) ((zch) hdmVar6).a).getDraggableHandler()) != null) {
                            draggableHandler.invoke(bool);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
                case 1546223215:
                    if (str.equals("open_plus")) {
                        hdm hdmVar7 = this.a;
                        if (hdmVar7 != null) {
                            remVar = ((DriveHostView) ((zch) hdmVar7).a).drivePlusRouter;
                            d49 d49Var = ((sem) remVar).a;
                            d49Var.getClass();
                            d49.d(d49Var, CashbackCardContext.DRIVE);
                        }
                        ((ba20) da20Var).success(null);
                        return;
                    }
                    break;
            }
        }
        ((ba20) da20Var).notImplemented();
    }
}
