package defpackage;

import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class lq71 implements jms {
    public final /* synthetic */ ot71 a;

    public lq71(ot71 ot71Var) {
        this.a = ot71Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lq71) {
            return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.a, ot71.class, "trackVerificationNotExecuted", "trackVerificationNotExecuted(Lcom/yandex/mobile/ads/video/playback/tracker/verification/omsdk/error/VerificationNotExecutedException;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
