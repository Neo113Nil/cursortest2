package com.yandex.go.ai_widget.ui.component;

import androidx.compose.runtime.f;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import defpackage.bgc;
import defpackage.fp1;
import defpackage.id00;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.y6i0;
import defpackage.zbd;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final tse a;
    public final float b;
    public final float e;
    public final float f;
    public float n;
    public pzt0 o;
    public final androidx.compose.animation.core.a c = id00.a(0.0f);
    public final androidx.compose.animation.core.a d = id00.a(0.0f);
    public final androidx.compose.animation.core.a g = id00.a(0.0f);
    public final oz40 h = f.j(null);
    public final oz40 i = f.j(null);
    public final oz40 j = f.j(Boolean.FALSE);
    public final oz40 k = f.j(null);
    public final androidx.compose.animation.core.a l = id00.a(0.0f);
    public final androidx.compose.animation.core.a m = id00.a(0.0f);
    public wls p = new zbd(13);
    public sls q = new bgc(12);

    public b(tse tseVar, float f) {
        this.a = tseVar;
        this.b = f;
        float f2 = f * 0.3f;
        this.e = f2;
        this.f = f2 * 0.6f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x016c, code lost:
    
        if (defpackage.bvf0.n(r1, r6) != r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0115, code lost:
    
        if (r1.f(r10, r6) != r7) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, ContinuationImpl continuationImpl) {
        AiWidgetEvaluationSwipeState$performCommitSwipe$1 aiWidgetEvaluationSwipeState$performCommitSwipe$1;
        int i;
        float f;
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection2;
        androidx.compose.animation.core.a aVar;
        Object e;
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection3;
        int i2;
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection4;
        Float f2;
        float f3;
        int i3;
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection5;
        androidx.compose.animation.core.a aVar2 = bVar.d;
        oz40 oz40Var = bVar.h;
        float f4 = bVar.b;
        androidx.compose.animation.core.a aVar3 = bVar.c;
        if (continuationImpl instanceof AiWidgetEvaluationSwipeState$performCommitSwipe$1) {
            aiWidgetEvaluationSwipeState$performCommitSwipe$1 = (AiWidgetEvaluationSwipeState$performCommitSwipe$1) continuationImpl;
            int i4 = aiWidgetEvaluationSwipeState$performCommitSwipe$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = i4 - Integer.MIN_VALUE;
                Object obj = aiWidgetEvaluationSwipeState$performCommitSwipe$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (aiWidgetEvaluationSwipeState$performCommitSwipe$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        i = bVar.f() != null ? 1 : 0;
                        int i5 = fp1.a[aiWidgetEvaluationSwipeDirection.ordinal()];
                        if (i5 == 1) {
                            f = f4 * 1.5f;
                        } else if (i5 != 2) {
                            w511.b();
                            break;
                        } else {
                            f = (-f4) * 1.5f;
                        }
                        if (((AiWidgetEvaluationSwipeDirection) oz40Var.getValue()) == null) {
                            float c = y6i0.c(Math.abs(((Number) aVar3.e()).floatValue()) / bVar.f, 0.0f, 1.0f);
                            androidx.compose.animation.core.a aVar4 = bVar.g;
                            Float f5 = new Float(c);
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = aiWidgetEvaluationSwipeDirection;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$1 = c;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 1;
                            if (aVar4.f(f5, aiWidgetEvaluationSwipeState$performCommitSwipe$1) != coroutineSingletons) {
                                aiWidgetEvaluationSwipeDirection2 = aiWidgetEvaluationSwipeDirection;
                                oz40Var.setValue(aiWidgetEvaluationSwipeDirection2);
                                bVar.n = bVar.b();
                                aVar = bVar.l;
                                e = aVar3.e();
                                aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = aiWidgetEvaluationSwipeDirection2;
                                aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i;
                                aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f;
                                aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 2;
                                if (aVar.f(e, aiWidgetEvaluationSwipeState$performCommitSwipe$1) != coroutineSingletons) {
                                    aiWidgetEvaluationSwipeDirection3 = aiWidgetEvaluationSwipeDirection2;
                                    androidx.compose.animation.core.a aVar5 = bVar.m;
                                    Object e2 = aVar2.e();
                                    aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = aiWidgetEvaluationSwipeDirection3;
                                    aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i;
                                    aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f;
                                    aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 3;
                                    break;
                                }
                            }
                        } else {
                            aiWidgetEvaluationSwipeDirection2 = aiWidgetEvaluationSwipeDirection;
                            bVar.n = bVar.b();
                            aVar = bVar.l;
                            e = aVar3.e();
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = aiWidgetEvaluationSwipeDirection2;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 2;
                            if (aVar.f(e, aiWidgetEvaluationSwipeState$performCommitSwipe$1) != coroutineSingletons) {
                            }
                        }
                        break;
                    case 1:
                        f = aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0;
                        i = aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0;
                        aiWidgetEvaluationSwipeDirection2 = (AiWidgetEvaluationSwipeDirection) aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0;
                        kotlin.b.b(obj);
                        oz40Var.setValue(aiWidgetEvaluationSwipeDirection2);
                        bVar.n = bVar.b();
                        aVar = bVar.l;
                        e = aVar3.e();
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = aiWidgetEvaluationSwipeDirection2;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 2;
                        if (aVar.f(e, aiWidgetEvaluationSwipeState$performCommitSwipe$1) != coroutineSingletons) {
                        }
                        break;
                    case 2:
                        f = aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0;
                        i = aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0;
                        aiWidgetEvaluationSwipeDirection3 = (AiWidgetEvaluationSwipeDirection) aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0;
                        kotlin.b.b(obj);
                        androidx.compose.animation.core.a aVar52 = bVar.m;
                        Object e22 = aVar2.e();
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = aiWidgetEvaluationSwipeDirection3;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 3;
                        break;
                    case 3:
                        f = aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0;
                        i = aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0;
                        aiWidgetEvaluationSwipeDirection3 = (AiWidgetEvaluationSwipeDirection) aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0;
                        kotlin.b.b(obj);
                        Float f6 = new Float(0.0f);
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = aiWidgetEvaluationSwipeDirection3;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 4;
                        if (aVar3.f(f6, aiWidgetEvaluationSwipeState$performCommitSwipe$1) != coroutineSingletons) {
                            i2 = i;
                            aiWidgetEvaluationSwipeDirection4 = aiWidgetEvaluationSwipeDirection3;
                            f2 = new Float(0.0f);
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = aiWidgetEvaluationSwipeDirection4;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i2;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f;
                            aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 5;
                            if (aVar2.f(f2, aiWidgetEvaluationSwipeState$performCommitSwipe$1) != coroutineSingletons) {
                                f3 = f;
                                i3 = i2;
                                aiWidgetEvaluationSwipeDirection5 = aiWidgetEvaluationSwipeDirection4;
                                bVar.i.setValue(null);
                                bVar.p.invoke(aiWidgetEvaluationSwipeDirection5, Boolean.valueOf(i3 == 0));
                                AiWidgetEvaluationSwipeState$performCommitSwipe$2 aiWidgetEvaluationSwipeState$performCommitSwipe$2 = new AiWidgetEvaluationSwipeState$performCommitSwipe$2(bVar, f3, null);
                                aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = null;
                                aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i3;
                                aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f3;
                                aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 6;
                                break;
                            }
                        }
                        break;
                    case 4:
                        f = aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0;
                        i2 = aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0;
                        aiWidgetEvaluationSwipeDirection4 = (AiWidgetEvaluationSwipeDirection) aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0;
                        kotlin.b.b(obj);
                        f2 = new Float(0.0f);
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = aiWidgetEvaluationSwipeDirection4;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i2;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 5;
                        if (aVar2.f(f2, aiWidgetEvaluationSwipeState$performCommitSwipe$1) != coroutineSingletons) {
                        }
                        break;
                    case 5:
                        f3 = aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0;
                        i3 = aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0;
                        aiWidgetEvaluationSwipeDirection5 = (AiWidgetEvaluationSwipeDirection) aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0;
                        kotlin.b.b(obj);
                        bVar.i.setValue(null);
                        bVar.p.invoke(aiWidgetEvaluationSwipeDirection5, Boolean.valueOf(i3 == 0));
                        AiWidgetEvaluationSwipeState$performCommitSwipe$2 aiWidgetEvaluationSwipeState$performCommitSwipe$22 = new AiWidgetEvaluationSwipeState$performCommitSwipe$2(bVar, f3, null);
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.L$0 = null;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.I$0 = i3;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.F$0 = f3;
                        aiWidgetEvaluationSwipeState$performCommitSwipe$1.label = 6;
                        break;
                    case 6:
                        kotlin.b.b(obj);
                        oz40Var.setValue(null);
                        bVar.n = 0.0f;
                        bVar.q.invoke();
                        bVar.j.setValue(Boolean.FALSE);
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        break;
                }
                return null;
            }
        }
        aiWidgetEvaluationSwipeState$performCommitSwipe$1 = new AiWidgetEvaluationSwipeState$performCommitSwipe$1(bVar, continuationImpl);
        Object obj2 = aiWidgetEvaluationSwipeState$performCommitSwipe$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (aiWidgetEvaluationSwipeState$performCommitSwipe$1.label) {
        }
        return null;
    }

    public final float b() {
        float floatValue = (((Number) this.c.e()).floatValue() / this.b) * 15.0f;
        AiWidgetEvaluationSwipeDirection f = f();
        int i = f == null ? -1 : fp1.a[f.ordinal()];
        if (i == -1) {
            return floatValue;
        }
        if (i == 1) {
            return Math.max(e() * 12.0f, floatValue);
        }
        if (i == 2) {
            return Math.min(d() * (-12.0f), floatValue);
        }
        w511.b();
        return 0.0f;
    }

    public final AiWidgetEvaluationSwipeDirection c() {
        return (AiWidgetEvaluationSwipeDirection) this.k.getValue();
    }

    public final float d() {
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = (AiWidgetEvaluationSwipeDirection) this.h.getValue();
        int i = aiWidgetEvaluationSwipeDirection == null ? -1 : fp1.a[aiWidgetEvaluationSwipeDirection.ordinal()];
        if (i == -1) {
            return y6i0.c((-((Number) this.c.e()).floatValue()) / this.f, 0.0f, 1.0f);
        }
        if (i != 1) {
            if (i == 2) {
                return ((Number) this.g.e()).floatValue();
            }
            w511.b();
        }
        return 0.0f;
    }

    public final float e() {
        AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection = (AiWidgetEvaluationSwipeDirection) this.h.getValue();
        int i = aiWidgetEvaluationSwipeDirection == null ? -1 : fp1.a[aiWidgetEvaluationSwipeDirection.ordinal()];
        if (i == -1) {
            return y6i0.c(((Number) this.c.e()).floatValue() / this.f, 0.0f, 1.0f);
        }
        if (i == 1) {
            return ((Number) this.g.e()).floatValue();
        }
        if (i == 2) {
            return 0.0f;
        }
        w511.b();
        return 0.0f;
    }

    public final AiWidgetEvaluationSwipeDirection f() {
        return (AiWidgetEvaluationSwipeDirection) this.i.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void h(wls wlsVar) {
        pzt0 pzt0Var = this.o;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.o = tje.N(this.a, null, null, wlsVar, 3);
    }
}
