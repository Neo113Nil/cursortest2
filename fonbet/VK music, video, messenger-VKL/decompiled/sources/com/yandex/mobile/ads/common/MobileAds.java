package com.yandex.mobile.ads.common;

import android.content.Context;
import xsna.s3q0;
import yads.gx2;
import yads.hx2;
import yads.mr0;
import yads.mv3;
import yads.oi1;
import yads.rs3;
import yads.rv1;
import yads.sv1;
import yads.uv1;

/* loaded from: classes8.dex */
public final class MobileAds {
    public static final MobileAds INSTANCE = new MobileAds();

    private MobileAds() {
    }

    public static final void enableLogging(boolean z) {
        uv1.a(z);
    }

    public static final String getLibraryVersion() {
        return "7.18.6";
    }

    public static final void initialize(Context context, InitializationListener initializationListener) {
        rs3 rs3Var = new rs3(initializationListener);
        mv3 mv3Var = new mv3(context);
        new mr0(new oi1()).a(new rv1(context, mv3Var, rs3Var), new sv1(context, mv3Var, rs3Var));
    }

    public static final void setAgeRestrictedUser(boolean z) {
        uv1.b(z);
    }

    public static final void setUserConsent(boolean z) {
        hx2 a = gx2.a();
        synchronized (hx2.j) {
            a.b = Boolean.valueOf(z);
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
