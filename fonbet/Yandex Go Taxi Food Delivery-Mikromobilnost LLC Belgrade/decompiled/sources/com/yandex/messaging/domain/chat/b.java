package com.yandex.messaging.domain.chat;

import com.yandex.messaging.core.net.entities.UpdateChatOrganizationsParams;
import com.yandex.messaging.core.net.entities.UpdateOrganizationResult;
import com.yandex.messaging.network.ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1;
import defpackage.k020;
import defpackage.kse;
import defpackage.l020;
import defpackage.ny61;
import defpackage.o0b;
import defpackage.o1b0;
import defpackage.tje;
import defpackage.z83;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class b {
    public final o0b a;
    public final o1b0 b;
    public final k020 c;
    public final com.yandex.messaging.data.e d;
    public final kse e;

    public b(o0b o0bVar, o1b0 o1b0Var, k020 k020Var, com.yandex.messaging.data.e eVar, kse kseVar) {
        this.a = o0bVar;
        this.b = o1b0Var;
        this.c = k020Var;
        this.d = eVar;
        this.e = kseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        ChatOrganizationController$updateOrganization$1 chatOrganizationController$updateOrganization$1;
        int i;
        UpdateOrganizationResult updateOrganizationResult;
        if (continuationImpl instanceof ChatOrganizationController$updateOrganization$1) {
            chatOrganizationController$updateOrganization$1 = (ChatOrganizationController$updateOrganization$1) continuationImpl;
            int i2 = chatOrganizationController$updateOrganization$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chatOrganizationController$updateOrganization$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chatOrganizationController$updateOrganization$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chatOrganizationController$updateOrganization$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    k020 k020Var = this.c;
                    o1b0 o1b0Var = this.b;
                    z83.c(null, k020Var.o(o1b0Var).contains(new Long(j)));
                    UpdateChatOrganizationsParams updateChatOrganizationsParams = new UpdateChatOrganizationsParams(o1b0Var.b, j);
                    chatOrganizationController$updateOrganization$1.L$0 = this;
                    chatOrganizationController$updateOrganization$1.label = 1;
                    o0b o0bVar = this.a;
                    o0bVar.getClass();
                    obj = tje.k0(chatOrganizationController$updateOrganization$1.get_context(), new ChatApiCalls$updateChatOrganizations$$inlined$cancelableCoroutineWrapper$default$1(null, o0bVar, updateChatOrganizationsParams), chatOrganizationController$updateOrganization$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (b) chatOrganizationController$updateOrganization$1.L$0;
                    kotlin.b.b(obj);
                }
                updateOrganizationResult = (UpdateOrganizationResult) obj;
                if (updateOrganizationResult instanceof UpdateOrganizationResult.Success) {
                    return updateOrganizationResult;
                }
                l020 C = this.c.C();
                try {
                    C.I(((UpdateOrganizationResult.Success) updateOrganizationResult).getChat());
                    C.s();
                    C.close();
                    return updateOrganizationResult;
                } finally {
                }
            }
        }
        chatOrganizationController$updateOrganization$1 = new ChatOrganizationController$updateOrganization$1(this, continuationImpl);
        Object obj2 = chatOrganizationController$updateOrganization$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chatOrganizationController$updateOrganization$1.label;
        if (i != 0) {
        }
        updateOrganizationResult = (UpdateOrganizationResult) obj2;
        if (updateOrganizationResult instanceof UpdateOrganizationResult.Success) {
        }
    }
}
