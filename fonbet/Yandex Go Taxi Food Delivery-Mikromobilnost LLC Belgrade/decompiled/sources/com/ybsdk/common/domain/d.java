package com.ybsdk.common.domain;

import com.ybsdk.common.entities.SupportStateEntity;
import defpackage.ny61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes2.dex */
public final class d {
    public final com.ybsdk.common.repositiories.supportchat.a a;

    public d(com.ybsdk.common.repositiories.supportchat.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        GetSupportStatusInteractor$getSupportStatus$1 getSupportStatusInteractor$getSupportStatus$1;
        int i;
        Object a;
        if (continuationImpl instanceof GetSupportStatusInteractor$getSupportStatus$1) {
            getSupportStatusInteractor$getSupportStatus$1 = (GetSupportStatusInteractor$getSupportStatus$1) continuationImpl;
            int i2 = getSupportStatusInteractor$getSupportStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getSupportStatusInteractor$getSupportStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = getSupportStatusInteractor$getSupportStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getSupportStatusInteractor$getSupportStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    getSupportStatusInteractor$getSupportStatus$1.label = 1;
                    a = this.a.a(getSupportStatusInteractor$getSupportStatus$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    a = ((Result) obj).getValue();
                }
                if (Result.a(a) != null && ((Boolean) a).booleanValue()) {
                }
                return SupportStateEntity.AVAILABLE;
            }
        }
        getSupportStatusInteractor$getSupportStatus$1 = new GetSupportStatusInteractor$getSupportStatus$1(this, continuationImpl);
        Object obj2 = getSupportStatusInteractor$getSupportStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getSupportStatusInteractor$getSupportStatus$1.label;
        if (i != 0) {
        }
        return Result.a(a) != null ? SupportStateEntity.AVAILABLE : SupportStateEntity.HAS_UNREAD_MESSAGES;
    }
}
