package com.yandex.messaging.internal.view.timeline;

import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.entities.ChatNamespaces;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.m8g;
import defpackage.ny61;
import defpackage.s020;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class m {
    public final ChatRequest a;
    public final com.yandex.messaging.internal.authorized.chat.b b;
    public final ike c = bvf0.b();

    public m(ChatRequest chatRequest, com.yandex.messaging.internal.authorized.chat.b bVar) {
        this.a = chatRequest;
        this.b = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r0 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(m mVar, String str, long j, long j2, ContinuationImpl continuationImpl) {
        MessageViewsRefresher$doRequestForwardViews$1 messageViewsRefresher$doRequestForwardViews$1;
        int i;
        mVar.getClass();
        if (continuationImpl instanceof MessageViewsRefresher$doRequestForwardViews$1) {
            messageViewsRefresher$doRequestForwardViews$1 = (MessageViewsRefresher$doRequestForwardViews$1) continuationImpl;
            int i2 = messageViewsRefresher$doRequestForwardViews$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messageViewsRefresher$doRequestForwardViews$1.label = i2 - Integer.MIN_VALUE;
                MessageViewsRefresher$doRequestForwardViews$1 messageViewsRefresher$doRequestForwardViews$12 = messageViewsRefresher$doRequestForwardViews$1;
                Object obj = messageViewsRefresher$doRequestForwardViews$12.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messageViewsRefresher$doRequestForwardViews$12.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (str != null && ChatNamespaces.b(str)) {
                        messageViewsRefresher$doRequestForwardViews$12.L$0 = str;
                        messageViewsRefresher$doRequestForwardViews$12.J$0 = j;
                        messageViewsRefresher$doRequestForwardViews$12.J$1 = j2;
                        messageViewsRefresher$doRequestForwardViews$12.label = 1;
                        obj = mVar.b(messageViewsRefresher$doRequestForwardViews$12);
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = messageViewsRefresher$doRequestForwardViews$12.J$1;
                j = messageViewsRefresher$doRequestForwardViews$12.J$0;
                str = (String) messageViewsRefresher$doRequestForwardViews$12.L$0;
                kotlin.b.b(obj);
                messageViewsRefresher$doRequestForwardViews$12.L$0 = null;
                messageViewsRefresher$doRequestForwardViews$12.label = 2;
                return ((com.yandex.messaging.internal.authorized.chat.refresher.e) obj).c(str, j, j2, messageViewsRefresher$doRequestForwardViews$12) != obj2 ? obj2 : zy11Var;
            }
        }
        messageViewsRefresher$doRequestForwardViews$1 = new MessageViewsRefresher$doRequestForwardViews$1(mVar, continuationImpl);
        MessageViewsRefresher$doRequestForwardViews$1 messageViewsRefresher$doRequestForwardViews$122 = messageViewsRefresher$doRequestForwardViews$1;
        Object obj3 = messageViewsRefresher$doRequestForwardViews$122.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messageViewsRefresher$doRequestForwardViews$122.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        messageViewsRefresher$doRequestForwardViews$122.L$0 = null;
        messageViewsRefresher$doRequestForwardViews$122.label = 2;
        if (((com.yandex.messaging.internal.authorized.chat.refresher.e) obj3).c(str, j, j2, messageViewsRefresher$doRequestForwardViews$122) != obj22) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        MessageViewsRefresher$getRefresher$1 messageViewsRefresher$getRefresher$1;
        int i;
        if (continuationImpl instanceof MessageViewsRefresher$getRefresher$1) {
            messageViewsRefresher$getRefresher$1 = (MessageViewsRefresher$getRefresher$1) continuationImpl;
            int i2 = messageViewsRefresher$getRefresher$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                messageViewsRefresher$getRefresher$1.label = i2 - Integer.MIN_VALUE;
                Object obj = messageViewsRefresher$getRefresher$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = messageViewsRefresher$getRefresher$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    messageViewsRefresher$getRefresher$1.label = 1;
                    obj = this.b.a(this.a, messageViewsRefresher$getRefresher$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return (com.yandex.messaging.internal.authorized.chat.refresher.e) ((m8g) ((s020) obj)).o0.get();
            }
        }
        messageViewsRefresher$getRefresher$1 = new MessageViewsRefresher$getRefresher$1(this, continuationImpl);
        Object obj2 = messageViewsRefresher$getRefresher$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = messageViewsRefresher$getRefresher$1.label;
        if (i != 0) {
        }
        return (com.yandex.messaging.internal.authorized.chat.refresher.e) ((m8g) ((s020) obj2)).o0.get();
    }
}
