package com.yandex.mobile.drive.drive_media_tools;

import defpackage.ba20;
import defpackage.bvf0;
import defpackage.ca20;
import defpackage.da20;
import defpackage.ea20;
import defpackage.ike;
import defpackage.jl40;
import defpackage.ssr;
import defpackage.tje;
import defpackage.tsr;
import defpackage.x920;

/* loaded from: classes15.dex */
public final class a implements tsr, ca20 {
    public ea20 a;
    public final b b = new b();
    public ike c;

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        this.c = bvf0.b();
        ea20 ea20Var = new ea20(ssrVar.c, "drive_media_tools");
        this.a = ea20Var;
        ea20Var.b(this);
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ike ikeVar = this.c;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        ea20 ea20Var = this.a;
        if (ea20Var == null) {
            ea20Var = null;
        }
        ea20Var.b(null);
    }

    @Override // defpackage.ca20
    public final void onMethodCall(x920 x920Var, da20 da20Var) {
        ike ikeVar = this.c;
        if (ikeVar == null) {
            ((ba20) da20Var).error("engine_detached", null, null);
            return;
        }
        if (!jl40.l(x920Var.a, "tailVideo")) {
            ((ba20) da20Var).notImplemented();
            return;
        }
        String str = (String) x920Var.a("videoUrl");
        Integer num = (Integer) x920Var.a("seconds");
        int intValue = num != null ? num.intValue() : 10;
        if (str == null) {
            ((ba20) da20Var).error("INVALID_ARGUMENTS", "Missing videoUrl parameter", null);
        } else {
            tje.N(ikeVar, null, null, new DriveMediaToolsPlugin$onMethodCall$1(this, str, intValue, da20Var, null), 3);
        }
    }
}
