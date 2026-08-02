package xsna;

import com.vk.core.compose.component.modal.SheetValue;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SheetState.kt */
/* loaded from: classes17.dex */
public final class fdj0 {
    public final boolean a;
    public final e12<SheetValue> b;
    public final azl c;

    @ozl
    public fdj0() {
        throw null;
    }

    public fdj0(boolean z, azl azlVar, SheetValue sheetValue, izs izsVar) {
        this.a = z;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        xmk0<Float> xmk0Var = gz1.a;
        this.b = new e12<>(sheetValue, new arb0(this, 14), new nm60(this, 20), izsVar);
        this.c = azlVar;
    }

    public static Object a(fdj0 fdj0Var, SheetValue sheetValue, SuspendLambda suspendLambda) {
        Object j = d02.j(fdj0Var.b, sheetValue, ((vak0) fdj0Var.b.j).getFloatValue(), suspendLambda);
        return j == CoroutineSingletons.COROUTINE_SUSPENDED ? j : s3q0.a;
    }

    public final Object b(SuspendLambda suspendLambda) {
        Object a = a(this, SheetValue.Hidden, suspendLambda);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    public final boolean c() {
        return ((zak0) this.b.f).getValue() != SheetValue.Hidden;
    }

    public final Object d(SuspendLambda suspendLambda) {
        if (this.a) {
            throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
        }
        Object a = a(this, SheetValue.PartiallyExpanded, suspendLambda);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }

    public final Object e(SuspendLambda suspendLambda) {
        ugo<SheetValue> e = this.b.e();
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        if (!e.f(sheetValue)) {
            sheetValue = SheetValue.Expanded;
        }
        Object a = a(this, sheetValue, suspendLambda);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : s3q0.a;
    }
}
