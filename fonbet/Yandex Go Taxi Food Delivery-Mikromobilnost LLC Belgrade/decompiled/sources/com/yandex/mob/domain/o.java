package com.yandex.mob.domain;

import defpackage.go20;
import defpackage.gw00;
import defpackage.ny61;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class o {
    public final n a;

    public o(n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        MobOtherRequestsHeadersComposer$otherRequestsHeaders$1 mobOtherRequestsHeadersComposer$otherRequestsHeaders$1;
        int i;
        String str;
        if (continuationImpl instanceof MobOtherRequestsHeadersComposer$otherRequestsHeaders$1) {
            mobOtherRequestsHeadersComposer$otherRequestsHeaders$1 = (MobOtherRequestsHeadersComposer$otherRequestsHeaders$1) continuationImpl;
            int i2 = mobOtherRequestsHeadersComposer$otherRequestsHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobOtherRequestsHeadersComposer$otherRequestsHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mobOtherRequestsHeadersComposer$otherRequestsHeaders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobOtherRequestsHeadersComposer$otherRequestsHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mobOtherRequestsHeadersComposer$otherRequestsHeaders$1.L$0 = "X-Mob-Id";
                    mobOtherRequestsHeadersComposer$otherRequestsHeaders$1.label = 1;
                    Object a = this.a.a(mobOtherRequestsHeadersComposer$otherRequestsHeaders$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    str = "X-Mob-Id";
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) mobOtherRequestsHeadersComposer$otherRequestsHeaders$1.L$0;
                    kotlin.b.b(obj);
                }
                return new go20(gw00.e(new Pair(str, obj)));
            }
        }
        mobOtherRequestsHeadersComposer$otherRequestsHeaders$1 = new MobOtherRequestsHeadersComposer$otherRequestsHeaders$1(this, continuationImpl);
        Object obj2 = mobOtherRequestsHeadersComposer$otherRequestsHeaders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobOtherRequestsHeadersComposer$otherRequestsHeaders$1.label;
        if (i != 0) {
        }
        return new go20(gw00.e(new Pair(str, obj2)));
    }
}
