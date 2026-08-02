package xsna;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: TrimStrategyImpl.kt */
/* loaded from: classes16.dex */
public final class grp0 implements frp0 {
    public final izs<String, String> a;

    /* compiled from: TrimStrategyImpl.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, String> {
        public static final a b = new a(1, wqm0.class, "trim", "trim(Ljava/lang/String;)Ljava/lang/String;", 1);

        @Override // xsna.izs
        public final String invoke(String str) {
            return drm0.p0(str).toString();
        }
    }

    /* compiled from: TrimStrategyImpl.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<String, String> {
        public static final b b = new b(1, wqm0.class, "trimStart", "trimStart(Ljava/lang/String;)Ljava/lang/String;", 1);

        @Override // xsna.izs
        public final String invoke(String str) {
            return drm0.t0(str).toString();
        }
    }

    /* compiled from: TrimStrategyImpl.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<String, String> {
        public static final c b = new c(1, wqm0.class, "trimEnd", "trimEnd(Ljava/lang/String;)Ljava/lang/String;", 1);

        @Override // xsna.izs
        public final String invoke(String str) {
            return drm0.r0(str).toString();
        }
    }

    public grp0(boolean z, boolean z2) {
        this.a = (z2 && z) ? a.b : z ? b.b : z2 ? c.b : new rxc0(1);
    }

    @Override // xsna.frp0
    public final String a(String str) {
        return this.a.invoke(str);
    }
}
