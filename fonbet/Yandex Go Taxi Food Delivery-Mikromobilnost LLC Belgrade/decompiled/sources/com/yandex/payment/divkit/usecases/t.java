package com.yandex.payment.divkit.usecases;

import android.content.SharedPreferences;
import com.yandex.payment.common.sbp.SbpOperation;
import defpackage.oy90;
import defpackage.tem0;
import defpackage.vv90;
import defpackage.w511;

/* loaded from: classes2.dex */
public final class t {
    public final oy90 a;
    public final vv90 b;
    public final SharedPreferences c;
    public final tem0 d;

    public t(oy90 oy90Var, vv90 vv90Var, SharedPreferences sharedPreferences, tem0 tem0Var) {
        this.a = oy90Var;
        this.b = vv90Var;
        this.c = sharedPreferences;
        this.d = tem0Var;
    }

    public final kotlinx.coroutines.flow.b a(SbpOperation sbpOperation) {
        if (sbpOperation instanceof SbpOperation.BindSbpToken) {
            return kotlinx.coroutines.flow.e.g(new SbpUseCaseImpl$getSubNspkBank$1(this, null));
        }
        if (sbpOperation.equals(SbpOperation.NewTokenPay.INSTANCE) || sbpOperation.equals(SbpOperation.Pay.INSTANCE)) {
            return kotlinx.coroutines.flow.e.g(new SbpUseCaseImpl$getFullBanks$1(this, null));
        }
        w511.b();
        return null;
    }
}
