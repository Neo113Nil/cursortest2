package com.yandex.go.intentprocessor;

import android.app.Activity;
import defpackage.c8w;
import defpackage.jy60;
import defpackage.tje;
import defpackage.tse;

/* loaded from: classes.dex */
public final class b implements jy60 {
    public final tse a;
    public final Activity b;
    public final c8w c;

    public b(tse tseVar, Activity activity, c8w c8wVar) {
        this.a = tseVar;
        this.b = activity;
        this.c = c8wVar;
    }

    @Override // defpackage.s150
    public final String getName() {
        return "IntentProcessorOnCreateListener";
    }

    @Override // defpackage.jy60
    public final void h() {
        tje.N(this.a, null, null, new IntentProcessorOnCreateListener$onFirstContentfulPaint$1(this, null), 3);
    }
}
