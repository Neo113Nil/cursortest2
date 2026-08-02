package com.yandex.go.payments.di;

import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.api.exception.PassportIOException;
import defpackage.ny61;
import defpackage.to90;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes13.dex */
public final class a {
    public final /* synthetic */ ru.yandex.taxi.am.token.a a;
    public final /* synthetic */ h b;
    public final /* synthetic */ to90 c;

    public a(ru.yandex.taxi.am.token.a aVar, h hVar, to90 to90Var) {
        this.a = aVar;
        this.b = hVar;
        this.c = to90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d A[Catch: PassportIOException -> 0x002e, PassportException -> 0x0030, TRY_LEAVE, TryCatch #2 {PassportException -> 0x0030, PassportIOException -> 0x002e, blocks: (B:10:0x0024, B:11:0x0046, B:15:0x004d, B:20:0x003b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        PaymentCardModule$Companion$authProvider$1$authToken$1 paymentCardModule$Companion$authProvider$1$authToken$1;
        int i;
        Object d;
        Throwable a;
        try {
            if (continuationImpl instanceof PaymentCardModule$Companion$authProvider$1$authToken$1) {
                paymentCardModule$Companion$authProvider$1$authToken$1 = (PaymentCardModule$Companion$authProvider$1$authToken$1) continuationImpl;
                int i2 = paymentCardModule$Companion$authProvider$1$authToken$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    paymentCardModule$Companion$authProvider$1$authToken$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = paymentCardModule$Companion$authProvider$1$authToken$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = paymentCardModule$Companion$authProvider$1$authToken$1.label;
                    if (i != 0) {
                        b.b(obj);
                        ru.yandex.taxi.am.token.a aVar = this.a;
                        paymentCardModule$Companion$authProvider$1$authToken$1.label = 1;
                        d = aVar.d(false, paymentCardModule$Companion$authProvider$1$authToken$1);
                        if (d == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                        d = ((Result) obj).getValue();
                    }
                    a = Result.a(d);
                    if (a != null) {
                        return d;
                    }
                    throw a;
                }
            }
            if (i != 0) {
            }
            a = Result.a(d);
            if (a != null) {
            }
        } catch (PassportException e) {
            ny61.j(e);
            return null;
        } catch (PassportIOException e2) {
            ny61.j(e2);
            return null;
        }
        paymentCardModule$Companion$authProvider$1$authToken$1 = new PaymentCardModule$Companion$authProvider$1$authToken$1(this, continuationImpl);
        Object obj2 = paymentCardModule$Companion$authProvider$1$authToken$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentCardModule$Companion$authProvider$1$authToken$1.label;
    }
}
