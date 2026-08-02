package com.yandex.go.places.models.data.mappers;

import com.yandex.go.places.models.data.entities.network.ActionDto$CallLinkBackgroundActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$DeeplinkActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$DeleteUserReviewActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$GoalTrackingLinkActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenDeliveryFormActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenNavigatorActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenTaxiActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenWebCustomTabsActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenWebViewActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenWebViewAuthActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OrganizationCardActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$ShareActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$ShowTrackingLinkActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$WebAuthType;
import com.yandex.go.places.models.data.entities.network.DeliveryOrderFormRoutePointDto;
import com.yandex.go.places.models.data.entities.network.h;
import com.yandex.go.places.models.data.entities.network.n;
import com.yandex.go.places.models.data.entities.network.o;
import com.yandex.go.places.models.data.entities.network.r;
import com.yandex.go.places.models.data.entities.network.s;
import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;
import defpackage.bvf0;
import defpackage.cq;
import defpackage.dbv;
import defpackage.eq;
import defpackage.evu0;
import defpackage.fq;
import defpackage.fr;
import defpackage.gq;
import defpackage.hq;
import defpackage.il6;
import defpackage.iq;
import defpackage.j670;
import defpackage.jl40;
import defpackage.jp;
import defpackage.kp;
import defpackage.m870;
import defpackage.mg41;
import defpackage.mw;
import defpackage.ny61;
import defpackage.r670;
import defpackage.rp;
import defpackage.so;
import defpackage.sp;
import defpackage.tq;
import defpackage.uq;
import defpackage.w511;
import defpackage.x470;
import defpackage.yp;
import defpackage.zq;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final dbv a;
    public final m870 b;
    public final j670 c;
    public final x470 d;
    public final r670 e;
    public final mg41 f;

    public a(dbv dbvVar, m870 m870Var, j670 j670Var, x470 x470Var, r670 r670Var, mg41 mg41Var) {
        this.a = dbvVar;
        this.b = m870Var;
        this.c = j670Var;
        this.d = x470Var;
        this.e = r670Var;
        this.f = mg41Var;
    }

    public final Object a(s sVar, il6 il6Var, ContinuationImpl continuationImpl) {
        if (sVar instanceof ActionDto$OrganizationCardActionDto) {
            ActionDto$OrganizationCardActionDto actionDto$OrganizationCardActionDto = (ActionDto$OrganizationCardActionDto) sVar;
            this.e.getClass();
            return r670.a(actionDto$OrganizationCardActionDto.a, actionDto$OrganizationCardActionDto.b, actionDto$OrganizationCardActionDto.c, actionDto$OrganizationCardActionDto.d, actionDto$OrganizationCardActionDto.e, actionDto$OrganizationCardActionDto.f);
        }
        if (sVar instanceof ActionDto$DeeplinkActionDto) {
            return new jp(((ActionDto$DeeplinkActionDto) sVar).a);
        }
        if (sVar instanceof ActionDto$OpenWebViewActionDto) {
            return new hq(((ActionDto$OpenWebViewActionDto) sVar).a);
        }
        PlacesWebAuthType placesWebAuthType = null;
        if (sVar instanceof ActionDto$OpenWebViewAuthActionDto) {
            ActionDto$OpenWebViewAuthActionDto actionDto$OpenWebViewAuthActionDto = (ActionDto$OpenWebViewAuthActionDto) sVar;
            ActionDto$WebAuthType actionDto$WebAuthType = actionDto$OpenWebViewAuthActionDto.b;
            String str = actionDto$OpenWebViewAuthActionDto.a;
            int i = mw.a[actionDto$WebAuthType.ordinal()];
            if (i == 1) {
                placesWebAuthType = PlacesWebAuthType.COOKIES;
            } else if (i == 2) {
                placesWebAuthType = PlacesWebAuthType.OAUTH;
            } else if (i != 3) {
                w511.b();
                return null;
            }
            return new iq(str, placesWebAuthType, actionDto$WebAuthType.name().toLowerCase(Locale.ROOT));
        }
        if (sVar instanceof ActionDto$OpenWebCustomTabsActionDto) {
            ActionDto$OpenWebCustomTabsActionDto actionDto$OpenWebCustomTabsActionDto = (ActionDto$OpenWebCustomTabsActionDto) sVar;
            this.f.getClass();
            return new gq(actionDto$OpenWebCustomTabsActionDto.a, actionDto$OpenWebCustomTabsActionDto.b);
        }
        if (sVar instanceof ActionDto$ShareActionDto) {
            Object n = bvf0.n(new ActionMapper$convertShareAction$2((ActionDto$ShareActionDto) sVar, this, null), continuationImpl);
            return n == CoroutineSingletons.COROUTINE_SUSPENDED ? n : (fr) n;
        }
        if (sVar instanceof ActionDto$OpenTaxiActionDto) {
            this.b.getClass();
            return new fq(((ActionDto$OpenTaxiActionDto) sVar).a);
        }
        if (sVar instanceof ActionDto$OpenDeliveryFormActionDto) {
            ActionDto$OpenDeliveryFormActionDto actionDto$OpenDeliveryFormActionDto = (ActionDto$OpenDeliveryFormActionDto) sVar;
            this.d.getClass();
            String str2 = actionDto$OpenDeliveryFormActionDto.b;
            String str3 = actionDto$OpenDeliveryFormActionDto.a;
            DeliveryOrderFormRoutePointDto deliveryOrderFormRoutePointDto = actionDto$OpenDeliveryFormActionDto.c;
            return new cq(str3, str2, deliveryOrderFormRoutePointDto != null ? x470.a(deliveryOrderFormRoutePointDto.b, deliveryOrderFormRoutePointDto.a, deliveryOrderFormRoutePointDto.c, deliveryOrderFormRoutePointDto.d) : null);
        }
        if (sVar instanceof ActionDto$OpenNavigatorActionDto) {
            ActionDto$OpenNavigatorActionDto actionDto$OpenNavigatorActionDto = (ActionDto$OpenNavigatorActionDto) sVar;
            this.c.getClass();
            return j670.a(actionDto$OpenNavigatorActionDto.a, actionDto$OpenNavigatorActionDto.b);
        }
        if (sVar instanceof h) {
            return eq.a;
        }
        if (sVar instanceof o) {
            return tq.a;
        }
        if (sVar instanceof n) {
            return uq.a;
        }
        if (sVar instanceof ActionDto$DeleteUserReviewActionDto) {
            ActionDto$DeleteUserReviewActionDto actionDto$DeleteUserReviewActionDto = (ActionDto$DeleteUserReviewActionDto) sVar;
            return new kp(actionDto$DeleteUserReviewActionDto.a, actionDto$DeleteUserReviewActionDto.b);
        }
        if (sVar instanceof com.yandex.go.places.models.data.entities.network.d) {
            return rp.a;
        }
        if (sVar instanceof ActionDto$ShowTrackingLinkActionDto) {
            String str4 = ((ActionDto$ShowTrackingLinkActionDto) sVar).a;
            if (evu0.J(str4)) {
                str4 = null;
            }
            if (str4 != null) {
                return new zq(str4, il6Var != null ? il6Var.b : null, il6Var != null ? il6Var.a : null);
            }
        } else if (sVar instanceof ActionDto$GoalTrackingLinkActionDto) {
            String str5 = ((ActionDto$GoalTrackingLinkActionDto) sVar).a;
            if ((!evu0.J(str5) ? str5 : null) != null) {
                return new sp(str5, il6Var != null ? il6Var.a : null);
            }
        } else {
            if (sVar instanceof ActionDto$CallLinkBackgroundActionDto) {
                String str6 = ((ActionDto$CallLinkBackgroundActionDto) sVar).a;
                if (str6 == null) {
                    str6 = "";
                }
                return new so(str6);
            }
            if (!jl40.l(sVar, r.INSTANCE)) {
                w511.b();
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0082 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, il6 il6Var, ContinuationImpl continuationImpl) {
        ActionMapper$mapModel$1 actionMapper$mapModel$1;
        int i;
        Iterator it;
        il6 il6Var2;
        Collection collection;
        if (continuationImpl instanceof ActionMapper$mapModel$1) {
            actionMapper$mapModel$1 = (ActionMapper$mapModel$1) continuationImpl;
            int i2 = actionMapper$mapModel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                actionMapper$mapModel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = actionMapper$mapModel$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = actionMapper$mapModel$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    it = list.iterator();
                    il6Var2 = il6Var;
                    collection = linkedHashSet;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) actionMapper$mapModel$1.L$5;
                    collection = (Collection) actionMapper$mapModel$1.L$3;
                    il6 il6Var3 = (il6) actionMapper$mapModel$1.L$1;
                    kotlin.b.b(obj);
                    fr frVar = (fr) obj;
                    if (frVar != null) {
                        collection.add(frVar);
                    }
                    il6Var2 = il6Var3;
                    if (it.hasNext()) {
                        s sVar = (s) it.next();
                        actionMapper$mapModel$1.L$0 = null;
                        actionMapper$mapModel$1.L$1 = il6Var2;
                        actionMapper$mapModel$1.L$2 = null;
                        actionMapper$mapModel$1.L$3 = collection;
                        actionMapper$mapModel$1.L$4 = null;
                        actionMapper$mapModel$1.L$5 = it;
                        actionMapper$mapModel$1.L$6 = null;
                        actionMapper$mapModel$1.L$7 = null;
                        actionMapper$mapModel$1.L$8 = null;
                        actionMapper$mapModel$1.label = 1;
                        Object a = a(sVar, il6Var2, actionMapper$mapModel$1);
                        if (a == obj2) {
                            return obj2;
                        }
                        il6Var3 = il6Var2;
                        obj = a;
                        fr frVar2 = (fr) obj;
                        if (frVar2 != null) {
                        }
                        il6Var2 = il6Var3;
                        if (it.hasNext()) {
                            Set set = (Set) collection;
                            return set.size() <= 1 ? (fr) kotlin.collections.a.Q(set) : new yp(set);
                        }
                    }
                }
            }
        }
        actionMapper$mapModel$1 = new ActionMapper$mapModel$1(this, continuationImpl);
        Object obj3 = actionMapper$mapModel$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = actionMapper$mapModel$1.label;
        if (i != 0) {
        }
    }
}
