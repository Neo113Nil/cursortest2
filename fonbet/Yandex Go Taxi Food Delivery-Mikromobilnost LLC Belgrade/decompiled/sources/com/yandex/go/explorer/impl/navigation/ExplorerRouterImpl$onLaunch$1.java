package com.yandex.go.explorer.impl.navigation;

import android.app.PendingIntent;
import com.yandex.go.explorer.impl.experiments.g;
import com.yandex.go.explorer.impl.ui.map.l;
import defpackage.c0g;
import defpackage.i6r;
import defpackage.lb60;
import defpackage.lwt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzf;
import defpackage.rto;
import defpackage.tje;
import defpackage.tse;
import defpackage.vto;
import defpackage.wls;
import defpackage.xvf0;
import defpackage.ysx0;
import defpackage.zgl;
import defpackage.zsx0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$onLaunch$1", f = "ExplorerRouterImpl.kt", l = {34}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ExplorerRouterImpl$onLaunch$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$onLaunch$1$1", f = "ExplorerRouterImpl.kt", l = {59}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.explorer.impl.navigation.ExplorerRouterImpl$onLaunch$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
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
                c cVar = this.this$0;
                this.label = 1;
                if (c.P(cVar, this) == coroutineSingletons) {
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
    public ExplorerRouterImpl$onLaunch$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ExplorerRouterImpl$onLaunch$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ExplorerRouterImpl$onLaunch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.F;
            this.label = 1;
            obj = gVar.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        c cVar = this.this$0;
        int i3 = 23;
        zy11 zy11Var = zy11.a;
        if (!booleanValue) {
            r0 r0Var = cVar.E.e;
            Boolean bool = Boolean.FALSE;
            r0Var.getClass();
            r0Var.m(null, bool);
            vto vtoVar = ((c0g) this.this$0.D).z.s().c;
            lwt lwtVar = vtoVar.b;
            PendingIntent pendingIntent = (PendingIntent) vtoVar.c.getValue();
            lwtVar.getClass();
            ysx0 a = zsx0.a();
            a.a = new com.google.android.gms.internal.identity.a(i2, pendingIntent);
            a.d = 2425;
            lwtVar.d(1, a.a()).d(new zgl(i3));
            return zy11Var;
        }
        r0 r0Var2 = cVar.E.e;
        Boolean bool2 = Boolean.TRUE;
        r0Var2.getClass();
        r0Var2.m(null, bool2);
        if (!this.this$0.G.e()) {
            vto vtoVar2 = ((c0g) this.this$0.D).z.s().c;
            lwt lwtVar2 = vtoVar2.b;
            PendingIntent pendingIntent2 = (PendingIntent) vtoVar2.c.getValue();
            lwtVar2.getClass();
            ysx0 a2 = zsx0.a();
            a2.a = new com.google.android.gms.internal.identity.a(i2, pendingIntent2);
            a2.d = 2425;
            lwtVar2.d(1, a2.a()).d(new zgl(i3));
        }
        c cVar2 = this.this$0;
        i6r i6rVar = cVar2.D;
        cVar2.o();
        i6rVar.getClass();
        pzf pzfVar = new pzf(i6rVar);
        c cVar3 = this.this$0;
        cVar3.I = pzfVar;
        boolean u = cVar3.u();
        Object obj2 = pzfVar.c;
        if (u) {
            c cVar4 = this.this$0;
            if (!cVar4.J) {
                ((com.yandex.go.explorer.impl.ui.map.c) ((xvf0) pzfVar.d).get()).attach();
                cVar4.J = true;
                ((l) ((xvf0) obj2).get()).Lg(cVar4.K);
            }
        }
        tje.N(this.this$0.o(), null, null, new AnonymousClass1(this.this$0, null), 3);
        c.Q(this.this$0, pzfVar);
        c cVar5 = this.this$0;
        cVar5.getClass();
        tje.N(cVar5.o(), null, null, new ExplorerRouterImpl$subscribeToToggle$1(cVar5, (l) ((xvf0) obj2).get(), pzfVar, null), 3);
        c cVar6 = this.this$0;
        cVar6.getClass();
        tje.N(cVar6.o(), null, null, new ExplorerRouterImpl$subscribeToDistrictState$1((rto) ((xvf0) pzfVar.a).get(), cVar6, pzfVar.b(), null), 3);
        c cVar7 = this.this$0;
        tje.N(cVar7.o(), null, null, new ExplorerRouterImpl$subscribeToUnviewedCells$1(cVar7, null), 3);
        c cVar8 = this.this$0;
        cVar8.getClass();
        tje.N(cVar8.o(), null, null, new ExplorerRouterImpl$subscribeToPermissionRequest$1(cVar8, (lb60) ((xvf0) pzfVar.i).get(), pzfVar, null), 3);
        c cVar9 = this.this$0;
        tje.N(cVar9.o(), null, null, new ExplorerRouterImpl$subscribeToRefreshRequest$1(cVar9, pzfVar, null), 3);
        c cVar10 = this.this$0;
        cVar10.getClass();
        tje.N(cVar10.o(), null, null, new ExplorerRouterImpl$subscribeToMapInteraction$1(cVar10, (l) ((xvf0) obj2).get(), null), 3);
        return zy11Var;
    }
}
