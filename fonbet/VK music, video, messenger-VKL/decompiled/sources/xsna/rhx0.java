package xsna;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: ApiMethodExt.kt */
/* loaded from: classes2.dex */
public final class rhx0<T> implements xy2<T> {
    public final String a;
    public final String b;
    public final String c;
    public final Map<String, String> d;
    public final h7 e;

    public rhx0(String str, String str2, String str3, LinkedHashMap linkedHashMap, h7 h7Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = linkedHashMap;
        this.e = h7Var;
    }

    @Override // xsna.xy2
    public final b03<T> a() {
        return this.e;
    }

    @Override // xsna.xy2
    public final String b() {
        return this.a;
    }

    @Override // xsna.xy2
    public final String c() {
        return this.c;
    }

    @Override // xsna.xy2
    public final String d() {
        return this.b;
    }

    @Override // xsna.xy2
    public final f03<T> e() {
        throw new IllegalStateException("Stream parsing is not supported for WebSocket-routed IM calls");
    }

    @Override // xsna.xy2
    public final Map<String, String> getParamsMap() {
        return this.d;
    }
}
