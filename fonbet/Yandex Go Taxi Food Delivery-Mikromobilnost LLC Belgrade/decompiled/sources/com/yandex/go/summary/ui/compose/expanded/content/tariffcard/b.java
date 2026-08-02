package com.yandex.go.summary.ui.compose.expanded.content.tariffcard;

import com.yandex.go.summary.ui.model.common.basetariffinfo.TariffOrderFlowUiState;
import defpackage.cex0;
import defpackage.ck11;
import defpackage.jl40;
import defpackage.m3u0;
import defpackage.ny61;
import defpackage.ob5;
import defpackage.oz40;
import defpackage.sb2;
import defpackage.ubn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ oz40 a;
    public final /* synthetic */ oz40 b;
    public final /* synthetic */ androidx.compose.animation.core.a c;
    public final /* synthetic */ m3u0 w;
    public final /* synthetic */ m3u0 x;

    public b(oz40 oz40Var, oz40 oz40Var2, androidx.compose.animation.core.a aVar, m3u0 m3u0Var, m3u0 m3u0Var2) {
        this.a = oz40Var;
        this.b = oz40Var2;
        this.c = aVar;
        this.w = m3u0Var;
        this.x = m3u0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00eb, code lost:
    
        if (r17.c.f(r5, r9) != r3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (defpackage.jl40.l(r2.a, r4.a) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        if (androidx.compose.animation.core.a.d(r17.c, r1, r2, null, null, r9, 12) == r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:
    
        if (r2.b.equals(r4) == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1 tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1;
        int i;
        Object obj2;
        int i2;
        oz40 oz40Var;
        Object value;
        Object obj3;
        if (continuation instanceof TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1) {
            tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1 = (TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1) continuation;
            int i3 = tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1.label = i3 - Integer.MIN_VALUE;
                TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1 tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12 = tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1;
                Object obj4 = tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.label;
                zy11 zy11Var = zy11.a;
                oz40 oz40Var2 = this.b;
                oz40 oz40Var3 = this.a;
                if (i != 0) {
                    kotlin.b.b(obj4);
                    cex0 cex0Var = (cex0) obj;
                    cex0 cex0Var2 = (cex0) oz40Var3.getValue();
                    if (((Boolean) this.x.getValue()).booleanValue()) {
                        ob5 ob5Var = cex0Var.b;
                        if (ob5Var.d == TariffOrderFlowUiState.DELIVERY_FLOW) {
                            ob5 ob5Var2 = cex0Var2.b;
                            if (jl40.l(ob5Var2.b, ob5Var.b)) {
                            }
                            Float f = new Float(1.0f);
                            ck11 K = sb2.K(605, 0, ubn.c, 2);
                            tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$0 = null;
                            tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$1 = null;
                            tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.label = 1;
                            obj2 = null;
                            i2 = 2;
                            oz40Var = oz40Var3;
                        }
                        oz40Var.setValue(obj3);
                        oz40Var2.setValue(obj3);
                        return zy11Var;
                    }
                    oz40Var3.setValue(obj);
                    oz40Var2.setValue(obj);
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj3 = tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$2;
                        kotlin.b.b(obj4);
                        oz40Var = oz40Var3;
                        oz40Var.setValue(obj3);
                        oz40Var2.setValue(obj3);
                        return zy11Var;
                    }
                    Object obj5 = tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$2;
                    kotlin.b.b(obj4);
                    value = obj5;
                    oz40Var = oz40Var3;
                    i2 = 2;
                    obj2 = null;
                    Float f2 = new Float(0.0f);
                    ck11 K2 = sb2.K(605, 0, ubn.b, i2);
                    tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$0 = obj2;
                    tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$1 = obj2;
                    tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$2 = value;
                    tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.label = 3;
                    Object obj6 = value;
                    if (androidx.compose.animation.core.a.d(this.c, f2, K2, null, null, tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12, 12) != coroutineSingletons) {
                        obj3 = obj6;
                        oz40Var.setValue(obj3);
                        oz40Var2.setValue(obj3);
                        return zy11Var;
                    }
                    return coroutineSingletons;
                }
                kotlin.b.b(obj4);
                oz40Var = oz40Var3;
                i2 = 2;
                obj2 = null;
                value = this.w.getValue();
                oz40Var.setValue(value);
                Float f3 = new Float(-1.0f);
                tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$0 = obj2;
                tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$1 = obj2;
                tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.L$2 = value;
                tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$12.label = i2;
            }
        }
        tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1 = new TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1(this, continuation);
        TariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1 tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$122 = tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$1;
        Object obj42 = tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$122.label;
        zy11 zy11Var2 = zy11.a;
        oz40 oz40Var22 = this.b;
        oz40 oz40Var32 = this.a;
        if (i != 0) {
        }
        value = this.w.getValue();
        oz40Var.setValue(value);
        Float f32 = new Float(-1.0f);
        tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$122.L$0 = obj2;
        tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$122.L$1 = obj2;
        tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$122.L$2 = value;
        tariffCardItemKt$TariffCardItem$$inlined$AnimatedContentProvider$1$2$122.label = i2;
    }
}
