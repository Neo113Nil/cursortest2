package com.yandex.go.platform.sdk.activity;

import android.content.Intent;
import defpackage.b60;
import defpackage.ffx;
import defpackage.l50;
import defpackage.o50;
import defpackage.q40;
import defpackage.sb2;
import defpackage.w7w;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class b implements b60, l50, o50 {
    public final n0 a = ffx.c(0, 16, null, 5);
    public final kotlinx.coroutines.channels.a b = sb2.a(16, null, null, 6);

    @Override // defpackage.l50
    public final Object a(int i, ContinuationImpl continuationImpl) {
        return e.x(this.a, new ExternalActivityResultController$awaitResult$2(i, null), continuationImpl);
    }

    @Override // defpackage.o50
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.a.g(new q40(i, i2, intent));
    }

    @Override // defpackage.b60
    public final void startActivityForResult(Intent intent, int i) {
        this.b.d(new w7w(i, intent));
    }
}
