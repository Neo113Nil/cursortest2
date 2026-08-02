package com.yandex.go.places.impl.ui.sorting;

import defpackage.bq80;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yp80;
import defpackage.yx20;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ yp80 b;

    public c(vpr vprVar, yp80 yp80Var) {
        this.a = vprVar;
        this.b = yp80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrganizationsSortingPresenter$attachView$$inlined$map$1$2$1 organizationsSortingPresenter$attachView$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof OrganizationsSortingPresenter$attachView$$inlined$map$1$2$1) {
            organizationsSortingPresenter$attachView$$inlined$map$1$2$1 = (OrganizationsSortingPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = organizationsSortingPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsSortingPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = organizationsSortingPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsSortingPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    yx20 yx20Var = (yx20) obj;
                    CharSequence charSequence = (CharSequence) yx20Var.b.a;
                    this.b.getClass();
                    bq80 bq80Var = new bq80(charSequence, yp80.Kg(yx20Var));
                    organizationsSortingPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    organizationsSortingPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    organizationsSortingPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    organizationsSortingPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    organizationsSortingPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(bq80Var, organizationsSortingPresenter$attachView$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        organizationsSortingPresenter$attachView$$inlined$map$1$2$1 = new OrganizationsSortingPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = organizationsSortingPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsSortingPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
