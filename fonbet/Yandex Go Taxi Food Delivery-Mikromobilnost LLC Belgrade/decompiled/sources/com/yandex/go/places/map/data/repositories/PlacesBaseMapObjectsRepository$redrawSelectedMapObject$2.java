package com.yandex.go.places.map.data.repositories;

import defpackage.g050;
import defpackage.in00;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesBaseMapObjectsRepository$redrawSelectedMapObject$2", f = "PlacesBaseMapObjectsRepository.kt", l = {227, 152}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesBaseMapObjectsRepository$redrawSelectedMapObject$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesBaseMapObjectsRepository$redrawSelectedMapObject$2(g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesBaseMapObjectsRepository$redrawSelectedMapObject$2(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesBaseMapObjectsRepository$redrawSelectedMapObject$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        if (r1.emit(r8, r7) == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        String str;
        g gVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar2 = this.this$0;
                g050Var = gVar2.f;
                str = this.$id;
                this.L$0 = g050Var;
                this.L$1 = gVar2;
                this.L$2 = str;
                this.label = 1;
                if (g050Var.a(this) != coroutineSingletons) {
                    gVar = gVar2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$2;
            gVar = (g) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
            in00 i2 = gVar.i();
            if (i2 != null) {
                if (!jl40.l(i2.getId(), str)) {
                    i2 = null;
                }
                if (i2 != null) {
                    obj2 = gVar.n(i2);
                    if (obj2 != null) {
                        n0 n0Var = this.this$0.i;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 2;
                    }
                    return zy11.a;
                }
            }
            obj2 = null;
            if (obj2 != null) {
            }
            return zy11.a;
        } finally {
            g050Var.d(null);
        }
    }
}
