package xsna;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.xb30;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class zb30 implements izs {
    public final /* synthetic */ xb30 b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Ref$FloatRef d;
    public final /* synthetic */ zhh0 e;
    public final /* synthetic */ Ref$BooleanRef f;

    public /* synthetic */ zb30(xb30 xb30Var, Ref$ObjectRef ref$ObjectRef, Ref$FloatRef ref$FloatRef, zhh0 zhh0Var, Ref$BooleanRef ref$BooleanRef) {
        this.b = xb30Var;
        this.c = ref$ObjectRef;
        this.d = ref$FloatRef;
        this.e = zhh0Var;
        this.f = ref$BooleanRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, xsna.xb30$a] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        float floatValue = ((Float) obj).floatValue();
        xb30 xb30Var = this.b;
        xb30.a g = xb30.g(xb30Var.g);
        if (g != null) {
            wxm wxmVar = xb30Var.e;
            long j = g.b;
            long j2 = g.a;
            ((VelocityTracker1D) wxmVar.b).a(Float.intBitsToFloat((int) (j2 >> 32)), j);
            ((VelocityTracker1D) wxmVar.c).a(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
            Ref$ObjectRef ref$ObjectRef = this.c;
            ?? a = ((xb30.a) ref$ObjectRef.element).a(g);
            ref$ObjectRef.element = a;
            long j3 = a.a;
            zhh0 zhh0Var = this.e;
            this.d.element = zhh0Var.i(zhh0Var.e(j3));
            this.f.element = !ec30.a(r0 - floatValue);
        }
        return Boolean.valueOf(g != null);
    }
}
