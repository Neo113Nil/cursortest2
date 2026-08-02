package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.c5g;
import xsna.epx;

/* loaded from: classes8.dex */
public final class F implements Converter {
    public final String a = "request_state";
    public final String b = "type";
    public final String c = "last_attempt";
    public final String d = "prev_attempt_result";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String fromModel(List<E> list) {
        ?? r2;
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        String str = this.a;
        if (list != null) {
            r2 = new ArrayList(c5g.u(list, 10));
            for (E e : list) {
                try {
                    jSONObject = new JSONObject();
                    jSONObject.put(this.b, e.a);
                    jSONObject.put(this.c, e.b);
                    jSONObject.put(this.d, z.a(e.c));
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
                r2.add(jSONObject);
            }
        } else {
            r2 = EmptyList.b;
        }
        jSONObject2.put(str, new JSONArray((Collection) r2));
        return jSONObject2.toString();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<E> toModel(String str) {
        JSONArray optJSONArray;
        E e;
        int i;
        try {
            ArrayList arrayList = new ArrayList();
            if (str == null || (optJSONArray = new JSONObject(str).optJSONArray(this.a)) == null) {
                return arrayList;
            }
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    try {
                        String string = optJSONObject.getString(this.b);
                        long j = optJSONObject.getLong(this.c);
                        String string2 = optJSONObject.getString(this.d);
                        int[] b = A.b(4);
                        int length2 = b.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                i = 0;
                                break;
                            }
                            i = b[i3];
                            if (epx.f(z.a(i), string2)) {
                                break;
                            }
                            i3++;
                        }
                        if (i == 0) {
                            i = 1;
                        }
                        e = new E(string, j, i);
                    } catch (Throwable unused) {
                        e = null;
                    }
                    if (e != null) {
                        arrayList.add(e);
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return EmptyList.b;
        }
    }
}
