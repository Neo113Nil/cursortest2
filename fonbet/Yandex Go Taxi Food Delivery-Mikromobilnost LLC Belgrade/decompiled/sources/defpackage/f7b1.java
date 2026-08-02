package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.payment.sdk.BindingServiceError;
import com.yandex.xplat.payment.sdk.ExternalErrorKind;
import com.yandex.xplat.payment.sdk.ExternalErrorTrigger;

/* loaded from: classes11.dex */
public abstract class f7b1 {
    public static final void a(f530 f530Var, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1148336198);
        int i2 = 2;
        int i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 k = an91.k(ljs0.e(ljs0.c(f530Var, 1.0f), 56.0f), 4.0f);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new v9q0();
                btsVar.o0(Q);
            }
            aVar.invoke((v9q0) Q, btsVar, 54);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zsm(f530Var, aVar, i, i2);
        }
    }

    public static BindingServiceError b(zeb zebVar, RuntimeException runtimeException) {
        String message = runtimeException instanceof YSError ? ((YSError) runtimeException).getMessage() : String.valueOf(runtimeException);
        ExternalErrorKind externalErrorKind = ExternalErrorKind.fail_3ds;
        ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.internal_sdk;
        String str = zebVar.a;
        String str2 = zebVar.c;
        if (str2 == null) {
            str2 = "null";
        }
        return new BindingServiceError(externalErrorKind, externalErrorTrigger, null, str, unr0.p("Failed to handle 3ds challenge for response: ", unr0.p("<DiehardResponse: status - ", str, ", desc - ", str2, ">"), ", error: \"", message, "\""));
    }

    public static BindingServiceError c(zeb zebVar) {
        ExternalErrorKind externalErrorKind = ExternalErrorKind.fail_3ds;
        ExternalErrorTrigger externalErrorTrigger = ExternalErrorTrigger.diehard;
        String str = zebVar.a;
        String str2 = zebVar.g;
        String str3 = zebVar.c;
        if (str3 == null) {
            str3 = "null";
        }
        return new BindingServiceError(externalErrorKind, externalErrorTrigger, null, str, b64.l("Invalid redirectUrl \"", str2, "\" in response: ", unr0.p("<DiehardResponse: status - ", str, ", desc - ", str3, ">")));
    }

    public static final osy0 d(fid fidVar, int i) {
        long n = tje.n(tp2.a, fidVar);
        return new osy0(n, ldc.b(n, 0.2f, 0.0f, 0.0f, 0.0f, 14));
    }
}
