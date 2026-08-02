package defpackage;

import androidx.compose.foundation.c;
import androidx.compose.foundation.gestures.g;
import androidx.compose.foundation.lazy.grid.a;
import androidx.compose.foundation.lazy.grid.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class cdb1 {
    public static final void a(final t0u t0uVar, final f530 f530Var, b bVar, j690 j690Var, final k43 k43Var, final h43 h43Var, snr snrVar, final boolean z, c cVar, final tls tlsVar, fid fidVar, final int i) {
        final b bVar2;
        final j690 j690Var2;
        final snr snrVar2;
        final c cVar2;
        b bVar3;
        int i2;
        int i3;
        j690 j690Var3;
        snr snrVar3;
        boolean z2;
        c a;
        h43 h43Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2072102870);
        int i4 = i | (btsVar.k(t0uVar) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | 272657536;
        int i5 = btsVar.e(tlsVar) ? 4 : 2;
        if (btsVar.V(i4 & 1, ((306783379 & i4) == 306783378 && (i5 & 3) == 2) ? false : true)) {
            btsVar.a0();
            int i6 = i & 1;
            Object obj = did.a;
            if (i6 == 0 || btsVar.C()) {
                i4y i4yVar = p4y.a;
                Object[] objArr = new Object[0];
                tig0 tig0Var = b.w;
                boolean c = btsVar.c(0) | btsVar.c(0);
                Object Q = btsVar.Q();
                if (c || Q == obj) {
                    Q = new vix(23);
                    btsVar.o0(Q);
                }
                bVar3 = (b) cvw.W(objArr, tig0Var, (sls) Q, btsVar, 0);
                l690 l690Var = new l690(0.0f, 0.0f, 0.0f, 0.0f);
                gxg a2 = ist0.a(btsVar);
                boolean k = btsVar.k(a2);
                Object Q2 = btsVar.Q();
                if (k || Q2 == obj) {
                    Q2 = new g(a2);
                    btsVar.o0(Q2);
                }
                i2 = i4 & (-1908409217);
                i3 = i5;
                j690Var3 = l690Var;
                snrVar3 = (g) Q2;
                z2 = true;
                a = m290.a(btsVar);
            } else {
                btsVar.Y();
                i2 = i4 & (-1908409217);
                bVar3 = bVar;
                snrVar3 = snrVar;
                i3 = i5;
                z2 = true;
                j690Var3 = j690Var;
                a = cVar;
            }
            btsVar.u();
            int i7 = (i2 & 14) | 48;
            boolean z3 = ((((i7 & 14) ^ 6) > 4 && btsVar.k(t0uVar)) || (i7 & 6) == 4) ? z2 : false;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == obj) {
                h43Var2 = h43Var;
                Q3 = new s1u(new s0v(7, t0uVar, h43Var2));
                btsVar.o0(Q3);
            } else {
                h43Var2 = h43Var;
            }
            bVar2 = bVar3;
            a.a(f530Var, bVar2, (s1u) Q3, j690Var3, snrVar3, z, a, k43Var, h43Var2, tlsVar, btsVar, ((i2 >> 3) & 14) | 818113536, 6 | ((i3 << 3) & 112));
            j690Var2 = j690Var3;
            snrVar2 = snrVar3;
            cVar2 = a;
        } else {
            btsVar.Y();
            bVar2 = bVar;
            j690Var2 = j690Var;
            snrVar2 = snrVar;
            cVar2 = cVar;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(f530Var, bVar2, j690Var2, k43Var, h43Var, snrVar2, z, cVar2, tlsVar, i) { // from class: x3y
                public final /* synthetic */ boolean A;
                public final /* synthetic */ c B;
                public final /* synthetic */ tls C;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ b c;
                public final /* synthetic */ j690 w;
                public final /* synthetic */ k43 x;
                public final /* synthetic */ h43 y;
                public final /* synthetic */ snr z;

                @Override // defpackage.wls
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int O = vng.O(102432769);
                    cdb1.a(t0u.this, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, (fid) obj2, O);
                    return zy11.a;
                }
            };
        }
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        if (1 > length || length >= 5) {
            ny61.g(oyr.i(length, "Length must be between 1 and 4. Length = "));
            return 0;
        }
        if (bArr.length < length) {
            ny61.g("Length or startPos not valid");
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += (bArr[i2] & 255) << (((length - i2) - 1) * 8);
        }
        return i;
    }

    public static String c(String str, byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        if (bArr == null) {
            stringBuffer.append("");
        } else {
            for (byte b : bArr) {
                stringBuffer.append(String.format(str, Arrays.copyOf(new Object[]{Integer.valueOf(b & 255)}, 1)));
            }
        }
        String upperCase = stringBuffer.toString().toUpperCase(Locale.getDefault());
        int length = upperCase.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = jl40.q(upperCase.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return upperCase.subSequence(i, length + 1).toString();
    }

    public static byte[] d(String str) {
        if (str == null) {
            ny61.g("Argument can't be null");
            return null;
        }
        int i = 0;
        String v = cvu0.v(str, " ", "", false);
        if (v.length() % 2 != 0) {
            ny61.g("Hex binary needs to be even-length :".concat(str));
            return null;
        }
        byte[] bArr = new byte[Math.round(v.length() / 2.0f)];
        int i2 = 0;
        while (i < v.length()) {
            int i3 = i + 2;
            String substring = v.substring(i, i3);
            rza.a(16);
            bArr[i2] = (byte) Integer.parseInt(substring, 16);
            i = i3;
            i2++;
        }
        return bArr;
    }

    public static final hgs0 e(rgs0 rgs0Var, List list) {
        List list2;
        Object obj;
        u8j0 u8j0Var = rgs0Var.a;
        hgs0 hgs0Var = (hgs0) u8j0Var.a();
        if (hgs0Var == null || (list2 = hgs0Var.e) == null) {
            return (hgs0) u8j0Var.a();
        }
        List<o8r0> list3 = list2;
        ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
        for (o8r0 o8r0Var : list3) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(o8r0Var.a, ((o8r0) obj).a)) {
                    break;
                }
            }
            o8r0 o8r0Var2 = (o8r0) obj;
            if (o8r0Var2 != null) {
                o8r0Var = o8r0.a(o8r0Var, o8r0Var2.c, o8r0Var2.f, o8r0Var2.g, o8r0Var2.h, 3867);
            }
            arrayList.add(o8r0Var);
        }
        hgs0 hgs0Var2 = (hgs0) u8j0Var.a();
        return hgs0Var2 != null ? new hgs0(hgs0Var2.a, hgs0Var2.b, hgs0Var2.c, hgs0Var2.d, arrayList, hgs0Var2.f, hgs0Var2.g, hgs0Var2.h, hgs0Var2.i, hgs0Var2.j, hgs0Var2.k, hgs0Var2.l, hgs0Var2.m, hgs0Var2.n) : (hgs0) u8j0Var.a();
    }

    public static boolean f(int i) {
        return (i & 128) != 0;
    }
}
