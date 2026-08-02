package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponse;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsEmptyScreenConfigDto;
import defpackage.bvf0;
import defpackage.fm80;
import defpackage.noh;
import defpackage.ny61;
import defpackage.wm80;
import defpackage.xm80;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final a a;
    public final d b;

    public f(a aVar, d dVar) {
        this.a = aVar;
        this.b = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r2 != r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (r2 == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(BaseOrganizationsResponse$OrganizationsResponse baseOrganizationsResponse$OrganizationsResponse, ContinuationImpl continuationImpl) {
        OrganizationsResponseMapper$mapModel$1 organizationsResponseMapper$mapModel$1;
        int i;
        BaseOrganizationsResponse$OrganizationsResponse baseOrganizationsResponse$OrganizationsResponse2;
        String str;
        int i2;
        Integer num;
        BaseOrganizationsResponse$OrganizationsResponse baseOrganizationsResponse$OrganizationsResponse3 = baseOrganizationsResponse$OrganizationsResponse;
        if (continuationImpl instanceof OrganizationsResponseMapper$mapModel$1) {
            organizationsResponseMapper$mapModel$1 = (OrganizationsResponseMapper$mapModel$1) continuationImpl;
            int i3 = organizationsResponseMapper$mapModel$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                organizationsResponseMapper$mapModel$1.label = i3 - Integer.MIN_VALUE;
                Object obj = organizationsResponseMapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsResponseMapper$mapModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (baseOrganizationsResponse$OrganizationsResponse3.a >= 0) {
                        List list = baseOrganizationsResponse$OrganizationsResponse3.g;
                        organizationsResponseMapper$mapModel$1.L$0 = baseOrganizationsResponse$OrganizationsResponse3;
                        organizationsResponseMapper$mapModel$1.label = 1;
                        obj = bvf0.n(new OrganizationsResponseMapper$mapItems$2(list, this, null), organizationsResponseMapper$mapModel$1);
                    }
                    return null;
                }
                if (i != 1) {
                    if (i == 2) {
                        baseOrganizationsResponse$OrganizationsResponse3 = (BaseOrganizationsResponse$OrganizationsResponse) organizationsResponseMapper$mapModel$1.L$0;
                        kotlin.b.b(obj);
                        List list2 = (List) obj;
                        if (!list2.isEmpty()) {
                            return new wm80(baseOrganizationsResponse$OrganizationsResponse3.a, baseOrganizationsResponse$OrganizationsResponse3.b, baseOrganizationsResponse$OrganizationsResponse3.c, list2, null);
                        }
                        OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto = baseOrganizationsResponse$OrganizationsResponse3.e;
                        if (organizationsEmptyScreenConfigDto != null) {
                            organizationsResponseMapper$mapModel$1.L$0 = baseOrganizationsResponse$OrganizationsResponse3;
                            organizationsResponseMapper$mapModel$1.L$1 = null;
                            organizationsResponseMapper$mapModel$1.label = 3;
                            obj = bvf0.n(new OrganizationsResponseMapper$mapEmptyScreenConfig$2(this, organizationsEmptyScreenConfigDto, null), organizationsResponseMapper$mapModel$1);
                            if (obj != coroutineSingletons) {
                                baseOrganizationsResponse$OrganizationsResponse2 = baseOrganizationsResponse$OrganizationsResponse3;
                                int i4 = baseOrganizationsResponse$OrganizationsResponse2.a;
                                Integer num2 = baseOrganizationsResponse$OrganizationsResponse2.b;
                                String str2 = baseOrganizationsResponse$OrganizationsResponse2.c;
                                organizationsResponseMapper$mapModel$1.L$0 = null;
                                organizationsResponseMapper$mapModel$1.L$1 = null;
                                organizationsResponseMapper$mapModel$1.L$2 = null;
                                organizationsResponseMapper$mapModel$1.L$3 = num2;
                                organizationsResponseMapper$mapModel$1.L$4 = str2;
                                organizationsResponseMapper$mapModel$1.I$0 = i4;
                                organizationsResponseMapper$mapModel$1.label = 4;
                                obj = ((noh) obj).k(organizationsResponseMapper$mapModel$1);
                                if (obj != coroutineSingletons) {
                                }
                            }
                            return coroutineSingletons;
                        }
                        return null;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = organizationsResponseMapper$mapModel$1.I$0;
                        str = (String) organizationsResponseMapper$mapModel$1.L$4;
                        num = (Integer) organizationsResponseMapper$mapModel$1.L$3;
                        kotlin.b.b(obj);
                        return new xm80(i2, num, str, (fm80) obj);
                    }
                    baseOrganizationsResponse$OrganizationsResponse2 = (BaseOrganizationsResponse$OrganizationsResponse) organizationsResponseMapper$mapModel$1.L$0;
                    kotlin.b.b(obj);
                    int i42 = baseOrganizationsResponse$OrganizationsResponse2.a;
                    Integer num22 = baseOrganizationsResponse$OrganizationsResponse2.b;
                    String str22 = baseOrganizationsResponse$OrganizationsResponse2.c;
                    organizationsResponseMapper$mapModel$1.L$0 = null;
                    organizationsResponseMapper$mapModel$1.L$1 = null;
                    organizationsResponseMapper$mapModel$1.L$2 = null;
                    organizationsResponseMapper$mapModel$1.L$3 = num22;
                    organizationsResponseMapper$mapModel$1.L$4 = str22;
                    organizationsResponseMapper$mapModel$1.I$0 = i42;
                    organizationsResponseMapper$mapModel$1.label = 4;
                    obj = ((noh) obj).k(organizationsResponseMapper$mapModel$1);
                    if (obj != coroutineSingletons) {
                        str = str22;
                        i2 = i42;
                        num = num22;
                        return new xm80(i2, num, str, (fm80) obj);
                    }
                    return coroutineSingletons;
                }
                baseOrganizationsResponse$OrganizationsResponse3 = (BaseOrganizationsResponse$OrganizationsResponse) organizationsResponseMapper$mapModel$1.L$0;
                kotlin.b.b(obj);
                organizationsResponseMapper$mapModel$1.L$0 = baseOrganizationsResponse$OrganizationsResponse3;
                organizationsResponseMapper$mapModel$1.label = 2;
                obj = ((noh) obj).k(organizationsResponseMapper$mapModel$1);
            }
        }
        organizationsResponseMapper$mapModel$1 = new OrganizationsResponseMapper$mapModel$1(this, continuationImpl);
        Object obj2 = organizationsResponseMapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsResponseMapper$mapModel$1.label;
        if (i != 0) {
        }
        organizationsResponseMapper$mapModel$1.L$0 = baseOrganizationsResponse$OrganizationsResponse3;
        organizationsResponseMapper$mapModel$1.label = 2;
        obj2 = ((noh) obj2).k(organizationsResponseMapper$mapModel$1);
    }
}
