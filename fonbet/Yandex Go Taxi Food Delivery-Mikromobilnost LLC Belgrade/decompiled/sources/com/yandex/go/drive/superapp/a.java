package com.yandex.go.drive.superapp;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.drive.sdkintegration.domain.session.e;
import defpackage.jy60;
import defpackage.kfm;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes.dex */
public final class a implements jy60 {
    public final e a;
    public final kfm b;
    public final tse c;
    public final Lifecycle d;

    public a(e eVar, kfm kfmVar, tse tseVar, Lifecycle lifecycle) {
        this.a = eVar;
        this.b = kfmVar;
        this.c = tseVar;
        this.d = lifecycle;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "DriveOrderActivityLifecycleListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.c, null, null, new DriveOrderActivityLifecycleListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
