package com.yandex.go.address.search.common.presenter.favorites;

import defpackage.i51;
import defpackage.j61;
import defpackage.jst;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.favorites.FavoritesSearchPresenter$redirectCurrentLocation$1", f = "FavoritesSearchPresenter.kt", l = {HProv.PP_VERSION_EX}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class FavoritesSearchPresenter$redirectCurrentLocation$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavoritesSearchPresenter$redirectCurrentLocation$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FavoritesSearchPresenter$redirectCurrentLocation$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FavoritesSearchPresenter$redirectCurrentLocation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                this.this$0.R.getClass();
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                FavoritesSearchPresenter$redirectCurrentLocation$1$addressInfo$1 favoritesSearchPresenter$redirectCurrentLocation$1$addressInfo$1 = new FavoritesSearchPresenter$redirectCurrentLocation$1$addressInfo$1(this.this$0, null);
                this.label = 1;
                obj = tje.k0(mdhVar, favoritesSearchPresenter$redirectCurrentLocation$1$addressInfo$1, this);
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
            ((j61) this.this$0.Dg()).P6((pv0) obj);
        } catch (Exception e) {
            b bVar = this.this$0;
            ((i51) bVar.Dg()).hideProgress();
            if (e instanceof LocationRequirementsException) {
                jst.e.k(e, "No geo permission for currentLocation");
            } else {
                bVar.Yg();
            }
        }
        return zy11.a;
    }
}
