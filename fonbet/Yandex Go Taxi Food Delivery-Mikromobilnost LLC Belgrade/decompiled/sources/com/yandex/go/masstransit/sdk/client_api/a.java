package com.yandex.go.masstransit.sdk.client_api;

import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutScreenStateDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutStatusDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutTripResponseDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.CommandDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.PaymentMethodDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto$EddystoneSearchDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto$IBeaconSearchDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchDataItemDto$UrlSearchDataDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResponseDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.SearchResultItemDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.TripUpdateRequestDto;
import com.yandex.go.masstransit.sdk.client_api.data.dto.a0;
import com.yandex.go.masstransit.sdk.client_api.data.dto.y;
import com.yandex.go.masstransit.sdk.client_api.model.trip.CheckoutStatus;
import defpackage.afp0;
import defpackage.blc;
import defpackage.e3n;
import defpackage.fkn;
import defpackage.ftp0;
import defpackage.fwp0;
import defpackage.g4a0;
import defpackage.gnb;
import defpackage.hlc;
import defpackage.jl40;
import defpackage.jo2;
import defpackage.jse;
import defpackage.kp50;
import defpackage.m2c;
import defpackage.mf11;
import defpackage.n2c;
import defpackage.ny61;
import defpackage.o430;
import defpackage.on2;
import defpackage.oyr;
import defpackage.p2v;
import defpackage.p421;
import defpackage.qlc;
import defpackage.r1e0;
import defpackage.rlc;
import defpackage.tcc;
import defpackage.tlc;
import defpackage.ulc;
import defpackage.uvp0;
import defpackage.vlc;
import defpackage.w1e0;
import defpackage.w511;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;

/* loaded from: classes12.dex */
public final class a {
    public final com.yandex.go.masstransit.sdk.client_api.data.repository.a a;
    public final m2c b = new m2c();
    public final n2c c = new n2c();

    public a(on2 on2Var, jse jseVar) {
        this.a = new com.yandex.go.masstransit.sdk.client_api.data.repository.a(on2Var, jseVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MasstransitClientApi$checkoutStatus$1 masstransitClientApi$checkoutStatus$1;
        int i;
        Object obj;
        long j;
        if (continuationImpl instanceof MasstransitClientApi$checkoutStatus$1) {
            masstransitClientApi$checkoutStatus$1 = (MasstransitClientApi$checkoutStatus$1) continuationImpl;
            int i2 = masstransitClientApi$checkoutStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitClientApi$checkoutStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitClientApi$checkoutStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitClientApi$checkoutStatus$1.label;
                if (i != 0) {
                    b.b(obj2);
                    masstransitClientApi$checkoutStatus$1.L$0 = null;
                    masstransitClientApi$checkoutStatus$1.label = 1;
                    obj2 = this.a.d(str, masstransitClientApi$checkoutStatus$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                jo2 jo2Var = (jo2) obj2;
                m2c m2cVar = this.b;
                obj = jo2Var.a;
                if (!(obj instanceof Result.Failure)) {
                    try {
                        r1e0 r1e0Var = (r1e0) obj;
                        m2cVar.getClass();
                        CheckoutStatus d = m2c.d(((CheckoutStatusDto) r1e0Var.a).a);
                        Long l = r1e0Var.b;
                        if (l != null) {
                            o430 o430Var = e3n.b;
                            j = kp50.V(l.longValue(), DurationUnit.MILLISECONDS);
                        } else {
                            o430 o430Var2 = e3n.b;
                            j = 0;
                        }
                        obj = new w1e0(d, j);
                    } catch (Throwable th) {
                        obj = new Result.Failure(th);
                    }
                }
                return new jo2(obj, jo2Var.b);
            }
        }
        masstransitClientApi$checkoutStatus$1 = new MasstransitClientApi$checkoutStatus$1(this, continuationImpl);
        Object obj22 = masstransitClientApi$checkoutStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitClientApi$checkoutStatus$1.label;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj22;
        m2c m2cVar2 = this.b;
        obj = jo2Var2.a;
        if (!(obj instanceof Result.Failure)) {
        }
        return new jo2(obj, jo2Var2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        MasstransitClientApi$checkoutTrip$1 masstransitClientApi$checkoutTrip$1;
        int i;
        Object obj;
        if (continuationImpl instanceof MasstransitClientApi$checkoutTrip$1) {
            masstransitClientApi$checkoutTrip$1 = (MasstransitClientApi$checkoutTrip$1) continuationImpl;
            int i2 = masstransitClientApi$checkoutTrip$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitClientApi$checkoutTrip$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitClientApi$checkoutTrip$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitClientApi$checkoutTrip$1.label;
                if (i != 0) {
                    b.b(obj2);
                    masstransitClientApi$checkoutTrip$1.L$0 = null;
                    masstransitClientApi$checkoutTrip$1.L$1 = null;
                    masstransitClientApi$checkoutTrip$1.label = 1;
                    obj2 = this.a.e(str, masstransitClientApi$checkoutTrip$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                jo2 jo2Var = (jo2) obj2;
                m2c m2cVar = this.b;
                obj = jo2Var.a;
                if (!(obj instanceof Result.Failure)) {
                    try {
                        CheckoutTripResponseDto checkoutTripResponseDto = (CheckoutTripResponseDto) obj;
                        m2cVar.getClass();
                        obj = new gnb(checkoutTripResponseDto.a, m2c.d(checkoutTripResponseDto.b));
                    } catch (Throwable th) {
                        obj = new Result.Failure(th);
                    }
                }
                return new jo2(obj, jo2Var.b);
            }
        }
        masstransitClientApi$checkoutTrip$1 = new MasstransitClientApi$checkoutTrip$1(this, continuationImpl);
        Object obj22 = masstransitClientApi$checkoutTrip$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitClientApi$checkoutTrip$1.label;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj22;
        m2c m2cVar2 = this.b;
        obj = jo2Var2.a;
        if (!(obj instanceof Result.Failure)) {
        }
        return new jo2(obj, jo2Var2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        MasstransitClientApi$copyTrip$1 masstransitClientApi$copyTrip$1;
        int i;
        Object obj;
        if (continuationImpl instanceof MasstransitClientApi$copyTrip$1) {
            masstransitClientApi$copyTrip$1 = (MasstransitClientApi$copyTrip$1) continuationImpl;
            int i2 = masstransitClientApi$copyTrip$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitClientApi$copyTrip$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitClientApi$copyTrip$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitClientApi$copyTrip$1.label;
                if (i != 0) {
                    b.b(obj2);
                    masstransitClientApi$copyTrip$1.L$0 = null;
                    masstransitClientApi$copyTrip$1.L$1 = null;
                    masstransitClientApi$copyTrip$1.label = 1;
                    obj2 = this.a.f(str, masstransitClientApi$copyTrip$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                jo2 jo2Var = (jo2) obj2;
                obj = jo2Var.a;
                if (!(obj instanceof Result.Failure)) {
                    try {
                        this.b.getClass();
                        obj = m2c.a((CheckoutScreenStateDto) obj);
                    } catch (Throwable th) {
                        obj = new Result.Failure(th);
                    }
                }
                return new jo2(obj, jo2Var.b);
            }
        }
        masstransitClientApi$copyTrip$1 = new MasstransitClientApi$copyTrip$1(this, continuationImpl);
        Object obj22 = masstransitClientApi$copyTrip$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitClientApi$copyTrip$1.label;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj22;
        obj = jo2Var2.a;
        if (!(obj instanceof Result.Failure)) {
        }
        return new jo2(obj, jo2Var2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        MasstransitClientApi$getTrip$1 masstransitClientApi$getTrip$1;
        int i;
        Object obj;
        if (continuationImpl instanceof MasstransitClientApi$getTrip$1) {
            masstransitClientApi$getTrip$1 = (MasstransitClientApi$getTrip$1) continuationImpl;
            int i2 = masstransitClientApi$getTrip$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitClientApi$getTrip$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitClientApi$getTrip$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitClientApi$getTrip$1.label;
                if (i != 0) {
                    b.b(obj2);
                    masstransitClientApi$getTrip$1.L$0 = null;
                    masstransitClientApi$getTrip$1.label = 1;
                    obj2 = this.a.g(str, masstransitClientApi$getTrip$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                jo2 jo2Var = (jo2) obj2;
                obj = jo2Var.a;
                if (!(obj instanceof Result.Failure)) {
                    try {
                        this.b.getClass();
                        obj = m2c.a((CheckoutScreenStateDto) obj);
                    } catch (Throwable th) {
                        obj = new Result.Failure(th);
                    }
                }
                return new jo2(obj, jo2Var.b);
            }
        }
        masstransitClientApi$getTrip$1 = new MasstransitClientApi$getTrip$1(this, continuationImpl);
        Object obj22 = masstransitClientApi$getTrip$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitClientApi$getTrip$1.label;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj22;
        obj = jo2Var2.a;
        if (!(obj instanceof Result.Failure)) {
        }
        return new jo2(obj, jo2Var2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Map map, g4a0 g4a0Var, ContinuationImpl continuationImpl) {
        MasstransitClientApi$initTrip$1 masstransitClientApi$initTrip$1;
        int i;
        PaymentMethodDto paymentMethodDto;
        Object obj;
        if (continuationImpl instanceof MasstransitClientApi$initTrip$1) {
            masstransitClientApi$initTrip$1 = (MasstransitClientApi$initTrip$1) continuationImpl;
            int i2 = masstransitClientApi$initTrip$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitClientApi$initTrip$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitClientApi$initTrip$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitClientApi$initTrip$1.label;
                if (i != 0) {
                    b.b(obj2);
                    if (g4a0Var != null) {
                        this.c.getClass();
                        paymentMethodDto = new PaymentMethodDto(g4a0Var.a, g4a0Var.b);
                    } else {
                        paymentMethodDto = null;
                    }
                    masstransitClientApi$initTrip$1.L$0 = null;
                    masstransitClientApi$initTrip$1.L$1 = null;
                    masstransitClientApi$initTrip$1.L$2 = null;
                    masstransitClientApi$initTrip$1.L$3 = null;
                    masstransitClientApi$initTrip$1.label = 1;
                    obj2 = this.a.h(map, paymentMethodDto, masstransitClientApi$initTrip$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                jo2 jo2Var = (jo2) obj2;
                obj = jo2Var.a;
                if (!(obj instanceof Result.Failure)) {
                    this.b.getClass();
                    obj = m2c.a((CheckoutScreenStateDto) obj);
                }
                return new jo2(obj, jo2Var.b);
            }
        }
        masstransitClientApi$initTrip$1 = new MasstransitClientApi$initTrip$1(this, continuationImpl);
        Object obj22 = masstransitClientApi$initTrip$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitClientApi$initTrip$1.label;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj22;
        obj = jo2Var2.a;
        if (!(obj instanceof Result.Failure)) {
        }
        return new jo2(obj, jo2Var2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(zzs zzsVar, String str, ContinuationImpl continuationImpl) {
        MasstransitClientApi$search$1 masstransitClientApi$search$1;
        int i;
        Object obj;
        if (continuationImpl instanceof MasstransitClientApi$search$1) {
            masstransitClientApi$search$1 = (MasstransitClientApi$search$1) continuationImpl;
            int i2 = masstransitClientApi$search$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitClientApi$search$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitClientApi$search$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitClientApi$search$1.label;
                if (i != 0) {
                    b.b(obj2);
                    SearchRequestDto searchRequestDto = new SearchRequestDto(Collections.singletonList(new SearchDataItemDto$UrlSearchDataDto(str)));
                    String p = zzsVar != null ? oyr.p("[", zzsVar.b(), "]") : null;
                    masstransitClientApi$search$1.L$0 = null;
                    masstransitClientApi$search$1.L$1 = null;
                    masstransitClientApi$search$1.L$2 = null;
                    masstransitClientApi$search$1.L$3 = null;
                    masstransitClientApi$search$1.label = 1;
                    obj2 = this.a.i(p, searchRequestDto, masstransitClientApi$search$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                jo2 jo2Var = (jo2) obj2;
                obj = jo2Var.a;
                if (!(obj instanceof Result.Failure)) {
                    try {
                        List<SearchResultItemDto> list = ((SearchResponseDto) obj).a;
                        m2c m2cVar = this.b;
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        for (SearchResultItemDto searchResultItemDto : list) {
                            m2cVar.getClass();
                            arrayList.add(m2c.c(searchResultItemDto));
                        }
                        obj = arrayList;
                    } catch (Throwable th) {
                        obj = new Result.Failure(th);
                    }
                }
                return new jo2(obj, jo2Var.b);
            }
        }
        masstransitClientApi$search$1 = new MasstransitClientApi$search$1(this, continuationImpl);
        Object obj22 = masstransitClientApi$search$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitClientApi$search$1.label;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj22;
        obj = jo2Var2.a;
        if (!(obj instanceof Result.Failure)) {
        }
        return new jo2(obj, jo2Var2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ArrayList arrayList, ContinuationImpl continuationImpl) {
        MasstransitClientApi$searchFull$1 masstransitClientApi$searchFull$1;
        int i;
        a0 a0Var;
        Object obj;
        if (continuationImpl instanceof MasstransitClientApi$searchFull$1) {
            masstransitClientApi$searchFull$1 = (MasstransitClientApi$searchFull$1) continuationImpl;
            int i2 = masstransitClientApi$searchFull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitClientApi$searchFull$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitClientApi$searchFull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitClientApi$searchFull$1.label;
                if (i != 0) {
                    b.b(obj2);
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        uvp0 uvp0Var = (uvp0) it.next();
                        this.c.getClass();
                        if (uvp0Var instanceof ftp0) {
                            a0Var = new SearchDataItemDto$UrlSearchDataDto(((ftp0) uvp0Var).a);
                        } else if (uvp0Var instanceof p2v) {
                            p2v p2vVar = (p2v) uvp0Var;
                            a0Var = new SearchDataItemDto$IBeaconSearchDataDto(p2vVar.a, p2vVar.b, p2vVar.c);
                        } else if (uvp0Var instanceof fkn) {
                            fkn fknVar = (fkn) uvp0Var;
                            a0Var = new SearchDataItemDto$EddystoneSearchDataDto(fknVar.a, fknVar.b);
                        } else {
                            if (!jl40.l(uvp0Var, p421.a)) {
                                w511.b();
                                return null;
                            }
                            a0Var = y.INSTANCE;
                        }
                        arrayList2.add(a0Var);
                    }
                    SearchRequestDto searchRequestDto = new SearchRequestDto(arrayList2);
                    masstransitClientApi$searchFull$1.L$0 = null;
                    masstransitClientApi$searchFull$1.L$1 = null;
                    masstransitClientApi$searchFull$1.L$2 = null;
                    masstransitClientApi$searchFull$1.L$3 = null;
                    masstransitClientApi$searchFull$1.label = 1;
                    obj2 = this.a.j(str, searchRequestDto, masstransitClientApi$searchFull$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                jo2 jo2Var = (jo2) obj2;
                obj = jo2Var.a;
                if (!(obj instanceof Result.Failure)) {
                    try {
                        List<SearchResultItemDto> list = ((SearchResponseDto) obj).a;
                        m2c m2cVar = this.b;
                        ArrayList arrayList3 = new ArrayList(tcc.n(list, 10));
                        for (SearchResultItemDto searchResultItemDto : list) {
                            m2cVar.getClass();
                            arrayList3.add(m2c.c(searchResultItemDto));
                        }
                        obj = new fwp0(arrayList3);
                    } catch (Throwable th) {
                        obj = new Result.Failure(th);
                    }
                }
                return new jo2(obj, jo2Var.b);
            }
        }
        masstransitClientApi$searchFull$1 = new MasstransitClientApi$searchFull$1(this, continuationImpl);
        Object obj22 = masstransitClientApi$searchFull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitClientApi$searchFull$1.label;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj22;
        obj = jo2Var2.a;
        if (!(obj instanceof Result.Failure)) {
        }
        return new jo2(obj, jo2Var2.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, List list, ContinuationImpl continuationImpl) {
        MasstransitClientApi$updateTrip$1 masstransitClientApi$updateTrip$1;
        int i;
        CommandDto commandDto;
        Object obj;
        if (continuationImpl instanceof MasstransitClientApi$updateTrip$1) {
            masstransitClientApi$updateTrip$1 = (MasstransitClientApi$updateTrip$1) continuationImpl;
            int i2 = masstransitClientApi$updateTrip$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                masstransitClientApi$updateTrip$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = masstransitClientApi$updateTrip$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = masstransitClientApi$updateTrip$1.label;
                boolean z = true;
                if (i != 0) {
                    b.b(obj2);
                    List<blc> list2 = list;
                    ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                    for (blc blcVar : list2) {
                        this.c.getClass();
                        if (blcVar instanceof hlc) {
                            hlc hlcVar = (hlc) blcVar;
                            commandDto = new CommandDto(hlcVar.a, new vlc(Boolean.valueOf(hlcVar.b)));
                        } else if (blcVar instanceof qlc) {
                            qlc qlcVar = (qlc) blcVar;
                            commandDto = new CommandDto(qlcVar.a, new vlc(Integer.valueOf(qlcVar.b)));
                        } else if (blcVar instanceof tlc) {
                            tlc tlcVar = (tlc) blcVar;
                            commandDto = new CommandDto(tlcVar.a, new vlc(tlcVar.b));
                        } else {
                            if (!(blcVar instanceof rlc)) {
                                w511.b();
                                return null;
                            }
                            rlc rlcVar = (rlc) blcVar;
                            String str2 = rlcVar.a;
                            g4a0 g4a0Var = rlcVar.b;
                            commandDto = new CommandDto(str2, new ulc(new PaymentMethodDto(g4a0Var.a, g4a0Var.b)));
                        }
                        arrayList.add(commandDto);
                    }
                    TripUpdateRequestDto tripUpdateRequestDto = new TripUpdateRequestDto(arrayList);
                    masstransitClientApi$updateTrip$1.L$0 = null;
                    masstransitClientApi$updateTrip$1.L$1 = null;
                    masstransitClientApi$updateTrip$1.L$2 = null;
                    masstransitClientApi$updateTrip$1.L$3 = null;
                    masstransitClientApi$updateTrip$1.label = 1;
                    obj2 = this.a.k(str, tripUpdateRequestDto, masstransitClientApi$updateTrip$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                jo2 jo2Var = (jo2) obj2;
                obj = jo2Var.a;
                if (!(obj instanceof Result.Failure)) {
                    try {
                        Pair pair = (Pair) obj;
                        int intValue = ((Number) pair.getFirst()).intValue();
                        CheckoutScreenStateDto checkoutScreenStateDto = (CheckoutScreenStateDto) pair.getSecond();
                        this.b.getClass();
                        afp0 a = m2c.a(checkoutScreenStateDto);
                        if (intValue != 206) {
                            z = false;
                        }
                        obj = new mf11(a, z);
                    } catch (Throwable th) {
                        obj = new Result.Failure(th);
                    }
                }
                return new jo2(obj, jo2Var.b);
            }
        }
        masstransitClientApi$updateTrip$1 = new MasstransitClientApi$updateTrip$1(this, continuationImpl);
        Object obj22 = masstransitClientApi$updateTrip$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = masstransitClientApi$updateTrip$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        jo2 jo2Var2 = (jo2) obj22;
        obj = jo2Var2.a;
        if (!(obj instanceof Result.Failure)) {
        }
        return new jo2(obj, jo2Var2.b);
    }
}
