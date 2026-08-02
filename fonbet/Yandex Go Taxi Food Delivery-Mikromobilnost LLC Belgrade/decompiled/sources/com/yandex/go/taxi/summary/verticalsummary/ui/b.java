package com.yandex.go.taxi.summary.verticalsummary.ui;

import defpackage.cjb1;
import defpackage.dtr0;
import defpackage.f62;
import defpackage.m3u0;
import defpackage.n6y;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.rfb1;
import defpackage.scc;
import defpackage.t6y;
import defpackage.vpr;
import defpackage.wg6;
import defpackage.y6i0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ androidx.compose.foundation.lazy.b A;
    public final /* synthetic */ m3u0 B;
    public final /* synthetic */ vpr a;
    public final /* synthetic */ wg6 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List w;
    public final /* synthetic */ m3u0 x;
    public final /* synthetic */ oz40 y;
    public final /* synthetic */ androidx.compose.animation.core.a z;

    public b(vpr vprVar, wg6 wg6Var, int i, List list, m3u0 m3u0Var, oz40 oz40Var, androidx.compose.animation.core.a aVar, androidx.compose.foundation.lazy.b bVar, m3u0 m3u0Var2) {
        this.a = vprVar;
        this.b = wg6Var;
        this.c = i;
        this.w = list;
        this.x = m3u0Var;
        this.y = oz40Var;
        this.z = aVar;
        this.A = bVar;
        this.B = m3u0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x01d0, code lost:
    
        if (r8.emit(r0, r2) == r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1 stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        vpr vprVar;
        Float f;
        n6y n6yVar;
        vpr vprVar2;
        if (continuation instanceof StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    float floatValue = ((Number) obj).floatValue();
                    wg6 wg6Var = this.b;
                    int i3 = this.c;
                    float f2 = wg6Var.f(i3);
                    int i4 = floatValue <= f2 ? 1 : 0;
                    List list = this.w;
                    int i5 = ((f62) list.get(scc.f(list) - 1)).a;
                    float f3 = wg6Var.f(i5);
                    int i6 = ((dtr0) wg6Var.g.getValue()).a;
                    float f4 = wg6Var.f(i6);
                    int i7 = f4 >= f3 ? 1 : 0;
                    oz40 oz40Var = this.y;
                    if (i6 == i3 && ((Boolean) this.x.getValue()).booleanValue()) {
                        oz40Var.setValue(Boolean.FALSE);
                    } else if (i4 != 0 && !rfb1.g(wg6Var)) {
                        oz40Var.setValue(Boolean.FALSE);
                    } else if (i7 != 0 && !rfb1.g(wg6Var)) {
                        oz40Var.setValue(Boolean.TRUE);
                    }
                    boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
                    vprVar = this.a;
                    if (!booleanValue) {
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = vprVar;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.F$0 = floatValue;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.F$1 = f2;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$0 = i4;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$1 = i5;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.F$2 = f3;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$2 = i6;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.F$3 = f4;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$3 = i7;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.z.g(stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1) != coroutineSingletons) {
                            vprVar2 = vprVar;
                        }
                        return coroutineSingletons;
                    }
                    float c = rfb1.c(wg6Var);
                    float f5 = rfb1.f(wg6Var);
                    int d = y6i0.d((int) (1.0f + f5), 1, scc.f(list));
                    float f6 = wg6Var.f(((f62) list.get(d)).c) + r11.b;
                    int i8 = d - 1;
                    float d2 = floatValue - cjb1.d(wg6Var.f(((f62) list.get(i8)).c) + r12.b, f6, f5 - i8);
                    Integer num = (Integer) this.B.getValue();
                    androidx.compose.foundation.lazy.b bVar = this.A;
                    n6y n6yVar2 = (n6y) kotlin.collections.a.b0(bVar.j().k);
                    int i9 = bVar.j().n - 1;
                    if (n6yVar2 != null) {
                        if (((t6y) n6yVar2).a == i9) {
                            float f7 = -f2;
                            float e = (((((int) (bVar.j().e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((-c) - f7)) - bVar.j().p) - (-bVar.j().l)) - (f7 - (-floatValue));
                            if (num != null && (n6yVar = (n6y) kotlin.collections.a.S(num.intValue(), bVar.j().k)) != null) {
                                float f8 = r10.o + ((-d2) - ((t6y) n6yVar).o);
                                if (e > f8) {
                                    d2 -= ((int) e) - f8;
                                }
                            }
                        }
                    }
                    f = new Float(d2);
                    if (f != null) {
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 2;
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar2 = (vpr) stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                vprVar = vprVar2;
                f = null;
                if (f != null) {
                }
                return zy11.a;
            }
        }
        stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new StabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stabilizedLazyColumnWithBottomSheetEffectKt$StabilizedLazyColumnWithBottomSheetEffect$1$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        vprVar = vprVar2;
        f = null;
        if (f != null) {
        }
        return zy11.a;
    }
}
