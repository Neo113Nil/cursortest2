package defpackage;

import androidx.datastore.core.l;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.datetime.format.Padding;
import kotlinx.datetime.format.d;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes.dex */
public final /* synthetic */ class dsg implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ dsg(bys bysVar) {
        this.a = 25;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jrg jrgVar = esg.a;
                return zy11.a;
            case 1:
                irg irgVar = (irg) obj;
                ooc.f(irgVar, ':');
                mrg.l(irgVar);
                return zy11.a;
            case 2:
                ((irg) obj).b("UT");
                return zy11.a;
            case 3:
                ((irg) obj).b("Z");
                return zy11.a;
            case 4:
                ooc.v((irg) obj, "GMT", new qu(27));
                return zy11.a;
            case 5:
                irg irgVar2 = (irg) obj;
                d dVar = d.b;
                irgVar2.getClass();
                irgVar2.e(new xd5(new ksg(dVar)));
                ooc.b(irgVar2, new tls[]{new qu(28)}, new qu(29));
                return zy11.a;
            case 6:
                ooc.f((irg) obj, LicenseUtility.SEPARATOR);
                return zy11.a;
            case 7:
                ooc.f((irg) obj, HexString.CHAR_SPACE);
                return zy11.a;
            case 8:
                irg irgVar3 = (irg) obj;
                Padding padding = Padding.NONE;
                irgVar3.getClass();
                irgVar3.a(new xd5(new c730(padding)));
                return zy11.a;
            case 9:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.g = true;
                return zy11.a;
            case 10:
                return kp50.i();
            case 11:
                return ((mu) obj).a;
            case 12:
                return ((mu) obj).b;
            case 13:
                return kp50.i();
            case 14:
                return Boolean.valueOf(!(((wzl) obj) instanceof uzl));
            case 15:
                return Boolean.valueOf(!(((wzl) obj) instanceof uzl));
            case 16:
                return oyr.p("[", ((srp0) obj).a(), "]");
            case 17:
                return new LinkedHashSet();
            case 18:
                return ((ren) obj).n().getId();
            case 19:
                ((File) obj).getCanonicalFile().getAbsolutePath();
                return new l();
            case 20:
                return xw91.F;
            case 21:
                return Boolean.FALSE;
            case 22:
                return new ConcurrentHashMap();
            case 23:
                return kp50.i();
            case 24:
                return zy11.a;
            case 25:
                return bys.r(obj);
            case 26:
                return ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
            case 27:
                synchronized (q2t0.c) {
                    List list = q2t0.i;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((tls) list.get(i)).invoke(obj);
                    }
                }
                return zy11.a;
            case 28:
                le00 le00Var = new le00(got.a, qoi0.e(got.class));
                wy40 wy40Var = ((fe00) obj).a;
                int i2 = wy40Var.b + 1;
                Object[] objArr = wy40Var.a;
                if (objArr.length < i2) {
                    int length = objArr.length;
                    Object[] objArr2 = new Object[Math.max(i2, (length * 3) / 2)];
                    System.arraycopy(objArr, 0, objArr2, 0, length);
                    wy40Var.a = objArr2;
                }
                Object[] objArr3 = wy40Var.a;
                int i3 = wy40Var.b;
                objArr3[i3] = le00Var;
                wy40Var.b = i3 + 1;
                return zy11.a;
            default:
                return (lm00) ((Map.Entry) obj).getValue();
        }
    }

    public /* synthetic */ dsg(int i) {
        this.a = i;
    }
}
