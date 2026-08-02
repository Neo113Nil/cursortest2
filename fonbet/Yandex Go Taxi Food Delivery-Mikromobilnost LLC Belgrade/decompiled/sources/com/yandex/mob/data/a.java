package com.yandex.mob.data;

import defpackage.an20;
import defpackage.ny61;
import defpackage.ol20;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ol20[] w;

    public a(vpr vprVar, c cVar, String str, ol20[] ol20VarArr) {
        this.a = vprVar;
        this.b = cVar;
        this.c = str;
        this.w = ol20VarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        if (r9.emit(r10, r0) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1 mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1;
        int i;
        Object k;
        vpr vprVar;
        int i2;
        if (continuation instanceof MobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1) {
            mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1 = (MobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1) continuation;
            int i3 = mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ol20[] ol20VarArr = this.w;
                    ol20[] ol20VarArr2 = (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length);
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$0 = null;
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$1 = null;
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$2 = null;
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$4 = vprVar2;
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$5 = null;
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$6 = null;
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.I$0 = 0;
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.I$1 = 0;
                    mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.label = 1;
                    c cVar = this.b;
                    an20 an20Var = cVar.d;
                    ol20[] ol20VarArr3 = (ol20[]) Arrays.copyOf(ol20VarArr2, ol20VarArr2.length);
                    an20Var.getClass();
                    List b = an20.b(this.c, ol20VarArr3);
                    if (b.isEmpty()) {
                        k = kotlin.collections.b.f();
                    } else {
                        Map d = cVar.d(b);
                        k = d != null ? d : cVar.k(b, mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1);
                    }
                    if (k != coroutineSingletons) {
                        vprVar = vprVar2;
                        obj2 = k;
                        i2 = 0;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                i2 = mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.I$0;
                vprVar = (vpr) mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$0 = null;
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$1 = null;
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$2 = null;
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$3 = null;
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$4 = null;
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$5 = null;
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$6 = null;
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.I$0 = i2;
                mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.label = 2;
            }
        }
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1 = new MobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$0 = null;
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$1 = null;
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$2 = null;
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$3 = null;
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$4 = null;
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$5 = null;
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.L$6 = null;
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.I$0 = i2;
        mobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1.label = 2;
    }
}
