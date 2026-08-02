package com.yandex.go.scooters.data;

import com.yandex.go.scooters.domain.model.ScootersPassesListException;
import com.yandex.go.scooters.passes.data.ScootersPassesListApi;
import defpackage.cm90;
import defpackage.cmt;
import defpackage.fef;
import defpackage.fm90;
import defpackage.gwk0;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.sco0;
import defpackage.tl90;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.data.model.ScootersCard;
import ru.yandex.taxi.scooters.data.model.ScootersPassesListServiceDto;

/* loaded from: classes13.dex */
public final class g {
    public final com.yandex.go.scooters.data.mapper.d a;
    public final ScootersPassesListApi b;
    public final ru.yandex.taxi.scooters.data.a c;

    public g(com.yandex.go.scooters.data.mapper.d dVar, ScootersPassesListApi scootersPassesListApi, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = dVar;
        this.b = scootersPassesListApi;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b A[Catch: all -> 0x0037, CancellationException -> 0x00a1, TryCatch #2 {CancellationException -> 0x00a1, all -> 0x0037, blocks: (B:12:0x0033, B:13:0x0073, B:17:0x0078, B:18:0x007f, B:22:0x0043, B:23:0x0055, B:25:0x005b, B:28:0x0080, B:29:0x0087, B:31:0x004a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080 A[Catch: all -> 0x0037, CancellationException -> 0x00a1, TryCatch #2 {CancellationException -> 0x00a1, all -> 0x0037, blocks: (B:12:0x0033, B:13:0x0073, B:17:0x0078, B:18:0x007f, B:22:0x0043, B:23:0x0055, B:25:0x005b, B:28:0x0080, B:29:0x0087, B:31:0x004a), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersPassesListServiceDto scootersPassesListServiceDto, ContinuationImpl continuationImpl) {
        ScootersPassesListRepository$getScootersPasses$1 scootersPassesListRepository$getScootersPasses$1;
        int i;
        tl90 tl90Var;
        try {
            if (continuationImpl instanceof ScootersPassesListRepository$getScootersPasses$1) {
                scootersPassesListRepository$getScootersPasses$1 = (ScootersPassesListRepository$getScootersPasses$1) continuationImpl;
                int i2 = scootersPassesListRepository$getScootersPasses$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPassesListRepository$getScootersPasses$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPassesListRepository$getScootersPasses$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPassesListRepository$getScootersPasses$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersPassesListRepository$getScootersPasses$1.L$0 = null;
                        scootersPassesListRepository$getScootersPasses$1.label = 1;
                        obj = b(scootersPassesListServiceDto, scootersPassesListRepository$getScootersPasses$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            sco0 sco0Var = (sco0) obj;
                            if (sco0Var != null) {
                                return sco0Var;
                            }
                            throw new IllegalStateException("Error mapping passes from the response");
                        }
                        kotlin.b.b(obj);
                    }
                    fm90 fm90Var = (fm90) obj;
                    tl90Var = fm90Var.a;
                    if (tl90Var != null) {
                        throw new IllegalStateException("Response body doesn't contain passes");
                    }
                    com.yandex.go.scooters.data.mapper.d dVar = this.a;
                    fef h = gwk0.h(fm90Var.b);
                    scootersPassesListRepository$getScootersPasses$1.L$0 = null;
                    scootersPassesListRepository$getScootersPasses$1.L$1 = null;
                    scootersPassesListRepository$getScootersPasses$1.L$2 = null;
                    scootersPassesListRepository$getScootersPasses$1.label = 2;
                    obj = dVar.e(h, tl90Var, false, scootersPassesListRepository$getScootersPasses$1);
                }
            }
            if (i != 0) {
            }
            fm90 fm90Var2 = (fm90) obj;
            tl90Var = fm90Var2.a;
            if (tl90Var != null) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            if (s8o.x(th) && s8o.C(th)) {
                throw new ScootersPassesListException.ScootersPassesNotFoundException();
            }
            throw new ScootersPassesListException.ScootersPassesListFailedException(1, th);
        }
        scootersPassesListRepository$getScootersPasses$1 = new ScootersPassesListRepository$getScootersPasses$1(this, continuationImpl);
        Object obj3 = scootersPassesListRepository$getScootersPasses$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesListRepository$getScootersPasses$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ScootersPassesListServiceDto scootersPassesListServiceDto, ContinuationImpl continuationImpl) {
        ScootersPassesListRepository$getScootersPassesResponse$1 scootersPassesListRepository$getScootersPassesResponse$1;
        int i;
        ScootersPassesListApi scootersPassesListApi;
        if (continuationImpl instanceof ScootersPassesListRepository$getScootersPassesResponse$1) {
            scootersPassesListRepository$getScootersPassesResponse$1 = (ScootersPassesListRepository$getScootersPassesResponse$1) continuationImpl;
            int i2 = scootersPassesListRepository$getScootersPassesResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPassesListRepository$getScootersPassesResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPassesListRepository$getScootersPassesResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPassesListRepository$getScootersPassesResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersPassesListRepository$getScootersPassesResponse$1.L$0 = scootersPassesListServiceDto;
                    ScootersPassesListApi scootersPassesListApi2 = this.b;
                    scootersPassesListRepository$getScootersPassesResponse$1.L$1 = scootersPassesListApi2;
                    scootersPassesListRepository$getScootersPassesResponse$1.label = 1;
                    Object a = this.c.a(false, scootersPassesListRepository$getScootersPassesResponse$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        scootersPassesListApi = scootersPassesListApi2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                scootersPassesListApi = (ScootersPassesListApi) scootersPassesListRepository$getScootersPassesResponse$1.L$1;
                scootersPassesListServiceDto = (ScootersPassesListServiceDto) scootersPassesListRepository$getScootersPassesResponse$1.L$0;
                kotlin.b.b(obj);
                cmt<fm90> a2 = scootersPassesListApi.a((Map) obj, new cm90(ScootersCard.V2, scootersPassesListServiceDto));
                scootersPassesListRepository$getScootersPassesResponse$1.L$0 = null;
                scootersPassesListRepository$getScootersPassesResponse$1.L$1 = null;
                scootersPassesListRepository$getScootersPassesResponse$1.label = 2;
                Object a3 = ru.yandex.taxi.network.api.a.a(a2, null, scootersPassesListRepository$getScootersPassesResponse$1);
                return a3 != coroutineSingletons ? coroutineSingletons : a3;
            }
        }
        scootersPassesListRepository$getScootersPassesResponse$1 = new ScootersPassesListRepository$getScootersPassesResponse$1(this, continuationImpl);
        Object obj2 = scootersPassesListRepository$getScootersPassesResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesListRepository$getScootersPassesResponse$1.label;
        if (i != 0) {
        }
        cmt<fm90> a22 = scootersPassesListApi.a((Map) obj2, new cm90(ScootersCard.V2, scootersPassesListServiceDto));
        scootersPassesListRepository$getScootersPassesResponse$1.L$0 = null;
        scootersPassesListRepository$getScootersPassesResponse$1.L$1 = null;
        scootersPassesListRepository$getScootersPassesResponse$1.label = 2;
        Object a32 = ru.yandex.taxi.network.api.a.a(a22, null, scootersPassesListRepository$getScootersPassesResponse$1);
        if (a32 != coroutineSingletons2) {
        }
    }
}
