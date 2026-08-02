package com.yandex.go.chargers.discounts.discount_stations.data;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.data.ChargersDiscountsApi;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountStationsRequestDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountStationsResponseDto;
import defpackage.cmt;
import defpackage.cy9;
import defpackage.fmt;
import defpackage.h3y;
import defpackage.ir9;
import defpackage.lpa;
import defpackage.mo21;
import defpackage.ms9;
import defpackage.ns9;
import defpackage.ny61;
import defpackage.oeu;
import defpackage.po21;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.network.api.models.GoApiHttpException;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class b {
    public final po21 a;
    public final h3y b;
    public final com.yandex.go.chargers.error.data.a c;
    public final f d;
    public final lpa e;

    public b(po21 po21Var, h3y h3yVar, com.yandex.go.chargers.error.data.a aVar, f fVar, lpa lpaVar) {
        this.a = po21Var;
        this.b = h3yVar;
        this.c = aVar;
        this.d = fVar;
        this.e = lpaVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(6:11|12|(1:14)|(1:20)|21|22)(2:24|25))(2:26|27))(3:34|35|(2:37|38))|28|(1:30)|31|32))|45|6|7|(0)(0)|28|(0)|31|32|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0049, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006f, code lost:
    
        r0.L$0 = null;
        r0.L$1 = r9;
        r0.L$2 = null;
        r0.label = 2;
        r10 = r8.c.a(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007d, code lost:
    
        if (r10 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0080, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ir9 ir9Var, ContinuationImpl continuationImpl) {
        ChargersDiscountStationsRepository$getDiscountStations$1 chargersDiscountStationsRepository$getDiscountStations$1;
        int i;
        oeu headers;
        String a;
        String a2;
        if (continuationImpl instanceof ChargersDiscountStationsRepository$getDiscountStations$1) {
            chargersDiscountStationsRepository$getDiscountStations$1 = (ChargersDiscountStationsRepository$getDiscountStations$1) continuationImpl;
            int i2 = chargersDiscountStationsRepository$getDiscountStations$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDiscountStationsRepository$getDiscountStations$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDiscountStationsRepository$getDiscountStations$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDiscountStationsRepository$getDiscountStations$1.label;
                String str = "";
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersDiscountStationsRepository$getDiscountStations$1.L$0 = null;
                    chargersDiscountStationsRepository$getDiscountStations$1.label = 1;
                    obj = c(ir9Var, 0, chargersDiscountStationsRepository$getDiscountStations$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj3 = (Throwable) chargersDiscountStationsRepository$getDiscountStations$1.L$1;
                        kotlin.b.b(obj);
                        cy9 cy9Var = (cy9) obj;
                        GoApiHttpException goApiHttpException = obj3 instanceof GoApiHttpException ? (GoApiHttpException) obj3 : null;
                        if (goApiHttpException != null && (headers = goApiHttpException.getHeaders()) != null && (a = headers.a("X-YaTraceId")) != null) {
                            str = a;
                        }
                        return new ms9(cy9Var, str);
                    }
                    kotlin.b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                ChargersDiscountStationsResponseDto chargersDiscountStationsResponseDto = (ChargersDiscountStationsResponseDto) fmtVar.a;
                a2 = fmtVar.e.a("X-YaTraceId");
                if (a2 == null) {
                    a2 = "";
                }
                return new ns9(chargersDiscountStationsResponseDto, a2);
            }
        }
        chargersDiscountStationsRepository$getDiscountStations$1 = new ChargersDiscountStationsRepository$getDiscountStations$1(this, continuationImpl);
        Object obj4 = chargersDiscountStationsRepository$getDiscountStations$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDiscountStationsRepository$getDiscountStations$1.label;
        String str2 = "";
        if (i != 0) {
        }
        fmt fmtVar2 = (fmt) obj4;
        ChargersDiscountStationsResponseDto chargersDiscountStationsResponseDto2 = (ChargersDiscountStationsResponseDto) fmtVar2.a;
        a2 = fmtVar2.e.a("X-YaTraceId");
        if (a2 == null) {
        }
        return new ns9(chargersDiscountStationsResponseDto2, a2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(6:11|12|(1:14)|(1:20)|21|22)(2:24|25))(2:26|27))(3:34|35|(2:37|38))|28|(1:30)|31|32))|45|6|7|(0)(0)|28|(0)|31|32|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a6, code lost:
    
        throw r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x004b, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0072, code lost:
    
        r0.L$0 = null;
        r0.L$1 = r9;
        r0.L$2 = null;
        r0.I$0 = r10;
        r0.label = 2;
        r11 = r8.c.a(r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
    
        if (r11 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0085, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ir9 ir9Var, int i, ContinuationImpl continuationImpl) {
        ChargersDiscountStationsRepository$getDiscountStationsPage$1 chargersDiscountStationsRepository$getDiscountStationsPage$1;
        int i2;
        oeu headers;
        String a;
        String a2;
        if (continuationImpl instanceof ChargersDiscountStationsRepository$getDiscountStationsPage$1) {
            chargersDiscountStationsRepository$getDiscountStationsPage$1 = (ChargersDiscountStationsRepository$getDiscountStationsPage$1) continuationImpl;
            int i3 = chargersDiscountStationsRepository$getDiscountStationsPage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersDiscountStationsRepository$getDiscountStationsPage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersDiscountStationsRepository$getDiscountStationsPage$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = chargersDiscountStationsRepository$getDiscountStationsPage$1.label;
                String str = "";
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    chargersDiscountStationsRepository$getDiscountStationsPage$1.L$0 = null;
                    chargersDiscountStationsRepository$getDiscountStationsPage$1.I$0 = i;
                    chargersDiscountStationsRepository$getDiscountStationsPage$1.label = 1;
                    obj = c(ir9Var, i, chargersDiscountStationsRepository$getDiscountStationsPage$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj3 = (Throwable) chargersDiscountStationsRepository$getDiscountStationsPage$1.L$1;
                        kotlin.b.b(obj);
                        cy9 cy9Var = (cy9) obj;
                        GoApiHttpException goApiHttpException = obj3 instanceof GoApiHttpException ? (GoApiHttpException) obj3 : null;
                        if (goApiHttpException != null && (headers = goApiHttpException.getHeaders()) != null && (a = headers.a("X-YaTraceId")) != null) {
                            str = a;
                        }
                        return new ms9(cy9Var, str);
                    }
                    i = chargersDiscountStationsRepository$getDiscountStationsPage$1.I$0;
                    kotlin.b.b(obj);
                }
                fmt fmtVar = (fmt) obj;
                ChargersDiscountStationsResponseDto chargersDiscountStationsResponseDto = (ChargersDiscountStationsResponseDto) fmtVar.a;
                a2 = fmtVar.e.a("X-YaTraceId");
                if (a2 == null) {
                    a2 = "";
                }
                return new ns9(chargersDiscountStationsResponseDto, a2);
            }
        }
        chargersDiscountStationsRepository$getDiscountStationsPage$1 = new ChargersDiscountStationsRepository$getDiscountStationsPage$1(this, continuationImpl);
        Object obj4 = chargersDiscountStationsRepository$getDiscountStationsPage$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = chargersDiscountStationsRepository$getDiscountStationsPage$1.label;
        String str2 = "";
        if (i2 != 0) {
        }
        fmt fmtVar2 = (fmt) obj4;
        ChargersDiscountStationsResponseDto chargersDiscountStationsResponseDto2 = (ChargersDiscountStationsResponseDto) fmtVar2.a;
        a2 = fmtVar2.e.a("X-YaTraceId");
        if (a2 == null) {
        }
        return new ns9(chargersDiscountStationsResponseDto2, a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ir9 ir9Var, int i, ContinuationImpl continuationImpl) {
        ChargersDiscountStationsRepository$requestDiscountStationsPage$1 chargersDiscountStationsRepository$requestDiscountStationsPage$1;
        int i2;
        ChargersDiscountsApi chargersDiscountsApi;
        Map<String, String> map;
        ChargersDiscountDto chargersDiscountDto;
        if (continuationImpl instanceof ChargersDiscountStationsRepository$requestDiscountStationsPage$1) {
            chargersDiscountStationsRepository$requestDiscountStationsPage$1 = (ChargersDiscountStationsRepository$requestDiscountStationsPage$1) continuationImpl;
            int i3 = chargersDiscountStationsRepository$requestDiscountStationsPage$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                chargersDiscountStationsRepository$requestDiscountStationsPage$1.label = i3 - Integer.MIN_VALUE;
                Object obj = chargersDiscountStationsRepository$requestDiscountStationsPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = chargersDiscountStationsRepository$requestDiscountStationsPage$1.label;
                if (i2 != 0) {
                    kotlin.b.b(obj);
                    chargersDiscountsApi = (ChargersDiscountsApi) this.b.get();
                    this.d.getClass();
                    LinkedHashMap a = f.a();
                    this.e.getClass();
                    ChargersDiscountDto chargersDiscountDto2 = new ChargersDiscountDto(ir9Var.a, ir9Var.b);
                    chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$0 = null;
                    chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$1 = chargersDiscountsApi;
                    chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$2 = a;
                    chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$3 = chargersDiscountDto2;
                    chargersDiscountStationsRepository$requestDiscountStationsPage$1.I$0 = i;
                    chargersDiscountStationsRepository$requestDiscountStationsPage$1.label = 1;
                    Object h = ((e) this.a).h(chargersDiscountStationsRepository$requestDiscountStationsPage$1);
                    if (h != coroutineSingletons) {
                        map = a;
                        obj = h;
                        chargersDiscountDto = chargersDiscountDto2;
                    }
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                i = chargersDiscountStationsRepository$requestDiscountStationsPage$1.I$0;
                chargersDiscountDto = (ChargersDiscountDto) chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$3;
                map = (Map) chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$2;
                chargersDiscountsApi = (ChargersDiscountsApi) chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$1;
                kotlin.b.b(obj);
                cmt<ChargersDiscountStationsResponseDto> d = chargersDiscountsApi.d(map, new ChargersDiscountStationsRequestDto(chargersDiscountDto, ((mo21) obj).a(), i));
                chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$0 = null;
                chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$1 = null;
                chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$2 = null;
                chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$3 = null;
                chargersDiscountStationsRepository$requestDiscountStationsPage$1.I$0 = i;
                chargersDiscountStationsRepository$requestDiscountStationsPage$1.label = 2;
                Object a2 = d.a(chargersDiscountStationsRepository$requestDiscountStationsPage$1);
                return a2 != coroutineSingletons ? coroutineSingletons : a2;
            }
        }
        chargersDiscountStationsRepository$requestDiscountStationsPage$1 = new ChargersDiscountStationsRepository$requestDiscountStationsPage$1(this, continuationImpl);
        Object obj2 = chargersDiscountStationsRepository$requestDiscountStationsPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = chargersDiscountStationsRepository$requestDiscountStationsPage$1.label;
        if (i2 != 0) {
        }
        cmt<ChargersDiscountStationsResponseDto> d2 = chargersDiscountsApi.d(map, new ChargersDiscountStationsRequestDto(chargersDiscountDto, ((mo21) obj2).a(), i));
        chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$0 = null;
        chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$1 = null;
        chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$2 = null;
        chargersDiscountStationsRepository$requestDiscountStationsPage$1.L$3 = null;
        chargersDiscountStationsRepository$requestDiscountStationsPage$1.I$0 = i;
        chargersDiscountStationsRepository$requestDiscountStationsPage$1.label = 2;
        Object a22 = d2.a(chargersDiscountStationsRepository$requestDiscountStationsPage$1);
        if (a22 != coroutineSingletons2) {
        }
    }
}
