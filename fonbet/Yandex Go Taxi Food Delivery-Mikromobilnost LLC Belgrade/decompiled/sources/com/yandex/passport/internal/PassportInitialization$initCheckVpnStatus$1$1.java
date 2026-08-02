package com.yandex.passport.internal;

import android.content.Context;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.entities.VpnStatus;
import com.yandex.passport.internal.ui.util.ForegroundDetector;
import defpackage.ij3;
import defpackage.lse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.PassportInitialization$initCheckVpnStatus$1$1", f = "PassportInitialization.kt", l = {503, 519}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PassportInitialization$initCheckVpnStatus$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ Context $context;
    final /* synthetic */ PassportProcessGlobalComponent $this_with;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/yandex/passport/internal/entities/VpnStatus;", "", ACSPConstants.STATUS, "hostIsInBackground"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @mvg(c = "com.yandex.passport.internal.PassportInitialization$initCheckVpnStatus$1$1$1", f = "PassportInitialization.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.PassportInitialization$initCheckVpnStatus$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (VpnStatus) obj;
            anonymousClass1.Z$0 = booleanValue;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return new Pair((VpnStatus) this.L$0, Boolean.valueOf(this.Z$0));
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Triple;", "Lcom/yandex/passport/internal/entities/VpnStatus;", "", "<destruct>", "Lkotlin/Pair;", "currentProcessIsInBackground"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @mvg(c = "com.yandex.passport.internal.PassportInitialization$initCheckVpnStatus$1$1$3", f = "PassportInitialization.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.PassportInitialization$initCheckVpnStatus$1$1$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(3, (Continuation) obj3);
            anonymousClass3.L$0 = (Pair) obj;
            anonymousClass3.Z$0 = booleanValue;
            return anonymousClass3.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            Pair pair = (Pair) this.L$0;
            return new Triple((VpnStatus) pair.getFirst(), Boolean.valueOf(((Boolean) pair.getSecond()).booleanValue()), Boolean.valueOf(this.Z$0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitialization$initCheckVpnStatus$1$1(Context context, PassportProcessGlobalComponent passportProcessGlobalComponent, Continuation continuation) {
        super(2, continuation);
        this.$this_with = passportProcessGlobalComponent;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PassportInitialization$initCheckVpnStatus$1$1 passportInitialization$initCheckVpnStatus$1$1 = new PassportInitialization$initCheckVpnStatus$1$1(this.$context, this.$this_with, continuation);
        passportInitialization$initCheckVpnStatus$1$1.L$0 = obj;
        return passportInitialization$initCheckVpnStatus$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportInitialization$initCheckVpnStatus$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x008b, code lost:
    
        if (r5.collect(r10, r9) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r10.c(r9) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tseVar = (tse) this.L$0;
            com.yandex.passport.internal.usecase.vpn.b checkVpnStatusUseCase = this.$this_with.getCheckVpnStatusUseCase();
            this.L$0 = tseVar;
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
            tseVar = (tse) this.L$0;
            kotlin.b.b(obj);
        }
        m0 m0Var = new m0(new m0(this.$this_with.getCheckVpnStatusUseCase().l, ((com.yandex.passport.internal.common.b) this.$this_with.getAppBackgroundStateWrapper()).b, new AnonymousClass1(3, null)), new r(new ForegroundDetector(this.$context, new ij3(lse.a, 13)).getForegroundActivityFlow(), 0), new AnonymousClass3(3, null));
        p pVar = new p(this.$this_with, this.$context, tseVar);
        this.L$0 = null;
        this.label = 2;
    }
}
