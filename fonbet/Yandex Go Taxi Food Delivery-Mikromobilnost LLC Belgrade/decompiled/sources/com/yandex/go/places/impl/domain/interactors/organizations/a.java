package com.yandex.go.places.impl.domain.interactors.organizations;

import com.yandex.go.places.impl.data.mappers.organizations.h;
import defpackage.e2t;
import defpackage.f2t;
import defpackage.fg5;
import defpackage.g2t;
import defpackage.h0w;
import defpackage.mdh;
import defpackage.mg80;
import defpackage.mth;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.ub60;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.wbc0;
import defpackage.ym80;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final com.yandex.go.places.impl.data.repositories.organizations.a a;
    public final e2t b;
    public final h0w c;
    public final tt2 d;
    public final h e;
    public final com.yandex.go.places.impl.data.repositories.organizations.b f;
    public final mg80 g;
    public final wbc0 h;
    public final fg5 i;

    public a(com.yandex.go.places.impl.data.repositories.organizations.a aVar, e2t e2tVar, h0w h0wVar, tt2 tt2Var, h hVar, com.yandex.go.places.impl.data.repositories.organizations.b bVar, mg80 mg80Var, wbc0 wbc0Var, fg5 fg5Var) {
        this.a = aVar;
        this.b = e2tVar;
        this.c = h0wVar;
        this.d = tt2Var;
        this.e = hVar;
        this.f = bVar;
        this.g = mg80Var;
        this.h = wbc0Var;
        this.i = fg5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, ContinuationImpl continuationImpl) {
        OrganizationsInteractor$getCurrentGetPoint$1 organizationsInteractor$getCurrentGetPoint$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof OrganizationsInteractor$getCurrentGetPoint$1) {
            organizationsInteractor$getCurrentGetPoint$1 = (OrganizationsInteractor$getCurrentGetPoint$1) continuationImpl;
            int i2 = organizationsInteractor$getCurrentGetPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsInteractor$getCurrentGetPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationsInteractor$getCurrentGetPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsInteractor$getCurrentGetPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = ((f2t) aVar.b).h;
                    organizationsInteractor$getCurrentGetPoint$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(mthVar, organizationsInteractor$getCurrentGetPoint$1);
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
                return ((g2t) obj).b.a;
            }
        }
        organizationsInteractor$getCurrentGetPoint$1 = new OrganizationsInteractor$getCurrentGetPoint$1(aVar, continuationImpl);
        Object obj2 = organizationsInteractor$getCurrentGetPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsInteractor$getCurrentGetPoint$1.label;
        if (i != 0) {
        }
        return ((g2t) obj2).b.a;
    }

    public final Object b(int i, String str, String str2, String str3, ym80 ym80Var, List list, uc4 uc4Var, Float f, Continuation continuation) {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new OrganizationsInteractor$loadNextPageOrganizations$2(this, i, str, str2, ym80Var, str3, list, uc4Var, f, null), continuation);
    }

    public final Object c(String str, String str2, String str3, List list, uc4 uc4Var, Float f, ub60 ub60Var, Continuation continuation) {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new OrganizationsInteractor$loadStartPageOrganizations$2(this, str, str2, str3, list, uc4Var, f, ub60Var, null), continuation);
    }
}
