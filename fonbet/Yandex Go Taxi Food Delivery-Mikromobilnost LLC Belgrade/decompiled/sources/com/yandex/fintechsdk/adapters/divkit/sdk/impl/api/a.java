package com.yandex.fintechsdk.adapters.divkit.sdk.impl.api;

import android.content.Context;
import com.yandex.fintechsdk.flows.payment.kit.internal.widget.b;
import defpackage.gkt;
import defpackage.gtk;
import defpackage.lml;
import defpackage.ny61;
import defpackage.v920;
import defpackage.wxk;
import defpackage.xrs;
import defpackage.xvf0;
import defpackage.yzh;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes10.dex */
public final class a {
    public yzh a;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(b bVar, ContinuationImpl continuationImpl) {
        DivKitAdapterImpl$loadView$1 divKitAdapterImpl$loadView$1;
        int i;
        v920 v920Var;
        if (continuationImpl instanceof DivKitAdapterImpl$loadView$1) {
            divKitAdapterImpl$loadView$1 = (DivKitAdapterImpl$loadView$1) continuationImpl;
            int i2 = divKitAdapterImpl$loadView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                divKitAdapterImpl$loadView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = divKitAdapterImpl$loadView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = divKitAdapterImpl$loadView$1.label;
                if (i == 0) {
                    if (i == 1) {
                        kotlin.b.b(obj);
                        return ((Result) obj).getValue();
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                yzh yzhVar = this.a;
                if (yzhVar == null || (v920Var = (v920) yzhVar.a) == null) {
                    ny61.r("DivKit adapter hasn't been initialized");
                    return null;
                }
                wxk wxkVar = (wxk) v920Var.a;
                Context context = wxkVar.a;
                com.yandex.fintechsdk.adapters.divkit.sdk.impl.internal.view.a aVar = new com.yandex.fintechsdk.adapters.divkit.sdk.impl.internal.view.a(context, wxkVar.b, (gtk) ((xvf0) v920Var.x).get(), (lml) ((xvf0) v920Var.y).get(), wxkVar.d, new xrs(context, (com.yandex.div.core.expression.variables.a) ((xvf0) v920Var.b).get()), new gkt(0, context), (com.yandex.div.core.expression.variables.a) ((xvf0) v920Var.b).get());
                divKitAdapterImpl$loadView$1.label = 1;
                Object a = aVar.a(bVar, divKitAdapterImpl$loadView$1);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        divKitAdapterImpl$loadView$1 = new DivKitAdapterImpl$loadView$1(this, continuationImpl);
        Object obj2 = divKitAdapterImpl$loadView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = divKitAdapterImpl$loadView$1.label;
        if (i == 0) {
        }
    }
}
