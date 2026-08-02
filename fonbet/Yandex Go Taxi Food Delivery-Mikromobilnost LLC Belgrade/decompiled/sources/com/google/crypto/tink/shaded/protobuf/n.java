package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.aor;
import defpackage.b64;
import defpackage.c5m;
import defpackage.cvf0;
import defpackage.dxs0;
import defpackage.fi00;
import defpackage.gry;
import defpackage.h96;
import defpackage.n5w;
import defpackage.nqw;
import defpackage.ny61;
import defpackage.o9;
import defpackage.oyo;
import defpackage.plz;
import defpackage.qqw;
import defpackage.qv10;
import defpackage.r560;
import defpackage.rom0;
import defpackage.ryo;
import defpackage.t9i0;
import defpackage.unr0;
import defpackage.v321;
import defpackage.vt10;
import defpackage.w43;
import defpackage.w511;
import defpackage.xxq;
import defpackage.y321;
import defpackage.yci0;
import defpackage.yv4;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class n implements rom0 {
    public static final int[] q = new int[0];
    public static final Unsafe r = y321.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final vt10 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final int[] i;
    public final int j;
    public final int k;
    public final r560 l;
    public final gry m;
    public final q n;
    public final ryo o;
    public final fi00 p;

    public n(int[] iArr, Object[] objArr, int i, int i2, vt10 vt10Var, boolean z, int[] iArr2, int i3, int i4, r560 r560Var, gry gryVar, q qVar, ryo ryoVar, fi00 fi00Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = vt10Var instanceof GeneratedMessageLite;
        this.h = z;
        this.f = ryoVar != null && ryoVar.e(vt10Var);
        this.i = iArr2;
        this.j = i3;
        this.k = i4;
        this.l = r560Var;
        this.m = gryVar;
        this.n = qVar;
        this.o = ryoVar;
        this.e = vt10Var;
        this.p = fi00Var;
    }

    public static n B(t9i0 t9i0Var, r560 r560Var, gry gryVar, q qVar, ryo ryoVar, fi00 fi00Var) {
        if (t9i0Var instanceof t9i0) {
            return C(t9i0Var, r560Var, gryVar, qVar, ryoVar, fi00Var);
        }
        ny61.u();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n C(t9i0 t9i0Var, r560 r560Var, gry gryVar, q qVar, ryo ryoVar, fi00 fi00Var) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int charAt4;
        int i2;
        int i3;
        int[] iArr;
        int i4;
        char charAt5;
        int i5;
        char charAt6;
        int i6;
        char charAt7;
        int i7;
        char charAt8;
        int i8;
        char charAt9;
        int i9;
        char charAt10;
        int i10;
        char charAt11;
        int i11;
        char charAt12;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        int i17;
        int objectFieldOffset;
        String str;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        Field P;
        int i24;
        char charAt13;
        int i25;
        int i26;
        Field P2;
        Field P3;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        int i29;
        int i30;
        char charAt16;
        int i31;
        char charAt17;
        int i32 = 0;
        boolean z2 = ((t9i0Var.d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3) == ProtoSyntax.PROTO3;
        String str2 = t9i0Var.b;
        int length = str2.length();
        if (str2.charAt(0) >= 55296) {
            int i33 = 1;
            while (true) {
                i = i33 + 1;
                if (str2.charAt(i33) < 55296) {
                    break;
                }
                i33 = i;
            }
        } else {
            i = 1;
        }
        int i34 = i + 1;
        int charAt18 = str2.charAt(i);
        if (charAt18 >= 55296) {
            int i35 = charAt18 & 8191;
            int i36 = 13;
            while (true) {
                i31 = i34 + 1;
                charAt17 = str2.charAt(i34);
                if (charAt17 < 55296) {
                    break;
                }
                i35 |= (charAt17 & 8191) << i36;
                i36 += 13;
                i34 = i31;
            }
            charAt18 = i35 | (charAt17 << i36);
            i34 = i31;
        }
        if (charAt18 == 0) {
            charAt = 0;
            charAt2 = 0;
            charAt3 = 0;
            i2 = 0;
            charAt4 = 0;
            iArr = q;
            i3 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt19 = str2.charAt(i34);
            if (charAt19 >= 55296) {
                int i38 = charAt19 & 8191;
                int i39 = 13;
                while (true) {
                    i11 = i37 + 1;
                    charAt12 = str2.charAt(i37);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i38 |= (charAt12 & 8191) << i39;
                    i39 += 13;
                    i37 = i11;
                }
                charAt19 = i38 | (charAt12 << i39);
                i37 = i11;
            }
            int i40 = i37 + 1;
            int charAt20 = str2.charAt(i37);
            if (charAt20 >= 55296) {
                int i41 = charAt20 & 8191;
                int i42 = 13;
                while (true) {
                    i10 = i40 + 1;
                    charAt11 = str2.charAt(i40);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i41 |= (charAt11 & 8191) << i42;
                    i42 += 13;
                    i40 = i10;
                }
                charAt20 = i41 | (charAt11 << i42);
                i40 = i10;
            }
            int i43 = i40 + 1;
            charAt = str2.charAt(i40);
            if (charAt >= 55296) {
                int i44 = charAt & 8191;
                int i45 = 13;
                while (true) {
                    i9 = i43 + 1;
                    charAt10 = str2.charAt(i43);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i44 |= (charAt10 & 8191) << i45;
                    i45 += 13;
                    i43 = i9;
                }
                charAt = i44 | (charAt10 << i45);
                i43 = i9;
            }
            int i46 = i43 + 1;
            charAt2 = str2.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i8 = i46 + 1;
                    charAt9 = str2.charAt(i46);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i47 |= (charAt9 & 8191) << i48;
                    i48 += 13;
                    i46 = i8;
                }
                charAt2 = i47 | (charAt9 << i48);
                i46 = i8;
            }
            int i49 = i46 + 1;
            int charAt21 = str2.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i7 = i49 + 1;
                    charAt8 = str2.charAt(i49);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i50 |= (charAt8 & 8191) << i51;
                    i51 += 13;
                    i49 = i7;
                }
                charAt21 = i50 | (charAt8 << i51);
                i49 = i7;
            }
            int i52 = i49 + 1;
            charAt3 = str2.charAt(i49);
            if (charAt3 >= 55296) {
                int i53 = charAt3 & 8191;
                int i54 = 13;
                while (true) {
                    i6 = i52 + 1;
                    charAt7 = str2.charAt(i52);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i53 |= (charAt7 & 8191) << i54;
                    i54 += 13;
                    i52 = i6;
                }
                charAt3 = i53 | (charAt7 << i54);
                i52 = i6;
            }
            int i55 = i52 + 1;
            int charAt22 = str2.charAt(i52);
            if (charAt22 >= 55296) {
                int i56 = charAt22 & 8191;
                int i57 = 13;
                while (true) {
                    i5 = i55 + 1;
                    charAt6 = str2.charAt(i55);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i56 |= (charAt6 & 8191) << i57;
                    i57 += 13;
                    i55 = i5;
                }
                charAt22 = i56 | (charAt6 << i57);
                i55 = i5;
            }
            int i58 = i55 + 1;
            charAt4 = str2.charAt(i55);
            if (charAt4 >= 55296) {
                int i59 = charAt4 & 8191;
                int i60 = i58;
                int i61 = 13;
                while (true) {
                    i4 = i60 + 1;
                    charAt5 = str2.charAt(i60);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i59 |= (charAt5 & 8191) << i61;
                    i61 += 13;
                    i60 = i4;
                }
                charAt4 = i59 | (charAt5 << i61);
                i58 = i4;
            }
            int[] iArr2 = new int[charAt4 + charAt3 + charAt22];
            i2 = (charAt19 * 2) + charAt20;
            i3 = charAt21;
            iArr = iArr2;
            i32 = charAt19;
            i34 = i58;
        }
        Unsafe unsafe = r;
        Object[] objArr = t9i0Var.c;
        Class<?> cls = t9i0Var.a.getClass();
        int[] iArr3 = new int[i3 * 3];
        Object[] objArr2 = new Object[i3 * 2];
        int i62 = charAt3 + charAt4;
        int i63 = i62;
        int i64 = charAt4;
        int i65 = 0;
        int i66 = 0;
        while (i34 < length) {
            int i67 = i34 + 1;
            int charAt23 = str2.charAt(i34);
            int i68 = length;
            if (charAt23 >= 55296) {
                int i69 = charAt23 & 8191;
                int i70 = i67;
                int i71 = 13;
                while (true) {
                    i30 = i70 + 1;
                    charAt16 = str2.charAt(i70);
                    i12 = i32;
                    if (charAt16 < 55296) {
                        break;
                    }
                    i69 |= (charAt16 & 8191) << i71;
                    i71 += 13;
                    i70 = i30;
                    i32 = i12;
                }
                charAt23 = i69 | (charAt16 << i71);
                i13 = i30;
            } else {
                i12 = i32;
                i13 = i67;
            }
            int i72 = i13 + 1;
            int charAt24 = str2.charAt(i13);
            if (charAt24 >= 55296) {
                int i73 = charAt24 & 8191;
                int i74 = i72;
                int i75 = 13;
                while (true) {
                    i28 = i74 + 1;
                    charAt15 = str2.charAt(i74);
                    i29 = i73;
                    if (charAt15 < 55296) {
                        break;
                    }
                    i73 = i29 | ((charAt15 & 8191) << i75);
                    i75 += 13;
                    i74 = i28;
                }
                charAt24 = i29 | (charAt15 << i75);
                i14 = i28;
            } else {
                i14 = i72;
            }
            int i76 = charAt23;
            int i77 = charAt24 & 255;
            Object[] objArr3 = objArr2;
            if ((charAt24 & 1024) != 0) {
                iArr[i66] = i65;
                i66++;
            }
            int i78 = charAt;
            if (i77 >= 51) {
                int i79 = i14 + 1;
                int charAt25 = str2.charAt(i14);
                char c = 55296;
                if (charAt25 >= 55296) {
                    int i80 = charAt25 & 8191;
                    int i81 = 13;
                    while (true) {
                        i27 = i79 + 1;
                        charAt14 = str2.charAt(i79);
                        if (charAt14 < c) {
                            break;
                        }
                        i80 |= (charAt14 & 8191) << i81;
                        i81 += 13;
                        i79 = i27;
                        c = 55296;
                    }
                    charAt25 = i80 | (charAt14 << i81);
                    i79 = i27;
                }
                int i82 = i77 - 51;
                int i83 = charAt25;
                if (i82 == 9 || i82 == 17) {
                    i26 = i79;
                    objArr3[qv10.b(i65, 3, 2, 1)] = objArr[i2];
                    i2++;
                } else if (i82 != 12 || z2) {
                    i26 = i79;
                } else {
                    i26 = i79;
                    objArr3[qv10.b(i65, 3, 2, 1)] = objArr[i2];
                    i2++;
                }
                int i84 = i83 * 2;
                Object obj = objArr[i84];
                if (obj instanceof Field) {
                    P2 = (Field) obj;
                } else {
                    P2 = P(cls, (String) obj);
                    objArr[i84] = P2;
                }
                i15 = charAt2;
                i23 = (int) unsafe.objectFieldOffset(P2);
                int i85 = i84 + 1;
                Object obj2 = objArr[i85];
                if (obj2 instanceof Field) {
                    P3 = (Field) obj2;
                } else {
                    P3 = P(cls, (String) obj2);
                    objArr[i85] = P3;
                }
                i18 = i65;
                i22 = i2;
                i20 = i26;
                str = str2;
                i19 = (int) unsafe.objectFieldOffset(P3);
                z = z2;
                i21 = 0;
            } else {
                i15 = charAt2;
                int i86 = i2 + 1;
                Field P4 = P(cls, (String) objArr[i2]);
                if (i77 == 9 || i77 == 17) {
                    i16 = i86;
                    z = z2;
                    objArr3[qv10.b(i65, 3, 2, 1)] = P4.getType();
                } else {
                    if (i77 == 27 || i77 == 49) {
                        z = z2;
                        i25 = i2 + 2;
                        objArr3[qv10.b(i65, 3, 2, 1)] = objArr[i86];
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            if (!z2) {
                                z = z2;
                                i25 = i2 + 2;
                                objArr3[qv10.b(i65, 3, 2, 1)] = objArr[i86];
                            }
                        } else if (i77 == 50) {
                            int i87 = i64 + 1;
                            iArr[i64] = i65;
                            int i88 = (i65 / 3) * 2;
                            int i89 = i2 + 2;
                            objArr3[i88] = objArr[i86];
                            if ((charAt24 & 2048) != 0) {
                                i17 = i2 + 3;
                                objArr3[i88 + 1] = objArr[i89];
                                i64 = i87;
                            } else {
                                i64 = i87;
                                i17 = i89;
                            }
                            z = z2;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(P4);
                            if ((charAt24 & 4096) == 4096 || i77 > 17) {
                                str = str2;
                                i18 = i65;
                                i19 = 1048575;
                                i20 = i14;
                                i21 = 0;
                            } else {
                                i20 = i14 + 1;
                                int charAt26 = str2.charAt(i14);
                                if (charAt26 >= 55296) {
                                    int i90 = charAt26 & 8191;
                                    int i91 = 13;
                                    while (true) {
                                        i24 = i20 + 1;
                                        charAt13 = str2.charAt(i20);
                                        if (charAt13 < 55296) {
                                            break;
                                        }
                                        i90 |= (charAt13 & 8191) << i91;
                                        i91 += 13;
                                        i20 = i24;
                                    }
                                    charAt26 = i90 | (charAt13 << i91);
                                    i20 = i24;
                                }
                                int i92 = (charAt26 / 32) + (i12 * 2);
                                Object obj3 = objArr[i92];
                                if (obj3 instanceof Field) {
                                    P = (Field) obj3;
                                } else {
                                    P = P(cls, (String) obj3);
                                    objArr[i92] = P;
                                }
                                str = str2;
                                i18 = i65;
                                i19 = (int) unsafe.objectFieldOffset(P);
                                i21 = charAt26 % 32;
                            }
                            if (i77 >= 18 && i77 <= 49) {
                                iArr[i63] = objectFieldOffset;
                                i63++;
                            }
                            i22 = i17;
                            i23 = objectFieldOffset;
                        }
                        i16 = i86;
                        z = z2;
                    }
                    i17 = i25;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(P4);
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = str2;
                    i18 = i65;
                    i19 = 1048575;
                    i20 = i14;
                    i21 = 0;
                    if (i77 >= 18) {
                        iArr[i63] = objectFieldOffset;
                        i63++;
                    }
                    i22 = i17;
                    i23 = objectFieldOffset;
                }
                i17 = i16;
                objectFieldOffset = (int) unsafe.objectFieldOffset(P4);
                if ((charAt24 & 4096) == 4096) {
                }
                str = str2;
                i18 = i65;
                i19 = 1048575;
                i20 = i14;
                i21 = 0;
                if (i77 >= 18) {
                }
                i22 = i17;
                i23 = objectFieldOffset;
            }
            int i93 = i18 + 1;
            iArr3[i18] = i76;
            int i94 = i18 + 2;
            int i95 = i19;
            iArr3[i93] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? SelfTester_JCP.IMITA : 0) | (i77 << 20) | i23;
            iArr3[i94] = (i21 << 20) | i95;
            int i96 = i22;
            i65 = i18 + 3;
            str2 = str;
            i2 = i96;
            i34 = i20;
            length = i68;
            objArr2 = objArr3;
            i32 = i12;
            z2 = z;
            charAt = i78;
            charAt2 = i15;
        }
        return new n(iArr3, objArr2, charAt, charAt2, t9i0Var.a, z2, iArr, charAt4, i62, r560Var, gryVar, qVar, ryoVar, fi00Var);
    }

    public static long D(int i) {
        return i & 1048575;
    }

    public static int E(long j, Object obj) {
        return ((Integer) y321.c.i(j, obj)).intValue();
    }

    public static long F(long j, Object obj) {
        return ((Long) y321.c.i(j, obj)).longValue();
    }

    public static Field P(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder x = unr0.x("Field ", str, " for ");
            x.append(cls.getName());
            x.append(" not found. Known fields are ");
            x.append(Arrays.toString(declaredFields));
            throw new RuntimeException(x.toString());
        }
    }

    public static int V(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void Y(int i, Object obj, h hVar) {
        if (!(obj instanceof String)) {
            hVar.b(i, (ByteString) obj);
            return;
        }
        String str = (String) obj;
        g gVar = hVar.a;
        gVar.s(i, 2);
        int i2 = gVar.c;
        byte[] bArr = gVar.b;
        int i3 = gVar.d;
        try {
            int j = g.j(str.length() * 3);
            int j2 = g.j(str.length());
            if (j2 != j) {
                gVar.t(u.b(str));
                int i4 = gVar.d;
                gVar.d = u.a.t(i4, i2 - i4, str, bArr);
                return;
            }
            int i5 = i3 + j2;
            gVar.d = i5;
            int t = u.a.t(i5, i2 - i5, str, bArr);
            gVar.d = i3;
            gVar.t((t - i3) - j2);
            gVar.d = t;
        } catch (Utf8$UnpairedSurrogateException e) {
            gVar.d = i3;
            g.e.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(qqw.a);
            try {
                gVar.t(bytes.length);
                gVar.m(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e2) {
                throw new CodedOutputStream$OutOfSpaceException(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new CodedOutputStream$OutOfSpaceException(e3);
        }
    }

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        ny61.g(qv10.o("Mutating immutable message: ", obj));
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).n();
        }
        return true;
    }

    public static List v(a aVar, long j) {
        return (List) y321.c.i(j, aVar);
    }

    public final Object A(int i, int i2, Object obj) {
        rom0 p = p(i2);
        if (!u(i, i2, obj)) {
            return p.d();
        }
        Object object = r.getObject(obj, W(i2) & 1048575);
        if (t(object)) {
            return object;
        }
        Object d = p.d();
        if (object != null) {
            p.b(d, object);
        }
        return d;
    }

    public final void G(long j, Object obj, int i) {
        Unsafe unsafe = r;
        Object o = o(i);
        Object object = unsafe.getObject(obj, j);
        this.p.getClass();
        if (!((MapFieldLite) object).f()) {
            MapFieldLite i2 = MapFieldLite.b().i();
            fi00.b(i2, object);
            unsafe.putObject(obj, j, i2);
        }
        b64.D(o);
        throw null;
    }

    public final int H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, w43 w43Var) {
        int i9;
        Unsafe unsafe = r;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case SAFETY_TIPS_VALUE:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(c.c(i, bArr))));
                int i10 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(c.b(i, bArr))));
                int i11 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int k = c.k(bArr, i, w43Var);
                unsafe.putObject(obj, j, Long.valueOf(w43Var.b));
                unsafe.putInt(obj, j2, i4);
                return k;
            case SODA_DE_DE_VALUE:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int i12 = c.i(bArr, i, w43Var);
                unsafe.putObject(obj, j, Integer.valueOf(w43Var.a));
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(c.c(i, bArr)));
                int i13 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i13;
            case SODA_ES_ES_VALUE:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(c.b(i, bArr)));
                int i14 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i14;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int k2 = c.k(bArr, i, w43Var);
                unsafe.putObject(obj, j, Boolean.valueOf(w43Var.b != 0));
                unsafe.putInt(obj, j2, i4);
                return k2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int i15 = c.i(bArr, i, w43Var);
                int i16 = w43Var.a;
                if (i16 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (!u.a.R(i15, i15 + i16, bArr)) {
                            throw InvalidProtocolBufferException.c();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, i15, i16, qqw.a));
                    i15 += i16;
                }
                unsafe.putInt(obj, j2, i4);
                return i15;
            case 60:
                i9 = i;
                if (i5 == 2) {
                    Object A = A(i4, i8, obj);
                    int l = c.l(A, p(i8), bArr, i9, i2, w43Var);
                    U(i4, obj, A, i8);
                    return l;
                }
                return i9;
            case 61:
                i9 = i;
                if (i5 == 2) {
                    int a = c.a(bArr, i9, w43Var);
                    unsafe.putObject(obj, j, w43Var.c);
                    unsafe.putInt(obj, j2, i4);
                    return a;
                }
                return i9;
            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                i9 = i;
                if (i5 == 0) {
                    int i17 = c.i(bArr, i9, w43Var);
                    int i18 = w43Var.a;
                    n(i8);
                    unsafe.putObject(obj, j, Integer.valueOf(i18));
                    unsafe.putInt(obj, j2, i4);
                    return i17;
                }
                return i9;
            case 66:
                i9 = i;
                if (i5 == 0) {
                    int i19 = c.i(bArr, i9, w43Var);
                    unsafe.putObject(obj, j, Integer.valueOf(yv4.b(w43Var.a)));
                    unsafe.putInt(obj, j2, i4);
                    return i19;
                }
                return i9;
            case 67:
                i9 = i;
                if (i5 == 0) {
                    int k3 = c.k(bArr, i9, w43Var);
                    unsafe.putObject(obj, j, Long.valueOf(yv4.c(w43Var.b)));
                    unsafe.putInt(obj, j2, i4);
                    return k3;
                }
                return i9;
            case TRANSLATE_KIT_VALUE:
                if (i5 == 3) {
                    Object A2 = A(i4, i8, obj);
                    int I = ((n) p(i8)).I(A2, bArr, i, i2, (i3 & (-8)) | 4, w43Var);
                    w43Var.c = A2;
                    U(i4, obj, A2, i8);
                    return I;
                }
            default:
                return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x040f, code lost:
    
        r1 = r17;
        r0 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x047f, code lost:
    
        if (r0 == r15) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0481, code lost:
    
        r29.putInt(r9, r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0487, code lost:
    
        r0 = r8.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x048b, code lost:
    
        if (r0 >= r8.k) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x048d, code lost:
    
        r8.m(r8.i[r0], r9, r35);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0499, code lost:
    
        if (r37 != 0) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x049b, code lost:
    
        if (r5 != r3) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x04a2, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x04a7, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x04a3, code lost:
    
        if (r5 > r3) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x04a5, code lost:
    
        if (r2 != r37) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x04ac, code lost:
    
        throw com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.i();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int I(Object obj, byte[] bArr, int i, int i2, int i3, w43 w43Var) {
        int i4;
        Unsafe unsafe;
        int i5;
        Object obj2;
        n nVar;
        int i6;
        Object obj3;
        int i7;
        int i8;
        int i9;
        oyo oyoVar;
        int i10;
        int i11;
        oyo oyoVar2;
        int g;
        int i12;
        int i13;
        int i14;
        byte[] bArr2;
        Unsafe unsafe2;
        int i15;
        Unsafe unsafe3;
        byte[] bArr3;
        Object obj4;
        byte[] bArr4;
        int i16;
        int i17;
        Object obj5;
        Object obj6;
        n nVar2;
        n nVar3 = this;
        Object obj7 = obj;
        byte[] bArr5 = bArr;
        int i18 = i2;
        w43 w43Var2 = w43Var;
        oyo oyoVar3 = w43Var2.d;
        l(obj7);
        Unsafe unsafe4 = r;
        int i19 = i;
        int i20 = -1;
        int i21 = 0;
        int i22 = 1048575;
        int i23 = 0;
        int i24 = 0;
        int i25 = 1048575;
        while (true) {
            if (i19 < i18) {
                int i26 = i19 + 1;
                int i27 = bArr5[i19];
                if (i27 < 0) {
                    i26 = c.h(i27, bArr5, i26, w43Var2);
                    i27 = w43Var2.a;
                }
                i24 = i27;
                int i28 = i24 >>> 3;
                int i29 = i24 & 7;
                int i30 = nVar3.d;
                int i31 = nVar3.c;
                if (i28 > i20) {
                    i9 = (i28 < i31 || i28 > i30) ? -1 : nVar3.S(i28, i21 / 3);
                    i8 = 0;
                } else if (i28 < i31 || i28 > i30) {
                    i8 = 0;
                    i9 = -1;
                } else {
                    i8 = 0;
                    i9 = nVar3.S(i28, 0);
                }
                if (i9 == -1) {
                    i4 = i22;
                    unsafe = unsafe4;
                    i21 = i8;
                    oyoVar = oyoVar3;
                    i5 = i25;
                    obj2 = null;
                    nVar = nVar3;
                    i20 = i28;
                    i6 = i23;
                    i10 = i24;
                    obj3 = obj7;
                    i11 = i26;
                } else {
                    int[] iArr = nVar3.a;
                    int i32 = iArr[i9 + 1];
                    int V = V(i32);
                    long j = i32 & i25;
                    if (V <= 17) {
                        int i33 = iArr[i9 + 2];
                        int i34 = 1 << (i33 >>> 20);
                        int i35 = i33 & i25;
                        if (i35 != i22) {
                            int i36 = i25;
                            i12 = i32;
                            if (i22 != i36) {
                                unsafe4.putInt(obj7, i22, i23);
                            }
                            i23 = unsafe4.getInt(obj7, i35);
                            i4 = i35;
                        } else {
                            i12 = i32;
                            i4 = i22;
                        }
                        int i37 = i23;
                        switch (V) {
                            case 0:
                                bArr2 = bArr;
                                i14 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 1) {
                                    obj5 = obj7;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    y321.c.m(obj7, j, Double.longBitsToDouble(c.c(i14, bArr2)));
                                    i19 = i14 + 8;
                                    i23 = i37 | i34;
                                    i18 = i2;
                                    bArr5 = bArr2;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                }
                            case 1:
                                bArr2 = bArr;
                                i14 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 5) {
                                    obj5 = obj7;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    y321.c.n(obj7, j, Float.intBitsToFloat(c.b(i14, bArr2)));
                                    i19 = i14 + 4;
                                    i23 = i37 | i34;
                                    i18 = i2;
                                    bArr5 = bArr2;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                }
                            case 2:
                            case 3:
                                Unsafe unsafe5 = unsafe4;
                                i15 = i9;
                                unsafe3 = unsafe5;
                                i14 = i26;
                                i13 = 1048575;
                                if (i29 != 0) {
                                    unsafe2 = unsafe3;
                                    obj5 = obj7;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    int k = c.k(bArr, i14, w43Var2);
                                    unsafe3.putLong(obj7, j, w43Var2.b);
                                    unsafe2 = unsafe3;
                                    i23 = i37 | i34;
                                    i18 = i2;
                                    bArr5 = bArr;
                                    i19 = k;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                }
                            case 4:
                            case 11:
                                Unsafe unsafe6 = unsafe4;
                                i15 = i9;
                                unsafe3 = unsafe6;
                                bArr3 = bArr;
                                i14 = i26;
                                i13 = 1048575;
                                if (i29 != 0) {
                                    unsafe2 = unsafe3;
                                    obj5 = obj7;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    i19 = c.i(bArr3, i14, w43Var2);
                                    unsafe3.putInt(obj7, j, w43Var2.a);
                                    i23 = i37 | i34;
                                    int i38 = i15;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr3;
                                    i21 = i38;
                                    i18 = i2;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                }
                            case 5:
                            case 14:
                                bArr3 = bArr;
                                obj4 = obj7;
                                i14 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 1) {
                                    obj5 = obj4;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    obj7 = obj4;
                                    unsafe3 = unsafe2;
                                    unsafe3.putLong(obj7, j, c.c(i14, bArr3));
                                    i19 = i14 + 8;
                                    i23 = i37 | i34;
                                    int i382 = i15;
                                    unsafe4 = unsafe3;
                                    bArr5 = bArr3;
                                    i21 = i382;
                                    i18 = i2;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                }
                            case 6:
                            case 13:
                                bArr4 = bArr;
                                obj4 = obj7;
                                i14 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 5) {
                                    obj5 = obj4;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    unsafe2.putInt(obj4, j, c.b(i14, bArr4));
                                    i19 = i14 + 4;
                                    i16 = i37 | i34;
                                    i18 = i2;
                                    obj7 = obj4;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                    i23 = i16;
                                    bArr5 = bArr4;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                }
                            case 7:
                                bArr4 = bArr;
                                obj4 = obj7;
                                i14 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 0) {
                                    obj5 = obj4;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    int k2 = c.k(bArr4, i14, w43Var2);
                                    y321.c.k(obj4, j, w43Var2.b != 0);
                                    i16 = i37 | i34;
                                    i19 = k2;
                                    obj7 = obj4;
                                    i20 = i28;
                                    i25 = 1048575;
                                    i22 = i4;
                                    i18 = i2;
                                    i23 = i16;
                                    bArr5 = bArr4;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                }
                            case 8:
                                bArr4 = bArr;
                                obj4 = obj7;
                                i14 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 2) {
                                    obj5 = obj4;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    i19 = (i12 & 536870912) == 0 ? c.e(bArr4, i14, w43Var2) : c.f(bArr4, i14, w43Var2);
                                    unsafe2.putObject(obj4, j, w43Var2.c);
                                    i16 = i37 | i34;
                                    i18 = i2;
                                    obj7 = obj4;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                    i23 = i16;
                                    bArr5 = bArr4;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                }
                            case 9:
                                bArr4 = bArr;
                                obj4 = obj7;
                                i17 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 2) {
                                    i14 = i17;
                                    obj5 = obj4;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    Object z = nVar3.z(i15, obj4);
                                    int l = c.l(z, nVar3.p(i15), bArr4, i17, i2, w43Var2);
                                    nVar3.T(i15, obj4, z);
                                    i16 = i37 | i34;
                                    i18 = i2;
                                    i19 = l;
                                    obj7 = obj4;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                    i23 = i16;
                                    bArr5 = bArr4;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                }
                            case 10:
                                bArr4 = bArr;
                                obj4 = obj7;
                                i17 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 2) {
                                    i14 = i17;
                                    obj5 = obj4;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    i19 = c.a(bArr4, i17, w43Var2);
                                    unsafe2.putObject(obj4, j, w43Var2.c);
                                    i16 = i37 | i34;
                                    i18 = i2;
                                    obj7 = obj4;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                    i23 = i16;
                                    bArr5 = bArr4;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                }
                            case 12:
                                bArr4 = bArr;
                                obj4 = obj7;
                                i17 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 0) {
                                    i14 = i17;
                                    obj5 = obj4;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    i19 = c.i(bArr4, i17, w43Var2);
                                    int i39 = w43Var2.a;
                                    nVar3.n(i15);
                                    unsafe2.putInt(obj4, j, i39);
                                    i16 = i37 | i34;
                                    i18 = i2;
                                    obj7 = obj4;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                    i23 = i16;
                                    bArr5 = bArr4;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                }
                            case 15:
                                bArr4 = bArr;
                                obj4 = obj7;
                                i17 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                if (i29 != 0) {
                                    i14 = i17;
                                    obj5 = obj4;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    i19 = c.i(bArr4, i17, w43Var2);
                                    unsafe2.putInt(obj4, j, yv4.b(w43Var2.a));
                                    i16 = i37 | i34;
                                    i18 = i2;
                                    obj7 = obj4;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                    i23 = i16;
                                    bArr5 = bArr4;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                }
                            case 16:
                                bArr4 = bArr;
                                int i40 = i26;
                                i13 = 1048575;
                                if (i29 != 0) {
                                    unsafe2 = unsafe4;
                                    i15 = i9;
                                    obj5 = obj7;
                                    i14 = i40;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    int k3 = c.k(bArr4, i40, w43Var2);
                                    Unsafe unsafe7 = unsafe4;
                                    i15 = i9;
                                    unsafe7.putLong(obj7, j, yv4.c(w43Var2.b));
                                    unsafe2 = unsafe7;
                                    i16 = i37 | i34;
                                    i18 = i2;
                                    i19 = k3;
                                    i20 = i28;
                                    i25 = i13;
                                    i22 = i4;
                                    i23 = i16;
                                    bArr5 = bArr4;
                                    i21 = i15;
                                    unsafe4 = unsafe2;
                                }
                            case 17:
                                if (i29 != 3) {
                                    i13 = 1048575;
                                    i14 = i26;
                                    unsafe2 = unsafe4;
                                    i15 = i9;
                                    obj5 = obj7;
                                    obj3 = obj5;
                                    i11 = i14;
                                    i21 = i15;
                                    unsafe = unsafe2;
                                    oyoVar = oyoVar3;
                                    i20 = i28;
                                    i5 = i13;
                                    i6 = i37;
                                    obj2 = null;
                                    nVar = nVar3;
                                    i10 = i24;
                                    break;
                                } else {
                                    Object z2 = nVar3.z(i9, obj7);
                                    int I = ((n) nVar3.p(i9)).I(z2, bArr, i26, i2, (i28 << 3) | 4, w43Var2);
                                    w43Var2.c = z2;
                                    nVar3.T(i9, obj7, z2);
                                    i23 = i37 | i34;
                                    i21 = i9;
                                    bArr5 = bArr;
                                    i19 = I;
                                    i20 = i28;
                                    i25 = 1048575;
                                    i22 = i4;
                                    i18 = i2;
                                }
                            default:
                                i14 = i26;
                                i13 = 1048575;
                                unsafe2 = unsafe4;
                                i15 = i9;
                                obj5 = obj7;
                                obj3 = obj5;
                                i11 = i14;
                                i21 = i15;
                                unsafe = unsafe2;
                                oyoVar = oyoVar3;
                                i20 = i28;
                                i5 = i13;
                                i6 = i37;
                                obj2 = null;
                                nVar = nVar3;
                                i10 = i24;
                                break;
                        }
                    } else {
                        int i41 = i26;
                        int i42 = i25;
                        Unsafe unsafe8 = unsafe4;
                        int i43 = i9;
                        Object obj8 = obj7;
                        if (V != 27) {
                            if (V <= 49) {
                                i4 = i22;
                                i6 = i23;
                                unsafe = unsafe8;
                                oyoVar = oyoVar3;
                                i5 = i42;
                                obj2 = null;
                                int K = nVar3.K(obj, bArr, i41, i2, i24, i29, i43, i32, V, j, w43Var);
                                n nVar4 = nVar3;
                                i10 = i24;
                                i43 = i43;
                                if (K != i41) {
                                    bArr5 = bArr;
                                    i18 = i2;
                                    w43Var2 = w43Var;
                                    i24 = i10;
                                    nVar3 = nVar4;
                                    i19 = K;
                                    i21 = i43;
                                    i23 = i6;
                                    i20 = i28;
                                    i22 = i4;
                                    unsafe4 = unsafe;
                                    obj7 = obj;
                                } else {
                                    obj3 = obj;
                                    nVar = nVar4;
                                    i11 = K;
                                }
                            } else {
                                nVar2 = nVar3;
                                i10 = i24;
                                obj6 = obj;
                                i4 = i22;
                                unsafe = unsafe8;
                                oyoVar = oyoVar3;
                                i5 = i42;
                                obj2 = null;
                                i6 = i23;
                                if (V == 50) {
                                    if (i29 == 2) {
                                        nVar2.G(j, obj6, i43);
                                        throw null;
                                    }
                                    obj3 = obj6;
                                    nVar = nVar2;
                                    i11 = i41;
                                } else {
                                    i20 = i28;
                                    int H = nVar2.H(obj6, bArr, i41, i2, i10, i20, i29, i32, V, j, i43, w43Var);
                                    nVar = nVar2;
                                    obj3 = obj6;
                                    i10 = i10;
                                    if (H != i41) {
                                        bArr5 = bArr;
                                        i18 = i2;
                                        w43Var2 = w43Var;
                                        i24 = i10;
                                        i19 = H;
                                        nVar3 = nVar;
                                        obj7 = obj3;
                                        i21 = i43;
                                        i23 = i6;
                                        i22 = i4;
                                        unsafe4 = unsafe;
                                    } else {
                                        i11 = H;
                                        i21 = i43;
                                    }
                                }
                            }
                            i25 = i5;
                            oyoVar3 = oyoVar;
                        } else if (i29 == 2) {
                            nqw nqwVar = (nqw) unsafe8.getObject(obj8, j);
                            if (!((o9) nqwVar).a) {
                                int size = nqwVar.size();
                                nqwVar = nqwVar.w(size == 0 ? 10 : size * 2);
                                unsafe8.putObject(obj8, j, nqwVar);
                            }
                            int d = c.d(nVar3.p(i43), i24, bArr, i41, i2, nqwVar, w43Var2);
                            i18 = i2;
                            w43Var2 = w43Var;
                            i19 = d;
                            i21 = i43;
                            unsafe4 = unsafe8;
                            i20 = i28;
                            i25 = i42;
                            obj7 = obj;
                            bArr5 = bArr;
                        } else {
                            obj6 = obj;
                            nVar2 = nVar3;
                            i4 = i22;
                            i6 = i23;
                            unsafe = unsafe8;
                            oyoVar = oyoVar3;
                            i10 = i24;
                            i5 = i42;
                            obj2 = null;
                            obj3 = obj6;
                            nVar = nVar2;
                            i11 = i41;
                        }
                        i21 = i43;
                        i20 = i28;
                    }
                }
                if (i10 != i3 || i3 == 0) {
                    boolean z3 = nVar.f;
                    r rVar = r.f;
                    if (z3) {
                        oyoVar2 = oyoVar;
                        if (oyoVar2 != oyo.b()) {
                            oyoVar2.a(nVar.e, i20);
                            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj3;
                            r rVar2 = generatedMessageLite.unknownFields;
                            if (rVar2 == rVar) {
                                rVar2 = r.c();
                                generatedMessageLite.unknownFields = rVar2;
                            }
                            g = c.g(i10, bArr, i11, i2, rVar2, w43Var);
                            i18 = i2;
                            i19 = g;
                            bArr5 = bArr;
                            w43Var2 = w43Var;
                            i24 = i10;
                            nVar3 = nVar;
                            obj7 = obj3;
                            i23 = i6;
                            i22 = i4;
                            i25 = i5;
                            oyoVar3 = oyoVar2;
                            unsafe4 = unsafe;
                        }
                    } else {
                        oyoVar2 = oyoVar;
                    }
                    GeneratedMessageLite generatedMessageLite2 = (GeneratedMessageLite) obj3;
                    r rVar3 = generatedMessageLite2.unknownFields;
                    if (rVar3 == rVar) {
                        rVar3 = r.c();
                        generatedMessageLite2.unknownFields = rVar3;
                    }
                    i18 = i2;
                    g = c.g(i10, bArr, i11, i18, rVar3, w43Var);
                    i19 = g;
                    bArr5 = bArr;
                    w43Var2 = w43Var;
                    i24 = i10;
                    nVar3 = nVar;
                    obj7 = obj3;
                    i23 = i6;
                    i22 = i4;
                    i25 = i5;
                    oyoVar3 = oyoVar2;
                    unsafe4 = unsafe;
                } else {
                    i18 = i2;
                    i19 = i11;
                    i7 = i10;
                }
            } else {
                i4 = i22;
                unsafe = unsafe4;
                i5 = i25;
                obj2 = null;
                nVar = nVar3;
                i6 = i23;
                obj3 = obj7;
                i7 = i24;
            }
        }
    }

    public final void J(Object obj, byte[] bArr, int i, int i2, w43 w43Var) {
        int i3;
        int i4;
        Object obj2;
        int i5;
        Unsafe unsafe;
        int i6;
        int i7;
        int i8;
        int i9;
        char c;
        Unsafe unsafe2;
        Object obj3;
        byte[] bArr2;
        int i10;
        byte[] bArr3;
        Object obj4;
        byte[] bArr4;
        Unsafe unsafe3;
        int i11;
        Object obj5;
        Object obj6;
        int i12;
        int i13;
        int i14;
        n nVar = this;
        Object obj7 = obj;
        byte[] bArr5 = bArr;
        int i15 = i2;
        w43 w43Var2 = w43Var;
        l(obj7);
        Unsafe unsafe4 = r;
        int i16 = i;
        int i17 = -1;
        int i18 = 0;
        int i19 = 1048575;
        int i20 = 0;
        while (i16 < i15) {
            int i21 = i16 + 1;
            int i22 = bArr5[i16];
            if (i22 < 0) {
                i21 = c.h(i22, bArr5, i21, w43Var2);
                i22 = w43Var2.a;
            }
            int i23 = i22 >>> 3;
            int i24 = i22 & 7;
            int i25 = nVar.d;
            int i26 = nVar.c;
            if (i23 > i17) {
                i4 = (i23 < i26 || i23 > i25) ? -1 : nVar.S(i23, i18 / 3);
                i3 = 0;
            } else if (i23 < i26 || i23 > i25) {
                i3 = 0;
                i4 = -1;
            } else {
                i3 = 0;
                i4 = nVar.S(i23, 0);
            }
            int i27 = i4;
            if (i27 == -1) {
                int i28 = i21;
                obj2 = obj7;
                i5 = i28;
                unsafe = unsafe4;
                i6 = i22;
                i7 = i23;
                i8 = i3;
            } else {
                int[] iArr = nVar.a;
                int i29 = iArr[i27 + 1];
                int V = V(i29);
                int i30 = i22;
                long j = i29 & 1048575;
                if (V <= 17) {
                    int i31 = iArr[i27 + 2];
                    int i32 = 1 << (i31 >>> 20);
                    int i33 = i31 & 1048575;
                    if (i33 != i19) {
                        int i34 = 1048575;
                        i9 = i29;
                        if (i19 != 1048575) {
                            unsafe4.putInt(obj7, i19, i20);
                            i34 = 1048575;
                        }
                        if (i33 != i34) {
                            i20 = unsafe4.getInt(obj7, i33);
                        }
                        i19 = i33;
                    } else {
                        i9 = i29;
                    }
                    switch (V) {
                        case 0:
                            unsafe2 = unsafe4;
                            bArr2 = bArr5;
                            c = 65535;
                            i10 = i21;
                            if (i24 != 1) {
                                obj3 = obj7;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                y321.c.m(obj7, j, Double.longBitsToDouble(c.c(i10, bArr2)));
                                i16 = i10 + 8;
                                i20 |= i32;
                                bArr5 = bArr2;
                                i18 = i27;
                                i17 = i23;
                                unsafe4 = unsafe2;
                                i15 = i2;
                                break;
                            }
                        case 1:
                            unsafe2 = unsafe4;
                            bArr2 = bArr5;
                            c = 65535;
                            i10 = i21;
                            if (i24 != 5) {
                                obj3 = obj7;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                y321.c.n(obj7, j, Float.intBitsToFloat(c.b(i10, bArr2)));
                                i16 = i10 + 4;
                                i20 |= i32;
                                bArr5 = bArr2;
                                i18 = i27;
                                i17 = i23;
                                unsafe4 = unsafe2;
                                i15 = i2;
                                break;
                            }
                        case 2:
                        case 3:
                            bArr3 = bArr5;
                            c = 65535;
                            i10 = i21;
                            if (i24 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj7;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                int k = c.k(bArr3, i10, w43Var2);
                                unsafe4.putLong(obj7, j, w43Var2.b);
                                i20 |= i32;
                                i16 = k;
                                bArr5 = bArr3;
                                i18 = i27;
                                i17 = i23;
                                i15 = i2;
                                break;
                            }
                        case 4:
                        case 11:
                            bArr3 = bArr5;
                            c = 65535;
                            i10 = i21;
                            if (i24 != 0) {
                                unsafe2 = unsafe4;
                                obj3 = obj7;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                int i35 = c.i(bArr3, i10, w43Var2);
                                unsafe4.putInt(obj7, j, w43Var2.a);
                                i20 |= i32;
                                i16 = i35;
                                bArr5 = bArr3;
                                i18 = i27;
                                i17 = i23;
                                i15 = i2;
                                break;
                            }
                        case 5:
                        case 14:
                            Object obj8 = obj7;
                            bArr3 = bArr5;
                            c = 65535;
                            Unsafe unsafe5 = unsafe4;
                            int i36 = i21;
                            if (i24 != 1) {
                                i10 = i36;
                                unsafe2 = unsafe5;
                                obj3 = obj8;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                long c2 = c.c(i36, bArr3);
                                unsafe4 = unsafe5;
                                obj7 = obj8;
                                unsafe4.putLong(obj7, j, c2);
                                i16 = i36 + 8;
                                i20 |= i32;
                                bArr5 = bArr3;
                                i18 = i27;
                                i17 = i23;
                                i15 = i2;
                                break;
                            }
                        case 6:
                        case 13:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            c = 65535;
                            unsafe3 = unsafe4;
                            i11 = i21;
                            if (i24 != 5) {
                                Unsafe unsafe6 = unsafe3;
                                i10 = i11;
                                obj3 = obj4;
                                unsafe2 = unsafe6;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                unsafe3.putInt(obj4, j, c.b(i11, bArr4));
                                i16 = i11 + 4;
                                i20 |= i32;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i18 = i27;
                                i17 = i23;
                                obj7 = obj4;
                                i15 = i2;
                                break;
                            }
                        case 7:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            c = 65535;
                            unsafe3 = unsafe4;
                            i11 = i21;
                            if (i24 != 0) {
                                Unsafe unsafe62 = unsafe3;
                                i10 = i11;
                                obj3 = obj4;
                                unsafe2 = unsafe62;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                i16 = c.k(bArr4, i11, w43Var2);
                                y321.c.k(obj4, j, w43Var2.b != 0);
                                i20 |= i32;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i18 = i27;
                                i17 = i23;
                                obj7 = obj4;
                                i15 = i2;
                                break;
                            }
                        case 8:
                            obj4 = obj7;
                            bArr4 = bArr5;
                            c = 65535;
                            unsafe3 = unsafe4;
                            i11 = i21;
                            if (i24 != 2) {
                                Unsafe unsafe622 = unsafe3;
                                i10 = i11;
                                obj3 = obj4;
                                unsafe2 = unsafe622;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                i16 = (i9 & 536870912) == 0 ? c.e(bArr4, i11, w43Var2) : c.f(bArr4, i11, w43Var2);
                                unsafe3.putObject(obj4, j, w43Var2.c);
                                i20 |= i32;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i18 = i27;
                                i17 = i23;
                                obj7 = obj4;
                                i15 = i2;
                                break;
                            }
                        case 9:
                            obj4 = obj7;
                            c = 65535;
                            if (i24 != 2) {
                                Unsafe unsafe7 = unsafe4;
                                obj3 = obj4;
                                unsafe2 = unsafe7;
                                i10 = i21;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                Unsafe unsafe8 = unsafe4;
                                Object z = nVar.z(i27, obj4);
                                byte[] bArr6 = bArr5;
                                unsafe3 = unsafe8;
                                int l = c.l(z, nVar.p(i27), bArr6, i21, i15, w43Var2);
                                bArr4 = bArr6;
                                nVar.T(i27, obj4, z);
                                i20 |= i32;
                                i16 = l;
                                unsafe4 = unsafe3;
                                bArr5 = bArr4;
                                i18 = i27;
                                i17 = i23;
                                obj7 = obj4;
                                i15 = i2;
                                break;
                            }
                        case 10:
                            obj5 = obj7;
                            c = 65535;
                            if (i24 != 2) {
                                Object obj9 = obj5;
                                unsafe2 = unsafe4;
                                obj3 = obj9;
                                i10 = i21;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                i16 = c.a(bArr5, i21, w43Var2);
                                unsafe4.putObject(obj5, j, w43Var2.c);
                                i20 |= i32;
                                i18 = i27;
                                i17 = i23;
                                obj7 = obj5;
                                break;
                            }
                        case 12:
                            obj5 = obj7;
                            c = 65535;
                            if (i24 != 0) {
                                Object obj92 = obj5;
                                unsafe2 = unsafe4;
                                obj3 = obj92;
                                i10 = i21;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                i16 = c.i(bArr5, i21, w43Var2);
                                unsafe4.putInt(obj5, j, w43Var2.a);
                                i20 |= i32;
                                i18 = i27;
                                i17 = i23;
                                obj7 = obj5;
                                break;
                            }
                        case 15:
                            obj5 = obj7;
                            c = 65535;
                            if (i24 != 0) {
                                Object obj922 = obj5;
                                unsafe2 = unsafe4;
                                obj3 = obj922;
                                i10 = i21;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                i16 = c.i(bArr5, i21, w43Var2);
                                unsafe4.putInt(obj5, j, yv4.b(w43Var2.a));
                                i20 |= i32;
                                i18 = i27;
                                i17 = i23;
                                obj7 = obj5;
                                break;
                            }
                        case 16:
                            if (i24 != 0) {
                                c = 65535;
                                unsafe2 = unsafe4;
                                obj3 = obj7;
                                i10 = i21;
                                i6 = i30;
                                obj2 = obj3;
                                i5 = i10;
                                unsafe = unsafe2;
                                i7 = i23;
                                i8 = i27;
                                break;
                            } else {
                                int k2 = c.k(bArr5, i21, w43Var2);
                                unsafe4.putLong(obj7, j, yv4.c(w43Var2.b));
                                i20 |= i32;
                                i18 = i27;
                                i17 = i23;
                                i16 = k2;
                                break;
                            }
                        default:
                            unsafe2 = unsafe4;
                            obj3 = obj7;
                            c = 65535;
                            i10 = i21;
                            i6 = i30;
                            obj2 = obj3;
                            i5 = i10;
                            unsafe = unsafe2;
                            i7 = i23;
                            i8 = i27;
                            break;
                    }
                } else {
                    Object obj10 = obj7;
                    Unsafe unsafe9 = unsafe4;
                    byte[] bArr7 = bArr5;
                    int i37 = i21;
                    if (V != 27) {
                        i6 = i30;
                        i12 = i37;
                        if (V <= 49) {
                            unsafe = unsafe9;
                            i7 = i23;
                            int i38 = i19;
                            int i39 = i20;
                            int K = nVar.K(obj, bArr, i12, i2, i6, i24, i27, i29, V, j, w43Var);
                            i8 = i27;
                            if (K != i12) {
                                bArr5 = bArr;
                                i15 = i2;
                                w43Var2 = w43Var;
                                obj7 = obj;
                                i16 = K;
                                i18 = i8;
                                i19 = i38;
                                i20 = i39;
                                i17 = i7;
                                unsafe4 = unsafe;
                            } else {
                                i5 = K;
                                i19 = i38;
                                i20 = i39;
                                obj2 = obj;
                            }
                        } else {
                            unsafe = unsafe9;
                            i13 = i19;
                            i7 = i23;
                            obj6 = obj;
                            i8 = i27;
                            i14 = i20;
                            if (V != 50) {
                                int H = nVar.H(obj6, bArr, i12, i2, i6, i7, i24, i29, V, j, i8, w43Var);
                                obj2 = obj6;
                                if (H != i12) {
                                    nVar = this;
                                    i15 = i2;
                                    w43Var2 = w43Var;
                                    obj7 = obj2;
                                    i16 = H;
                                    i18 = i8;
                                    i19 = i13;
                                    i20 = i14;
                                    i17 = i7;
                                    unsafe4 = unsafe;
                                    bArr5 = bArr;
                                } else {
                                    i5 = H;
                                    i19 = i13;
                                    i20 = i14;
                                }
                            } else if (i24 == 2) {
                                nVar.G(j, obj6, i8);
                                throw null;
                            }
                        }
                    } else if (i24 == 2) {
                        nqw nqwVar = (nqw) unsafe9.getObject(obj10, j);
                        if (!((o9) nqwVar).a) {
                            int size = nqwVar.size();
                            nqwVar = nqwVar.w(size == 0 ? 10 : size * 2);
                            unsafe9.putObject(obj10, j, nqwVar);
                        }
                        int d = c.d(nVar.p(i27), i30, bArr7, i37, i2, nqwVar, w43Var2);
                        obj7 = obj;
                        bArr5 = bArr;
                        w43Var2 = w43Var;
                        i16 = d;
                        unsafe4 = unsafe9;
                        i18 = i27;
                        i17 = i23;
                        i15 = i2;
                    } else {
                        obj6 = obj;
                        i6 = i30;
                        unsafe = unsafe9;
                        i12 = i37;
                        i13 = i19;
                        i14 = i20;
                        i7 = i23;
                        i8 = i27;
                    }
                    i5 = i12;
                    obj2 = obj6;
                    i19 = i13;
                    i20 = i14;
                }
            }
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj2;
            r rVar = generatedMessageLite.unknownFields;
            if (rVar == r.f) {
                rVar = r.c();
                generatedMessageLite.unknownFields = rVar;
            }
            int g = c.g(i6, bArr, i5, i2, rVar, w43Var);
            bArr5 = bArr;
            w43Var2 = w43Var;
            i15 = i2;
            obj7 = obj2;
            i18 = i8;
            i17 = i7;
            unsafe4 = unsafe;
            i16 = g;
            nVar = this;
        }
        Unsafe unsafe10 = unsafe4;
        Object obj11 = obj7;
        int i40 = i15;
        int i41 = i19;
        int i42 = i20;
        if (i41 != 1048575) {
            unsafe10.putInt(obj11, i41, i42);
        }
        if (i16 != i40) {
            throw InvalidProtocolBufferException.i();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int K(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, long j, int i6, long j2, w43 w43Var) {
        int j3;
        Unsafe unsafe = r;
        nqw nqwVar = (nqw) unsafe.getObject(obj, j2);
        if (!((o9) nqwVar).a) {
            int size = nqwVar.size();
            nqwVar = nqwVar.w(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j2, nqwVar);
        }
        nqw nqwVar2 = nqwVar;
        switch (i6) {
            case 18:
            case 35:
                if (i4 == 2) {
                    c5m c5mVar = (c5m) nqwVar2;
                    int i7 = c.i(bArr, i, w43Var);
                    int i8 = w43Var.a + i7;
                    while (i7 < i8) {
                        c5mVar.b(Double.longBitsToDouble(c.c(i7, bArr)));
                        i7 += 8;
                    }
                    if (i7 == i8) {
                        return i7;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i4 == 1) {
                    c5m c5mVar2 = (c5m) nqwVar2;
                    c5mVar2.b(Double.longBitsToDouble(c.c(i, bArr)));
                    i += 8;
                    while (i < i2) {
                        int i9 = c.i(bArr, i, w43Var);
                        if (i3 == w43Var.a) {
                            c5mVar2.b(Double.longBitsToDouble(c.c(i9, bArr)));
                            i = i9 + 8;
                        }
                    }
                }
                return i;
            case 19:
            case 36:
                if (i4 == 2) {
                    aor aorVar = (aor) nqwVar2;
                    int i10 = c.i(bArr, i, w43Var);
                    int i11 = w43Var.a + i10;
                    while (i10 < i11) {
                        aorVar.b(Float.intBitsToFloat(c.b(i10, bArr)));
                        i10 += 4;
                    }
                    if (i10 == i11) {
                        return i10;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i4 == 5) {
                    aor aorVar2 = (aor) nqwVar2;
                    aorVar2.b(Float.intBitsToFloat(c.b(i, bArr)));
                    int i12 = i + 4;
                    while (i12 < i2) {
                        int i13 = c.i(bArr, i12, w43Var);
                        if (i3 != w43Var.a) {
                            return i12;
                        }
                        aorVar2.b(Float.intBitsToFloat(c.b(i13, bArr)));
                        i12 = i13 + 4;
                    }
                    return i12;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i4 == 2) {
                    plz plzVar = (plz) nqwVar2;
                    int i14 = c.i(bArr, i, w43Var);
                    int i15 = w43Var.a + i14;
                    while (i14 < i15) {
                        i14 = c.k(bArr, i14, w43Var);
                        plzVar.b(w43Var.b);
                    }
                    if (i14 == i15) {
                        return i14;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i4 == 0) {
                    plz plzVar2 = (plz) nqwVar2;
                    int k = c.k(bArr, i, w43Var);
                    plzVar2.b(w43Var.b);
                    while (k < i2) {
                        int i16 = c.i(bArr, k, w43Var);
                        if (i3 != w43Var.a) {
                            return k;
                        }
                        k = c.k(bArr, i16, w43Var);
                        plzVar2.b(w43Var.b);
                    }
                    return k;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i4 != 2) {
                    if (i4 == 0) {
                        return c.j(i3, bArr, i, i2, nqwVar2, w43Var);
                    }
                    return i;
                }
                n5w n5wVar = (n5w) nqwVar2;
                int i17 = c.i(bArr, i, w43Var);
                int i18 = w43Var.a + i17;
                while (i17 < i18) {
                    i17 = c.i(bArr, i17, w43Var);
                    n5wVar.b(w43Var.a);
                }
                if (i17 == i18) {
                    return i17;
                }
                throw InvalidProtocolBufferException.l();
            case 23:
            case 32:
            case 40:
            case 46:
                if (i4 == 2) {
                    plz plzVar3 = (plz) nqwVar2;
                    int i19 = c.i(bArr, i, w43Var);
                    int i20 = w43Var.a + i19;
                    while (i19 < i20) {
                        plzVar3.b(c.c(i19, bArr));
                        i19 += 8;
                    }
                    if (i19 == i20) {
                        return i19;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i4 == 1) {
                    plz plzVar4 = (plz) nqwVar2;
                    plzVar4.b(c.c(i, bArr));
                    int i21 = i + 8;
                    while (i21 < i2) {
                        int i22 = c.i(bArr, i21, w43Var);
                        if (i3 != w43Var.a) {
                            return i21;
                        }
                        plzVar4.b(c.c(i22, bArr));
                        i21 = i22 + 8;
                    }
                    return i21;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i4 == 2) {
                    n5w n5wVar2 = (n5w) nqwVar2;
                    int i23 = c.i(bArr, i, w43Var);
                    int i24 = w43Var.a + i23;
                    while (i23 < i24) {
                        n5wVar2.b(c.b(i23, bArr));
                        i23 += 4;
                    }
                    if (i23 == i24) {
                        return i23;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i4 == 5) {
                    n5w n5wVar3 = (n5w) nqwVar2;
                    n5wVar3.b(c.b(i, bArr));
                    int i25 = i + 4;
                    while (i25 < i2) {
                        int i26 = c.i(bArr, i25, w43Var);
                        if (i3 != w43Var.a) {
                            return i25;
                        }
                        n5wVar3.b(c.b(i26, bArr));
                        i25 = i26 + 4;
                    }
                    return i25;
                }
                return i;
            case 25:
            case 42:
                if (i4 == 2) {
                    h96 h96Var = (h96) nqwVar2;
                    int i27 = c.i(bArr, i, w43Var);
                    int i28 = w43Var.a + i27;
                    while (i27 < i28) {
                        i27 = c.k(bArr, i27, w43Var);
                        h96Var.b(w43Var.b != 0);
                    }
                    if (i27 == i28) {
                        return i27;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i4 == 0) {
                    h96 h96Var2 = (h96) nqwVar2;
                    int k2 = c.k(bArr, i, w43Var);
                    h96Var2.b(w43Var.b != 0);
                    while (k2 < i2) {
                        int i29 = c.i(bArr, k2, w43Var);
                        if (i3 != w43Var.a) {
                            return k2;
                        }
                        k2 = c.k(bArr, i29, w43Var);
                        h96Var2.b(w43Var.b != 0);
                    }
                    return k2;
                }
                return i;
            case 26:
                if (i4 == 2) {
                    if ((j & 536870912) == 0) {
                        int i30 = c.i(bArr, i, w43Var);
                        int i31 = w43Var.a;
                        if (i31 < 0) {
                            throw InvalidProtocolBufferException.h();
                        }
                        if (i31 == 0) {
                            nqwVar2.add("");
                        } else {
                            nqwVar2.add(new String(bArr, i30, i31, qqw.a));
                            i30 += i31;
                        }
                        while (i30 < i2) {
                            int i32 = c.i(bArr, i30, w43Var);
                            if (i3 != w43Var.a) {
                                return i30;
                            }
                            i30 = c.i(bArr, i32, w43Var);
                            int i33 = w43Var.a;
                            if (i33 < 0) {
                                throw InvalidProtocolBufferException.h();
                            }
                            if (i33 == 0) {
                                nqwVar2.add("");
                            } else {
                                nqwVar2.add(new String(bArr, i30, i33, qqw.a));
                                i30 += i33;
                            }
                        }
                        return i30;
                    }
                    int i34 = c.i(bArr, i, w43Var);
                    int i35 = w43Var.a;
                    if (i35 < 0) {
                        throw InvalidProtocolBufferException.h();
                    }
                    if (i35 == 0) {
                        nqwVar2.add("");
                    } else {
                        int i36 = i34 + i35;
                        if (!u.a.R(i34, i36, bArr)) {
                            throw InvalidProtocolBufferException.c();
                        }
                        nqwVar2.add(new String(bArr, i34, i35, qqw.a));
                        i34 = i36;
                    }
                    while (i34 < i2) {
                        int i37 = c.i(bArr, i34, w43Var);
                        if (i3 != w43Var.a) {
                            return i34;
                        }
                        i34 = c.i(bArr, i37, w43Var);
                        int i38 = w43Var.a;
                        if (i38 < 0) {
                            throw InvalidProtocolBufferException.h();
                        }
                        if (i38 == 0) {
                            nqwVar2.add("");
                        } else {
                            int i39 = i34 + i38;
                            if (!u.a.R(i34, i39, bArr)) {
                                throw InvalidProtocolBufferException.c();
                            }
                            nqwVar2.add(new String(bArr, i34, i38, qqw.a));
                            i34 = i39;
                        }
                    }
                    return i34;
                }
                return i;
            case 27:
                if (i4 == 2) {
                    return c.d(p(i5), i3, bArr, i, i2, nqwVar2, w43Var);
                }
                return i;
            case 28:
                if (i4 == 2) {
                    int i40 = c.i(bArr, i, w43Var);
                    int i41 = w43Var.a;
                    if (i41 < 0) {
                        throw InvalidProtocolBufferException.h();
                    }
                    if (i41 > bArr.length - i40) {
                        throw InvalidProtocolBufferException.l();
                    }
                    if (i41 == 0) {
                        nqwVar2.add(ByteString.a);
                    } else {
                        nqwVar2.add(ByteString.f(i40, i41, bArr));
                        i40 += i41;
                    }
                    while (i40 < i2) {
                        int i42 = c.i(bArr, i40, w43Var);
                        if (i3 != w43Var.a) {
                            return i40;
                        }
                        i40 = c.i(bArr, i42, w43Var);
                        int i43 = w43Var.a;
                        if (i43 < 0) {
                            throw InvalidProtocolBufferException.h();
                        }
                        if (i43 > bArr.length - i40) {
                            throw InvalidProtocolBufferException.l();
                        }
                        if (i43 == 0) {
                            nqwVar2.add(ByteString.a);
                        } else {
                            nqwVar2.add(ByteString.f(i40, i43, bArr));
                            i40 += i43;
                        }
                    }
                    return i40;
                }
                return i;
            case 30:
            case 44:
                if (i4 != 2) {
                    if (i4 == 0) {
                        j3 = c.j(i3, bArr, i, i2, nqwVar2, w43Var);
                    }
                    return i;
                }
                n5w n5wVar4 = (n5w) nqwVar2;
                j3 = c.i(bArr, i, w43Var);
                int i44 = w43Var.a + j3;
                while (j3 < i44) {
                    j3 = c.i(bArr, j3, w43Var);
                    n5wVar4.b(w43Var.a);
                }
                if (j3 != i44) {
                    throw InvalidProtocolBufferException.l();
                }
                n(i5);
                Class cls = p.a;
                return j3;
            case 33:
            case 47:
                if (i4 == 2) {
                    n5w n5wVar5 = (n5w) nqwVar2;
                    int i45 = c.i(bArr, i, w43Var);
                    int i46 = w43Var.a + i45;
                    while (i45 < i46) {
                        i45 = c.i(bArr, i45, w43Var);
                        n5wVar5.b(yv4.b(w43Var.a));
                    }
                    if (i45 == i46) {
                        return i45;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i4 == 0) {
                    n5w n5wVar6 = (n5w) nqwVar2;
                    int i47 = c.i(bArr, i, w43Var);
                    n5wVar6.b(yv4.b(w43Var.a));
                    while (i47 < i2) {
                        int i48 = c.i(bArr, i47, w43Var);
                        if (i3 != w43Var.a) {
                            return i47;
                        }
                        i47 = c.i(bArr, i48, w43Var);
                        n5wVar6.b(yv4.b(w43Var.a));
                    }
                    return i47;
                }
                return i;
            case 34:
            case 48:
                if (i4 == 2) {
                    plz plzVar5 = (plz) nqwVar2;
                    int i49 = c.i(bArr, i, w43Var);
                    int i50 = w43Var.a + i49;
                    while (i49 < i50) {
                        i49 = c.k(bArr, i49, w43Var);
                        plzVar5.b(yv4.c(w43Var.b));
                    }
                    if (i49 == i50) {
                        return i49;
                    }
                    throw InvalidProtocolBufferException.l();
                }
                if (i4 == 0) {
                    plz plzVar6 = (plz) nqwVar2;
                    int k3 = c.k(bArr, i, w43Var);
                    plzVar6.b(yv4.c(w43Var.b));
                    while (k3 < i2) {
                        int i51 = c.i(bArr, k3, w43Var);
                        if (i3 != w43Var.a) {
                            return k3;
                        }
                        k3 = c.k(bArr, i51, w43Var);
                        plzVar6.b(yv4.c(w43Var.b));
                    }
                    return k3;
                }
                return i;
            case 49:
                if (i4 == 3) {
                    rom0 p = p(i5);
                    int i52 = (i3 & (-8)) | 4;
                    Object d = p.d();
                    n nVar = (n) p;
                    int I = nVar.I(d, bArr, i, i2, i52, w43Var);
                    w43Var.c = d;
                    p.c(d);
                    w43Var.c = d;
                    nqwVar2.add(d);
                    while (I < i2) {
                        int i53 = c.i(bArr, I, w43Var);
                        if (i3 != w43Var.a) {
                            return I;
                        }
                        Object d2 = p.d();
                        I = nVar.I(d2, bArr, i53, i2, i52, w43Var);
                        w43Var.c = d2;
                        p.c(d2);
                        w43Var.c = d2;
                        nqwVar2.add(d2);
                    }
                    return I;
                }
                return i;
            default:
                return i;
        }
    }

    public final void L(Object obj, long j, f fVar, rom0 rom0Var, oyo oyoVar) {
        int y;
        List c = this.m.c(j, obj);
        yv4 yv4Var = fVar.a;
        int i = fVar.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.f();
        }
        do {
            Object d = rom0Var.d();
            fVar.b(d, rom0Var, oyoVar);
            rom0Var.c(d);
            c.add(d);
            if (yv4Var.e() || fVar.d != 0) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == i);
        fVar.d = y;
    }

    public final void M(Object obj, int i, f fVar, rom0 rom0Var, oyo oyoVar) {
        int y;
        List c = this.m.c(i & 1048575, obj);
        yv4 yv4Var = fVar.a;
        int i2 = fVar.b;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.f();
        }
        do {
            Object d = rom0Var.d();
            fVar.c(d, rom0Var, oyoVar);
            rom0Var.c(d);
            c.add(d);
            if (yv4Var.e() || fVar.d != 0) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == i2);
        fVar.d = y;
    }

    public final void N(Object obj, int i, f fVar) {
        if ((536870912 & i) != 0) {
            fVar.v(2);
            y321.p(i & 1048575, obj, fVar.a.x());
        } else if (!this.g) {
            y321.p(i & 1048575, obj, fVar.e());
        } else {
            fVar.v(2);
            y321.p(i & 1048575, obj, fVar.a.w());
        }
    }

    public final void O(Object obj, int i, f fVar) {
        boolean z = (536870912 & i) != 0;
        gry gryVar = this.m;
        if (z) {
            fVar.r(gryVar.c(i & 1048575, obj), true);
        } else {
            fVar.r(gryVar.c(i & 1048575, obj), false);
        }
    }

    public final void Q(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        y321.n(j, obj, (1 << (i2 >>> 20)) | y321.c.g(j, obj));
    }

    public final void R(int i, int i2, Object obj) {
        y321.n(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int S(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void T(int i, Object obj, Object obj2) {
        r.putObject(obj, W(i) & 1048575, obj2);
        Q(i, obj);
    }

    public final void U(int i, Object obj, Object obj2, int i2) {
        r.putObject(obj, W(i2) & 1048575, obj2);
        R(i, i2, obj);
    }

    public final int W(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(Object obj, h hVar) {
        Map.Entry entry;
        int length;
        int i;
        boolean z;
        int i2;
        boolean z2 = this.f;
        ryo ryoVar = this.o;
        if (z2) {
            xxq c = ryoVar.c(obj);
            if (!c.d()) {
                entry = (Map.Entry) c.f().next();
                int[] iArr = this.a;
                length = iArr.length;
                Unsafe unsafe = r;
                i = 0;
                int i3 = 1048575;
                int i4 = 0;
                while (i < length) {
                    int W = W(i);
                    int i5 = iArr[i];
                    int V = V(W);
                    if (V <= 17) {
                        int i6 = iArr[i + 2];
                        z = true;
                        int i7 = i6 & 1048575;
                        if (i7 != i3) {
                            i4 = unsafe.getInt(obj, i7);
                            i3 = i7;
                        }
                        i2 = 1 << (i6 >>> 20);
                    } else {
                        z = true;
                        i2 = 0;
                    }
                    if (entry != null) {
                        ryoVar.a(entry);
                        throw null;
                    }
                    int i8 = W & 1048575;
                    int[] iArr2 = iArr;
                    long j = i8;
                    switch (V) {
                        case 0:
                            if ((i2 & i4) != 0) {
                                hVar.c(i5, y321.c.e(j, obj));
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 1:
                            if ((i2 & i4) != 0) {
                                hVar.g(i5, y321.c.f(j, obj));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 2:
                            if ((i2 & i4) != 0) {
                                hVar.j(i5, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 3:
                            if ((i2 & i4) != 0) {
                                hVar.r(i5, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 4:
                            if ((i2 & i4) != 0) {
                                hVar.i(i5, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 5:
                            if ((i2 & i4) != 0) {
                                hVar.f(i5, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 6:
                            if ((i2 & i4) != 0) {
                                hVar.e(i5, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 7:
                            if ((i2 & i4) != 0) {
                                hVar.a(i5, y321.c.c(j, obj));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 8:
                            if ((i2 & i4) != 0) {
                                Y(i5, unsafe.getObject(obj, j), hVar);
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 9:
                            if ((i2 & i4) != 0) {
                                hVar.k(i5, unsafe.getObject(obj, j), p(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 10:
                            if ((i2 & i4) != 0) {
                                hVar.b(i5, (ByteString) unsafe.getObject(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 11:
                            if ((i2 & i4) != 0) {
                                hVar.q(i5, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 12:
                            if ((i2 & i4) != 0) {
                                hVar.d(i5, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 13:
                            if ((i2 & i4) != 0) {
                                hVar.m(i5, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 14:
                            if ((i2 & i4) != 0) {
                                hVar.n(i5, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 15:
                            if ((i2 & i4) != 0) {
                                hVar.o(i5, unsafe.getInt(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 16:
                            if ((i2 & i4) != 0) {
                                hVar.p(i5, unsafe.getLong(obj, j));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 17:
                            if ((i2 & i4) != 0) {
                                hVar.h(i5, unsafe.getObject(obj, j), p(i));
                            } else {
                                continue;
                            }
                            i += 3;
                            iArr = iArr2;
                        case 18:
                            p.B(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 19:
                            p.F(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 20:
                            p.I(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 21:
                            p.Q(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 22:
                            p.H(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 23:
                            p.E(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 24:
                            p.D(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 25:
                            p.z(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 26:
                            p.O(iArr2[i], (List) unsafe.getObject(obj, j), hVar);
                            break;
                        case 27:
                            p.J(iArr2[i], (List) unsafe.getObject(obj, j), hVar, p(i));
                            break;
                        case 28:
                            p.A(iArr2[i], (List) unsafe.getObject(obj, j), hVar);
                            break;
                        case 29:
                            p.P(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 30:
                            p.C(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 31:
                            p.K(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 32:
                            p.L(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 33:
                            p.M(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 34:
                            p.N(iArr2[i], (List) unsafe.getObject(obj, j), hVar, false);
                            continue;
                            i += 3;
                            iArr = iArr2;
                        case 35:
                            p.B(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 36:
                            p.F(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 37:
                            p.I(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 38:
                            p.Q(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 39:
                            p.H(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 40:
                            p.E(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 41:
                            p.D(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 42:
                            p.z(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 43:
                            p.P(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 44:
                            p.C(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 45:
                            p.K(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 46:
                            p.L(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 47:
                            p.M(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 48:
                            p.N(iArr2[i], (List) unsafe.getObject(obj, j), hVar, z);
                            break;
                        case 49:
                            p.G(iArr2[i], (List) unsafe.getObject(obj, j), hVar, p(i));
                            break;
                        case 50:
                            if (unsafe.getObject(obj, j) != null) {
                                Object o = o(i);
                                this.p.getClass();
                                b64.D(o);
                                throw null;
                            }
                            break;
                        case SAFETY_TIPS_VALUE:
                            if (u(i5, i, obj)) {
                                hVar.c(i5, ((Double) y321.c.i(j, obj)).doubleValue());
                                break;
                            }
                            break;
                        case 52:
                            if (u(i5, i, obj)) {
                                hVar.g(i5, ((Float) y321.c.i(j, obj)).floatValue());
                                break;
                            }
                            break;
                        case 53:
                            if (u(i5, i, obj)) {
                                hVar.j(i5, F(j, obj));
                                break;
                            }
                            break;
                        case 54:
                            if (u(i5, i, obj)) {
                                hVar.r(i5, F(j, obj));
                                break;
                            }
                            break;
                        case SODA_DE_DE_VALUE:
                            if (u(i5, i, obj)) {
                                hVar.i(i5, E(j, obj));
                                break;
                            }
                            break;
                        case 56:
                            if (u(i5, i, obj)) {
                                hVar.f(i5, F(j, obj));
                                break;
                            }
                            break;
                        case SODA_ES_ES_VALUE:
                            if (u(i5, i, obj)) {
                                hVar.e(i5, E(j, obj));
                                break;
                            }
                            break;
                        case 58:
                            if (u(i5, i, obj)) {
                                hVar.a(i5, ((Boolean) y321.c.i(j, obj)).booleanValue());
                                break;
                            }
                            break;
                        case 59:
                            if (u(i5, i, obj)) {
                                Y(i5, unsafe.getObject(obj, j), hVar);
                                break;
                            }
                            break;
                        case 60:
                            if (u(i5, i, obj)) {
                                hVar.k(i5, unsafe.getObject(obj, j), p(i));
                                break;
                            }
                            break;
                        case 61:
                            if (u(i5, i, obj)) {
                                hVar.b(i5, (ByteString) unsafe.getObject(obj, j));
                                break;
                            }
                            break;
                        case 62:
                            if (u(i5, i, obj)) {
                                hVar.q(i5, E(j, obj));
                                break;
                            }
                            break;
                        case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                            if (u(i5, i, obj)) {
                                hVar.d(i5, E(j, obj));
                                break;
                            }
                            break;
                        case 64:
                            if (u(i5, i, obj)) {
                                hVar.m(i5, E(j, obj));
                                break;
                            }
                            break;
                        case 65:
                            if (u(i5, i, obj)) {
                                hVar.n(i5, F(j, obj));
                                break;
                            }
                            break;
                        case 66:
                            if (u(i5, i, obj)) {
                                hVar.o(i5, E(j, obj));
                                break;
                            }
                            break;
                        case 67:
                            if (u(i5, i, obj)) {
                                hVar.p(i5, F(j, obj));
                                break;
                            }
                            break;
                        case TRANSLATE_KIT_VALUE:
                            if (u(i5, i, obj)) {
                                hVar.h(i5, unsafe.getObject(obj, j), p(i));
                                break;
                            }
                            break;
                    }
                    i += 3;
                    iArr = iArr2;
                }
                if (entry == null) {
                    ryoVar.g(entry);
                    throw null;
                }
                ((s) this.n).getClass();
                ((GeneratedMessageLite) obj).unknownFields.e(hVar);
                return;
            }
        }
        entry = null;
        int[] iArr3 = this.a;
        length = iArr3.length;
        Unsafe unsafe2 = r;
        i = 0;
        int i32 = 1048575;
        int i42 = 0;
        while (i < length) {
        }
        if (entry == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ee, code lost:
    
        return false;
     */
    @Override // defpackage.rom0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        int i = 1048575;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            boolean z = true;
            if (i2 >= this.j) {
                if (this.f) {
                    this.o.c(obj).e();
                }
                return true;
            }
            int i4 = this.i[i2];
            int[] iArr = this.a;
            int i5 = iArr[i4];
            int W = W(i4);
            int i6 = iArr[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i3 = r.getInt(obj, i7);
                }
                i = i7;
            }
            if ((268435456 & W) != 0) {
                if (!(i == 1048575 ? s(i4, obj) : (i3 & i8) != 0)) {
                    break;
                }
            }
            int V = V(W);
            if (V == 9 || V == 17) {
                if (i == 1048575) {
                    z = s(i4, obj);
                } else if ((i8 & i3) == 0) {
                    z = false;
                }
                if (z) {
                    if (!p(i4).a(y321.c.i(W & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i2++;
            } else {
                if (V != 27) {
                    if (V == 60 || V == 68) {
                        if (u(i5, i4, obj)) {
                            if (!p(i4).a(y321.c.i(W & 1048575, obj))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (V != 49) {
                        if (V != 50) {
                            continue;
                        } else {
                            Object i9 = y321.c.i(W & 1048575, obj);
                            this.p.getClass();
                            if (!((MapFieldLite) i9).isEmpty()) {
                                b64.D(o(i4));
                                throw null;
                            }
                        }
                    }
                    i2++;
                }
                List list = (List) y321.c.i(W & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    rom0 p = p(i4);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!p.a(list.get(i10))) {
                            break loop0;
                        }
                    }
                }
                i2++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.rom0
    public final void b(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                p.x(this.n, obj4, obj2);
                if (this.f) {
                    ryo ryoVar = this.o;
                    xxq c = ryoVar.c(obj2);
                    if (c.d()) {
                        return;
                    }
                    ryoVar.d(obj4).getClass();
                    xxq.h(c);
                    return;
                }
                return;
            }
            int W = W(i);
            long j = 1048575 & W;
            int i2 = iArr[i];
            switch (V(W)) {
                case 0:
                    if (s(i, obj2)) {
                        v321 v321Var = y321.c;
                        obj3 = obj;
                        v321Var.m(obj3, j, v321Var.e(j, obj2));
                        Q(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (s(i, obj2)) {
                        v321 v321Var2 = y321.c;
                        v321Var2.n(obj, j, v321Var2.f(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (s(i, obj2)) {
                        y321.o(obj, j, y321.c.h(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (s(i, obj2)) {
                        y321.o(obj, j, y321.c.h(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (s(i, obj2)) {
                        y321.n(j, obj, y321.c.g(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (s(i, obj2)) {
                        y321.o(obj, j, y321.c.h(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (s(i, obj2)) {
                        y321.n(j, obj, y321.c.g(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (s(i, obj2)) {
                        v321 v321Var3 = y321.c;
                        v321Var3.k(obj, j, v321Var3.c(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (s(i, obj2)) {
                        y321.p(j, obj, y321.c.i(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (s(i, obj2)) {
                        y321.p(j, obj, y321.c.i(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (s(i, obj2)) {
                        y321.n(j, obj, y321.c.g(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (s(i, obj2)) {
                        y321.n(j, obj, y321.c.g(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (s(i, obj2)) {
                        y321.n(j, obj, y321.c.g(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (s(i, obj2)) {
                        y321.o(obj, j, y321.c.h(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (s(i, obj2)) {
                        y321.n(j, obj, y321.c.g(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (s(i, obj2)) {
                        y321.o(obj, j, y321.c.h(j, obj2));
                        Q(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.m.b(j, obj, obj2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = p.a;
                    v321 v321Var4 = y321.c;
                    Object i3 = v321Var4.i(j, obj);
                    Object i4 = v321Var4.i(j, obj2);
                    this.p.getClass();
                    y321.p(j, obj, fi00.b(i3, i4));
                    obj3 = obj;
                    break;
                case SAFETY_TIPS_VALUE:
                case 52:
                case 53:
                case 54:
                case SODA_DE_DE_VALUE:
                case 56:
                case SODA_ES_ES_VALUE:
                case 58:
                case 59:
                    if (u(i2, i, obj2)) {
                        y321.p(j, obj, y321.c.i(j, obj2));
                        R(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    y(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (u(i2, i, obj2)) {
                        y321.p(j, obj, y321.c.i(j, obj2));
                        R(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case TRANSLATE_KIT_VALUE:
                    y(i, obj, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.rom0
    public final void c(Object obj) {
        if (t(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.d(Integer.MAX_VALUE);
                generatedMessageLite.memoizedHashCode = 0;
                generatedMessageLite.o();
            }
            int length = this.a.length;
            for (int i = 0; i < length; i += 3) {
                int W = W(i);
                long j = 1048575 & W;
                int V = V(W);
                if (V != 9) {
                    switch (V) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.m.a(j, obj);
                            break;
                        case 50:
                            Unsafe unsafe = r;
                            Object object = unsafe.getObject(obj, j);
                            if (object != null) {
                                this.p.getClass();
                                ((MapFieldLite) object).g();
                                unsafe.putObject(obj, j, object);
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (s(i, obj)) {
                    p(i).c(r.getObject(obj, j));
                }
            }
            ((s) this.n).getClass();
            ((GeneratedMessageLite) obj).unknownFields.e = false;
            if (this.f) {
                this.o.f(obj);
            }
        }
    }

    @Override // defpackage.rom0
    public final Object d() {
        this.l.getClass();
        return ((GeneratedMessageLite) this.e).q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p.y(r5.i(r7, r12), r5.i(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.h(r7, r12) == r5.h(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.f(r7, r12)) == java.lang.Float.floatToIntBits(r5.f(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.e(r7, r12)) == java.lang.Double.doubleToLongBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.crypto.tink.shaded.protobuf.p.y(r9.i(r7, r12), r9.i(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.rom0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int W = W(i);
                long j = W & 1048575;
                switch (V(W)) {
                    case 0:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var2 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var3 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var4 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var5 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var6 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var7 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var8 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var9 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var10 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var11 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var12 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var13 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var14 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var15 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var16 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var17 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            v321 v321Var18 = y321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        v321 v321Var19 = y321.c;
                        z = p.y(v321Var19.i(j, generatedMessageLite), v321Var19.i(j, generatedMessageLite2));
                        break;
                    case 50:
                        v321 v321Var20 = y321.c;
                        z = p.y(v321Var20.i(j, generatedMessageLite), v321Var20.i(j, generatedMessageLite2));
                        break;
                    case SAFETY_TIPS_VALUE:
                    case 52:
                    case 53:
                    case 54:
                    case SODA_DE_DE_VALUE:
                    case 56:
                    case SODA_ES_ES_VALUE:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case TRANSLATE_KIT_VALUE:
                        long j2 = iArr[i + 2] & 1048575;
                        v321 v321Var21 = y321.c;
                        if (v321Var21.g(j2, generatedMessageLite) == v321Var21.g(j2, generatedMessageLite2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                s sVar = (s) this.n;
                sVar.getClass();
                r rVar = generatedMessageLite.unknownFields;
                sVar.getClass();
                if (rVar.equals(generatedMessageLite2.unknownFields)) {
                    if (!this.f) {
                        return true;
                    }
                    ryo ryoVar = this.o;
                    return ryoVar.c(generatedMessageLite).equals(ryoVar.c(generatedMessageLite2));
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0216, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        r8 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e2, code lost:
    
        r3 = r8 + r3;
     */
    @Override // defpackage.rom0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(GeneratedMessageLite generatedMessageLite) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int W = W(i4);
            int i5 = iArr[i4];
            long j = 1048575 & W;
            int i6 = 1237;
            int i7 = 37;
            switch (V(W)) {
                case 0:
                    i = i3 * 53;
                    b = qqw.b(Double.doubleToLongBits(y321.c.e(j, generatedMessageLite)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(y321.c.f(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = qqw.b(y321.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = qqw.b(y321.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = y321.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = qqw.b(y321.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = y321.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = y321.c.c(j, generatedMessageLite);
                    Charset charset = qqw.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) y321.c.i(j, generatedMessageLite)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object i8 = y321.c.i(j, generatedMessageLite);
                    if (i8 != null) {
                        i7 = i8.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = y321.c.i(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = y321.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = y321.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = y321.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = qqw.b(y321.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = y321.c.g(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = qqw.b(y321.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 17:
                    Object i9 = y321.c.i(j, generatedMessageLite);
                    if (i9 != null) {
                        i7 = i9.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    b = y321.c.i(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = y321.c.i(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case SAFETY_TIPS_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = qqw.b(Double.doubleToLongBits(((Double) y321.c.i(j, generatedMessageLite)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) y321.c.i(j, generatedMessageLite)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = qqw.b(F(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = qqw.b(F(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case SODA_DE_DE_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = E(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = qqw.b(F(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = E(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i5, i4, generatedMessageLite)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) y321.c.i(j, generatedMessageLite)).booleanValue();
                        Charset charset2 = qqw.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = ((String) y321.c.i(j, generatedMessageLite)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = y321.c.i(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = y321.c.i(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = E(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = E(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = E(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = qqw.b(F(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = E(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = qqw.b(F(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = y321.c.i(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((s) this.n).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode() + (i3 * 53);
        if (!this.f) {
            return hashCode;
        }
        return this.o.c(generatedMessageLite).hashCode() + (hashCode * 53);
    }

    @Override // defpackage.rom0
    public final int g(a aVar) {
        return this.h ? r(aVar) : q(aVar);
    }

    @Override // defpackage.rom0
    public final void h(Object obj, byte[] bArr, int i, int i2, w43 w43Var) {
        if (this.h) {
            J(obj, bArr, i, i2, w43Var);
        } else {
            I(obj, bArr, i, i2, 0, w43Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0559 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0bfc  */
    @Override // defpackage.rom0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Object obj, h hVar) {
        Map.Entry entry;
        int length;
        int i;
        int i2;
        int[] iArr;
        Map.Entry entry2;
        int length2;
        hVar.getClass();
        Writer$FieldOrder writer$FieldOrder = Writer$FieldOrder.ASCENDING;
        Writer$FieldOrder writer$FieldOrder2 = Writer$FieldOrder.DESCENDING;
        fi00 fi00Var = this.p;
        boolean z = this.f;
        q qVar = this.n;
        int i3 = 1048575;
        int[] iArr2 = this.a;
        ryo ryoVar = this.o;
        if (writer$FieldOrder == writer$FieldOrder2) {
            ((s) qVar).getClass();
            ((GeneratedMessageLite) obj).unknownFields.e(hVar);
            if (z) {
                xxq c = ryoVar.c(obj);
                if (!c.d()) {
                    entry2 = (Map.Entry) ((dxs0) c.b()).next();
                    for (length2 = iArr2.length - 3; length2 >= 0; length2 -= 3) {
                        int W = W(length2);
                        int i4 = iArr2[length2];
                        if (entry2 != null) {
                            ryoVar.a(entry2);
                            throw null;
                        }
                        switch (V(W)) {
                            case 0:
                                if (s(length2, obj)) {
                                    hVar.c(i4, y321.c.e(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (s(length2, obj)) {
                                    hVar.g(i4, y321.c.f(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (s(length2, obj)) {
                                    hVar.j(i4, y321.c.h(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (s(length2, obj)) {
                                    hVar.r(i4, y321.c.h(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (s(length2, obj)) {
                                    hVar.i(i4, y321.c.g(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (s(length2, obj)) {
                                    hVar.f(i4, y321.c.h(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (s(length2, obj)) {
                                    hVar.e(i4, y321.c.g(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (s(length2, obj)) {
                                    hVar.a(i4, y321.c.c(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (s(length2, obj)) {
                                    Y(i4, y321.c.i(W & 1048575, obj), hVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (s(length2, obj)) {
                                    hVar.k(i4, y321.c.i(W & 1048575, obj), p(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (s(length2, obj)) {
                                    hVar.b(i4, (ByteString) y321.c.i(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (s(length2, obj)) {
                                    hVar.q(i4, y321.c.g(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (s(length2, obj)) {
                                    hVar.d(i4, y321.c.g(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (s(length2, obj)) {
                                    hVar.m(i4, y321.c.g(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (s(length2, obj)) {
                                    hVar.n(i4, y321.c.h(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (s(length2, obj)) {
                                    hVar.o(i4, y321.c.g(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (s(length2, obj)) {
                                    hVar.p(i4, y321.c.h(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (s(length2, obj)) {
                                    hVar.h(i4, y321.c.i(W & 1048575, obj), p(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                p.B(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 19:
                                p.F(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 20:
                                p.I(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 21:
                                p.Q(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 22:
                                p.H(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 23:
                                p.E(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 24:
                                p.D(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 25:
                                p.z(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 26:
                                p.O(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar);
                                break;
                            case 27:
                                p.J(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, p(length2));
                                break;
                            case 28:
                                p.A(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar);
                                break;
                            case 29:
                                p.P(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 30:
                                p.C(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 31:
                                p.K(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 32:
                                p.L(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 33:
                                p.M(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 34:
                                p.N(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, false);
                                break;
                            case 35:
                                p.B(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 36:
                                p.F(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 37:
                                p.I(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 38:
                                p.Q(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 39:
                                p.H(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 40:
                                p.E(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 41:
                                p.D(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 42:
                                p.z(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 43:
                                p.P(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 44:
                                p.C(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 45:
                                p.K(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 46:
                                p.L(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 47:
                                p.M(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 48:
                                p.N(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, true);
                                break;
                            case 49:
                                p.G(iArr2[length2], (List) y321.c.i(W & 1048575, obj), hVar, p(length2));
                                break;
                            case 50:
                                if (y321.c.i(W & 1048575, obj) != null) {
                                    Object o = o(length2);
                                    fi00Var.getClass();
                                    b64.D(o);
                                    throw null;
                                }
                                break;
                            case SAFETY_TIPS_VALUE:
                                if (u(i4, length2, obj)) {
                                    hVar.c(i4, ((Double) y321.c.i(W & 1048575, obj)).doubleValue());
                                    break;
                                } else {
                                    break;
                                }
                            case 52:
                                if (u(i4, length2, obj)) {
                                    hVar.g(i4, ((Float) y321.c.i(W & 1048575, obj)).floatValue());
                                    break;
                                } else {
                                    break;
                                }
                            case 53:
                                if (u(i4, length2, obj)) {
                                    hVar.j(i4, F(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 54:
                                if (u(i4, length2, obj)) {
                                    hVar.r(i4, F(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case SODA_DE_DE_VALUE:
                                if (u(i4, length2, obj)) {
                                    hVar.i(i4, E(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (u(i4, length2, obj)) {
                                    hVar.f(i4, F(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case SODA_ES_ES_VALUE:
                                if (u(i4, length2, obj)) {
                                    hVar.e(i4, E(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (u(i4, length2, obj)) {
                                    hVar.a(i4, ((Boolean) y321.c.i(W & 1048575, obj)).booleanValue());
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (u(i4, length2, obj)) {
                                    Y(i4, y321.c.i(W & 1048575, obj), hVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 60:
                                if (u(i4, length2, obj)) {
                                    hVar.k(i4, y321.c.i(W & 1048575, obj), p(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 61:
                                if (u(i4, length2, obj)) {
                                    hVar.b(i4, (ByteString) y321.c.i(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (u(i4, length2, obj)) {
                                    hVar.q(i4, E(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                                if (u(i4, length2, obj)) {
                                    hVar.d(i4, E(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (u(i4, length2, obj)) {
                                    hVar.m(i4, E(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (u(i4, length2, obj)) {
                                    hVar.n(i4, F(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 66:
                                if (u(i4, length2, obj)) {
                                    hVar.o(i4, E(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case 67:
                                if (u(i4, length2, obj)) {
                                    hVar.p(i4, F(W & 1048575, obj));
                                    break;
                                } else {
                                    break;
                                }
                            case TRANSLATE_KIT_VALUE:
                                if (u(i4, length2, obj)) {
                                    hVar.h(i4, y321.c.i(W & 1048575, obj), p(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    if (entry2 != null) {
                        return;
                    }
                    ryoVar.g(entry2);
                    throw null;
                }
            }
            entry2 = null;
            while (length2 >= 0) {
            }
            if (entry2 != null) {
            }
        } else {
            if (!this.h) {
                X(obj, hVar);
                return;
            }
            if (z) {
                xxq c2 = ryoVar.c(obj);
                if (!c2.d()) {
                    entry = (Map.Entry) c2.f().next();
                    length = iArr2.length;
                    i = 0;
                    while (i < length) {
                        int W2 = W(i);
                        int i5 = iArr2[i];
                        if (entry != null) {
                            ryoVar.a(entry);
                            throw null;
                        }
                        switch (V(W2)) {
                            case 0:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.c(i5, y321.c.e(W2 & i2, obj));
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 1:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.g(i5, y321.c.f(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 2:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.j(i5, y321.c.h(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 3:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.r(i5, y321.c.h(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 4:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.i(i5, y321.c.g(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 5:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.f(i5, y321.c.h(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 6:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.e(i5, y321.c.g(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 7:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.a(i5, y321.c.c(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 8:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    Y(i5, y321.c.i(W2 & i2, obj), hVar);
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 9:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.k(i5, y321.c.i(W2 & i2, obj), p(i));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 10:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.b(i5, (ByteString) y321.c.i(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 11:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.q(i5, y321.c.g(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 12:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.d(i5, y321.c.g(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 13:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.m(i5, y321.c.g(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 14:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.n(i5, y321.c.h(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 15:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.o(i5, y321.c.g(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 16:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.p(i5, y321.c.h(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 17:
                                i2 = i3;
                                iArr = iArr2;
                                if (s(i, obj)) {
                                    hVar.h(i5, y321.c.i(W2 & i2, obj), p(i));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 18:
                                i2 = i3;
                                iArr = iArr2;
                                p.B(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 19:
                                i2 = i3;
                                iArr = iArr2;
                                p.F(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 20:
                                i2 = i3;
                                iArr = iArr2;
                                p.I(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 21:
                                i2 = i3;
                                iArr = iArr2;
                                p.Q(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 22:
                                i2 = i3;
                                iArr = iArr2;
                                p.H(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 23:
                                i2 = i3;
                                iArr = iArr2;
                                p.E(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 24:
                                i2 = i3;
                                iArr = iArr2;
                                p.D(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 25:
                                i2 = i3;
                                iArr = iArr2;
                                p.z(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 26:
                                i2 = i3;
                                iArr = iArr2;
                                p.O(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 27:
                                i2 = i3;
                                iArr = iArr2;
                                p.J(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, p(i));
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 28:
                                i2 = i3;
                                iArr = iArr2;
                                p.A(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 29:
                                i2 = i3;
                                iArr = iArr2;
                                p.P(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 30:
                                i2 = i3;
                                iArr = iArr2;
                                p.C(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 31:
                                i2 = i3;
                                iArr = iArr2;
                                p.K(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 32:
                                i2 = i3;
                                iArr = iArr2;
                                p.L(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 33:
                                i2 = i3;
                                iArr = iArr2;
                                p.M(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 34:
                                i2 = i3;
                                iArr = iArr2;
                                p.N(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, false);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 35:
                                i2 = i3;
                                iArr = iArr2;
                                p.B(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 36:
                                i2 = i3;
                                iArr = iArr2;
                                p.F(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 37:
                                i2 = i3;
                                iArr = iArr2;
                                p.I(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 38:
                                i2 = i3;
                                iArr = iArr2;
                                p.Q(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 39:
                                i2 = i3;
                                iArr = iArr2;
                                p.H(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 40:
                                i2 = i3;
                                iArr = iArr2;
                                p.E(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 41:
                                i2 = i3;
                                iArr = iArr2;
                                p.D(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 42:
                                i2 = i3;
                                iArr = iArr2;
                                p.z(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 43:
                                i2 = i3;
                                iArr = iArr2;
                                p.P(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 44:
                                i2 = i3;
                                iArr = iArr2;
                                p.C(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 45:
                                i2 = i3;
                                iArr = iArr2;
                                p.K(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 46:
                                i2 = i3;
                                iArr = iArr2;
                                p.L(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 47:
                                i2 = i3;
                                iArr = iArr2;
                                p.M(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 48:
                                i2 = i3;
                                iArr = iArr2;
                                p.N(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, true);
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 49:
                                i2 = i3;
                                iArr = iArr2;
                                p.G(iArr[i], (List) y321.c.i(W2 & i2, obj), hVar, p(i));
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 50:
                                i2 = i3;
                                iArr = iArr2;
                                if (y321.c.i(W2 & i2, obj) != null) {
                                    Object o2 = o(i);
                                    fi00Var.getClass();
                                    b64.D(o2);
                                    throw null;
                                }
                                continue;
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case SAFETY_TIPS_VALUE:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.c(i5, ((Double) y321.c.i(W2 & i2, obj)).doubleValue());
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 52:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.g(i5, ((Float) y321.c.i(W2 & i2, obj)).floatValue());
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 53:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.j(i5, F(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 54:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.r(i5, F(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case SODA_DE_DE_VALUE:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.i(i5, E(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 56:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.f(i5, F(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case SODA_ES_ES_VALUE:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.e(i5, E(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 58:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.a(i5, ((Boolean) y321.c.i(W2 & i2, obj)).booleanValue());
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 59:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    Y(i5, y321.c.i(W2 & i2, obj), hVar);
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 60:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.k(i5, y321.c.i(W2 & i2, obj), p(i));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 61:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.b(i5, (ByteString) y321.c.i(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 62:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.q(i5, E(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.d(i5, E(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 64:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.m(i5, E(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 65:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.n(i5, F(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 66:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.o(i5, E(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case 67:
                                i2 = i3;
                                iArr = iArr2;
                                if (u(i5, i, obj)) {
                                    hVar.p(i5, F(W2 & i2, obj));
                                } else {
                                    continue;
                                }
                                i += 3;
                                i3 = i2;
                                iArr2 = iArr;
                            case TRANSLATE_KIT_VALUE:
                                if (u(i5, i, obj)) {
                                    i2 = i3;
                                    iArr = iArr2;
                                    hVar.h(i5, y321.c.i(W2 & i3, obj), p(i));
                                    i += 3;
                                    i3 = i2;
                                    iArr2 = iArr;
                                }
                                break;
                        }
                        i2 = i3;
                        iArr = iArr2;
                        i += 3;
                        i3 = i2;
                        iArr2 = iArr;
                    }
                    if (entry == null) {
                        ryoVar.g(entry);
                        throw null;
                    }
                    ((s) qVar).getClass();
                    ((GeneratedMessageLite) obj).unknownFields.e(hVar);
                    return;
                }
            }
            entry = null;
            length = iArr2.length;
            i = 0;
            while (i < length) {
            }
            if (entry == null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x06ac A[Catch: all -> 0x04bd, TryCatch #10 {all -> 0x04bd, blocks: (B:37:0x06a7, B:39:0x06ac, B:40:0x06b1, B:128:0x0408, B:131:0x040d, B:132:0x041f, B:133:0x0431, B:134:0x0443, B:135:0x0456, B:136:0x0469, B:137:0x047c, B:138:0x048f, B:139:0x04a2, B:140:0x04c0, B:141:0x04dc, B:142:0x04f8, B:143:0x0514, B:144:0x0530, B:145:0x054f, B:146:0x056b, B:147:0x0581, B:148:0x059d, B:149:0x05ab, B:150:0x05c9, B:151:0x05e5, B:152:0x0601, B:153:0x061d, B:154:0x0639, B:155:0x0655, B:156:0x0673, B:164:0x0690), top: B:36:0x06a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x06b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x06d3 A[LOOP:3: B:52:0x06d1->B:53:0x06d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x06dd  */
    @Override // defpackage.rom0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Object obj, f fVar, oyo oyoVar) {
        n nVar;
        int[] iArr;
        ryo ryoVar;
        oyo oyoVar2;
        f fVar2;
        int V;
        gry gryVar;
        n nVar2 = this;
        Object obj2 = obj;
        f fVar3 = fVar;
        oyo oyoVar3 = oyoVar;
        oyoVar3.getClass();
        l(obj2);
        q qVar = nVar2.n;
        ryo ryoVar2 = nVar2.o;
        int[] iArr2 = nVar2.i;
        int i = nVar2.k;
        int i2 = nVar2.j;
        r rVar = null;
        while (true) {
            try {
                int a = fVar3.a();
                int S = (a < nVar2.c || a > nVar2.d) ? -1 : nVar2.S(a, 0);
                if (S >= 0) {
                    int W = nVar2.W(S);
                    try {
                        V = V(W);
                        gryVar = nVar2.m;
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        ryoVar = ryoVar2;
                        iArr = iArr2;
                    }
                    switch (V) {
                        case 0:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D = D(W);
                            fVar2.v(1);
                            try {
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                obj2 = obj;
                            } catch (Throwable th) {
                                th = th;
                                obj2 = obj;
                            }
                            try {
                                y321.c.m(obj, D, fVar2.a.l());
                                obj2 = obj;
                                nVar.Q(S, obj2);
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                obj2 = obj;
                                try {
                                    qVar.getClass();
                                    if (rVar == null) {
                                    }
                                    if (!qVar.b(rVar, fVar2)) {
                                    }
                                    nVar2 = nVar;
                                    fVar3 = fVar2;
                                    oyoVar3 = oyoVar2;
                                    iArr2 = iArr;
                                    ryoVar2 = ryoVar;
                                } catch (Throwable th2) {
                                    th = th2;
                                    while (i2 < i) {
                                        nVar.m(iArr[i2], obj2, rVar);
                                        i2++;
                                    }
                                    if (rVar != null) {
                                        qVar.c(obj2, rVar);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                obj2 = obj;
                                while (i2 < i) {
                                }
                                if (rVar != null) {
                                }
                                throw th;
                            }
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                            break;
                        case 1:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D2 = D(W);
                            fVar2.v(5);
                            y321.c.n(obj2, D2, fVar2.a.p());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 2:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D3 = D(W);
                            fVar2.v(0);
                            y321.o(obj2, D3, fVar2.a.r());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 3:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D4 = D(W);
                            fVar2.v(0);
                            y321.o(obj2, D4, fVar2.a.A());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 4:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D5 = D(W);
                            fVar2.v(0);
                            y321.n(D5, obj2, fVar2.a.q());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 5:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D6 = D(W);
                            fVar2.v(1);
                            y321.o(obj2, D6, fVar2.a.o());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 6:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D7 = D(W);
                            fVar2.v(5);
                            y321.n(D7, obj2, fVar2.a.n());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 7:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D8 = D(W);
                            fVar2.v(0);
                            y321.c.k(obj2, D8, fVar2.a.i());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 8:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar.N(obj2, W, fVar2);
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 9:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            vt10 vt10Var = (vt10) nVar.z(S, obj2);
                            rom0 p = nVar.p(S);
                            fVar2.v(2);
                            fVar2.c(vt10Var, p, oyoVar2);
                            nVar.T(S, obj2, vt10Var);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 10:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            y321.p(D(W), obj2, fVar2.e());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 11:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D9 = D(W);
                            fVar2.v(0);
                            y321.n(D9, obj2, fVar2.a.z());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 12:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            fVar2.v(0);
                            int m = fVar2.a.m();
                            nVar.n(S);
                            y321.n(D(W), obj2, m);
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 13:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D10 = D(W);
                            fVar2.v(5);
                            y321.n(D10, obj2, fVar2.a.s());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 14:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D11 = D(W);
                            fVar2.v(1);
                            y321.o(obj2, D11, fVar2.a.t());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 15:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D12 = D(W);
                            fVar2.v(0);
                            y321.n(D12, obj2, fVar2.a.u());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 16:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            long D13 = D(W);
                            fVar2.v(0);
                            y321.o(obj2, D13, fVar2.a.v());
                            nVar.Q(S, obj2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 17:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            vt10 vt10Var2 = (vt10) nVar.z(S, obj2);
                            rom0 p2 = nVar.p(S);
                            fVar2.v(3);
                            fVar2.b(vt10Var2, p2, oyoVar2);
                            nVar.T(S, obj2, vt10Var2);
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 18:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            fVar2.g(gryVar.c(D(W), obj2));
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 19:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            fVar2.k(gryVar.c(D(W), obj2));
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 20:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            fVar2.m(gryVar.c(D(W), obj2));
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 21:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            fVar2.t(gryVar.c(D(W), obj2));
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 22:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            fVar2.l(gryVar.c(D(W), obj2));
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 23:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            fVar2.j(gryVar.c(W & 1048575, obj2));
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 24:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            fVar2.i(gryVar.c(W & 1048575, obj2));
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 25:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            fVar2.d(gryVar.c(W & 1048575, obj2));
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 26:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            try {
                                nVar.O(obj2, W, fVar2);
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                qVar.getClass();
                                if (rVar == null) {
                                    rVar = qVar.a(obj2);
                                }
                                if (!qVar.b(rVar, fVar2)) {
                                    while (i2 < i) {
                                        nVar.m(iArr[i2], obj2, rVar);
                                        i2++;
                                    }
                                    if (rVar == null) {
                                        return;
                                    }
                                    qVar.c(obj2, rVar);
                                    return;
                                }
                                nVar2 = nVar;
                                fVar3 = fVar2;
                                oyoVar3 = oyoVar2;
                                iArr2 = iArr;
                                ryoVar2 = ryoVar;
                            }
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 27:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            nVar2.M(obj2, W, fVar3, nVar2.p(S), oyoVar);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 28:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.f(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 29:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.s(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 30:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.h(gryVar.c(W & 1048575, obj2));
                            nVar2.n(S);
                            Class cls = p.a;
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 31:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.n(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 32:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.o(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 33:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.p(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 34:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.q(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 35:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.g(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 36:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.k(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 37:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.m(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 38:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.t(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 39:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.l(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 40:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.j(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 41:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.i(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 42:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.d(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 43:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.s(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 44:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.h(gryVar.c(W & 1048575, obj2));
                            nVar2.n(S);
                            Class cls2 = p.a;
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 45:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.n(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 46:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.o(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 47:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.p(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 48:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.q(gryVar.c(W & 1048575, obj2));
                            oyoVar2 = oyoVar;
                            nVar = nVar2;
                            fVar2 = fVar3;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 49:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            try {
                                f fVar4 = fVar3;
                                try {
                                    nVar2.L(obj2, W & 1048575, fVar4, nVar2.p(S), oyoVar);
                                    fVar3 = fVar4;
                                    oyoVar2 = oyoVar;
                                    nVar = nVar2;
                                    fVar2 = fVar3;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                    oyoVar2 = oyoVar;
                                    nVar = nVar2;
                                    fVar2 = fVar4;
                                    qVar.getClass();
                                    if (rVar == null) {
                                    }
                                    if (!qVar.b(rVar, fVar2)) {
                                    }
                                    nVar2 = nVar;
                                    fVar3 = fVar2;
                                    oyoVar3 = oyoVar2;
                                    iArr2 = iArr;
                                    ryoVar2 = ryoVar;
                                }
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                oyoVar2 = oyoVar;
                                nVar = nVar2;
                                fVar2 = fVar3;
                            }
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                            break;
                        case 50:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            nVar2.w(S, obj2, nVar2.o(S));
                            throw null;
                            break;
                        case SAFETY_TIPS_VALUE:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(1);
                            y321.p(W & 1048575, obj2, Double.valueOf(fVar3.a.l()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 52:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(5);
                            y321.p(W & 1048575, obj2, Float.valueOf(fVar3.a.p()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 53:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(0);
                            y321.p(W & 1048575, obj2, Long.valueOf(fVar3.a.r()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 54:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(0);
                            y321.p(W & 1048575, obj2, Long.valueOf(fVar3.a.A()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case SODA_DE_DE_VALUE:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(0);
                            y321.p(W & 1048575, obj2, Integer.valueOf(fVar3.a.q()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 56:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(1);
                            y321.p(W & 1048575, obj2, Long.valueOf(fVar3.a.o()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case SODA_ES_ES_VALUE:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(5);
                            y321.p(W & 1048575, obj2, Integer.valueOf(fVar3.a.n()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 58:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(0);
                            y321.p(W & 1048575, obj2, Boolean.valueOf(fVar3.a.i()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 59:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            nVar2.N(obj2, W, fVar3);
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 60:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            vt10 vt10Var3 = (vt10) nVar2.A(a, S, obj2);
                            rom0 p3 = nVar2.p(S);
                            fVar3.v(2);
                            fVar3.c(vt10Var3, p3, oyoVar3);
                            nVar2.U(a, obj2, vt10Var3, S);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 61:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            y321.p(W & 1048575, obj2, fVar3.e());
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 62:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(0);
                            y321.p(W & 1048575, obj2, Integer.valueOf(fVar3.a.z()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(0);
                            int m2 = fVar3.a.m();
                            nVar2.n(S);
                            y321.p(W & 1048575, obj2, Integer.valueOf(m2));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 64:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(5);
                            y321.p(W & 1048575, obj2, Integer.valueOf(fVar3.a.s()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 65:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(1);
                            y321.p(W & 1048575, obj2, Long.valueOf(fVar3.a.t()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 66:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar3.v(0);
                            y321.p(W & 1048575, obj2, Integer.valueOf(fVar3.a.u()));
                            nVar2.R(a, S, obj2);
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        case 67:
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            long j = W & 1048575;
                            try {
                                try {
                                    fVar3.v(0);
                                    y321.p(j, obj2, Long.valueOf(fVar3.a.v()));
                                    nVar2.R(a, S, obj2);
                                    fVar2 = fVar3;
                                    oyoVar2 = oyoVar3;
                                    nVar = nVar2;
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                    fVar2 = fVar3;
                                    oyoVar2 = oyoVar3;
                                    nVar = nVar2;
                                    qVar.getClass();
                                    if (rVar == null) {
                                    }
                                    if (!qVar.b(rVar, fVar2)) {
                                    }
                                    nVar2 = nVar;
                                    fVar3 = fVar2;
                                    oyoVar3 = oyoVar2;
                                    iArr2 = iArr;
                                    ryoVar2 = ryoVar;
                                }
                                nVar2 = nVar;
                                fVar3 = fVar2;
                                oyoVar3 = oyoVar2;
                                iArr2 = iArr;
                                ryoVar2 = ryoVar;
                            } catch (Throwable th4) {
                                th = th4;
                                nVar = nVar2;
                                while (i2 < i) {
                                }
                                if (rVar != null) {
                                }
                                throw th;
                            }
                            break;
                        case TRANSLATE_KIT_VALUE:
                            vt10 vt10Var4 = (vt10) nVar2.A(a, S, obj2);
                            rom0 p4 = nVar2.p(S);
                            fVar3.v(3);
                            fVar3.b(vt10Var4, p4, oyoVar3);
                            nVar2.U(a, obj2, vt10Var4, S);
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                        default:
                            if (rVar == null) {
                                try {
                                    rVar = qVar.a(obj2);
                                } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                    ryoVar = ryoVar2;
                                    iArr = iArr2;
                                    fVar2 = fVar3;
                                    oyoVar2 = oyoVar3;
                                    nVar = nVar2;
                                    qVar.getClass();
                                    if (rVar == null) {
                                    }
                                    if (!qVar.b(rVar, fVar2)) {
                                    }
                                    nVar2 = nVar;
                                    fVar3 = fVar2;
                                    oyoVar3 = oyoVar2;
                                    iArr2 = iArr;
                                    ryoVar2 = ryoVar;
                                }
                            }
                            if (!qVar.b(rVar, fVar3)) {
                                while (i2 < i) {
                                    nVar2.m(iArr2[i2], obj2, rVar);
                                    i2++;
                                }
                                if (rVar == null) {
                                    return;
                                }
                            }
                            ryoVar = ryoVar2;
                            iArr = iArr2;
                            fVar2 = fVar3;
                            oyoVar2 = oyoVar3;
                            nVar = nVar2;
                            nVar2 = nVar;
                            fVar3 = fVar2;
                            oyoVar3 = oyoVar2;
                            iArr2 = iArr;
                            ryoVar2 = ryoVar;
                            break;
                    }
                } else if (a == Integer.MAX_VALUE) {
                    while (i2 < i) {
                        nVar2.m(iArr2[i2], obj2, rVar);
                        i2++;
                    }
                    if (rVar == null) {
                        return;
                    }
                } else {
                    if (nVar2.f) {
                        ryoVar2.b(oyoVar3, nVar2.e, a);
                    }
                    qVar.getClass();
                    if (rVar == null) {
                        rVar = qVar.a(obj2);
                    }
                    if (!qVar.b(rVar, fVar3)) {
                        while (i2 < i) {
                            nVar2.m(iArr2[i2], obj2, rVar);
                            i2++;
                        }
                        if (rVar == null) {
                            return;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                nVar = nVar2;
                iArr = iArr2;
            }
        }
    }

    public final boolean k(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return s(i, generatedMessageLite) == s(i, generatedMessageLite2);
    }

    public final void m(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (y321.c.i(W(i) & 1048575, obj) == null) {
            return;
        }
        n(i);
    }

    public final void n(int i) {
        if (this.b[qv10.b(i, 3, 2, 1)] == null) {
            return;
        }
        ny61.u();
    }

    public final Object o(int i) {
        return this.b[(i / 3) * 2];
    }

    public final rom0 p(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        rom0 rom0Var = (rom0) objArr[i2];
        if (rom0Var != null) {
            return rom0Var;
        }
        rom0 a = cvf0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    public final int q(a aVar) {
        int i;
        int i2;
        int k;
        int i3;
        int f;
        int d;
        int i4;
        int h;
        int D;
        int i5;
        Unsafe unsafe = r;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i8 >= iArr.length) {
                ((s) this.n).getClass();
                int b = ((GeneratedMessageLite) aVar).unknownFields.b() + i9;
                if (this.f) {
                    this.o.c(aVar).c();
                }
                return b;
            }
            int W = W(i8);
            int i11 = iArr[i8];
            int V = V(W);
            if (V <= 17) {
                int i12 = iArr[i8 + 2];
                int i13 = i12 & i6;
                i = 1 << (i12 >>> 20);
                if (i13 != i7) {
                    i10 = unsafe.getInt(aVar, i13);
                    i7 = i13;
                }
            } else {
                i = 0;
            }
            long j = W & i6;
            switch (V) {
                case 0:
                    if ((i10 & i) != 0) {
                        i9 = qv10.a(i11, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if ((i10 & i) != 0) {
                        i9 = qv10.a(i11, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if ((i & i10) != 0) {
                        long j2 = unsafe.getLong(aVar, j);
                        i2 = g.i(i11);
                        k = g.k(j2);
                        d = k + i2;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if ((i & i10) != 0) {
                        long j3 = unsafe.getLong(aVar, j);
                        i2 = g.i(i11);
                        k = g.k(j3);
                        d = k + i2;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if ((i & i10) != 0) {
                        int i14 = unsafe.getInt(aVar, j);
                        i3 = g.i(i11);
                        f = g.f(i14);
                        d = f + i3;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if ((i10 & i) != 0) {
                        d = g.d(i11);
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if ((i10 & i) != 0) {
                        d = g.c(i11);
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if ((i10 & i) != 0) {
                        i9 = qv10.a(i11, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if ((i & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(aVar, j);
                        if (object instanceof ByteString) {
                            int i15 = g.i(i11);
                            int size = ((ByteString) object).size();
                            D = qv10.D(size, size, i15, i9);
                            i9 = D;
                            break;
                        } else {
                            i4 = g.i(i11);
                            h = g.h((String) object);
                            D = h + i4 + i9;
                            i9 = D;
                        }
                    }
                case 9:
                    if ((i & i10) != 0) {
                        d = p.l(i11, unsafe.getObject(aVar, j), p(i8));
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if ((i & i10) != 0) {
                        d = g.a(i11, (ByteString) unsafe.getObject(aVar, j));
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if ((i & i10) != 0) {
                        int i16 = unsafe.getInt(aVar, j);
                        i3 = g.i(i11);
                        f = g.j(i16);
                        d = f + i3;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if ((i & i10) != 0) {
                        int i17 = unsafe.getInt(aVar, j);
                        i3 = g.i(i11);
                        f = g.f(i17);
                        d = f + i3;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if ((i10 & i) != 0) {
                        i9 = qv10.a(i11, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if ((i10 & i) != 0) {
                        i9 = qv10.a(i11, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if ((i & i10) != 0) {
                        int i18 = unsafe.getInt(aVar, j);
                        i3 = g.i(i11);
                        f = g.j((i18 >> 31) ^ (i18 << 1));
                        d = f + i3;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if ((i & i10) != 0) {
                        long j4 = unsafe.getLong(aVar, j);
                        i2 = g.i(i11);
                        k = g.k((j4 >> 63) ^ (j4 << 1));
                        d = k + i2;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if ((i & i10) != 0) {
                        d = g.e(i11, (vt10) unsafe.getObject(aVar, j), p(i8));
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    d = p.f(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 19:
                    d = p.d(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 20:
                    d = p.j(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 21:
                    d = p.u(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 22:
                    d = p.h(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 23:
                    d = p.f(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 24:
                    d = p.d(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 25:
                    List list = (List) unsafe.getObject(aVar, j);
                    Class cls = p.a;
                    int size2 = list.size();
                    i9 += size2 == 0 ? 0 : (g.i(i11) + 1) * size2;
                    break;
                case 26:
                    d = p.r(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 27:
                    d = p.m(i11, (List) unsafe.getObject(aVar, j), p(i8));
                    i9 += d;
                    break;
                case 28:
                    d = p.a(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 29:
                    d = p.s(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 30:
                    d = p.b(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 31:
                    d = p.d(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 32:
                    d = p.f(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 33:
                    d = p.n(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 34:
                    d = p.p(i11, (List) unsafe.getObject(aVar, j));
                    i9 += d;
                    break;
                case 35:
                    int g = p.g((List) unsafe.getObject(aVar, j));
                    if (g > 0) {
                        i9 = qv10.D(g, g.i(i11), g, i9);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e = p.e((List) unsafe.getObject(aVar, j));
                    if (e > 0) {
                        i9 = qv10.D(e, g.i(i11), e, i9);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k2 = p.k((List) unsafe.getObject(aVar, j));
                    if (k2 > 0) {
                        i9 = qv10.D(k2, g.i(i11), k2, i9);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int v = p.v((List) unsafe.getObject(aVar, j));
                    if (v > 0) {
                        i9 = qv10.D(v, g.i(i11), v, i9);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i19 = p.i((List) unsafe.getObject(aVar, j));
                    if (i19 > 0) {
                        i9 = qv10.D(i19, g.i(i11), i19, i9);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g2 = p.g((List) unsafe.getObject(aVar, j));
                    if (g2 > 0) {
                        i9 = qv10.D(g2, g.i(i11), g2, i9);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e2 = p.e((List) unsafe.getObject(aVar, j));
                    if (e2 > 0) {
                        i9 = qv10.D(e2, g.i(i11), e2, i9);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list2 = (List) unsafe.getObject(aVar, j);
                    Class cls2 = p.a;
                    int size3 = list2.size();
                    if (size3 > 0) {
                        i9 = qv10.D(size3, g.i(i11), size3, i9);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int t = p.t((List) unsafe.getObject(aVar, j));
                    if (t > 0) {
                        i9 = qv10.D(t, g.i(i11), t, i9);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c = p.c((List) unsafe.getObject(aVar, j));
                    if (c > 0) {
                        i9 = qv10.D(c, g.i(i11), c, i9);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e3 = p.e((List) unsafe.getObject(aVar, j));
                    if (e3 > 0) {
                        i9 = qv10.D(e3, g.i(i11), e3, i9);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g3 = p.g((List) unsafe.getObject(aVar, j));
                    if (g3 > 0) {
                        i9 = qv10.D(g3, g.i(i11), g3, i9);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int o = p.o((List) unsafe.getObject(aVar, j));
                    if (o > 0) {
                        i9 = qv10.D(o, g.i(i11), o, i9);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int q2 = p.q((List) unsafe.getObject(aVar, j));
                    if (q2 > 0) {
                        i9 = qv10.D(q2, g.i(i11), q2, i9);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list3 = (List) unsafe.getObject(aVar, j);
                    rom0 p = p(i8);
                    Class cls3 = p.a;
                    int size4 = list3.size();
                    if (size4 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i20 = 0; i20 < size4; i20++) {
                            i5 += g.e(i11, (vt10) list3.get(i20), p);
                        }
                    }
                    i9 += i5;
                    break;
                case 50:
                    Object object2 = unsafe.getObject(aVar, j);
                    Object o2 = o(i8);
                    this.p.getClass();
                    fi00.a(object2, o2);
                    break;
                case SAFETY_TIPS_VALUE:
                    if (u(i11, i8, aVar)) {
                        i9 = qv10.a(i11, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i11, i8, aVar)) {
                        i9 = qv10.a(i11, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i11, i8, aVar)) {
                        long F = F(j, aVar);
                        i2 = g.i(i11);
                        k = g.k(F);
                        d = k + i2;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i11, i8, aVar)) {
                        long F2 = F(j, aVar);
                        i2 = g.i(i11);
                        k = g.k(F2);
                        d = k + i2;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case SODA_DE_DE_VALUE:
                    if (u(i11, i8, aVar)) {
                        int E = E(j, aVar);
                        i3 = g.i(i11);
                        f = g.f(E);
                        d = f + i3;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i11, i8, aVar)) {
                        d = g.d(i11);
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    if (u(i11, i8, aVar)) {
                        d = g.c(i11);
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i11, i8, aVar)) {
                        i9 = qv10.a(i11, 1, i9);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!u(i11, i8, aVar)) {
                        break;
                    } else {
                        Object object3 = unsafe.getObject(aVar, j);
                        if (object3 instanceof ByteString) {
                            int i21 = g.i(i11);
                            int size5 = ((ByteString) object3).size();
                            D = qv10.D(size5, size5, i21, i9);
                            i9 = D;
                            break;
                        } else {
                            i4 = g.i(i11);
                            h = g.h((String) object3);
                            D = h + i4 + i9;
                            i9 = D;
                        }
                    }
                case 60:
                    if (u(i11, i8, aVar)) {
                        d = p.l(i11, unsafe.getObject(aVar, j), p(i8));
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i11, i8, aVar)) {
                        d = g.a(i11, (ByteString) unsafe.getObject(aVar, j));
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i11, i8, aVar)) {
                        int E2 = E(j, aVar);
                        i3 = g.i(i11);
                        f = g.j(E2);
                        d = f + i3;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (u(i11, i8, aVar)) {
                        int E3 = E(j, aVar);
                        i3 = g.i(i11);
                        f = g.f(E3);
                        d = f + i3;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i11, i8, aVar)) {
                        i9 = qv10.a(i11, 4, i9);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i11, i8, aVar)) {
                        i9 = qv10.a(i11, 8, i9);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i11, i8, aVar)) {
                        int E4 = E(j, aVar);
                        i3 = g.i(i11);
                        f = g.j((E4 >> 31) ^ (E4 << 1));
                        d = f + i3;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i11, i8, aVar)) {
                        long F3 = F(j, aVar);
                        i2 = g.i(i11);
                        k = g.k((F3 >> 63) ^ (F3 << 1));
                        d = k + i2;
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (u(i11, i8, aVar)) {
                        d = g.e(i11, (vt10) unsafe.getObject(aVar, j), p(i8));
                        i9 += d;
                        break;
                    } else {
                        break;
                    }
            }
            i8 += 3;
            i6 = 1048575;
        }
    }

    public final int r(a aVar) {
        int i;
        int k;
        int i2;
        int f;
        int d;
        int i3;
        int h;
        int i4;
        int k2;
        int i5;
        Unsafe unsafe = r;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i6 >= iArr.length) {
                ((s) this.n).getClass();
                return ((GeneratedMessageLite) aVar).unknownFields.b() + i7;
            }
            int W = W(i6);
            int V = V(W);
            int i8 = iArr[i6];
            long j = W & 1048575;
            if (V >= FieldType.DOUBLE_LIST_PACKED.a() && V <= FieldType.SINT64_LIST_PACKED.a()) {
                int i9 = iArr[i6 + 2];
            }
            switch (V) {
                case 0:
                    if (s(i6, aVar)) {
                        i7 = qv10.a(i8, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (s(i6, aVar)) {
                        i7 = qv10.a(i8, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (s(i6, aVar)) {
                        long h2 = y321.c.h(j, aVar);
                        i = g.i(i8);
                        k = g.k(h2);
                        d = k + i;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (s(i6, aVar)) {
                        long h3 = y321.c.h(j, aVar);
                        i = g.i(i8);
                        k = g.k(h3);
                        d = k + i;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (s(i6, aVar)) {
                        int g = y321.c.g(j, aVar);
                        i2 = g.i(i8);
                        f = g.f(g);
                        d = f + i2;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (s(i6, aVar)) {
                        d = g.d(i8);
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (s(i6, aVar)) {
                        d = g.c(i8);
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (s(i6, aVar)) {
                        i7 = qv10.a(i8, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (s(i6, aVar)) {
                        Object i10 = y321.c.i(j, aVar);
                        if (i10 instanceof ByteString) {
                            int i11 = g.i(i8);
                            int size = ((ByteString) i10).size();
                            i7 = qv10.D(size, size, i11, i7);
                            break;
                        } else {
                            i3 = g.i(i8);
                            h = g.h((String) i10);
                            i7 = h + i3 + i7;
                            break;
                        }
                    } else {
                        break;
                    }
                case 9:
                    if (s(i6, aVar)) {
                        d = p.l(i8, y321.c.i(j, aVar), p(i6));
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (s(i6, aVar)) {
                        d = g.a(i8, (ByteString) y321.c.i(j, aVar));
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (s(i6, aVar)) {
                        int g2 = y321.c.g(j, aVar);
                        i2 = g.i(i8);
                        f = g.j(g2);
                        d = f + i2;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (s(i6, aVar)) {
                        int g3 = y321.c.g(j, aVar);
                        i2 = g.i(i8);
                        f = g.f(g3);
                        d = f + i2;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (s(i6, aVar)) {
                        i7 = qv10.a(i8, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (s(i6, aVar)) {
                        i7 = qv10.a(i8, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (s(i6, aVar)) {
                        int g4 = y321.c.g(j, aVar);
                        i2 = g.i(i8);
                        f = g.j((g4 >> 31) ^ (g4 << 1));
                        d = f + i2;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (s(i6, aVar)) {
                        long h4 = y321.c.h(j, aVar);
                        i4 = g.i(i8);
                        k2 = g.k((h4 >> 63) ^ (h4 << 1));
                        d = k2 + i4;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (s(i6, aVar)) {
                        d = g.e(i8, (vt10) y321.c.i(j, aVar), p(i6));
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    d = p.f(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 19:
                    d = p.d(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 20:
                    d = p.j(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 21:
                    d = p.u(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 22:
                    d = p.h(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 23:
                    d = p.f(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 24:
                    d = p.d(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 25:
                    List v = v(aVar, j);
                    Class cls = p.a;
                    int size2 = v.size();
                    i7 += size2 == 0 ? 0 : (g.i(i8) + 1) * size2;
                    break;
                case 26:
                    d = p.r(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 27:
                    d = p.m(i8, v(aVar, j), p(i6));
                    i7 += d;
                    break;
                case 28:
                    d = p.a(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 29:
                    d = p.s(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 30:
                    d = p.b(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 31:
                    d = p.d(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 32:
                    d = p.f(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 33:
                    d = p.n(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 34:
                    d = p.p(i8, v(aVar, j));
                    i7 += d;
                    break;
                case 35:
                    int g5 = p.g((List) unsafe.getObject(aVar, j));
                    if (g5 > 0) {
                        i7 = qv10.D(g5, g.i(i8), g5, i7);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    int e = p.e((List) unsafe.getObject(aVar, j));
                    if (e > 0) {
                        i7 = qv10.D(e, g.i(i8), e, i7);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int k3 = p.k((List) unsafe.getObject(aVar, j));
                    if (k3 > 0) {
                        i7 = qv10.D(k3, g.i(i8), k3, i7);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int v2 = p.v((List) unsafe.getObject(aVar, j));
                    if (v2 > 0) {
                        i7 = qv10.D(v2, g.i(i8), v2, i7);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int i12 = p.i((List) unsafe.getObject(aVar, j));
                    if (i12 > 0) {
                        i7 = qv10.D(i12, g.i(i8), i12, i7);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int g6 = p.g((List) unsafe.getObject(aVar, j));
                    if (g6 > 0) {
                        i7 = qv10.D(g6, g.i(i8), g6, i7);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int e2 = p.e((List) unsafe.getObject(aVar, j));
                    if (e2 > 0) {
                        i7 = qv10.D(e2, g.i(i8), e2, i7);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list = (List) unsafe.getObject(aVar, j);
                    Class cls2 = p.a;
                    int size3 = list.size();
                    if (size3 > 0) {
                        i7 = qv10.D(size3, g.i(i8), size3, i7);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int t = p.t((List) unsafe.getObject(aVar, j));
                    if (t > 0) {
                        i7 = qv10.D(t, g.i(i8), t, i7);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int c = p.c((List) unsafe.getObject(aVar, j));
                    if (c > 0) {
                        i7 = qv10.D(c, g.i(i8), c, i7);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int e3 = p.e((List) unsafe.getObject(aVar, j));
                    if (e3 > 0) {
                        i7 = qv10.D(e3, g.i(i8), e3, i7);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int g7 = p.g((List) unsafe.getObject(aVar, j));
                    if (g7 > 0) {
                        i7 = qv10.D(g7, g.i(i8), g7, i7);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int o = p.o((List) unsafe.getObject(aVar, j));
                    if (o > 0) {
                        i7 = qv10.D(o, g.i(i8), o, i7);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int q2 = p.q((List) unsafe.getObject(aVar, j));
                    if (q2 > 0) {
                        i7 = qv10.D(q2, g.i(i8), q2, i7);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List v3 = v(aVar, j);
                    rom0 p = p(i6);
                    Class cls3 = p.a;
                    int size4 = v3.size();
                    if (size4 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i13 = 0; i13 < size4; i13++) {
                            i5 += g.e(i8, (vt10) v3.get(i13), p);
                        }
                    }
                    i7 += i5;
                    break;
                case 50:
                    Object i14 = y321.c.i(j, aVar);
                    Object o2 = o(i6);
                    this.p.getClass();
                    fi00.a(i14, o2);
                    break;
                case SAFETY_TIPS_VALUE:
                    if (u(i8, i6, aVar)) {
                        i7 = qv10.a(i8, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i8, i6, aVar)) {
                        i7 = qv10.a(i8, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i8, i6, aVar)) {
                        long F = F(j, aVar);
                        i = g.i(i8);
                        k = g.k(F);
                        d = k + i;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i8, i6, aVar)) {
                        long F2 = F(j, aVar);
                        i = g.i(i8);
                        k = g.k(F2);
                        d = k + i;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case SODA_DE_DE_VALUE:
                    if (u(i8, i6, aVar)) {
                        int E = E(j, aVar);
                        i2 = g.i(i8);
                        f = g.f(E);
                        d = f + i2;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i8, i6, aVar)) {
                        d = g.d(i8);
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    if (u(i8, i6, aVar)) {
                        d = g.c(i8);
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i8, i6, aVar)) {
                        i7 = qv10.a(i8, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i8, i6, aVar)) {
                        Object i15 = y321.c.i(j, aVar);
                        if (i15 instanceof ByteString) {
                            int i16 = g.i(i8);
                            int size5 = ((ByteString) i15).size();
                            i7 = qv10.D(size5, size5, i16, i7);
                            break;
                        } else {
                            i3 = g.i(i8);
                            h = g.h((String) i15);
                            i7 = h + i3 + i7;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (u(i8, i6, aVar)) {
                        d = p.l(i8, y321.c.i(j, aVar), p(i6));
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i8, i6, aVar)) {
                        d = g.a(i8, (ByteString) y321.c.i(j, aVar));
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i8, i6, aVar)) {
                        int E2 = E(j, aVar);
                        i2 = g.i(i8);
                        f = g.j(E2);
                        d = f + i2;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (u(i8, i6, aVar)) {
                        int E3 = E(j, aVar);
                        i2 = g.i(i8);
                        f = g.f(E3);
                        d = f + i2;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i8, i6, aVar)) {
                        i7 = qv10.a(i8, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i8, i6, aVar)) {
                        i7 = qv10.a(i8, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i8, i6, aVar)) {
                        int E4 = E(j, aVar);
                        i2 = g.i(i8);
                        f = g.j((E4 >> 31) ^ (E4 << 1));
                        d = f + i2;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i8, i6, aVar)) {
                        long F3 = F(j, aVar);
                        i4 = g.i(i8);
                        k2 = g.k((F3 >> 63) ^ (F3 << 1));
                        d = k2 + i4;
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (u(i8, i6, aVar)) {
                        d = g.e(i8, (vt10) y321.c.i(j, aVar), p(i6));
                        i7 += d;
                        break;
                    } else {
                        break;
                    }
            }
            i6 += 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0110 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int W = W(i);
            long j2 = W & 1048575;
            switch (V(W)) {
                case 0:
                    return Double.doubleToRawLongBits(y321.c.e(j2, obj)) != 0;
                case 1:
                    if (Float.floatToRawIntBits(y321.c.f(j2, obj)) != 0) {
                    }
                    break;
                case 2:
                    if (y321.c.h(j2, obj) != 0) {
                    }
                    break;
                case 3:
                    if (y321.c.h(j2, obj) != 0) {
                    }
                    break;
                case 4:
                    if (y321.c.g(j2, obj) != 0) {
                    }
                    break;
                case 5:
                    if (y321.c.h(j2, obj) != 0) {
                    }
                    break;
                case 6:
                    if (y321.c.g(j2, obj) != 0) {
                    }
                    break;
                case 7:
                    return y321.c.c(j2, obj);
                case 8:
                    Object i3 = y321.c.i(j2, obj);
                    if (i3 instanceof String) {
                        return !((String) i3).isEmpty();
                    }
                    if (i3 instanceof ByteString) {
                        return !ByteString.a.equals(i3);
                    }
                    w511.q();
                    return false;
                case 9:
                    if (y321.c.i(j2, obj) != null) {
                    }
                    break;
                case 10:
                    return !ByteString.a.equals(y321.c.i(j2, obj));
                case 11:
                    if (y321.c.g(j2, obj) != 0) {
                    }
                    break;
                case 12:
                    if (y321.c.g(j2, obj) != 0) {
                    }
                    break;
                case 13:
                    if (y321.c.g(j2, obj) != 0) {
                    }
                    break;
                case 14:
                    if (y321.c.h(j2, obj) != 0) {
                    }
                    break;
                case 15:
                    if (y321.c.g(j2, obj) != 0) {
                    }
                    break;
                case 16:
                    if (y321.c.h(j2, obj) != 0) {
                    }
                    break;
                case 17:
                    if (y321.c.i(j2, obj) != null) {
                    }
                    break;
                default:
                    w511.q();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & y321.c.g(j, obj)) != 0) {
        }
    }

    public final boolean u(int i, int i2, Object obj) {
        return y321.c.g((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void w(int i, Object obj, Object obj2) {
        long W = W(i) & 1048575;
        Object i2 = y321.c.i(W, obj);
        fi00 fi00Var = this.p;
        if (i2 != null) {
            fi00Var.getClass();
            if (!((MapFieldLite) i2).f()) {
                MapFieldLite i3 = MapFieldLite.b().i();
                fi00.b(i3, i2);
                y321.p(W, obj, i3);
                i2 = i3;
            }
        } else {
            fi00Var.getClass();
            i2 = MapFieldLite.b().i();
            y321.p(W, obj, i2);
        }
        fi00Var.getClass();
        b64.D(obj2);
        throw null;
    }

    public final void x(int i, Object obj, Object obj2) {
        if (s(i, obj2)) {
            long W = W(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, W);
            if (object == null) {
                yci0.h(this.a[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            rom0 p = p(i);
            if (!s(i, obj)) {
                if (t(object)) {
                    Object d = p.d();
                    p.b(d, object);
                    unsafe.putObject(obj, W, d);
                } else {
                    unsafe.putObject(obj, W, object);
                }
                Q(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, W);
            if (!t(object2)) {
                Object d2 = p.d();
                p.b(d2, object2);
                unsafe.putObject(obj, W, d2);
                object2 = d2;
            }
            p.b(object2, object);
        }
    }

    public final void y(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (u(i2, i, obj2)) {
            long W = W(i) & 1048575;
            Unsafe unsafe = r;
            Object object = unsafe.getObject(obj2, W);
            if (object == null) {
                yci0.h(iArr[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            rom0 p = p(i);
            if (!u(i2, i, obj)) {
                if (t(object)) {
                    Object d = p.d();
                    p.b(d, object);
                    unsafe.putObject(obj, W, d);
                } else {
                    unsafe.putObject(obj, W, object);
                }
                R(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, W);
            if (!t(object2)) {
                Object d2 = p.d();
                p.b(d2, object2);
                unsafe.putObject(obj, W, d2);
                object2 = d2;
            }
            p.b(object2, object);
        }
    }

    public final Object z(int i, Object obj) {
        rom0 p = p(i);
        long W = W(i) & 1048575;
        if (!s(i, obj)) {
            return p.d();
        }
        Object object = r.getObject(obj, W);
        if (t(object)) {
            return object;
        }
        Object d = p.d();
        if (object != null) {
            p.b(d, object);
        }
        return d;
    }
}
