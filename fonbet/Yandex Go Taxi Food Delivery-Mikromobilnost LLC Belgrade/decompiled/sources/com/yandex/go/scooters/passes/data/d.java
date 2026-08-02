package com.yandex.go.scooters.passes.data;

import com.yandex.go.scooters.passes.exception.ScootersPassActionException;
import com.yandex.go.scooters.passes.model.PassPayment;
import defpackage.aeo0;
import defpackage.jx81;
import defpackage.mk90;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tls;
import defpackage.w511;
import defpackage.wl90;
import defpackage.wnt;
import defpackage.xnt;
import defpackage.yfo0;
import defpackage.zl90;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.network.api.models.GoApiHttpException;

/* loaded from: classes13.dex */
public final class d implements yfo0 {
    public final wnt a;
    public final ScootersPassesApi b;
    public final ru.yandex.taxi.widget.c c;
    public final ru.yandex.taxi.scooters.data.a d;

    public d(wnt wntVar, ScootersPassesApi scootersPassesApi, ru.yandex.taxi.widget.c cVar, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = wntVar;
        this.b = scootersPassesApi;
        this.c = cVar;
        this.d = aVar;
    }

    public static ScootersPassActionException b(ScootersPassesRepositoryImpl$RequestType scootersPassesRepositoryImpl$RequestType, String str, String str2, String str3) {
        int i = c.a[scootersPassesRepositoryImpl$RequestType.ordinal()];
        if (i == 1) {
            return new ScootersPassActionException.ScootersPassPurchaseFailedException(str, str2, str3);
        }
        if (i == 2) {
            return new ScootersPassActionException.ScootersPassActionFailedException(str, str2, str3);
        }
        w511.b();
        return null;
    }

    public final Object a(SuspendLambda suspendLambda) {
        Object d = d(ScootersPassesRepositoryImpl$RequestType.STATE_CHANGE, new ScootersPassesRepositoryImpl$applyWinback$2(this, null), suspendLambda);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }

    public final Object c(String str, SuspendLambda suspendLambda) {
        Object d = d(ScootersPassesRepositoryImpl$RequestType.STATE_CHANGE, new ScootersPassesRepositoryImpl$freeze$2(this, str, null), suspendLambda);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ScootersPassesRepositoryImpl$RequestType scootersPassesRepositoryImpl$RequestType, tls tlsVar, ContinuationImpl continuationImpl) {
        ScootersPassesRepositoryImpl$makePassRequest$1 scootersPassesRepositoryImpl$makePassRequest$1;
        int i;
        boolean z;
        try {
            if (continuationImpl instanceof ScootersPassesRepositoryImpl$makePassRequest$1) {
                scootersPassesRepositoryImpl$makePassRequest$1 = (ScootersPassesRepositoryImpl$makePassRequest$1) continuationImpl;
                int i2 = scootersPassesRepositoryImpl$makePassRequest$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersPassesRepositoryImpl$makePassRequest$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersPassesRepositoryImpl$makePassRequest$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersPassesRepositoryImpl$makePassRequest$1.label;
                    z = true;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        scootersPassesRepositoryImpl$makePassRequest$1.L$0 = scootersPassesRepositoryImpl$RequestType;
                        scootersPassesRepositoryImpl$makePassRequest$1.L$1 = null;
                        scootersPassesRepositoryImpl$makePassRequest$1.label = 1;
                        Object invoke = tlsVar.invoke(scootersPassesRepositoryImpl$makePassRequest$1);
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
                throw e(scootersPassesRepositoryImpl$RequestType, s8o.N(th));
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
                        throw new ScootersPassActionException.ScootersPassAlreadyInPurchasingStateException(((mk90) ((xnt) this.a).b(N, mk90.Companion.serializer())).a);
                    }
                    throw b(scootersPassesRepositoryImpl$RequestType, null, null, null);
                }
            }
            if (x) {
                throw e(scootersPassesRepositoryImpl$RequestType, s8o.N(th));
            }
            throw b(scootersPassesRepositoryImpl$RequestType, null, null, null);
        }
        scootersPassesRepositoryImpl$makePassRequest$1 = new ScootersPassesRepositoryImpl$makePassRequest$1(this, continuationImpl);
        Object obj3 = scootersPassesRepositoryImpl$makePassRequest$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPassesRepositoryImpl$makePassRequest$1.label;
        z = true;
    }

    public final ScootersPassActionException e(ScootersPassesRepositoryImpl$RequestType scootersPassesRepositoryImpl$RequestType, BufferedInputStream bufferedInputStream) {
        if (bufferedInputStream == null) {
            return b(scootersPassesRepositoryImpl$RequestType, null, null, null);
        }
        int i = c.a[scootersPassesRepositoryImpl$RequestType.ordinal()];
        wnt wntVar = this.a;
        if (i == 1) {
            zl90 zl90Var = (zl90) ((xnt) wntVar).b(bufferedInputStream, zl90.Companion.serializer());
            if (zl90Var == null) {
                return b(scootersPassesRepositoryImpl$RequestType, null, null, null);
            }
            wl90 wl90Var = zl90Var.a;
            return b(scootersPassesRepositoryImpl$RequestType, wl90Var != null ? wl90Var.a : null, wl90Var != null ? wl90Var.b : null, wl90Var != null ? wl90Var.c : null);
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        aeo0 aeo0Var = (aeo0) ((xnt) wntVar).b(bufferedInputStream, aeo0.Companion.serializer());
        if (aeo0Var == null) {
            return b(scootersPassesRepositoryImpl$RequestType, null, null, null);
        }
        FormattedText formattedText = aeo0Var.b;
        ru.yandex.taxi.widget.c cVar = this.c;
        String obj = formattedText != null ? ru.yandex.taxi.widget.c.f(cVar, formattedText, false, null, 14).toString() : null;
        FormattedText formattedText2 = aeo0Var.c;
        return b(scootersPassesRepositoryImpl$RequestType, obj, formattedText2 != null ? ru.yandex.taxi.widget.c.f(cVar, formattedText2, false, null, 14).toString() : null, aeo0Var.a);
    }

    public final Object f(String str, SuspendLambda suspendLambda) {
        Object d = d(ScootersPassesRepositoryImpl$RequestType.STATE_CHANGE, new ScootersPassesRepositoryImpl$unfreeze$2(this, str, null), suspendLambda);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }

    public final Object g(String str, boolean z, PassPayment passPayment, SuspendLambda suspendLambda) {
        Object d = d(ScootersPassesRepositoryImpl$RequestType.STATE_CHANGE, new ScootersPassesRepositoryImpl$updateAutorenew$2(this, str, z, passPayment, null), suspendLambda);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : zy11.a;
    }
}
