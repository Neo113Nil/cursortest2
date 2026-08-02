package com.yandex.go.places.organization.card.impl.domain.interactors.flex;

import com.yandex.go.places.organization.card.impl.data.entities.network.card.OrganizationGalleryDto;
import defpackage.d3a;
import defpackage.e2t;
import defpackage.fnb0;
import defpackage.gv40;
import defpackage.jac0;
import defpackage.k7v;
import defpackage.lg80;
import defpackage.mdh;
import defpackage.nss;
import defpackage.ny61;
import defpackage.p1j0;
import defpackage.qf80;
import defpackage.sjh;
import defpackage.svj;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.ub60;
import defpackage.uyj;
import defpackage.wnt;
import defpackage.zl50;
import defpackage.zy11;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final e2t a;
    public final qf80 b;
    public final tt2 c;
    public final wnt d;
    public final com.yandex.go.places.organization.card.impl.data.mappers.a e;
    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b f;
    public final d3a g;

    public a(e2t e2tVar, qf80 qf80Var, tt2 tt2Var, wnt wntVar, com.yandex.go.places.organization.card.impl.data.mappers.a aVar, com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar, d3a d3aVar) {
        this.a = e2tVar;
        this.b = qf80Var;
        this.c = tt2Var;
        this.d = wntVar;
        this.e = aVar;
        this.f = bVar;
        this.g = d3aVar;
    }

    public final Object a(ti80 ti80Var, lg80 lg80Var, String str, String str2, svj svjVar, boolean z, String str3, Boolean bool, ContinuationImpl continuationImpl) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new OrganizationCardFlexInteractor$createRequestParams$2(this, ti80Var, lg80Var, svjVar, str3, bool, str, str2, z, null), continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r13 == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r12v10, types: [tls] */
    /* JADX WARN: Type inference failed for: r12v6, types: [tls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, List list, k7v k7vVar, ub60 ub60Var, ContinuationImpl continuationImpl) {
        OrganizationCardFlexInteractor$handleOnGalleryClicked$1 organizationCardFlexInteractor$handleOnGalleryClicked$1;
        int i;
        ub60 ub60Var2;
        List list2;
        String str2;
        int i2;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar;
        ub60 ub60Var3;
        if (continuationImpl instanceof OrganizationCardFlexInteractor$handleOnGalleryClicked$1) {
            organizationCardFlexInteractor$handleOnGalleryClicked$1 = (OrganizationCardFlexInteractor$handleOnGalleryClicked$1) continuationImpl;
            int i3 = organizationCardFlexInteractor$handleOnGalleryClicked$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                organizationCardFlexInteractor$handleOnGalleryClicked$1.label = i3 - Integer.MIN_VALUE;
                Object obj = organizationCardFlexInteractor$handleOnGalleryClicked$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationCardFlexInteractor$handleOnGalleryClicked$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.c.getClass();
                    sjh sjhVar = uyj.a;
                    OrganizationCardFlexInteractor$handleOnGalleryClicked$2 organizationCardFlexInteractor$handleOnGalleryClicked$2 = new OrganizationCardFlexInteractor$handleOnGalleryClicked$2(list, k7vVar, null);
                    organizationCardFlexInteractor$handleOnGalleryClicked$1.L$0 = str;
                    organizationCardFlexInteractor$handleOnGalleryClicked$1.L$1 = null;
                    organizationCardFlexInteractor$handleOnGalleryClicked$1.L$2 = null;
                    organizationCardFlexInteractor$handleOnGalleryClicked$1.L$3 = ub60Var;
                    organizationCardFlexInteractor$handleOnGalleryClicked$1.label = 1;
                    obj = tje.k0(sjhVar, organizationCardFlexInteractor$handleOnGalleryClicked$2, organizationCardFlexInteractor$handleOnGalleryClicked$1);
                    ub60Var2 = ub60Var;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = organizationCardFlexInteractor$handleOnGalleryClicked$1.I$1;
                        list2 = (List) organizationCardFlexInteractor$handleOnGalleryClicked$1.L$6;
                        bVar = (com.yandex.go.places.impl.navigation.common.navigator.internal.b) organizationCardFlexInteractor$handleOnGalleryClicked$1.L$5;
                        ?? r12 = (tls) organizationCardFlexInteractor$handleOnGalleryClicked$1.L$3;
                        str2 = (String) organizationCardFlexInteractor$handleOnGalleryClicked$1.L$0;
                        kotlin.b.b(obj);
                        ub60Var3 = r12;
                        bVar.m.d(new fnb0(14), new nss(i2, new zl50(20, this, str2), list2, ((Boolean) obj).booleanValue()), new jac0(new gv40(3, ub60Var3)), p1j0.a);
                        return zy11Var;
                    }
                    ?? r122 = (tls) organizationCardFlexInteractor$handleOnGalleryClicked$1.L$3;
                    str = (String) organizationCardFlexInteractor$handleOnGalleryClicked$1.L$0;
                    kotlin.b.b(obj);
                    ub60Var2 = r122;
                }
                Pair pair = (Pair) obj;
                list2 = (List) pair.getFirst();
                int intValue = ((Number) pair.getSecond()).intValue();
                if (!list2.isEmpty()) {
                    return zy11Var;
                }
                organizationCardFlexInteractor$handleOnGalleryClicked$1.L$0 = str;
                organizationCardFlexInteractor$handleOnGalleryClicked$1.L$1 = null;
                organizationCardFlexInteractor$handleOnGalleryClicked$1.L$2 = null;
                organizationCardFlexInteractor$handleOnGalleryClicked$1.L$3 = ub60Var2;
                organizationCardFlexInteractor$handleOnGalleryClicked$1.L$4 = null;
                com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar2 = this.f;
                organizationCardFlexInteractor$handleOnGalleryClicked$1.L$5 = bVar2;
                organizationCardFlexInteractor$handleOnGalleryClicked$1.L$6 = list2;
                organizationCardFlexInteractor$handleOnGalleryClicked$1.I$0 = intValue;
                organizationCardFlexInteractor$handleOnGalleryClicked$1.I$1 = intValue;
                organizationCardFlexInteractor$handleOnGalleryClicked$1.label = 2;
                Object f = this.g.b.f(organizationCardFlexInteractor$handleOnGalleryClicked$1);
                if (f != coroutineSingletons) {
                    str2 = str;
                    i2 = intValue;
                    bVar = bVar2;
                    obj = f;
                    ub60Var3 = ub60Var2;
                    bVar.m.d(new fnb0(14), new nss(i2, new zl50(20, this, str2), list2, ((Boolean) obj).booleanValue()), new jac0(new gv40(3, ub60Var3)), p1j0.a);
                    return zy11Var;
                }
                return coroutineSingletons;
            }
        }
        organizationCardFlexInteractor$handleOnGalleryClicked$1 = new OrganizationCardFlexInteractor$handleOnGalleryClicked$1(this, continuationImpl);
        Object obj2 = organizationCardFlexInteractor$handleOnGalleryClicked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationCardFlexInteractor$handleOnGalleryClicked$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        Pair pair2 = (Pair) obj2;
        list2 = (List) pair2.getFirst();
        int intValue2 = ((Number) pair2.getSecond()).intValue();
        if (!list2.isEmpty()) {
        }
    }

    public final Object c(OrganizationGalleryDto organizationGalleryDto, Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new OrganizationCardFlexInteractor$processGalleryItems$2(this, organizationGalleryDto, null), continuation);
    }
}
