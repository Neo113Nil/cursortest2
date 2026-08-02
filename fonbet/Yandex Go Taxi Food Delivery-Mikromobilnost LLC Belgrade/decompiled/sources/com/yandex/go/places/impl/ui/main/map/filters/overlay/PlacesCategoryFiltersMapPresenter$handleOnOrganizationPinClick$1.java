package com.yandex.go.places.impl.ui.main.map.filters.overlay;

import com.yandex.go.places.impl.domain.interactors.map.f;
import com.yandex.go.places.map.data.repositories.i;
import defpackage.kn00;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.u050;
import defpackage.wls;
import defpackage.z050;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.main.map.filters.overlay.PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1", f = "PlacesCategoryFiltersMapPresenter.kt", l = {149, 150, 151}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $id;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1(this.this$0, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r8 == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r3 == r0) goto L26;
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
            b.b(obj);
            u050 u050Var = this.this$0.F;
            z050 z050Var = (z050) u050Var.a.getValue();
            if (z050Var != null) {
                u050Var.c = z050Var;
            }
            u050 u050Var2 = this.this$0.F;
            this.label = 1;
            u050Var2.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                b.b(obj);
                kn00 kn00Var = (kn00) obj;
                if (kn00Var != null) {
                    a aVar = this.this$0;
                    f fVar = aVar.A;
                    PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1 placesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1 = new PlacesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1(aVar, null);
                    this.L$0 = null;
                    this.label = 3;
                    if (f.a(fVar, kn00Var, placesCategoryFiltersMapPresenter$handleOnOrganizationPinClick$1$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
            b.b(obj);
        }
        i iVar = this.this$0.z;
        String str = this.$id;
        this.label = 2;
        obj = iVar.h(str, this);
    }
}
