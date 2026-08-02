package com.yandex.messaging.internal.view.timeline.translations;

import android.util.LongSparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import defpackage.ffx;
import defpackage.fyc;
import defpackage.gwk0;
import defpackage.tje;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes15.dex */
public final class g {
    public final p a;
    public final LongSparseArray b;
    public final n0 c;
    public final fyc d;
    public final fyc e;

    public g(Lifecycle lifecycle) {
        p a = r.a(lifecycle);
        this.a = a;
        this.b = new LongSparseArray();
        this.c = ffx.c(0, 0, null, 7);
        this.d = gwk0.b();
        this.e = gwk0.b();
        tje.N(a, null, null, new TranslationsViewStateHolder$1(this, null), 3);
    }
}
