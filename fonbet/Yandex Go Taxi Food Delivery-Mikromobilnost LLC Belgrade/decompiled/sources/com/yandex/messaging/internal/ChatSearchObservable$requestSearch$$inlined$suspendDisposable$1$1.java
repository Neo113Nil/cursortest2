package com.yandex.messaging.internal;

import android.os.Bundle;
import com.yandex.messaging.ChatRequest;
import defpackage.e8b;
import defpackage.m8g;
import defpackage.m9b;
import defpackage.mvg;
import defpackage.n9b;
import defpackage.ny61;
import defpackage.o3;
import defpackage.o9b;
import defpackage.oyh0;
import defpackage.s020;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1", f = "ChatSearchObservable.kt", l = {33, 35}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ ChatRequest $chatRequest$inlined;
    final /* synthetic */ n9b $listener$inlined;
    final /* synthetic */ String $query$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ o9b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1(Continuation continuation, o9b o9bVar, ChatRequest chatRequest, String str, n9b n9bVar) {
        super(2, continuation);
        this.this$0 = o9bVar;
        this.$chatRequest$inlined = chatRequest;
        this.$query$inlined = str;
        this.$listener$inlined = n9bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1 chatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1 = new ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1(continuation, this.this$0, this.$chatRequest$inlined, this.$query$inlined, this.$listener$inlined);
        chatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1.L$0 = obj;
        return chatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatSearchObservable$requestSearch$$inlined$suspendDisposable$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002e, code lost:
    
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
            com.yandex.messaging.internal.authorized.chat.b bVar = this.this$0.a;
            ChatRequest chatRequest = this.$chatRequest$inlined;
            this.label = 1;
            obj = bVar.a(chatRequest, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                long[] jArr = (long[]) obj;
                m9b m9bVar = (m9b) this.$listener$inlined;
                com.yandex.messaging.ui.timeline.b bVar2 = m9bVar.a;
                int length = jArr.length;
                bVar2.getClass();
                bVar2.c(new e8b(bVar2, length, 1));
                int i2 = 0;
                if (jArr.length == 0) {
                    m9bVar.J = null;
                    m9bVar.D.setVisibility(8);
                    m9bVar.C.setText(oyh0.messaging_chat_search_empty_results);
                    m9bVar.E.setEnabled(false);
                    m9bVar.F.setEnabled(false);
                } else {
                    o3 o3Var = new o3(m9bVar, jArr);
                    m9bVar.J = o3Var;
                    if (jArr.length == 0) {
                        ny61.k();
                        return null;
                    }
                    Bundle bundle = m9bVar.K;
                    boolean z = bundle != null && bundle.containsKey("search_position");
                    if (z) {
                        i2 = m9bVar.K.getInt("search_position");
                        if (i2 < 0) {
                            ny61.k();
                            return null;
                        }
                        if (i2 >= jArr.length) {
                            i2 = jArr.length - 1;
                        }
                    }
                    o3Var.b = i2;
                    o3Var.B(!z);
                }
                m9bVar.K = null;
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        com.yandex.messaging.internal.authorized.chat.j jVar = (com.yandex.messaging.internal.authorized.chat.j) ((m8g) ((s020) obj)).h0.get();
        String str = this.$query$inlined;
        this.label = 2;
        obj = jVar.a(str, this);
    }
}
