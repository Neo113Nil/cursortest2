package com.yandex.go.places.impl.data.mappers.organizations;

import com.yandex.go.places.impl.data.entities.network.organizations.BaseOrganizationsResponse$OrganizationsResponseV2;
import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsEmptyScreenConfigDto;
import defpackage.bvf0;
import defpackage.fg5;
import defpackage.fm80;
import defpackage.noh;
import defpackage.ny61;
import defpackage.uc4;
import defpackage.wm80;
import defpackage.xm80;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class g {
    public final a a;
    public final e b;
    public final fg5 c;

    public g(a aVar, e eVar, fg5 fg5Var) {
        this.a = aVar;
        this.b = eVar;
        this.c = fg5Var;
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
    public final Object a(BaseOrganizationsResponse$OrganizationsResponseV2 baseOrganizationsResponse$OrganizationsResponseV2, ContinuationImpl continuationImpl) {
        OrganizationsResponseV2Mapper$mapModel$1 organizationsResponseV2Mapper$mapModel$1;
        int i;
        BaseOrganizationsResponse$OrganizationsResponseV2 baseOrganizationsResponse$OrganizationsResponseV22;
        String str;
        int i2;
        Integer num;
        BaseOrganizationsResponse$OrganizationsResponseV2 baseOrganizationsResponse$OrganizationsResponseV23 = baseOrganizationsResponse$OrganizationsResponseV2;
        if (continuationImpl instanceof OrganizationsResponseV2Mapper$mapModel$1) {
            organizationsResponseV2Mapper$mapModel$1 = (OrganizationsResponseV2Mapper$mapModel$1) continuationImpl;
            int i3 = organizationsResponseV2Mapper$mapModel$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                organizationsResponseV2Mapper$mapModel$1.label = i3 - Integer.MIN_VALUE;
                Object obj = organizationsResponseV2Mapper$mapModel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsResponseV2Mapper$mapModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (baseOrganizationsResponse$OrganizationsResponseV23.a >= 0) {
                        List list = baseOrganizationsResponse$OrganizationsResponseV23.g;
                        organizationsResponseV2Mapper$mapModel$1.L$0 = baseOrganizationsResponse$OrganizationsResponseV23;
                        organizationsResponseV2Mapper$mapModel$1.label = 1;
                        obj = bvf0.n(new OrganizationsResponseV2Mapper$mapItems$2(list, this, null), organizationsResponseV2Mapper$mapModel$1);
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = organizationsResponseV2Mapper$mapModel$1.I$0;
                            str = (String) organizationsResponseV2Mapper$mapModel$1.L$4;
                            num = (Integer) organizationsResponseV2Mapper$mapModel$1.L$3;
                            kotlin.b.b(obj);
                            return new xm80(i2, num, str, (fm80) obj);
                        }
                        baseOrganizationsResponse$OrganizationsResponseV22 = (BaseOrganizationsResponse$OrganizationsResponseV2) organizationsResponseV2Mapper$mapModel$1.L$0;
                        kotlin.b.b(obj);
                        int i4 = baseOrganizationsResponse$OrganizationsResponseV22.a;
                        Integer num2 = baseOrganizationsResponse$OrganizationsResponseV22.b;
                        String str2 = baseOrganizationsResponse$OrganizationsResponseV22.c;
                        organizationsResponseV2Mapper$mapModel$1.L$0 = null;
                        organizationsResponseV2Mapper$mapModel$1.L$1 = null;
                        organizationsResponseV2Mapper$mapModel$1.L$2 = null;
                        organizationsResponseV2Mapper$mapModel$1.L$3 = num2;
                        organizationsResponseV2Mapper$mapModel$1.L$4 = str2;
                        organizationsResponseV2Mapper$mapModel$1.I$0 = i4;
                        organizationsResponseV2Mapper$mapModel$1.label = 4;
                        obj = ((noh) obj).k(organizationsResponseV2Mapper$mapModel$1);
                        if (obj != coroutineSingletons) {
                            str = str2;
                            i2 = i4;
                            num = num2;
                            return new xm80(i2, num, str, (fm80) obj);
                        }
                        return coroutineSingletons;
                    }
                    baseOrganizationsResponse$OrganizationsResponseV23 = (BaseOrganizationsResponse$OrganizationsResponseV2) organizationsResponseV2Mapper$mapModel$1.L$0;
                    kotlin.b.b(obj);
                    List list2 = (List) obj;
                    if (!list2.isEmpty()) {
                        int i5 = baseOrganizationsResponse$OrganizationsResponseV23.a;
                        Integer num3 = baseOrganizationsResponse$OrganizationsResponseV23.b;
                        String str3 = baseOrganizationsResponse$OrganizationsResponseV23.c;
                        uc4 uc4Var = baseOrganizationsResponse$OrganizationsResponseV23.h;
                        this.c.getClass();
                        return new wm80(i5, num3, str3, list2, fg5.a(uc4Var));
                    }
                    OrganizationsEmptyScreenConfigDto organizationsEmptyScreenConfigDto = baseOrganizationsResponse$OrganizationsResponseV23.e;
                    if (organizationsEmptyScreenConfigDto != null) {
                        organizationsResponseV2Mapper$mapModel$1.L$0 = baseOrganizationsResponse$OrganizationsResponseV23;
                        organizationsResponseV2Mapper$mapModel$1.L$1 = null;
                        organizationsResponseV2Mapper$mapModel$1.label = 3;
                        obj = bvf0.n(new OrganizationsResponseV2Mapper$mapEmptyScreenConfig$2(this, organizationsEmptyScreenConfigDto, null), organizationsResponseV2Mapper$mapModel$1);
                        if (obj != coroutineSingletons) {
                            baseOrganizationsResponse$OrganizationsResponseV22 = baseOrganizationsResponse$OrganizationsResponseV23;
                            int i42 = baseOrganizationsResponse$OrganizationsResponseV22.a;
                            Integer num22 = baseOrganizationsResponse$OrganizationsResponseV22.b;
                            String str22 = baseOrganizationsResponse$OrganizationsResponseV22.c;
                            organizationsResponseV2Mapper$mapModel$1.L$0 = null;
                            organizationsResponseV2Mapper$mapModel$1.L$1 = null;
                            organizationsResponseV2Mapper$mapModel$1.L$2 = null;
                            organizationsResponseV2Mapper$mapModel$1.L$3 = num22;
                            organizationsResponseV2Mapper$mapModel$1.L$4 = str22;
                            organizationsResponseV2Mapper$mapModel$1.I$0 = i42;
                            organizationsResponseV2Mapper$mapModel$1.label = 4;
                            obj = ((noh) obj).k(organizationsResponseV2Mapper$mapModel$1);
                            if (obj != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    return null;
                }
                baseOrganizationsResponse$OrganizationsResponseV23 = (BaseOrganizationsResponse$OrganizationsResponseV2) organizationsResponseV2Mapper$mapModel$1.L$0;
                kotlin.b.b(obj);
                organizationsResponseV2Mapper$mapModel$1.L$0 = baseOrganizationsResponse$OrganizationsResponseV23;
                organizationsResponseV2Mapper$mapModel$1.label = 2;
                obj = ((noh) obj).k(organizationsResponseV2Mapper$mapModel$1);
            }
        }
        organizationsResponseV2Mapper$mapModel$1 = new OrganizationsResponseV2Mapper$mapModel$1(this, continuationImpl);
        Object obj2 = organizationsResponseV2Mapper$mapModel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsResponseV2Mapper$mapModel$1.label;
        if (i != 0) {
        }
        organizationsResponseV2Mapper$mapModel$1.L$0 = baseOrganizationsResponse$OrganizationsResponseV23;
        organizationsResponseV2Mapper$mapModel$1.label = 2;
        obj2 = ((noh) obj2).k(organizationsResponseV2Mapper$mapModel$1);
    }
}
