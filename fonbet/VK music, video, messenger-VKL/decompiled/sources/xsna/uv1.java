package xsna;

import io.opentelemetry.api.trace.SpanKind;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AlwaysOnSampler.java */
/* loaded from: classes11.dex */
public final class uv1 implements n0h0 {
    private static final /* synthetic */ uv1[] $VALUES;
    public static final uv1 INSTANCE;

    static {
        uv1 uv1Var = new uv1("INSTANCE", 0);
        INSTANCE = uv1Var;
        $VALUES = new uv1[]{uv1Var};
    }

    public uv1() {
        throw null;
    }

    public static uv1 valueOf(String str) {
        return (uv1) Enum.valueOf(uv1.class, str);
    }

    public static uv1[] values() {
        return (uv1[]) $VALUES.clone();
    }

    @Override // xsna.n0h0
    public final String getDescription() {
        return "AlwaysOnSampler";
    }

    @Override // xsna.n0h0
    public final p0h0 shouldSample(wmj wmjVar, String str, String str2, SpanKind spanKind, q94 q94Var, List<d9z> list) {
        return hpw.a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOnSampler";
    }
}
