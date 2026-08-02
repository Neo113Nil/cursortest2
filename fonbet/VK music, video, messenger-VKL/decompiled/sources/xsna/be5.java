package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AuthorsChannelInlineActor.kt */
@b6l(c = "com.vk.catalog.mvi.block.video.impl.channel.AuthorsChannelInlineActor$subscribeChannel$1", f = "AuthorsChannelInlineActor.kt", l = {56, 65}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class be5 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ UserId $channelId;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ de5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be5(de5 de5Var, UserId userId, spj<? super be5> spjVar) {
        super(2, spjVar);
        this.this$0 = de5Var;
        this.$channelId = userId;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new be5(this.this$0, this.$channelId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((be5) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0078  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object obj2;
        Throwable a2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ie5 ie5Var = this.this$0.c;
            UserId userId = this.$channelId;
            String a3 = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.META_GROUP);
            this.label = 1;
            a = ie5Var.a(userId, a3, "META_GROUP", this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                kotlin.a.a(obj);
                a = obj2;
                com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
                a2 = Result.a(a);
                if (a2 != null) {
                    bVar.a(a2);
                }
                return s3q0.a;
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        de5 de5Var = this.this$0;
        UserId userId2 = this.$channelId;
        if (!(a instanceof Result.Failure)) {
            de5Var.m(new pf(3));
            m7a m7aVar = de5Var.d;
            sxm0 sxm0Var = new sxm0(userId2, true);
            this.L$0 = a;
            this.L$1 = null;
            this.I$0 = 0;
            this.label = 2;
            if (m7aVar.a(sxm0Var, this) != coroutineSingletons) {
                obj2 = a;
                a = obj2;
            }
            return coroutineSingletons;
        }
        com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
        a2 = Result.a(a);
        if (a2 != null) {
        }
        return s3q0.a;
    }
}
