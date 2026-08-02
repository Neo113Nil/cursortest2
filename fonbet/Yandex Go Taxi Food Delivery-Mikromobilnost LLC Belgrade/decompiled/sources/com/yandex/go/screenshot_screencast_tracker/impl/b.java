package com.yandex.go.screenshot_screencast_tracker.impl;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.screenshot_screencast_tracker.impl.trackers.h;
import defpackage.h3y;
import defpackage.jy60;
import defpackage.rfp0;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes8.dex */
public final class b implements jy60 {
    public final tse a;
    public final Lifecycle b;
    public final h c;
    public final rfp0 d;
    public final h3y e;
    public final h3y f;

    public b(tse tseVar, Lifecycle lifecycle, h hVar, rfp0 rfp0Var, h3y h3yVar, h3y h3yVar2) {
        this.a = tseVar;
        this.b = lifecycle;
        this.c = hVar;
        this.d = rfp0Var;
        this.e = h3yVar;
        this.f = h3yVar2;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ScreenshotAndScreencastInteractor";
    }

    @Override // defpackage.jy60
    public final void h() {
        ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1 screenshotAndScreencastInteractor$onFirstContentfulPaint$1 = new ScreenshotAndScreencastInteractor$onFirstContentfulPaint$1(this, null);
        tse tseVar = this.a;
        tje.N(tseVar, null, null, screenshotAndScreencastInteractor$onFirstContentfulPaint$1, 3);
        tje.N(tseVar, null, null, new ScreenshotAndScreencastInteractor$onFirstContentfulPaint$2(this, null), 3);
    }
}
