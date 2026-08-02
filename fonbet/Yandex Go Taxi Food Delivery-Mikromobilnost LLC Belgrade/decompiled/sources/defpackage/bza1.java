package defpackage;

import androidx.camera.core.impl.SurfaceConfig$ConfigSize;
import androidx.camera.core.impl.SurfaceConfig$ConfigType;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public abstract class bza1 {
    public static ArrayList a(SurfaceConfig$ConfigSize surfaceConfig$ConfigSize, SurfaceConfig$ConfigSize surfaceConfig$ConfigSize2) {
        ArrayList arrayList = new ArrayList();
        SurfaceConfig$ConfigType surfaceConfig$ConfigType = SurfaceConfig$ConfigType.PRIV;
        arrayList.add(new ymw0(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize), anw0.a(SurfaceConfig$ConfigType.JPEG, surfaceConfig$ConfigSize2)));
        arrayList.add(new ymw0(anw0.a(surfaceConfig$ConfigType, surfaceConfig$ConfigSize), anw0.a(SurfaceConfig$ConfigType.JPEG_R, surfaceConfig$ConfigSize2)));
        return arrayList;
    }

    public static final ArrayList b(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (evu0.y(((ohm0) obj).a.c, str, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ety0 c(ety0 ety0Var, fwi fwiVar) {
        long j = ety0Var.a.b;
        tty0[] tty0VarArr = sty0.b;
        if ((j & 1095216660480L) == 4294967296L) {
            j = fwiVar.n(fwiVar.w0(sty0.c(j)));
        }
        long j2 = ety0Var.b.c;
        if ((1095216660480L & j2) == 4294967296L) {
            j2 = fwiVar.n(fwiVar.w0(sty0.c(j2)));
        }
        return ety0.a(ety0Var, 0L, j, null, null, null, 0L, null, null, null, 0, j2, null, null, 16646141);
    }

    public static String d(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(e(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(e(objArr[i]));
                i++;
                str2 = Extension.FIX_SPACE;
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String e(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String r = unr0.r(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(r), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb = new StringBuilder(r.length() + 8 + name2.length() + 1);
            g8e.D(sb, "<", r, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }
}
