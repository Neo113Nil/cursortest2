package com.yandex.fintechsdk.core.network.api.request;

import defpackage.jse;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public abstract class a {
    public final jse a;

    public a(int i) {
        sjh sjhVar = uyj.a;
        this.a = mdh.b;
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, ContinuationImpl continuationImpl) {
        Requester$execute$1 requester$execute$1;
        int i;
        if (continuationImpl instanceof Requester$execute$1) {
            requester$execute$1 = (Requester$execute$1) continuationImpl;
            int i2 = requester$execute$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requester$execute$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = requester$execute$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requester$execute$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Requester$execute$2 requester$execute$2 = new Requester$execute$2(this, obj, null);
                    requester$execute$1.label = 1;
                    obj2 = tje.k0(this.a, requester$execute$2, requester$execute$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return ((Result) obj2).getValue();
            }
        }
        requester$execute$1 = new Requester$execute$1(this, continuationImpl);
        Object obj22 = requester$execute$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requester$execute$1.label;
        if (i != 0) {
        }
        return ((Result) obj22).getValue();
    }

    public abstract Object c(Object obj, Continuation continuation);

    public abstract Object d(Object obj);

    public a() {
        this(0);
    }
}
