package xsna;

import kotlin.jvm.internal.Ref$FloatRef;
import xsna.miq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jiq implements izs {
    public final /* synthetic */ Ref$FloatRef b;
    public final /* synthetic */ float c;
    public final /* synthetic */ kiq d;

    public /* synthetic */ jiq(Ref$FloatRef ref$FloatRef, float f, kiq kiqVar) {
        this.b = ref$FloatRef;
        this.c = f;
        this.d = kiqVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Ref$FloatRef ref$FloatRef = this.b;
        ref$FloatRef.element += this.c;
        kiq kiqVar = this.d;
        miq miqVar = kiqVar.b;
        kiqVar.c.invoke(Float.valueOf(epx.f(miqVar, miq.a.a) ? miqVar.a(ref$FloatRef.element) : ref$FloatRef.element));
        return s3q0.a;
    }
}
