package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.SheetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SheetDefaults.kt */
/* loaded from: classes11.dex */
public final class gdj0 {
    public final boolean a;
    public final izs<SheetValue, Boolean> b;
    public iq2<Float> c;
    public final d12<SheetValue> d;
    public phr<Float> e;
    public phr<Float> f;

    public gdj0(boolean z, gzs gzsVar, gzs gzsVar2, SheetValue sheetValue, izs izsVar) {
        this.a = z;
        this.b = izsVar;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.c = bdj0.a;
        this.d = new d12<>(sheetValue, new af50(gzsVar, 29), gzsVar2, new dac0(this, 10), izsVar);
        this.e = new aak0();
        this.f = new aak0();
    }

    public static Object a(gdj0 gdj0Var, SheetValue sheetValue, phr phrVar, SuspendLambda suspendLambda) {
        Object b = gdj0Var.d.b(sheetValue, MutatePriority.Default, new edj0(gdj0Var, ((vak0) gdj0Var.d.k).getFloatValue(), phrVar, null), suspendLambda);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : s3q0.a;
    }

    public final Object b(SuspendLambda suspendLambda) {
        SheetValue sheetValue = SheetValue.Expanded;
        if (!this.b.invoke(sheetValue).booleanValue()) {
            return s3q0.a;
        }
        Object a = a(this, sheetValue, this.e, suspendLambda);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    public final Object c(SuspendLambda suspendLambda) {
        SheetValue sheetValue = SheetValue.Hidden;
        if (!this.b.invoke(sheetValue).booleanValue()) {
            return s3q0.a;
        }
        Object a = a(this, sheetValue, this.f, suspendLambda);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    public final boolean d() {
        return ((zak0) this.d.g).getValue() != SheetValue.Hidden;
    }

    public final Object e(SuspendLambda suspendLambda) {
        if (this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        if (!this.b.invoke(sheetValue).booleanValue()) {
            return s3q0.a;
        }
        Object a = a(this, sheetValue, this.f, suspendLambda);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    public final Object f(SuspendLambda suspendLambda) {
        tgo<SheetValue> e = this.d.e();
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        if (!e.f(sheetValue)) {
            sheetValue = SheetValue.Expanded;
        }
        if (!this.b.invoke(sheetValue).booleanValue()) {
            return s3q0.a;
        }
        Object a = a(this, sheetValue, this.e, suspendLambda);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }
}
