package com.yandex.go.places.searchbar.impl.presentation;

import defpackage.fr;
import defpackage.hec0;
import defpackage.iec0;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uec0;
import defpackage.vec0;
import defpackage.wec0;
import defpackage.xec0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luec0;", ClidProvider.STATE, "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lyec0;", "<anonymous>", "(Luec0;Lru/yandex/taxi/theme/ThemeType;)Lyec0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.searchbar.impl.presentation.PlacesSearchbarPresenter$attachView$1", f = "PlacesSearchbarPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesSearchbarPresenter$attachView$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesSearchbarPresenter$attachView$1(a aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlacesSearchbarPresenter$attachView$1 placesSearchbarPresenter$attachView$1 = new PlacesSearchbarPresenter$attachView$1(this.this$0, (Continuation) obj3);
        placesSearchbarPresenter$attachView$1.L$0 = (uec0) obj;
        return placesSearchbarPresenter$attachView$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uec0 uec0Var = (uec0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        wec0 wec0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        k7x0 k7x0Var = aVar.y;
        iec0 iec0Var = aVar.x.c;
        if (iec0Var == null) {
            return new vec0(uec0Var);
        }
        String str = iec0Var.a;
        fr frVar = iec0Var.b;
        String str2 = iec0Var.c;
        String a = str2 != null ? ((m7x0) k7x0Var).a(str2) : null;
        hec0 hec0Var = iec0Var.d;
        if (hec0Var != null) {
            String str3 = hec0Var.a;
            wec0Var = new wec0(str3, ((m7x0) k7x0Var).a(str3), hec0Var.b, hec0Var.c);
        }
        return new xec0(str, frVar, str2, a, wec0Var, uec0Var, iec0Var.e);
    }
}
