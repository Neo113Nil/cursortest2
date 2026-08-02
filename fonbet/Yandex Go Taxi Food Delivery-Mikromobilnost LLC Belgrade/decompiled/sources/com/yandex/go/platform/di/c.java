package com.yandex.go.platform.di;

import androidx.lifecycle.p;
import defpackage.dst;
import defpackage.tje;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public final class c implements dst {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public final Object a(Continuation continuation) {
        d dVar = this.a;
        return tje.k0(((p) dVar.e.getLifecycleScope()).b, new PlatformViewComponent$uploadImagePermissionsListener$1$1(dVar, null), continuation);
    }
}
