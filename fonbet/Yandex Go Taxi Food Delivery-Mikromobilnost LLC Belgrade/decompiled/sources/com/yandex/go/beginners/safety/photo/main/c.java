package com.yandex.go.beginners.safety.photo.main;

import android.content.Context;
import com.yandex.go.beginners.safety.analytics.SafeNewbiesAnalytics$SafeNewbiesUploadPhotoSource;
import defpackage.epl0;
import defpackage.fjb0;
import defpackage.fxl0;
import defpackage.gjb0;
import defpackage.ji3;
import defpackage.ohk0;
import defpackage.p1b;
import defpackage.pgd;
import defpackage.pzt0;
import defpackage.qwl0;
import defpackage.swl0;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c extends pgd {
    public final Context F;
    public final w030 G;
    public final epl0 H;
    public final ji3 I;
    public final com.yandex.go.beginners.safety.photo.main.ui.c J;
    public final com.yandex.go.beginners.safety.photo.domain.a K;
    public final fjb0 L;
    public final gjb0 M;
    public pzt0 N;
    public String O;
    public final p1b P;
    public final swl0 Q;

    public c(Context context, w030 w030Var, epl0 epl0Var, ji3 ji3Var, com.yandex.go.beginners.safety.photo.main.ui.c cVar, com.yandex.go.beginners.safety.photo.domain.a aVar, fjb0 fjb0Var, gjb0 gjb0Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = epl0Var;
        this.I = ji3Var;
        this.J = cVar;
        this.K = aVar;
        this.L = fjb0Var;
        this.M = gjb0Var;
        this.P = new p1b(cVar, new ohk0(20, this));
        this.Q = new swl0(this, 0);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        qwl0 qwl0Var = (qwl0) obj;
        super.G(qwl0Var);
        SafeNewbiesAnalytics$SafeNewbiesUploadPhotoSource safeNewbiesAnalytics$SafeNewbiesUploadPhotoSource = SafeNewbiesAnalytics$SafeNewbiesUploadPhotoSource.SafeNewbies;
        epl0 epl0Var = this.H;
        epl0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("source", safeNewbiesAnalytics$SafeNewbiesUploadPhotoSource.getEventValue());
        epl0Var.a.a("SafeNewbies.UploadPhoto.Shown", hashMap, 1, new HashMap());
        com.yandex.go.beginners.safety.photo.main.ui.c cVar = this.J;
        cVar.getClass();
        fxl0 fxl0Var = new fxl0(qwl0Var.b, qwl0Var.a);
        r0 r0Var = cVar.e;
        r0Var.getClass();
        r0Var.m(null, fxl0Var);
        this.N = tje.N(o(), null, null, new SafetyPhotoMainRouter$onAttach$1(this, null), 3);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        qwl0 qwl0Var = (qwl0) obj;
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = null;
        super.H(qwl0Var);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.P;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
