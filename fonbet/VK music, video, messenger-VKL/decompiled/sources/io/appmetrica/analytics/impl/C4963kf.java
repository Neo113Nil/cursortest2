package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.kf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4963kf implements ProtobufConverter {
    public final C5347zf a;

    public C4963kf() {
        this(new C5347zf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5272wf fromModel(@NonNull C5015mf c5015mf) {
        C5272wf c5272wf = new C5272wf();
        if (!TextUtils.isEmpty(c5015mf.a)) {
            c5272wf.a = c5015mf.a;
        }
        c5272wf.b = c5015mf.b.toString();
        c5272wf.c = this.a.fromModel(c5015mf.c).intValue();
        return c5272wf;
    }

    public C4963kf(C5347zf c5347zf) {
        this.a = c5347zf;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5015mf toModel(@NonNull C5272wf c5272wf) {
        JSONObject jSONObject;
        String str = c5272wf.a;
        String str2 = c5272wf.b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C5015mf(str, jSONObject, this.a.toModel(Integer.valueOf(c5272wf.c)));
        }
        jSONObject = new JSONObject();
        return new C5015mf(str, jSONObject, this.a.toModel(Integer.valueOf(c5272wf.c)));
    }
}
