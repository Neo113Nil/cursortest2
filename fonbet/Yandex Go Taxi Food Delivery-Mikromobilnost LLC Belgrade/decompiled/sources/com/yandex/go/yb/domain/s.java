package com.yandex.go.yb.domain;

import defpackage.ny61;
import defpackage.xww0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class s implements xww0 {
    public final com.yandex.go.yb.data.u a;

    public s(com.yandex.go.yb.data.u uVar) {
        this.a = uVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(3:21|22|(1:24))|12|(1:14)|15|16))|31|6|7|(0)(0)|12|(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        defpackage.xby.l(defpackage.jst.e, "FINTECH.FORCE_ACTIVATION", null, r0, "error while force activation for YbPushHandler", 2);
        r12 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        YbPushHandler$handle$1 ybPushHandler$handle$1;
        int i;
        if (continuationImpl instanceof YbPushHandler$handle$1) {
            ybPushHandler$handle$1 = (YbPushHandler$handle$1) continuationImpl;
            int i2 = ybPushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybPushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybPushHandler$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybPushHandler$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.yb.data.u uVar = this.a;
                    ybPushHandler$handle$1.L$0 = map;
                    ybPushHandler$handle$1.label = 1;
                    obj = uVar.c().h(ybPushHandler$handle$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) ybPushHandler$handle$1.L$0;
                    kotlin.b.b(obj);
                }
                boolean z = ((Boolean) obj).booleanValue();
                return Boolean.valueOf(z ? this.a.c().B.Z(map) : false);
            }
        }
        ybPushHandler$handle$1 = new YbPushHandler$handle$1(this, continuationImpl);
        Object obj2 = ybPushHandler$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybPushHandler$handle$1.label;
        if (i != 0) {
        }
        boolean z2 = ((Boolean) obj2).booleanValue();
        return Boolean.valueOf(z2 ? this.a.c().B.Z(map) : false);
    }
}
