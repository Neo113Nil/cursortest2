package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u5i0 implements izs {
    public final /* synthetic */ wh50 b;
    public final /* synthetic */ wh50 c;
    public final /* synthetic */ Ref$FloatRef d;
    public final /* synthetic */ Ref$FloatRef e;
    public final /* synthetic */ wh50 f;
    public final /* synthetic */ awf g;

    public /* synthetic */ u5i0(wh50 wh50Var, wh50 wh50Var2, Ref$FloatRef ref$FloatRef, Ref$FloatRef ref$FloatRef2, wh50 wh50Var3, awf awfVar) {
        this.b = wh50Var;
        this.c = wh50Var2;
        this.d = ref$FloatRef;
        this.e = ref$FloatRef2;
        this.f = wh50Var3;
        this.g = awfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        float floatValue = ((Float) obj).floatValue();
        wh50 wh50Var = this.b;
        float floatValue2 = ((Number) wh50Var.getValue()).floatValue() + floatValue;
        wh50 wh50Var2 = this.c;
        wh50Var.setValue(Float.valueOf(((Number) wh50Var2.getValue()).floatValue() + floatValue2));
        wh50Var2.setValue(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        float floatValue3 = ((Number) wh50Var.getValue()).floatValue();
        Ref$FloatRef ref$FloatRef = this.d;
        float f = ref$FloatRef.element;
        Ref$FloatRef ref$FloatRef2 = this.e;
        float f2 = swe0.f(floatValue3, f, ref$FloatRef2.element);
        izs izsVar = (izs) this.f.getValue();
        float f3 = ref$FloatRef.element;
        float f4 = ref$FloatRef2.element;
        awf awfVar = this.g;
        izsVar.invoke(Float.valueOf(q6x.z(Float.valueOf(awfVar.b).floatValue(), Float.valueOf(awfVar.c).floatValue(), c6i0.e(f3, f4, f2))));
        return s3q0.a;
    }
}
