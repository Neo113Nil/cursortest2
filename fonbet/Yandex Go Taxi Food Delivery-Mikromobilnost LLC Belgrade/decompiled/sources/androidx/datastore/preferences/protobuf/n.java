package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.ByteString;
import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import defpackage.a421;
import defpackage.am2;
import defpackage.au50;
import defpackage.b64;
import defpackage.cxs0;
import defpackage.fvf0;
import defpackage.gxs0;
import defpackage.hi00;
import defpackage.iry;
import defpackage.ivf0;
import defpackage.j7y;
import defpackage.ny61;
import defpackage.oh00;
import defpackage.pqw;
import defpackage.q9;
import defpackage.qv10;
import defpackage.qyo;
import defpackage.t560;
import defpackage.tom0;
import defpackage.tqw;
import defpackage.tyo;
import defpackage.unr0;
import defpackage.v3y;
import defpackage.v9i0;
import defpackage.w511;
import defpackage.x321;
import defpackage.xt10;
import defpackage.yci0;
import defpackage.yv4;
import defpackage.zxq;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class n implements tom0 {
    public static final int[] p = new int[0];
    public static final Unsafe q = a421.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final xt10 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final t560 k;
    public final iry l;
    public final q m;
    public final tyo n;
    public final hi00 o;

    public n(int[] iArr, Object[] objArr, int i, int i2, xt10 xt10Var, int[] iArr2, int i3, int i4, t560 t560Var, iry iryVar, q qVar, tyo tyoVar, hi00 hi00Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = xt10Var instanceof GeneratedMessageLite;
        this.f = tyoVar != null && (xt10Var instanceof GeneratedMessageLite.a);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = t560Var;
        this.l = iryVar;
        this.m = qVar;
        this.n = tyoVar;
        this.e = xt10Var;
        this.o = hi00Var;
    }

    public static Field F(Class cls, String str) {
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

    public static int K(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void O(int i, Object obj, au50 au50Var) {
        if (!(obj instanceof String)) {
            au50Var.l(i, (ByteString) obj);
        } else {
            ((i) au50Var.b).w(i, (String) obj);
        }
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).j();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static n w(v9i0 v9i0Var, t560 t560Var, iry iryVar, q qVar, tyo tyoVar, hi00 hi00Var) {
        int i;
        int charAt;
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char charAt2;
        int i9;
        char charAt3;
        int i10;
        char charAt4;
        int i11;
        char charAt5;
        int i12;
        char charAt6;
        int i13;
        char charAt7;
        int i14;
        char charAt8;
        int i15;
        char charAt9;
        Object[] objArr;
        int i16;
        int i17;
        int i18;
        Object[] objArr2;
        int i19;
        int objectFieldOffset;
        String str;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field F;
        int i25;
        char charAt10;
        int i26;
        int i27;
        Field F2;
        Field F3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        String str2 = v9i0Var.b;
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
        int charAt15 = str2.charAt(i);
        if (charAt15 >= 55296) {
            int i35 = charAt15 & 8191;
            int i36 = 13;
            while (true) {
                i32 = i34 + 1;
                charAt14 = str2.charAt(i34);
                if (charAt14 < 55296) {
                    break;
                }
                i35 |= (charAt14 & 8191) << i36;
                i36 += 13;
                i34 = i32;
            }
            charAt15 = i35 | (charAt14 << i36);
            i34 = i32;
        }
        if (charAt15 == 0) {
            i3 = 0;
            i6 = 0;
            charAt = 0;
            i2 = 0;
            i5 = 0;
            i7 = 0;
            iArr = p;
            i4 = 0;
        } else {
            int i37 = i34 + 1;
            int charAt16 = str2.charAt(i34);
            if (charAt16 >= 55296) {
                int i38 = charAt16 & 8191;
                int i39 = 13;
                while (true) {
                    i15 = i37 + 1;
                    charAt9 = str2.charAt(i37);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i38 |= (charAt9 & 8191) << i39;
                    i39 += 13;
                    i37 = i15;
                }
                charAt16 = i38 | (charAt9 << i39);
                i37 = i15;
            }
            int i40 = i37 + 1;
            int charAt17 = str2.charAt(i37);
            if (charAt17 >= 55296) {
                int i41 = charAt17 & 8191;
                int i42 = 13;
                while (true) {
                    i14 = i40 + 1;
                    charAt8 = str2.charAt(i40);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i41 |= (charAt8 & 8191) << i42;
                    i42 += 13;
                    i40 = i14;
                }
                charAt17 = i41 | (charAt8 << i42);
                i40 = i14;
            }
            int i43 = i40 + 1;
            int charAt18 = str2.charAt(i40);
            if (charAt18 >= 55296) {
                int i44 = charAt18 & 8191;
                int i45 = 13;
                while (true) {
                    i13 = i43 + 1;
                    charAt7 = str2.charAt(i43);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i44 |= (charAt7 & 8191) << i45;
                    i45 += 13;
                    i43 = i13;
                }
                charAt18 = i44 | (charAt7 << i45);
                i43 = i13;
            }
            int i46 = i43 + 1;
            int charAt19 = str2.charAt(i43);
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i12 = i46 + 1;
                    charAt6 = str2.charAt(i46);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i47 |= (charAt6 & 8191) << i48;
                    i48 += 13;
                    i46 = i12;
                }
                charAt19 = i47 | (charAt6 << i48);
                i46 = i12;
            }
            int i49 = i46 + 1;
            charAt = str2.charAt(i46);
            if (charAt >= 55296) {
                int i50 = charAt & 8191;
                int i51 = 13;
                while (true) {
                    i11 = i49 + 1;
                    charAt5 = str2.charAt(i49);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i50 |= (charAt5 & 8191) << i51;
                    i51 += 13;
                    i49 = i11;
                }
                charAt = i50 | (charAt5 << i51);
                i49 = i11;
            }
            int i52 = i49 + 1;
            int charAt20 = str2.charAt(i49);
            if (charAt20 >= 55296) {
                int i53 = charAt20 & 8191;
                int i54 = 13;
                while (true) {
                    i10 = i52 + 1;
                    charAt4 = str2.charAt(i52);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i53 |= (charAt4 & 8191) << i54;
                    i54 += 13;
                    i52 = i10;
                }
                charAt20 = i53 | (charAt4 << i54);
                i52 = i10;
            }
            int i55 = i52 + 1;
            int charAt21 = str2.charAt(i52);
            if (charAt21 >= 55296) {
                int i56 = charAt21 & 8191;
                int i57 = 13;
                while (true) {
                    i9 = i55 + 1;
                    charAt3 = str2.charAt(i55);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i56 |= (charAt3 & 8191) << i57;
                    i57 += 13;
                    i55 = i9;
                }
                charAt21 = i56 | (charAt3 << i57);
                i55 = i9;
            }
            int i58 = i55 + 1;
            int charAt22 = str2.charAt(i55);
            if (charAt22 >= 55296) {
                int i59 = charAt22 & 8191;
                int i60 = 13;
                while (true) {
                    i8 = i58 + 1;
                    charAt2 = str2.charAt(i58);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i59 |= (charAt2 & 8191) << i60;
                    i60 += 13;
                    i58 = i8;
                }
                charAt22 = i59 | (charAt2 << i60);
                i58 = i8;
            }
            int[] iArr2 = new int[charAt22 + charAt20 + charAt21];
            int i61 = (charAt16 * 2) + charAt17;
            int i62 = charAt20;
            i2 = charAt18;
            i3 = i62;
            i4 = charAt16;
            i34 = i58;
            iArr = iArr2;
            i5 = charAt19;
            i6 = i61;
            i7 = charAt22;
        }
        Unsafe unsafe = q;
        Object[] objArr3 = v9i0Var.c;
        Class<?> cls = v9i0Var.a.getClass();
        int[] iArr3 = new int[charAt * 3];
        Object[] objArr4 = new Object[charAt * 2];
        int i63 = i7 + i3;
        int i64 = i63;
        int i65 = i7;
        int i66 = 0;
        int i67 = 0;
        while (i34 < length) {
            int i68 = i34 + 1;
            int charAt23 = str2.charAt(i34);
            int i69 = length;
            if (charAt23 >= 55296) {
                int i70 = charAt23 & 8191;
                int i71 = i68;
                int i72 = 13;
                while (true) {
                    i31 = i71 + 1;
                    charAt13 = str2.charAt(i71);
                    objArr = objArr3;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i70 |= (charAt13 & 8191) << i72;
                    i72 += 13;
                    i71 = i31;
                    objArr3 = objArr;
                }
                charAt23 = i70 | (charAt13 << i72);
                i16 = i31;
            } else {
                objArr = objArr3;
                i16 = i68;
            }
            int i73 = i16 + 1;
            int charAt24 = str2.charAt(i16);
            if (charAt24 >= 55296) {
                int i74 = charAt24 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i29 = i75 + 1;
                    charAt12 = str2.charAt(i75);
                    i30 = i74;
                    if (charAt12 < 55296) {
                        break;
                    }
                    i74 = i30 | ((charAt12 & 8191) << i76);
                    i76 += 13;
                    i75 = i29;
                }
                charAt24 = i30 | (charAt12 << i76);
                i17 = i29;
            } else {
                i17 = i73;
            }
            int i77 = charAt23;
            int i78 = charAt24 & 255;
            int[] iArr4 = iArr3;
            if ((charAt24 & 1024) != 0) {
                iArr[i67] = i66;
                i67++;
            }
            int i79 = i4;
            if (i78 >= 51) {
                int i80 = i17 + 1;
                int charAt25 = str2.charAt(i17);
                char c = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = 13;
                    while (true) {
                        i28 = i80 + 1;
                        charAt11 = str2.charAt(i80);
                        if (charAt11 < c) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i82;
                        i82 += 13;
                        i80 = i28;
                        c = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i82);
                    i80 = i28;
                }
                int i83 = i78 - 51;
                int i84 = charAt25;
                if (i83 == 9 || i83 == 17) {
                    i27 = i80;
                    objArr4[qv10.b(i66, 3, 2, 1)] = objArr[i6];
                    i6++;
                } else if (i83 != 12 || (!v9i0Var.a().equals(ProtoSyntax.PROTO2) && (charAt24 & 2048) == 0)) {
                    i27 = i80;
                } else {
                    i27 = i80;
                    objArr4[qv10.b(i66, 3, 2, 1)] = objArr[i6];
                    i6++;
                }
                int i85 = i84 * 2;
                Object obj = objArr[i85];
                if (obj instanceof Field) {
                    F2 = (Field) obj;
                } else {
                    F2 = F(cls, (String) obj);
                    objArr[i85] = F2;
                }
                int i86 = i63;
                i20 = i6;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(F2);
                int i87 = i85 + 1;
                Object obj2 = objArr[i87];
                if (obj2 instanceof Field) {
                    F3 = (Field) obj2;
                } else {
                    F3 = F(cls, (String) obj2);
                    objArr[i87] = F3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(F3);
                str = str2;
                objectFieldOffset = objectFieldOffset2;
                i21 = i66;
                i23 = i27;
                i22 = objectFieldOffset3;
                i18 = i86;
                objArr2 = objArr4;
                i24 = 0;
            } else {
                int i88 = i63;
                int i89 = i6 + 1;
                Field F4 = F(cls, (String) objArr[i6]);
                if (i78 == 9 || i78 == 17) {
                    i18 = i88;
                    objArr4[qv10.b(i66, 3, 2, 1)] = F4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i18 = i88;
                        i26 = i6 + 2;
                        objArr4[qv10.b(i66, 3, 2, 1)] = objArr[i89];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i18 = i88;
                        if (v9i0Var.a() == ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
                            i26 = i6 + 2;
                            objArr4[qv10.b(i66, 3, 2, 1)] = objArr[i89];
                        }
                    } else if (i78 == 50) {
                        int i90 = i65 + 1;
                        iArr[i65] = i66;
                        int i91 = (i66 / 3) * 2;
                        int i92 = i6 + 2;
                        objArr4[i91] = objArr[i89];
                        if ((charAt24 & 2048) != 0) {
                            i19 = i6 + 3;
                            objArr4[i91 + 1] = objArr[i92];
                            i18 = i88;
                            objArr2 = objArr4;
                            i65 = i90;
                        } else {
                            i19 = i92;
                            i65 = i90;
                            i18 = i88;
                            objArr2 = objArr4;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                        if ((charAt24 & 4096) != 0 || i78 > 17) {
                            str = str2;
                            i20 = i19;
                            i21 = i66;
                            i22 = 1048575;
                            i23 = i17;
                            i24 = 0;
                        } else {
                            i23 = i17 + 1;
                            int charAt26 = str2.charAt(i17);
                            if (charAt26 >= 55296) {
                                int i93 = charAt26 & 8191;
                                int i94 = 13;
                                while (true) {
                                    i25 = i23 + 1;
                                    charAt10 = str2.charAt(i23);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i93 |= (charAt10 & 8191) << i94;
                                    i94 += 13;
                                    i23 = i25;
                                }
                                charAt26 = i93 | (charAt10 << i94);
                                i23 = i25;
                            }
                            int i95 = (charAt26 / 32) + (i79 * 2);
                            Object obj3 = objArr[i95];
                            str = str2;
                            if (obj3 instanceof Field) {
                                F = (Field) obj3;
                            } else {
                                F = F(cls, (String) obj3);
                                objArr[i95] = F;
                            }
                            i20 = i19;
                            i21 = i66;
                            i22 = (int) unsafe.objectFieldOffset(F);
                            i24 = charAt26 % 32;
                        }
                        if (i78 >= 18 && i78 <= 49) {
                            iArr[i64] = objectFieldOffset;
                            i64++;
                        }
                    } else {
                        i18 = i88;
                    }
                    objArr2 = objArr4;
                    i19 = i26;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                    if ((charAt24 & 4096) != 0) {
                    }
                    str = str2;
                    i20 = i19;
                    i21 = i66;
                    i22 = 1048575;
                    i23 = i17;
                    i24 = 0;
                    if (i78 >= 18) {
                        iArr[i64] = objectFieldOffset;
                        i64++;
                    }
                }
                objArr2 = objArr4;
                i19 = i89;
                objectFieldOffset = (int) unsafe.objectFieldOffset(F4);
                if ((charAt24 & 4096) != 0) {
                }
                str = str2;
                i20 = i19;
                i21 = i66;
                i22 = 1048575;
                i23 = i17;
                i24 = 0;
                if (i78 >= 18) {
                }
            }
            int i96 = i21 + 1;
            iArr4[i21] = i77;
            int i97 = i21 + 2;
            int i98 = i21;
            iArr4[i96] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? SelfTester_JCP.IMITA : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i78 << 20) | objectFieldOffset;
            i66 = i98 + 3;
            iArr4[i97] = (i24 << 20) | i22;
            objArr4 = objArr2;
            i34 = i23;
            length = i69;
            iArr3 = iArr4;
            objArr3 = objArr;
            i63 = i18;
            i6 = i20;
            i4 = i79;
            str2 = str;
        }
        xt10 xt10Var = v9i0Var.a;
        v9i0Var.a();
        return new n(iArr3, objArr4, i2, i5, xt10Var, iArr, i7, i63, t560Var, iryVar, qVar, tyoVar, hi00Var);
    }

    public static long x(int i) {
        return i & 1048575;
    }

    public static int y(long j, Object obj) {
        return ((Integer) a421.c.h(j, obj)).intValue();
    }

    public static long z(long j, Object obj) {
        return ((Long) a421.c.h(j, obj)).longValue();
    }

    public final int A(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    public final void B(Object obj, long j, f fVar, tom0 tom0Var, qyo qyoVar) {
        int y;
        this.l.getClass();
        pqw a = iry.a(j, obj);
        yv4 yv4Var = fVar.a;
        int i = fVar.b;
        if ((i & 7) != 3) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            GeneratedMessageLite d = tom0Var.d();
            fVar.b(d, tom0Var, qyoVar);
            tom0Var.c(d);
            a.add(d);
            if (yv4Var.e() || fVar.d != 0) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == i);
        fVar.d = y;
    }

    public final void C(Object obj, int i, f fVar, tom0 tom0Var, qyo qyoVar) {
        int y;
        this.l.getClass();
        pqw a = iry.a(i & 1048575, obj);
        yv4 yv4Var = fVar.a;
        int i2 = fVar.b;
        if ((i2 & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            GeneratedMessageLite d = tom0Var.d();
            fVar.c(d, tom0Var, qyoVar);
            tom0Var.c(d);
            a.add(d);
            if (yv4Var.e() || fVar.d != 0) {
                return;
            } else {
                y = yv4Var.y();
            }
        } while (y == i2);
        fVar.d = y;
    }

    public final void D(Object obj, int i, f fVar) {
        if ((536870912 & i) != 0) {
            fVar.w(2);
            a421.o(i & 1048575, obj, fVar.a.x());
        } else if (!this.g) {
            a421.o(i & 1048575, obj, fVar.e());
        } else {
            fVar.w(2);
            a421.o(i & 1048575, obj, fVar.a.w());
        }
    }

    public final void E(Object obj, int i, f fVar) {
        boolean z = (536870912 & i) != 0;
        iry iryVar = this.l;
        if (z) {
            iryVar.getClass();
            fVar.s(iry.a(i & 1048575, obj), true);
        } else {
            iryVar.getClass();
            fVar.s(iry.a(i & 1048575, obj), false);
        }
    }

    public final void G(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        a421.m(j, obj, (1 << (i2 >>> 20)) | a421.c.f(j, obj));
    }

    public final void H(int i, int i2, Object obj) {
        a421.m(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final void I(Object obj, int i, xt10 xt10Var) {
        q.putObject(obj, L(i) & 1048575, xt10Var);
        G(i, obj);
    }

    public final void J(Object obj, int i, int i2, xt10 xt10Var) {
        q.putObject(obj, L(i2) & 1048575, xt10Var);
        H(i, i2, obj);
    }

    public final int L(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [long] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(Object obj, au50 au50Var) {
        Map.Entry entry;
        int length;
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        n nVar = this;
        boolean z3 = nVar.f;
        tyo tyoVar = nVar.n;
        if (z3) {
            ((j) tyoVar).getClass();
            zxq zxqVar = ((GeneratedMessageLite.a) obj).extensions;
            if (!zxqVar.a.isEmpty()) {
                entry = (Map.Entry) zxqVar.c().next();
                int[] iArr = nVar.a;
                length = iArr.length;
                Unsafe unsafe = q;
                int i4 = 1048575;
                int i5 = 0;
                for (i = 0; i < length; i += 3) {
                    int L = nVar.L(i);
                    int i6 = iArr[i];
                    int K = K(L);
                    if (K <= 17) {
                        int i7 = iArr[i + 2];
                        z = 1;
                        int i8 = i7 & 1048575;
                        if (i8 != i4) {
                            i5 = i8 == 1048575 ? 0 : unsafe.getInt(obj, i8);
                            i4 = i8;
                        }
                        i2 = L;
                        i3 = 1 << (i7 >>> 20);
                    } else {
                        z = 1;
                        i2 = L;
                        i3 = 0;
                    }
                    if (entry != null) {
                        ((j) tyoVar).getClass();
                        b64.D(entry.getKey());
                        throw null;
                    }
                    long j = i2 & 1048575;
                    switch (K) {
                        case 0:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                double d = a421.c.d(j, obj);
                                i iVar = (i) au50Var.b;
                                iVar.getClass();
                                iVar.o(i6, Double.doubleToRawLongBits(d));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                float e = a421.c.e(j, obj);
                                i iVar2 = (i) au50Var.b;
                                iVar2.getClass();
                                iVar2.m(i6, Float.floatToRawIntBits(e));
                            }
                            nVar = this;
                            break;
                        case 2:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).B(i6, unsafe.getLong(obj, j));
                            }
                            nVar = this;
                            break;
                        case 3:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).B(i6, unsafe.getLong(obj, j));
                            }
                            nVar = this;
                            break;
                        case 4:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).q(i6, unsafe.getInt(obj, j));
                            }
                            nVar = this;
                            break;
                        case 5:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).o(i6, unsafe.getLong(obj, j));
                            }
                            nVar = this;
                            break;
                        case 6:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).m(i6, unsafe.getInt(obj, j));
                            }
                            nVar = this;
                            break;
                        case 7:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).i(i6, a421.c.c(j, obj));
                            }
                            nVar = this;
                            break;
                        case 8:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                O(i6, unsafe.getObject(obj, j), au50Var);
                            }
                            nVar = this;
                            break;
                        case 9:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).s(i6, (xt10) unsafe.getObject(obj, j), nVar.m(i));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                au50Var.l(i6, (ByteString) unsafe.getObject(obj, j));
                            }
                            nVar = this;
                            break;
                        case 11:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).z(i6, unsafe.getInt(obj, j));
                            }
                            nVar = this;
                            break;
                        case 12:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).q(i6, unsafe.getInt(obj, j));
                            }
                            nVar = this;
                            break;
                        case 13:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).m(i6, unsafe.getInt(obj, j));
                            }
                            nVar = this;
                            break;
                        case 14:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                ((i) au50Var.b).o(i6, unsafe.getLong(obj, j));
                            }
                            nVar = this;
                            break;
                        case 15:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                int i9 = unsafe.getInt(obj, j);
                                ((i) au50Var.b).z(i6, (i9 >> 31) ^ (i9 << 1));
                            }
                            nVar = this;
                            break;
                        case 16:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                long j2 = unsafe.getLong(obj, j);
                                ((i) au50Var.b).B(i6, (j2 << 1) ^ (j2 >> 63));
                            }
                            nVar = this;
                            break;
                        case 17:
                            if (nVar.o(obj, i, i4, i5, i3)) {
                                au50Var.m(i6, unsafe.getObject(obj, j), nVar.m(i));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            z2 = false;
                            p.p(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 19:
                            z2 = false;
                            p.t(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 20:
                            z2 = false;
                            p.w(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 21:
                            z2 = false;
                            p.E(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 22:
                            z2 = false;
                            p.v(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 23:
                            z2 = false;
                            p.s(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 24:
                            z2 = false;
                            p.r(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 25:
                            z2 = false;
                            p.n(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 26:
                            p.C(iArr[i], (List) unsafe.getObject(obj, j), au50Var);
                            break;
                        case 27:
                            p.x(iArr[i], (List) unsafe.getObject(obj, j), au50Var, nVar.m(i));
                            break;
                        case 28:
                            p.o(iArr[i], (List) unsafe.getObject(obj, j), au50Var);
                            break;
                        case 29:
                            z2 = false;
                            p.D(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 30:
                            z2 = false;
                            p.q(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 31:
                            z2 = false;
                            p.y(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 32:
                            z2 = false;
                            p.z(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 33:
                            z2 = false;
                            p.A(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 34:
                            z2 = false;
                            p.B(iArr[i], (List) unsafe.getObject(obj, j), au50Var, false);
                            break;
                        case 35:
                            p.p(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 36:
                            p.t(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 37:
                            p.w(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 38:
                            p.E(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 39:
                            p.v(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 40:
                            p.s(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 41:
                            p.r(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 42:
                            p.n(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 43:
                            p.D(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 44:
                            p.q(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 45:
                            p.y(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 46:
                            p.z(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 47:
                            p.A(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 48:
                            p.B(iArr[i], (List) unsafe.getObject(obj, j), au50Var, z);
                            break;
                        case 49:
                            p.u(iArr[i], (List) unsafe.getObject(obj, j), au50Var, nVar.m(i));
                            break;
                        case 50:
                            nVar.N(au50Var, i6, unsafe.getObject(obj, j), i);
                            break;
                        case SAFETY_TIPS_VALUE:
                            if (nVar.q(i6, i, obj)) {
                                double doubleValue = ((Double) a421.c.h(j, obj)).doubleValue();
                                i iVar3 = (i) au50Var.b;
                                iVar3.getClass();
                                iVar3.o(i6, Double.doubleToRawLongBits(doubleValue));
                            }
                            break;
                        case 52:
                            if (nVar.q(i6, i, obj)) {
                                float floatValue = ((Float) a421.c.h(j, obj)).floatValue();
                                i iVar4 = (i) au50Var.b;
                                iVar4.getClass();
                                iVar4.m(i6, Float.floatToRawIntBits(floatValue));
                            }
                            break;
                        case 53:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).B(i6, z(j, obj));
                            }
                            break;
                        case 54:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).B(i6, z(j, obj));
                            }
                            break;
                        case SODA_DE_DE_VALUE:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).q(i6, y(j, obj));
                            }
                            break;
                        case 56:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).o(i6, z(j, obj));
                            }
                            break;
                        case SODA_ES_ES_VALUE:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).m(i6, y(j, obj));
                            }
                            break;
                        case 58:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).i(i6, ((Boolean) a421.c.h(j, obj)).booleanValue());
                            }
                            break;
                        case 59:
                            if (nVar.q(i6, i, obj)) {
                                O(i6, unsafe.getObject(obj, j), au50Var);
                            }
                            break;
                        case 60:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).s(i6, (xt10) unsafe.getObject(obj, j), nVar.m(i));
                            }
                            break;
                        case 61:
                            if (nVar.q(i6, i, obj)) {
                                au50Var.l(i6, (ByteString) unsafe.getObject(obj, j));
                            }
                            break;
                        case 62:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).z(i6, y(j, obj));
                            }
                            break;
                        case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).q(i6, y(j, obj));
                            }
                            break;
                        case 64:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).m(i6, y(j, obj));
                            }
                            break;
                        case 65:
                            if (nVar.q(i6, i, obj)) {
                                ((i) au50Var.b).o(i6, z(j, obj));
                            }
                            break;
                        case 66:
                            if (nVar.q(i6, i, obj)) {
                                int y = y(j, obj);
                                ((i) au50Var.b).z(i6, (y >> 31) ^ (y << 1));
                            }
                            break;
                        case 67:
                            if (nVar.q(i6, i, obj)) {
                                long z4 = z(j, obj);
                                ((i) au50Var.b).B(i6, (z4 << z) ^ (z4 >> 63));
                            }
                            break;
                        case TRANSLATE_KIT_VALUE:
                            if (nVar.q(i6, i, obj)) {
                                au50Var.m(i6, unsafe.getObject(obj, j), nVar.m(i));
                            }
                            break;
                    }
                }
                if (entry != null) {
                    ((s) nVar.m).getClass();
                    ((GeneratedMessageLite) obj).unknownFields.d(au50Var);
                    return;
                } else {
                    ((j) tyoVar).getClass();
                    b64.D(entry.getKey());
                    throw null;
                }
            }
        }
        entry = null;
        int[] iArr2 = nVar.a;
        length = iArr2.length;
        Unsafe unsafe2 = q;
        int i42 = 1048575;
        int i52 = 0;
        while (i < length) {
        }
        if (entry != null) {
        }
    }

    public final void N(au50 au50Var, int i, Object obj, int i2) {
        if (obj != null) {
            Object obj2 = this.b[(i2 / 3) * 2];
            this.o.getClass();
            am2 am2Var = ((oh00) obj2).a;
            i iVar = (i) au50Var.b;
            iVar.getClass();
            for (Map.Entry entry : ((MapFieldLite) obj).entrySet()) {
                iVar.y(i, 2);
                iVar.A(oh00.a(am2Var, entry.getKey(), entry.getValue()));
                Object key = entry.getKey();
                Object value = entry.getValue();
                zxq.e(iVar, (WireFormat$FieldType) am2Var.a, 1, key);
                zxq.e(iVar, (WireFormat$FieldType) am2Var.b, 2, value);
            }
        }
    }

    @Override // defpackage.tom0
    public final boolean a(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.i) {
            int i7 = this.h[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int L = L(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i4) {
                if (i10 != 1048575) {
                    i5 = q.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i5;
                i = i10;
            } else {
                int i12 = i5;
                i = i4;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & L) == 0 || o(obj, i2, i, i3, i11)) {
                int K = K(L);
                if (K == 9 || K == 17) {
                    if (o(obj, i2, i, i3, i11)) {
                        if (!m(i2).a(a421.c.h(L & 1048575, obj))) {
                        }
                    } else {
                        continue;
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                } else {
                    if (K != 27) {
                        if (K == 60 || K == 68) {
                            if (q(i8, i2, obj)) {
                                if (!m(i2).a(a421.c.h(L & 1048575, obj))) {
                                }
                            } else {
                                continue;
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        } else if (K != 49) {
                            if (K != 50) {
                                continue;
                            } else {
                                Object h = a421.c.h(L & 1048575, obj);
                                this.o.getClass();
                                MapFieldLite mapFieldLite = (MapFieldLite) h;
                                if (mapFieldLite.isEmpty()) {
                                    continue;
                                } else {
                                    if (((WireFormat$FieldType) ((oh00) this.b[(i2 / 3) * 2]).a.b).a() != WireFormat$JavaType.MESSAGE) {
                                        continue;
                                    } else {
                                        tom0 tom0Var = null;
                                        for (Object obj2 : mapFieldLite.values()) {
                                            if (tom0Var == null) {
                                                tom0Var = fvf0.c.a(obj2.getClass());
                                            }
                                            if (!tom0Var.a(obj2)) {
                                            }
                                        }
                                    }
                                }
                            }
                            i6++;
                            i4 = i;
                            i5 = i3;
                        }
                    }
                    List list = (List) a421.c.h(L & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        tom0 m = m(i2);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (m.a(list.get(i13))) {
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
            }
            return false;
        }
        if (this.f) {
            ((j) this.n).getClass();
            ((GeneratedMessageLite.a) obj).extensions.b();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.tom0
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!p(obj)) {
            ny61.g(qv10.o("Mutating immutable message: ", obj));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                p.l(this.m, obj4, obj2);
                if (this.f) {
                    p.k(this.n, obj4, obj2);
                    return;
                }
                return;
            }
            int L = L(i);
            long j = 1048575 & L;
            int i2 = iArr[i];
            switch (K(L)) {
                case 0:
                    if (n(i, obj2)) {
                        x321 x321Var = a421.c;
                        obj3 = obj;
                        x321Var.l(obj3, j, x321Var.d(j, obj2));
                        G(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i, obj2)) {
                        x321 x321Var2 = a421.c;
                        x321Var2.m(obj, j, x321Var2.e(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        a421.n(obj, j, a421.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        a421.n(obj, j, a421.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        a421.m(j, obj, a421.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        a421.n(obj, j, a421.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        a421.m(j, obj, a421.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        x321 x321Var3 = a421.c;
                        x321Var3.j(obj, j, x321Var3.c(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        a421.o(j, obj, a421.c.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    s(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        a421.o(j, obj, a421.c.h(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        a421.m(j, obj, a421.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        a421.m(j, obj, a421.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        a421.m(j, obj, a421.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        a421.n(obj, j, a421.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        a421.m(j, obj, a421.c.f(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        a421.n(obj, j, a421.c.g(j, obj2));
                        G(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    s(i, obj, obj2);
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
                    this.l.getClass();
                    x321 x321Var4 = a421.c;
                    pqw pqwVar = (pqw) x321Var4.h(j, obj);
                    pqw pqwVar2 = (pqw) x321Var4.h(j, obj2);
                    int size = pqwVar.size();
                    int size2 = pqwVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((q9) pqwVar).a) {
                            pqwVar = ((ivf0) pqwVar).d(size2 + size);
                        }
                        pqwVar.addAll(pqwVar2);
                    }
                    if (size > 0) {
                        pqwVar2 = pqwVar;
                    }
                    a421.o(j, obj, pqwVar2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = p.a;
                    x321 x321Var5 = a421.c;
                    Object h = x321Var5.h(j, obj);
                    Object h2 = x321Var5.h(j, obj2);
                    this.o.getClass();
                    a421.o(j, obj, hi00.a(h, h2));
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
                    if (q(i2, i, obj2)) {
                        a421.o(j, obj, a421.c.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    t(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (q(i2, i, obj2)) {
                        a421.o(j, obj, a421.c.h(j, obj2));
                        H(i2, i, obj);
                    }
                    obj3 = obj;
                    break;
                case TRANSLATE_KIT_VALUE:
                    t(i, obj, obj2);
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

    @Override // defpackage.tom0
    public final void c(Object obj) {
        if (p(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.d(Integer.MAX_VALUE);
                generatedMessageLite.memoizedHashCode = 0;
                generatedMessageLite.k();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int L = L(i);
                long j = 1048575 & L;
                int K = K(L);
                if (K != 9) {
                    if (K != 60 && K != 68) {
                        switch (K) {
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
                                this.l.getClass();
                                q9 q9Var = (q9) ((pqw) a421.c.h(j, obj));
                                if (q9Var.a) {
                                    q9Var.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = q;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.o.getClass();
                                    ((MapFieldLite) object).c();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (q(iArr[i], i, obj)) {
                        m(i).c(q.getObject(obj, j));
                    }
                }
                if (n(i, obj)) {
                    m(i).c(q.getObject(obj, j));
                }
            }
            ((s) this.m).getClass();
            r rVar = ((GeneratedMessageLite) obj).unknownFields;
            if (rVar.e) {
                rVar.e = false;
            }
            if (this.f) {
                ((j) this.n).getClass();
                ((GeneratedMessageLite.a) obj).extensions.d();
            }
        }
    }

    @Override // defpackage.tom0
    public final GeneratedMessageLite d() {
        this.k.getClass();
        return ((GeneratedMessageLite) this.e).l();
    }

    @Override // defpackage.tom0
    public final int e(a aVar) {
        int i;
        int d;
        int d2;
        int f;
        int d3;
        int f2;
        int d4;
        int d5;
        int e;
        int c;
        int d6;
        int size;
        int i2;
        int d7;
        int d8;
        int d9;
        int c2;
        int e2;
        int size2;
        int d10;
        int e3;
        int d11;
        int d12;
        int d13;
        int f3;
        int d14;
        int f4;
        int e4;
        n nVar = this;
        a aVar2 = aVar;
        int[] iArr = nVar.a;
        Unsafe unsafe = q;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < iArr.length) {
            int L = nVar.L(i5);
            int K = K(L);
            int i8 = iArr[i5];
            int i9 = iArr[i5 + 2];
            int i10 = i9 & i3;
            if (K <= 17) {
                if (i10 != i4) {
                    i6 = i10 == i3 ? 0 : unsafe.getInt(aVar2, i10);
                    i4 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = L & i3;
            if (K >= FieldType.DOUBLE_LIST_PACKED.a()) {
                FieldType.SINT64_LIST_PACKED.a();
            }
            switch (K) {
                case 0:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        i7 += i.d(i8) + 8;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        d = i.d(i8);
                        d5 = d + 4;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 2:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        long j2 = unsafe.getLong(aVar2, j);
                        d2 = i.d(i8);
                        f = i.f(j2);
                        i7 += f + d2;
                    }
                    nVar = this;
                    break;
                case 3:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(aVar2, j);
                        d2 = i.d(i8);
                        f = i.f(j3);
                        i7 += f + d2;
                    }
                    nVar = this;
                    break;
                case 4:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        int i11 = unsafe.getInt(aVar2, j);
                        d3 = i.d(i8);
                        f2 = i.f(i11);
                        d5 = f2 + d3;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 5:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        d4 = i.d(i8);
                        d5 = d4 + 8;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 6:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        d = i.d(i8);
                        d5 = d + 4;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 7:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        d5 = i.d(i8) + 1;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 8:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        Object object = unsafe.getObject(aVar2, j);
                        i7 = (object instanceof ByteString ? i.b(i8, (ByteString) object) : i.c((String) object) + i.d(i8)) + i7;
                    }
                    nVar = this;
                    break;
                case 9:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(aVar2, j);
                        tom0 m = nVar.m(i5);
                        Class cls = p.a;
                        if (object2 instanceof v3y) {
                            v3y v3yVar = (v3y) object2;
                            int d15 = i.d(i8);
                            int length = v3yVar.b != null ? ((ByteString.LiteralByteString) v3yVar.b).bytes.length : v3yVar.a != null ? ((GeneratedMessageLite) v3yVar.a).c(null) : 0;
                            e = i.e(length) + length + d15;
                        } else {
                            int d16 = i.d(i8);
                            int c3 = ((a) ((xt10) object2)).c(m);
                            e = d16 + i.e(c3) + c3;
                        }
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        d5 = i.b(i8, (ByteString) unsafe.getObject(aVar2, j));
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 11:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        int i12 = unsafe.getInt(aVar2, j);
                        d3 = i.d(i8);
                        f2 = i.e(i12);
                        d5 = f2 + d3;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 12:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        int i13 = unsafe.getInt(aVar2, j);
                        d3 = i.d(i8);
                        f2 = i.f(i13);
                        d5 = f2 + d3;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 13:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        d = i.d(i8);
                        d5 = d + 4;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 14:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        d4 = i.d(i8);
                        d5 = d4 + 8;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 15:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        int i14 = unsafe.getInt(aVar2, j);
                        d3 = i.d(i8);
                        f2 = i.e((i14 >> 31) ^ (i14 << 1));
                        d5 = f2 + d3;
                        i7 += d5;
                    }
                    nVar = this;
                    break;
                case 16:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        long j4 = unsafe.getLong(aVar2, j);
                        d2 = i.d(i8);
                        f = i.f((j4 >> 63) ^ (j4 << 1));
                        i7 += f + d2;
                    }
                    nVar = this;
                    break;
                case 17:
                    if (nVar.o(aVar2, i5, i4, i6, i)) {
                        c = ((a) ((xt10) unsafe.getObject(aVar2, j))).c(nVar.m(i5)) + (i.d(i8) * 2);
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    c = p.c(i8, (List) unsafe.getObject(aVar2, j));
                    i7 += c;
                    break;
                case 19:
                    c = p.b(i8, (List) unsafe.getObject(aVar2, j));
                    i7 += c;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(aVar2, j);
                    Class cls2 = p.a;
                    if (list.size() != 0) {
                        d6 = (i.d(i8) * list.size()) + p.e(list);
                        i7 += d6;
                        break;
                    }
                    d6 = 0;
                    i7 += d6;
                case 21:
                    List list2 = (List) unsafe.getObject(aVar2, j);
                    Class cls3 = p.a;
                    size = list2.size();
                    if (size != 0) {
                        i2 = p.i(list2);
                        d7 = i.d(i8);
                        d6 = (d7 * size) + i2;
                        i7 += d6;
                        break;
                    }
                    d6 = 0;
                    i7 += d6;
                case 22:
                    List list3 = (List) unsafe.getObject(aVar2, j);
                    Class cls4 = p.a;
                    size = list3.size();
                    if (size != 0) {
                        i2 = p.d(list3);
                        d7 = i.d(i8);
                        d6 = (d7 * size) + i2;
                        i7 += d6;
                        break;
                    }
                    d6 = 0;
                    i7 += d6;
                case 23:
                    c = p.c(i8, (List) unsafe.getObject(aVar2, j));
                    i7 += c;
                    break;
                case 24:
                    c = p.b(i8, (List) unsafe.getObject(aVar2, j));
                    i7 += c;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(aVar2, j);
                    Class cls5 = p.a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        d8 = (i.d(i8) + 1) * size3;
                        i7 += d8;
                        break;
                    }
                    d8 = 0;
                    i7 += d8;
                case 26:
                    List list5 = (List) unsafe.getObject(aVar2, j);
                    Class cls6 = p.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        d6 = i.d(i8) * size4;
                        if (list5 instanceof j7y) {
                            j7y j7yVar = (j7y) list5;
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object v = j7yVar.v();
                                if (v instanceof ByteString) {
                                    int size5 = ((ByteString) v).size();
                                    d6 = i.e(size5) + size5 + d6;
                                } else {
                                    d6 = i.c((String) v) + d6;
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object obj = list5.get(i16);
                                if (obj instanceof ByteString) {
                                    int size6 = ((ByteString) obj).size();
                                    d6 = i.e(size6) + size6 + d6;
                                } else {
                                    d6 = i.c((String) obj) + d6;
                                }
                            }
                        }
                        i7 += d6;
                        break;
                    }
                    d6 = 0;
                    i7 += d6;
                case 27:
                    List list6 = (List) unsafe.getObject(aVar2, j);
                    tom0 m2 = nVar.m(i5);
                    Class cls7 = p.a;
                    int size7 = list6.size();
                    if (size7 != 0) {
                        d9 = i.d(i8) * size7;
                        for (int i17 = 0; i17 < size7; i17++) {
                            Object obj2 = list6.get(i17);
                            if (obj2 instanceof v3y) {
                                v3y v3yVar2 = (v3y) obj2;
                                c2 = v3yVar2.b != null ? ((ByteString.LiteralByteString) v3yVar2.b).bytes.length : v3yVar2.a != null ? ((GeneratedMessageLite) v3yVar2.a).c(null) : 0;
                                e2 = i.e(c2);
                            } else {
                                c2 = ((a) ((xt10) obj2)).c(m2);
                                e2 = i.e(c2);
                            }
                            d9 = e2 + c2 + d9;
                        }
                        i7 += d9;
                        break;
                    }
                    d9 = 0;
                    i7 += d9;
                case 28:
                    List list7 = (List) unsafe.getObject(aVar2, j);
                    Class cls8 = p.a;
                    int size8 = list7.size();
                    if (size8 != 0) {
                        d6 = i.d(i8) * size8;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size9 = ((ByteString) list7.get(i18)).size();
                            d6 += i.e(size9) + size9;
                        }
                        i7 += d6;
                        break;
                    }
                    d6 = 0;
                    i7 += d6;
                case 29:
                    List list8 = (List) unsafe.getObject(aVar2, j);
                    Class cls9 = p.a;
                    size = list8.size();
                    if (size != 0) {
                        i2 = p.h(list8);
                        d7 = i.d(i8);
                        d6 = (d7 * size) + i2;
                        i7 += d6;
                        break;
                    }
                    d6 = 0;
                    i7 += d6;
                case 30:
                    List list9 = (List) unsafe.getObject(aVar2, j);
                    Class cls10 = p.a;
                    size = list9.size();
                    if (size != 0) {
                        i2 = p.a(list9);
                        d7 = i.d(i8);
                        d6 = (d7 * size) + i2;
                        i7 += d6;
                        break;
                    }
                    d6 = 0;
                    i7 += d6;
                case 31:
                    c = p.b(i8, (List) unsafe.getObject(aVar2, j));
                    i7 += c;
                    break;
                case 32:
                    c = p.c(i8, (List) unsafe.getObject(aVar2, j));
                    i7 += c;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(aVar2, j);
                    Class cls11 = p.a;
                    size = list10.size();
                    if (size != 0) {
                        i2 = p.f(list10);
                        d7 = i.d(i8);
                        d6 = (d7 * size) + i2;
                        i7 += d6;
                        break;
                    }
                    d6 = 0;
                    i7 += d6;
                case 34:
                    List list11 = (List) unsafe.getObject(aVar2, j);
                    Class cls12 = p.a;
                    size = list11.size();
                    if (size != 0) {
                        i2 = p.g(list11);
                        d7 = i.d(i8);
                        d6 = (d7 * size) + i2;
                        i7 += d6;
                        break;
                    }
                    d6 = 0;
                    i7 += d6;
                case 35:
                    List list12 = (List) unsafe.getObject(aVar2, j);
                    Class cls13 = p.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(aVar2, j);
                    Class cls14 = p.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    size2 = p.e((List) unsafe.getObject(aVar2, j));
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    size2 = p.i((List) unsafe.getObject(aVar2, j));
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    size2 = p.d((List) unsafe.getObject(aVar2, j));
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(aVar2, j);
                    Class cls15 = p.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(aVar2, j);
                    Class cls16 = p.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(aVar2, j);
                    Class cls17 = p.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    size2 = p.h((List) unsafe.getObject(aVar2, j));
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    size2 = p.a((List) unsafe.getObject(aVar2, j));
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(aVar2, j);
                    Class cls18 = p.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(aVar2, j);
                    Class cls19 = p.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    size2 = p.f((List) unsafe.getObject(aVar2, j));
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    size2 = p.g((List) unsafe.getObject(aVar2, j));
                    if (size2 > 0) {
                        d10 = i.d(i8);
                        e3 = i.e(size2);
                        e = e3 + d10 + size2;
                        i7 += e;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(aVar2, j);
                    tom0 m3 = nVar.m(i5);
                    Class cls20 = p.a;
                    int size10 = list19.size();
                    if (size10 != 0) {
                        d9 = 0;
                        for (int i19 = 0; i19 < size10; i19++) {
                            d9 += ((a) ((xt10) list19.get(i19))).c(m3) + (i.d(i8) * 2);
                        }
                        i7 += d9;
                        break;
                    }
                    d9 = 0;
                    i7 += d9;
                case 50:
                    hi00 hi00Var = nVar.o;
                    Object object3 = unsafe.getObject(aVar2, j);
                    Object obj3 = nVar.b[(i5 / 3) * 2];
                    hi00Var.getClass();
                    MapFieldLite mapFieldLite = (MapFieldLite) object3;
                    oh00 oh00Var = (oh00) obj3;
                    if (!mapFieldLite.isEmpty()) {
                        d8 = 0;
                        for (Map.Entry entry : mapFieldLite.entrySet()) {
                            Object key = entry.getKey();
                            Object value = entry.getValue();
                            oh00Var.getClass();
                            int d17 = i.d(i8);
                            int a = oh00.a(oh00Var.a, key, value);
                            d8 += i.e(a) + a + d17;
                        }
                        i7 += d8;
                        break;
                    }
                    d8 = 0;
                    i7 += d8;
                case SAFETY_TIPS_VALUE:
                    if (nVar.q(i8, i5, aVar2)) {
                        d11 = i.d(i8);
                        c = d11 + 8;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (nVar.q(i8, i5, aVar2)) {
                        d12 = i.d(i8);
                        c = d12 + 4;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (nVar.q(i8, i5, aVar2)) {
                        long z = z(j, aVar2);
                        d13 = i.d(i8);
                        f3 = i.f(z);
                        i7 += f3 + d13;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (nVar.q(i8, i5, aVar2)) {
                        long z2 = z(j, aVar2);
                        d13 = i.d(i8);
                        f3 = i.f(z2);
                        i7 += f3 + d13;
                        break;
                    } else {
                        break;
                    }
                case SODA_DE_DE_VALUE:
                    if (nVar.q(i8, i5, aVar2)) {
                        int y = y(j, aVar2);
                        d14 = i.d(i8);
                        f4 = i.f(y);
                        c = f4 + d14;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (nVar.q(i8, i5, aVar2)) {
                        d11 = i.d(i8);
                        c = d11 + 8;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    if (nVar.q(i8, i5, aVar2)) {
                        d12 = i.d(i8);
                        c = d12 + 4;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (nVar.q(i8, i5, aVar2)) {
                        c = i.d(i8) + 1;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (nVar.q(i8, i5, aVar2)) {
                        Object object4 = unsafe.getObject(aVar2, j);
                        i7 = (object4 instanceof ByteString ? i.b(i8, (ByteString) object4) : i.c((String) object4) + i.d(i8)) + i7;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (nVar.q(i8, i5, aVar2)) {
                        Object object5 = unsafe.getObject(aVar2, j);
                        tom0 m4 = nVar.m(i5);
                        Class cls21 = p.a;
                        if (object5 instanceof v3y) {
                            v3y v3yVar3 = (v3y) object5;
                            int d18 = i.d(i8);
                            int length2 = v3yVar3.b != null ? ((ByteString.LiteralByteString) v3yVar3.b).bytes.length : v3yVar3.a != null ? ((GeneratedMessageLite) v3yVar3.a).c(null) : 0;
                            e4 = i.e(length2) + length2 + d18;
                        } else {
                            int d19 = i.d(i8);
                            int c4 = ((a) ((xt10) object5)).c(m4);
                            e4 = d19 + i.e(c4) + c4;
                        }
                        i7 += e4;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (nVar.q(i8, i5, aVar2)) {
                        c = i.b(i8, (ByteString) unsafe.getObject(aVar2, j));
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (nVar.q(i8, i5, aVar2)) {
                        int y2 = y(j, aVar2);
                        d14 = i.d(i8);
                        f4 = i.e(y2);
                        c = f4 + d14;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (nVar.q(i8, i5, aVar2)) {
                        int y3 = y(j, aVar2);
                        d14 = i.d(i8);
                        f4 = i.f(y3);
                        c = f4 + d14;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (nVar.q(i8, i5, aVar2)) {
                        d12 = i.d(i8);
                        c = d12 + 4;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (nVar.q(i8, i5, aVar2)) {
                        d11 = i.d(i8);
                        c = d11 + 8;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (nVar.q(i8, i5, aVar2)) {
                        int y4 = y(j, aVar2);
                        d14 = i.d(i8);
                        f4 = i.e((y4 >> 31) ^ (y4 << 1));
                        c = f4 + d14;
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (nVar.q(i8, i5, aVar2)) {
                        long z3 = z(j, aVar2);
                        d13 = i.d(i8);
                        f3 = i.f((z3 >> 63) ^ (z3 << 1));
                        i7 += f3 + d13;
                        break;
                    } else {
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (nVar.q(i8, i5, aVar2)) {
                        c = ((a) ((xt10) unsafe.getObject(aVar2, j))).c(nVar.m(i5)) + (i.d(i8) * 2);
                        i7 += c;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
            aVar2 = aVar;
            i3 = 1048575;
        }
        ((s) nVar.m).getClass();
        int b = ((GeneratedMessageLite) aVar).unknownFields.b() + i7;
        if (nVar.f) {
            ((j) nVar.n).getClass();
            cxs0 cxs0Var = ((GeneratedMessageLite.a) aVar).extensions.a;
            if (cxs0Var.a.size() > 0) {
                Map.Entry c5 = cxs0Var.c(0);
                b64.D(c5.getKey());
                c5.getValue();
                throw null;
            }
            Iterator it = cxs0Var.d().iterator();
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                b64.D(entry2.getKey());
                entry2.getValue();
                throw null;
            }
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (androidx.datastore.preferences.protobuf.p.m(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (androidx.datastore.preferences.protobuf.p.m(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (androidx.datastore.preferences.protobuf.p.m(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (androidx.datastore.preferences.protobuf.p.m(r5.h(r7, r12), r5.h(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.c(r7, r12) == r5.c(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.f(r7, r12) == r5.f(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.g(r7, r12) == r5.g(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.e(r7, r12)) == java.lang.Float.floatToIntBits(r5.e(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.d(r7, r12)) == java.lang.Double.doubleToLongBits(r5.d(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (androidx.datastore.preferences.protobuf.p.m(r9.h(r7, r12), r9.h(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.tom0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int L = L(i);
                long j = L & 1048575;
                switch (K(L)) {
                    case 0:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var2 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var3 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var4 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var5 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var6 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var7 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var8 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var9 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var10 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var11 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var12 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var13 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var14 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var15 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var16 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var17 = a421.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (j(generatedMessageLite, generatedMessageLite2, i)) {
                            x321 x321Var18 = a421.c;
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
                        x321 x321Var19 = a421.c;
                        z = p.m(x321Var19.h(j, generatedMessageLite), x321Var19.h(j, generatedMessageLite2));
                        break;
                    case 50:
                        x321 x321Var20 = a421.c;
                        z = p.m(x321Var20.h(j, generatedMessageLite), x321Var20.h(j, generatedMessageLite2));
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
                        x321 x321Var21 = a421.c;
                        if (x321Var21.f(j2, generatedMessageLite) == x321Var21.f(j2, generatedMessageLite2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                s sVar = (s) this.m;
                sVar.getClass();
                r rVar = generatedMessageLite.unknownFields;
                sVar.getClass();
                if (rVar.equals(generatedMessageLite2.unknownFields)) {
                    if (!this.f) {
                        return true;
                    }
                    j jVar = (j) this.n;
                    jVar.getClass();
                    zxq zxqVar = ((GeneratedMessageLite.a) generatedMessageLite).extensions;
                    jVar.getClass();
                    return zxqVar.equals(((GeneratedMessageLite.a) generatedMessageLite2).extensions);
                }
            }
        }
        return false;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.tom0
    public final void g(java.lang.Object r19, androidx.datastore.preferences.protobuf.f r20, defpackage.qyo r21) {
        /*
            Method dump skipped, instructions count: 1952
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.n.g(java.lang.Object, androidx.datastore.preferences.protobuf.f, qyo):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0627 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0628  */
    @Override // defpackage.tom0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, au50 au50Var) {
        Map.Entry entry;
        int length;
        Iterator it;
        au50Var.getClass();
        if (Writer$FieldOrder.ASCENDING != Writer$FieldOrder.DESCENDING) {
            M(obj, au50Var);
            return;
        }
        tyo tyoVar = this.n;
        int[] iArr = this.a;
        ((s) this.m).getClass();
        ((GeneratedMessageLite) obj).unknownFields.d(au50Var);
        if (this.f) {
            ((j) tyoVar).getClass();
            zxq zxqVar = ((GeneratedMessageLite.a) obj).extensions;
            if (!zxqVar.a.isEmpty()) {
                cxs0 cxs0Var = zxqVar.a;
                if (cxs0Var.isEmpty()) {
                    it = Collections.emptyIterator();
                } else {
                    if (cxs0Var.y == null) {
                        cxs0Var.y = new gxs0(cxs0Var);
                    }
                    it = cxs0Var.y.iterator();
                }
                entry = (Map.Entry) it.next();
                for (length = iArr.length - 3; length >= 0; length -= 3) {
                    int L = L(length);
                    int i = iArr[length];
                    if (entry != null) {
                        ((j) tyoVar).getClass();
                        b64.D(entry.getKey());
                        throw null;
                    }
                    switch (K(L)) {
                        case 0:
                            if (n(length, obj)) {
                                double d = a421.c.d(L & 1048575, obj);
                                i iVar = (i) au50Var.b;
                                iVar.getClass();
                                iVar.o(i, Double.doubleToRawLongBits(d));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (n(length, obj)) {
                                float e = a421.c.e(L & 1048575, obj);
                                i iVar2 = (i) au50Var.b;
                                iVar2.getClass();
                                iVar2.m(i, Float.floatToRawIntBits(e));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (n(length, obj)) {
                                ((i) au50Var.b).B(i, a421.c.g(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (n(length, obj)) {
                                ((i) au50Var.b).B(i, a421.c.g(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (n(length, obj)) {
                                ((i) au50Var.b).q(i, a421.c.f(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (n(length, obj)) {
                                ((i) au50Var.b).o(i, a421.c.g(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (n(length, obj)) {
                                ((i) au50Var.b).m(i, a421.c.f(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (n(length, obj)) {
                                ((i) au50Var.b).i(i, a421.c.c(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (n(length, obj)) {
                                O(i, a421.c.h(L & 1048575, obj), au50Var);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (n(length, obj)) {
                                ((i) au50Var.b).s(i, (xt10) a421.c.h(L & 1048575, obj), m(length));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (n(length, obj)) {
                                au50Var.l(i, (ByteString) a421.c.h(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (n(length, obj)) {
                                ((i) au50Var.b).z(i, a421.c.f(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (n(length, obj)) {
                                ((i) au50Var.b).q(i, a421.c.f(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (n(length, obj)) {
                                ((i) au50Var.b).m(i, a421.c.f(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (n(length, obj)) {
                                ((i) au50Var.b).o(i, a421.c.g(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (n(length, obj)) {
                                int f = a421.c.f(L & 1048575, obj);
                                ((i) au50Var.b).z(i, (f >> 31) ^ (f << 1));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (n(length, obj)) {
                                long g = a421.c.g(L & 1048575, obj);
                                ((i) au50Var.b).B(i, (g >> 63) ^ (g << 1));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (n(length, obj)) {
                                au50Var.m(i, a421.c.h(L & 1048575, obj), m(length));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            p.p(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 19:
                            p.t(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 20:
                            p.w(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 21:
                            p.E(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 22:
                            p.v(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 23:
                            p.s(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 24:
                            p.r(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 25:
                            p.n(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 26:
                            p.C(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var);
                            break;
                        case 27:
                            p.x(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, m(length));
                            break;
                        case 28:
                            p.o(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var);
                            break;
                        case 29:
                            p.D(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 30:
                            p.q(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 31:
                            p.y(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 32:
                            p.z(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 33:
                            p.A(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 34:
                            p.B(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, false);
                            break;
                        case 35:
                            p.p(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 36:
                            p.t(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 37:
                            p.w(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 38:
                            p.E(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 39:
                            p.v(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 40:
                            p.s(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 41:
                            p.r(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 42:
                            p.n(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 43:
                            p.D(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 44:
                            p.q(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 45:
                            p.y(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 46:
                            p.z(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 47:
                            p.A(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 48:
                            p.B(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, true);
                            break;
                        case 49:
                            p.u(iArr[length], (List) a421.c.h(L & 1048575, obj), au50Var, m(length));
                            break;
                        case 50:
                            N(au50Var, i, a421.c.h(L & 1048575, obj), length);
                            break;
                        case SAFETY_TIPS_VALUE:
                            if (q(i, length, obj)) {
                                double doubleValue = ((Double) a421.c.h(L & 1048575, obj)).doubleValue();
                                i iVar3 = (i) au50Var.b;
                                iVar3.getClass();
                                iVar3.o(i, Double.doubleToRawLongBits(doubleValue));
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (q(i, length, obj)) {
                                float floatValue = ((Float) a421.c.h(L & 1048575, obj)).floatValue();
                                i iVar4 = (i) au50Var.b;
                                iVar4.getClass();
                                iVar4.m(i, Float.floatToRawIntBits(floatValue));
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).B(i, z(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).B(i, z(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case SODA_DE_DE_VALUE:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).q(i, y(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).o(i, z(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case SODA_ES_ES_VALUE:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).m(i, y(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).i(i, ((Boolean) a421.c.h(L & 1048575, obj)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (q(i, length, obj)) {
                                O(i, a421.c.h(L & 1048575, obj), au50Var);
                                break;
                            } else {
                                break;
                            }
                        case 60:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).s(i, (xt10) a421.c.h(L & 1048575, obj), m(length));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (q(i, length, obj)) {
                                au50Var.l(i, (ByteString) a421.c.h(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).z(i, y(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).q(i, y(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).m(i, y(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (q(i, length, obj)) {
                                ((i) au50Var.b).o(i, z(L & 1048575, obj));
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (q(i, length, obj)) {
                                int y = y(L & 1048575, obj);
                                ((i) au50Var.b).z(i, (y >> 31) ^ (y << 1));
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (q(i, length, obj)) {
                                long z = z(L & 1048575, obj);
                                ((i) au50Var.b).B(i, (z >> 63) ^ (z << 1));
                                break;
                            } else {
                                break;
                            }
                        case TRANSLATE_KIT_VALUE:
                            if (q(i, length, obj)) {
                                au50Var.m(i, a421.c.h(L & 1048575, obj), m(length));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (entry != null) {
                    return;
                }
                ((j) tyoVar).getClass();
                b64.D(entry.getKey());
                throw null;
            }
        }
        entry = null;
        while (length >= 0) {
        }
        if (entry != null) {
        }
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
    @Override // defpackage.tom0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(GeneratedMessageLite generatedMessageLite) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int L = L(i4);
            int i5 = iArr[i4];
            long j = 1048575 & L;
            int i6 = 1237;
            int i7 = 37;
            switch (K(L)) {
                case 0:
                    i = i3 * 53;
                    b = tqw.b(Double.doubleToLongBits(a421.c.d(j, generatedMessageLite)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(a421.c.e(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = tqw.b(a421.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = tqw.b(a421.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = a421.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = tqw.b(a421.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = a421.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean c = a421.c.c(j, generatedMessageLite);
                    Charset charset = tqw.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) a421.c.h(j, generatedMessageLite)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object h = a421.c.h(j, generatedMessageLite);
                    if (h != null) {
                        i7 = h.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = a421.c.h(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = a421.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = a421.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = a421.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = tqw.b(a421.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = a421.c.f(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = tqw.b(a421.c.g(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 17:
                    Object h2 = a421.c.h(j, generatedMessageLite);
                    if (h2 != null) {
                        i7 = h2.hashCode();
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
                    b = a421.c.h(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = a421.c.h(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case SAFETY_TIPS_VALUE:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = tqw.b(Double.doubleToLongBits(((Double) a421.c.h(j, generatedMessageLite)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) a421.c.h(j, generatedMessageLite)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = tqw.b(z(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = tqw.b(z(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case SODA_DE_DE_VALUE:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = y(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = tqw.b(z(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = y(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (q(i5, i4, generatedMessageLite)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) a421.c.h(j, generatedMessageLite)).booleanValue();
                        Charset charset2 = tqw.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = ((String) a421.c.h(j, generatedMessageLite)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = a421.c.h(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = a421.c.h(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = y(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = y(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = y(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = tqw.b(z(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = y(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = tqw.b(z(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (q(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = a421.c.h(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((s) this.m).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode() + (i3 * 53);
        if (!this.f) {
            return hashCode;
        }
        ((j) this.n).getClass();
        return ((GeneratedMessageLite.a) generatedMessageLite).extensions.a.hashCode() + (hashCode * 53);
    }

    public final boolean j(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return n(i, generatedMessageLite) == n(i, generatedMessageLite2);
    }

    public final void k(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        if (a421.c.h(L(i) & 1048575, obj) == null) {
            return;
        }
        l(i);
    }

    public final void l(int i) {
        if (this.b[qv10.b(i, 3, 2, 1)] == null) {
            return;
        }
        ny61.u();
    }

    public final tom0 m(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        tom0 tom0Var = (tom0) objArr[i2];
        if (tom0Var != null) {
            return tom0Var;
        }
        tom0 a = fvf0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0110 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int L = L(i);
            long j2 = L & 1048575;
            switch (K(L)) {
                case 0:
                    return Double.doubleToRawLongBits(a421.c.d(j2, obj)) != 0;
                case 1:
                    if (Float.floatToRawIntBits(a421.c.e(j2, obj)) != 0) {
                    }
                    break;
                case 2:
                    if (a421.c.g(j2, obj) != 0) {
                    }
                    break;
                case 3:
                    if (a421.c.g(j2, obj) != 0) {
                    }
                    break;
                case 4:
                    if (a421.c.f(j2, obj) != 0) {
                    }
                    break;
                case 5:
                    if (a421.c.g(j2, obj) != 0) {
                    }
                    break;
                case 6:
                    if (a421.c.f(j2, obj) != 0) {
                    }
                    break;
                case 7:
                    return a421.c.c(j2, obj);
                case 8:
                    Object h = a421.c.h(j2, obj);
                    if (h instanceof String) {
                        return !((String) h).isEmpty();
                    }
                    if (h instanceof ByteString) {
                        return !ByteString.a.equals(h);
                    }
                    w511.q();
                    return false;
                case 9:
                    if (a421.c.h(j2, obj) != null) {
                    }
                    break;
                case 10:
                    return !ByteString.a.equals(a421.c.h(j2, obj));
                case 11:
                    if (a421.c.f(j2, obj) != 0) {
                    }
                    break;
                case 12:
                    if (a421.c.f(j2, obj) != 0) {
                    }
                    break;
                case 13:
                    if (a421.c.f(j2, obj) != 0) {
                    }
                    break;
                case 14:
                    if (a421.c.g(j2, obj) != 0) {
                    }
                    break;
                case 15:
                    if (a421.c.f(j2, obj) != 0) {
                    }
                    break;
                case 16:
                    if (a421.c.g(j2, obj) != 0) {
                    }
                    break;
                case 17:
                    if (a421.c.h(j2, obj) != null) {
                    }
                    break;
                default:
                    w511.q();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & a421.c.f(j, obj)) != 0) {
        }
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? n(i, obj) : (i3 & i4) != 0;
    }

    public final boolean q(int i, int i2, Object obj) {
        return a421.c.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x009f, code lost:
    
        r9.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
    
        r10.g(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(Object obj, int i, Object obj2, qyo qyoVar, f fVar) {
        long L = L(i) & 1048575;
        Object h = a421.c.h(L, obj);
        hi00 hi00Var = this.o;
        if (h == null) {
            hi00Var.getClass();
            h = MapFieldLite.a.f();
            a421.o(L, obj, h);
        } else {
            hi00Var.getClass();
            if (!((MapFieldLite) h).b()) {
                MapFieldLite f = MapFieldLite.a.f();
                hi00.a(f, h);
                a421.o(L, obj, f);
                h = f;
            }
        }
        hi00Var.getClass();
        MapFieldLite mapFieldLite = (MapFieldLite) h;
        am2 am2Var = ((oh00) obj2).a;
        fVar.w(2);
        yv4 yv4Var = fVar.a;
        int h2 = yv4Var.h(yv4Var.z());
        Object obj3 = am2Var.c;
        Object obj4 = "";
        Object obj5 = obj3;
        while (true) {
            try {
                int a = fVar.a();
                if (a == Integer.MAX_VALUE || yv4Var.e()) {
                    break;
                }
                if (a == 1) {
                    obj4 = fVar.i((WireFormat$FieldType) am2Var.a, null, null);
                } else if (a != 2) {
                    try {
                        if (!fVar.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!fVar.x()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    obj5 = fVar.i((WireFormat$FieldType) am2Var.b, obj3.getClass(), qyoVar);
                }
            } catch (Throwable th) {
                yv4Var.g(h2);
                throw th;
            }
        }
    }

    public final void s(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                yci0.h(this.a[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            tom0 m = m(i);
            if (!n(i, obj)) {
                if (p(object)) {
                    GeneratedMessageLite d = m.d();
                    m.b(d, object);
                    unsafe.putObject(obj, L, d);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                G(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                GeneratedMessageLite d2 = m.d();
                m.b(d2, object2);
                unsafe.putObject(obj, L, d2);
                object2 = d2;
            }
            m.b(object2, object);
        }
    }

    public final void t(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (q(i2, i, obj2)) {
            long L = L(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, L);
            if (object == null) {
                yci0.h(iArr[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            tom0 m = m(i);
            if (!q(i2, i, obj)) {
                if (p(object)) {
                    GeneratedMessageLite d = m.d();
                    m.b(d, object);
                    unsafe.putObject(obj, L, d);
                } else {
                    unsafe.putObject(obj, L, object);
                }
                H(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, L);
            if (!p(object2)) {
                GeneratedMessageLite d2 = m.d();
                m.b(d2, object2);
                unsafe.putObject(obj, L, d2);
                object2 = d2;
            }
            m.b(object2, object);
        }
    }

    public final Object u(int i, Object obj) {
        tom0 m = m(i);
        long L = L(i) & 1048575;
        if (!n(i, obj)) {
            return m.d();
        }
        Object object = q.getObject(obj, L);
        if (p(object)) {
            return object;
        }
        GeneratedMessageLite d = m.d();
        if (object != null) {
            m.b(d, object);
        }
        return d;
    }

    public final Object v(int i, int i2, Object obj) {
        tom0 m = m(i2);
        if (!q(i, i2, obj)) {
            return m.d();
        }
        Object object = q.getObject(obj, L(i2) & 1048575);
        if (p(object)) {
            return object;
        }
        GeneratedMessageLite d = m.d();
        if (object != null) {
            m.b(d, object);
        }
        return d;
    }
}
