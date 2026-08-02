package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation;

import com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.ItemType;
import defpackage.ch90;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tq01;
import defpackage.tse;
import defpackage.vqj0;
import defpackage.wls;
import defpackage.zq01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteViewModel$onInputChanged$1", f = "TransferRequisiteViewModel.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferRequisiteViewModel$onInputChanged$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteViewModel$onInputChanged$1$1", f = "TransferRequisiteViewModel.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend")
    /* renamed from: com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteViewModel$onInputChanged$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                this.label = 1;
                if (bVar.c0(false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequisiteViewModel$onInputChanged$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransferRequisiteViewModel$onInputChanged$1 transferRequisiteViewModel$onInputChanged$1 = new TransferRequisiteViewModel$onInputChanged$1(this.this$0, continuation);
        transferRequisiteViewModel$onInputChanged$1.L$0 = obj;
        return transferRequisiteViewModel$onInputChanged$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequisiteViewModel$onInputChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        vqj0 c;
        tse tseVar2;
        tq01 b;
        vqj0 c2;
        tq01 b2;
        vqj0 c3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tseVar = (tse) this.L$0;
            b bVar = this.this$0;
            tq01 b3 = ((zq01) bVar.X()).b();
            if (b3 != null && (c = b3.c(ItemType.BIC)) != null && bVar.f0(c.a) && !(((zq01) bVar.X()).a instanceof ch90)) {
                b bVar2 = this.this$0;
                this.L$0 = tseVar;
                this.label = 1;
                if (bVar2.e0(false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                tseVar2 = tseVar;
            }
            b bVar3 = this.this$0;
            b = ((zq01) bVar3.X()).b();
            if (b != null && (c2 = b.c(ItemType.BIC)) != null && (b2 = ((zq01) bVar3.X()).b()) != null && (c3 = b2.c(ItemType.ACCOUNT_NUMBER)) != null && (((zq01) bVar3.X()).a instanceof ch90) && bVar3.f0(c2.a) && c2.c.length() > 0 && bVar3.f0(c3.a) && ((zq01) bVar3.X()).d) {
                b bVar4 = this.this$0;
                bVar4.J = tje.N(tseVar, null, null, new AnonymousClass1(bVar4, null), 3);
            }
            return zy11.a;
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        tseVar2 = (tse) this.L$0;
        kotlin.b.b(obj);
        tseVar = tseVar2;
        b bVar32 = this.this$0;
        b = ((zq01) bVar32.X()).b();
        if (b != null) {
            b bVar42 = this.this$0;
            bVar42.J = tje.N(tseVar, null, null, new AnonymousClass1(bVar42, null), 3);
        }
        return zy11.a;
    }
}
