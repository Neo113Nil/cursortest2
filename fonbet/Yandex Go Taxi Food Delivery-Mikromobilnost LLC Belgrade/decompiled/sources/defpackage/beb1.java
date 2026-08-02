package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.ArrayList;
import java.util.Iterator;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui_models.form.slot.SlotLead$LeadIcon$IconStyle;

/* loaded from: classes11.dex */
public abstract class beb1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12, types: [f530] */
    public static final void a(fts0 fts0Var, fid fidVar, int i) {
        ?? l;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1552800253);
        int i2 = (btsVar.k(fts0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            lvi0 lvi0Var = fts0Var.a;
            SlotLead$LeadIcon$IconStyle slotLead$LeadIcon$IconStyle = fts0Var.b;
            c530 c530Var = c530.a;
            if (slotLead$LeadIcon$IconStyle != null && (l = ymb1.l(ljs0.n(c530Var, slotLead$LeadIcon$IconStyle.getWidth(), slotLead$LeadIcon$IconStyle.getHeight()), cyk0.c(slotLead$LeadIcon$IconStyle.getCornerRadius()))) != 0) {
                c530Var = l;
            }
            s3b1.f(lvi0Var, c530Var, null, btsVar, 0, 4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(fts0Var, i, 20);
        }
    }

    public static final void b(gts0 gts0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1394315843);
        int i2 = (btsVar.k(gts0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            w3b1.a(gts0Var.a, null, an91.k(c530.a, 8.0f), btsVar, 384, 2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(gts0Var, i, 21);
        }
    }

    public static final void c(f530 f530Var, CharSequence charSequence, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(335167794);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(f530Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (btsVar2.k(charSequence) ? 32 : 16) | (btsVar2.e(tlsVar) ? 256 : 128);
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            btsVar = btsVar2;
            qgy.b(charSequence, null, f530Var, AppColor$Palette.TextMinor, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar2).i.a, tlsVar, btsVar, ((i3 >> 3) & 14) | HProv.ALG_TYPE_SECURECHANNEL | ((i3 << 6) & 896), (i3 << 3) & 7168, 3954);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new etm(f530Var, (Object) charSequence, (cms) tlsVar, i, 26);
        }
    }

    public static final void d(hts0 hts0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1308250013);
        int i2 = (btsVar.e(hts0Var) ? 4 : 2) | i;
        if (!btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.Y();
        } else if (hts0Var instanceof gts0) {
            btsVar.e0(-1197152424);
            b((gts0) hts0Var, btsVar, i2 & 14);
            btsVar.t(false);
        } else {
            if (!(hts0Var instanceof fts0)) {
                throw unr0.y(-1197153943, btsVar, false);
            }
            btsVar.e0(-1197150508);
            a((fts0) hts0Var, btsVar, i2 & 14);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new v61(hts0Var, i);
        }
    }

    public static String e(kr7 kr7Var, Integer num, ArrayList arrayList) {
        if (num == null || !arrayList.contains("0") || !arrayList.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) kr7Var.a("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        }
        if (num.intValue() == 0 && ((Integer) kr7Var.a("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        }
        return null;
    }

    public static ArrayList f(lm7 lm7Var, xs7 xs7Var, ArrayList arrayList) {
        String str;
        try {
            ArrayList arrayList2 = new ArrayList();
            if (xs7Var == null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add((String) it.next());
                }
            } else {
                try {
                    str = e(lm7Var.e, xs7Var.b(), arrayList);
                } catch (IllegalStateException unused) {
                    str = null;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!str2.equals(str)) {
                        arrayList3.add(lm7Var.d(str2));
                    }
                }
                Iterator it3 = xs7Var.a(arrayList3).iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((ar7) it3.next()).c());
                }
            }
            return arrayList2;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(ceb1.b(e));
        } catch (CameraUnavailableException e2) {
            throw new InitializationException(e2);
        }
    }
}
