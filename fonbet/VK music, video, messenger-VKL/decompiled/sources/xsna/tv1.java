package xsna;

import io.opentelemetry.api.trace.SpanKind;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AlwaysOffSampler.java */
/* loaded from: classes11.dex */
public final class tv1 implements n0h0 {
    private static final /* synthetic */ tv1[] $VALUES;
    public static final tv1 INSTANCE;

    static {
        tv1 tv1Var = new tv1("INSTANCE", 0);
        INSTANCE = tv1Var;
        $VALUES = new tv1[]{tv1Var};
    }

    public tv1() {
        throw null;
    }

    public static tv1 valueOf(String str) {
        return (tv1) Enum.valueOf(tv1.class, str);
    }

    public static tv1[] values() {
        return (tv1[]) $VALUES.clone();
    }

    @Override // xsna.n0h0
    public final String getDescription() {
        return "AlwaysOffSampler";
    }

    @Override // xsna.n0h0
    public final p0h0 shouldSample(wmj wmjVar, String str, String str2, SpanKind spanKind, q94 q94Var, List<d9z> list) {
        return hpw.b;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "AlwaysOffSampler";
    }
}
