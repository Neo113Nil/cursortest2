package com.yandex.go.communications.actionrouter;

import defpackage.a60;
import defpackage.c85;
import defpackage.jst;
import defpackage.kof0;
import defpackage.ny61;
import defpackage.pm00;
import defpackage.v770;
import defpackage.wsd0;
import defpackage.xsd0;
import defpackage.y50;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.common_models.net.map_object.q0;

/* loaded from: classes12.dex */
public final class a extends c85 implements xsd0 {
    public final kof0 a;
    public final y50 b;
    public final h c;
    public final c d;

    public a(kof0 kof0Var, y50 y50Var, h hVar, c cVar) {
        this.a = kof0Var;
        this.b = y50Var;
        this.c = hVar;
        this.d = cVar;
    }

    @Override // defpackage.c85
    public final Object c(pm00 pm00Var, Continuation continuation) {
        return g((q0) pm00Var.d, pm00Var.b, (ContinuationImpl) continuation);
    }

    @Override // defpackage.c85
    public final Object d(wsd0 wsd0Var, Continuation continuation) {
        return g((q0) wsd0Var.getAction(), null, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        PromoOnMapRouterImpl$requestEnsuringMode$1 promoOnMapRouterImpl$requestEnsuringMode$1;
        int i;
        if (continuationImpl instanceof PromoOnMapRouterImpl$requestEnsuringMode$1) {
            promoOnMapRouterImpl$requestEnsuringMode$1 = (PromoOnMapRouterImpl$requestEnsuringMode$1) continuationImpl;
            int i2 = promoOnMapRouterImpl$requestEnsuringMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoOnMapRouterImpl$requestEnsuringMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promoOnMapRouterImpl$requestEnsuringMode$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoOnMapRouterImpl$requestEnsuringMode$1.label;
                if (i != 0) {
                    b.b(obj);
                    promoOnMapRouterImpl$requestEnsuringMode$1.L$0 = null;
                    promoOnMapRouterImpl$requestEnsuringMode$1.label = 1;
                    Object d = this.c.d(str, promoOnMapRouterImpl$requestEnsuringMode$1);
                    return d == coroutineSingletons ? coroutineSingletons : d;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                return ((Result) obj).getValue();
            }
        }
        promoOnMapRouterImpl$requestEnsuringMode$1 = new PromoOnMapRouterImpl$requestEnsuringMode$1(this, continuationImpl);
        Object obj2 = promoOnMapRouterImpl$requestEnsuringMode$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoOnMapRouterImpl$requestEnsuringMode$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        PromoOnMapRouterImpl$showPromotion$4 promoOnMapRouterImpl$showPromotion$4;
        Object obj;
        int i;
        String str4;
        String str5 = str;
        if (continuationImpl instanceof PromoOnMapRouterImpl$showPromotion$4) {
            promoOnMapRouterImpl$showPromotion$4 = (PromoOnMapRouterImpl$showPromotion$4) continuationImpl;
            int i2 = promoOnMapRouterImpl$showPromotion$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoOnMapRouterImpl$showPromotion$4.label = i2 - Integer.MIN_VALUE;
                obj = promoOnMapRouterImpl$showPromotion$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoOnMapRouterImpl$showPromotion$4.label;
                kof0 kof0Var = this.a;
                if (i != 0) {
                    b.b(obj);
                    if (str2.length() != 0) {
                        h hVar = this.c;
                        if (!hVar.e.b(str2)) {
                            promoOnMapRouterImpl$showPromotion$4.L$0 = str5;
                            promoOnMapRouterImpl$showPromotion$4.L$1 = str2;
                            promoOnMapRouterImpl$showPromotion$4.L$2 = null;
                            promoOnMapRouterImpl$showPromotion$4.label = 1;
                            obj = hVar.j(str2, promoOnMapRouterImpl$showPromotion$4);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str4 = str2;
                        }
                    }
                    if (str3.length() > 0) {
                        ((a60) this.b).c(str3, v770.m);
                        if (str5 != null) {
                            kof0Var.c(str5, false);
                        }
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str6 = (String) promoOnMapRouterImpl$showPromotion$4.L$1;
                String str7 = (String) promoOnMapRouterImpl$showPromotion$4.L$0;
                b.b(obj);
                str4 = str6;
                str5 = str7;
                if (((Boolean) obj).booleanValue()) {
                    c.l(this.d, str4, "object_on_map", null, null, null, 28);
                    if (str5 != null) {
                        kof0Var.c(str5, true);
                    }
                }
                return zy11.a;
            }
        }
        promoOnMapRouterImpl$showPromotion$4 = new PromoOnMapRouterImpl$showPromotion$4(this, continuationImpl);
        obj = promoOnMapRouterImpl$showPromotion$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoOnMapRouterImpl$showPromotion$4.label;
        kof0 kof0Var2 = this.a;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(5:18|19|20|21|22))(4:26|27|28|(4:30|(2:32|33)|21|22)(1:34)))(1:35))(4:45|(2:47|(3:49|(1:51)|33))|42|(1:33)(1:44))|36|(4:38|(2:40|33)|28|(0)(0))(3:41|42|(0)(0))))|56|6|7|(0)(0)|36|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006d, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006e, code lost:
    
        r11 = r10;
        r10 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[Catch: all -> 0x006d, CancellationException -> 0x00f0, TryCatch #0 {CancellationException -> 0x00f0, blocks: (B:20:0x004f, B:27:0x0063, B:28:0x00c2, B:30:0x00c8, B:34:0x00d9, B:38:0x00b3), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9 A[Catch: all -> 0x006d, CancellationException -> 0x00f0, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00f0, blocks: (B:20:0x004f, B:27:0x0063, B:28:0x00c2, B:30:0x00c8, B:34:0x00d9, B:38:0x00b3), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3 A[Catch: all -> 0x006d, CancellationException -> 0x00f0, TRY_ENTER, TryCatch #0 {CancellationException -> 0x00f0, blocks: (B:20:0x004f, B:27:0x0063, B:28:0x00c2, B:30:0x00c8, B:34:0x00d9, B:38:0x00b3), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(q0 q0Var, String str, ContinuationImpl continuationImpl) {
        PromoOnMapRouterImpl$showPromotion$1 promoOnMapRouterImpl$showPromotion$1;
        Object obj;
        int i;
        String str2;
        q0 q0Var2;
        String str3;
        Object e;
        Throwable a;
        try {
            if (continuationImpl instanceof PromoOnMapRouterImpl$showPromotion$1) {
                promoOnMapRouterImpl$showPromotion$1 = (PromoOnMapRouterImpl$showPromotion$1) continuationImpl;
                int i2 = promoOnMapRouterImpl$showPromotion$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    promoOnMapRouterImpl$showPromotion$1.label = i2 - Integer.MIN_VALUE;
                    obj = promoOnMapRouterImpl$showPromotion$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = promoOnMapRouterImpl$showPromotion$1.label;
                    if (i != 0) {
                        b.b(obj);
                        str2 = q0Var.a;
                        if (str2.length() > 0) {
                            h hVar = this.c;
                            if (!hVar.e.b(str2)) {
                                promoOnMapRouterImpl$showPromotion$1.L$0 = q0Var;
                                promoOnMapRouterImpl$showPromotion$1.L$1 = str;
                                promoOnMapRouterImpl$showPromotion$1.L$2 = str2;
                                promoOnMapRouterImpl$showPromotion$1.label = 1;
                                Object j = hVar.j(str2, promoOnMapRouterImpl$showPromotion$1);
                                if (j != obj2) {
                                    q0Var2 = q0Var;
                                    str3 = str2;
                                    obj = j;
                                }
                            }
                        }
                        String str4 = q0Var.b;
                        promoOnMapRouterImpl$showPromotion$1.L$0 = null;
                        promoOnMapRouterImpl$showPromotion$1.L$1 = null;
                        promoOnMapRouterImpl$showPromotion$1.L$2 = null;
                        promoOnMapRouterImpl$showPromotion$1.label = 4;
                        Object f = f(str, str2, str4, promoOnMapRouterImpl$showPromotion$1);
                        return f != obj2 ? obj2 : f;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            str3 = (String) promoOnMapRouterImpl$showPromotion$1.L$2;
                            str = (String) promoOnMapRouterImpl$showPromotion$1.L$1;
                            q0Var2 = (q0) promoOnMapRouterImpl$showPromotion$1.L$0;
                            b.b(obj);
                            e = ((Result) obj).getValue();
                            a = Result.a(e);
                            if (a == null) {
                                throw a;
                            }
                            String str5 = q0Var2.b;
                            promoOnMapRouterImpl$showPromotion$1.L$0 = null;
                            promoOnMapRouterImpl$showPromotion$1.L$1 = null;
                            promoOnMapRouterImpl$showPromotion$1.L$2 = str3;
                            promoOnMapRouterImpl$showPromotion$1.label = 3;
                            if (f(str, str3, str5, promoOnMapRouterImpl$showPromotion$1) == obj2) {
                            }
                            return zy11.a;
                        }
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            b.b(obj);
                            return obj;
                        }
                        Object obj3 = (String) promoOnMapRouterImpl$showPromotion$1.L$2;
                        try {
                            b.b(obj);
                        } catch (Throwable th) {
                            Throwable th2 = th;
                            jst.e.k(th2, String.format("Error getting banner with id %s", Arrays.copyOf(new Object[]{obj3}, 1)));
                            return zy11.a;
                        }
                        return zy11.a;
                    }
                    str3 = (String) promoOnMapRouterImpl$showPromotion$1.L$2;
                    str = (String) promoOnMapRouterImpl$showPromotion$1.L$1;
                    q0Var2 = (q0) promoOnMapRouterImpl$showPromotion$1.L$0;
                    b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        promoOnMapRouterImpl$showPromotion$1.L$0 = q0Var2;
                        promoOnMapRouterImpl$showPromotion$1.L$1 = str;
                        promoOnMapRouterImpl$showPromotion$1.L$2 = str3;
                        promoOnMapRouterImpl$showPromotion$1.label = 2;
                        e = e(str3, promoOnMapRouterImpl$showPromotion$1);
                        if (e == obj2) {
                        }
                        a = Result.a(e);
                        if (a == null) {
                        }
                    } else {
                        str2 = str3;
                        q0Var = q0Var2;
                        String str42 = q0Var.b;
                        promoOnMapRouterImpl$showPromotion$1.L$0 = null;
                        promoOnMapRouterImpl$showPromotion$1.L$1 = null;
                        promoOnMapRouterImpl$showPromotion$1.L$2 = null;
                        promoOnMapRouterImpl$showPromotion$1.label = 4;
                        Object f2 = f(str, str2, str42, promoOnMapRouterImpl$showPromotion$1);
                        if (f2 != obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (CancellationException e2) {
            throw e2;
        }
        promoOnMapRouterImpl$showPromotion$1 = new PromoOnMapRouterImpl$showPromotion$1(this, continuationImpl);
        obj = promoOnMapRouterImpl$showPromotion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoOnMapRouterImpl$showPromotion$1.label;
    }
}
