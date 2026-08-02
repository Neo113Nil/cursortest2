package com.yandex.messaging.domain;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.MessengerEnvironment;
import defpackage.g92;
import defpackage.j3b;
import defpackage.jl40;
import defpackage.lqo;
import defpackage.ny61;
import defpackage.p4t;
import defpackage.tpr;
import defpackage.tz10;
import defpackage.w5t;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes15.dex */
public final class b {
    public final w5t a;
    public final p4t b;
    public final com.yandex.messaging.domain.personal.a c;
    public final lqo d;
    public final MessengerEnvironment e;

    public b(w5t w5tVar, p4t p4tVar, com.yandex.messaging.domain.personal.a aVar, lqo lqoVar, MessengerEnvironment messengerEnvironment) {
        this.a = w5tVar;
        this.b = p4tVar;
        this.c = aVar;
        this.d = lqoVar;
        this.e = messengerEnvironment;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, j3b j3bVar, long j, ContinuationImpl continuationImpl) {
        GetCanReportChatUseCase$canReportChat$1 getCanReportChatUseCase$canReportChat$1;
        Object obj;
        int i;
        String str;
        bVar.getClass();
        if (continuationImpl instanceof GetCanReportChatUseCase$canReportChat$1) {
            getCanReportChatUseCase$canReportChat$1 = (GetCanReportChatUseCase$canReportChat$1) continuationImpl;
            int i2 = getCanReportChatUseCase$canReportChat$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getCanReportChatUseCase$canReportChat$1.label = i2 - Integer.MIN_VALUE;
                obj = getCanReportChatUseCase$canReportChat$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getCanReportChatUseCase$canReportChat$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!j3bVar.J && !j3bVar.q) {
                        if (j3bVar.C) {
                            String str2 = j3bVar.e;
                            com.yandex.messaging.domain.personal.a aVar = bVar.c;
                            getCanReportChatUseCase$canReportChat$1.L$0 = str2;
                            getCanReportChatUseCase$canReportChat$1.J$0 = j;
                            getCanReportChatUseCase$canReportChat$1.label = 1;
                            obj = aVar.a(zy11.a, getCanReportChatUseCase$canReportChat$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str = str2;
                        }
                        return j != 0 ? Boolean.FALSE : Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j = getCanReportChatUseCase$canReportChat$1.J$0;
                str = (String) getCanReportChatUseCase$canReportChat$1.L$0;
                kotlin.b.b(obj);
                if (jl40.l(str, obj)) {
                    return Boolean.FALSE;
                }
                if (j != 0) {
                }
            }
        }
        getCanReportChatUseCase$canReportChat$1 = new GetCanReportChatUseCase$canReportChat$1(bVar, continuationImpl);
        obj = getCanReportChatUseCase$canReportChat$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getCanReportChatUseCase$canReportChat$1.label;
        if (i != 0) {
        }
        if (jl40.l(str, obj)) {
        }
        if (j != 0) {
        }
    }

    public final tpr b(ChatRequest chatRequest) {
        if (this.e.getIsModerated()) {
            return kotlinx.coroutines.flow.e.t(new m0(this.b.a(chatRequest), this.d.a(tz10.j) ? this.a.a(zy11.a) : new g92(2, 0L), new GetCanReportChatUseCase$execute$1(this, null)));
        }
        return new g92(2, Boolean.FALSE);
    }
}
