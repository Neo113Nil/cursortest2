package com.yandex.go.taxi.order.provider.chat;

import defpackage.g92;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.z221;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class c {
    public final com.yandex.go.taxi.order.chat.domain.a a;
    public final z221 b;

    public c(com.yandex.go.taxi.order.chat.domain.a aVar, z221 z221Var) {
        this.a = aVar;
        this.b = z221Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, String str, String str2, ContinuationImpl continuationImpl) {
        ChatButtonDelegate$subscribeChat$1 chatButtonDelegate$subscribeChat$1;
        int i;
        tpr c;
        r0 r0Var;
        tpr mthVar;
        com.yandex.go.taxi.order.chat.domain.a aVar = cVar.a;
        if (continuationImpl instanceof ChatButtonDelegate$subscribeChat$1) {
            chatButtonDelegate$subscribeChat$1 = (ChatButtonDelegate$subscribeChat$1) continuationImpl;
            int i2 = chatButtonDelegate$subscribeChat$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatButtonDelegate$subscribeChat$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatButtonDelegate$subscribeChat$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatButtonDelegate$subscribeChat$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chatButtonDelegate$subscribeChat$1.L$0 = str;
                    chatButtonDelegate$subscribeChat$1.L$1 = str2;
                    chatButtonDelegate$subscribeChat$1.label = 1;
                    obj = aVar.a(str, str2, chatButtonDelegate$subscribeChat$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) chatButtonDelegate$subscribeChat$1.L$1;
                    str = (String) chatButtonDelegate$subscribeChat$1.L$0;
                    kotlin.b.b(obj);
                }
                tpr tprVar = (tpr) obj;
                aVar.getClass();
                int i3 = 2;
                if (str2 != null || str2.length() == 0) {
                    com.yandex.go.taxi.order.chat.data.b c2 = aVar.c(str);
                    c = c2.c(c2.s.f);
                } else {
                    c = new g92(i3, 0);
                }
                if (str2 != null || str2.length() == 0) {
                    com.yandex.go.taxi.order.chat.data.b c3 = aVar.c(str);
                    r0Var = c3.p;
                    if (r0Var.getValue() != null) {
                        c3.x.a();
                    }
                    mthVar = new mth(r0Var, 6);
                } else {
                    mthVar = new g92(i3, Boolean.FALSE);
                }
                return e.t(e.n(tprVar, c, mthVar, new ChatButtonDelegate$subscribeChat$2(cVar, null)));
            }
        }
        chatButtonDelegate$subscribeChat$1 = new ChatButtonDelegate$subscribeChat$1(cVar, continuationImpl);
        Object obj2 = chatButtonDelegate$subscribeChat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatButtonDelegate$subscribeChat$1.label;
        if (i != 0) {
        }
        tpr tprVar2 = (tpr) obj2;
        aVar.getClass();
        int i32 = 2;
        if (str2 != null) {
        }
        com.yandex.go.taxi.order.chat.data.b c22 = aVar.c(str);
        c = c22.c(c22.s.f);
        if (str2 != null) {
        }
        com.yandex.go.taxi.order.chat.data.b c32 = aVar.c(str);
        r0Var = c32.p;
        if (r0Var.getValue() != null) {
        }
        mthVar = new mth(r0Var, 6);
        return e.t(e.n(tprVar2, c, mthVar, new ChatButtonDelegate$subscribeChat$2(cVar, null)));
    }
}
