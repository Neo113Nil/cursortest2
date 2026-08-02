package defpackage;

import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.common.entities.SessionEntity$ActionReason;
import com.ybsdk.feature.pin.api.entities.ReissueActionType;
import com.ybsdk.rconfig.configs.PushSubscribeAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes3.dex */
public abstract class aab1 {
    public static final f530 a(float f, long j, f530 f530Var, ehr0 ehr0Var) {
        return b(f530Var, f, new a6t0(j), ehr0Var);
    }

    public static final f530 b(f530 f530Var, float f, ml6 ml6Var, ehr0 ehr0Var) {
        return f530Var.k(new ua6(f, ml6Var, ehr0Var));
    }

    public static final List c(Iterable iterable, tls tlsVar, tls tlsVar2) {
        return b.s(new yw01(b.g(new h73(1, iterable), tlsVar), tlsVar2));
    }

    public static final String d(SessionEntity$ActionReason sessionEntity$ActionReason) {
        int i = izq0.a[sessionEntity$ActionReason.ordinal()];
        if (i == 1) {
            return "PIN_TOKEN_REISSUE_TOO_MANY_FAILED_ATTEMPTS";
        }
        if (i == 2) {
            return "PIN_TOKEN_REISSUE_REGISTRATION";
        }
        w511.b();
        return null;
    }

    public static final boolean e(SessionEntity$Action sessionEntity$Action, List list) {
        SessionEntity$Action sessionEntity$Action2;
        List list2 = list;
        if (list2.isEmpty()) {
            return true;
        }
        List list3 = list2;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            switch (izq0.b[((PushSubscribeAction) it.next()).ordinal()]) {
                case 1:
                    sessionEntity$Action2 = SessionEntity$Action.NONE;
                    break;
                case 2:
                    sessionEntity$Action2 = SessionEntity$Action.AUTHORIZATION;
                    break;
                case 3:
                    sessionEntity$Action2 = SessionEntity$Action.PASSPORT_REGISTRATION;
                    break;
                case 4:
                    sessionEntity$Action2 = SessionEntity$Action.BANK_REGISTRATION;
                    break;
                case 5:
                    sessionEntity$Action2 = SessionEntity$Action.APPLICATION_STATUS_CHECK;
                    break;
                case 6:
                    sessionEntity$Action2 = SessionEntity$Action.SUPPORT;
                    break;
                case 7:
                    sessionEntity$Action2 = SessionEntity$Action.AM_TOKEN_UPDATE;
                    break;
                case 8:
                    sessionEntity$Action2 = SessionEntity$Action.APP_UPDATE;
                    break;
                case 9:
                    sessionEntity$Action2 = SessionEntity$Action.PIN_TOKEN_CLEAR;
                    break;
                case 10:
                    sessionEntity$Action2 = SessionEntity$Action.PIN_TOKEN_REISSUE;
                    break;
                case 11:
                    sessionEntity$Action2 = SessionEntity$Action.PIN_TOKEN_RETRY;
                    break;
                case 12:
                    sessionEntity$Action2 = SessionEntity$Action.OPEN_PRODUCT;
                    break;
                case 13:
                    sessionEntity$Action2 = SessionEntity$Action.OPEN_DEEPLINK;
                    break;
                default:
                    w511.b();
                    return false;
            }
            arrayList.add(sessionEntity$Action2);
        }
        return arrayList.contains(sessionEntity$Action);
    }

    public static final long f(float f, long j) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
    }

    public static final ReissueActionType g(SessionEntity$ActionReason sessionEntity$ActionReason) {
        int i = sessionEntity$ActionReason == null ? -1 : izq0.a[sessionEntity$ActionReason.ordinal()];
        if (i == -1) {
            return ReissueActionType.SETUP_PIN;
        }
        if (i == 1) {
            return ReissueActionType.TOO_MANY_ATTEMPTS;
        }
        if (i == 2) {
            return ReissueActionType.NONE;
        }
        w511.b();
        return null;
    }
}
