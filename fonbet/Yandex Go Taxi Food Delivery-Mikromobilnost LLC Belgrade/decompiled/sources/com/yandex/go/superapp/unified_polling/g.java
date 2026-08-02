package com.yandex.go.superapp.unified_polling;

import com.yandex.go.superapp.orders.card.experiments.y;
import com.yandex.go.superapp.unified_polling.data.api.SuperAppTrackingApi;
import com.yandex.go.superapp.unified_polling.data.dto.SuperAppOrdersBodyDto;
import com.yandex.go.superapp.unified_polling.data.dto.TrackingsGroupMethodDto;
import defpackage.bvf0;
import defpackage.ck;
import defpackage.cmt;
import defpackage.dy11;
import defpackage.e3n;
import defpackage.fmt;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.jst;
import defpackage.m2e0;
import defpackage.mo21;
import defpackage.my11;
import defpackage.ny11;
import defpackage.ny61;
import defpackage.on2;
import defpackage.oy11;
import defpackage.po21;
import defpackage.py11;
import defpackage.qy11;
import defpackage.ry11;
import defpackage.s8o;
import defpackage.tcc;
import defpackage.w511;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class g {
    public final h3y a;
    public final y b;
    public final i3y c;
    public final r0 d = bvf0.c(dy11.c);

    public g(on2 on2Var, h3y h3yVar, y yVar) {
        this.a = h3yVar;
        this.b = yVar;
        this.c = kotlin.a.a(new ck(on2Var, 28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, m2e0 m2e0Var, Set set, e3n e3nVar, ContinuationImpl continuationImpl) {
        UnifiedPollingApiImplementation$performTrackingRequest$1 unifiedPollingApiImplementation$performTrackingRequest$1;
        int i;
        gVar.getClass();
        try {
            if (continuationImpl instanceof UnifiedPollingApiImplementation$performTrackingRequest$1) {
                unifiedPollingApiImplementation$performTrackingRequest$1 = (UnifiedPollingApiImplementation$performTrackingRequest$1) continuationImpl;
                int i2 = unifiedPollingApiImplementation$performTrackingRequest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    unifiedPollingApiImplementation$performTrackingRequest$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = unifiedPollingApiImplementation$performTrackingRequest$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = unifiedPollingApiImplementation$performTrackingRequest$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        unifiedPollingApiImplementation$performTrackingRequest$1.L$0 = null;
                        unifiedPollingApiImplementation$performTrackingRequest$1.L$1 = null;
                        unifiedPollingApiImplementation$performTrackingRequest$1.L$2 = null;
                        unifiedPollingApiImplementation$performTrackingRequest$1.label = 1;
                        obj = gVar.b(m2e0Var, set, e3nVar, unifiedPollingApiImplementation$performTrackingRequest$1);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return (fmt) obj;
                        }
                        kotlin.b.b(obj);
                    }
                    cmt cmtVar = (cmt) obj;
                    unifiedPollingApiImplementation$performTrackingRequest$1.L$0 = null;
                    unifiedPollingApiImplementation$performTrackingRequest$1.L$1 = null;
                    unifiedPollingApiImplementation$performTrackingRequest$1.L$2 = null;
                    unifiedPollingApiImplementation$performTrackingRequest$1.L$3 = null;
                    unifiedPollingApiImplementation$performTrackingRequest$1.label = 2;
                    obj = ru.yandex.taxi.network.api.a.b(cmtVar, null, unifiedPollingApiImplementation$performTrackingRequest$1);
                }
            }
            if (i != 0) {
            }
            cmt cmtVar2 = (cmt) obj;
            unifiedPollingApiImplementation$performTrackingRequest$1.L$0 = null;
            unifiedPollingApiImplementation$performTrackingRequest$1.L$1 = null;
            unifiedPollingApiImplementation$performTrackingRequest$1.L$2 = null;
            unifiedPollingApiImplementation$performTrackingRequest$1.L$3 = null;
            unifiedPollingApiImplementation$performTrackingRequest$1.label = 2;
            obj = ru.yandex.taxi.network.api.a.b(cmtVar2, null, unifiedPollingApiImplementation$performTrackingRequest$1);
        } catch (Exception unused) {
            jst.e.getClass();
            return null;
        }
        unifiedPollingApiImplementation$performTrackingRequest$1 = new UnifiedPollingApiImplementation$performTrackingRequest$1(gVar, continuationImpl);
        Object obj3 = unifiedPollingApiImplementation$performTrackingRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unifiedPollingApiImplementation$performTrackingRequest$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e0, code lost:
    
        if (r14 == r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(m2e0 m2e0Var, Set set, e3n e3nVar, ContinuationImpl continuationImpl) {
        UnifiedPollingApiImplementation$createCall$1 unifiedPollingApiImplementation$createCall$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Set N0;
        String str;
        Set set2;
        Object Q;
        SuperAppTrackingApi superAppTrackingApi;
        String str2;
        String str3;
        List list;
        zzs zzsVar;
        Long l;
        String str4;
        if (continuationImpl instanceof UnifiedPollingApiImplementation$createCall$1) {
            unifiedPollingApiImplementation$createCall$1 = (UnifiedPollingApiImplementation$createCall$1) continuationImpl;
            int i2 = unifiedPollingApiImplementation$createCall$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                unifiedPollingApiImplementation$createCall$1.label = i2 - Integer.MIN_VALUE;
                Object obj = unifiedPollingApiImplementation$createCall$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = unifiedPollingApiImplementation$createCall$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set<ry11> set3 = set;
                    ArrayList arrayList = new ArrayList(tcc.n(set3, 10));
                    for (ry11 ry11Var : set3) {
                        if (ry11Var instanceof py11) {
                            str = "eats";
                        } else if (ry11Var instanceof my11) {
                            str = "chargers";
                        } else if (ry11Var instanceof qy11) {
                            str = "scooters";
                        } else if (ry11Var instanceof oy11) {
                            str = TariffOrderFlow.ORDER_FLOW_DRIVE_KEY;
                        } else {
                            if (!(ry11Var instanceof ny11)) {
                                w511.b();
                                return null;
                            }
                            str = TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY;
                        }
                        arrayList.add(str);
                    }
                    N0 = kotlin.collections.a.N0(arrayList);
                    po21 po21Var = (po21) this.a.get();
                    unifiedPollingApiImplementation$createCall$1.L$0 = m2e0Var;
                    unifiedPollingApiImplementation$createCall$1.L$1 = null;
                    unifiedPollingApiImplementation$createCall$1.L$2 = e3nVar;
                    unifiedPollingApiImplementation$createCall$1.L$3 = N0;
                    unifiedPollingApiImplementation$createCall$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(unifiedPollingApiImplementation$createCall$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        l = (Long) unifiedPollingApiImplementation$createCall$1.L$11;
                        list = (List) unifiedPollingApiImplementation$createCall$1.L$10;
                        zzsVar = (zzs) unifiedPollingApiImplementation$createCall$1.L$9;
                        str4 = (String) unifiedPollingApiImplementation$createCall$1.L$8;
                        str2 = (String) unifiedPollingApiImplementation$createCall$1.L$7;
                        str3 = (String) unifiedPollingApiImplementation$createCall$1.L$6;
                        superAppTrackingApi = (SuperAppTrackingApi) unifiedPollingApiImplementation$createCall$1.L$5;
                        kotlin.b.b(obj);
                        return superAppTrackingApi.a(str3, str2, str4, new SuperAppOrdersBodyDto(zzsVar, list, l, !((Boolean) obj).booleanValue() ? TrackingsGroupMethodDto.Aggregate : TrackingsGroupMethodDto.InappWidgets));
                    }
                    Set set4 = (Set) unifiedPollingApiImplementation$createCall$1.L$3;
                    e3nVar = (e3n) unifiedPollingApiImplementation$createCall$1.L$2;
                    m2e0 m2e0Var2 = (m2e0) unifiedPollingApiImplementation$createCall$1.L$0;
                    kotlin.b.b(obj);
                    N0 = set4;
                    m2e0Var = m2e0Var2;
                }
                zzs a = ((mo21) obj).a();
                SuperAppTrackingApi superAppTrackingApi2 = (SuperAppTrackingApi) this.c.getValue();
                String str5 = m2e0Var.a;
                String q = s8o.q();
                String id = TimeZone.getDefault().getID();
                set2 = N0;
                if (set2.isEmpty()) {
                    set2 = null;
                }
                Set set5 = set2;
                List J0 = set5 == null ? kotlin.collections.a.J0(set5) : null;
                Long l2 = e3nVar == null ? new Long(e3n.o(e3nVar.a, DurationUnit.SECONDS)) : null;
                unifiedPollingApiImplementation$createCall$1.L$0 = null;
                unifiedPollingApiImplementation$createCall$1.L$1 = null;
                unifiedPollingApiImplementation$createCall$1.L$2 = null;
                unifiedPollingApiImplementation$createCall$1.L$3 = null;
                unifiedPollingApiImplementation$createCall$1.L$4 = null;
                unifiedPollingApiImplementation$createCall$1.L$5 = superAppTrackingApi2;
                unifiedPollingApiImplementation$createCall$1.L$6 = str5;
                unifiedPollingApiImplementation$createCall$1.L$7 = q;
                unifiedPollingApiImplementation$createCall$1.L$8 = id;
                unifiedPollingApiImplementation$createCall$1.L$9 = a;
                unifiedPollingApiImplementation$createCall$1.L$10 = J0;
                unifiedPollingApiImplementation$createCall$1.L$11 = l2;
                unifiedPollingApiImplementation$createCall$1.I$0 = 0;
                unifiedPollingApiImplementation$createCall$1.label = 2;
                Q = this.b.Q(unifiedPollingApiImplementation$createCall$1);
                if (Q != coroutineSingletons) {
                    superAppTrackingApi = superAppTrackingApi2;
                    str2 = q;
                    str3 = str5;
                    list = J0;
                    zzsVar = a;
                    obj = Q;
                    l = l2;
                    str4 = id;
                    return superAppTrackingApi.a(str3, str2, str4, new SuperAppOrdersBodyDto(zzsVar, list, l, !((Boolean) obj).booleanValue() ? TrackingsGroupMethodDto.Aggregate : TrackingsGroupMethodDto.InappWidgets));
                }
                return coroutineSingletons;
            }
        }
        unifiedPollingApiImplementation$createCall$1 = new UnifiedPollingApiImplementation$createCall$1(this, continuationImpl);
        Object obj2 = unifiedPollingApiImplementation$createCall$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = unifiedPollingApiImplementation$createCall$1.label;
        if (i != 0) {
        }
        zzs a2 = ((mo21) obj2).a();
        SuperAppTrackingApi superAppTrackingApi22 = (SuperAppTrackingApi) this.c.getValue();
        String str52 = m2e0Var.a;
        String q2 = s8o.q();
        String id2 = TimeZone.getDefault().getID();
        set2 = N0;
        if (set2.isEmpty()) {
        }
        Set set52 = set2;
        if (set52 == null) {
        }
        if (e3nVar == null) {
        }
        unifiedPollingApiImplementation$createCall$1.L$0 = null;
        unifiedPollingApiImplementation$createCall$1.L$1 = null;
        unifiedPollingApiImplementation$createCall$1.L$2 = null;
        unifiedPollingApiImplementation$createCall$1.L$3 = null;
        unifiedPollingApiImplementation$createCall$1.L$4 = null;
        unifiedPollingApiImplementation$createCall$1.L$5 = superAppTrackingApi22;
        unifiedPollingApiImplementation$createCall$1.L$6 = str52;
        unifiedPollingApiImplementation$createCall$1.L$7 = q2;
        unifiedPollingApiImplementation$createCall$1.L$8 = id2;
        unifiedPollingApiImplementation$createCall$1.L$9 = a2;
        unifiedPollingApiImplementation$createCall$1.L$10 = J0;
        unifiedPollingApiImplementation$createCall$1.L$11 = l2;
        unifiedPollingApiImplementation$createCall$1.I$0 = 0;
        unifiedPollingApiImplementation$createCall$1.label = 2;
        Q = this.b.Q(unifiedPollingApiImplementation$createCall$1);
        if (Q != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
