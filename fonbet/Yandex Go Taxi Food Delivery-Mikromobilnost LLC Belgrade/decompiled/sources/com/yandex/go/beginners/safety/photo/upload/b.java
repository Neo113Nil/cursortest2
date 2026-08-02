package com.yandex.go.beginners.safety.photo.upload;

import android.content.Context;
import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import defpackage.aye0;
import defpackage.fyl0;
import defpackage.ji3;
import defpackage.mu5;
import defpackage.mxl0;
import defpackage.ohk0;
import defpackage.pgd;
import defpackage.pzt0;
import defpackage.rxl0;
import defpackage.swl0;
import defpackage.tje;
import defpackage.w030;
import defpackage.wfd;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class b extends pgd {
    public final Context F;
    public final w030 G;
    public final com.yandex.go.beginners.safety.photo.domain.a H;
    public final com.yandex.go.beginners.safety.photo.upload.ui.b I;
    public final com.yandex.go.beginners.safety.photo.upload.ui.a J;
    public final ji3 K;
    public final rxl0 L;
    public final aye0 M;
    public pzt0 N;
    public final mu5 O;
    public final swl0 P;

    public b(Context context, w030 w030Var, com.yandex.go.beginners.safety.photo.domain.a aVar, com.yandex.go.beginners.safety.photo.upload.ui.b bVar, com.yandex.go.beginners.safety.photo.upload.ui.a aVar2, ji3 ji3Var) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = aVar;
        this.I = bVar;
        this.J = aVar2;
        this.K = ji3Var;
        this.L = new rxl0();
        this.M = new aye0(26, this);
        this.O = new mu5(new ohk0(22, this));
        this.P = new swl0(this, 1);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        mxl0 mxl0Var = (mxl0) obj;
        super.G(mxl0Var);
        com.yandex.go.beginners.safety.photo.upload.ui.b bVar = this.I;
        bVar.getClass();
        fyl0 fyl0Var = new fyl0(mxl0Var.b, mxl0Var.a);
        r0 r0Var = bVar.c;
        r0Var.getClass();
        r0Var.m(null, fyl0Var);
        com.yandex.go.beginners.safety.photo.upload.ui.a aVar = this.J;
        SafetyNewbiesVerificationExperiment.PhotoStep photoStep = mxl0Var.b;
        aVar.getClass();
        Long l = photoStep.c.b;
        aVar.e = l != null ? l.longValue() : 1000L;
        Long l2 = photoStep.e.c;
        aVar.f = l2 != null ? l2.longValue() : 1000L;
        this.N = tje.N(o(), null, null, new SafetyPhotoUploadRouter$onAttach$1(this, null), 3);
        this.J.a(o(), mxl0Var.c, this.M, this.L);
    }

    @Override // defpackage.pgd, defpackage.h55
    public final void H(Object obj) {
        mxl0 mxl0Var = (mxl0) obj;
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = null;
        super.H(mxl0Var);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.O;
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
