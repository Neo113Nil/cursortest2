package com.yandex.messaging.chat.attachments;

import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import defpackage.fyj;
import defpackage.g6u;
import defpackage.m8g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.s020;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.z83;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.chat.attachments.YaDiskSpaceErrorInteractor$makeMessageHandled$1", f = "YaDiskSpaceErrorInteractor.kt", l = {43, 46}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class YaDiskSpaceErrorInteractor$makeMessageHandled$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest;
    final /* synthetic */ String $messageId;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YaDiskSpaceErrorInteractor$makeMessageHandled$1(d dVar, ChatRequest chatRequest, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$chatRequest = chatRequest;
        this.$messageId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new YaDiskSpaceErrorInteractor$makeMessageHandled$1(this.this$0, this.$chatRequest, this.$messageId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((YaDiskSpaceErrorInteractor$makeMessageHandled$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002f, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            g6u g6uVar = dVar.c.b;
            YaDiskSpaceErrorInteractor$makeMessageHandled$1$bridge$1 yaDiskSpaceErrorInteractor$makeMessageHandled$1$bridge$1 = new YaDiskSpaceErrorInteractor$makeMessageHandled$1$bridge$1(dVar, null);
            this.label = 1;
            obj = tje.k0(g6uVar, yaDiskSpaceErrorInteractor$makeMessageHandled$1$bridge$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                fyj fyjVar = (fyj) ((m8g) ((s020) obj)).F0.get();
                String str = this.$messageId;
                fyjVar.getClass();
                z83.g(null, Looper.myLooper(), fyjVar.a);
                pz40 pz40Var = (pz40) fyjVar.c.get(str);
                if (pz40Var != null) {
                    ((r0) pz40Var).l(null);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        ChatRequest chatRequest = this.$chatRequest;
        this.label = 2;
        obj = ((com.yandex.messaging.internal.authorized.chat.b) obj).a(chatRequest, this);
    }
}
