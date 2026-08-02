package com.yandex.messaging.input.voice.reply;

import android.app.Activity;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ReplyData;
import defpackage.abz0;
import defpackage.e320;
import defpackage.fk6;
import defpackage.jum;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rh3;
import defpackage.tse;
import defpackage.wls;
import defpackage.yy31;
import defpackage.zj6;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.input.voice.reply.VoiceMessageReplyController$bind$1", f = "VoiceMessageReplyController.kt", l = {106}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class VoiceMessageReplyController$bind$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $chatId;
    final /* synthetic */ boolean $isOwn;
    final /* synthetic */ ReplyData $replyData;
    final /* synthetic */ ServerMessageRef $serverMessageRef;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceMessageReplyController$bind$1(a aVar, String str, ReplyData replyData, ServerMessageRef serverMessageRef, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$chatId = str;
        this.$replyData = replyData;
        this.$serverMessageRef = serverMessageRef;
        this.$isOwn = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VoiceMessageReplyController$bind$1(this.this$0, this.$chatId, this.$replyData, this.$serverMessageRef, this.$isOwn, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceMessageReplyController$bind$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fk6 insert;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            fk6 fk6Var = aVar.e;
            if (fk6Var == null) {
                fk6Var = null;
            }
            aVar.e = fk6Var.insert(new jum(new zj6(aVar.a, 4)));
            b bVar = this.this$0.c;
            String str = this.$chatId;
            abz0 abz0Var = new abz0(this.$replyData.getTimestamp());
            ServerMessageRef serverMessageRef = this.$serverMessageRef;
            this.label = 1;
            obj = bVar.b(str, abz0Var, serverMessageRef, this);
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
        rh3 rh3Var = (rh3) obj;
        a aVar2 = this.this$0;
        if (rh3Var == null) {
            fk6 fk6Var2 = aVar2.e;
            insert = (fk6Var2 != null ? fk6Var2 : null).insert(new jum(new zj6(aVar2.a, 0)));
        } else {
            fk6 fk6Var3 = aVar2.e;
            fk6 fk6Var4 = fk6Var3 != null ? fk6Var3 : null;
            boolean z2 = this.$isOwn;
            aVar2.d.getClass();
            try {
                e320.d().a().newInstance();
            } catch (Exception | NoClassDefFoundError unused) {
                z = false;
            }
            Activity activity = aVar2.a;
            insert = fk6Var4.insert(z ? new yy31(activity, aVar2.b, z2, rh3Var) : new jum(new zj6(activity, 3)));
        }
        aVar2.e = insert;
        return zy11.a;
    }
}
