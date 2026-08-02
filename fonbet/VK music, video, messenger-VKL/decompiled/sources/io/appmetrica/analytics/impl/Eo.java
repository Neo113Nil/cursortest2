package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Eo implements Do {
    public final O8 a;

    public Eo() {
        this(new O8());
    }

    @Override // io.appmetrica.analytics.impl.Do
    @NonNull
    public final byte[] a(@NonNull Z8 z8, @NonNull C5224uh c5224uh) {
        if (!((C4927j5) c5224uh.l).B() && !TextUtils.isEmpty(z8.b)) {
            try {
                JSONObject jSONObject = new JSONObject(z8.b);
                jSONObject.remove("preloadInfo");
                z8.b = jSONObject.toString();
            } catch (Throwable unused) {
            }
        }
        return this.a.a(z8, c5224uh);
    }

    public Eo(O8 o8) {
        this.a = o8;
    }
}
