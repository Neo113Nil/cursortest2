package com.yandex.go.superapp.searchbar.impl.presentation;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.dms;
import defpackage.mvg;
import defpackage.ndw0;
import defpackage.ny61;
import defpackage.ydw0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lndw0;", "configuration", "Lydw0;", ClidProvider.STATE, "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "", "azimuthDegrees", "Lkew0;", "<anonymous>", "(Lndw0;Lydw0;Lru/yandex/taxi/theme/ThemeType;F)Lkew0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.searchbar.impl.presentation.SuperappSearchbarPresenter$attachView$1", f = "SuperappSearchbarPresenter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class SuperappSearchbarPresenter$attachView$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSearchbarPresenter$attachView$1(a aVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        SuperappSearchbarPresenter$attachView$1 superappSearchbarPresenter$attachView$1 = new SuperappSearchbarPresenter$attachView$1(this.this$0, (Continuation) obj5);
        superappSearchbarPresenter$attachView$1.L$0 = (ndw0) obj;
        superappSearchbarPresenter$attachView$1.L$1 = (ydw0) obj2;
        superappSearchbarPresenter$attachView$1.L$2 = (Float) obj4;
        return superappSearchbarPresenter$attachView$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ndw0 ndw0Var = (ndw0) this.L$0;
        ydw0 ydw0Var = (ydw0) this.L$1;
        Float f = (Float) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        Object Kg = a.Kg(aVar, ndw0Var, ydw0Var, f, this);
        return Kg == coroutineSingletons ? coroutineSingletons : Kg;
    }
}
