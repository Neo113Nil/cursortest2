package com.yandex.go.chargers.offer.passes.data;

import com.yandex.go.chargers.offer.passes.data.ChargersPassActionException;
import com.yandex.go.chargers.offer.passes.data.api.ChargersPassesApi;
import com.yandex.go.chargers.offer.passes.data.model.ChargersPassesErrorV2Response;
import com.yandex.go.chargers.offer.passes.data.model.PassPurchaseResponse;
import com.yandex.go.chargers.offer.passes.data.model.PassesErrorReason;
import com.yandex.go.chargers.offer.passes.data.model.PassesErrorResponse;
import defpackage.jx81;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tls;
import defpackage.w511;
import defpackage.wnt;
import defpackage.xnt;
import java.io.BufferedInputStream;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

/* loaded from: classes12.dex */
public final class f {
    public final wnt a;
    public final ChargersPassesApi b;
    public final ru.yandex.taxi.widget.c c;
    public final com.yandex.go.chargers.data.f d;

    public f(wnt wntVar, ChargersPassesApi chargersPassesApi, ru.yandex.taxi.widget.c cVar, com.yandex.go.chargers.data.f fVar) {
        this.a = wntVar;
        this.b = chargersPassesApi;
        this.c = cVar;
        this.d = fVar;
    }

    public static ChargersPassActionException a(ChargersPassesDataSource$RequestType chargersPassesDataSource$RequestType, String str, String str2) {
        int i = e.a[chargersPassesDataSource$RequestType.ordinal()];
        if (i == 1) {
            return new ChargersPassActionException.ChargersPassPurchaseFailedException(str, str2);
        }
        if (i == 2) {
            return new ChargersPassActionException.ChargersPassActionFailedException(str, str2);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ChargersPassesDataSource$RequestType chargersPassesDataSource$RequestType, tls tlsVar, ContinuationImpl continuationImpl) {
        ChargersPassesDataSource$makePassRequest$1 chargersPassesDataSource$makePassRequest$1;
        int i;
        boolean z;
        try {
            if (continuationImpl instanceof ChargersPassesDataSource$makePassRequest$1) {
                chargersPassesDataSource$makePassRequest$1 = (ChargersPassesDataSource$makePassRequest$1) continuationImpl;
                int i2 = chargersPassesDataSource$makePassRequest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersPassesDataSource$makePassRequest$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersPassesDataSource$makePassRequest$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersPassesDataSource$makePassRequest$1.label;
                    z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        chargersPassesDataSource$makePassRequest$1.L$0 = chargersPassesDataSource$RequestType;
                        chargersPassesDataSource$makePassRequest$1.L$1 = null;
                        chargersPassesDataSource$makePassRequest$1.label = 1;
                        Object invoke = tlsVar.invoke(chargersPassesDataSource$makePassRequest$1);
                        return invoke == obj2 ? obj2 : invoke;
                    }
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            boolean x = s8o.x(th);
            if (x && s8o.C(th)) {
                throw c(chargersPassesDataSource$RequestType, s8o.N(th));
            }
            if (x) {
                if (!(th instanceof GoApiHttpException)) {
                    z = jx81.A(409, th);
                } else if (th.getCode() != 409) {
                    z = false;
                }
                if (z) {
                    BufferedInputStream N = s8o.N(th);
                    if (N != null) {
                        throw new ChargersPassActionException.ChargersPassAlreadyInPurchasingStateException(((PassPurchaseResponse) ((xnt) this.a).b(N, PassPurchaseResponse.Companion.serializer())).a);
                    }
                    throw a(chargersPassesDataSource$RequestType, null, null);
                }
            }
            if (x) {
                throw c(chargersPassesDataSource$RequestType, s8o.N(th));
            }
            throw a(chargersPassesDataSource$RequestType, null, null);
        }
        chargersPassesDataSource$makePassRequest$1 = new ChargersPassesDataSource$makePassRequest$1(this, continuationImpl);
        Object obj3 = chargersPassesDataSource$makePassRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersPassesDataSource$makePassRequest$1.label;
        z = true;
    }

    public final ChargersPassActionException c(ChargersPassesDataSource$RequestType chargersPassesDataSource$RequestType, BufferedInputStream bufferedInputStream) {
        if (bufferedInputStream == null) {
            return a(chargersPassesDataSource$RequestType, null, null);
        }
        int i = e.a[chargersPassesDataSource$RequestType.ordinal()];
        wnt wntVar = this.a;
        if (i == 1) {
            PassesErrorReason passesErrorReason = ((PassesErrorResponse) ((xnt) wntVar).b(bufferedInputStream, PassesErrorResponse.Companion.serializer())).a;
            return a(chargersPassesDataSource$RequestType, passesErrorReason != null ? passesErrorReason.a : null, passesErrorReason != null ? passesErrorReason.b : null);
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        ChargersPassesErrorV2Response chargersPassesErrorV2Response = (ChargersPassesErrorV2Response) ((xnt) wntVar).b(bufferedInputStream, ChargersPassesErrorV2Response.Companion.serializer());
        FormattedText formattedText = chargersPassesErrorV2Response.b;
        ru.yandex.taxi.widget.c cVar = this.c;
        String obj = formattedText != null ? ru.yandex.taxi.widget.c.f(cVar, formattedText, false, null, 14).toString() : null;
        FormattedText formattedText2 = chargersPassesErrorV2Response.c;
        return a(chargersPassesDataSource$RequestType, obj, formattedText2 != null ? ru.yandex.taxi.widget.c.f(cVar, formattedText2, false, null, 14).toString() : null);
    }
}
