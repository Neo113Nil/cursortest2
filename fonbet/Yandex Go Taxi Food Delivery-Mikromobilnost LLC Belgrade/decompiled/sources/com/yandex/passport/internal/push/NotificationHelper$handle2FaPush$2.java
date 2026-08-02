package com.yandex.passport.internal.push;

import com.yandex.passport.common.core.Environment;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.data.network.c8;
import com.yandex.passport.data.network.d8;
import com.yandex.passport.data.network.y7;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.report.ld;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.o9;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.report.z9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.push.NotificationHelper$handle2FaPush$2", f = "NotificationHelper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class NotificationHelper$handle2FaPush$2 extends SuspendLambda implements wls {
    final /* synthetic */ ModernAccount $account;
    final /* synthetic */ PushPayload $pushPayload;
    final /* synthetic */ String $trackId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.push.NotificationHelper$handle2FaPush$2$1", f = "NotificationHelper.kt", l = {321}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.push.NotificationHelper$handle2FaPush$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ ModernAccount $account;
        final /* synthetic */ PushPayload $pushPayload;
        final /* synthetic */ String $trackId;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(h hVar, ModernAccount modernAccount, String str, PushPayload pushPayload, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
            this.$account = modernAccount;
            this.$trackId = str;
            this.$pushPayload = pushPayload;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$account, this.$trackId, this.$pushPayload, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = this.this$0;
                d8 d8Var = hVar.h;
                com.yandex.passport.internal.network.mappers.b bVar = hVar.l;
                Environment environment = this.$account.getUid().getEnvironment();
                bVar.getClass();
                y7 y7Var = new y7(this.$account.getLocationId(), this.$account.getMasterToken(), com.yandex.passport.internal.network.mappers.b.a(environment), this.$trackId);
                this.label = 1;
                a = d8Var.a(y7Var, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                a = obj;
            }
            Object value = ((Result) a).getValue();
            h hVar2 = this.this$0;
            ModernAccount modernAccount = this.$account;
            PushPayload pushPayload = this.$pushPayload;
            Throwable a2 = Result.a(value);
            if (a2 == null) {
                c8 c8Var = (c8) value;
                com.yandex.passport.internal.report.reporters.s0 s0Var = hVar2.c;
                Uid uid = modernAccount.getUid();
                String g = hVar2.g();
                String str = g != null ? g : null;
                if (str == null) {
                    str = "";
                }
                String a3 = ((com.yandex.passport.internal.common.e) hVar2.f).a();
                String pushId = pushPayload.getPushId();
                String trackId = pushPayload.getTrackId();
                String platform = pushPayload.getPlatform();
                s0Var.getClass();
                s0Var.f(z9.w, new yd(uid), new com.yandex.passport.internal.report.a(str, 20, false), new com.yandex.passport.internal.report.a(a3, 1, false), new md(pushId, 7), new yd(trackId, 12), new md(platform, 9));
                hVar2.j(modernAccount, pushPayload, c8Var.b);
            } else {
                com.yandex.passport.internal.report.reporters.s0 s0Var2 = hVar2.c;
                String pushId2 = pushPayload.getPushId();
                String trackId2 = pushPayload.getTrackId();
                String platform2 = pushPayload.getPlatform();
                s0Var2.getClass();
                s0Var2.f(o9.w, new yd(a2), new ld(a2), new md(pushId2, 7), new yd(trackId2, 12), new md(platform2, 9));
                h.b(hVar2, pushPayload, modernAccount);
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.push.NotificationHelper$handle2FaPush$2$2", f = "NotificationHelper.kt", l = {355}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.push.NotificationHelper$handle2FaPush$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ ModernAccount $account;
        final /* synthetic */ PushPayload $pushPayload;
        int label;
        final /* synthetic */ h this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(h hVar, PushPayload pushPayload, ModernAccount modernAccount, Continuation continuation) {
            super(2, continuation);
            this.this$0 = hVar;
            this.$pushPayload = pushPayload;
            this.$account = modernAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$pushPayload, this.$account, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.passport.internal.flags.j jVar = this.this$0.k;
                com.yandex.passport.internal.flags.a aVar = com.yandex.passport.internal.flags.q.a;
                long intValue = ((Number) jVar.b(com.yandex.passport.internal.flags.q.u)).intValue();
                this.label = 1;
                if (kotlinx.coroutines.a.i(intValue, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            h.b(this.this$0, this.$pushPayload, this.$account);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationHelper$handle2FaPush$2(h hVar, ModernAccount modernAccount, String str, PushPayload pushPayload, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$account = modernAccount;
        this.$trackId = str;
        this.$pushPayload = pushPayload;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        NotificationHelper$handle2FaPush$2 notificationHelper$handle2FaPush$2 = new NotificationHelper$handle2FaPush$2(this.this$0, this.$account, this.$trackId, this.$pushPayload, continuation);
        notificationHelper$handle2FaPush$2.L$0 = obj;
        return notificationHelper$handle2FaPush$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationHelper$handle2FaPush$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tse tseVar = (tse) this.L$0;
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, this.$account, this.$trackId, this.$pushPayload, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, this.$pushPayload, this.$account, null), 3);
    }
}
