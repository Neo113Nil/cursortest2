package defpackage;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.opengl.GLU;
import android.util.Log;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import androidx.compose.ui.semantics.g;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.compose.ui.window.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import skeletor.render.SkeletonContentView;

/* loaded from: classes11.dex */
public abstract class pva1 {
    public static final void a(mv60 mv60Var, jt1 jt1Var, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(mv60Var) : btsVar.e(mv60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(jt1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(aVar) ? 256 : 128;
        }
        boolean z = false;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && btsVar.k(mv60Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new w5u(jt1Var, mv60Var);
                btsVar.o0(Q);
            }
            e.a((w5u) Q, null, new eae0(false, true, true, SecureFlagPolicy.Inherit, false, 0), aVar, btsVar, ((i2 << 3) & 7168) | 384, 2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(mv60Var, jt1Var, aVar, i, 7);
        }
    }

    public static final void b(final mv60 mv60Var, final boolean z, final ResolvedTextDirection resolvedTextDirection, final boolean z2, long j, final float f, final f530 f530Var, fid fidVar, final int i) {
        int i2;
        long j2;
        int i3;
        long j3;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(mv60Var) : btsVar.e(mv60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.c(resolvedTextDirection.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.k(f530Var) ? 1048576 : 524288;
        }
        if (btsVar.V(i2 & 1, (533651 & i2) != 533650)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                btsVar.Y();
                i3 = i2 & (-57345);
                j3 = j;
            }
            btsVar.u();
            if (z) {
                g gVar = qkq0.a;
                z3 = (resolvedTextDirection == ResolvedTextDirection.Ltr && !z2) || (resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            } else {
                g gVar2 = qkq0.a;
                z3 = (resolvedTextDirection != ResolvedTextDirection.Ltr || z2) && !(resolvedTextDirection == ResolvedTextDirection.Rtl && z2);
            }
            ro5 ro5Var = z3 ? gi.b : gi.a;
            int i4 = i3 & 14;
            boolean a = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && btsVar.e(mv60Var))) | btsVar.a(z3);
            Object Q = btsVar.Q();
            if (a || Q == did.a) {
                Q = new jt0(mv60Var, z, z3);
                btsVar.o0(Q);
            }
            long j4 = j3;
            ro5 ro5Var2 = ro5Var;
            j2 = j4;
            a(mv60Var, ro5Var2, wwg.S(1365123137, true, new dw0((xp31) btsVar.m(j.t), j2, z3, fnq0.b(f530Var, false, (tls) Q), mv60Var), btsVar), btsVar, i4 | 384);
        } else {
            btsVar.Y();
            j2 = j;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final long j5 = j2;
            v.d = new wls() { // from class: dc2
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pva1.b(mv60.this, z, resolvedTextDirection, z2, j5, f, f530Var, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(int i, fid fidVar, sls slsVar, f530 f530Var, boolean z) {
        int i2;
        f530 a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2111672474);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            g gVar = qkq0.a;
            a = b.a(ljs0.n(f530Var, 25.0f, 25.0f), m.a(), new my8(slsVar, z, i3));
            oeb1.c(btsVar, a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gc2(f530Var, slsVar, z, i);
        }
    }

    public static final void d(bev bevVar, rbv rbvVar, Exception exc) {
        String str;
        if (rbvVar instanceof pbv) {
            str = ((pbv) rbvVar).a;
        } else {
            if (!(rbvVar instanceof nbv) && !(rbvVar instanceof ibv) && !(rbvVar instanceof lbv) && !(rbvVar instanceof mbv) && !(rbvVar instanceof jbv)) {
                w511.b();
                return;
            }
            str = null;
        }
        wav wavVar = new wav(str, exc);
        LinkedHashMap linkedHashMap = bevVar.m;
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            bevVar.m = linkedHashMap;
        }
        linkedHashMap.put(wav.class, wav.class.cast(wavVar));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final l8v e(androidx.compose.ui.draw.b bVar, float f) {
        int ceil = ((int) Math.ceil(f)) * 2;
        u92 u92Var = gza1.a;
        s72 s72Var = gza1.b;
        k28 k28Var = gza1.c;
        if (u92Var != null && s72Var != null) {
            Bitmap bitmap = u92Var.a;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        u92Var = f4b1.b(ceil, ceil, 1, 24);
        gza1.a = u92Var;
        s72Var = peb1.a(u92Var);
        gza1.b = s72Var;
        u92 u92Var2 = u92Var;
        s72 s72Var2 = s72Var;
        if (k28Var == null) {
            k28Var = new k28();
            gza1.c = k28Var;
        }
        k28 k28Var2 = k28Var;
        j28 j28Var = k28Var2.a;
        LayoutDirection layoutDirection = bVar.a.getLayoutDirection();
        Bitmap bitmap2 = u92Var2.a;
        float width = bitmap2.getWidth();
        float height = bitmap2.getHeight();
        long floatToRawIntBits = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        fwi fwiVar = j28Var.a;
        LayoutDirection layoutDirection2 = j28Var.b;
        i28 i28Var = j28Var.c;
        long j = j28Var.d;
        j28Var.a = bVar;
        j28Var.b = layoutDirection;
        j28Var.c = s72Var2;
        j28Var.d = floatToRawIntBits;
        s72Var2.save();
        qam.t0(k28Var2, ldc.b, 0L, k28Var2.c(), 0.0f, null, 58);
        qam.t0(k28Var2, rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA), 0L, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 120);
        qam.z(k28Var2, rzo.f(SkeletonContentView.HUNDRED_PERCENTS_ALPHA), f, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 0.0f, null, 0, 120);
        s72Var2.n();
        j28Var.a = fwiVar;
        j28Var.b = layoutDirection2;
        j28Var.c = i28Var;
        j28Var.d = j;
        return u92Var2;
    }

    public static String f(String str, String str2, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder(String.format("%s: %s: ", Arrays.copyOf(new Object[]{str, str2}, 2)));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            sb.append(String.format("%s (%d)", Arrays.copyOf(new Object[]{GLU.gluErrorString(intValue), Integer.valueOf(intValue)}, 2)));
            if (it.hasNext()) {
                sb.append(Extension.FIX_SPACE);
            }
        }
        return sb.toString();
    }

    public static ArrayList g() {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(glGetError));
        while (true) {
            int glGetError2 = GLES20.glGetError();
            if (glGetError2 == 0) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(glGetError2));
        }
    }

    public static void h(String str, String str2, String str3) {
        ArrayList g = g();
        if (g != null) {
            Log.println(5, str, f(str2, str3, g));
        }
    }

    public static void i(String str, String str2) {
        Integer num;
        ArrayList g = g();
        if (g != null && (num = (Integer) g.get(0)) != null) {
            throw new GLException(num.intValue(), f(str, str2, g));
        }
    }

    public static String j(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String sb;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                sb = "null";
            } else {
                try {
                    sb = obj.toString();
                } catch (Exception e) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder x = unr0.x("<", str2, " threw ");
                    x.append(e.getClass().getName());
                    x.append(">");
                    sb = x.toString();
                }
            }
            objArr[i2] = sb;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, indexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(Extension.FIX_SPACE);
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }
}
