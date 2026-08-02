package com.yandex.go.places.impl.ui.main.map.my_places;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rac0;
import defpackage.tse;
import defpackage.u050;
import defpackage.wls;
import defpackage.y050;
import defpackage.z050;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.my_places.MyPlacesMapPresenter$onMyPlacesPinTapped$2", f = "MyPlacesMapPresenter.kt", l = {HProv.PP_FAST_CODE, HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class MyPlacesMapPresenter$onMyPlacesPinTapped$2 extends SuspendLambda implements wls {
    final /* synthetic */ z050 $pin;
    int label;
    final /* synthetic */ y050 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyPlacesMapPresenter$onMyPlacesPinTapped$2(y050 y050Var, z050 z050Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y050Var;
        this.$pin = z050Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MyPlacesMapPresenter$onMyPlacesPinTapped$2(this.this$0, this.$pin, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MyPlacesMapPresenter$onMyPlacesPinTapped$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r5 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            u050 u050Var = this.this$0.B;
            z050 z050Var = this.$pin;
            this.label = 1;
            u050Var.a.emit(z050Var, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        rac0 rac0Var = this.this$0.C;
        this.label = 2;
        rac0Var.a.emit(null, this);
        return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
