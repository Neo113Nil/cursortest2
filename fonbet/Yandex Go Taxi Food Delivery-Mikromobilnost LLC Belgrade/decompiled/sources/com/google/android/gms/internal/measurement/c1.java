package com.google.android.gms.internal.measurement;

import defpackage.a7b1;
import defpackage.b64;
import defpackage.cxa1;
import defpackage.d0b1;
import defpackage.dai0;
import defpackage.dq91;
import defpackage.dxf0;
import defpackage.f1b1;
import defpackage.g8b1;
import defpackage.g8e;
import defpackage.gwk0;
import defpackage.i7b1;
import defpackage.i9b1;
import defpackage.iq91;
import defpackage.jab1;
import defpackage.kbs;
import defpackage.l2b1;
import defpackage.l4b1;
import defpackage.n7b1;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.p5b1;
import defpackage.q2b1;
import defpackage.rfw0;
import defpackage.sp91;
import defpackage.v43;
import defpackage.vqa1;
import defpackage.w511;
import defpackage.xja1;
import defpackage.xra1;
import defpackage.z0b1;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class c1 implements n7b1 {
    public static final int[] l = new int[0];
    public static final Unsafe m = jab1.l();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final p5b1 e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final dq91 j;
    public final iq91 k;

    public c1(int[] iArr, Object[] objArr, int i, int i2, p5b1 p5b1Var, int[] iArr2, int i3, int i4, dq91 dq91Var, iq91 iq91Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        boolean z = false;
        if (iq91Var != null && (p5b1Var instanceof z0)) {
            z = true;
        }
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = dq91Var;
        this.k = iq91Var;
        this.e = p5b1Var;
    }

    public static int F(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean i(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof a1) {
            return ((a1) obj).g();
        }
        return true;
    }

    public static int j(long j, Object obj) {
        return ((Integer) jab1.j(j, obj)).intValue();
    }

    public static long k(long j, Object obj) {
        return ((Long) jab1.j(j, obj)).longValue();
    }

    public static final int r(byte[] bArr, int i, int i2, zzot zzotVar, Class cls, v43 v43Var) {
        zzot zzotVar2 = zzot.zza;
        switch (zzotVar.ordinal()) {
            case 0:
                int i3 = i + 8;
                v43Var.c = Double.valueOf(Double.longBitsToDouble(dai0.W(i, bArr)));
                return i3;
            case 1:
                int i4 = i + 4;
                v43Var.c = Float.valueOf(Float.intBitsToFloat(dai0.V(i, bArr)));
                return i4;
            case 2:
            case 3:
                int U = dai0.U(bArr, i, v43Var);
                v43Var.c = Long.valueOf(v43Var.b);
                return U;
            case 4:
            case 12:
            case 13:
                int S = dai0.S(bArr, i, v43Var);
                v43Var.c = Integer.valueOf(v43Var.a);
                return S;
            case 5:
            case 15:
                int i5 = i + 8;
                v43Var.c = Long.valueOf(dai0.W(i, bArr));
                return i5;
            case 6:
            case 14:
                int i6 = i + 4;
                v43Var.c = Integer.valueOf(dai0.V(i, bArr));
                return i6;
            case 7:
                int U2 = dai0.U(bArr, i, v43Var);
                v43Var.c = Boolean.valueOf(v43Var.b != 0);
                return U2;
            case 8:
                return dai0.X(bArr, i, v43Var);
            case 9:
            default:
                kbs.g("unsupported field type.");
                return 0;
            case 10:
                n7b1 a = a7b1.c.a(cls);
                Object zza = a.zza();
                int Z = dai0.Z(zza, a, bArr, i, i2, v43Var);
                a.f(zza);
                v43Var.c = zza;
                return Z;
            case 11:
                return dai0.Y(bArr, i, v43Var);
            case 16:
                int S2 = dai0.S(bArr, i, v43Var);
                v43Var.c = Integer.valueOf(gwk0.K(v43Var.a));
                return S2;
            case 17:
                int U3 = dai0.U(bArr, i, v43Var);
                v43Var.c = Long.valueOf(gwk0.L(v43Var.b));
                return U3;
        }
    }

    public static i9b1 s(Object obj) {
        a1 a1Var = (a1) obj;
        i9b1 i9b1Var = a1Var.zzc;
        if (i9b1Var != i9b1.f) {
            return i9b1Var;
        }
        i9b1 a = i9b1.a();
        a1Var.zzc = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c1 u(i7b1 i7b1Var, dq91 dq91Var, iq91 iq91Var) {
        int i;
        int charAt;
        int i2;
        int[] iArr;
        int i3;
        int i4;
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
        int i16;
        int i17;
        Object[] objArr;
        int i18;
        Class<?> cls;
        int objectFieldOffset;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        Field v;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field v2;
        Object obj2;
        Field v3;
        int i29;
        char charAt11;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        if (!(i7b1Var instanceof i7b1)) {
            ny61.u();
            return null;
        }
        String str = i7b1Var.b;
        int length = str.length();
        int i33 = 55296;
        if (str.charAt(0) >= 55296) {
            int i34 = 1;
            while (true) {
                i = i34 + 1;
                if (str.charAt(i34) < 55296) {
                    break;
                }
                i34 = i;
            }
        } else {
            i = 1;
        }
        int i35 = i + 1;
        int charAt15 = str.charAt(i);
        if (charAt15 >= 55296) {
            int i36 = charAt15 & 8191;
            int i37 = 13;
            while (true) {
                i32 = i35 + 1;
                charAt14 = str.charAt(i35);
                if (charAt14 < 55296) {
                    break;
                }
                i36 |= (charAt14 & 8191) << i37;
                i37 += 13;
                i35 = i32;
            }
            charAt15 = i36 | (charAt14 << i37);
            i35 = i32;
        }
        if (charAt15 == 0) {
            i4 = 0;
            i6 = 0;
            charAt = 0;
            i3 = 0;
            i5 = 0;
            i7 = 0;
            iArr = l;
            i2 = 0;
        } else {
            int i38 = i35 + 1;
            int charAt16 = str.charAt(i35);
            if (charAt16 >= 55296) {
                int i39 = charAt16 & 8191;
                int i40 = 13;
                while (true) {
                    i15 = i38 + 1;
                    charAt9 = str.charAt(i38);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i39 |= (charAt9 & 8191) << i40;
                    i40 += 13;
                    i38 = i15;
                }
                charAt16 = i39 | (charAt9 << i40);
                i38 = i15;
            }
            int i41 = i38 + 1;
            int charAt17 = str.charAt(i38);
            if (charAt17 >= 55296) {
                int i42 = charAt17 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt8 = str.charAt(i41);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i42 |= (charAt8 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt17 = i42 | (charAt8 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt18 = str.charAt(i41);
            if (charAt18 >= 55296) {
                int i45 = charAt18 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt7 = str.charAt(i44);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i45 |= (charAt7 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt18 = i45 | (charAt7 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt19 = str.charAt(i44);
            if (charAt19 >= 55296) {
                int i48 = charAt19 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt6 = str.charAt(i47);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i48 |= (charAt6 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt19 = i48 | (charAt6 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt = str.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt5 = str.charAt(i50);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i51 |= (charAt5 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt = i51 | (charAt5 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt20 = str.charAt(i50);
            if (charAt20 >= 55296) {
                int i54 = charAt20 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt4 = str.charAt(i53);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i54 |= (charAt4 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt20 = i54 | (charAt4 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            int charAt21 = str.charAt(i53);
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt3 = str.charAt(i56);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i57 |= (charAt3 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt21 = i57 | (charAt3 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt22 = str.charAt(i56);
            if (charAt22 >= 55296) {
                int i60 = charAt22 & 8191;
                int i61 = 13;
                while (true) {
                    i8 = i59 + 1;
                    charAt2 = str.charAt(i59);
                    if (charAt2 < 55296) {
                        break;
                    }
                    i60 |= (charAt2 & 8191) << i61;
                    i61 += 13;
                    i59 = i8;
                }
                charAt22 = i60 | (charAt2 << i61);
                i59 = i8;
            }
            int i62 = charAt16 + charAt16 + charAt17;
            i2 = charAt16;
            i35 = i59;
            iArr = new int[charAt22 + charAt20 + charAt21];
            int i63 = charAt20;
            i3 = charAt18;
            i4 = i63;
            i5 = charAt19;
            i6 = i62;
            i7 = charAt22;
        }
        Unsafe unsafe = m;
        Object[] objArr2 = i7b1Var.c;
        Class<?> cls2 = i7b1Var.a.getClass();
        int i64 = i7 + i4;
        int i65 = charAt + charAt;
        int[] iArr2 = new int[charAt * 3];
        Object[] objArr3 = new Object[i65];
        int i66 = i64;
        int i67 = i7;
        int i68 = 0;
        int i69 = 0;
        while (i35 < length) {
            int i70 = i35 + 1;
            int charAt23 = str.charAt(i35);
            if (charAt23 >= i33) {
                int i71 = charAt23 & 8191;
                int i72 = i70;
                int i73 = 13;
                while (true) {
                    i31 = i72 + 1;
                    charAt13 = str.charAt(i72);
                    i16 = length;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i71 |= (charAt13 & 8191) << i73;
                    i73 += 13;
                    i72 = i31;
                    length = i16;
                }
                charAt23 = i71 | (charAt13 << i73);
                i17 = i31;
            } else {
                i16 = length;
                i17 = i70;
            }
            int i74 = i17 + 1;
            int charAt24 = str.charAt(i17);
            Object[] objArr4 = objArr2;
            char c = 55296;
            if (charAt24 >= 55296) {
                int i75 = charAt24 & 8191;
                int i76 = 13;
                while (true) {
                    i30 = i74 + 1;
                    charAt12 = str.charAt(i74);
                    if (charAt12 < c) {
                        break;
                    }
                    i75 |= (charAt12 & 8191) << i76;
                    i76 += 13;
                    i74 = i30;
                    c = 55296;
                }
                charAt24 = i75 | (charAt12 << i76);
                i74 = i30;
            }
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i69;
                i68++;
            }
            int i77 = charAt24 & 255;
            int i78 = charAt23;
            int i79 = charAt24 & 2048;
            if (i77 >= 51) {
                int i80 = i74 + 1;
                int charAt25 = str.charAt(i74);
                char c2 = 55296;
                if (charAt25 >= 55296) {
                    int i81 = charAt25 & 8191;
                    int i82 = i80;
                    int i83 = 13;
                    while (true) {
                        i29 = i82 + 1;
                        charAt11 = str.charAt(i82);
                        if (charAt11 < c2) {
                            break;
                        }
                        i81 |= (charAt11 & 8191) << i83;
                        i83 += 13;
                        i82 = i29;
                        c2 = 55296;
                    }
                    charAt25 = i81 | (charAt11 << i83);
                    i26 = i29;
                } else {
                    i26 = i80;
                }
                int i84 = i26;
                int i85 = i77 - 51;
                int i86 = charAt25;
                if (i85 == 9 || i85 == 17) {
                    i27 = i6 + 1;
                    int i87 = i69 / 3;
                    objArr3[i87 + i87 + 1] = objArr4[i6];
                } else {
                    if (i85 == 12) {
                        if (i7b1Var.a() == 1 || i79 != 0) {
                            i27 = i6 + 1;
                            int i88 = i69 / 3;
                            objArr3[i88 + i88 + 1] = objArr4[i6];
                        } else {
                            i28 = 0;
                            int i89 = i86 + i86;
                            i79 = i28;
                            obj = objArr4[i89];
                            if (obj instanceof Field) {
                                v2 = (Field) obj;
                            } else {
                                v2 = v(cls2, (String) obj);
                                objArr4[i89] = v2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(v2);
                            int i90 = i89 + 1;
                            obj2 = objArr4[i90];
                            if (obj2 instanceof Field) {
                                v3 = (Field) obj2;
                            } else {
                                v3 = v(cls2, (String) obj2);
                                objArr4[i90] = v3;
                            }
                            i21 = i84;
                            i24 = objectFieldOffset2;
                            i20 = 55296;
                            objArr = objArr3;
                            i18 = i2;
                            cls = cls2;
                            i23 = 0;
                            i19 = (int) unsafe.objectFieldOffset(v3);
                        }
                    }
                    i28 = i79;
                    int i892 = i86 + i86;
                    i79 = i28;
                    obj = objArr4[i892];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(v2);
                    int i902 = i892 + 1;
                    obj2 = objArr4[i902];
                    if (obj2 instanceof Field) {
                    }
                    i21 = i84;
                    i24 = objectFieldOffset22;
                    i20 = 55296;
                    objArr = objArr3;
                    i18 = i2;
                    cls = cls2;
                    i23 = 0;
                    i19 = (int) unsafe.objectFieldOffset(v3);
                }
                i6 = i27;
                i28 = i79;
                int i8922 = i86 + i86;
                i79 = i28;
                obj = objArr4[i8922];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(v2);
                int i9022 = i8922 + 1;
                obj2 = objArr4[i9022];
                if (obj2 instanceof Field) {
                }
                i21 = i84;
                i24 = objectFieldOffset222;
                i20 = 55296;
                objArr = objArr3;
                i18 = i2;
                cls = cls2;
                i23 = 0;
                i19 = (int) unsafe.objectFieldOffset(v3);
            } else {
                int i91 = i6 + 1;
                Field v4 = v(cls2, (String) objArr4[i6]);
                objArr = objArr3;
                if (i77 == 9 || i77 == 17) {
                    i18 = i2;
                    int i92 = i69 / 3;
                    objArr[i92 + i92 + 1] = v4.getType();
                } else {
                    if (i77 == 27) {
                        i18 = i2;
                        i25 = 1;
                        i6 += 2;
                    } else if (i77 == 49) {
                        i6 += 2;
                        i18 = i2;
                        i25 = 1;
                    } else {
                        if (i77 == 12 || i77 == 30 || i77 == 44) {
                            i18 = i2;
                            if (i7b1Var.a() == 1 || i79 != 0) {
                                i6 += 2;
                                int i93 = i69 / 3;
                                objArr[i93 + i93 + 1] = objArr4[i91];
                                cls = cls2;
                            } else {
                                cls = cls2;
                                i6 = i91;
                                i79 = 0;
                            }
                        } else if (i77 == 50) {
                            int i94 = i6 + 2;
                            int i95 = i67 + 1;
                            iArr[i67] = i69;
                            int i96 = i69 / 3;
                            int i97 = i96 + i96;
                            objArr[i97] = objArr4[i91];
                            if (i79 != 0) {
                                i6 += 3;
                                objArr[i97 + 1] = objArr4[i94];
                                cls = cls2;
                                i67 = i95;
                            } else {
                                i6 = i94;
                                cls = cls2;
                                i67 = i95;
                                i79 = 0;
                            }
                            i18 = i2;
                        } else {
                            i18 = i2;
                        }
                        objectFieldOffset = (int) unsafe.objectFieldOffset(v4);
                        i19 = 1048575;
                        if ((charAt24 & 4096) != 0 || i77 > 17) {
                            i20 = 55296;
                            i21 = i74;
                            i22 = 0;
                        } else {
                            int i98 = i74 + 1;
                            int charAt26 = str.charAt(i74);
                            if (charAt26 >= 55296) {
                                int i99 = charAt26 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i21 = i98 + 1;
                                    charAt10 = str.charAt(i98);
                                    if (charAt10 < 55296) {
                                        break;
                                    }
                                    i99 |= (charAt10 & 8191) << i100;
                                    i100 += 13;
                                    i98 = i21;
                                }
                                charAt26 = i99 | (charAt10 << i100);
                            } else {
                                i21 = i98;
                            }
                            int i101 = (charAt26 / 32) + i18 + i18;
                            Object obj3 = objArr4[i101];
                            if (obj3 instanceof Field) {
                                v = (Field) obj3;
                            } else {
                                v = v(cls, (String) obj3);
                                objArr4[i101] = v;
                            }
                            i22 = charAt26 % 32;
                            i19 = (int) unsafe.objectFieldOffset(v);
                            i20 = 55296;
                        }
                        if (i77 >= 18 && i77 <= 49) {
                            iArr[i66] = objectFieldOffset;
                            i66++;
                        }
                        i23 = i22;
                        i24 = objectFieldOffset;
                    }
                    int i102 = i69 / 3;
                    objArr[i102 + i102 + i25] = objArr4[i91];
                    cls = cls2;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(v4);
                    i19 = 1048575;
                    if ((charAt24 & 4096) != 0) {
                    }
                    i20 = 55296;
                    i21 = i74;
                    i22 = 0;
                    if (i77 >= 18) {
                        iArr[i66] = objectFieldOffset;
                        i66++;
                    }
                    i23 = i22;
                    i24 = objectFieldOffset;
                }
                cls = cls2;
                i6 = i91;
                objectFieldOffset = (int) unsafe.objectFieldOffset(v4);
                i19 = 1048575;
                if ((charAt24 & 4096) != 0) {
                }
                i20 = 55296;
                i21 = i74;
                i22 = 0;
                if (i77 >= 18) {
                }
                i23 = i22;
                i24 = objectFieldOffset;
            }
            int i103 = i79;
            int i104 = i69 + 1;
            iArr2[i69] = i78;
            int i105 = i69 + 2;
            String str2 = str;
            iArr2[i104] = ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 256) != 0 ? SelfTester_JCP.IMITA : 0) | (i103 != 0 ? Integer.MIN_VALUE : 0) | (i77 << 20) | i24;
            i69 += 3;
            iArr2[i105] = (i23 << 20) | i19;
            cls2 = cls;
            objArr2 = objArr4;
            i33 = i20;
            length = i16;
            objArr3 = objArr;
            i2 = i18;
            i35 = i21;
            str = str2;
        }
        return new c1(iArr2, objArr3, i3, i5, i7b1Var.a, iArr, i7, i64, dq91Var, iq91Var);
    }

    public static Field v(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(arrays).length());
            g8e.D(sb, "Field ", str, " for ", name);
            ny61.n(oyr.t(sb, " not found. Known fields are ", arrays), e);
            return null;
        }
    }

    public final Object A(int i, Object obj) {
        n7b1 y = y(i);
        int E = E(i) & 1048575;
        if (!n(i, obj)) {
            return y.zza();
        }
        Object object = m.getObject(obj, E);
        if (i(object)) {
            return object;
        }
        Object zza = y.zza();
        if (object != null) {
            y.e(zza, object);
        }
        return zza;
    }

    public final void B(int i, Object obj, Object obj2) {
        m.putObject(obj, E(i) & 1048575, obj2);
        o(i, obj);
    }

    public final Object C(int i, int i2, Object obj) {
        n7b1 y = y(i2);
        if (!p(i, i2, obj)) {
            return y.zza();
        }
        Object object = m.getObject(obj, E(i2) & 1048575);
        if (i(object)) {
            return object;
        }
        Object zza = y.zza();
        if (object != null) {
            y.e(zza, object);
        }
        return zza;
    }

    public final void D(int i, Object obj, Object obj2, int i2) {
        m.putObject(obj, E(i2) & 1048575, obj2);
        jab1.g(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int E(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.n7b1
    public final boolean a(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.h) {
            int i7 = this.g[i5];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int E = E(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = m.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & E) == 0 || m(obj, i2, i, i3, i11)) {
                int F = F(E);
                if (F == 9 || F == 17) {
                    if (m(obj, i2, i, i3, i11) && !y(i2).a(jab1.j(E & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (F != 27) {
                        if (F == 60 || F == 68) {
                            if (p(i8, i2, obj) && !y(i2).a(jab1.j(E & 1048575, obj))) {
                            }
                            i5++;
                            i6 = i;
                            i4 = i3;
                        } else if (F != 49) {
                            if (F != 50) {
                                continue;
                            } else {
                                zzng zzngVar = (zzng) jab1.j(E & 1048575, obj);
                                if (zzngVar.isEmpty()) {
                                    continue;
                                } else {
                                    int i13 = i2 / 3;
                                    if (((zzot) ((l4b1) this.b[i13 + i13]).a.b).a() == zzou.zzi) {
                                        n7b1 n7b1Var = null;
                                        for (Object obj2 : zzngVar.values()) {
                                            if (n7b1Var == null) {
                                                n7b1Var = a7b1.c.a(obj2.getClass());
                                            }
                                            if (!n7b1Var.a(obj2)) {
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                            i5++;
                            i6 = i;
                            i4 = i3;
                        }
                    }
                    List list = (List) jab1.j(E & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        n7b1 y = y(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (y.a(list.get(i14))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        if (this.f) {
            ((z0) obj).zzb.d();
        }
        return true;
    }

    @Override // defpackage.n7b1
    public final boolean b(a1 a1Var, a1 a1Var2) {
        boolean a;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int E = E(i);
                long j = E & 1048575;
                switch (F(E)) {
                    case 0:
                        if (!l(a1Var, a1Var2, i)) {
                            break;
                        } else {
                            xja1 xja1Var = jab1.c;
                            if (Double.doubleToLongBits(xja1Var.j(j, a1Var)) != Double.doubleToLongBits(xja1Var.j(j, a1Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!l(a1Var, a1Var2, i)) {
                            break;
                        } else {
                            xja1 xja1Var2 = jab1.c;
                            if (Float.floatToIntBits(xja1Var2.f(j, a1Var)) != Float.floatToIntBits(xja1Var2.f(j, a1Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (l(a1Var, a1Var2, i) && jab1.h(j, a1Var) == jab1.h(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (l(a1Var, a1Var2, i) && jab1.h(j, a1Var) == jab1.h(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (l(a1Var, a1Var2, i) && jab1.f(j, a1Var) == jab1.f(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (l(a1Var, a1Var2, i) && jab1.h(j, a1Var) == jab1.h(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (l(a1Var, a1Var2, i) && jab1.f(j, a1Var) == jab1.f(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!l(a1Var, a1Var2, i)) {
                            break;
                        } else {
                            xja1 xja1Var3 = jab1.c;
                            if (xja1Var3.d(j, a1Var) != xja1Var3.d(j, a1Var2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (l(a1Var, a1Var2, i) && e1.a(jab1.j(j, a1Var), jab1.j(j, a1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (l(a1Var, a1Var2, i) && e1.a(jab1.j(j, a1Var), jab1.j(j, a1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (l(a1Var, a1Var2, i) && e1.a(jab1.j(j, a1Var), jab1.j(j, a1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (l(a1Var, a1Var2, i) && jab1.f(j, a1Var) == jab1.f(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (l(a1Var, a1Var2, i) && jab1.f(j, a1Var) == jab1.f(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (l(a1Var, a1Var2, i) && jab1.f(j, a1Var) == jab1.f(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (l(a1Var, a1Var2, i) && jab1.h(j, a1Var) == jab1.h(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (l(a1Var, a1Var2, i) && jab1.f(j, a1Var) == jab1.f(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (l(a1Var, a1Var2, i) && jab1.h(j, a1Var) == jab1.h(j, a1Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (l(a1Var, a1Var2, i) && e1.a(jab1.j(j, a1Var), jab1.j(j, a1Var2))) {
                            continue;
                            i += 3;
                        }
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
                        a = e1.a(jab1.j(j, a1Var), jab1.j(j, a1Var2));
                        break;
                    case 50:
                        a = e1.a(jab1.j(j, a1Var), jab1.j(j, a1Var2));
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
                        if (jab1.f(j2, a1Var) == jab1.f(j2, a1Var2) && e1.a(jab1.j(j, a1Var), jab1.j(j, a1Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (a) {
                    i += 3;
                }
            } else if (a1Var.zzc.equals(a1Var2.zzc)) {
                if (this.f) {
                    return ((z0) a1Var).zzb.equals(((z0) a1Var2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n7b1
    public final int c(a1 a1Var) {
        int i;
        int t;
        int a;
        int z;
        int i2;
        int e;
        int t2;
        int size;
        int r;
        int t3;
        int t4;
        int t5;
        int i3;
        int t6;
        int a2;
        c1 c1Var = this;
        a1 a1Var2 = a1Var;
        Unsafe unsafe = m;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 1048575;
        while (true) {
            int[] iArr = c1Var.a;
            if (i5 >= iArr.length) {
                int c = a1Var2.zzc.c() + i7;
                if (c1Var.f) {
                    g8b1 g8b1Var = ((z0) a1Var2).zzb.a;
                    if (g8b1Var.a() > 0) {
                        xra1.c(g8b1Var.b(0).a());
                        cxa1.g();
                        throw null;
                    }
                    Iterator it = g8b1Var.c().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        b64.D(entry.getKey());
                        entry.getValue();
                        cxa1.g();
                        throw null;
                    }
                }
                return c;
            }
            int E = c1Var.E(i5);
            int F = F(E);
            int i9 = iArr[i5];
            int i10 = iArr[i5 + 2];
            int i11 = i10 & i4;
            if (F <= 17) {
                if (i11 != i8) {
                    i6 = i11 == i4 ? 0 : unsafe.getInt(a1Var2, i11);
                    i8 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = E & i4;
            if (F >= zzlx.zzJ.a()) {
                zzlx.zzW.getClass();
            }
            long j = i12;
            switch (F) {
                case 0:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        i7 = oo31.r(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        i7 = oo31.r(i9 << 3, 4, i7);
                    }
                    c1Var = this;
                    a1Var2 = a1Var;
                    break;
                case 2:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        long j2 = unsafe.getLong(a1Var2, j);
                        t = y0.t(i9 << 3);
                        a = y0.a(j2);
                        i7 += a + t;
                    }
                    c1Var = this;
                    break;
                case 3:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        long j3 = unsafe.getLong(a1Var2, j);
                        t = y0.t(i9 << 3);
                        a = y0.a(j3);
                        i7 += a + t;
                    }
                    c1Var = this;
                    break;
                case 4:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        long j4 = unsafe.getInt(a1Var2, j);
                        t = y0.t(i9 << 3);
                        a = y0.a(j4);
                        i7 += a + t;
                    }
                    c1Var = this;
                    break;
                case 5:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        i7 = oo31.r(i9 << 3, 8, i7);
                    }
                    c1Var = this;
                    a1Var2 = a1Var;
                    break;
                case 6:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        i7 = oo31.r(i9 << 3, 4, i7);
                    }
                    c1Var = this;
                    a1Var2 = a1Var;
                    break;
                case 7:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        i7 = oo31.r(i9 << 3, 1, i7);
                    }
                    c1Var = this;
                    a1Var2 = a1Var;
                    break;
                case 8:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(a1Var2, j);
                        if (object instanceof zzlh) {
                            int t7 = y0.t(i13);
                            int f = ((zzlh) object).f();
                            i7 = oo31.b(f, f, t7, i7);
                        } else {
                            t = y0.t(i13);
                            a = y0.b((String) object);
                            i7 += a + t;
                        }
                    }
                    c1Var = this;
                    break;
                case 9:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        z = e1.z(i9, unsafe.getObject(a1Var2, j), c1Var.y(i5));
                        i7 += z;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        zzlh zzlhVar = (zzlh) unsafe.getObject(a1Var2, j);
                        int t8 = y0.t(i9 << 3);
                        int f2 = zzlhVar.f();
                        i7 = oo31.b(f2, f2, t8, i7);
                    }
                    c1Var = this;
                    break;
                case 11:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        i7 = oo31.r(unsafe.getInt(a1Var2, j), y0.t(i9 << 3), i7);
                    }
                    c1Var = this;
                    break;
                case 12:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        long j5 = unsafe.getInt(a1Var2, j);
                        t = y0.t(i9 << 3);
                        a = y0.a(j5);
                        i7 += a + t;
                    }
                    c1Var = this;
                    break;
                case 13:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        i7 = oo31.r(i9 << 3, 4, i7);
                    }
                    c1Var = this;
                    a1Var2 = a1Var;
                    break;
                case 14:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        i7 = oo31.r(i9 << 3, 8, i7);
                    }
                    c1Var = this;
                    a1Var2 = a1Var;
                    break;
                case 15:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        int i14 = unsafe.getInt(a1Var2, j);
                        i7 = oo31.r((i14 >> 31) ^ (i14 + i14), y0.t(i9 << 3), i7);
                    }
                    c1Var = this;
                    break;
                case 16:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        long j6 = unsafe.getLong(a1Var2, j);
                        t = y0.t(i9 << 3);
                        a = y0.a((j6 >> 63) ^ (j6 + j6));
                        i7 += a + t;
                    }
                    c1Var = this;
                    break;
                case 17:
                    if (c1Var.m(a1Var2, i5, i8, i6, i)) {
                        p5b1 p5b1Var = (p5b1) unsafe.getObject(a1Var2, j);
                        n7b1 y = c1Var.y(i5);
                        int t9 = y0.t(i9 << 3);
                        i2 = t9 + t9;
                        e = ((w0) p5b1Var).e(y);
                        z = e + i2;
                        i7 += z;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    z = e1.y(i9, (List) unsafe.getObject(a1Var2, j));
                    i7 += z;
                    break;
                case 19:
                    z = e1.x(i9, (List) unsafe.getObject(a1Var2, j));
                    i7 += z;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var = e1.a;
                    if (list.size() != 0) {
                        t2 = (y0.t(i9 << 3) * list.size()) + e1.q(list);
                        i7 += t2;
                        break;
                    }
                    t2 = 0;
                    i7 += t2;
                case 21:
                    List list2 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var2 = e1.a;
                    size = list2.size();
                    if (size != 0) {
                        r = e1.r(list2);
                        t3 = y0.t(i9 << 3);
                        t4 = (t3 * size) + r;
                        i7 += t4;
                        break;
                    }
                    t4 = 0;
                    i7 += t4;
                case 22:
                    List list3 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var3 = e1.a;
                    size = list3.size();
                    if (size != 0) {
                        r = e1.u(list3);
                        t3 = y0.t(i9 << 3);
                        t4 = (t3 * size) + r;
                        i7 += t4;
                        break;
                    }
                    t4 = 0;
                    i7 += t4;
                case 23:
                    z = e1.y(i9, (List) unsafe.getObject(a1Var2, j));
                    i7 += z;
                    break;
                case 24:
                    z = e1.x(i9, (List) unsafe.getObject(a1Var2, j));
                    i7 += z;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var4 = e1.a;
                    int size2 = list4.size();
                    if (size2 != 0) {
                        t2 = (y0.t(i9 << 3) + 1) * size2;
                        i7 += t2;
                        break;
                    }
                    t2 = 0;
                    i7 += t2;
                case 26:
                    List list5 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var5 = e1.a;
                    int size3 = list5.size();
                    if (size3 != 0) {
                        t4 = y0.t(i9 << 3) * size3;
                        if (list5 instanceof q2b1) {
                            q2b1 q2b1Var = (q2b1) list5;
                            for (int i15 = 0; i15 < size3; i15++) {
                                Object zzc = q2b1Var.zzc();
                                if (zzc instanceof zzlh) {
                                    int f3 = ((zzlh) zzc).f();
                                    t4 = oo31.r(f3, f3, t4);
                                } else {
                                    t4 = y0.b((String) zzc) + t4;
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < size3; i16++) {
                                Object obj = list5.get(i16);
                                if (obj instanceof zzlh) {
                                    int f4 = ((zzlh) obj).f();
                                    t4 = oo31.r(f4, f4, t4);
                                } else {
                                    t4 = y0.b((String) obj) + t4;
                                }
                            }
                        }
                        i7 += t4;
                        break;
                    }
                    t4 = 0;
                    i7 += t4;
                case 27:
                    List list6 = (List) unsafe.getObject(a1Var2, j);
                    n7b1 y2 = c1Var.y(i5);
                    dq91 dq91Var6 = e1.a;
                    int size4 = list6.size();
                    if (size4 == 0) {
                        t5 = 0;
                    } else {
                        t5 = y0.t(i9 << 3) * size4;
                        for (int i17 = 0; i17 < size4; i17++) {
                            Object obj2 = list6.get(i17);
                            if (obj2 instanceof l2b1) {
                                l2b1 l2b1Var = (l2b1) obj2;
                                int length = l2b1Var.b != null ? ((zzlg) l2b1Var.b).zza.length : l2b1Var.a != null ? ((a1) l2b1Var.a).m() : 0;
                                t5 = oo31.r(length, length, t5);
                            } else {
                                int e2 = ((w0) ((p5b1) obj2)).e(y2);
                                t5 = oo31.r(e2, e2, t5);
                            }
                        }
                    }
                    i7 += t5;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var7 = e1.a;
                    int size5 = list7.size();
                    if (size5 != 0) {
                        t4 = y0.t(i9 << 3) * size5;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int f5 = ((zzlh) list7.get(i18)).f();
                            t4 = oo31.r(f5, f5, t4);
                        }
                        i7 += t4;
                        break;
                    }
                    t4 = 0;
                    i7 += t4;
                case 29:
                    List list8 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var8 = e1.a;
                    size = list8.size();
                    if (size != 0) {
                        r = e1.v(list8);
                        t3 = y0.t(i9 << 3);
                        t4 = (t3 * size) + r;
                        i7 += t4;
                        break;
                    }
                    t4 = 0;
                    i7 += t4;
                case 30:
                    List list9 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var9 = e1.a;
                    size = list9.size();
                    if (size != 0) {
                        r = e1.t(list9);
                        t3 = y0.t(i9 << 3);
                        t4 = (t3 * size) + r;
                        i7 += t4;
                        break;
                    }
                    t4 = 0;
                    i7 += t4;
                case 31:
                    z = e1.x(i9, (List) unsafe.getObject(a1Var2, j));
                    i7 += z;
                    break;
                case 32:
                    z = e1.y(i9, (List) unsafe.getObject(a1Var2, j));
                    i7 += z;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var10 = e1.a;
                    size = list10.size();
                    if (size != 0) {
                        r = e1.w(list10);
                        t3 = y0.t(i9 << 3);
                        t4 = (t3 * size) + r;
                        i7 += t4;
                        break;
                    }
                    t4 = 0;
                    i7 += t4;
                case 34:
                    List list11 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var11 = e1.a;
                    size = list11.size();
                    if (size != 0) {
                        r = e1.s(list11);
                        t3 = y0.t(i9 << 3);
                        t4 = (t3 * size) + r;
                        i7 += t4;
                        break;
                    }
                    t4 = 0;
                    i7 += t4;
                case 35:
                    List list12 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var12 = e1.a;
                    int size6 = list12.size() * 8;
                    if (size6 > 0) {
                        i7 = oo31.b(size6, y0.t(i9 << 3), size6, i7);
                        break;
                    } else {
                        break;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var13 = e1.a;
                    int size7 = list13.size() * 4;
                    if (size7 > 0) {
                        i7 = oo31.b(size7, y0.t(i9 << 3), size7, i7);
                        break;
                    } else {
                        break;
                    }
                case 37:
                    int q = e1.q((List) unsafe.getObject(a1Var2, j));
                    if (q > 0) {
                        i7 = oo31.b(q, y0.t(i9 << 3), q, i7);
                        break;
                    } else {
                        break;
                    }
                case 38:
                    int r2 = e1.r((List) unsafe.getObject(a1Var2, j));
                    if (r2 > 0) {
                        i7 = oo31.b(r2, y0.t(i9 << 3), r2, i7);
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int u = e1.u((List) unsafe.getObject(a1Var2, j));
                    if (u > 0) {
                        i7 = oo31.b(u, y0.t(i9 << 3), u, i7);
                        break;
                    } else {
                        break;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var14 = e1.a;
                    int size8 = list14.size() * 8;
                    if (size8 > 0) {
                        i7 = oo31.b(size8, y0.t(i9 << 3), size8, i7);
                        break;
                    } else {
                        break;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var15 = e1.a;
                    int size9 = list15.size() * 4;
                    if (size9 > 0) {
                        i7 = oo31.b(size9, y0.t(i9 << 3), size9, i7);
                        break;
                    } else {
                        break;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var16 = e1.a;
                    int size10 = list16.size();
                    if (size10 > 0) {
                        i7 = oo31.b(size10, y0.t(i9 << 3), size10, i7);
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int v = e1.v((List) unsafe.getObject(a1Var2, j));
                    if (v > 0) {
                        i7 = oo31.b(v, y0.t(i9 << 3), v, i7);
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int t10 = e1.t((List) unsafe.getObject(a1Var2, j));
                    if (t10 > 0) {
                        i7 = oo31.b(t10, y0.t(i9 << 3), t10, i7);
                        break;
                    } else {
                        break;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var17 = e1.a;
                    int size11 = list17.size() * 4;
                    if (size11 > 0) {
                        i7 = oo31.b(size11, y0.t(i9 << 3), size11, i7);
                        break;
                    } else {
                        break;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(a1Var2, j);
                    dq91 dq91Var18 = e1.a;
                    int size12 = list18.size() * 8;
                    if (size12 > 0) {
                        i7 = oo31.b(size12, y0.t(i9 << 3), size12, i7);
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int w = e1.w((List) unsafe.getObject(a1Var2, j));
                    if (w > 0) {
                        i7 = oo31.b(w, y0.t(i9 << 3), w, i7);
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int s = e1.s((List) unsafe.getObject(a1Var2, j));
                    if (s > 0) {
                        i7 = oo31.b(s, y0.t(i9 << 3), s, i7);
                        break;
                    } else {
                        break;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(a1Var2, j);
                    n7b1 y3 = c1Var.y(i5);
                    dq91 dq91Var19 = e1.a;
                    int size13 = list19.size();
                    if (size13 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i19 = 0; i19 < size13; i19++) {
                            p5b1 p5b1Var2 = (p5b1) list19.get(i19);
                            int t11 = y0.t(i9 << 3);
                            i3 += ((w0) p5b1Var2).e(y3) + t11 + t11;
                        }
                    }
                    i7 += i3;
                    break;
                case 50:
                    int i20 = i5 / 3;
                    zzng zzngVar = (zzng) unsafe.getObject(a1Var2, j);
                    l4b1 l4b1Var = (l4b1) c1Var.b[i20 + i20];
                    if (!zzngVar.isEmpty()) {
                        t4 = 0;
                        for (Map.Entry entry2 : zzngVar.entrySet()) {
                            Object key = entry2.getKey();
                            Object value = entry2.getValue();
                            rfw0 rfw0Var = l4b1Var.a;
                            int t12 = y0.t(i9 << 3);
                            int b = l4b1.b(rfw0Var, key, value);
                            t4 = oo31.b(b, b, t12, t4);
                        }
                        i7 += t4;
                        break;
                    }
                    t4 = 0;
                    i7 += t4;
                case SAFETY_TIPS_VALUE:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        i7 = oo31.r(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        i7 = oo31.r(i9 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        long k = k(j, a1Var2);
                        t6 = y0.t(i9 << 3);
                        a2 = y0.a(k);
                        i7 += a2 + t6;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        long k2 = k(j, a1Var2);
                        t6 = y0.t(i9 << 3);
                        a2 = y0.a(k2);
                        i7 += a2 + t6;
                        break;
                    } else {
                        break;
                    }
                case SODA_DE_DE_VALUE:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        long j7 = j(j, a1Var2);
                        t6 = y0.t(i9 << 3);
                        a2 = y0.a(j7);
                        i7 += a2 + t6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        i7 = oo31.r(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        i7 = oo31.r(i9 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        i7 = oo31.r(i9 << 3, 1, i7);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        int i21 = i9 << 3;
                        Object object2 = unsafe.getObject(a1Var2, j);
                        if (object2 instanceof zzlh) {
                            int t13 = y0.t(i21);
                            int f6 = ((zzlh) object2).f();
                            i7 = oo31.b(f6, f6, t13, i7);
                            break;
                        } else {
                            t6 = y0.t(i21);
                            a2 = y0.b((String) object2);
                            i7 += a2 + t6;
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        z = e1.z(i9, unsafe.getObject(a1Var2, j), c1Var.y(i5));
                        i7 += z;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        zzlh zzlhVar2 = (zzlh) unsafe.getObject(a1Var2, j);
                        int t14 = y0.t(i9 << 3);
                        int f7 = zzlhVar2.f();
                        i7 = oo31.b(f7, f7, t14, i7);
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        i7 = oo31.r(j(j, a1Var2), y0.t(i9 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        long j8 = j(j, a1Var2);
                        t6 = y0.t(i9 << 3);
                        a2 = y0.a(j8);
                        i7 += a2 + t6;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        i7 = oo31.r(i9 << 3, 4, i7);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        i7 = oo31.r(i9 << 3, 8, i7);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        int j9 = j(j, a1Var2);
                        i7 = oo31.r((j9 >> 31) ^ (j9 + j9), y0.t(i9 << 3), i7);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        long k3 = k(j, a1Var2);
                        t6 = y0.t(i9 << 3);
                        a2 = y0.a((k3 >> 63) ^ (k3 + k3));
                        i7 += a2 + t6;
                        break;
                    } else {
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (c1Var.p(i9, i5, a1Var2)) {
                        p5b1 p5b1Var3 = (p5b1) unsafe.getObject(a1Var2, j);
                        n7b1 y4 = c1Var.y(i5);
                        int t15 = y0.t(i9 << 3);
                        i2 = t15 + t15;
                        e = ((w0) p5b1Var3).e(y4);
                        z = e + i2;
                        i7 += z;
                        break;
                    } else {
                        break;
                    }
            }
            i5 += 3;
            i4 = 1048575;
        }
    }

    @Override // defpackage.n7b1
    public final void d(Object obj, dxf0 dxf0Var) {
        int[] iArr;
        int i;
        c1 c1Var = this;
        Map.Entry entry = null;
        if (c1Var.f) {
            cxa1 cxa1Var = ((z0) obj).zzb;
            if (!cxa1Var.a.isEmpty()) {
                entry = (Map.Entry) cxa1Var.c().next();
            }
        }
        Map.Entry entry2 = entry;
        Unsafe unsafe = m;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr2 = c1Var.a;
            if (i4 >= iArr2.length) {
                if (entry2 != null) {
                    throw g8e.j(entry2);
                }
                ((a1) obj).zzc.b(dxf0Var);
                return;
            }
            int E = c1Var.E(i4);
            int F = F(E);
            int i6 = iArr2[i4];
            if (F <= 17) {
                int i7 = iArr2[i4 + 2];
                int i8 = i7 & i2;
                if (i8 != i3) {
                    i5 = i8 == i2 ? 0 : unsafe.getInt(obj, i8);
                    i3 = i8;
                }
                iArr = iArr2;
                i = 1 << (i7 >>> 20);
            } else {
                iArr = iArr2;
                i = 0;
            }
            if (entry2 != null) {
                throw g8e.j(entry2);
            }
            int[] iArr3 = iArr;
            long j = E & i2;
            int i9 = 2;
            switch (F) {
                case 0:
                    if (!c1Var.m(obj, i4, i3, i5, i)) {
                        break;
                    } else {
                        ((y0) dxf0Var.a).h(i6, Double.doubleToRawLongBits(jab1.c.j(j, obj)));
                        continue;
                    }
                case 1:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).f(i6, Float.floatToRawIntBits(jab1.c.f(j, obj)));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).g(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).g(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).d(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).h(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).f(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        boolean d = jab1.c.d(j, obj);
                        y0 y0Var = (y0) dxf0Var.a;
                        y0Var.n(i6 << 3);
                        y0Var.l(d ? (byte) 1 : (byte) 0);
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            y0 y0Var2 = (y0) dxf0Var.a;
                            y0Var2.n((i6 << 3) | 2);
                            y0Var2.s((String) object);
                            break;
                        } else {
                            ((y0) dxf0Var.a).i(i6, (zzlh) object);
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        dxf0Var.d(i6, unsafe.getObject(obj, j), c1Var.y(i4));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).i(i6, (zzlh) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).e(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).d(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).f(i6, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        ((y0) dxf0Var.a).h(i6, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        int i10 = unsafe.getInt(obj, j);
                        ((y0) dxf0Var.a).e(i6, (i10 >> 31) ^ (i10 + i10));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((y0) dxf0Var.a).g(i6, (j2 >> 63) ^ (j2 + j2));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (c1Var.m(obj, i4, i3, i5, i)) {
                        dxf0Var.e(i6, unsafe.getObject(obj, j), c1Var.y(i4));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    e1.c(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 19:
                    e1.d(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 20:
                    e1.e(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 21:
                    e1.f(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 22:
                    e1.j(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 23:
                    e1.h(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 24:
                    e1.m(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 25:
                    e1.p(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 26:
                    int i11 = iArr3[i4];
                    List list = (List) unsafe.getObject(obj, j);
                    dq91 dq91Var = e1.a;
                    if (list != null && !list.isEmpty()) {
                        y0 y0Var3 = (y0) dxf0Var.a;
                        if (list instanceof q2b1) {
                            q2b1 q2b1Var = (q2b1) list;
                            for (int i12 = 0; i12 < list.size(); i12++) {
                                Object zzc = q2b1Var.zzc();
                                if (zzc instanceof String) {
                                    y0Var3.n((i11 << 3) | 2);
                                    y0Var3.s((String) zzc);
                                } else {
                                    y0Var3.i(i11, (zzlh) zzc);
                                }
                            }
                            break;
                        } else {
                            for (int i13 = 0; i13 < list.size(); i13++) {
                                String str = (String) list.get(i13);
                                y0Var3.n((i11 << 3) | 2);
                                y0Var3.s(str);
                            }
                            break;
                        }
                    }
                    break;
                case 27:
                    int i14 = iArr3[i4];
                    List list2 = (List) unsafe.getObject(obj, j);
                    n7b1 y = c1Var.y(i4);
                    dq91 dq91Var2 = e1.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i15 = 0; i15 < list2.size(); i15++) {
                            dxf0Var.d(i14, list2.get(i15), y);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i16 = iArr3[i4];
                    List list3 = (List) unsafe.getObject(obj, j);
                    dq91 dq91Var3 = e1.a;
                    if (list3 != null && !list3.isEmpty()) {
                        dxf0Var.getClass();
                        for (int i17 = 0; i17 < list3.size(); i17++) {
                            ((y0) dxf0Var.a).i(i16, (zzlh) list3.get(i17));
                        }
                        break;
                    }
                    break;
                case 29:
                    e1.k(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 30:
                    e1.o(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 31:
                    e1.n(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 32:
                    e1.i(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 33:
                    e1.l(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 34:
                    e1.g(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    continue;
                case 35:
                    e1.c(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 36:
                    e1.d(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 37:
                    e1.e(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 38:
                    e1.f(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 39:
                    e1.j(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 40:
                    e1.h(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 41:
                    e1.m(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 42:
                    e1.p(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 43:
                    e1.k(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 44:
                    e1.o(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 45:
                    e1.n(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 46:
                    e1.i(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 47:
                    e1.l(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 48:
                    e1.g(iArr3[i4], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    break;
                case 49:
                    int i18 = iArr3[i4];
                    List list4 = (List) unsafe.getObject(obj, j);
                    n7b1 y2 = c1Var.y(i4);
                    dq91 dq91Var4 = e1.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i19 = 0; i19 < list4.size(); i19++) {
                            dxf0Var.e(i18, list4.get(i19), y2);
                        }
                        break;
                    }
                    break;
                case 50:
                    Object object2 = unsafe.getObject(obj, j);
                    if (object2 != null) {
                        int i20 = i4 / 3;
                        rfw0 rfw0Var = ((l4b1) c1Var.b[i20 + i20]).a;
                        dxf0Var.getClass();
                        for (Map.Entry entry3 : ((zzng) object2).entrySet()) {
                            y0 y0Var4 = (y0) dxf0Var.a;
                            y0Var4.c(i6, i9);
                            y0Var4.n(l4b1.b(rfw0Var, entry3.getKey(), entry3.getValue()));
                            l4b1.a(y0Var4, rfw0Var, entry3.getKey(), entry3.getValue());
                            i9 = i9;
                        }
                        break;
                    }
                    break;
                case SAFETY_TIPS_VALUE:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).h(i6, Double.doubleToRawLongBits(((Double) jab1.j(j, obj)).doubleValue()));
                        break;
                    }
                    break;
                case 52:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).f(i6, Float.floatToRawIntBits(((Float) jab1.j(j, obj)).floatValue()));
                        break;
                    }
                    break;
                case 53:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).g(i6, k(j, obj));
                        break;
                    }
                    break;
                case 54:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).g(i6, k(j, obj));
                        break;
                    }
                    break;
                case SODA_DE_DE_VALUE:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).d(i6, j(j, obj));
                        break;
                    }
                    break;
                case 56:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).h(i6, k(j, obj));
                        break;
                    }
                    break;
                case SODA_ES_ES_VALUE:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).f(i6, j(j, obj));
                        break;
                    }
                    break;
                case 58:
                    if (c1Var.p(i6, i4, obj)) {
                        boolean booleanValue = ((Boolean) jab1.j(j, obj)).booleanValue();
                        y0 y0Var5 = (y0) dxf0Var.a;
                        y0Var5.n(i6 << 3);
                        y0Var5.l(booleanValue ? (byte) 1 : (byte) 0);
                        break;
                    }
                    break;
                case 59:
                    if (c1Var.p(i6, i4, obj)) {
                        Object object3 = unsafe.getObject(obj, j);
                        if (object3 instanceof String) {
                            y0 y0Var6 = (y0) dxf0Var.a;
                            y0Var6.n((i6 << 3) | 2);
                            y0Var6.s((String) object3);
                            break;
                        } else {
                            ((y0) dxf0Var.a).i(i6, (zzlh) object3);
                            break;
                        }
                    }
                    break;
                case 60:
                    if (c1Var.p(i6, i4, obj)) {
                        dxf0Var.d(i6, unsafe.getObject(obj, j), c1Var.y(i4));
                        break;
                    }
                    break;
                case 61:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).i(i6, (zzlh) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).e(i6, j(j, obj));
                        break;
                    }
                    break;
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).d(i6, j(j, obj));
                        break;
                    }
                    break;
                case 64:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).f(i6, j(j, obj));
                        break;
                    }
                    break;
                case 65:
                    if (c1Var.p(i6, i4, obj)) {
                        ((y0) dxf0Var.a).h(i6, k(j, obj));
                        break;
                    }
                    break;
                case 66:
                    if (c1Var.p(i6, i4, obj)) {
                        int j3 = j(j, obj);
                        ((y0) dxf0Var.a).e(i6, (j3 >> 31) ^ (j3 + j3));
                        break;
                    }
                    break;
                case 67:
                    if (c1Var.p(i6, i4, obj)) {
                        long k = k(j, obj);
                        ((y0) dxf0Var.a).g(i6, (k >> 63) ^ (k + k));
                        break;
                    }
                    break;
                case TRANSLATE_KIT_VALUE:
                    if (c1Var.p(i6, i4, obj)) {
                        dxf0Var.e(i6, unsafe.getObject(obj, j), c1Var.y(i4));
                        break;
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
            c1Var = this;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.n7b1
    public final void e(Object obj, Object obj2) {
        Object obj3;
        if (!i(obj)) {
            ny61.g("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                e1.b(obj4, obj2);
                if (!this.f || ((z0) obj2).zzb.a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int E = E(i);
            int i2 = E & 1048575;
            int F = F(E);
            int i3 = iArr[i];
            long j = i2;
            switch (F) {
                case 0:
                    if (n(i, obj2)) {
                        xja1 xja1Var = jab1.c;
                        obj3 = obj;
                        xja1Var.l(obj3, j, xja1Var.j(j, obj2));
                        o(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (n(i, obj2)) {
                        xja1 xja1Var2 = jab1.c;
                        xja1Var2.i(obj, j, xja1Var2.f(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (n(i, obj2)) {
                        jab1.i(obj, j, jab1.h(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (n(i, obj2)) {
                        jab1.i(obj, j, jab1.h(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (n(i, obj2)) {
                        jab1.g(j, obj, jab1.f(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (n(i, obj2)) {
                        jab1.i(obj, j, jab1.h(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (n(i, obj2)) {
                        jab1.g(j, obj, jab1.f(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (n(i, obj2)) {
                        xja1 xja1Var3 = jab1.c;
                        xja1Var3.e(obj, j, xja1Var3.d(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (n(i, obj2)) {
                        jab1.k(j, obj, jab1.j(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (n(i, obj2)) {
                        jab1.k(j, obj, jab1.j(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (n(i, obj2)) {
                        jab1.g(j, obj, jab1.f(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (n(i, obj2)) {
                        jab1.g(j, obj, jab1.f(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (n(i, obj2)) {
                        jab1.g(j, obj, jab1.f(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (n(i, obj2)) {
                        jab1.i(obj, j, jab1.h(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (n(i, obj2)) {
                        jab1.g(j, obj, jab1.f(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (n(i, obj2)) {
                        jab1.i(obj, j, jab1.h(j, obj2));
                        o(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    w(i, obj, obj2);
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
                    z0b1 z0b1Var = (z0b1) jab1.j(j, obj);
                    z0b1 z0b1Var2 = (z0b1) jab1.j(j, obj2);
                    int size = z0b1Var.size();
                    int size2 = z0b1Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((vqa1) z0b1Var).a) {
                            z0b1Var = z0b1Var.b0(size2 + size);
                        }
                        z0b1Var.addAll(z0b1Var2);
                    }
                    if (size > 0) {
                        z0b1Var2 = z0b1Var;
                    }
                    jab1.k(j, obj, z0b1Var2);
                    obj3 = obj;
                    break;
                case 50:
                    dq91 dq91Var = e1.a;
                    jab1.k(j, obj, sp91.a(jab1.j(j, obj), jab1.j(j, obj2)));
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
                    if (p(i3, i, obj2)) {
                        jab1.k(j, obj, jab1.j(j, obj2));
                        jab1.g(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    x(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (p(i3, i, obj2)) {
                        jab1.k(j, obj, jab1.j(j, obj2));
                        jab1.g(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case TRANSLATE_KIT_VALUE:
                    x(i, obj, obj2);
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

    @Override // defpackage.n7b1
    public final void f(Object obj) {
        if (!i(obj)) {
            return;
        }
        if (obj instanceof a1) {
            a1 a1Var = (a1) obj;
            a1Var.l();
            a1Var.zza = 0;
            a1Var.h();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.j.getClass();
                i9b1 i9b1Var = ((a1) obj).zzc;
                if (i9b1Var.e) {
                    i9b1Var.e = false;
                }
                if (this.f) {
                    this.k.getClass();
                    ((z0) obj).zzb.b();
                    return;
                }
                return;
            }
            int E = E(i);
            int i2 = 1048575 & E;
            int F = F(E);
            long j = i2;
            if (F != 9) {
                if (F != 60 && F != 68) {
                    switch (F) {
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
                            vqa1 vqa1Var = (vqa1) ((z0b1) jab1.j(j, obj));
                            if (!vqa1Var.a) {
                                break;
                            } else {
                                vqa1Var.a = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = m;
                            Object object = unsafe.getObject(obj, j);
                            if (object == null) {
                                break;
                            } else {
                                ((zzng) object).b();
                                unsafe.putObject(obj, j, object);
                                break;
                            }
                    }
                } else if (p(iArr[i], i, obj)) {
                    y(i).f(m.getObject(obj, j));
                }
                i += 3;
            }
            if (n(i, obj)) {
                y(i).f(m.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // defpackage.n7b1
    public final void g(Object obj, byte[] bArr, int i, int i2, v43 v43Var) {
        t(obj, bArr, i, i2, 0, v43Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // defpackage.n7b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(a1 a1Var) {
        int i;
        long doubleToLongBits;
        int i2;
        int floatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                int hashCode = a1Var.zzc.hashCode() + (i6 * 53);
                if (!this.f) {
                    return hashCode;
                }
                return ((z0) a1Var).zzb.a.hashCode() + (hashCode * 53);
            }
            int E = E(i5);
            int i7 = 1048575 & E;
            int F = F(E);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (F) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(jab1.c.j(j, a1Var));
                    Charset charset = f1b1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(jab1.c.f(j, a1Var));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = jab1.h(j, a1Var);
                    Charset charset2 = f1b1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = jab1.h(j, a1Var);
                    Charset charset3 = f1b1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = jab1.f(j, a1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = jab1.h(j, a1Var);
                    Charset charset4 = f1b1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = jab1.f(j, a1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean d = jab1.c.d(j, a1Var);
                    Charset charset5 = f1b1.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) jab1.j(j, a1Var)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object j2 = jab1.j(j, a1Var);
                    if (j2 != null) {
                        i10 = j2.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = jab1.j(j, a1Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = jab1.f(j, a1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = jab1.f(j, a1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = jab1.f(j, a1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = jab1.h(j, a1Var);
                    Charset charset6 = f1b1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = jab1.f(j, a1Var);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = jab1.h(j, a1Var);
                    Charset charset7 = f1b1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object j3 = jab1.j(j, a1Var);
                    if (j3 != null) {
                        i10 = j3.hashCode();
                    }
                    i6 = i4 + i10;
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
                    i2 = i6 * 53;
                    floatToIntBits = jab1.j(j, a1Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = jab1.j(j, a1Var).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case SAFETY_TIPS_VALUE:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) jab1.j(j, a1Var)).doubleValue());
                        Charset charset8 = f1b1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) jab1.j(j, a1Var)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j, a1Var);
                        Charset charset9 = f1b1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j, a1Var);
                        Charset charset10 = f1b1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case SODA_DE_DE_VALUE:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j, a1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j, a1Var);
                        Charset charset11 = f1b1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j, a1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) jab1.j(j, a1Var)).booleanValue();
                        Charset charset12 = f1b1.a;
                        break;
                    }
                case 59:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) jab1.j(j, a1Var)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = jab1.j(j, a1Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = jab1.j(j, a1Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j, a1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j, a1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j, a1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j, a1Var);
                        Charset charset13 = f1b1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = j(j, a1Var);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = k(j, a1Var);
                        Charset charset14 = f1b1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (!p(i8, i5, a1Var)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = jab1.j(j, a1Var).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    public final boolean l(a1 a1Var, a1 a1Var2, int i) {
        return n(i, a1Var) == n(i, a1Var2);
    }

    public final boolean m(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? n(i, obj) : (i3 & i4) != 0;
    }

    public final boolean n(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & jab1.f(j, obj)) != 0;
        }
        int E = E(i);
        long j2 = E & 1048575;
        switch (F(E)) {
            case 0:
                if (Double.doubleToRawLongBits(jab1.c.j(j2, obj)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(jab1.c.f(j2, obj)) != 0) {
                }
                break;
            case 2:
                if (jab1.h(j2, obj) != 0) {
                }
                break;
            case 3:
                if (jab1.h(j2, obj) != 0) {
                }
                break;
            case 4:
                if (jab1.f(j2, obj) != 0) {
                }
                break;
            case 5:
                if (jab1.h(j2, obj) != 0) {
                }
                break;
            case 6:
                if (jab1.f(j2, obj) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object j3 = jab1.j(j2, obj);
                if (!(j3 instanceof String)) {
                    if (!(j3 instanceof zzlh)) {
                        w511.q();
                        break;
                    } else if (!zzlh.a.equals(j3)) {
                    }
                } else if (!((String) j3).isEmpty()) {
                }
                break;
            case 9:
                if (jab1.j(j2, obj) != null) {
                }
                break;
            case 10:
                if (!zzlh.a.equals(jab1.j(j2, obj))) {
                }
                break;
            case 11:
                if (jab1.f(j2, obj) != 0) {
                }
                break;
            case 12:
                if (jab1.f(j2, obj) != 0) {
                }
                break;
            case 13:
                if (jab1.f(j2, obj) != 0) {
                }
                break;
            case 14:
                if (jab1.h(j2, obj) != 0) {
                }
                break;
            case 15:
                if (jab1.f(j2, obj) != 0) {
                }
                break;
            case 16:
                if (jab1.h(j2, obj) != 0) {
                }
                break;
            case 17:
                if (jab1.j(j2, obj) != null) {
                }
                break;
            default:
                w511.q();
                break;
        }
        return false;
    }

    public final void o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        jab1.g(j, obj, (1 << (i2 >>> 20)) | jab1.f(j, obj));
    }

    public final boolean p(int i, int i2, Object obj) {
        return jab1.f((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final int q(int i, int i2) {
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int t(java.lang.Object r42, byte[] r43, int r44, int r45, int r46, defpackage.v43 r47) {
        /*
            Method dump skipped, instructions count: 4180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.c1.t(java.lang.Object, byte[], int, int, int, v43):int");
    }

    public final void w(int i, Object obj, Object obj2) {
        if (n(i, obj2)) {
            int E = E(i) & 1048575;
            Unsafe unsafe = m;
            long j = E;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i2 = this.a[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i2);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            n7b1 y = y(i);
            if (!n(i, obj)) {
                if (i(object)) {
                    Object zza = y.zza();
                    y.e(zza, object);
                    unsafe.putObject(obj, j, zza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                o(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!i(object2)) {
                Object zza2 = y.zza();
                y.e(zza2, object2);
                unsafe.putObject(obj, j, zza2);
                object2 = zza2;
            }
            y.e(object2, object);
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (p(i2, i, obj2)) {
            int E = E(i) & 1048575;
            Unsafe unsafe = m;
            long j = E;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                int i3 = iArr[i];
                String obj3 = obj2.toString();
                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 38 + obj3.length());
                sb.append("Source subfield ");
                sb.append(i3);
                sb.append(" is present but null: ");
                sb.append(obj3);
                throw new IllegalStateException(sb.toString());
            }
            n7b1 y = y(i);
            if (!p(i2, i, obj)) {
                if (i(object)) {
                    Object zza = y.zza();
                    y.e(zza, object);
                    unsafe.putObject(obj, j, zza);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                jab1.g(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!i(object2)) {
                Object zza2 = y.zza();
                y.e(zza2, object2);
                unsafe.putObject(obj, j, zza2);
                object2 = zza2;
            }
            y.e(object2, object);
        }
    }

    public final n7b1 y(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        n7b1 n7b1Var = (n7b1) objArr[i3];
        if (n7b1Var != null) {
            return n7b1Var;
        }
        n7b1 a = a7b1.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final d0b1 z(int i) {
        int i2 = i / 3;
        return (d0b1) this.b[i2 + i2 + 1];
    }

    @Override // defpackage.n7b1
    public final Object zza() {
        return (a1) ((a1) this.e).q(4);
    }
}
