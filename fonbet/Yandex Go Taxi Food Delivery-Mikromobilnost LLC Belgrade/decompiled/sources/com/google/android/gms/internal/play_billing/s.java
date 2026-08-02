package com.google.android.gms.internal.play_billing;

import defpackage.a4a1;
import defpackage.b64;
import defpackage.dxf0;
import defpackage.eka1;
import defpackage.fw91;
import defpackage.g8e;
import defpackage.i7a1;
import defpackage.jfa1;
import defpackage.jga1;
import defpackage.m9a1;
import defpackage.ny61;
import defpackage.ofa1;
import defpackage.oo31;
import defpackage.oyr;
import defpackage.pia1;
import defpackage.q7a1;
import defpackage.s9a1;
import defpackage.sp91;
import defpackage.u6a1;
import defpackage.uw91;
import defpackage.w511;
import defpackage.xea1;
import defpackage.xja1;
import defpackage.xp91;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class s implements ofa1 {
    public static final int[] l = new int[0];
    public static final Unsafe m = eka1.i();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final m e;
    public final boolean f;
    public final int[] g;
    public final int h;
    public final int i;
    public final xp91 j;
    public final sp91 k;

    public s(int[] iArr, Object[] objArr, int i, int i2, m mVar, int[] iArr2, int i3, int i4, xp91 xp91Var, sp91 sp91Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        boolean z = false;
        if (sp91Var != null && (mVar instanceof o)) {
            z = true;
        }
        this.f = z;
        this.g = iArr2;
        this.h = i3;
        this.i = i4;
        this.j = xp91Var;
        this.k = sp91Var;
        this.e = mVar;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder v = b64.v("Field ", str, " for ", name, " not found. Known fields are ");
            v.append(arrays);
            throw new RuntimeException(v.toString());
        }
    }

    public static boolean q(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof p) {
            return ((p) obj).e();
        }
        return true;
    }

    public static pia1 t(Object obj) {
        p pVar = (p) obj;
        pia1 pia1Var = pVar.zzc;
        if (pia1Var != pia1.f) {
            return pia1Var;
        }
        pia1 b = pia1.b();
        pVar.zzc = b;
        return b;
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
    public static s u(jfa1 jfa1Var, xp91 xp91Var, sp91 sp91Var) {
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
        Field E;
        char charAt10;
        int i25;
        int i26;
        int i27;
        int i28;
        Object obj;
        Field E2;
        Object obj2;
        Field E3;
        int i29;
        char charAt11;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        if (!(jfa1Var instanceof jfa1)) {
            ny61.u();
            return null;
        }
        String str = jfa1Var.b;
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
        Object[] objArr2 = jfa1Var.c;
        Class<?> cls2 = jfa1Var.a.getClass();
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
                        if (jfa1Var.a() == 1 || i79 != 0) {
                            i27 = i6 + 1;
                            int i88 = i69 / 3;
                            objArr3[i88 + i88 + 1] = objArr4[i6];
                        } else {
                            i28 = 0;
                            int i89 = i86 + i86;
                            i79 = i28;
                            obj = objArr4[i89];
                            if (obj instanceof Field) {
                                E2 = (Field) obj;
                            } else {
                                E2 = E(cls2, (String) obj);
                                objArr4[i89] = E2;
                            }
                            int objectFieldOffset2 = (int) unsafe.objectFieldOffset(E2);
                            int i90 = i89 + 1;
                            obj2 = objArr4[i90];
                            if (obj2 instanceof Field) {
                                E3 = (Field) obj2;
                            } else {
                                E3 = E(cls2, (String) obj2);
                                objArr4[i90] = E3;
                            }
                            i21 = i84;
                            i24 = objectFieldOffset2;
                            i20 = 55296;
                            objArr = objArr3;
                            i18 = i2;
                            cls = cls2;
                            i23 = 0;
                            i19 = (int) unsafe.objectFieldOffset(E3);
                        }
                    }
                    i28 = i79;
                    int i892 = i86 + i86;
                    i79 = i28;
                    obj = objArr4[i892];
                    if (obj instanceof Field) {
                    }
                    int objectFieldOffset22 = (int) unsafe.objectFieldOffset(E2);
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
                    i19 = (int) unsafe.objectFieldOffset(E3);
                }
                i6 = i27;
                i28 = i79;
                int i8922 = i86 + i86;
                i79 = i28;
                obj = objArr4[i8922];
                if (obj instanceof Field) {
                }
                int objectFieldOffset222 = (int) unsafe.objectFieldOffset(E2);
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
                i19 = (int) unsafe.objectFieldOffset(E3);
            } else {
                int i91 = i6 + 1;
                Field E4 = E(cls2, (String) objArr4[i6]);
                objArr = objArr3;
                if (i77 == 9 || i77 == 17) {
                    i18 = i2;
                    int i92 = i69 / 3;
                    objArr[i92 + i92 + 1] = E4.getType();
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
                            if (jfa1Var.a() == 1 || i79 != 0) {
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
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
                                E = (Field) obj3;
                            } else {
                                E = E(cls, (String) obj3);
                                objArr4[i101] = E;
                            }
                            i22 = charAt26 % 32;
                            i19 = (int) unsafe.objectFieldOffset(E);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(E4);
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
        return new s(iArr2, objArr3, i3, i5, jfa1Var.a, iArr, i7, i64, xp91Var, sp91Var);
    }

    public static int v(long j, Object obj) {
        return ((Integer) eka1.h(j, obj)).intValue();
    }

    public static int x(int i) {
        return (i >>> 20) & 255;
    }

    public static long z(long j, Object obj) {
        return ((Long) eka1.h(j, obj)).longValue();
    }

    public final u6a1 A(int i) {
        int i2 = i / 3;
        return (u6a1) this.b[i2 + i2 + 1];
    }

    public final ofa1 B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        ofa1 ofa1Var = (ofa1) objArr[i3];
        if (ofa1Var != null) {
            return ofa1Var;
        }
        ofa1 a = xea1.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a;
        return a;
    }

    public final Object C(int i, Object obj) {
        ofa1 B = B(i);
        int y = y(i) & 1048575;
        if (!o(i, obj)) {
            return B.zze();
        }
        Object object = m.getObject(obj, y);
        if (q(object)) {
            return object;
        }
        Object zze = B.zze();
        if (object != null) {
            B.f(zze, object);
        }
        return zze;
    }

    public final Object D(int i, int i2, Object obj) {
        ofa1 B = B(i2);
        if (!r(i, i2, obj)) {
            return B.zze();
        }
        Object object = m.getObject(obj, y(i2) & 1048575);
        if (q(object)) {
            return object;
        }
        Object zze = B.zze();
        if (object != null) {
            B.f(zze, object);
        }
        return zze;
    }

    @Override // defpackage.ofa1
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
            int y = y(i7);
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
            if ((268435456 & y) == 0 || p(obj, i2, i, i3, i11)) {
                int x = x(y);
                if (x == 9 || x == 17) {
                    if (p(obj, i2, i, i3, i11) && !B(i2).a(eka1.h(y & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (x != 27) {
                        if (x == 60 || x == 68) {
                            if (r(i8, i2, obj) && !B(i2).a(eka1.h(y & 1048575, obj))) {
                            }
                        } else if (x != 49) {
                            if (x == 50 && !((zzig) eka1.h(y & 1048575, obj)).isEmpty()) {
                                int i13 = i2 / 3;
                                b64.D(this.b[i13 + i13]);
                                throw null;
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) eka1.h(y & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        ofa1 B = B(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (B.a(list.get(i14))) {
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
            ((o) obj).zzb.e();
        }
        return true;
    }

    @Override // defpackage.ofa1
    public final void b(Object obj) {
        if (!q(obj)) {
            return;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            pVar.p();
            pVar.zza = 0;
            pVar.n();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.j.getClass();
                pia1 pia1Var = ((p) obj).zzc;
                if (pia1Var.e) {
                    pia1Var.e = false;
                }
                if (this.f) {
                    this.k.getClass();
                    ((o) obj).zzb.d();
                    return;
                }
                return;
            }
            int y = y(i);
            int i2 = 1048575 & y;
            int x = x(y);
            long j = i2;
            if (x != 9) {
                if (x != 60 && x != 68) {
                    switch (x) {
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
                            ((fw91) ((i7a1) eka1.h(j, obj))).zzb();
                            break;
                        case 50:
                            Unsafe unsafe = m;
                            Object object = unsafe.getObject(obj, j);
                            if (object == null) {
                                break;
                            } else {
                                ((zzig) object).c();
                                unsafe.putObject(obj, j, object);
                                break;
                            }
                    }
                } else if (r(iArr[i], i, obj)) {
                    B(i).b(m.getObject(obj, j));
                }
                i += 3;
            }
            if (o(i, obj)) {
                B(i).b(m.getObject(obj, j));
            }
            i += 3;
        }
    }

    @Override // defpackage.ofa1
    public final int c(p pVar) {
        int i;
        int q;
        int a;
        int q2;
        int f;
        int q3;
        int k;
        int i2;
        int b;
        int q4;
        int size;
        int o;
        int q5;
        int q6;
        int q7;
        int size2;
        int q8;
        int q9;
        int size3;
        int q10;
        int q11;
        int i3;
        int i4;
        int q12;
        int a2;
        s sVar = this;
        p pVar2 = pVar;
        int[] iArr = sVar.a;
        Unsafe unsafe = m;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < iArr.length) {
            int y = sVar.y(i7);
            int x = x(y);
            int i10 = iArr[i7];
            int i11 = iArr[i7 + 2];
            int i12 = i11 & i5;
            if (x <= 17) {
                if (i12 != i6) {
                    i8 = i12 == i5 ? 0 : unsafe.getInt(pVar2, i12);
                    i6 = i12;
                }
                i = 1 << (i11 >>> 20);
            } else {
                i = 0;
            }
            int i13 = y & i5;
            if (x >= zzhc.zzJ.a()) {
                zzhc.zzW.getClass();
            }
            long j = i13;
            switch (x) {
                case 0:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        i9 = oo31.a(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case 1:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        i9 = oo31.a(i10 << 3, 4, i9);
                    }
                    sVar = this;
                    pVar2 = pVar;
                    i7 += 3;
                    i5 = 1048575;
                case 2:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        long j2 = unsafe.getLong(pVar2, j);
                        q = n.q(i10 << 3);
                        a = n.a(j2);
                        i9 += a + q;
                    }
                    sVar = this;
                    i7 += 3;
                    i5 = 1048575;
                case 3:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(pVar2, j);
                        q = n.q(i10 << 3);
                        a = n.a(j3);
                        i9 += a + q;
                    }
                    sVar = this;
                    i7 += 3;
                    i5 = 1048575;
                case 4:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        long j4 = unsafe.getInt(pVar2, j);
                        q = n.q(i10 << 3);
                        a = n.a(j4);
                        i9 += a + q;
                    }
                    sVar = this;
                    i7 += 3;
                    i5 = 1048575;
                case 5:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        i9 = oo31.a(i10 << 3, 8, i9);
                    }
                    sVar = this;
                    pVar2 = pVar;
                    i7 += 3;
                    i5 = 1048575;
                case 6:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        i9 = oo31.a(i10 << 3, 4, i9);
                    }
                    sVar = this;
                    pVar2 = pVar;
                    i7 += 3;
                    i5 = 1048575;
                case 7:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        i9 = oo31.a(i10 << 3, 1, i9);
                    }
                    sVar = this;
                    pVar2 = pVar;
                    i7 += 3;
                    i5 = 1048575;
                case 8:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        int i14 = i10 << 3;
                        Object object = unsafe.getObject(pVar2, j);
                        if (object instanceof zzgk) {
                            q2 = n.q(i14);
                            f = ((zzgk) object).f();
                            q3 = n.q(f);
                            i9 += q3 + f + q2;
                        } else {
                            q = n.q(i14);
                            a = n.p((String) object);
                            i9 += a + q;
                        }
                    }
                    sVar = this;
                    i7 += 3;
                    i5 = 1048575;
                case 9:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        k = u.k(i10, unsafe.getObject(pVar2, j), sVar.B(i7));
                        i9 += k;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 10:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        zzgk zzgkVar = (zzgk) unsafe.getObject(pVar2, j);
                        q2 = n.q(i10 << 3);
                        f = zzgkVar.f();
                        q3 = n.q(f);
                        i9 += q3 + f + q2;
                    }
                    sVar = this;
                    i7 += 3;
                    i5 = 1048575;
                case 11:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        i9 = oo31.a(unsafe.getInt(pVar2, j), n.q(i10 << 3), i9);
                    }
                    sVar = this;
                    i7 += 3;
                    i5 = 1048575;
                case 12:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        long j5 = unsafe.getInt(pVar2, j);
                        q = n.q(i10 << 3);
                        a = n.a(j5);
                        i9 += a + q;
                    }
                    sVar = this;
                    i7 += 3;
                    i5 = 1048575;
                case 13:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        i9 = oo31.a(i10 << 3, 4, i9);
                    }
                    sVar = this;
                    pVar2 = pVar;
                    i7 += 3;
                    i5 = 1048575;
                case 14:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        i9 = oo31.a(i10 << 3, 8, i9);
                    }
                    sVar = this;
                    pVar2 = pVar;
                    i7 += 3;
                    i5 = 1048575;
                case 15:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        int i15 = unsafe.getInt(pVar2, j);
                        i9 = oo31.a((i15 >> 31) ^ (i15 + i15), n.q(i10 << 3), i9);
                    }
                    sVar = this;
                    i7 += 3;
                    i5 = 1048575;
                case 16:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        long j6 = unsafe.getLong(pVar2, j);
                        q = n.q(i10 << 3);
                        a = n.a((j6 >> 63) ^ (j6 + j6));
                        i9 += a + q;
                    }
                    sVar = this;
                    i7 += 3;
                    i5 = 1048575;
                case 17:
                    if (sVar.p(pVar2, i7, i6, i8, i)) {
                        m mVar = (m) unsafe.getObject(pVar2, j);
                        ofa1 B = sVar.B(i7);
                        int q13 = n.q(i10 << 3);
                        i2 = q13 + q13;
                        b = mVar.b(B);
                        k = b + i2;
                        i9 += k;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 18:
                    k = u.h(i10, (List) unsafe.getObject(pVar2, j));
                    i9 += k;
                    i7 += 3;
                    i5 = 1048575;
                case 19:
                    k = u.g(i10, (List) unsafe.getObject(pVar2, j));
                    i9 += k;
                    i7 += 3;
                    i5 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var = u.a;
                    if (list.size() != 0) {
                        q4 = (n.q(i10 << 3) * list.size()) + u.j(list);
                        i9 += q4;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q4 = 0;
                    i9 += q4;
                    i7 += 3;
                    i5 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var2 = u.a;
                    size = list2.size();
                    if (size != 0) {
                        o = u.o(list2);
                        q5 = n.q(i10 << 3);
                        q6 = (q5 * size) + o;
                        i9 += q6;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q6 = 0;
                    i9 += q6;
                    i7 += 3;
                    i5 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var3 = u.a;
                    size = list3.size();
                    if (size != 0) {
                        o = u.i(list3);
                        q5 = n.q(i10 << 3);
                        q6 = (q5 * size) + o;
                        i9 += q6;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q6 = 0;
                    i9 += q6;
                    i7 += 3;
                    i5 = 1048575;
                case 23:
                    k = u.h(i10, (List) unsafe.getObject(pVar2, j));
                    i9 += k;
                    i7 += 3;
                    i5 = 1048575;
                case 24:
                    k = u.g(i10, (List) unsafe.getObject(pVar2, j));
                    i9 += k;
                    i7 += 3;
                    i5 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var4 = u.a;
                    int size4 = list4.size();
                    if (size4 != 0) {
                        q4 = (n.q(i10 << 3) + 1) * size4;
                        i9 += q4;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q4 = 0;
                    i9 += q4;
                    i7 += 3;
                    i5 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var5 = u.a;
                    int size5 = list5.size();
                    if (size5 != 0) {
                        q6 = n.q(i10 << 3) * size5;
                        if (list5 instanceof s9a1) {
                            s9a1 s9a1Var = (s9a1) list5;
                            for (int i16 = 0; i16 < size5; i16++) {
                                Object zzc = s9a1Var.zzc();
                                if (zzc instanceof zzgk) {
                                    int f2 = ((zzgk) zzc).f();
                                    q6 = oo31.a(f2, f2, q6);
                                } else {
                                    q6 = n.p((String) zzc) + q6;
                                }
                            }
                        } else {
                            for (int i17 = 0; i17 < size5; i17++) {
                                Object obj = list5.get(i17);
                                if (obj instanceof zzgk) {
                                    int f3 = ((zzgk) obj).f();
                                    q6 = oo31.a(f3, f3, q6);
                                } else {
                                    q6 = n.p((String) obj) + q6;
                                }
                            }
                        }
                        i9 += q6;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q6 = 0;
                    i9 += q6;
                    i7 += 3;
                    i5 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(pVar2, j);
                    ofa1 B2 = sVar.B(i7);
                    xp91 xp91Var6 = u.a;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        q7 = 0;
                    } else {
                        q7 = n.q(i10 << 3) * size6;
                        for (int i18 = 0; i18 < size6; i18++) {
                            Object obj2 = list6.get(i18);
                            if (obj2 instanceof m9a1) {
                                m9a1 m9a1Var = (m9a1) obj2;
                                int length = m9a1Var.b != null ? ((zzgi) m9a1Var.b).zza.length : m9a1Var.a != null ? ((p) m9a1Var.a).h() : 0;
                                q7 = oo31.a(length, length, q7);
                            } else {
                                int b2 = ((m) obj2).b(B2);
                                q7 = oo31.a(b2, b2, q7);
                            }
                        }
                    }
                    i9 += q7;
                    i7 += 3;
                    i5 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var7 = u.a;
                    int size7 = list7.size();
                    if (size7 != 0) {
                        q6 = n.q(i10 << 3) * size7;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int f4 = ((zzgk) list7.get(i19)).f();
                            q6 = oo31.a(f4, f4, q6);
                        }
                        i9 += q6;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q6 = 0;
                    i9 += q6;
                    i7 += 3;
                    i5 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var8 = u.a;
                    size = list8.size();
                    if (size != 0) {
                        o = u.n(list8);
                        q5 = n.q(i10 << 3);
                        q6 = (q5 * size) + o;
                        i9 += q6;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q6 = 0;
                    i9 += q6;
                    i7 += 3;
                    i5 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var9 = u.a;
                    size = list9.size();
                    if (size != 0) {
                        o = u.f(list9);
                        q5 = n.q(i10 << 3);
                        q6 = (q5 * size) + o;
                        i9 += q6;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q6 = 0;
                    i9 += q6;
                    i7 += 3;
                    i5 = 1048575;
                case 31:
                    k = u.g(i10, (List) unsafe.getObject(pVar2, j));
                    i9 += k;
                    i7 += 3;
                    i5 = 1048575;
                case 32:
                    k = u.h(i10, (List) unsafe.getObject(pVar2, j));
                    i9 += k;
                    i7 += 3;
                    i5 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var10 = u.a;
                    size = list10.size();
                    if (size != 0) {
                        o = u.l(list10);
                        q5 = n.q(i10 << 3);
                        q6 = (q5 * size) + o;
                        i9 += q6;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q6 = 0;
                    i9 += q6;
                    i7 += 3;
                    i5 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var11 = u.a;
                    size = list11.size();
                    if (size != 0) {
                        o = u.m(list11);
                        q5 = n.q(i10 << 3);
                        q6 = (q5 * size) + o;
                        i9 += q6;
                        i7 += 3;
                        i5 = 1048575;
                    }
                    q6 = 0;
                    i9 += q6;
                    i7 += 3;
                    i5 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var12 = u.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var13 = u.a;
                    size3 = list13.size() * 4;
                    if (size3 > 0) {
                        q10 = n.q(i10 << 3);
                        q11 = n.q(size3);
                        i3 = q11 + q10 + size3;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 37:
                    size2 = u.j((List) unsafe.getObject(pVar2, j));
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 38:
                    size2 = u.o((List) unsafe.getObject(pVar2, j));
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 39:
                    size2 = u.i((List) unsafe.getObject(pVar2, j));
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var14 = u.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var15 = u.a;
                    size3 = list15.size() * 4;
                    if (size3 > 0) {
                        q10 = n.q(i10 << 3);
                        q11 = n.q(size3);
                        i3 = q11 + q10 + size3;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var16 = u.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 43:
                    size2 = u.n((List) unsafe.getObject(pVar2, j));
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 44:
                    size2 = u.f((List) unsafe.getObject(pVar2, j));
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var17 = u.a;
                    size3 = list17.size() * 4;
                    if (size3 > 0) {
                        q10 = n.q(i10 << 3);
                        q11 = n.q(size3);
                        i3 = q11 + q10 + size3;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(pVar2, j);
                    xp91 xp91Var18 = u.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 47:
                    size2 = u.l((List) unsafe.getObject(pVar2, j));
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 48:
                    size2 = u.m((List) unsafe.getObject(pVar2, j));
                    if (size2 > 0) {
                        q8 = n.q(i10 << 3);
                        q9 = n.q(size2);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(pVar2, j);
                    ofa1 B3 = sVar.B(i7);
                    xp91 xp91Var19 = u.a;
                    int size8 = list19.size();
                    if (size8 == 0) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        for (int i20 = 0; i20 < size8; i20++) {
                            m mVar2 = (m) list19.get(i20);
                            int q14 = n.q(i10 << 3);
                            i4 += mVar2.b(B3) + q14 + q14;
                        }
                    }
                    i9 += i4;
                    i7 += 3;
                    i5 = 1048575;
                case 50:
                    Object object2 = unsafe.getObject(pVar2, j);
                    int i21 = i7 / 3;
                    zzig zzigVar = (zzig) object2;
                    if (sVar.b[i21 + i21] != null) {
                        ny61.u();
                        return 0;
                    }
                    if (zzigVar.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = zzigVar.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                case SAFETY_TIPS_VALUE:
                    if (sVar.r(i10, i7, pVar2)) {
                        i9 = oo31.a(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case 52:
                    if (sVar.r(i10, i7, pVar2)) {
                        i9 = oo31.a(i10 << 3, 4, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case 53:
                    if (sVar.r(i10, i7, pVar2)) {
                        long z = z(j, pVar2);
                        q12 = n.q(i10 << 3);
                        a2 = n.a(z);
                        i9 += a2 + q12;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 54:
                    if (sVar.r(i10, i7, pVar2)) {
                        long z2 = z(j, pVar2);
                        q12 = n.q(i10 << 3);
                        a2 = n.a(z2);
                        i9 += a2 + q12;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case SODA_DE_DE_VALUE:
                    if (sVar.r(i10, i7, pVar2)) {
                        long v = v(j, pVar2);
                        q12 = n.q(i10 << 3);
                        a2 = n.a(v);
                        i9 += a2 + q12;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 56:
                    if (sVar.r(i10, i7, pVar2)) {
                        i9 = oo31.a(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case SODA_ES_ES_VALUE:
                    if (sVar.r(i10, i7, pVar2)) {
                        i9 = oo31.a(i10 << 3, 4, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case 58:
                    if (sVar.r(i10, i7, pVar2)) {
                        i9 = oo31.a(i10 << 3, 1, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case 59:
                    if (sVar.r(i10, i7, pVar2)) {
                        int i22 = i10 << 3;
                        Object object3 = unsafe.getObject(pVar2, j);
                        if (object3 instanceof zzgk) {
                            size2 = n.q(i22);
                            q8 = ((zzgk) object3).f();
                            q9 = n.q(q8);
                            i3 = q9 + q8 + size2;
                            i9 += i3;
                            i7 += 3;
                            i5 = 1048575;
                        } else {
                            q12 = n.q(i22);
                            a2 = n.p((String) object3);
                            i9 += a2 + q12;
                            i7 += 3;
                            i5 = 1048575;
                        }
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 60:
                    if (sVar.r(i10, i7, pVar2)) {
                        k = u.k(i10, unsafe.getObject(pVar2, j), sVar.B(i7));
                        i9 += k;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 61:
                    if (sVar.r(i10, i7, pVar2)) {
                        zzgk zzgkVar2 = (zzgk) unsafe.getObject(pVar2, j);
                        size2 = n.q(i10 << 3);
                        q8 = zzgkVar2.f();
                        q9 = n.q(q8);
                        i3 = q9 + q8 + size2;
                        i9 += i3;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 62:
                    if (sVar.r(i10, i7, pVar2)) {
                        i9 = oo31.a(v(j, pVar2), n.q(i10 << 3), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (sVar.r(i10, i7, pVar2)) {
                        long v2 = v(j, pVar2);
                        q12 = n.q(i10 << 3);
                        a2 = n.a(v2);
                        i9 += a2 + q12;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case 64:
                    if (sVar.r(i10, i7, pVar2)) {
                        i9 = oo31.a(i10 << 3, 4, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case 65:
                    if (sVar.r(i10, i7, pVar2)) {
                        i9 = oo31.a(i10 << 3, 8, i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case 66:
                    if (sVar.r(i10, i7, pVar2)) {
                        int v3 = v(j, pVar2);
                        i9 = oo31.a((v3 >> 31) ^ (v3 + v3), n.q(i10 << 3), i9);
                    }
                    i7 += 3;
                    i5 = 1048575;
                case 67:
                    if (sVar.r(i10, i7, pVar2)) {
                        long z3 = z(j, pVar2);
                        q12 = n.q(i10 << 3);
                        a2 = n.a((z3 >> 63) ^ (z3 + z3));
                        i9 += a2 + q12;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (sVar.r(i10, i7, pVar2)) {
                        m mVar3 = (m) unsafe.getObject(pVar2, j);
                        ofa1 B4 = sVar.B(i7);
                        int q15 = n.q(i10 << 3);
                        i2 = q15 + q15;
                        b = mVar3.b(B4);
                        k = b + i2;
                        i9 += k;
                        i7 += 3;
                        i5 = 1048575;
                    } else {
                        i7 += 3;
                        i5 = 1048575;
                    }
                default:
                    i7 += 3;
                    i5 = 1048575;
            }
        }
        int a3 = pVar2.zzc.a() + i9;
        if (sVar.f) {
            a4a1 a4a1Var = ((o) pVar2).zzb;
            int a4 = a4a1Var.a.a();
            jga1 jga1Var = a4a1Var.a;
            if (a4 > 0) {
                if (jga1Var.d(0).a() != null) {
                    ny61.u();
                    return 0;
                }
                a4a1.a();
                throw null;
            }
            Iterator it2 = jga1Var.b().iterator();
            if (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                if (entry2.getKey() != null) {
                    ny61.u();
                    return 0;
                }
                entry2.getValue();
                a4a1.a();
                throw null;
            }
        }
        return a3;
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
    @Override // defpackage.ofa1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(p pVar) {
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
                int hashCode = pVar.zzc.hashCode() + (i6 * 53);
                if (!this.f) {
                    return hashCode;
                }
                return ((o) pVar).zzb.a.hashCode() + (hashCode * 53);
            }
            int y = y(i5);
            int i7 = 1048575 & y;
            int x = x(y);
            int i8 = iArr[i5];
            long j = i7;
            int i9 = 1237;
            int i10 = 37;
            switch (x) {
                case 0:
                    i = i6 * 53;
                    doubleToLongBits = Double.doubleToLongBits(eka1.c.a(j, pVar));
                    Charset charset = q7a1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    floatToIntBits = Float.floatToIntBits(eka1.c.c(j, pVar));
                    i6 = floatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    doubleToLongBits = eka1.f(j, pVar);
                    Charset charset2 = q7a1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    doubleToLongBits = eka1.f(j, pVar);
                    Charset charset3 = q7a1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    floatToIntBits = eka1.e(j, pVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    doubleToLongBits = eka1.f(j, pVar);
                    Charset charset4 = q7a1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    floatToIntBits = eka1.e(j, pVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean m2 = eka1.c.m(j, pVar);
                    Charset charset5 = q7a1.a;
                    break;
                case 8:
                    i2 = i6 * 53;
                    floatToIntBits = ((String) eka1.h(j, pVar)).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object h = eka1.h(j, pVar);
                    if (h != null) {
                        i10 = h.hashCode();
                    }
                    i6 = i4 + i10;
                    break;
                case 10:
                    i2 = i6 * 53;
                    floatToIntBits = eka1.h(j, pVar).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 11:
                    i2 = i6 * 53;
                    floatToIntBits = eka1.e(j, pVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 12:
                    i2 = i6 * 53;
                    floatToIntBits = eka1.e(j, pVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    floatToIntBits = eka1.e(j, pVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    doubleToLongBits = eka1.f(j, pVar);
                    Charset charset6 = q7a1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    floatToIntBits = eka1.e(j, pVar);
                    i6 = floatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    doubleToLongBits = eka1.f(j, pVar);
                    Charset charset7 = q7a1.a;
                    i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object h2 = eka1.h(j, pVar);
                    if (h2 != null) {
                        i10 = h2.hashCode();
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
                    floatToIntBits = eka1.h(j, pVar).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    floatToIntBits = eka1.h(j, pVar).hashCode();
                    i6 = floatToIntBits + i2;
                    break;
                case SAFETY_TIPS_VALUE:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = Double.doubleToLongBits(((Double) eka1.h(j, pVar)).doubleValue());
                        Charset charset8 = q7a1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 52:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = Float.floatToIntBits(((Float) eka1.h(j, pVar)).floatValue());
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 53:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j, pVar);
                        Charset charset9 = q7a1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 54:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j, pVar);
                        Charset charset10 = q7a1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case SODA_DE_DE_VALUE:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j, pVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 56:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j, pVar);
                        Charset charset11 = q7a1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j, pVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 58:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        boolean booleanValue = ((Boolean) eka1.h(j, pVar)).booleanValue();
                        Charset charset12 = q7a1.a;
                        break;
                    }
                case 59:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = ((String) eka1.h(j, pVar)).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 60:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = eka1.h(j, pVar).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 61:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = eka1.h(j, pVar).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 62:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j, pVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j, pVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 64:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j, pVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 65:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j, pVar);
                        Charset charset13 = q7a1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case 66:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = v(j, pVar);
                        i6 = floatToIntBits + i2;
                        break;
                    }
                case 67:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i = i6 * 53;
                        doubleToLongBits = z(j, pVar);
                        Charset charset14 = q7a1.a;
                        i6 = i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (!r(i8, i5, pVar)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        floatToIntBits = eka1.h(j, pVar).hashCode();
                        i6 = floatToIntBits + i2;
                        break;
                    }
            }
            i5 += 3;
        }
    }

    @Override // defpackage.ofa1
    public final boolean e(p pVar, p pVar2) {
        boolean e;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int y = y(i);
                long j = y & 1048575;
                switch (x(y)) {
                    case 0:
                        if (!n(pVar, pVar2, i)) {
                            break;
                        } else {
                            xja1 xja1Var = eka1.c;
                            if (Double.doubleToLongBits(xja1Var.a(j, pVar)) != Double.doubleToLongBits(xja1Var.a(j, pVar2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 1:
                        if (!n(pVar, pVar2, i)) {
                            break;
                        } else {
                            xja1 xja1Var2 = eka1.c;
                            if (Float.floatToIntBits(xja1Var2.c(j, pVar)) != Float.floatToIntBits(xja1Var2.c(j, pVar2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 2:
                        if (n(pVar, pVar2, i) && eka1.f(j, pVar) == eka1.f(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (n(pVar, pVar2, i) && eka1.f(j, pVar) == eka1.f(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (n(pVar, pVar2, i) && eka1.e(j, pVar) == eka1.e(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (n(pVar, pVar2, i) && eka1.f(j, pVar) == eka1.f(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (n(pVar, pVar2, i) && eka1.e(j, pVar) == eka1.e(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (!n(pVar, pVar2, i)) {
                            break;
                        } else {
                            xja1 xja1Var3 = eka1.c;
                            if (xja1Var3.m(j, pVar) != xja1Var3.m(j, pVar2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (n(pVar, pVar2, i) && u.e(eka1.h(j, pVar), eka1.h(j, pVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (n(pVar, pVar2, i) && u.e(eka1.h(j, pVar), eka1.h(j, pVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (n(pVar, pVar2, i) && u.e(eka1.h(j, pVar), eka1.h(j, pVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (n(pVar, pVar2, i) && eka1.e(j, pVar) == eka1.e(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (n(pVar, pVar2, i) && eka1.e(j, pVar) == eka1.e(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (n(pVar, pVar2, i) && eka1.e(j, pVar) == eka1.e(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (n(pVar, pVar2, i) && eka1.f(j, pVar) == eka1.f(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (n(pVar, pVar2, i) && eka1.e(j, pVar) == eka1.e(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (n(pVar, pVar2, i) && eka1.f(j, pVar) == eka1.f(j, pVar2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (n(pVar, pVar2, i) && u.e(eka1.h(j, pVar), eka1.h(j, pVar2))) {
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
                        e = u.e(eka1.h(j, pVar), eka1.h(j, pVar2));
                        break;
                    case 50:
                        e = u.e(eka1.h(j, pVar), eka1.h(j, pVar2));
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
                        if (eka1.e(j2, pVar) == eka1.e(j2, pVar2) && u.e(eka1.h(j, pVar), eka1.h(j, pVar2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (e) {
                    i += 3;
                }
            } else if (pVar.zzc.equals(pVar2.zzc)) {
                if (this.f) {
                    return ((o) pVar).zzb.equals(((o) pVar2).zzb);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ofa1
    public final void f(Object obj, Object obj2) {
        Object obj3;
        if (!q(obj)) {
            ny61.g("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                u.p(obj4, obj2);
                if (!this.f || ((o) obj2).zzb.a.isEmpty()) {
                    return;
                }
                throw null;
            }
            int y = y(i);
            int i2 = y & 1048575;
            int x = x(y);
            int i3 = iArr[i];
            long j = i2;
            switch (x) {
                case 0:
                    if (o(i, obj2)) {
                        xja1 xja1Var = eka1.c;
                        obj3 = obj;
                        xja1Var.h(obj3, j, xja1Var.a(j, obj2));
                        k(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (o(i, obj2)) {
                        xja1 xja1Var2 = eka1.c;
                        xja1Var2.k(obj, j, xja1Var2.c(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (o(i, obj2)) {
                        eka1.k(obj, j, eka1.f(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (o(i, obj2)) {
                        eka1.k(obj, j, eka1.f(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (o(i, obj2)) {
                        eka1.j(j, obj, eka1.e(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (o(i, obj2)) {
                        eka1.k(obj, j, eka1.f(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (o(i, obj2)) {
                        eka1.j(j, obj, eka1.e(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (o(i, obj2)) {
                        xja1 xja1Var3 = eka1.c;
                        xja1Var3.e(obj, j, xja1Var3.m(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (o(i, obj2)) {
                        eka1.l(j, obj, eka1.h(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    i(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (o(i, obj2)) {
                        eka1.l(j, obj, eka1.h(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (o(i, obj2)) {
                        eka1.j(j, obj, eka1.e(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (o(i, obj2)) {
                        eka1.j(j, obj, eka1.e(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (o(i, obj2)) {
                        eka1.j(j, obj, eka1.e(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (o(i, obj2)) {
                        eka1.k(obj, j, eka1.f(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (o(i, obj2)) {
                        eka1.j(j, obj, eka1.e(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (o(i, obj2)) {
                        eka1.k(obj, j, eka1.f(j, obj2));
                        k(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 17:
                    i(i, obj, obj2);
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
                    i7a1 i7a1Var = (i7a1) eka1.h(j, obj);
                    i7a1 i7a1Var2 = (i7a1) eka1.h(j, obj2);
                    int size = i7a1Var.size();
                    int size2 = i7a1Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((fw91) i7a1Var).b()) {
                            i7a1Var = i7a1Var.D(size2 + size);
                        }
                        i7a1Var.addAll(i7a1Var2);
                    }
                    if (size > 0) {
                        i7a1Var2 = i7a1Var;
                    }
                    eka1.l(j, obj, i7a1Var2);
                    obj3 = obj;
                    break;
                case 50:
                    xp91 xp91Var = u.a;
                    zzig zzigVar = (zzig) eka1.h(j, obj);
                    zzig zzigVar2 = (zzig) eka1.h(j, obj2);
                    if (!zzigVar2.isEmpty()) {
                        if (!zzigVar.g()) {
                            zzigVar = zzigVar.b();
                        }
                        zzigVar.f(zzigVar2);
                    }
                    eka1.l(j, obj, zzigVar);
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
                    if (r(i3, i, obj2)) {
                        eka1.l(j, obj, eka1.h(j, obj2));
                        eka1.j(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    j(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i3, i, obj2)) {
                        eka1.l(j, obj, eka1.h(j, obj2));
                        eka1.j(iArr[i + 2] & 1048575, obj, i3);
                    }
                    obj3 = obj;
                    break;
                case TRANSLATE_KIT_VALUE:
                    j(i, obj, obj2);
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ofa1
    public final void g(Object obj, dxf0 dxf0Var) {
        int[] iArr;
        int i;
        int i2;
        boolean z;
        int i3;
        s sVar = this;
        Map.Entry entry = null;
        if (sVar.f) {
            a4a1 a4a1Var = ((o) obj).zzb;
            if (!a4a1Var.a.isEmpty()) {
                entry = (Map.Entry) a4a1Var.c().next();
            }
        }
        Map.Entry entry2 = entry;
        Unsafe unsafe = m;
        int i4 = 1048575;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int[] iArr2 = sVar.a;
            if (i6 >= iArr2.length) {
                if (entry2 != null) {
                    throw g8e.j(entry2);
                }
                ((p) obj).zzc.d(dxf0Var);
                return;
            }
            int y = sVar.y(i6);
            int x = x(y);
            int i8 = iArr2[i6];
            if (x <= 17) {
                int i9 = iArr2[i6 + 2];
                int i10 = i9 & i4;
                if (i10 != i5) {
                    i7 = i10 == i4 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                iArr = iArr2;
                i = 1 << (i9 >>> 20);
            } else {
                iArr = iArr2;
                i = 0;
            }
            if (entry2 != null) {
                throw g8e.j(entry2);
            }
            int[] iArr3 = iArr;
            long j = y & i4;
            switch (x) {
                case 0:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).f(i8, Double.doubleToRawLongBits(eka1.c.a(j, obj)));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 1:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).d(i8, Float.floatToRawIntBits(eka1.c.c(j, obj)));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 2:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).n(i8, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 3:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).n(i8, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 4:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).h(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 5:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).f(i8, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 6:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).d(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 7:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        byte m2 = eka1.c.m(j, obj);
                        n nVar = (n) dxf0Var.a;
                        nVar.m(i8 << 3);
                        int i11 = nVar.d;
                        try {
                            i2 = i11 + 1;
                        } catch (IndexOutOfBoundsException e) {
                            e = e;
                        }
                        try {
                            nVar.b[i11] = m2;
                            nVar.d = i2;
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                            i11 = i2;
                            throw new zzgp(i11, nVar.c, 1, e);
                        }
                    } else {
                        continue;
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 8:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof String) {
                            ((n) dxf0Var.a).j(i8, (String) object);
                        } else {
                            ((n) dxf0Var.a).c(i8, (zzgk) object);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 9:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        dxf0Var.f(i8, unsafe.getObject(obj, j), sVar.B(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 10:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).c(i8, (zzgk) unsafe.getObject(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 11:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).l(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 12:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).h(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 13:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).d(i8, unsafe.getInt(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 14:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        ((n) dxf0Var.a).f(i8, unsafe.getLong(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 15:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        int i12 = unsafe.getInt(obj, j);
                        ((n) dxf0Var.a).l(i8, (i12 >> 31) ^ (i12 + i12));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 16:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        long j2 = unsafe.getLong(obj, j);
                        ((n) dxf0Var.a).n(i8, (j2 >> 63) ^ (j2 + j2));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 17:
                    if (sVar.p(obj, i6, i5, i7, i)) {
                        dxf0Var.c(i8, unsafe.getObject(obj, j), sVar.B(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 18:
                    u.r(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 19:
                    u.v(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 20:
                    u.x(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 21:
                    u.d(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 22:
                    u.w(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 23:
                    u.u(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 24:
                    u.t(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 25:
                    u.q(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 26:
                    int i13 = iArr3[i6];
                    List list = (List) unsafe.getObject(obj, j);
                    xp91 xp91Var = u.a;
                    if (list != null && !list.isEmpty()) {
                        n nVar2 = (n) dxf0Var.a;
                        if (list instanceof s9a1) {
                            s9a1 s9a1Var = (s9a1) list;
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                Object zzc = s9a1Var.zzc();
                                if (zzc instanceof String) {
                                    nVar2.j(i13, (String) zzc);
                                } else {
                                    nVar2.c(i13, (zzgk) zzc);
                                }
                            }
                        } else {
                            for (int i15 = 0; i15 < list.size(); i15++) {
                                nVar2.j(i13, (String) list.get(i15));
                            }
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                    break;
                case 27:
                    int i16 = iArr3[i6];
                    List list2 = (List) unsafe.getObject(obj, j);
                    ofa1 B = sVar.B(i6);
                    xp91 xp91Var2 = u.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            dxf0Var.f(i16, list2.get(i17), B);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                    break;
                case 28:
                    int i18 = iArr3[i6];
                    List list3 = (List) unsafe.getObject(obj, j);
                    xp91 xp91Var3 = u.a;
                    if (list3 != null && !list3.isEmpty()) {
                        dxf0Var.getClass();
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            ((n) dxf0Var.a).c(i18, (zzgk) list3.get(i19));
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                    break;
                case 29:
                    z = false;
                    u.c(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 30:
                    z = false;
                    u.s(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 31:
                    z = false;
                    u.y(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 32:
                    z = false;
                    u.z(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 33:
                    z = false;
                    u.a(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 34:
                    z = false;
                    u.b(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, false);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 35:
                    u.r(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 36:
                    u.v(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 37:
                    u.x(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 38:
                    u.d(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 39:
                    u.w(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 40:
                    u.u(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 41:
                    u.t(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 42:
                    u.q(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 43:
                    u.c(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 44:
                    u.s(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 45:
                    u.y(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 46:
                    u.z(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 47:
                    u.a(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 48:
                    u.b(iArr3[i6], (List) unsafe.getObject(obj, j), dxf0Var, true);
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 49:
                    int i20 = iArr3[i6];
                    List list4 = (List) unsafe.getObject(obj, j);
                    ofa1 B2 = sVar.B(i6);
                    xp91 xp91Var4 = u.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i21 = 0; i21 < list4.size(); i21++) {
                            dxf0Var.c(i20, list4.get(i21), B2);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j) != null) {
                        int i22 = i6 / 3;
                        throw oyr.d(sVar.b[i22 + i22]);
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case SAFETY_TIPS_VALUE:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).f(i8, Double.doubleToRawLongBits(((Double) eka1.h(j, obj)).doubleValue()));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 52:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).d(i8, Float.floatToRawIntBits(((Float) eka1.h(j, obj)).floatValue()));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 53:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).n(i8, z(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 54:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).n(i8, z(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case SODA_DE_DE_VALUE:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).h(i8, v(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 56:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).f(i8, z(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case SODA_ES_ES_VALUE:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).d(i8, v(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 58:
                    if (sVar.r(i8, i6, obj)) {
                        byte booleanValue = ((Boolean) eka1.h(j, obj)).booleanValue();
                        n nVar3 = (n) dxf0Var.a;
                        nVar3.m(i8 << 3);
                        int i23 = nVar3.d;
                        try {
                            i3 = i23 + 1;
                        } catch (IndexOutOfBoundsException e3) {
                            e = e3;
                        }
                        try {
                            nVar3.b[i23] = booleanValue;
                            nVar3.d = i3;
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                            i23 = i3;
                            throw new zzgp(i23, nVar3.c, 1, e);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 59:
                    if (sVar.r(i8, i6, obj)) {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof String) {
                            ((n) dxf0Var.a).j(i8, (String) object2);
                        } else {
                            ((n) dxf0Var.a).c(i8, (zzgk) object2);
                        }
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 60:
                    if (sVar.r(i8, i6, obj)) {
                        dxf0Var.f(i8, unsafe.getObject(obj, j), sVar.B(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 61:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).c(i8, (zzgk) unsafe.getObject(obj, j));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 62:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).l(i8, v(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).h(i8, v(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 64:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).d(i8, v(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 65:
                    if (sVar.r(i8, i6, obj)) {
                        ((n) dxf0Var.a).f(i8, z(j, obj));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 66:
                    if (sVar.r(i8, i6, obj)) {
                        int v = v(j, obj);
                        ((n) dxf0Var.a).l(i8, (v >> 31) ^ (v + v));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case 67:
                    if (sVar.r(i8, i6, obj)) {
                        long z2 = z(j, obj);
                        ((n) dxf0Var.a).n(i8, (z2 + z2) ^ (z2 >> 63));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                case TRANSLATE_KIT_VALUE:
                    if (sVar.r(i8, i6, obj)) {
                        dxf0Var.c(i8, unsafe.getObject(obj, j), sVar.B(i6));
                    }
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
                default:
                    i6 += 3;
                    i4 = 1048575;
                    sVar = this;
            }
        }
    }

    @Override // defpackage.ofa1
    public final void h(Object obj, byte[] bArr, int i, int i2, uw91 uw91Var) {
        s(obj, bArr, i, i2, 0, uw91Var);
    }

    public final void i(int i, Object obj, Object obj2) {
        if (o(i, obj2)) {
            int y = y(i) & 1048575;
            Unsafe unsafe = m;
            long j = y;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                ny61.r(oyr.k(this.a[i], "Source subfield ", " is present but null: ", obj2.toString()));
                return;
            }
            ofa1 B = B(i);
            if (!o(i, obj)) {
                if (q(object)) {
                    Object zze = B.zze();
                    B.f(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                k(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!q(object2)) {
                Object zze2 = B.zze();
                B.f(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            B.f(object2, object);
        }
    }

    public final void j(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (r(i2, i, obj2)) {
            int y = y(i) & 1048575;
            Unsafe unsafe = m;
            long j = y;
            Object object = unsafe.getObject(obj2, j);
            if (object == null) {
                ny61.r(oyr.k(iArr[i], "Source subfield ", " is present but null: ", obj2.toString()));
                return;
            }
            ofa1 B = B(i);
            if (!r(i2, i, obj)) {
                if (q(object)) {
                    Object zze = B.zze();
                    B.f(zze, object);
                    unsafe.putObject(obj, j, zze);
                } else {
                    unsafe.putObject(obj, j, object);
                }
                eka1.j(iArr[i + 2] & 1048575, obj, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j);
            if (!q(object2)) {
                Object zze2 = B.zze();
                B.f(zze2, object2);
                unsafe.putObject(obj, j, zze2);
                object2 = zze2;
            }
            B.f(object2, object);
        }
    }

    public final void k(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        eka1.j(j, obj, (1 << (i2 >>> 20)) | eka1.e(j, obj));
    }

    public final void l(int i, Object obj, Object obj2) {
        m.putObject(obj, y(i) & 1048575, obj2);
        k(i, obj);
    }

    public final void m(int i, Object obj, Object obj2, int i2) {
        m.putObject(obj, y(i2) & 1048575, obj2);
        eka1.j(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final boolean n(p pVar, p pVar2, int i) {
        return o(i, pVar) == o(i, pVar2);
    }

    public final boolean o(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return ((1 << (i2 >>> 20)) & eka1.e(j, obj)) != 0;
        }
        int y = y(i);
        long j2 = y & 1048575;
        switch (x(y)) {
            case 0:
                if (Double.doubleToRawLongBits(eka1.c.a(j2, obj)) != 0) {
                }
                break;
            case 1:
                if (Float.floatToRawIntBits(eka1.c.c(j2, obj)) != 0) {
                }
                break;
            case 2:
                if (eka1.f(j2, obj) != 0) {
                }
                break;
            case 3:
                if (eka1.f(j2, obj) != 0) {
                }
                break;
            case 4:
                if (eka1.e(j2, obj) != 0) {
                }
                break;
            case 5:
                if (eka1.f(j2, obj) != 0) {
                }
                break;
            case 6:
                if (eka1.e(j2, obj) != 0) {
                }
                break;
            case 7:
                break;
            case 8:
                Object h = eka1.h(j2, obj);
                if (!(h instanceof String)) {
                    if (!(h instanceof zzgk)) {
                        w511.q();
                        break;
                    } else if (!zzgk.a.equals(h)) {
                    }
                } else if (!((String) h).isEmpty()) {
                }
                break;
            case 9:
                if (eka1.h(j2, obj) != null) {
                }
                break;
            case 10:
                if (!zzgk.a.equals(eka1.h(j2, obj))) {
                }
                break;
            case 11:
                if (eka1.e(j2, obj) != 0) {
                }
                break;
            case 12:
                if (eka1.e(j2, obj) != 0) {
                }
                break;
            case 13:
                if (eka1.e(j2, obj) != 0) {
                }
                break;
            case 14:
                if (eka1.f(j2, obj) != 0) {
                }
                break;
            case 15:
                if (eka1.e(j2, obj) != 0) {
                }
                break;
            case 16:
                if (eka1.f(j2, obj) != 0) {
                }
                break;
            case 17:
                if (eka1.h(j2, obj) != null) {
                }
                break;
            default:
                w511.q();
                break;
        }
        return false;
    }

    public final boolean p(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? o(i, obj) : (i3 & i4) != 0;
    }

    public final boolean r(int i, int i2, Object obj) {
        return eka1.e((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final int s(java.lang.Object r40, byte[] r41, int r42, int r43, int r44, defpackage.uw91 r45) {
        /*
            Method dump skipped, instructions count: 3788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.s.s(java.lang.Object, byte[], int, int, int, uw91):int");
    }

    public final int w(int i, int i2) {
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

    public final int y(int i) {
        return this.a[i + 1];
    }

    @Override // defpackage.ofa1
    public final Object zze() {
        return (p) ((p) this.e).g(4);
    }
}
