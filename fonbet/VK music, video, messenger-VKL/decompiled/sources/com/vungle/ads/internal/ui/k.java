package com.vungle.ads.internal.ui;

import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class k implements com.vungle.ads.internal.presenter.y {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    public final Pair a(Intent intent) {
        Object failure;
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        l lVar = this.a;
        try {
            atomicBoolean2 = lVar.g;
            atomicBoolean2.set(true);
            lVar.startActivityForResult(intent, 10001);
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        l lVar2 = this.a;
        Throwable a = Result.a(failure);
        if (a == null) {
            return new Pair(Boolean.TRUE, null);
        }
        atomicBoolean = lVar2.g;
        atomicBoolean.set(false);
        return new Pair(Boolean.FALSE, a.getLocalizedMessage());
    }
}
