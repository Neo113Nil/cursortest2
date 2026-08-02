package com.yandex.go.eboks.objects.data;

import com.yandex.go.eboks.objects.data.model.EboksObjectsParams;
import com.yandex.go.eboks.objects.data.model.EboksObjectsResponse;
import defpackage.cmt;
import defpackage.dhn;
import defpackage.din;
import defpackage.fmt;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.s2a1;
import defpackage.uc4;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class c {
    public final EboksObjectsApi a;
    public final po21 b;
    public final dhn c;
    public final din d;

    public c(EboksObjectsApi eboksObjectsApi, po21 po21Var, dhn dhnVar, din dinVar) {
        this.a = eboksObjectsApi;
        this.b = po21Var;
        this.c = dhnVar;
        this.d = dinVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0087, code lost:
    
        if (r10 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0089, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(uc4 uc4Var, float f, List list, ContinuationImpl continuationImpl) {
        EboksObjectsObjectsRepository$getEboksObjects$1 eboksObjectsObjectsRepository$getEboksObjects$1;
        int i;
        if (continuationImpl instanceof EboksObjectsObjectsRepository$getEboksObjects$1) {
            eboksObjectsObjectsRepository$getEboksObjects$1 = (EboksObjectsObjectsRepository$getEboksObjects$1) continuationImpl;
            int i2 = eboksObjectsObjectsRepository$getEboksObjects$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsRepository$getEboksObjects$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsObjectsRepository$getEboksObjects$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsRepository$getEboksObjects$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    eboksObjectsObjectsRepository$getEboksObjects$1.L$0 = uc4Var;
                    eboksObjectsObjectsRepository$getEboksObjects$1.L$1 = list;
                    eboksObjectsObjectsRepository$getEboksObjects$1.F$0 = f;
                    eboksObjectsObjectsRepository$getEboksObjects$1.label = 1;
                    obj = ((e) this.b).h(eboksObjectsObjectsRepository$getEboksObjects$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        fmt fmtVar = (fmt) obj;
                        EboksObjectsResponse eboksObjectsResponse = (EboksObjectsResponse) fmtVar.a;
                        int c = s2a1.c(eboksObjectsResponse);
                        int c2 = s2a1.c(eboksObjectsResponse);
                        long j = fmtVar.h - fmtVar.g;
                        din dinVar = this.d;
                        dinVar.g(c2, j);
                        dinVar.e(c, fmtVar.f);
                        return eboksObjectsResponse;
                    }
                    f = eboksObjectsObjectsRepository$getEboksObjects$1.F$0;
                    list = (List) eboksObjectsObjectsRepository$getEboksObjects$1.L$1;
                    uc4Var = (uc4) eboksObjectsObjectsRepository$getEboksObjects$1.L$0;
                    kotlin.b.b(obj);
                }
                EboksObjectsParams eboksObjectsParams = new EboksObjectsParams(((mo21) obj).a(), uc4Var, f, list);
                dhn dhnVar = this.c;
                cmt<EboksObjectsResponse> a = this.a.a(dhnVar.a, dhnVar.b, eboksObjectsParams);
                eboksObjectsObjectsRepository$getEboksObjects$1.L$0 = null;
                eboksObjectsObjectsRepository$getEboksObjects$1.L$1 = null;
                eboksObjectsObjectsRepository$getEboksObjects$1.L$2 = null;
                eboksObjectsObjectsRepository$getEboksObjects$1.F$0 = f;
                eboksObjectsObjectsRepository$getEboksObjects$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.b(a, null, eboksObjectsObjectsRepository$getEboksObjects$1);
            }
        }
        eboksObjectsObjectsRepository$getEboksObjects$1 = new EboksObjectsObjectsRepository$getEboksObjects$1(this, continuationImpl);
        Object obj2 = eboksObjectsObjectsRepository$getEboksObjects$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsRepository$getEboksObjects$1.label;
        if (i != 0) {
        }
        EboksObjectsParams eboksObjectsParams2 = new EboksObjectsParams(((mo21) obj2).a(), uc4Var, f, list);
        dhn dhnVar2 = this.c;
        cmt<EboksObjectsResponse> a2 = this.a.a(dhnVar2.a, dhnVar2.b, eboksObjectsParams2);
        eboksObjectsObjectsRepository$getEboksObjects$1.L$0 = null;
        eboksObjectsObjectsRepository$getEboksObjects$1.L$1 = null;
        eboksObjectsObjectsRepository$getEboksObjects$1.L$2 = null;
        eboksObjectsObjectsRepository$getEboksObjects$1.F$0 = f;
        eboksObjectsObjectsRepository$getEboksObjects$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.b(a2, null, eboksObjectsObjectsRepository$getEboksObjects$1);
    }
}
