package com.yandex.messaging.internal.chat.domain;

import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.domain.k;
import com.yandex.messaging.internal.authorized.ChatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1;
import com.yandex.messaging.internal.authorized.i;
import defpackage.cl21;
import defpackage.d9g;
import defpackage.el21;
import defpackage.h9b;
import defpackage.hww;
import defpackage.j3b;
import defpackage.kse;
import defpackage.m8g;
import defpackage.ny61;
import defpackage.p4t;
import defpackage.p8b;
import defpackage.s020;
import defpackage.tpr;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class a extends k {
    public final kse b;
    public final el21 c;
    public final p4t d;

    public a(kse kseVar, el21 el21Var, p4t p4tVar) {
        super(kseVar.e);
        this.b = kseVar;
        this.c = el21Var;
        this.d = p4tVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (r10 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r10 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.yandex.messaging.domain.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        GetChatInviteHashUseCase$run$1 getChatInviteHashUseCase$run$1;
        Object obj;
        int i;
        a aVar;
        String str2;
        if (continuationImpl instanceof GetChatInviteHashUseCase$run$1) {
            getChatInviteHashUseCase$run$1 = (GetChatInviteHashUseCase$run$1) continuationImpl;
            int i2 = getChatInviteHashUseCase$run$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getChatInviteHashUseCase$run$1.label = i2 - Integer.MIN_VALUE;
                obj = getChatInviteHashUseCase$run$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getChatInviteHashUseCase$run$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr a = this.d.a(p8b.a(str));
                    getChatInviteHashUseCase$run$1.L$0 = this;
                    getChatInviteHashUseCase$run$1.L$1 = str;
                    getChatInviteHashUseCase$run$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(a, getChatInviteHashUseCase$run$1);
                } else if (i == 1) {
                    str = (String) getChatInviteHashUseCase$run$1.L$1;
                    this = (a) getChatInviteHashUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        hww i3 = ((m8g) ((s020) obj)).e().c.i();
                        if (i3 != null) {
                            return i3.c;
                        }
                        return null;
                    }
                    str2 = (String) getChatInviteHashUseCase$run$1.L$1;
                    aVar = (a) getChatInviteHashUseCase$run$1.L$0;
                    kotlin.b.b(obj);
                    h9b b = ((d9g) ((cl21) obj)).b();
                    ExistingChatRequest a2 = p8b.a(str2);
                    b.getClass();
                    tpr F = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.i(new ChatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1(null, b, a2)), aVar.b.e);
                    getChatInviteHashUseCase$run$1.L$0 = null;
                    getChatInviteHashUseCase$run$1.L$1 = null;
                    getChatInviteHashUseCase$run$1.label = 3;
                    obj = kotlinx.coroutines.flow.e.y(F, getChatInviteHashUseCase$run$1);
                }
                if (!((j3b) obj).C) {
                    el21 el21Var = this.c;
                    getChatInviteHashUseCase$run$1.L$0 = this;
                    getChatInviteHashUseCase$run$1.L$1 = str;
                    getChatInviteHashUseCase$run$1.label = 2;
                    obj = i.a(el21Var, getChatInviteHashUseCase$run$1);
                    if (obj != coroutineSingletons) {
                        String str3 = str;
                        aVar = this;
                        str2 = str3;
                        h9b b2 = ((d9g) ((cl21) obj)).b();
                        ExistingChatRequest a22 = p8b.a(str2);
                        b2.getClass();
                        tpr F2 = kotlinx.coroutines.flow.e.F(kotlinx.coroutines.flow.e.i(new ChatScopeHolder$chatComponentFlow$$inlined$disposableFlowWrapper$1(null, b2, a22)), aVar.b.e);
                        getChatInviteHashUseCase$run$1.L$0 = null;
                        getChatInviteHashUseCase$run$1.L$1 = null;
                        getChatInviteHashUseCase$run$1.label = 3;
                        obj = kotlinx.coroutines.flow.e.y(F2, getChatInviteHashUseCase$run$1);
                    }
                    return coroutineSingletons;
                }
                return null;
            }
        }
        getChatInviteHashUseCase$run$1 = new GetChatInviteHashUseCase$run$1(this, continuationImpl);
        obj = getChatInviteHashUseCase$run$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getChatInviteHashUseCase$run$1.label;
        if (i != 0) {
        }
        if (!((j3b) obj).C) {
        }
        return null;
    }
}
