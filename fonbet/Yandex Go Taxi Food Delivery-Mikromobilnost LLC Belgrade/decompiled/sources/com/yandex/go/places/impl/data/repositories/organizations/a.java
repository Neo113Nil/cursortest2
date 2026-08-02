package com.yandex.go.places.impl.data.repositories.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponse;
import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponseV2;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsRequestParams;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsStateRequestParam;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.request.FiltersAndSortingRequestDto;
import com.yandex.go.places.map.data.repositories.h;
import defpackage.bl80;
import defpackage.cmt;
import defpackage.kk80;
import defpackage.l65;
import defpackage.lg80;
import defpackage.m810;
import defpackage.mk80;
import defpackage.nfc0;
import defpackage.ny61;
import defpackage.svj;
import defpackage.uc4;
import defpackage.wls;
import defpackage.yac0;
import defpackage.zzs;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final bl80 a;
    public final yac0 b;
    public final com.yandex.go.places.map.data.mappers.a c;
    public final h d;
    public final boolean e;
    public final nfc0 f;

    public a(bl80 bl80Var, yac0 yac0Var, com.yandex.go.places.map.data.mappers.a aVar, h hVar, boolean z, nfc0 nfc0Var) {
        this.a = bl80Var;
        this.b = yac0Var;
        this.c = aVar;
        this.d = hVar;
        this.e = z;
        this.f = nfc0Var;
    }

    public static Object b(a aVar, int i, String str, zzs zzsVar, String str2, String str3, String str4, FiltersAndSortingRequestDto filtersAndSortingRequestDto, uc4 uc4Var, Float f, lg80 lg80Var, svj svjVar, Continuation continuation) {
        return aVar.a(i, str, zzsVar, str2, str3, str4, filtersAndSortingRequestDto, uc4Var, f, lg80Var, svjVar, new OrganizationsRepository$loadOrganizations$2(2, null), (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x024d A[Catch: all -> 0x02b3, CancellationException -> 0x02ba, TryCatch #2 {CancellationException -> 0x02ba, all -> 0x02b3, blocks: (B:16:0x0070, B:17:0x02a7, B:18:0x02ad, B:25:0x00b1, B:28:0x027a, B:33:0x00f2, B:35:0x0247, B:37:0x024d, B:41:0x012a, B:43:0x020e, B:45:0x0211, B:47:0x0215, B:49:0x021c, B:51:0x0220, B:56:0x0162, B:58:0x01d9, B:60:0x016b, B:62:0x016f, B:63:0x0181, B:66:0x01ac, B:70:0x01e1), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0215 A[Catch: all -> 0x02b3, CancellationException -> 0x02ba, TryCatch #2 {CancellationException -> 0x02ba, all -> 0x02b3, blocks: (B:16:0x0070, B:17:0x02a7, B:18:0x02ad, B:25:0x00b1, B:28:0x027a, B:33:0x00f2, B:35:0x0247, B:37:0x024d, B:41:0x012a, B:43:0x020e, B:45:0x0211, B:47:0x0215, B:49:0x021c, B:51:0x0220, B:56:0x0162, B:58:0x01d9, B:60:0x016b, B:62:0x016f, B:63:0x0181, B:66:0x01ac, B:70:0x01e1), top: B:8:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, String str, zzs zzsVar, String str2, String str3, String str4, FiltersAndSortingRequestDto filtersAndSortingRequestDto, uc4 uc4Var, Float f, lg80 lg80Var, svj svjVar, wls wlsVar, ContinuationImpl continuationImpl) {
        OrganizationsRepository$loadOrganizations$1 organizationsRepository$loadOrganizations$1;
        OrganizationsRepository$loadOrganizations$1 organizationsRepository$loadOrganizations$12;
        CoroutineSingletons coroutineSingletons;
        int i2;
        int i3;
        BaseOrganizationsResponse$OrganizationsResponseV2 baseOrganizationsResponse$OrganizationsResponseV2;
        wls wlsVar2;
        l65 l65Var;
        wls wlsVar3;
        l65 l65Var2;
        BaseOrganizationsResponse$OrganizationsResponseV2 baseOrganizationsResponse$OrganizationsResponseV22;
        uc4 uc4Var2;
        l65 l65Var3;
        List list;
        h hVar;
        List list2;
        try {
            if (continuationImpl instanceof OrganizationsRepository$loadOrganizations$1) {
                organizationsRepository$loadOrganizations$1 = (OrganizationsRepository$loadOrganizations$1) continuationImpl;
                int i4 = organizationsRepository$loadOrganizations$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    organizationsRepository$loadOrganizations$1.label = i4 - Integer.MIN_VALUE;
                    organizationsRepository$loadOrganizations$12 = organizationsRepository$loadOrganizations$1;
                    Object obj = organizationsRepository$loadOrganizations$12.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = organizationsRepository$loadOrganizations$12.label;
                    if (i2 != 0) {
                        kotlin.b.b(obj);
                        i3 = i;
                        baseOrganizationsResponse$OrganizationsResponseV2 = null;
                        OrganizationsRequestParams organizationsRequestParams = new OrganizationsRequestParams(i3, new OrganizationsStateRequestParam(zzsVar, filtersAndSortingRequestDto, uc4Var, f != null ? new Integer(m810.b(f.floatValue())) : null, lg80Var.b(), svjVar.a(), 192), str, str4, str2, str3);
                        boolean z = this.e;
                        bl80 bl80Var = this.a;
                        if (z) {
                            cmt<BaseOrganizationsResponse$OrganizationsResponseV2> b = bl80Var.a().b(organizationsRequestParams);
                            organizationsRepository$loadOrganizations$12.L$0 = null;
                            organizationsRepository$loadOrganizations$12.L$1 = null;
                            organizationsRepository$loadOrganizations$12.L$2 = null;
                            organizationsRepository$loadOrganizations$12.L$3 = null;
                            organizationsRepository$loadOrganizations$12.L$4 = null;
                            organizationsRepository$loadOrganizations$12.L$5 = null;
                            organizationsRepository$loadOrganizations$12.L$6 = null;
                            organizationsRepository$loadOrganizations$12.L$7 = null;
                            organizationsRepository$loadOrganizations$12.L$8 = null;
                            organizationsRepository$loadOrganizations$12.L$9 = null;
                            organizationsRepository$loadOrganizations$12.L$10 = wlsVar;
                            organizationsRepository$loadOrganizations$12.L$11 = null;
                            organizationsRepository$loadOrganizations$12.I$0 = i3;
                            organizationsRepository$loadOrganizations$12.label = 1;
                            obj = ru.yandex.taxi.network.api.a.d(b, organizationsRepository$loadOrganizations$12);
                            if (obj != coroutineSingletons) {
                                wlsVar2 = wlsVar;
                                l65Var = (l65) obj;
                            }
                        } else {
                            cmt<BaseOrganizationsResponse$OrganizationsResponse> e = bl80Var.a().e(organizationsRequestParams);
                            organizationsRepository$loadOrganizations$12.L$0 = null;
                            organizationsRepository$loadOrganizations$12.L$1 = null;
                            organizationsRepository$loadOrganizations$12.L$2 = null;
                            organizationsRepository$loadOrganizations$12.L$3 = null;
                            organizationsRepository$loadOrganizations$12.L$4 = null;
                            organizationsRepository$loadOrganizations$12.L$5 = null;
                            organizationsRepository$loadOrganizations$12.L$6 = null;
                            organizationsRepository$loadOrganizations$12.L$7 = null;
                            organizationsRepository$loadOrganizations$12.L$8 = null;
                            organizationsRepository$loadOrganizations$12.L$9 = null;
                            organizationsRepository$loadOrganizations$12.L$10 = wlsVar;
                            organizationsRepository$loadOrganizations$12.L$11 = null;
                            organizationsRepository$loadOrganizations$12.I$0 = i3;
                            organizationsRepository$loadOrganizations$12.label = 2;
                            obj = ru.yandex.taxi.network.api.a.d(e, organizationsRepository$loadOrganizations$12);
                            if (obj != coroutineSingletons) {
                                wlsVar2 = wlsVar;
                                l65Var = (l65) obj;
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i2 == 1) {
                        i3 = organizationsRepository$loadOrganizations$12.I$0;
                        wlsVar2 = (wls) organizationsRepository$loadOrganizations$12.L$10;
                        kotlin.b.b(obj);
                        baseOrganizationsResponse$OrganizationsResponseV2 = null;
                        l65Var = (l65) obj;
                    } else {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                i3 = organizationsRepository$loadOrganizations$12.I$0;
                                l65Var2 = (l65) organizationsRepository$loadOrganizations$12.L$11;
                                kotlin.b.b(obj);
                                baseOrganizationsResponse$OrganizationsResponseV2 = null;
                                if (this.b.a) {
                                    com.yandex.go.places.map.data.mappers.a aVar = this.c;
                                    List d = l65Var2.getD();
                                    organizationsRepository$loadOrganizations$12.L$0 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$1 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$2 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$3 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$4 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$5 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$6 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$7 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$8 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$9 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$10 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$11 = l65Var2;
                                    organizationsRepository$loadOrganizations$12.L$12 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$13 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.I$0 = i3;
                                    organizationsRepository$loadOrganizations$12.label = 4;
                                    obj = aVar.o(d, organizationsRepository$loadOrganizations$12);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    l65Var3 = l65Var2;
                                    list = (List) obj;
                                    hVar = this.d;
                                    organizationsRepository$loadOrganizations$12.L$0 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$1 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$2 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$3 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$4 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$5 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$6 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$7 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$8 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$9 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$10 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$11 = l65Var3;
                                    organizationsRepository$loadOrganizations$12.L$12 = baseOrganizationsResponse$OrganizationsResponseV2;
                                    organizationsRepository$loadOrganizations$12.L$13 = list;
                                    organizationsRepository$loadOrganizations$12.I$0 = i3;
                                    organizationsRepository$loadOrganizations$12.label = 5;
                                    if (hVar.v(list, organizationsRepository$loadOrganizations$12) != coroutineSingletons) {
                                    }
                                    return coroutineSingletons;
                                }
                                return new kk80(l65Var2);
                            }
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                list2 = (List) organizationsRepository$loadOrganizations$12.L$13;
                                l65Var3 = (l65) organizationsRepository$loadOrganizations$12.L$11;
                                kotlin.b.b(obj);
                                this.f.b(list2);
                                l65Var2 = l65Var3;
                                return new kk80(l65Var2);
                            }
                            i3 = organizationsRepository$loadOrganizations$12.I$0;
                            l65Var2 = (l65) organizationsRepository$loadOrganizations$12.L$11;
                            kotlin.b.b(obj);
                            baseOrganizationsResponse$OrganizationsResponseV2 = null;
                            l65Var3 = l65Var2;
                            list = (List) obj;
                            hVar = this.d;
                            organizationsRepository$loadOrganizations$12.L$0 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$1 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$2 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$3 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$4 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$5 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$6 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$7 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$8 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$9 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$10 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$11 = l65Var3;
                            organizationsRepository$loadOrganizations$12.L$12 = baseOrganizationsResponse$OrganizationsResponseV2;
                            organizationsRepository$loadOrganizations$12.L$13 = list;
                            organizationsRepository$loadOrganizations$12.I$0 = i3;
                            organizationsRepository$loadOrganizations$12.label = 5;
                            if (hVar.v(list, organizationsRepository$loadOrganizations$12) != coroutineSingletons) {
                                list2 = list;
                                this.f.b(list2);
                                l65Var2 = l65Var3;
                                return new kk80(l65Var2);
                            }
                            return coroutineSingletons;
                        }
                        i3 = organizationsRepository$loadOrganizations$12.I$0;
                        wlsVar2 = (wls) organizationsRepository$loadOrganizations$12.L$10;
                        kotlin.b.b(obj);
                        baseOrganizationsResponse$OrganizationsResponseV2 = null;
                        l65Var = (l65) obj;
                    }
                    wlsVar3 = wlsVar2;
                    l65Var2 = l65Var;
                    baseOrganizationsResponse$OrganizationsResponseV22 = !(l65Var2 instanceof BaseOrganizationsResponse$OrganizationsResponseV2) ? (BaseOrganizationsResponse$OrganizationsResponseV2) l65Var2 : baseOrganizationsResponse$OrganizationsResponseV2;
                    if (baseOrganizationsResponse$OrganizationsResponseV22 != null && (uc4Var2 = baseOrganizationsResponse$OrganizationsResponseV22.h) != null) {
                        organizationsRepository$loadOrganizations$12.L$0 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$1 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$2 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$3 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$4 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$5 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$6 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$7 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$8 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$9 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$10 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$11 = l65Var2;
                        organizationsRepository$loadOrganizations$12.L$12 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.L$13 = baseOrganizationsResponse$OrganizationsResponseV2;
                        organizationsRepository$loadOrganizations$12.I$0 = i3;
                        organizationsRepository$loadOrganizations$12.label = 3;
                        if (wlsVar3.invoke(uc4Var2, organizationsRepository$loadOrganizations$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    if (this.b.a) {
                    }
                    return new kk80(l65Var2);
                }
            }
            if (i2 != 0) {
            }
            wlsVar3 = wlsVar2;
            l65Var2 = l65Var;
            if (!(l65Var2 instanceof BaseOrganizationsResponse$OrganizationsResponseV2)) {
            }
            if (baseOrganizationsResponse$OrganizationsResponseV22 != null) {
                organizationsRepository$loadOrganizations$12.L$0 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$1 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$2 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$3 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$4 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$5 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$6 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$7 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$8 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$9 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$10 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$11 = l65Var2;
                organizationsRepository$loadOrganizations$12.L$12 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.L$13 = baseOrganizationsResponse$OrganizationsResponseV2;
                organizationsRepository$loadOrganizations$12.I$0 = i3;
                organizationsRepository$loadOrganizations$12.label = 3;
                if (wlsVar3.invoke(uc4Var2, organizationsRepository$loadOrganizations$12) == coroutineSingletons) {
                }
            }
            if (this.b.a) {
            }
            return new kk80(l65Var2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            return new mk80(th);
        }
        organizationsRepository$loadOrganizations$1 = new OrganizationsRepository$loadOrganizations$1(this, continuationImpl);
        organizationsRepository$loadOrganizations$12 = organizationsRepository$loadOrganizations$1;
        Object obj2 = organizationsRepository$loadOrganizations$12.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = organizationsRepository$loadOrganizations$12.label;
    }
}
