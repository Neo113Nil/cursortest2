package xsna;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.aq90;

/* compiled from: ZipFiles.kt */
/* loaded from: classes8.dex */
public final class l6y0 {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = aq90.c;
        aq90 a = aq90.a.a(DomExceptionUtils.SEPARATOR, false);
        LinkedHashMap m = pn00.m(new Pair(a, new h6y0(a)));
        for (h6y0 h6y0Var : j5g.D0(new taa(1), arrayList)) {
            if (((h6y0) m.put(h6y0Var.a, h6y0Var)) == null) {
                while (true) {
                    aq90 aq90Var = h6y0Var.a;
                    aq90 h = aq90Var.h();
                    if (h != null) {
                        h6y0 h6y0Var2 = (h6y0) m.get(h);
                        if (h6y0Var2 != null) {
                            h6y0Var2.h.add(aq90Var);
                            break;
                        }
                        h6y0 h6y0Var3 = new h6y0(h);
                        m.put(h, h6y0Var3);
                        h6y0Var3.h.add(aq90Var);
                        h6y0Var = h6y0Var3;
                    }
                }
            }
        }
        return m;
    }

    public static final String b(int i) {
        ro.d(16);
        return "0x".concat(Integer.toString(i, 16));
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01a0, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0033, code lost:
    
        r2 = r10.Z() & 65535;
        r9 = r10.Z() & 65535;
        r13 = r10.Z() & 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r13 != (r10.Z() & 65535)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        if (r2 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r9 != 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r10.skip(4);
        r17 = r10.Z() & 65535;
        r12 = new xsna.hsp(r13, 4294967295L & r10.o2(), r17);
        r10.Q2(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        r10.close();
        r4 = r4 - 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        if (r4 <= r18) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        r5 = new xsna.e8f0(r3.s(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (r5.o2() != 117853008) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        r4 = r5.o2();
        r7 = r5.l0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a4, code lost:
    
        if (r5.o2() != 1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r4 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        r7 = new xsna.e8f0(r3.s(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
    
        r4 = r7.o2();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r4 != 101075792) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
    
        r7.skip(12);
        r4 = r7.o2();
        r8 = r7.o2();
        r21 = r7.l0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (r21 != r7.l0()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        if (r4 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        if (r8 != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d7, code lost:
    
        r7.skip(8);
        r20 = new xsna.hsp(r21, r7.l0(), r17);
        r2 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ec, code lost:
    
        r12 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fa, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0121, code lost:
    
        throw new java.io.IOException("bad zip: expected " + b(101075792) + " but was " + b(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x012d, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012e, code lost:
    
        r2 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013e, code lost:
    
        r4 = r12.b;
        r2 = new java.util.ArrayList();
        r7 = new xsna.e8f0(r3.s(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
    
        r8 = r12.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0152, code lost:
    
        if (r18 >= r8) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0154, code lost:
    
        r6 = d(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015c, code lost:
    
        if (r6.g >= r4) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016a, code lost:
    
        if (((java.lang.Boolean) r28.invoke(r6)).booleanValue() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
    
        r2.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0173, code lost:
    
        r18 = r18 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017f, code lost:
    
        throw new java.io.IOException("bad zip: local file header offset >= central directory offset");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0180, code lost:
    
        r4 = xsna.s3q0.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0182, code lost:
    
        r7.close();
        r4 = new xsna.i6y0(r26, r27, a(r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018e, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0191, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0170, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0192, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0193, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0197, code lost:
    
        throw r0;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final i6y0 c(aq90 aq90Var, wby wbyVar, izs izsVar) throws IOException {
        y8r f = wbyVar.f(aq90Var);
        try {
            long size = f.size() - 22;
            long j = 0;
            if (size < 0) {
                throw new IOException("not a zip: size=" + f.size());
            }
            long max = Math.max(size - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH, 0L);
            while (true) {
                e8f0 e8f0Var = new e8f0(f.s(size));
                try {
                    if (e8f0Var.o2() == 101010256) {
                        break;
                    }
                    long j2 = j;
                    e8f0Var.close();
                    size--;
                    if (size < max) {
                        throw new IOException("not a zip: end of central directory signature not found");
                    }
                    j = j2;
                } finally {
                    e8f0Var.close();
                }
            }
        } finally {
        }
    }

    public static final h6y0 d(e8f0 e8f0Var) throws IOException {
        Long valueOf;
        int o2 = e8f0Var.o2();
        if (o2 != 33639248) {
            throw new IOException("bad zip: expected " + b(33639248) + " but was " + b(o2));
        }
        e8f0Var.skip(4L);
        short Z = e8f0Var.Z();
        int i = Z & 65535;
        if ((Z & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i));
        }
        int Z2 = e8f0Var.Z() & 65535;
        short Z3 = e8f0Var.Z();
        int i2 = Z3 & 65535;
        short Z4 = e8f0Var.Z();
        int i3 = Z4 & 65535;
        if (i2 == -1) {
            valueOf = null;
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.set(14, 0);
            gregorianCalendar.set(((i3 >> 9) & 127) + 1980, ((i3 >> 5) & 15) - 1, Z4 & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (Z3 & 31) << 1);
            valueOf = Long.valueOf(gregorianCalendar.getTime().getTime());
        }
        Long l = valueOf;
        e8f0Var.o2();
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = e8f0Var.o2() & 4294967295L;
        Ref$LongRef ref$LongRef2 = new Ref$LongRef();
        ref$LongRef2.element = e8f0Var.o2() & 4294967295L;
        int Z5 = e8f0Var.Z() & 65535;
        int Z6 = e8f0Var.Z() & 65535;
        int Z7 = e8f0Var.Z() & 65535;
        e8f0Var.skip(8L);
        Ref$LongRef ref$LongRef3 = new Ref$LongRef();
        ref$LongRef3.element = e8f0Var.o2() & 4294967295L;
        String Q2 = e8f0Var.Q2(Z5);
        if (drm0.E(Q2, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = ref$LongRef2.element == 4294967295L ? 8 : 0L;
        if (ref$LongRef.element == 4294967295L) {
            j += 8;
        }
        if (ref$LongRef3.element == 4294967295L) {
            j += 8;
        }
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        e(e8f0Var, Z6, new j6y0(ref$BooleanRef, j, ref$LongRef2, e8f0Var, ref$LongRef, ref$LongRef3));
        if (j > 0 && !ref$BooleanRef.element) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        e8f0Var.Q2(Z7);
        String str = aq90.c;
        return new h6y0(aq90.a.a(DomExceptionUtils.SEPARATOR, false).j(Q2), brm0.v(Q2, DomExceptionUtils.SEPARATOR, false), ref$LongRef.element, ref$LongRef2.element, Z2, l, ref$LongRef3.element);
    }

    public static final void e(bn8 bn8Var, int i, wzs<? super Integer, ? super Long, s3q0> wzsVar) {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int Z = bn8Var.Z() & 65535;
            long Z2 = bn8Var.Z() & 65535;
            long j2 = j - 4;
            if (j2 < Z2) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            bn8Var.G2(Z2);
            long j3 = bn8Var.C().c;
            wzsVar.invoke(Integer.valueOf(Z), Long.valueOf(Z2));
            long j4 = (bn8Var.C().c + Z2) - j3;
            if (j4 < 0) {
                throw new IOException(lhg.a(Z, "unsupported zip: too many bytes processed for "));
            }
            if (j4 > 0) {
                bn8Var.C().skip(j4);
            }
            j = j2 - Z2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final n9r f(e8f0 e8f0Var, n9r n9rVar) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = n9rVar != null ? n9rVar.e : 0;
        Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        int o2 = e8f0Var.o2();
        if (o2 != 67324752) {
            throw new IOException("bad zip: expected " + b(67324752) + " but was " + b(o2));
        }
        e8f0Var.skip(2L);
        short Z = e8f0Var.Z();
        int i = Z & 65535;
        if ((Z & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + b(i));
        }
        e8f0Var.skip(18L);
        int Z2 = e8f0Var.Z() & 65535;
        e8f0Var.skip(e8f0Var.Z() & 65535);
        if (n9rVar == null) {
            e8f0Var.skip(Z2);
            return null;
        }
        e(e8f0Var, Z2, new k6y0(e8f0Var, ref$ObjectRef, ref$ObjectRef2, ref$ObjectRef3));
        return new n9r(n9rVar.a, n9rVar.b, n9rVar.c, (Long) ref$ObjectRef3.element, (Long) ref$ObjectRef.element, (Long) ref$ObjectRef2.element);
    }
}
