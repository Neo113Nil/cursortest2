package com.yandex.go.places.impl.ui.sorting;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.yp80;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ b a;
    public final /* synthetic */ yp80 b;

    public d(b bVar, yp80 yp80Var) {
        this.a = bVar;
        this.b = yp80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrganizationsSortingPresenter$attachView$$inlined$map$1$1 organizationsSortingPresenter$attachView$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrganizationsSortingPresenter$attachView$$inlined$map$1$1) {
            organizationsSortingPresenter$attachView$$inlined$map$1$1 = (OrganizationsSortingPresenter$attachView$$inlined$map$1$1) continuation;
            int i2 = organizationsSortingPresenter$attachView$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsSortingPresenter$attachView$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationsSortingPresenter$attachView$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsSortingPresenter$attachView$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    organizationsSortingPresenter$attachView$$inlined$map$1$1.L$0 = null;
                    organizationsSortingPresenter$attachView$$inlined$map$1$1.L$1 = null;
                    organizationsSortingPresenter$attachView$$inlined$map$1$1.L$2 = null;
                    organizationsSortingPresenter$attachView$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, organizationsSortingPresenter$attachView$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        organizationsSortingPresenter$attachView$$inlined$map$1$1 = new OrganizationsSortingPresenter$attachView$$inlined$map$1$1(this, continuation);
        Object obj2 = organizationsSortingPresenter$attachView$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsSortingPresenter$attachView$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
