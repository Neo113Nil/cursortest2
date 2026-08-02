package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: PostingTogglesConfig.kt */
/* loaded from: classes4.dex */
public final class cpc0 extends h170 {
    public final Object K;
    public final Object L;
    public final Object M;
    public final Object N;

    public cpc0() {
        com.vk.movika.sdk.base.model.props.a aVar = new com.vk.movika.sdk.base.model.props.a(25);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.K = msy.a(lazyThreadSafetyMode, aVar);
        this.L = msy.a(lazyThreadSafetyMode, new bpc0(0));
        this.M = msy.a(lazyThreadSafetyMode, new kcc0(1));
        this.N = msy.a(lazyThreadSafetyMode, new cy20(7));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean j() {
        return ((Boolean) this.K.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean k() {
        return ((Boolean) this.M.getValue()).booleanValue();
    }
}
