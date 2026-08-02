package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class m3t0 {
    public final tls a;
    public Object b;
    public qy40 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final hz40 e = cmm0.b();
    public final hz40 f = new hz40((Object) null);
    public final iz40 g = new iz40((Object) null);
    public final wz40 h = new wz40(new qxi[16]);
    public final ats i = new ats(1, this);
    public final hz40 l = cmm0.b();
    public final HashMap m = new HashMap();

    public m3t0(tls tlsVar) {
        this.a = tlsVar;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m3t0.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i, Object obj2, qy40 qy40Var) {
        int i2;
        if (this.k > 0) {
            return;
        }
        int c = qy40Var.c(obj);
        if (c < 0) {
            c = ~c;
            i2 = -1;
        } else {
            i2 = qy40Var.c[c];
        }
        qy40Var.b[c] = obj;
        qy40Var.c[c] = i;
        if ((obj instanceof qxi) && i2 != i) {
            pxi d = ((qxi) obj).d();
            this.m.put(obj, d.f);
            qy40 qy40Var2 = d.e;
            hz40 hz40Var = this.l;
            ooc.A(hz40Var, obj);
            Object[] objArr = qy40Var2.b;
            long[] jArr = qy40Var2.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        for (int i5 = 0; i5 < i4; i5++) {
                            if ((j & 255) < 128) {
                                g5u0 g5u0Var = (g5u0) objArr[(i3 << 3) + i5];
                                if (g5u0Var instanceof h5u0) {
                                    ((h5u0) g5u0Var).m484recordReadInh_f27i8$runtime(2);
                                }
                                ooc.a(hz40Var, g5u0Var, obj);
                            }
                            j >>= 8;
                        }
                        if (i4 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (i2 == -1) {
            if (obj instanceof h5u0) {
                ((h5u0) obj).m484recordReadInh_f27i8$runtime(2);
            }
            ooc.a(this.e, obj, obj2);
        }
    }

    public final void c(Object obj, Object obj2) {
        hz40 hz40Var = this.e;
        ooc.z(hz40Var, obj2, obj);
        if (!(obj2 instanceof qxi) || hz40Var.b(obj2)) {
            return;
        }
        ooc.A(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(tls tlsVar) {
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        long j3;
        hz40 hz40Var = this.f;
        long[] jArr3 = hz40Var.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            char c2 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((j4 & 255) < 128) {
                        int i6 = (i2 << 3) + i5;
                        c = c2;
                        Object obj = hz40Var.b[i6];
                        j2 = j5;
                        qy40 qy40Var = (qy40) hz40Var.c[i6];
                        Boolean bool = (Boolean) tlsVar.invoke(obj);
                        if (bool.booleanValue()) {
                            Object[] objArr = qy40Var.b;
                            int[] iArr = qy40Var.c;
                            long[] jArr4 = qy40Var.a;
                            int i7 = i3;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j = j4;
                                int i8 = 0;
                                while (true) {
                                    long j6 = jArr4[i8];
                                    long[] jArr5 = jArr4;
                                    if ((((~j6) << c) & j6 & j2) != j2) {
                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                        for (int i10 = 0; i10 < i9; i10++) {
                                            if ((j6 & 255) < 128) {
                                                int i11 = (i8 << 3) + i10;
                                                j3 = j6;
                                                Object obj2 = objArr[i11];
                                                int i12 = iArr[i11];
                                                c(obj, obj2);
                                            } else {
                                                j3 = j6;
                                            }
                                            j6 = j3 >> i7;
                                        }
                                        if (i9 != i7) {
                                            break;
                                        }
                                    }
                                    if (i8 == length2) {
                                        break;
                                    }
                                    i8++;
                                    jArr4 = jArr5;
                                    i7 = 8;
                                }
                                if (bool.booleanValue()) {
                                    hz40Var.n(i6);
                                }
                                i = 8;
                            }
                        }
                        jArr2 = jArr3;
                        j = j4;
                        if (bool.booleanValue()) {
                        }
                        i = 8;
                    } else {
                        jArr2 = jArr3;
                        j = j4;
                        c = c2;
                        j2 = j5;
                        i = i3;
                    }
                    i5++;
                    i3 = i;
                    j4 = j >> i;
                    c2 = c;
                    j5 = j2;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i4 != i3) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i2 == length) {
                return;
            }
            i2++;
            jArr3 = jArr;
        }
    }
}
