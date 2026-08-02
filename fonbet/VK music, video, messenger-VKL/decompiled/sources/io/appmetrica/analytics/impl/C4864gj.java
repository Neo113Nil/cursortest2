package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.gj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4864gj extends AbstractC4733bh {
    public final Df b;

    public C4864gj(@NonNull C4927j5 c4927j5) {
        this(c4927j5, C5342za.k().t());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4733bh
    public final boolean a(@NonNull C4722b6 c4722b6) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(c4722b6.getValue()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObject = null;
        }
        this.b.b(Af.a(jSONObject));
        return false;
    }

    public C4864gj(C4927j5 c4927j5, Df df) {
        super(c4927j5);
        this.b = df;
    }
}
