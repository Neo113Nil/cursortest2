package com.yandex.passport.internal.ui.domik.relogin;

import com.yandex.passport.internal.analytics.DomikScreenSuccessMessages$Relogin;
import com.yandex.passport.internal.network.response.AuthMethod;
import com.yandex.passport.internal.ui.domik.AuthTrack;
import com.yandex.passport.internal.ui.domik.q;
import com.yandex.passport.internal.usecase.ui.s0;
import com.yandex.passport.internal.usecase.ui.t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.domik.relogin.ReloginViewModel$startRelogin$1", f = "ReloginViewModel.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ReloginViewModel$startRelogin$1 extends SuspendLambda implements wls {
    final /* synthetic */ AuthTrack $authTrack;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.yandex.passport.internal.ui.domik.relogin.ReloginViewModel$startRelogin$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements tls {
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            c cVar = (c) this.receiver;
            cVar.D.g(DomikScreenSuccessMessages$Relogin.accountNotFound);
            cVar.B.c();
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.yandex.passport.internal.ui.domik.relogin.ReloginViewModel$startRelogin$1$3, reason: invalid class name */
    final /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements tls {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.collections.EmptyList] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            ?? r0;
            Object obj2;
            q qVar = ((c) this.receiver).B;
            qVar.getClass();
            List<AuthMethod> authMethods = ((AuthTrack) obj).getAuthMethods();
            if (authMethods != null) {
                r0 = new ArrayList();
                for (Object obj3 : authMethods) {
                    int i = com.yandex.passport.internal.ui.domik.a.a[((AuthMethod) obj3).ordinal()];
                    r0.add(obj3);
                }
            } else {
                r0 = EmptyList.a;
            }
            r0.size();
            Iterator it = ((Iterable) r0).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (((AuthMethod) obj2).getIsSocial()) {
                    break;
                }
            }
            qVar.e(false, ((AuthMethod) obj2).c(), true, null);
            return zy11.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.yandex.passport.internal.ui.domik.relogin.ReloginViewModel$startRelogin$1$4, reason: invalid class name */
    final /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            c cVar = (c) this.receiver;
            cVar.c.m(Boolean.FALSE);
            cVar.D.g(DomikScreenSuccessMessages$Relogin.error);
            cVar.B.c();
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReloginViewModel$startRelogin$1(c cVar, AuthTrack authTrack, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$authTrack = authTrack;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReloginViewModel$startRelogin$1(this.this$0, this.$authTrack, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ReloginViewModel$startRelogin$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            t0 t0Var = cVar.F;
            s0 s0Var = new s0(this.$authTrack, new b(cVar, 0), new AnonymousClass2(1, this.this$0, c.class, "onCanRegister", "onCanRegister(Lcom/yandex/passport/internal/ui/domik/AuthTrack;)V", 0), new AnonymousClass3(1, this.this$0, c.class, "onSocialAuth", "onSocialAuth(Lcom/yandex/passport/internal/ui/domik/AuthTrack;)V", 0), new AnonymousClass4(2, this.this$0, c.class, "onError", "onError(Lcom/yandex/passport/internal/ui/domik/AuthTrack;Lcom/yandex/passport/internal/ui/EventError;)V", 0));
            this.label = 1;
            if (t0Var.a(s0Var, this) == coroutineSingletons) {
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
