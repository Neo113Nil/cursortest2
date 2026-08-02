package com.yandex.go.address.search.common.presenter;

import com.yandex.go.address.models.Address;
import defpackage.j61;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.address.search.common.presenter.SuggestedSourcesPresenter$assignZone$1", f = "SuggestedSourcesPresenter.kt", l = {354, 355}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SuggestedSourcesPresenter$assignZone$1 extends SuspendLambda implements wls {
    final /* synthetic */ Address $address;
    final /* synthetic */ pv0 $info;
    final /* synthetic */ String $zoneName;
    Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestedSourcesPresenter$assignZone$1(d dVar, String str, Address address, pv0 pv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$zoneName = str;
        this.$address = address;
        this.$info = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuggestedSourcesPresenter$assignZone$1(this.this$0, this.$zoneName, this.$address, this.$info, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuggestedSourcesPresenter$assignZone$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        if (r1.b((com.yandex.go.zone.model.Zone) r7, r6) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Exception unused) {
            jst.e.getClass();
        }
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.zone.interactors.b bVar = this.this$0.m0;
            String str = this.$zoneName;
            zzs B = this.$address.B();
            this.label = 1;
            obj = bVar.d(str, B, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                ((j61) this.this$0.Dg()).P6(this.$info);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        com.yandex.go.taxi.tariffs.interactor.b bVar2 = this.this$0.C0;
        this.L$0 = null;
        this.label = 2;
    }
}
