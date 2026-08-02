package com.yandex.go.logistics.cargo_flow.form;

import defpackage.nwh;
import defpackage.ny61;
import defpackage.qa41;
import defpackage.ra41;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.n;

/* loaded from: classes5.dex */
public final class a {
    public final /* synthetic */ nwh a;

    public a(nwh nwhVar) {
        this.a = nwhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        CargoFormViewHolder$screenEngine$2$1$wrapAuthData$1 cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1;
        int i;
        try {
            if (continuation instanceof CargoFormViewHolder$screenEngine$2$1$wrapAuthData$1) {
                cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1 = (CargoFormViewHolder$screenEngine$2$1$wrapAuthData$1) continuation;
                int i2 = cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1.label;
                    if (i != 0) {
                        b.b(obj);
                        nwh nwhVar = this.a;
                        cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1.L$0 = null;
                        cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1.label = 1;
                        obj = n.a(nwhVar.c, str, cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return new qa41((String) obj);
                }
            }
            if (i != 0) {
            }
            return new qa41((String) obj);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            return new ra41(message);
        }
        cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1 = new CargoFormViewHolder$screenEngine$2$1$wrapAuthData$1(this, (ContinuationImpl) continuation);
        Object obj2 = cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cargoFormViewHolder$screenEngine$2$1$wrapAuthData$1.label;
    }
}
