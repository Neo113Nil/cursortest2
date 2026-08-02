package com.yandex.mobile.drive.account_manager;

import defpackage.ba20;
import defpackage.bvf0;
import defpackage.ca20;
import defpackage.da20;
import defpackage.ea20;
import defpackage.hzk;
import defpackage.ike;
import defpackage.ssr;
import defpackage.tje;
import defpackage.tsr;
import defpackage.ucm;
import defpackage.x920;
import defpackage.xm91;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes8.dex */
public final class a implements tsr, ca20 {
    public static hzk c;
    public ea20 a;
    public ike b;

    public static final void a(a aVar, da20 da20Var, Exception exc) {
        aVar.getClass();
        if (exc instanceof CancellationException) {
            da20Var.error("cancel", null, null);
        } else {
            da20Var.error("error", exc.getMessage(), null);
        }
    }

    public static final HashMap b(a aVar, ucm ucmVar) {
        aVar.getClass();
        return b.h(new Pair("userId", Long.valueOf(ucmVar.b)), new Pair("authToken", ucmVar.c), new Pair("passport", ucmVar.d.getRaw()));
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.b = bvf0.b();
        ea20 ea20Var = new ea20(ssrVar.a(), "drive_account_manager");
        this.a = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ike ikeVar = this.b;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        ea20 ea20Var = this.a;
        if (ea20Var != null) {
            ea20Var.b(null);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        hzk hzkVar = c;
        ike ikeVar = this.b;
        if (ikeVar == null) {
            ((ba20) da20Var).error("engine_detached", null, null);
        }
        if (hzkVar == null) {
            ((ba20) da20Var).error("invalid_setup", null, null);
            return;
        }
        String str = x920Var.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1073047595:
                    if (str.equals("getCurrentAuthData")) {
                        tje.N(ikeVar, null, null, new DriveSdkAccountManagerPlugin$onMethodCall$4(hzkVar, da20Var, this, null), 3);
                        break;
                    }
                    break;
                case -153013943:
                    if (str.equals("setCurrentAuthData")) {
                        String str2 = (String) xm91.a(x920Var, "authToken");
                        if (str2 != null) {
                            tje.N(ikeVar, null, null, new DriveSdkAccountManagerPlugin$onMethodCall$3(hzkVar, str2, da20Var, this, null), 3);
                            break;
                        } else {
                            ((ba20) da20Var).error("invalid_message", null, null);
                            break;
                        }
                    }
                    break;
                case -69544532:
                    if (str.equals("getAuthorizationUrl")) {
                        String str3 = (String) xm91.a(x920Var, "url");
                        if (str3 != null) {
                            tje.N(ikeVar, null, null, new DriveSdkAccountManagerPlugin$onMethodCall$1(hzkVar, str3, da20Var, this, null), 3);
                            break;
                        } else {
                            ((ba20) da20Var).error("invalid_message", null, null);
                            break;
                        }
                    }
                    break;
                case 968384691:
                    if (str.equals("pickAuthData")) {
                        tje.N(ikeVar, null, null, new DriveSdkAccountManagerPlugin$onMethodCall$2(hzkVar, da20Var, this, null), 3);
                        break;
                    }
                    break;
            }
        }
    }
}
