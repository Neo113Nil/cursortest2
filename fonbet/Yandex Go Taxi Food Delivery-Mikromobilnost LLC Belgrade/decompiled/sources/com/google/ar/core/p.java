package com.google.ar.core;

import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

/* loaded from: classes11.dex */
public final class p implements l {
    public final /* synthetic */ Consumer a;
    public final /* synthetic */ q b;

    public p(q qVar, Consumer consumer) {
        this.a = consumer;
        this.b = qVar;
    }

    @Override // com.google.ar.core.l
    public final void a(ArCoreApk.Availability availability) {
        this.b.a.post(new k(this.a, availability));
    }
}
