package com.yandex.go.superapp_favorites.flex;

import com.yandex.go.flex.common.api.c;
import defpackage.aaw0;
import defpackage.auu0;
import defpackage.avj0;
import defpackage.c231;
import defpackage.hhs0;
import defpackage.jl40;
import defpackage.k8u;
import defpackage.kyh0;
import defpackage.maw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o6s0;
import defpackage.pwy;
import defpackage.q3m;
import defpackage.u1m;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xnt;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.z131;
import defpackage.zir;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp_favorites.flex.SuperappFavoritesLoadingActionEmitter$createDocumentLoadActions$1", f = "SuperappFavoritesLoadingActionEmitter.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappFavoritesLoadingActionEmitter$createDocumentLoadActions$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappFavoritesLoadingActionEmitter$createDocumentLoadActions$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SuperappFavoritesLoadingActionEmitter$createDocumentLoadActions$1 superappFavoritesLoadingActionEmitter$createDocumentLoadActions$1 = new SuperappFavoritesLoadingActionEmitter$createDocumentLoadActions$1(this.this$0, continuation);
        superappFavoritesLoadingActionEmitter$createDocumentLoadActions$1.L$0 = obj;
        return superappFavoritesLoadingActionEmitter$createDocumentLoadActions$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappFavoritesLoadingActionEmitter$createDocumentLoadActions$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object pwyVar;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            hhs0 hhs0Var = aVar.e.c;
            if (hhs0Var != null) {
                pwyVar = new o6s0(new xzl((ywl) hhs0Var.b, (u1m) hhs0Var.c, null, 28));
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                zir b = c.b(aVar.b);
                zzs a = b != null ? b.a() : null;
                if (a != null) {
                    linkedHashMap.put("position", a);
                }
                u1m u1mVar = new u1m(2, "bdui/v1/superapp/favorites", ((xnt) aVar.c).f(linkedHashMap, new k8u(auu0.a, zzs.Companion.serializer(), 1)));
                aaw0 aaw0Var = aVar.e;
                if (!jl40.l(aaw0Var.b, u1mVar)) {
                    aaw0Var.b = u1mVar;
                    ywl ywlVar = aaw0Var.a;
                    if (ywlVar != null) {
                        aaw0Var.c = new hhs0(16, ywlVar, u1mVar);
                    }
                }
                maw0 maw0Var = aVar.a;
                ywl a2 = maw0Var.b.a();
                q3m q3mVar = a2 == null ? null : new q3m(a2, Collections.singletonList(new z131("superapp_favorites.screen.title", ((avj0) maw0Var.a).h(kyh0.superapp_favorites_header_title))));
                boolean z = false;
                if (q3mVar != null) {
                    Collection collection = q3mVar.b;
                    com.yandex.div.core.expression.variables.a aVar2 = aVar.d;
                    c231[] c231VarArr = (c231[]) collection.toArray(new c231[0]);
                    aVar2.i((c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                }
                pwyVar = new pwy(u1mVar, q3mVar != null ? q3mVar.a : null, z, 4);
            }
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(pwyVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
