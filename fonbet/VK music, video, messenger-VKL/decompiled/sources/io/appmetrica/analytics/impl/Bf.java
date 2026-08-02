package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class Bf implements ProtobufConverter {
    public final C5347zf a = new C5347zf();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5247vf fromModel(@NonNull Af af) {
        C5247vf c5247vf = new C5247vf();
        if (!TextUtils.isEmpty(af.a)) {
            c5247vf.a = af.a;
        }
        c5247vf.b = af.b.toString();
        c5247vf.c = af.c;
        c5247vf.d = af.d;
        c5247vf.e = this.a.fromModel(af.e).intValue();
        return c5247vf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Af toModel(@NonNull C5247vf c5247vf) {
        JSONObject jSONObject;
        String str = c5247vf.a;
        String str2 = c5247vf.b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new Af(str, jSONObject, c5247vf.c, c5247vf.d, this.a.toModel(Integer.valueOf(c5247vf.e)));
        }
        jSONObject = new JSONObject();
        return new Af(str, jSONObject, c5247vf.c, c5247vf.d, this.a.toModel(Integer.valueOf(c5247vf.e)));
    }
}
