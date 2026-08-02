package com.yandex.go.preorder.map;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import defpackage.bgt0;
import defpackage.crb0;
import defpackage.fpv0;
import defpackage.gmb0;
import defpackage.jpv0;
import defpackage.kjt0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scs0;
import defpackage.tls;
import defpackage.wls;
import defpackage.xvw;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.preorder.map.SourcePointMapPositionActionHandler$handle$1", f = "SourcePointMapPositionActionHandler.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SourcePointMapPositionActionHandler$handle$1 extends SuspendLambda implements tls {
    final /* synthetic */ MapPositionAction $action;
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljpv0;", "it", "", "<anonymous>", "(Ljpv0;)Z"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.preorder.map.SourcePointMapPositionActionHandler$handle$1$1", f = "SourcePointMapPositionActionHandler.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.preorder.map.SourcePointMapPositionActionHandler$handle$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((jpv0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            jpv0 jpv0Var = (jpv0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            jpv0Var.getClass();
            return Boolean.valueOf(jpv0Var instanceof fpv0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SourcePointMapPositionActionHandler$handle$1(b bVar, MapPositionAction mapPositionAction, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$action = mapPositionAction;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SourcePointMapPositionActionHandler$handle$1(this.this$0, this.$action, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((SourcePointMapPositionActionHandler$handle$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzs B;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.taxi.summary.repository.b bVar = this.this$0.b.e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.label = 1;
            if (e.z(bVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean z = ((crb0) this.this$0.c).a.a != null;
        MapPositionAction mapPositionAction = this.$action;
        int i2 = mapPositionAction == null ? -1 : bgt0.a[mapPositionAction.ordinal()];
        if (i2 != 1) {
            if (i2 == 2 && z) {
                b bVar2 = this.this$0;
                ((xvw) bVar2.g.get()).a();
                Address g = bVar2.i.g();
                if (g != null && (B = g.B()) != null) {
                    gmb0 gmb0Var = bVar2.h.e;
                    ru.yandex.taxi.preorder.source.pickup.a aVar = bVar2.e;
                    if (gmb0Var == null) {
                        aVar.p.add(new scs0(11, bVar2, B));
                    } else {
                        aVar.g(gmb0Var);
                        bVar2.a(B, gmb0Var);
                    }
                }
            } else {
                ((kjt0) this.this$0.d.get()).b(this.$action == MapPositionAction.CENTER_ON_USER_LOCATION);
                this.this$0.f.b();
            }
        }
        return zy11.a;
    }
}
