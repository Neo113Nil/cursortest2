package defpackage;

import com.yandex.go.due_timetable.domain.model.CalculationsStatus;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction;
import com.yandex.go.order.state.instructions.ScheduledOrderItemActionType;
import java.util.Calendar;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes12.dex */
public final class j0n {
    public final dqe0 a;
    public final nf7 b;

    public j0n(dqe0 dqe0Var, nf7 nf7Var) {
        this.a = dqe0Var;
        this.b = nf7Var;
    }

    public static cus0 a(mp60 mp60Var, long j, cus0 cus0Var) {
        int i = (int) (j >> 32);
        boolean z = false;
        if (mp60Var.b - 1 >= i) {
            xy40 xy40Var = ((rsg) mp60Var.b(i)).c;
            int i2 = xy40Var.b - 1;
            int i3 = (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j);
            if (i2 >= i3) {
                z = !(((e8z0) xy40Var.b(i3)) instanceof d8z0);
            }
        }
        return z ? new cus0(j) : cus0Var;
    }

    public static bus0 b(hz40 hz40Var, String str, CalculationsStatus calculationsStatus) {
        te7 te7Var = (te7) hz40Var.d(str);
        if (te7Var == null) {
            if (calculationsStatus == CalculationsStatus.FINISHED) {
                return yts0.a;
            }
            return null;
        }
        String str2 = te7Var.a;
        Double d = te7Var.c;
        double doubleValue = d != null ? d.doubleValue() : 0.0d;
        String str3 = te7Var.d;
        if (str3 == null) {
            str3 = "";
        }
        return new zts0(str2, doubleValue, str3, te7Var.e, te7Var.f, te7Var.h);
    }

    public static long c(mp60 mp60Var, Calendar calendar) {
        h0n h0nVar;
        Object[] objArr = mp60Var.a;
        int i = mp60Var.b;
        int i2 = 0;
        int i3 = 0;
        long j = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        for (int i4 = 0; i4 < i; i4++) {
            xy40 xy40Var = ((rsg) objArr[i4]).c;
            Object[] objArr2 = xy40Var.a;
            int i5 = xy40Var.b;
            long j2 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                if (i6 >= i5) {
                    h0nVar = new h0n(false, i7, j2);
                    break;
                }
                e8z0 e8z0Var = (e8z0) objArr2[i6];
                if (e8z0Var instanceof b8z0) {
                    long abs = Math.abs(calendar.getTimeInMillis() - ((b8z0) e8z0Var).b.getTimeInMillis());
                    if (abs < j2) {
                        i7 = i6;
                        j2 = abs;
                    }
                } else if (e8z0Var instanceof d8z0) {
                    d8z0 d8z0Var = (d8z0) e8z0Var;
                    if (calendar.compareTo(d8z0Var.a) > 0 && calendar.compareTo(d8z0Var.b) < 0) {
                        h0nVar = new h0n(false, i6, 0L);
                        break;
                    }
                }
                i6++;
            }
            long j3 = h0nVar.b;
            if (j3 < j) {
                i3 = h0nVar.a;
                j = j3;
                i2 = i4;
            }
        }
        return s5w.a(i2, i3);
    }

    public static xy40 d(mp60 mp60Var) {
        xy40 xy40Var = new xy40(mp60Var.b);
        Object[] objArr = mp60Var.a;
        int i = mp60Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            x3w x3wVar = (x3w) objArr[i2];
            ScheduledOrderItemAction f = x3wVar.getF();
            tnf0 tnf0Var = null;
            if ((f != null ? f.a : null) == ScheduledOrderItemActionType.SELECT_TIME_SLOT) {
                ScheduledOrderItemAction f2 = x3wVar.getF();
                Calendar calendar = f2 != null ? f2.b : null;
                if (calendar == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                tnf0Var = new tnf0(new unf0(calendar), false);
            }
            xy40Var.g(new ynf0(x3wVar.getC(), x3wVar.getA(), x3wVar.getB(), tnf0Var));
        }
        return xy40Var;
    }
}
