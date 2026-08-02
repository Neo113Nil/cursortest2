package com.yandex.go.taxi.order.chat.navigation;

import com.yandex.go.taxi.order.chat.domain.model.MessengerType;
import defpackage.g6u;
import defpackage.hxx;
import defpackage.m950;
import defpackage.mvg;
import defpackage.n3y0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.pep0;
import defpackage.s350;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.chat.navigation.TaxiOrderMessengerNavigator$openChat$1", f = "TaxiOrderMessengerNavigator.kt", l = {30, 31, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TaxiOrderMessengerNavigator$openChat$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $chatId;
    final /* synthetic */ o2y0 $orderHolder;
    Object L$0;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.taxi.order.chat.navigation.TaxiOrderMessengerNavigator$openChat$1$1", f = "TaxiOrderMessengerNavigator.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.taxi.order.chat.navigation.TaxiOrderMessengerNavigator$openChat$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $chatId;
        final /* synthetic */ MessengerType $messengerType;
        final /* synthetic */ o2y0 $orderHolder;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, o2y0 o2y0Var, String str, MessengerType messengerType, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$orderHolder = o2y0Var;
            this.$chatId = str;
            this.$messengerType = messengerType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$orderHolder, this.$chatId, this.$messengerType, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((tse) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a aVar = this.this$0;
            ((pep0) aVar.b).f((m950) aVar.a.get(), new n3y0(this.$orderHolder, this.$chatId, this.$messengerType), hxx.a);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiOrderMessengerNavigator$openChat$1(a aVar, o2y0 o2y0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$orderHolder = o2y0Var;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiOrderMessengerNavigator$openChat$1(this.this$0, this.$orderHolder, this.$chatId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiOrderMessengerNavigator$openChat$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (r13 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
    
        if (r13 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        MessengerType messengerType;
        MessengerType messengerType2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            s350 s350Var = this.this$0.c;
            this.label = 1;
            obj = s350Var.a.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                booleanValue = this.Z$0;
                kotlin.b.b(obj);
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                if (booleanValue2) {
                    messengerType2 = MessengerType.WEB;
                } else {
                    if (!booleanValue) {
                        messengerType = null;
                        if (messengerType != null) {
                            this.this$0.f.getClass();
                            sjh sjhVar = uyj.a;
                            g6u g6uVar = o400.a;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$orderHolder, this.$chatId, messengerType, null);
                            this.L$0 = null;
                            this.Z$0 = booleanValue;
                            this.Z$1 = booleanValue2;
                            this.label = 3;
                            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    messengerType2 = MessengerType.NATIVE;
                }
                messengerType = messengerType2;
                if (messengerType != null) {
                }
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        booleanValue = ((Boolean) obj).booleanValue();
        com.yandex.go.taxi.order.chat.experiments.b bVar = this.this$0.d;
        this.Z$0 = booleanValue;
        this.label = 2;
        obj = bVar.a(this);
    }
}
