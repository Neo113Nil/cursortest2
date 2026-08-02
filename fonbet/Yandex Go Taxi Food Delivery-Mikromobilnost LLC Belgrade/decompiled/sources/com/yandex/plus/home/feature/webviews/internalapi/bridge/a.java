package com.yandex.plus.home.feature.webviews.internalapi.bridge;

import defpackage.gov;
import defpackage.jse;
import defpackage.ny61;
import defpackage.pw80;
import defpackage.sbx;
import defpackage.tje;
import defpackage.v521;
import defpackage.vld0;
import defpackage.zcx;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class a {
    public final jse a;
    public final zcx b = tje.a(sbx.d, new vld0(2));
    public final v521 c = new v521(pw80.Companion.serializer());
    public final v521 d = new v521(gov.Companion.serializer());

    public a(jse jseVar) {
        this.a = jseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        PlusWebMessagesAdapter$fromJsonString$1 plusWebMessagesAdapter$fromJsonString$1;
        int i;
        if (continuationImpl instanceof PlusWebMessagesAdapter$fromJsonString$1) {
            plusWebMessagesAdapter$fromJsonString$1 = (PlusWebMessagesAdapter$fromJsonString$1) continuationImpl;
            int i2 = plusWebMessagesAdapter$fromJsonString$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusWebMessagesAdapter$fromJsonString$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusWebMessagesAdapter$fromJsonString$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusWebMessagesAdapter$fromJsonString$1.label;
                if (i != 0) {
                    b.b(obj);
                    PlusWebMessagesAdapter$fromJsonString$2 plusWebMessagesAdapter$fromJsonString$2 = new PlusWebMessagesAdapter$fromJsonString$2(this, str, null);
                    plusWebMessagesAdapter$fromJsonString$1.L$0 = null;
                    plusWebMessagesAdapter$fromJsonString$1.label = 1;
                    obj = tje.k0(this.a, plusWebMessagesAdapter$fromJsonString$2, plusWebMessagesAdapter$fromJsonString$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        plusWebMessagesAdapter$fromJsonString$1 = new PlusWebMessagesAdapter$fromJsonString$1(this, continuationImpl);
        Object obj2 = plusWebMessagesAdapter$fromJsonString$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusWebMessagesAdapter$fromJsonString$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(gov govVar, ContinuationImpl continuationImpl) {
        PlusWebMessagesAdapter$toJsonString$1 plusWebMessagesAdapter$toJsonString$1;
        int i;
        if (continuationImpl instanceof PlusWebMessagesAdapter$toJsonString$1) {
            plusWebMessagesAdapter$toJsonString$1 = (PlusWebMessagesAdapter$toJsonString$1) continuationImpl;
            int i2 = plusWebMessagesAdapter$toJsonString$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusWebMessagesAdapter$toJsonString$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusWebMessagesAdapter$toJsonString$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusWebMessagesAdapter$toJsonString$1.label;
                if (i != 0) {
                    b.b(obj);
                    PlusWebMessagesAdapter$toJsonString$2 plusWebMessagesAdapter$toJsonString$2 = new PlusWebMessagesAdapter$toJsonString$2(this, govVar, null);
                    plusWebMessagesAdapter$toJsonString$1.L$0 = null;
                    plusWebMessagesAdapter$toJsonString$1.label = 1;
                    obj = tje.k0(this.a, plusWebMessagesAdapter$toJsonString$2, plusWebMessagesAdapter$toJsonString$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        plusWebMessagesAdapter$toJsonString$1 = new PlusWebMessagesAdapter$toJsonString$1(this, continuationImpl);
        Object obj2 = plusWebMessagesAdapter$toJsonString$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusWebMessagesAdapter$toJsonString$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
