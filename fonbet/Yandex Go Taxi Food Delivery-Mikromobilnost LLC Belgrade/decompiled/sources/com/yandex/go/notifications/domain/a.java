package com.yandex.go.notifications.domain;

import defpackage.hst;
import defpackage.i3y;
import defpackage.jgd;
import defpackage.jst;
import defpackage.ny61;
import defpackage.p1g0;
import defpackage.s85;
import defpackage.v1g0;
import defpackage.w511;
import defpackage.xjp;
import defpackage.xww0;
import defpackage.y0g0;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final y0g0 a;
    public final p1g0 b;
    public final i3y c;

    public a(yvf0 yvf0Var, y0g0 y0g0Var, p1g0 p1g0Var) {
        this.a = y0g0Var;
        this.b = p1g0Var;
        this.c = kotlin.a.a(new jgd(yvf0Var, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(xjp xjpVar, ContinuationImpl continuationImpl) {
        TaxiPushNotificationInteractor$extractDataWithChannel$1 taxiPushNotificationInteractor$extractDataWithChannel$1;
        int i;
        Map<String, String> map;
        if (continuationImpl instanceof TaxiPushNotificationInteractor$extractDataWithChannel$1) {
            taxiPushNotificationInteractor$extractDataWithChannel$1 = (TaxiPushNotificationInteractor$extractDataWithChannel$1) continuationImpl;
            int i2 = taxiPushNotificationInteractor$extractDataWithChannel$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiPushNotificationInteractor$extractDataWithChannel$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiPushNotificationInteractor$extractDataWithChannel$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiPushNotificationInteractor$extractDataWithChannel$1.label;
                if (i != 0) {
                    b.b(obj);
                    Map<String, String> data = xjpVar.a.getData();
                    taxiPushNotificationInteractor$extractDataWithChannel$1.L$0 = null;
                    taxiPushNotificationInteractor$extractDataWithChannel$1.L$1 = data;
                    taxiPushNotificationInteractor$extractDataWithChannel$1.label = 1;
                    obj = ((ru.yandex.taxi.settings.handlers.b) this.a).a(data, taxiPushNotificationInteractor$extractDataWithChannel$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map = data;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) taxiPushNotificationInteractor$extractDataWithChannel$1.L$1;
                    b.b(obj);
                }
                String str = (String) obj;
                return str != null ? map : kotlin.collections.b.o(map, new Pair("local_channel_id", str));
            }
        }
        taxiPushNotificationInteractor$extractDataWithChannel$1 = new TaxiPushNotificationInteractor$extractDataWithChannel$1(this, continuationImpl);
        Object obj2 = taxiPushNotificationInteractor$extractDataWithChannel$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiPushNotificationInteractor$extractDataWithChannel$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|(1:14)(1:18)|15|16))|33|6|7|(0)(0)|12|(0)(0)|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0082, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        r0 = r5.a.getData().get("id");
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        r4.b.a(r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        defpackage.xby.t(defpackage.jst.e, "PUSH_ACK:EXCEPTION", r6, "Failed to handle push notification:\n".concat(defpackage.wfz.r(r5)), 2);
        r4 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(xjp xjpVar, ContinuationImpl continuationImpl) {
        TaxiPushNotificationInteractor$handlePushNotification$1 taxiPushNotificationInteractor$handlePushNotification$1;
        int i;
        boolean z;
        if (continuationImpl instanceof TaxiPushNotificationInteractor$handlePushNotification$1) {
            taxiPushNotificationInteractor$handlePushNotification$1 = (TaxiPushNotificationInteractor$handlePushNotification$1) continuationImpl;
            int i2 = taxiPushNotificationInteractor$handlePushNotification$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiPushNotificationInteractor$handlePushNotification$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiPushNotificationInteractor$handlePushNotification$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiPushNotificationInteractor$handlePushNotification$1.label;
                if (i != 0) {
                    b.b(obj);
                    taxiPushNotificationInteractor$handlePushNotification$1.L$0 = xjpVar;
                    taxiPushNotificationInteractor$handlePushNotification$1.label = 1;
                    obj = c(xjpVar, taxiPushNotificationInteractor$handlePushNotification$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xjpVar = (xjp) taxiPushNotificationInteractor$handlePushNotification$1.L$0;
                    b.b(obj);
                }
                z = ((Boolean) obj).booleanValue();
                if (z) {
                    jst.e.getClass();
                } else {
                    jst.e.getClass();
                }
                return zy11.a;
            }
        }
        taxiPushNotificationInteractor$handlePushNotification$1 = new TaxiPushNotificationInteractor$handlePushNotification$1(this, continuationImpl);
        Object obj3 = taxiPushNotificationInteractor$handlePushNotification$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiPushNotificationInteractor$handlePushNotification$1.label;
        if (i != 0) {
        }
        z = ((Boolean) obj3).booleanValue();
        if (z) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005a, code lost:
    
        if (r10 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008d -> B:12:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ae -> B:11:0x00b1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(xjp xjpVar, ContinuationImpl continuationImpl) {
        TaxiPushNotificationInteractor$tryHandleRemoteMessage$1 taxiPushNotificationInteractor$tryHandleRemoteMessage$1;
        int i;
        List list;
        Iterator it;
        Map map;
        if (continuationImpl instanceof TaxiPushNotificationInteractor$tryHandleRemoteMessage$1) {
            taxiPushNotificationInteractor$tryHandleRemoteMessage$1 = (TaxiPushNotificationInteractor$tryHandleRemoteMessage$1) continuationImpl;
            int i2 = taxiPushNotificationInteractor$tryHandleRemoteMessage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiPushNotificationInteractor$tryHandleRemoteMessage$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiPushNotificationInteractor$tryHandleRemoteMessage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiPushNotificationInteractor$tryHandleRemoteMessage$1.label;
                boolean z = false;
                if (i != 0) {
                    b.b(obj);
                    taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$0 = null;
                    taxiPushNotificationInteractor$tryHandleRemoteMessage$1.label = 1;
                    obj = a(xjpVar, taxiPushNotificationInteractor$tryHandleRemoteMessage$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        s85 s85Var = (s85) taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$5;
                        it = (Iterator) taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$3;
                        map = (Map) taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$1;
                        b.b(obj);
                        boolean a = ((Boolean) obj).booleanValue();
                        if (a) {
                            hst hstVar = jst.e;
                            Objects.toString(s85Var);
                            hstVar.getClass();
                        }
                        if (a) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                        if (it.hasNext()) {
                            s85Var = (s85) it.next();
                            if (s85Var instanceof v1g0) {
                                a = ((v1g0) s85Var).a(map);
                                if (a) {
                                }
                                if (a) {
                                }
                                if (it.hasNext()) {
                                }
                            } else {
                                if (!(s85Var instanceof xww0)) {
                                    w511.b();
                                    return null;
                                }
                                taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$0 = null;
                                taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$1 = map;
                                taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$2 = null;
                                taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$3 = it;
                                taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$4 = null;
                                taxiPushNotificationInteractor$tryHandleRemoteMessage$1.L$5 = s85Var;
                                taxiPushNotificationInteractor$tryHandleRemoteMessage$1.label = 2;
                                obj = ((xww0) s85Var).b(map, taxiPushNotificationInteractor$tryHandleRemoteMessage$1);
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                    b.b(obj);
                }
                Map map2 = (Map) obj;
                list = (List) this.c.getValue();
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    map = map2;
                    if (it.hasNext()) {
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        taxiPushNotificationInteractor$tryHandleRemoteMessage$1 = new TaxiPushNotificationInteractor$tryHandleRemoteMessage$1(this, continuationImpl);
        Object obj3 = taxiPushNotificationInteractor$tryHandleRemoteMessage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiPushNotificationInteractor$tryHandleRemoteMessage$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        Map map22 = (Map) obj3;
        list = (List) this.c.getValue();
        if (list instanceof Collection) {
        }
        it = list.iterator();
        map = map22;
        if (it.hasNext()) {
        }
        return Boolean.valueOf(z2);
    }
}
