package androidx.compose.foundation;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ay40;
import defpackage.e530;
import defpackage.gwd0;
import defpackage.ltu;
import defpackage.mtu;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tvd0;
import defpackage.zx40;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class h extends e530 implements gwd0 {
    public zx40 a;
    public ltu b;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E0(h hVar, ContinuationImpl continuationImpl) {
        HoverableNode$emitEnter$1 hoverableNode$emitEnter$1;
        int i;
        ltu ltuVar;
        hVar.getClass();
        if (continuationImpl instanceof HoverableNode$emitEnter$1) {
            hoverableNode$emitEnter$1 = (HoverableNode$emitEnter$1) continuationImpl;
            int i2 = hoverableNode$emitEnter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitEnter$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hoverableNode$emitEnter$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hoverableNode$emitEnter$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (hVar.b == null) {
                        ltu ltuVar2 = new ltu();
                        zx40 zx40Var = hVar.a;
                        hoverableNode$emitEnter$1.L$0 = ltuVar2;
                        hoverableNode$emitEnter$1.label = 1;
                        if (((ay40) zx40Var).a(ltuVar2, hoverableNode$emitEnter$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        ltuVar = ltuVar2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ltuVar = (ltu) hoverableNode$emitEnter$1.L$0;
                kotlin.b.b(obj);
                hVar.b = ltuVar;
                return zy11.a;
            }
        }
        hoverableNode$emitEnter$1 = new HoverableNode$emitEnter$1(hVar, continuationImpl);
        Object obj2 = hoverableNode$emitEnter$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hoverableNode$emitEnter$1.label;
        if (i != 0) {
        }
        hVar.b = ltuVar;
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F0(h hVar, ContinuationImpl continuationImpl) {
        HoverableNode$emitExit$1 hoverableNode$emitExit$1;
        int i;
        hVar.getClass();
        if (continuationImpl instanceof HoverableNode$emitExit$1) {
            hoverableNode$emitExit$1 = (HoverableNode$emitExit$1) continuationImpl;
            int i2 = hoverableNode$emitExit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hoverableNode$emitExit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = hoverableNode$emitExit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = hoverableNode$emitExit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ltu ltuVar = hVar.b;
                    if (ltuVar != null) {
                        mtu mtuVar = new mtu(ltuVar);
                        zx40 zx40Var = hVar.a;
                        hoverableNode$emitExit$1.label = 1;
                        if (((ay40) zx40Var).a(mtuVar, hoverableNode$emitExit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                hVar.b = null;
                return zy11.a;
            }
        }
        hoverableNode$emitExit$1 = new HoverableNode$emitExit$1(hVar, continuationImpl);
        Object obj2 = hoverableNode$emitExit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = hoverableNode$emitExit$1.label;
        if (i != 0) {
        }
        hVar.b = null;
        return zy11.a;
    }

    @Override // defpackage.gwd0
    public final void D() {
        G0();
    }

    public final void G0() {
        ltu ltuVar = this.b;
        if (ltuVar != null) {
            ((ay40) this.a).b(new mtu(ltuVar));
            this.b = null;
        }
    }

    @Override // defpackage.gwd0
    public final void m0(tvd0 tvd0Var, PointerEventPass pointerEventPass, long j) {
        if (pointerEventPass == PointerEventPass.Main) {
            int i = tvd0Var.f;
            if (i == 4) {
                tje.N(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$1(this, null), 3);
            } else if (i == 5) {
                tje.N(getCoroutineScope(), null, null, new HoverableNode$onPointerEvent$2(this, null), 3);
            }
        }
    }

    @Override // defpackage.e530
    public final void onDetach() {
        G0();
    }
}
