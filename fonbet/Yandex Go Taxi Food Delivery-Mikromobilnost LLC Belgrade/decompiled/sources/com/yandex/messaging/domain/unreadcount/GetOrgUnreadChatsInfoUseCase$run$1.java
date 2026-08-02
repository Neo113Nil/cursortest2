package com.yandex.messaging.domain.unreadcount;

import defpackage.g6u;
import defpackage.h2r;
import defpackage.kat;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lyd80;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.unreadcount.GetOrgUnreadChatsInfoUseCase$run$1", f = "GetOrgUnreadChatsInfoUseCase.kt", l = {37, 37, 43}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetOrgUnreadChatsInfoUseCase$run$1 extends SuspendLambda implements wls {
    final /* synthetic */ kat $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lyd80;", "<anonymous>", "(Ltse;)Lyd80;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.unreadcount.GetOrgUnreadChatsInfoUseCase$run$1$1", f = "GetOrgUnreadChatsInfoUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.unreadcount.GetOrgUnreadChatsInfoUseCase$run$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ kat $params;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(kat katVar, b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
            this.$params = katVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$params, this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b bVar = this.this$0;
            return bVar.b.B(new h2r(3, bVar, this.$params));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOrgUnreadChatsInfoUseCase$run$1(kat katVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$params = katVar;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetOrgUnreadChatsInfoUseCase$run$1 getOrgUnreadChatsInfoUseCase$run$1 = new GetOrgUnreadChatsInfoUseCase$run$1(this.$params, this.this$0, continuation);
        getOrgUnreadChatsInfoUseCase$run$1.L$0 = obj;
        return getOrgUnreadChatsInfoUseCase$run$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetOrgUnreadChatsInfoUseCase$run$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r10, r1, r9) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        vpr vprVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            kat katVar = this.$params;
            if (katVar.b) {
                b bVar = this.this$0;
                g6u g6uVar = bVar.d.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(katVar, bVar, null);
                this.L$0 = vprVar;
                this.L$1 = vprVar;
                this.label = 1;
                obj = tje.k0(g6uVar, anonymousClass1, this);
                if (obj != coroutineSingletons) {
                    vprVar2 = vprVar;
                    this.L$0 = vprVar2;
                    this.L$1 = null;
                    this.label = 2;
                    if (vprVar.emit(obj, this) != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            b bVar2 = this.this$0;
            Long l = this.$params.a;
            bVar2.getClass();
            tpr F = e.F(new mth(new rol0(new GetOrgUnreadChatsInfoUseCase$orgUnreadChatsInfoFlow$1(bVar2, l, null)), 6), bVar2.d.e);
            this.L$0 = null;
            this.label = 3;
        } else {
            if (i == 1) {
                vprVar = (vpr) this.L$1;
                vprVar2 = (vpr) this.L$0;
                kotlin.b.b(obj);
                this.L$0 = vprVar2;
                this.L$1 = null;
                this.label = 2;
                if (vprVar.emit(obj, this) != coroutineSingletons) {
                    vprVar = vprVar2;
                    b bVar22 = this.this$0;
                    Long l2 = this.$params.a;
                    bVar22.getClass();
                    tpr F2 = e.F(new mth(new rol0(new GetOrgUnreadChatsInfoUseCase$orgUnreadChatsInfoFlow$1(bVar22, l2, null)), 6), bVar22.d.e);
                    this.L$0 = null;
                    this.label = 3;
                }
                return coroutineSingletons;
            }
            if (i == 2) {
                vprVar = (vpr) this.L$0;
                kotlin.b.b(obj);
                b bVar222 = this.this$0;
                Long l22 = this.$params.a;
                bVar222.getClass();
                tpr F22 = e.F(new mth(new rol0(new GetOrgUnreadChatsInfoUseCase$orgUnreadChatsInfoFlow$1(bVar222, l22, null)), 6), bVar222.d.e);
                this.L$0 = null;
                this.label = 3;
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
        }
        return zy11.a;
    }
}
