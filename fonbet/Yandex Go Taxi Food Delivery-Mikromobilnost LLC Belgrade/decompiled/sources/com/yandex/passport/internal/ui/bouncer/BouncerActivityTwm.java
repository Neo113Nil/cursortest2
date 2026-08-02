package com.yandex.passport.internal.ui.bouncer;

import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.zd;
import com.yandex.passport.internal.ui.bouncer.model.BouncerStateSnapshot;
import com.yandex.passport.internal.ui.bouncer.model.BouncerUiState$SocialAction;
import com.yandex.passport.internal.ui.bouncer.model.c2;
import com.yandex.passport.internal.ui.bouncer.model.f1;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.ds31;
import defpackage.fse;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v1m0;
import defpackage.wls;
import defpackage.yr31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class BouncerActivityTwm extends yr31 implements tse {
    public final v1m0 b;
    public final zd c;
    public final f1 w;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/s1;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/s1;)V"}, k = 3, mv = {2, 0, 0})
    @mvg(c = "com.yandex.passport.internal.ui.bouncer.BouncerActivityTwm$1", f = "BouncerActivityTwm.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.yandex.passport.internal.ui.bouncer.BouncerActivityTwm$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = BouncerActivityTwm.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((s1) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            BouncerStateSnapshot bouncerStateSnapshot = null;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            s1 s1Var = (s1) this.L$0;
            BouncerActivityTwm.this.getClass();
            LoginProperties loginProperties = s1Var.c;
            c2 c2Var = s1Var.a;
            if (loginProperties != null && (c2Var instanceof BouncerUiState$SocialAction)) {
                bouncerStateSnapshot = new BouncerStateSnapshot(s1Var.c, (BouncerUiState$SocialAction) c2Var);
            }
            BouncerActivityTwm.this.b.a("KEY_STATE_SNAPSHOT", bouncerStateSnapshot);
            return zy11.a;
        }
    }

    public BouncerActivityTwm(v1m0 v1m0Var) {
        this.b = v1m0Var;
        zd zdVar = new zd();
        this.c = zdVar;
        PassportProcessGlobalComponent a = com.yandex.passport.internal.di.a.a();
        Object a2 = v1m0Var.b.a("KEY_STATE_SNAPSHOT");
        BouncerStateSnapshot bouncerStateSnapshot = a2 instanceof BouncerStateSnapshot ? (BouncerStateSnapshot) a2 : null;
        f1 createLoginModelComponent = a.createLoginModelComponent(new j(zdVar, bouncerStateSnapshot != null ? new s1(bouncerStateSnapshot.getSocialAction(), bouncerStateSnapshot.getLoginProperties(), 58) : new s1(null, null, 63)));
        this.w = createLoginModelComponent;
        createLoginModelComponent.getModel().b(this);
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(createLoginModelComponent.getModel().e, new AnonymousClass1(null), 3));
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return ds31.a(this).a;
    }
}
