package com.yandex.go.explorer.impl.navigation;

import com.yandex.go.explorer.impl.ui.map.l;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.c0g;
import defpackage.fto;
import defpackage.gto;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.wuo;
import defpackage.yuo;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToToggle$1", f = "ExplorerRouterImpl.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRouterImpl$subscribeToToggle$1 extends SuspendLambda implements wls {
    final /* synthetic */ gto $component;
    final /* synthetic */ l $presenter;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", BackendConfig.Restrictions.ENABLED, "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToToggle$1$1", f = "ExplorerRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$subscribeToToggle$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ gto $component;
        final /* synthetic */ l $presenter;
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, l lVar, gto gtoVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$presenter = lVar;
            this.$component = gtoVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$presenter, this.$component, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass1.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c cVar = this.this$0;
            cVar.K = z;
            if (cVar.J) {
                this.$presenter.Lg(z);
            }
            qv10.B(z, ((yuo) ((c0g) this.this$0.D).z.sg.get()).a, null);
            if (z) {
                c cVar2 = this.this$0;
                tje.N(cVar2.o(), null, null, new ExplorerRouterImpl$seedGeofenceCycle$1(cVar2, this.$component, null), 3);
            }
            fto ftoVar = (fto) this.this$0.E.b.getValue();
            if (ftoVar != null) {
                wuo wuoVar = this.this$0.E;
                fto a = fto.a(ftoVar, z, false, 47);
                r0 r0Var = wuoVar.b;
                r0Var.getClass();
                r0Var.m(null, a);
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExplorerRouterImpl$subscribeToToggle$1(c cVar, l lVar, gto gtoVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$presenter = lVar;
        this.$component = gtoVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRouterImpl$subscribeToToggle$1(this.this$0, this.$presenter, this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRouterImpl$subscribeToToggle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = e.t(e.d(this.this$0.E.d));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$presenter, this.$component, null);
            this.label = 1;
            if (e.k(t, anonymousClass1, this) == coroutineSingletons) {
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
