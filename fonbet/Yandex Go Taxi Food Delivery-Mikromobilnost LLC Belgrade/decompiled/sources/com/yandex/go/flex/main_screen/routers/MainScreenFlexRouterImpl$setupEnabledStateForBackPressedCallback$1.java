package com.yandex.go.flex.main_screen.routers;

import com.yandex.go.flex.main_screen.presentation.feed.e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ocz;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.routers.MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1", f = "MainScreenFlexRouterImpl.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "stickedFeed", "isRouterResumed"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.flex.main_screen.routers.MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$2", f = "MainScreenFlexRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.flex.main_screen.routers.MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        /* synthetic */ boolean Z$0;
        /* synthetic */ boolean Z$1;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(3, (Continuation) obj3);
            anonymousClass2.Z$0 = booleanValue;
            anonymousClass2.Z$1 = booleanValue2;
            return anonymousClass2.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            boolean z2 = this.Z$1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(z && z2);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MainScreenFlexRouterImpl$setupEnabledStateForBackPressedCallback$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            m0 m0Var = new m0(((e) this.this$0.H.get()).e, kotlinx.coroutines.flow.e.t(new b(this.this$0.getLifecycle().c())), new AnonymousClass2(3, null));
            ocz oczVar = new ocz(3, this.this$0);
            this.label = 1;
            if (m0Var.collect(oczVar, this) == coroutineSingletons) {
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
