package androidx.compose.foundation.gestures;

import defpackage.ck11;
import defpackage.f22;
import defpackage.fwi;
import defpackage.i62;
import defpackage.j62;
import defpackage.jl40;
import defpackage.k62;
import defpackage.m9m;
import defpackage.ny61;
import defpackage.qje;
import defpackage.snr;
import defpackage.tje;
import defpackage.wls;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;

/* loaded from: classes10.dex */
public final class d extends k {
    public e O;
    public Orientation P;
    public snr Q;
    public snr R;
    public fwi S;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Z0(d dVar, float f, ContinuationImpl continuationImpl) {
        AnchoredDraggableNode$fling$1 anchoredDraggableNode$fling$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        dVar.getClass();
        if (continuationImpl instanceof AnchoredDraggableNode$fling$1) {
            anchoredDraggableNode$fling$1 = (AnchoredDraggableNode$fling$1) continuationImpl;
            int i2 = anchoredDraggableNode$fling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anchoredDraggableNode$fling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = anchoredDraggableNode$fling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anchoredDraggableNode$fling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (dVar.O.e()) {
                        e eVar = dVar.O;
                        anchoredDraggableNode$fling$1.label = 1;
                        Object i3 = eVar.i(f, anchoredDraggableNode$fling$1);
                        if (i3 != coroutineSingletons) {
                            return i3;
                        }
                    } else {
                        Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                        ref$FloatRef2.element = f;
                        e eVar2 = dVar.O;
                        AnchoredDraggableNode$fling$2 anchoredDraggableNode$fling$2 = new AnchoredDraggableNode$fling$2(dVar, ref$FloatRef2, f, null);
                        anchoredDraggableNode$fling$1.L$0 = ref$FloatRef2;
                        anchoredDraggableNode$fling$1.label = 2;
                        if (e.b(eVar2, anchoredDraggableNode$fling$2, anchoredDraggableNode$fling$1) != coroutineSingletons) {
                            ref$FloatRef = ref$FloatRef2;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return obj;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$FloatRef = (Ref$FloatRef) anchoredDraggableNode$fling$1.L$0;
                kotlin.b.b(obj);
                return new Float(ref$FloatRef.element);
            }
        }
        anchoredDraggableNode$fling$1 = new AnchoredDraggableNode$fling$1(dVar, continuationImpl);
        Object obj2 = anchoredDraggableNode$fling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anchoredDraggableNode$fling$1.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    @Override // androidx.compose.foundation.gestures.k
    public final Object L0(wls wlsVar, Continuation continuation) {
        Object b = e.b(this.O, new AnchoredDraggableNode$drag$2(wlsVar, this, null), (ContinuationImpl) continuation);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }

    @Override // androidx.compose.foundation.gestures.k
    public final void Q0(long j) {
    }

    @Override // androidx.compose.foundation.gestures.k
    public final void R0(m9m m9mVar) {
        if (isAttached()) {
            tje.N(getCoroutineScope(), null, null, new AnchoredDraggableNode$onDragStopped$1(this, m9mVar, null), 3);
        }
    }

    @Override // androidx.compose.foundation.gestures.k
    public final boolean W0() {
        return this.O.l.getValue() != null;
    }

    public final void a1(snr snrVar) {
        if (snrVar == null) {
            ck11 ck11Var = i62.a;
            f22 f22Var = i62.b;
            fwi fwiVar = qje.P(this).R;
            this.S = fwiVar;
            snrVar = new androidx.compose.foundation.gestures.snapping.a(new k62(this.O, f22Var, new j62(fwiVar, 0)), c.b, ck11Var);
        }
        this.R = snrVar;
    }

    @Override // defpackage.e530
    public final void onAttach() {
        a1(this.Q);
    }

    @Override // defpackage.cqh, defpackage.gwd0
    public final void onDensityChange() {
        D();
        if (isAttached()) {
            fwi fwiVar = qje.P(this).R;
            fwi fwiVar2 = this.S;
            if (fwiVar2 == null || !jl40.l(fwiVar2, fwiVar)) {
                this.S = fwiVar;
                a1(this.Q);
            }
        }
    }
}
