package com.yandex.go.taxi.order.queue.repository;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.kgx;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.rme0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes14.dex */
public final class a {
    public static final /* synthetic */ kgx[] d = {new MutablePropertyReference1Impl("orderIds", 0, "getOrderIds()Ljava/util/List;", a.class)};
    public final kotlinx.coroutines.sync.a a = gtq0.a();
    public final cne0 b;
    public final rme0 c;

    public a(dne0 dne0Var) {
        cne0 a = dne0Var.a("prefs_queue_version");
        this.b = a;
        this.c = new rme0(1, a, a, "order_ids");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #0 {all -> 0x007a, blocks: (B:12:0x004f, B:13:0x005e, B:16:0x006a, B:23:0x0076, B:19:0x007c, B:26:0x008c), top: B:11:0x004f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        QueueVersionRepository$getVersionForOrder$1 queueVersionRepository$getVersionForOrder$1;
        int i;
        String str2;
        g050 g050Var;
        ArrayList arrayList;
        int size;
        kgx[] kgxVarArr = d;
        rme0 rme0Var = this.c;
        try {
            if (continuationImpl instanceof QueueVersionRepository$getVersionForOrder$1) {
                queueVersionRepository$getVersionForOrder$1 = (QueueVersionRepository$getVersionForOrder$1) continuationImpl;
                int i2 = queueVersionRepository$getVersionForOrder$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    queueVersionRepository$getVersionForOrder$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = queueVersionRepository$getVersionForOrder$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = queueVersionRepository$getVersionForOrder$1.label;
                    if (i != 0) {
                        b.b(obj);
                        queueVersionRepository$getVersionForOrder$1.L$0 = str;
                        kotlinx.coroutines.sync.a aVar = this.a;
                        queueVersionRepository$getVersionForOrder$1.L$1 = aVar;
                        queueVersionRepository$getVersionForOrder$1.label = 1;
                        if (aVar.a(queueVersionRepository$getVersionForOrder$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str2 = str;
                        g050Var = aVar;
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) queueVersionRepository$getVersionForOrder$1.L$1;
                        str2 = (String) queueVersionRepository$getVersionForOrder$1.L$0;
                        b.b(obj);
                    }
                    arrayList = new ArrayList((List) rme0Var.getValue(this, kgxVarArr[0]));
                    while (true) {
                        size = arrayList.size();
                        cne0 cne0Var = this.b;
                        if (size > 20) {
                            rme0Var.setValue(this, kgxVarArr[0], arrayList);
                            Integer num = new Integer(cne0Var.i("order" + str2, 0));
                            g050Var.d(null);
                            return num;
                        }
                        String str3 = (String) kp50.L(arrayList);
                        if (jl40.l(str3, str2)) {
                            arrayList.add(str3);
                        } else {
                            cne0Var.w("order" + str3);
                        }
                    }
                }
            }
            arrayList = new ArrayList((List) rme0Var.getValue(this, kgxVarArr[0]));
            while (true) {
                size = arrayList.size();
                cne0 cne0Var2 = this.b;
                if (size > 20) {
                }
            }
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        queueVersionRepository$getVersionForOrder$1 = new QueueVersionRepository$getVersionForOrder$1(this, continuationImpl);
        Object obj2 = queueVersionRepository$getVersionForOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueVersionRepository$getVersionForOrder$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x004c, B:13:0x0064, B:14:0x006a), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v4, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        QueueVersionRepository$incrementLocalVersionForOrder$1 queueVersionRepository$incrementLocalVersionForOrder$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        ArrayList arrayList;
        rme0 rme0Var = this.c;
        try {
            if (continuationImpl instanceof QueueVersionRepository$incrementLocalVersionForOrder$1) {
                queueVersionRepository$incrementLocalVersionForOrder$1 = (QueueVersionRepository$incrementLocalVersionForOrder$1) continuationImpl;
                int i2 = queueVersionRepository$incrementLocalVersionForOrder$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    queueVersionRepository$incrementLocalVersionForOrder$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = queueVersionRepository$incrementLocalVersionForOrder$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = queueVersionRepository$incrementLocalVersionForOrder$1.label;
                    if (i != 0) {
                        b.b(obj);
                        queueVersionRepository$incrementLocalVersionForOrder$1.L$0 = str;
                        aVar = this.a;
                        queueVersionRepository$incrementLocalVersionForOrder$1.L$1 = aVar;
                        queueVersionRepository$incrementLocalVersionForOrder$1.label = 1;
                        if (aVar.a(queueVersionRepository$incrementLocalVersionForOrder$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r8 = (g050) queueVersionRepository$incrementLocalVersionForOrder$1.L$1;
                        String str2 = (String) queueVersionRepository$incrementLocalVersionForOrder$1.L$0;
                        b.b(obj);
                        aVar = r8;
                        str = str2;
                    }
                    kgx[] kgxVarArr = d;
                    arrayList = new ArrayList((List) rme0Var.getValue(this, kgxVarArr[0]));
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                    rme0Var.setValue(this, kgxVarArr[0], arrayList);
                    cne0 cne0Var = this.b;
                    String str3 = "order" + str;
                    cne0Var.d().putInt(str3, cne0Var.i(str3, 0) + 1).commit();
                    aVar.d(null);
                    return zy11.a;
                }
            }
            kgx[] kgxVarArr2 = d;
            arrayList = new ArrayList((List) rme0Var.getValue(this, kgxVarArr2[0]));
            if (!arrayList.contains(str)) {
            }
            rme0Var.setValue(this, kgxVarArr2[0], arrayList);
            cne0 cne0Var2 = this.b;
            String str32 = "order" + str;
            cne0Var2.d().putInt(str32, cne0Var2.i(str32, 0) + 1).commit();
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        queueVersionRepository$incrementLocalVersionForOrder$1 = new QueueVersionRepository$incrementLocalVersionForOrder$1(this, continuationImpl);
        Object obj2 = queueVersionRepository$incrementLocalVersionForOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queueVersionRepository$incrementLocalVersionForOrder$1.label;
        if (i != 0) {
        }
    }
}
