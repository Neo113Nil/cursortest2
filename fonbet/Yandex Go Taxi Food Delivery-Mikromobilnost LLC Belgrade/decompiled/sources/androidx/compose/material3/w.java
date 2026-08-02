package androidx.compose.material3;

import defpackage.ck11;
import defpackage.ctr0;
import defpackage.lah;
import defpackage.ny61;
import defpackage.qar;
import defpackage.sb2;
import defpackage.sls;
import defpackage.snr;
import defpackage.tls;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes10.dex */
public final class w {
    public final boolean a;
    public final sls b;
    public final sls c;
    public final tls d;
    public final androidx.compose.foundation.gestures.e e;
    public qar f;
    public qar g;

    public w(boolean z, sls slsVar, sls slsVar2, SheetValue sheetValue, tls tlsVar) {
        this.a = z;
        this.b = slsVar;
        this.c = slsVar2;
        this.d = tlsVar;
        if (z && sheetValue == SheetValue.PartiallyExpanded) {
            ny61.g("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        ck11 ck11Var = ctr0.a;
        this.e = new androidx.compose.foundation.gestures.e(tlsVar, sheetValue);
        this.f = sb2.F();
        this.g = sb2.F();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(snr snrVar, float f, ContinuationImpl continuationImpl) {
        SheetState$anchoredDrag$1 sheetState$anchoredDrag$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof SheetState$anchoredDrag$1) {
            sheetState$anchoredDrag$1 = (SheetState$anchoredDrag$1) continuationImpl;
            int i2 = sheetState$anchoredDrag$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sheetState$anchoredDrag$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sheetState$anchoredDrag$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sheetState$anchoredDrag$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    SheetState$anchoredDrag$2 sheetState$anchoredDrag$2 = new SheetState$anchoredDrag$2(ref$FloatRef2, snrVar, this, f, null);
                    sheetState$anchoredDrag$1.L$0 = ref$FloatRef2;
                    sheetState$anchoredDrag$1.label = 1;
                    if (androidx.compose.foundation.gestures.e.b(this.e, sheetState$anchoredDrag$2, sheetState$anchoredDrag$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$FloatRef = (Ref$FloatRef) sheetState$anchoredDrag$1.L$0;
                    kotlin.b.b(obj);
                }
                return new Float(ref$FloatRef.element);
            }
        }
        sheetState$anchoredDrag$1 = new SheetState$anchoredDrag$1(this, continuationImpl);
        Object obj2 = sheetState$anchoredDrag$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sheetState$anchoredDrag$1.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    public final Object b(SheetValue sheetValue, qar qarVar, SuspendLambda suspendLambda) {
        Object h = androidx.compose.foundation.gestures.c.h(this.e, sheetValue, qarVar, suspendLambda);
        return h == CoroutineSingletons.COROUTINE_SUSPENDED ? h : zy11.a;
    }

    public final Object c(SuspendLambda suspendLambda) {
        Object b;
        SheetValue sheetValue = SheetValue.Expanded;
        return (((Boolean) this.d.invoke(sheetValue)).booleanValue() && (b = b(sheetValue, this.f, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? b : zy11.a;
    }

    public final SheetValue d() {
        return (SheetValue) this.e.h.getValue();
    }

    public final Object e(SuspendLambda suspendLambda) {
        Object b;
        SheetValue sheetValue = SheetValue.Hidden;
        return (((Boolean) this.d.invoke(sheetValue)).booleanValue() && (b = b(sheetValue, this.g, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? b : zy11.a;
    }

    public final Object f(SuspendLambda suspendLambda) {
        Object b;
        if (this.a) {
            ny61.r("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        return (((Boolean) this.d.invoke(sheetValue)).booleanValue() && (b = b(sheetValue, this.g, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? b : zy11.a;
    }

    public final Object g(SuspendLambda suspendLambda) {
        Object b;
        lah d = this.e.d();
        SheetValue sheetValue = SheetValue.PartiallyExpanded;
        if (!d.c(sheetValue)) {
            sheetValue = SheetValue.Expanded;
        }
        return (((Boolean) this.d.invoke(sheetValue)).booleanValue() && (b = b(sheetValue, this.f, suspendLambda)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? b : zy11.a;
    }
}
