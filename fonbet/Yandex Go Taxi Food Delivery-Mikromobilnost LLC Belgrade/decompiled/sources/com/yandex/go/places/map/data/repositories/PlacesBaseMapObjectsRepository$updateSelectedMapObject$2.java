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
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.map.data.repositories.PlacesBaseMapObjectsRepository$updateSelectedMapObject$2", f = "PlacesBaseMapObjectsRepository.kt", l = {227, MSException.ERROR_MORE_DATA, HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesBaseMapObjectsRepository$updateSelectedMapObject$2 extends SuspendLambda implements wls {
    final /* synthetic */ in00 $item;
    final /* synthetic */ boolean $shouldAddPinOnMap;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesBaseMapObjectsRepository$updateSelectedMapObject$2(g gVar, in00 in00Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$item = in00Var;
        this.$shouldAddPinOnMap = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesBaseMapObjectsRepository$updateSelectedMapObject$2(this.this$0, this.$item, this.$shouldAddPinOnMap, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesBaseMapObjectsRepository$updateSelectedMapObject$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        if (r1.emit(r10, r9) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0036, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cd, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ab  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        g050 g050Var;
        boolean z;
        in00 in00Var;
        g gVar;
        g050 g050Var2;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                g gVar2 = this.this$0;
                kotlinx.coroutines.sync.a aVar = gVar2.f;
                in00 in00Var2 = this.$item;
                boolean z2 = this.$shouldAddPinOnMap;
                this.L$0 = aVar;
                this.L$1 = gVar2;
                this.L$2 = in00Var2;
                this.Z$0 = z2;
                this.label = 1;
                if (aVar.a(this) != coroutineSingletons) {
                    g050Var = aVar;
                    z = z2;
                    in00Var = in00Var2;
                    gVar = gVar2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.Z$0;
                g050Var2 = (g050) this.L$3;
                in00Var = (in00) this.L$2;
                gVar = (g) this.L$1;
                g050Var = (g050) this.L$0;
                kotlin.b.b(obj);
                gVar.u(in00Var);
                obj2 = gVar.t(in00Var, z);
                if (obj2 != null) {
                    n0 n0Var = this.this$0.i;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.label = 3;
                }
                return zy11.a;
            }
            z = this.Z$0;
            in00Var = (in00) this.L$2;
            gVar = (g) this.L$1;
            g050Var = (g050) this.L$0;
            kotlin.b.b(obj);
            in00 i2 = gVar.i();
            if (jl40.l(i2 != null ? i2.getId() : null, in00Var.getId())) {
                obj2 = null;
                if (obj2 != null) {
                }
                return zy11.a;
            }
            kotlinx.coroutines.sync.a aVar2 = gVar.d;
            this.L$0 = g050Var;
            this.L$1 = gVar;
            this.L$2 = in00Var;
            this.L$3 = aVar2;
            this.L$4 = null;
            this.Z$0 = z;
            this.label = 2;
            if (aVar2.a(this) != coroutineSingletons) {
                g050Var2 = aVar2;
                gVar.u(in00Var);
                obj2 = gVar.t(in00Var, z);
                if (obj2 != null) {
                }
                return zy11.a;
            }
            return coroutineSingletons;
        } finally {
        }
    }
}
