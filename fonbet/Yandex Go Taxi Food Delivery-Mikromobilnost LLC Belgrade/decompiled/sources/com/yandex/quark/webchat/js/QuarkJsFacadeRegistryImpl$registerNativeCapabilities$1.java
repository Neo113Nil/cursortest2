package com.yandex.quark.webchat.js;

import com.yandex.quark.utils.Disposable;
import defpackage.idn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.webchat.js.QuarkJsFacadeRegistryImpl$registerNativeCapabilities$1", f = "QuarkJsFacadeRegistry.kt", l = {239}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class QuarkJsFacadeRegistryImpl$registerNativeCapabilities$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuarkJsFacadeRegistryImpl$registerNativeCapabilities$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QuarkJsFacadeRegistryImpl$registerNativeCapabilities$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QuarkJsFacadeRegistryImpl$registerNativeCapabilities$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007a A[LOOP:1: B:18:0x0074->B:20:0x007a, LOOP_END] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Map map;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            r0 r0Var = dVar.D;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                idn idnVar = new idn(8, linkedHashMap, dVar);
                this.L$0 = linkedHashMap;
                this.label = 1;
                try {
                    Object collect = r0Var.collect(new a(idnVar), this);
                    if (collect != coroutineSingletons) {
                        collect = zy11Var;
                    }
                    if (collect == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = linkedHashMap;
                } catch (Throwable th) {
                    th = th;
                    map = linkedHashMap;
                    it = map.values().iterator();
                    while (it.hasNext()) {
                    }
                    map.clear();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = (Map) this.L$0;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                it = map.values().iterator();
                while (it.hasNext()) {
                    ((Disposable) it.next()).dispose();
                }
                map.clear();
                throw th;
            }
        }
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            ((Disposable) it2.next()).dispose();
        }
        map.clear();
        return zy11Var;
    }
}
