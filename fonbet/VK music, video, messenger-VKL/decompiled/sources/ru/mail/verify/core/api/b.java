package ru.mail.verify.core.api;

import android.content.Context;
import ru.mail.verify.core.api.ApplicationModule;
import xsna.d9e0;

/* loaded from: classes9.dex */
public final class b implements d9e0 {
    private final g a;
    private final h b;

    private b(g gVar, h hVar) {
        this.a = gVar;
        this.b = hVar;
    }

    public static b a(g gVar, h hVar) {
        return new b(gVar, hVar);
    }

    @Override // xsna.e9e0
    public final Object get() {
        return new a((Context) this.a.get(), (ApplicationModule.NetworkPolicyConfig) this.b.get());
    }
}
