package com.yandex.go.platform.sdk.activity;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import defpackage.b60;
import defpackage.eja1;
import defpackage.ffx;
import defpackage.l50;
import defpackage.o50;
import defpackage.q40;
import defpackage.tje;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes13.dex */
public final class a implements b60, l50, o50 {
    public final ComponentActivity a;
    public final b b;
    public final n0 c = ffx.c(0, 32, null, 5);

    public a(ComponentActivity componentActivity, b bVar) {
        this.a = componentActivity;
        this.b = bVar;
        tje.N(eja1.s(componentActivity), null, null, new ActivityResultController$observeExternalIntents$1(this, null), 3);
    }

    @Override // defpackage.l50
    public final Object a(int i, ContinuationImpl continuationImpl) {
        return e.x(this.c, new ActivityResultController$awaitResult$2(i, null), continuationImpl);
    }

    @Override // defpackage.o50
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.c.g(new q40(i, i2, intent));
        this.b.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.b60
    public final void startActivityForResult(Intent intent, int i) {
        this.a.startActivityForResult(intent, i);
    }
}
