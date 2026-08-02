package defpackage;

import androidx.compose.runtime.internal.a;
import com.google.android.gms.internal.measurement.zzlh;
import com.yandex.messaging.internal.avatar.b;
import com.ybsdk.core.utils.dto.common.FailDataException;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.ButtonComponent;

/* loaded from: classes11.dex */
public abstract class dya1 {
    public static final void a(tb61 tb61Var, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(844181712);
        int i2 = (btsVar.k(tb61Var) ? 4 : 2) | i;
        if ((i2 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            ub61.a.a(tb61Var, aVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(tb61Var, aVar, i, 14);
        }
    }

    public static final void b(ButtonComponent buttonComponent) {
        if (buttonComponent.getVisibility() == 0) {
            buttonComponent.setEnabled(false);
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
            buttonComponent.setButtonBackground(new bdc(xng0.controlMinor));
            buttonComponent.setText(kyh0.navigator_map_interaction_wait_button_title);
            buttonComponent.startProgress();
        }
    }

    public static final void c(ButtonComponent buttonComponent, bdc bdcVar, bdc bdcVar2, int i) {
        if (buttonComponent.getVisibility() == 0) {
            buttonComponent.setEnabled(true);
            buttonComponent.setButtonTitleColor(bdcVar);
            buttonComponent.setButtonBackground(bdcVar2);
            buttonComponent.setText(i);
            buttonComponent.finishProgress();
        }
    }

    public static final pa90 d(Object obj, wls wlsVar, wls wlsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(2081755743);
        ub61 ub61Var = ub61.a;
        btsVar.e0(72171141);
        tb61 tb61Var = (tb61) btsVar.m(ub61.c);
        btsVar.t(false);
        pa90 a = ((b) tb61Var).a(obj, wlsVar, wlsVar2, btsVar, i & 1022);
        btsVar.t(false);
        return a;
    }

    public static String e(s4m0 s4m0Var) {
        if (s4m0Var instanceof q4m0) {
            return ((q4m0) s4m0Var).b;
        }
        if (s4m0Var instanceof r4m0) {
            return ((r4m0) s4m0Var).b;
        }
        if (s4m0Var instanceof o4m0) {
            Throwable th = ((o4m0) s4m0Var).a;
            FailDataException failDataException = th instanceof FailDataException ? (FailDataException) th : null;
            if (failDataException != null) {
                return failDataException.getDescription();
            }
        }
        return null;
    }

    public static String f(s4m0 s4m0Var) {
        if (s4m0Var instanceof q4m0) {
            return ((q4m0) s4m0Var).a;
        }
        if (s4m0Var instanceof r4m0) {
            return ((r4m0) s4m0Var).a;
        }
        return null;
    }

    public static String g(zzlh zzlhVar) {
        StringBuilder sb = new StringBuilder(zzlhVar.f());
        for (int i = 0; i < zzlhVar.f(); i++) {
            byte a = zzlhVar.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append(CSPStore.UNIQUE_SEPARATOR);
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
