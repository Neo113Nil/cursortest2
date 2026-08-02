package com.yandex.go.flex.main_screen.data.network;

import defpackage.bvu0;
import defpackage.cvu0;
import defpackage.ivj0;
import defpackage.mb7;
import defpackage.ny61;
import defpackage.omt;
import defpackage.qjr;
import defpackage.x4j0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class a implements qjr {
    public final mb7 a;

    public a(mb7 mb7Var) {
        this.a = mb7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.qjr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(omt omtVar, ContinuationImpl continuationImpl) {
        DocumentFreshTimeInterceptor$intercept$1 documentFreshTimeInterceptor$intercept$1;
        int i;
        ivj0 ivj0Var;
        Long m;
        if (continuationImpl instanceof DocumentFreshTimeInterceptor$intercept$1) {
            documentFreshTimeInterceptor$intercept$1 = (DocumentFreshTimeInterceptor$intercept$1) continuationImpl;
            int i2 = documentFreshTimeInterceptor$intercept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                documentFreshTimeInterceptor$intercept$1.label = i2 - Integer.MIN_VALUE;
                Object obj = documentFreshTimeInterceptor$intercept$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = documentFreshTimeInterceptor$intercept$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    x4j0 x4j0Var = omtVar.b;
                    documentFreshTimeInterceptor$intercept$1.L$0 = null;
                    documentFreshTimeInterceptor$intercept$1.label = 1;
                    obj = omtVar.a(x4j0Var, documentFreshTimeInterceptor$intercept$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                ivj0Var = (ivj0) obj;
                if (cvu0.s(ivj0Var.a.a.b(), "mlutp/v1/widgets/layout/superapp", false)) {
                    String a = ivj0Var.b.a("document-fresh-time");
                    this.a.b = ((a == null || (m = bvu0.m(10, a)) == null) ? 0L : m.longValue()) * 1000;
                }
                return ivj0Var;
            }
        }
        documentFreshTimeInterceptor$intercept$1 = new DocumentFreshTimeInterceptor$intercept$1(this, continuationImpl);
        Object obj3 = documentFreshTimeInterceptor$intercept$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = documentFreshTimeInterceptor$intercept$1.label;
        if (i != 0) {
        }
        ivj0Var = (ivj0) obj3;
        if (cvu0.s(ivj0Var.a.a.b(), "mlutp/v1/widgets/layout/superapp", false)) {
        }
        return ivj0Var;
    }
}
