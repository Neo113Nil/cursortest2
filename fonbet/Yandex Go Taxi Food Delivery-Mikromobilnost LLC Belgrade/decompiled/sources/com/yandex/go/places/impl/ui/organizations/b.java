package com.yandex.go.places.impl.ui.organizations;

import defpackage.avj0;
import defpackage.dug0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrganizationsPresenter$attachView$$inlined$map$1$2$1 organizationsPresenter$attachView$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof OrganizationsPresenter$attachView$$inlined$map$1$2$1) {
            organizationsPresenter$attachView$$inlined$map$1$2$1 = (OrganizationsPresenter$attachView$$inlined$map$1$2$1) continuation;
            int i2 = organizationsPresenter$attachView$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsPresenter$attachView$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = organizationsPresenter$attachView$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsPresenter$attachView$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    d dVar = this.b;
                    ru.yandex.taxi.design.utils.b bVar = dVar.I;
                    int c = ((avj0) dVar.J).c(dug0.discovery_organizations_search_header_radius);
                    organizationsPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                    organizationsPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                    organizationsPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                    organizationsPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    organizationsPresenter$attachView$$inlined$map$1$2$1.L$4 = vprVar;
                    organizationsPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
                    organizationsPresenter$attachView$$inlined$map$1$2$1.L$6 = null;
                    organizationsPresenter$attachView$$inlined$map$1$2$1.label = 1;
                    obj2 = bVar.a(c, true, organizationsPresenter$attachView$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) organizationsPresenter$attachView$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                organizationsPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
                organizationsPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
                organizationsPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
                organizationsPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
                organizationsPresenter$attachView$$inlined$map$1$2$1.L$4 = null;
                organizationsPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
                organizationsPresenter$attachView$$inlined$map$1$2$1.L$6 = null;
                organizationsPresenter$attachView$$inlined$map$1$2$1.label = 2;
            }
        }
        organizationsPresenter$attachView$$inlined$map$1$2$1 = new OrganizationsPresenter$attachView$$inlined$map$1$2$1(this, continuation);
        Object obj22 = organizationsPresenter$attachView$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsPresenter$attachView$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        organizationsPresenter$attachView$$inlined$map$1$2$1.L$0 = null;
        organizationsPresenter$attachView$$inlined$map$1$2$1.L$1 = null;
        organizationsPresenter$attachView$$inlined$map$1$2$1.L$2 = null;
        organizationsPresenter$attachView$$inlined$map$1$2$1.L$3 = null;
        organizationsPresenter$attachView$$inlined$map$1$2$1.L$4 = null;
        organizationsPresenter$attachView$$inlined$map$1$2$1.L$5 = null;
        organizationsPresenter$attachView$$inlined$map$1$2$1.L$6 = null;
        organizationsPresenter$attachView$$inlined$map$1$2$1.label = 2;
    }
}
