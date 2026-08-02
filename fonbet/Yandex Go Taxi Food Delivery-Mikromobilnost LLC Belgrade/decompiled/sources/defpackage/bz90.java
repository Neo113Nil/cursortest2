package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes13.dex */
public final class bz90 {
    public static final List a = Collections.singletonList(new az90(Date.from(Instant.parse("2030-01-01T00:00:00Z"))));

    public static byte[] a(int i, String str) {
        byte[] decode = Base64.getDecoder().decode(str);
        if (decode.length == i && jl40.l(Base64.getEncoder().encodeToString(decode), str)) {
            return decode;
        }
        ny61.g("Payment domain config contains invalid Base64 data");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean b(p370 p370Var, Date date) {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = a.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            if (((az90) it.next()).a.after(date)) {
                byte[] a2 = a(32, "+Eo6AsiVAv8QGF1FzcLN0/d3qfEbGW5yJoBF1HCj19o=");
                linkedHashMap.put(Base64.getEncoder().encodeToString(a2), new zy90(a2, 0));
            }
        }
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        ArrayList<hz90> arrayList = (ArrayList) p370Var.c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        for (hz90 hz90Var : arrayList) {
            if (!jl40.l(hz90Var.a, "ed25519")) {
                ny61.g("Payment domain config uses an unsupported signature algorithm");
                return false;
            }
            if (!jl40.l(hz90Var.c, "ed25519")) {
                ny61.g("Payment domain config uses an unsupported signature algorithm");
                return false;
            }
            byte[] a3 = a(32, hz90Var.b);
            String encodeToString = Base64.getEncoder().encodeToString(a3);
            if (!linkedHashSet.add(encodeToString)) {
                ny61.g("Payment domain config contains a duplicate public key");
                return false;
            }
            arrayList2.add(new xy90(hz90Var.a, a3, encodeToString, a(64, hz90Var.d), Base64.getEncoder().encodeToString(a(32, hz90Var.e)), hz90Var.f, hz90Var.g));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((xy90) next).f.after(date)) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList(arrayList3);
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (arrayList4.isEmpty()) {
                break;
            }
            int i4 = 5;
            if (i2 >= 5) {
                break;
            }
            Iterator it3 = arrayList4.iterator();
            int i5 = i;
            while (it3.hasNext()) {
                xy90 xy90Var = (xy90) it3.next();
                String str = xy90Var.e;
                boolean z = i;
                byte[] bArr = xy90Var.b;
                zy90 zy90Var = (zy90) linkedHashMap.get(str);
                if (zy90Var == null) {
                    i = z ? 1 : 0;
                } else {
                    int i6 = zy90Var.b + i3;
                    if (i6 > i4) {
                        return z;
                    }
                    byte[] bArr2 = zy90Var.a;
                    String str2 = xy90Var.a;
                    int i7 = i3;
                    Charset charset = StandardCharsets.UTF_8;
                    if (!c(f73.r(f73.r(str2.getBytes(charset), bArr), xy90Var.g.getBytes(charset)), xy90Var.d, bArr2) || linkedHashMap.put(xy90Var.c, new zy90(bArr, i6)) != null) {
                        return z;
                    }
                    it3.remove();
                    i = z ? 1 : 0;
                    i3 = i7;
                    i5 = i3;
                    i4 = 5;
                }
            }
            boolean z2 = i;
            if (i5 == 0) {
                return z2;
            }
            i2++;
            i = z2 ? 1 : 0;
        }
        boolean z3 = i;
        if (!arrayList4.isEmpty()) {
            return z3;
        }
        ArrayList<jz90> arrayList5 = (ArrayList) p370Var.w;
        ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
        for (jz90 jz90Var : arrayList5) {
            if (!jl40.l(jz90Var.a, "ed25519")) {
                ny61.g("Payment domain config uses an unsupported signature algorithm");
                return z3;
            }
            arrayList6.add(new yy90(Base64.getEncoder().encodeToString(a(32, jz90Var.b)), a(64, jz90Var.c)));
        }
        if (arrayList6.isEmpty()) {
            return z3;
        }
        Iterator it4 = arrayList6.iterator();
        while (it4.hasNext()) {
            yy90 yy90Var = (yy90) it4.next();
            zy90 zy90Var2 = (zy90) linkedHashMap.get(yy90Var.a);
            if (zy90Var2 != null && c(((String) p370Var.b).getBytes(StandardCharsets.UTF_8), yy90Var.b, zy90Var2.a)) {
                return true;
            }
        }
        return z3;
    }

    public static boolean c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        dkn dknVar = new dkn();
        dknVar.b = new mum(bArr3);
        ((edf) fdf.b.get()).getClass();
        ckn cknVar = dknVar.a;
        cknVar.reset();
        cknVar.write(bArr, 0, bArr.length);
        mum mumVar = dknVar.b;
        if (mumVar != null) {
            return cknVar.d(mumVar, bArr2);
        }
        ny61.r("Ed25519Signer not initialised for verification");
        return false;
    }
}
