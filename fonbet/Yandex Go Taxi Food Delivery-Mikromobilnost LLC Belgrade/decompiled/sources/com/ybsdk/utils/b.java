package com.ybsdk.utils;

import android.app.Activity;
import android.content.Context;
import com.ybsdk.rconfig.configs.SpoilersOnboarding;
import com.ybsdk.rconfig.configs.SpoilersOnboardingV2;
import defpackage.bwt0;
import defpackage.eja1;
import defpackage.lwt0;
import defpackage.mu31;
import defpackage.mwt0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.uvt0;
import defpackage.zvt0;

/* loaded from: classes2.dex */
public final class b implements zvt0 {
    public final Activity a;
    public final Context b;
    public final tfl0 c;
    public final uvt0 d;
    public final mu31 e;
    public final com.ybsdk.persistence.b f;
    public boolean g;
    public final SpoilersOnboarding h;
    public final SpoilersOnboardingV2 i;

    public b(Activity activity, Context context, tfl0 tfl0Var, uvt0 uvt0Var, bwt0 bwt0Var, mu31 mu31Var, com.ybsdk.persistence.b bVar, com.ybsdk.rconfig.b bVar2) {
        this.a = activity;
        this.b = context;
        this.c = tfl0Var;
        this.d = uvt0Var;
        this.e = mu31Var;
        this.f = bVar;
        this.h = (SpoilersOnboarding) bVar2.d(lwt0.a).getData();
        this.i = (SpoilersOnboardingV2) bVar2.d(mwt0.a).getData();
    }

    public final void a() {
        tje.N(eja1.s(this.e.a), null, null, new SpoilerOnboardingManagerImpl$collectNeedShowOnboardingFlow$1(this, null), 3);
    }
}
