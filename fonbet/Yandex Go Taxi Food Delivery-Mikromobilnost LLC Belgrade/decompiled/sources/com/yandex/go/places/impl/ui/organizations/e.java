package com.yandex.go.places.impl.ui.organizations;

import com.yandex.go.places.impl.domain.interactors.organizations.g;
import com.yandex.go.places.impl.ui.organizations.data.PageRequestState;
import defpackage.ak80;
import defpackage.bn80;
import defpackage.cn80;
import defpackage.cp80;
import defpackage.gp80;
import defpackage.hp80;
import defpackage.i3y;
import defpackage.ip80;
import defpackage.ny61;
import defpackage.ub60;
import defpackage.uc4;
import defpackage.xk80;
import defpackage.yi80;
import defpackage.ym80;
import defpackage.zy11;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class e {
    public final com.yandex.go.places.impl.domain.interactors.organizations.a a;
    public final cn80 b;
    public final com.yandex.go.places.impl.data.repositories.organizations.b c;
    public final g d;
    public final xk80 e;
    public final com.yandex.go.places.impl.domain.interactors.common.a f;
    public final boolean g;
    public boolean h = true;
    public boolean i;
    public final i3y j;
    public final i3y k;

    public e(com.yandex.go.places.impl.domain.interactors.organizations.a aVar, cn80 cn80Var, com.yandex.go.places.impl.data.repositories.organizations.b bVar, g gVar, xk80 xk80Var, com.yandex.go.places.impl.domain.interactors.common.a aVar2, boolean z) {
        this.a = aVar;
        this.b = cn80Var;
        this.c = bVar;
        this.d = gVar;
        this.e = xk80Var;
        this.f = aVar2;
        this.g = z;
        ak80 ak80Var = new ak80(6, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.j = kotlin.a.b(lazyThreadSafetyMode, ak80Var);
        this.k = kotlin.a.b(lazyThreadSafetyMode, new yi80(12));
    }

    public final ip80 a() {
        return (ip80) this.e.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(uc4 uc4Var, Float f, ContinuationImpl continuationImpl) {
        OrganizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1 organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1;
        int i;
        Object value;
        cp80 cp80Var;
        ip80 ip80Var;
        r0 r0Var;
        Object value2;
        if (continuationImpl instanceof OrganizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1) {
            organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1 = (OrganizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1) continuationImpl;
            int i2 = organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1.label = i2 - Integer.MIN_VALUE;
                OrganizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1 organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$12 = organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1;
                Object obj = organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$12.label;
                xk80 xk80Var = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var2 = xk80Var.a;
                    do {
                        value = r0Var2.getValue();
                        ip80 ip80Var2 = (ip80) value;
                        cp80Var = ip80Var2 instanceof cp80 ? (cp80) ip80Var2 : null;
                    } while (!r0Var2.k(value, new hp80(cp80Var != null ? cp80Var.a : null)));
                    bn80 bn80Var = (bn80) this.b.a.getValue();
                    String str = bn80Var != null ? bn80Var.a : null;
                    String str2 = bn80Var != null ? bn80Var.b : null;
                    String str3 = bn80Var != null ? bn80Var.c : null;
                    List a = this.c.a();
                    ub60 ub60Var = new ub60(29, this);
                    organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$12.L$0 = null;
                    organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$12.L$1 = null;
                    organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$12.L$2 = null;
                    organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$12.label = 1;
                    obj = this.a.c(str, str2, str3, a, uc4Var, f, ub60Var, organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$12);
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
                ip80Var = (ip80) obj;
                r0Var = xk80Var.a;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, ip80Var));
                return ip80Var;
            }
        }
        organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1 = new OrganizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1(this, continuationImpl);
        OrganizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1 organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$122 = organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$1;
        Object obj2 = organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsUiStateInteractor$loadStartPageApplyingSearchOptions$122.label;
        xk80 xk80Var2 = this.e;
        if (i != 0) {
        }
        ip80Var = (ip80) obj2;
        r0Var = xk80Var2.a;
        do {
            value2 = r0Var.getValue();
        } while (!r0Var.k(value2, ip80Var));
        return ip80Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ym80 ym80Var, uc4 uc4Var, Float f, ContinuationImpl continuationImpl) {
        OrganizationsUiStateInteractor$tryLoadNextPage$1 organizationsUiStateInteractor$tryLoadNextPage$1;
        int i;
        Object value;
        ip80 ip80Var;
        r0 r0Var;
        Object value2;
        if (continuationImpl instanceof OrganizationsUiStateInteractor$tryLoadNextPage$1) {
            organizationsUiStateInteractor$tryLoadNextPage$1 = (OrganizationsUiStateInteractor$tryLoadNextPage$1) continuationImpl;
            int i2 = organizationsUiStateInteractor$tryLoadNextPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsUiStateInteractor$tryLoadNextPage$1.label = i2 - Integer.MIN_VALUE;
                OrganizationsUiStateInteractor$tryLoadNextPage$1 organizationsUiStateInteractor$tryLoadNextPage$12 = organizationsUiStateInteractor$tryLoadNextPage$1;
                Object obj = organizationsUiStateInteractor$tryLoadNextPage$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsUiStateInteractor$tryLoadNextPage$12.label;
                xk80 xk80Var = this.e;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r0 r0Var2 = xk80Var.a;
                    do {
                        value = r0Var2.getValue();
                    } while (!r0Var2.k(value, new gp80(ym80Var, PageRequestState.LOADING)));
                    bn80 bn80Var = (bn80) this.b.a.getValue();
                    int intValue = ym80Var.a().intValue();
                    String str = bn80Var != null ? bn80Var.a : null;
                    String str2 = bn80Var != null ? bn80Var.b : null;
                    List a = this.c.a();
                    String str3 = bn80Var != null ? bn80Var.c : null;
                    organizationsUiStateInteractor$tryLoadNextPage$12.L$0 = null;
                    organizationsUiStateInteractor$tryLoadNextPage$12.L$1 = null;
                    organizationsUiStateInteractor$tryLoadNextPage$12.L$2 = null;
                    organizationsUiStateInteractor$tryLoadNextPage$12.L$3 = null;
                    organizationsUiStateInteractor$tryLoadNextPage$12.label = 1;
                    obj = this.a.b(intValue, str, str2, str3, ym80Var, a, uc4Var, f, organizationsUiStateInteractor$tryLoadNextPage$12);
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
                ip80Var = (ip80) obj;
                r0Var = xk80Var.a;
                do {
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, ip80Var));
                return zy11.a;
            }
        }
        organizationsUiStateInteractor$tryLoadNextPage$1 = new OrganizationsUiStateInteractor$tryLoadNextPage$1(this, continuationImpl);
        OrganizationsUiStateInteractor$tryLoadNextPage$1 organizationsUiStateInteractor$tryLoadNextPage$122 = organizationsUiStateInteractor$tryLoadNextPage$1;
        Object obj2 = organizationsUiStateInteractor$tryLoadNextPage$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsUiStateInteractor$tryLoadNextPage$122.label;
        xk80 xk80Var2 = this.e;
        if (i != 0) {
        }
        ip80Var = (ip80) obj2;
        r0Var = xk80Var2.a;
        do {
            value2 = r0Var.getValue();
        } while (!r0Var.k(value2, ip80Var));
        return zy11.a;
    }
}
