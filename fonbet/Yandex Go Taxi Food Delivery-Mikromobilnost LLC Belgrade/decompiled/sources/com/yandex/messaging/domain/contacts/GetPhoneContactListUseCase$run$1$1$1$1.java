package com.yandex.messaging.domain.contacts;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qbt;
import defpackage.rbt;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lqbt;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.contacts.GetPhoneContactListUseCase$run$1$1$1$1", f = "GetPhoneContactListUseCase.kt", l = {74, HProv.PROV_GOST_2001_DH}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetPhoneContactListUseCase$run$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $settingEnabled;
    final /* synthetic */ com.yandex.messaging.internal.storage.contacts.a $this_with;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ rbt this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzy11;", "it", "Lqbt;", "<anonymous>", "(V)Lcom/yandex/messaging/domain/contacts/GetPhoneContactListUseCase$PhoneContactsResult;"}, k = 3, mv = {2, 1, 0})
    @mvg(c = "com.yandex.messaging.domain.contacts.GetPhoneContactListUseCase$run$1$1$1$1$1", f = "GetPhoneContactListUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.messaging.domain.contacts.GetPhoneContactListUseCase$run$1$1$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ boolean $settingEnabled;
        final /* synthetic */ com.yandex.messaging.internal.storage.contacts.a $this_with;
        int label;
        final /* synthetic */ rbt this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(rbt rbtVar, com.yandex.messaging.internal.storage.contacts.a aVar, boolean z, Continuation continuation) {
            super(2, continuation);
            this.this$0 = rbtVar;
            this.$this_with = aVar;
            this.$settingEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$this_with, this.$settingEnabled, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((zy11) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return rbt.d(this.this$0, this.$this_with, this.$settingEnabled);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPhoneContactListUseCase$run$1$1$1$1(rbt rbtVar, com.yandex.messaging.internal.storage.contacts.a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = rbtVar;
        this.$this_with = aVar;
        this.$settingEnabled = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetPhoneContactListUseCase$run$1$1$1$1 getPhoneContactListUseCase$run$1$1$1$1 = new GetPhoneContactListUseCase$run$1$1$1$1(this.this$0, this.$this_with, this.$settingEnabled, continuation);
        getPhoneContactListUseCase$run$1$1$1$1.L$0 = obj;
        return getPhoneContactListUseCase$run$1$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetPhoneContactListUseCase$run$1$1$1$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r9, r1, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r1.emit(r9, r8) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            qbt d = rbt.d(this.this$0, this.$this_with, this.$settingEnabled);
            this.L$0 = vprVar;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$0;
            kotlin.b.b(obj);
        }
        com.yandex.messaging.internal.storage.contacts.a aVar = this.$this_with;
        g I = e.I(aVar.c, new AnonymousClass1(this.this$0, aVar, this.$settingEnabled, null));
        this.L$0 = null;
        this.label = 2;
    }
}
