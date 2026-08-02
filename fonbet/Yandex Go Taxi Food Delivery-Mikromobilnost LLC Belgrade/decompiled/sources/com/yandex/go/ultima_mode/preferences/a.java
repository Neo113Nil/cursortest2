package com.yandex.go.ultima_mode.preferences;

import com.yandex.go.coroutines.b;
import defpackage.fse;
import defpackage.iv11;
import defpackage.lv11;
import defpackage.mdh;
import defpackage.mth;
import defpackage.qyy0;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;

/* loaded from: classes8.dex */
public final class a {
    public final tt2 a;
    public final lv11 b;
    public final iv11 c;
    public final tpr d;

    public a(tt2 tt2Var, lv11 lv11Var, iv11 iv11Var) {
        this.a = tt2Var;
        this.b = lv11Var;
        this.c = iv11Var;
        tpr d = b.d(new mth(iv11Var.b, 4), new UltimaModePreferencesInteractor$special$$inlined$start$1(null, this));
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.d = e.t(e.F(d, mdh.b));
    }

    public final Object a(sls slsVar, ContinuationImpl continuationImpl) {
        fse fseVar;
        if (qyy0.a()) {
            this.a.getClass();
            sjh sjhVar = uyj.a;
            fseVar = mdh.b;
        } else {
            fseVar = EmptyCoroutineContext.a;
        }
        return tje.k0(fseVar, new UltimaModePreferencesInteractor$runOnBackgroundThread$2(slsVar, null), continuationImpl);
    }
}
