package com.ybsdk.common.repositiories.plus;

import com.ybsdk.network.Api;
import com.ybsdk.network.retrofit.e;
import com.ybsdk.rconfig.b;
import defpackage.bvf0;
import defpackage.cg51;
import defpackage.dg51;
import defpackage.ig51;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.x4c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes8.dex */
public final class a {
    public final Api a;
    public final e b;
    public final b c;

    public a(Api api, e eVar, b bVar) {
        this.a = api;
        this.b = eVar;
        this.c = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PlusRepository$getPlusShortcutData$1 plusRepository$getPlusShortcutData$1;
        int i;
        Ref$ObjectRef ref$ObjectRef;
        List list;
        Object value;
        if (continuationImpl instanceof PlusRepository$getPlusShortcutData$1) {
            plusRepository$getPlusShortcutData$1 = (PlusRepository$getPlusShortcutData$1) continuationImpl;
            int i2 = plusRepository$getPlusShortcutData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusRepository$getPlusShortcutData$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusRepository$getPlusShortcutData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusRepository$getPlusShortcutData$1.label;
                if (i != 0) {
                    Ref$ObjectRef z = qv10.z(obj);
                    ArrayList arrayList = new ArrayList();
                    PlusRepository$getPlusShortcutData$2 plusRepository$getPlusShortcutData$2 = new PlusRepository$getPlusShortcutData$2(this, str, z, arrayList, null);
                    plusRepository$getPlusShortcutData$1.L$0 = z;
                    plusRepository$getPlusShortcutData$1.L$1 = arrayList;
                    plusRepository$getPlusShortcutData$1.label = 1;
                    obj = bvf0.n(plusRepository$getPlusShortcutData$2, plusRepository$getPlusShortcutData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef = z;
                    list = arrayList;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = (List) plusRepository$getPlusShortcutData$1.L$1;
                    ref$ObjectRef = (Ref$ObjectRef) plusRepository$getPlusShortcutData$1.L$0;
                    kotlin.b.b(obj);
                }
                value = ((Result) obj).getValue();
                if (Result.a(value) == null) {
                    return new cg51(list);
                }
                ig51 ig51Var = new ig51((String) value);
                String str2 = (String) ref$ObjectRef.element;
                if (str2 == null) {
                    x4c.g("absence of x-yatraceid header for /get_widget_info response", null, null, null, 14);
                    str2 = "";
                }
                return new dg51(ig51Var, str2);
            }
        }
        plusRepository$getPlusShortcutData$1 = new PlusRepository$getPlusShortcutData$1(this, continuationImpl);
        Object obj2 = plusRepository$getPlusShortcutData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusRepository$getPlusShortcutData$1.label;
        if (i != 0) {
        }
        value = ((Result) obj2).getValue();
        if (Result.a(value) == null) {
        }
    }
}
