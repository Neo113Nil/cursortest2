package coil3.intercept;

import android.graphics.Bitmap;
import defpackage.ago;
import defpackage.gev;
import defpackage.kev;
import defpackage.l8a1;
import defpackage.lg70;
import defpackage.mw01;
import defpackage.ny61;
import defpackage.q7v;
import defpackage.s8o;
import defpackage.t1o;
import defpackage.w06;
import defpackage.xis0;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00ad -> B:10:0x00b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(t1o t1oVar, gev gevVar, lg70 lg70Var, ago agoVar, ContinuationImpl continuationImpl) {
        EngineInterceptorKt$transform$1 engineInterceptorKt$transform$1;
        int i;
        List list;
        int i2;
        t1o t1oVar2;
        int size;
        Bitmap bitmap;
        EngineInterceptorKt$transform$1 engineInterceptorKt$transform$12;
        ago agoVar2;
        lg70 lg70Var2;
        gev gevVar2;
        if (continuationImpl instanceof EngineInterceptorKt$transform$1) {
            engineInterceptorKt$transform$1 = (EngineInterceptorKt$transform$1) continuationImpl;
            int i3 = engineInterceptorKt$transform$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                engineInterceptorKt$transform$1.label = i3 - Integer.MIN_VALUE;
                Object obj = engineInterceptorKt$transform$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = engineInterceptorKt$transform$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    list = (List) s8o.o(gevVar, kev.a);
                    if (list.isEmpty()) {
                        return t1oVar;
                    }
                    q7v q7vVar = t1oVar.a;
                    if (!(q7vVar instanceof w06) && !((Boolean) s8o.o(gevVar, kev.d)).booleanValue()) {
                        return t1oVar;
                    }
                    Bitmap e = l8a1.e(q7vVar, lg70Var, list);
                    agoVar.getClass();
                    i2 = 0;
                    t1oVar2 = t1oVar;
                    size = list.size();
                    bitmap = e;
                    engineInterceptorKt$transform$12 = engineInterceptorKt$transform$1;
                    agoVar2 = agoVar;
                    lg70Var2 = lg70Var;
                    gevVar2 = gevVar;
                    if (i2 < size) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    size = engineInterceptorKt$transform$1.I$1;
                    int i4 = engineInterceptorKt$transform$1.I$0;
                    List list2 = (List) engineInterceptorKt$transform$1.L$4;
                    ago agoVar3 = (ago) engineInterceptorKt$transform$1.L$3;
                    lg70 lg70Var3 = (lg70) engineInterceptorKt$transform$1.L$2;
                    gev gevVar3 = (gev) engineInterceptorKt$transform$1.L$1;
                    t1o t1oVar3 = (t1o) engineInterceptorKt$transform$1.L$0;
                    kotlin.b.b(obj);
                    EngineInterceptorKt$transform$1 engineInterceptorKt$transform$13 = engineInterceptorKt$transform$1;
                    List list3 = list2;
                    gevVar2 = gevVar3;
                    EngineInterceptorKt$transform$1 engineInterceptorKt$transform$14 = engineInterceptorKt$transform$13;
                    ago agoVar4 = agoVar3;
                    lg70Var2 = lg70Var3;
                    kotlinx.coroutines.a.k(engineInterceptorKt$transform$14.get_context());
                    t1o t1oVar4 = t1oVar3;
                    i2 = i4 + 1;
                    t1oVar2 = t1oVar4;
                    EngineInterceptorKt$transform$1 engineInterceptorKt$transform$15 = engineInterceptorKt$transform$14;
                    bitmap = (Bitmap) obj;
                    list = list3;
                    agoVar2 = agoVar4;
                    engineInterceptorKt$transform$12 = engineInterceptorKt$transform$15;
                    if (i2 < size) {
                        mw01 mw01Var = (mw01) list.get(i2);
                        xis0 xis0Var = lg70Var2.b;
                        engineInterceptorKt$transform$12.L$0 = t1oVar2;
                        engineInterceptorKt$transform$12.L$1 = gevVar2;
                        engineInterceptorKt$transform$12.L$2 = lg70Var2;
                        engineInterceptorKt$transform$12.L$3 = agoVar2;
                        engineInterceptorKt$transform$12.L$4 = list;
                        engineInterceptorKt$transform$12.I$0 = i2;
                        engineInterceptorKt$transform$12.I$1 = size;
                        engineInterceptorKt$transform$12.label = 1;
                        Bitmap b = mw01Var.b(bitmap, xis0Var);
                        if (b == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        int i5 = i2;
                        t1oVar3 = t1oVar2;
                        i4 = i5;
                        ago agoVar5 = agoVar2;
                        list3 = list;
                        obj = b;
                        engineInterceptorKt$transform$14 = engineInterceptorKt$transform$12;
                        agoVar4 = agoVar5;
                        kotlinx.coroutines.a.k(engineInterceptorKt$transform$14.get_context());
                        t1o t1oVar42 = t1oVar3;
                        i2 = i4 + 1;
                        t1oVar2 = t1oVar42;
                        EngineInterceptorKt$transform$1 engineInterceptorKt$transform$152 = engineInterceptorKt$transform$14;
                        bitmap = (Bitmap) obj;
                        list = list3;
                        agoVar2 = agoVar4;
                        engineInterceptorKt$transform$12 = engineInterceptorKt$transform$152;
                        if (i2 < size) {
                            agoVar2.getClass();
                            return new t1o(new w06(bitmap), t1oVar2.b, t1oVar2.c, t1oVar2.d);
                        }
                    }
                }
            }
        }
        engineInterceptorKt$transform$1 = new EngineInterceptorKt$transform$1(continuationImpl);
        Object obj2 = engineInterceptorKt$transform$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = engineInterceptorKt$transform$1.label;
        if (i != 0) {
        }
    }
}
