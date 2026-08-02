package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.b64;
import defpackage.bor;
import defpackage.d5m;
import defpackage.dqw;
import defpackage.eac;
import defpackage.evf0;
import defpackage.gi00;
import defpackage.gp50;
import defpackage.hqw;
import defpackage.hry;
import defpackage.i7y;
import defpackage.i96;
import defpackage.ny61;
import defpackage.o5w;
import defpackage.oqw;
import defpackage.p9;
import defpackage.pyo;
import defpackage.qlz;
import defpackage.qv10;
import defpackage.qxs;
import defpackage.rqw;
import defpackage.rxs;
import defpackage.s560;
import defpackage.som0;
import defpackage.syo;
import defpackage.u3y;
import defpackage.u43;
import defpackage.u9i0;
import defpackage.unr0;
import defpackage.v43;
import defpackage.w321;
import defpackage.w511;
import defpackage.wt10;
import defpackage.yci0;
import defpackage.yxq;
import defpackage.z321;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class p implements som0 {
    public static final int[] p = new int[0];
    public static final Unsafe q = z321.j();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final wt10 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final s560 k;
    public final hry l;
    public final s m;
    public final syo n;
    public final gi00 o;

    public p(int[] iArr, Object[] objArr, int i, int i2, wt10 wt10Var, int[] iArr2, int i3, int i4, s560 s560Var, hry hryVar, s sVar, syo syoVar, gi00 gi00Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.g = wt10Var instanceof GeneratedMessageLite;
        this.f = syoVar != null && (wt10Var instanceof GeneratedMessageLite.a);
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = s560Var;
        this.l = hryVar;
        this.m = sVar;
        this.n = syoVar;
        this.e = wt10Var;
        this.o = gi00Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static p A(u9i0 u9i0Var, s560 s560Var, hry hryVar, s sVar, syo syoVar, gi00 gi00Var) {
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
        Field L;
        int i25;
        char charAt10;
        int i26;
        int i27;
        Field L2;
        Field L3;
        int i28;
        char charAt11;
        int i29;
        char charAt12;
        int i30;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        String str2 = u9i0Var.b;
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
        Object[] objArr3 = u9i0Var.c;
        Class<?> cls = u9i0Var.a.getClass();
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
                } else if (i83 != 12 || (!u9i0Var.a().equals(ProtoSyntax.PROTO2) && (charAt24 & 2048) == 0)) {
                    i27 = i80;
                } else {
                    i27 = i80;
                    objArr4[qv10.b(i66, 3, 2, 1)] = objArr[i6];
                    i6++;
                }
                int i85 = i84 * 2;
                Object obj = objArr[i85];
                if (obj instanceof Field) {
                    L2 = (Field) obj;
                } else {
                    L2 = L(cls, (String) obj);
                    objArr[i85] = L2;
                }
                int i86 = i63;
                i20 = i6;
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(L2);
                int i87 = i85 + 1;
                Object obj2 = objArr[i87];
                if (obj2 instanceof Field) {
                    L3 = (Field) obj2;
                } else {
                    L3 = L(cls, (String) obj2);
                    objArr[i87] = L3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(L3);
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
                Field L4 = L(cls, (String) objArr[i6]);
                if (i78 == 9 || i78 == 17) {
                    i18 = i88;
                    objArr4[qv10.b(i66, 3, 2, 1)] = L4.getType();
                } else {
                    if (i78 == 27 || i78 == 49) {
                        i18 = i88;
                        i26 = i6 + 2;
                        objArr4[qv10.b(i66, 3, 2, 1)] = objArr[i89];
                    } else if (i78 == 12 || i78 == 30 || i78 == 44) {
                        i18 = i88;
                        if (u9i0Var.a() == ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
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
                        objectFieldOffset = (int) unsafe.objectFieldOffset(L4);
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
                                L = (Field) obj3;
                            } else {
                                L = L(cls, (String) obj3);
                                objArr[i95] = L;
                            }
                            i20 = i19;
                            i21 = i66;
                            i22 = (int) unsafe.objectFieldOffset(L);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(L4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(L4);
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
        return new p(iArr3, objArr4, i2, i5, u9i0Var.a, iArr, i7, i63, s560Var, hryVar, sVar, syoVar, gi00Var);
    }

    public static long B(int i) {
        return i & 1048575;
    }

    public static int C(long j, Object obj) {
        return ((Integer) z321.c.k(j, obj)).intValue();
    }

    public static long D(long j, Object obj) {
        return ((Long) z321.c.k(j, obj)).longValue();
    }

    public static Field L(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
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
            throw new RuntimeException(x.toString(), e);
        }
    }

    public static int R(int i) {
        return (i & 267386880) >>> 20;
    }

    public static void U(int i, Object obj, gp50 gp50Var) {
        if (!(obj instanceof String)) {
            gp50Var.O(i, (ByteString) obj);
        } else {
            ((l) gp50Var.b).u(i, (String) obj);
        }
    }

    public static void l(Object obj) {
        if (t(obj)) {
            return;
        }
        ny61.g(qv10.o("Mutating immutable message: ", obj));
    }

    public static t q(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        t tVar = generatedMessageLite.unknownFields;
        if (tVar != t.f) {
            return tVar;
        }
        t tVar2 = new t();
        generatedMessageLite.unknownFields = tVar2;
        return tVar2;
    }

    public static boolean t(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof GeneratedMessageLite) {
            return ((GeneratedMessageLite) obj).isMutable();
        }
        return true;
    }

    public final void E(long j, Object obj, int i) {
        Unsafe unsafe = q;
        Object o = o(i);
        Object object = unsafe.getObject(obj, j);
        this.o.getClass();
        if (!((MapFieldLite) object).f()) {
            MapFieldLite i2 = MapFieldLite.b().i();
            gi00.a(i2, object);
            unsafe.putObject(obj, j, i2);
        }
        b64.D(o);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x04e6, code lost:
    
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x07dc, code lost:
    
        if (r8 == r2) goto L248;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x07de, code lost:
    
        r29.putInt(r10, r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x07e4, code lost:
    
        r0 = r9.i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x07e8, code lost:
    
        if (r0 >= r9.j) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x07ea, code lost:
    
        r9.m(r9.h[r0], r10, null);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x07f5, code lost:
    
        if (r11 != 0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x07f7, code lost:
    
        if (r3 != r4) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x07fe, code lost:
    
        throw com.google.protobuf.InvalidProtocolBufferException.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0803, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x07ff, code lost:
    
        if (r3 > r4) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0801, code lost:
    
        if (r1 != r11) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0808, code lost:
    
        throw com.google.protobuf.InvalidProtocolBufferException.j();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x04ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int F(Object obj, byte[] bArr, int i, int i2, int i3, v43 v43Var) {
        Object obj2;
        int i4;
        Unsafe unsafe;
        int i5;
        p pVar;
        int i6;
        int i7;
        int O;
        int i8;
        pyo pyoVar;
        int i9;
        Object obj3;
        int i10;
        int i11;
        boolean z;
        int i12;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int p2;
        int i17;
        Object valueOf;
        int t;
        int i18;
        int u;
        int h;
        int n;
        v43 v43Var2;
        int i19;
        Object obj4;
        Unsafe unsafe2;
        int i20;
        int i21;
        Object obj5;
        boolean z3;
        int i22;
        v43 v43Var3;
        Object obj6;
        int i23;
        int i24;
        int o;
        byte[] bArr2;
        v43 v43Var4;
        int i25;
        Unsafe unsafe3;
        v43 v43Var5;
        int i26;
        Unsafe unsafe4;
        byte[] bArr3;
        v43 v43Var6;
        int i27;
        int i28;
        p pVar2;
        int i29;
        Object obj7;
        int G;
        boolean z4;
        boolean z5;
        p pVar3 = this;
        Object obj8 = obj;
        byte[] bArr4 = bArr;
        int i30 = i2;
        v43 v43Var7 = v43Var;
        pyo pyoVar2 = (pyo) v43Var7.e;
        l(obj8);
        Unsafe unsafe5 = q;
        int i31 = i;
        int i32 = -1;
        int i33 = 0;
        int i34 = 1048575;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            int i37 = 1048575;
            while (true) {
                if (i31 < i30) {
                    int i38 = i31 + 1;
                    int i39 = bArr4[i31];
                    if (i39 < 0) {
                        i38 = d.q(i39, bArr4, i38, v43Var7);
                        i39 = v43Var7.a;
                    }
                    int i40 = i38;
                    int i41 = i39;
                    int i42 = i41 >>> 3;
                    int i43 = i33;
                    int i44 = i41 & 7;
                    int i45 = pVar3.d;
                    int i46 = pVar3.c;
                    if (i42 > i32) {
                        O = (i42 < i46 || i42 > i45) ? -1 : pVar3.O(i42, i43 / 3);
                    } else {
                        O = (i42 < i46 || i42 > i45) ? -1 : pVar3.O(i42, 0);
                    }
                    if (O == -1) {
                        i8 = i34;
                        i4 = i35;
                        pyoVar = pyoVar2;
                        unsafe = unsafe5;
                        i9 = i42;
                        obj3 = null;
                        i10 = 0;
                        i11 = 0;
                        z = true;
                        i5 = i3;
                        pVar = pVar3;
                        obj2 = obj8;
                        i12 = i40;
                    } else {
                        int[] iArr = pVar3.a;
                        int i47 = iArr[O + 1];
                        int R = R(i47);
                        long j = i47 & i37;
                        if (R <= 17) {
                            int i48 = iArr[O + 2];
                            int i49 = 1 << (i48 >>> 20);
                            int i50 = i48 & i37;
                            pyo pyoVar3 = pyoVar2;
                            int i51 = i37;
                            if (i50 != i34) {
                                if (i34 != i51) {
                                    unsafe5.putInt(obj8, i34, i35);
                                }
                                i8 = i50;
                                i4 = i50 == i51 ? 0 : unsafe5.getInt(obj8, i50);
                            } else {
                                i8 = i34;
                                i4 = i35;
                            }
                            switch (R) {
                                case 0:
                                    bArr2 = bArr;
                                    i19 = O;
                                    unsafe2 = unsafe5;
                                    i22 = i40;
                                    z3 = true;
                                    if (i44 != 1) {
                                        obj5 = obj8;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        z321.c.o(obj8, j, Double.longBitsToDouble(d.c(i22, bArr2)));
                                        i31 = i22 + 8;
                                        i30 = i2;
                                        v43Var7 = v43Var;
                                        i36 = i41;
                                        i32 = i42;
                                        i33 = i19;
                                        i34 = i8;
                                        i37 = 1048575;
                                        unsafe5 = unsafe2;
                                        i35 = i4 | i49;
                                        obj8 = obj8;
                                        bArr4 = bArr2;
                                        pyoVar2 = pyoVar3;
                                        break;
                                    }
                                case 1:
                                    bArr2 = bArr;
                                    i19 = O;
                                    unsafe2 = unsafe5;
                                    i22 = i40;
                                    v43Var4 = v43Var;
                                    if (i44 != 5) {
                                        obj5 = obj8;
                                        z3 = true;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        z321.c.p(obj8, j, Float.intBitsToFloat(d.b(i22, bArr2)));
                                        i31 = i22 + 4;
                                        i25 = i4 | i49;
                                        i30 = i2;
                                        v43Var7 = v43Var4;
                                        i36 = i41;
                                        i32 = i42;
                                        i33 = i19;
                                        i34 = i8;
                                        i37 = 1048575;
                                        unsafe5 = unsafe2;
                                        i35 = i25;
                                        bArr4 = bArr2;
                                        pyoVar2 = pyoVar3;
                                        break;
                                    }
                                case 2:
                                case 3:
                                    bArr2 = bArr;
                                    i19 = O;
                                    unsafe3 = unsafe5;
                                    i22 = i40;
                                    v43Var4 = v43Var;
                                    if (i44 != 0) {
                                        unsafe2 = unsafe3;
                                        obj5 = obj8;
                                        z3 = true;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        int t2 = d.t(bArr2, i22, v43Var4);
                                        unsafe3.putLong(obj8, j, v43Var4.b);
                                        unsafe2 = unsafe3;
                                        i25 = i4 | i49;
                                        i30 = i2;
                                        i31 = t2;
                                        v43Var7 = v43Var4;
                                        i36 = i41;
                                        i32 = i42;
                                        i33 = i19;
                                        i34 = i8;
                                        i37 = 1048575;
                                        unsafe5 = unsafe2;
                                        i35 = i25;
                                        bArr4 = bArr2;
                                        pyoVar2 = pyoVar3;
                                        break;
                                    }
                                case 4:
                                case 11:
                                    bArr2 = bArr;
                                    i19 = O;
                                    unsafe3 = unsafe5;
                                    i22 = i40;
                                    v43Var5 = v43Var;
                                    if (i44 != 0) {
                                        unsafe2 = unsafe3;
                                        obj5 = obj8;
                                        z3 = true;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        int r = d.r(bArr2, i22, v43Var5);
                                        unsafe3.putInt(obj8, j, v43Var5.a);
                                        i35 = i4 | i49;
                                        i30 = i2;
                                        i31 = r;
                                        v43Var7 = v43Var5;
                                        i36 = i41;
                                        i32 = i42;
                                        i33 = i19;
                                        i34 = i8;
                                        i37 = 1048575;
                                        unsafe5 = unsafe3;
                                        bArr4 = bArr2;
                                        pyoVar2 = pyoVar3;
                                        break;
                                    }
                                case 5:
                                case 14:
                                    i19 = O;
                                    Object obj9 = obj8;
                                    unsafe2 = unsafe5;
                                    z3 = true;
                                    if (i44 != 1) {
                                        i22 = i40;
                                        obj8 = obj9;
                                        obj5 = obj8;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        v43Var5 = v43Var;
                                        obj8 = obj9;
                                        bArr2 = bArr;
                                        unsafe3 = unsafe2;
                                        unsafe3.putLong(obj8, j, d.c(i40, bArr));
                                        i31 = i40 + 8;
                                        i35 = i4 | i49;
                                        i30 = i2;
                                        v43Var7 = v43Var5;
                                        i36 = i41;
                                        i32 = i42;
                                        i33 = i19;
                                        i34 = i8;
                                        i37 = 1048575;
                                        unsafe5 = unsafe3;
                                        bArr4 = bArr2;
                                        pyoVar2 = pyoVar3;
                                        break;
                                    }
                                case 6:
                                case 13:
                                    v43Var2 = v43Var;
                                    i19 = O;
                                    obj4 = obj8;
                                    unsafe2 = unsafe5;
                                    i20 = i40;
                                    bArr4 = bArr;
                                    if (i44 != 5) {
                                        obj5 = obj4;
                                        z3 = true;
                                        i22 = i20;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        unsafe2.putInt(obj4, j, d.b(i20, bArr4));
                                        i21 = i20 + 4;
                                        v43Var7 = v43Var2;
                                        unsafe5 = unsafe2;
                                        i36 = i41;
                                        i32 = i42;
                                        i33 = i19;
                                        pyoVar2 = pyoVar3;
                                        i37 = 1048575;
                                        i31 = i21;
                                        i35 = i4 | i49;
                                        obj8 = obj4;
                                        i34 = i8;
                                        i30 = i2;
                                        break;
                                    }
                                case 7:
                                    v43Var2 = v43Var;
                                    obj4 = obj8;
                                    unsafe2 = unsafe5;
                                    i20 = i40;
                                    int i52 = O;
                                    bArr4 = bArr;
                                    if (i44 != 0) {
                                        i19 = i52;
                                        obj5 = obj4;
                                        z3 = true;
                                        i22 = i20;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        i21 = d.t(bArr4, i20, v43Var2);
                                        i19 = i52;
                                        z321.c.m(obj4, j, v43Var2.b != 0);
                                        v43Var7 = v43Var2;
                                        unsafe5 = unsafe2;
                                        i36 = i41;
                                        i32 = i42;
                                        i33 = i19;
                                        pyoVar2 = pyoVar3;
                                        i37 = 1048575;
                                        i31 = i21;
                                        i35 = i4 | i49;
                                        obj8 = obj4;
                                        i34 = i8;
                                        i30 = i2;
                                        break;
                                    }
                                case 8:
                                    v43Var3 = v43Var;
                                    obj6 = obj8;
                                    unsafe2 = unsafe5;
                                    i23 = i40;
                                    i24 = O;
                                    bArr4 = bArr;
                                    if (i44 != 2) {
                                        obj5 = obj6;
                                        i19 = i24;
                                        z3 = true;
                                        i22 = i23;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        if ((i47 & 536870912) != 0) {
                                            o = d.r(bArr4, i23, v43Var3);
                                            int i53 = v43Var3.a;
                                            if (i53 < 0) {
                                                throw InvalidProtocolBufferException.i();
                                            }
                                            if (i53 == 0) {
                                                v43Var3.c = "";
                                            } else {
                                                v43Var3.c = x.a.h(o, i53, bArr4);
                                                o += i53;
                                            }
                                        } else {
                                            o = d.o(bArr4, i23, v43Var3);
                                        }
                                        unsafe2.putObject(obj6, j, v43Var3.c);
                                        v43Var7 = v43Var3;
                                        i37 = i51;
                                        i33 = i24;
                                        i36 = i41;
                                        i32 = i42;
                                        pyoVar2 = pyoVar3;
                                        i31 = o;
                                        obj8 = obj6;
                                        unsafe5 = unsafe2;
                                        i34 = i8;
                                        i35 = i4 | i49;
                                        i30 = i2;
                                        break;
                                    }
                                case 9:
                                    Unsafe unsafe6 = unsafe5;
                                    i24 = O;
                                    Object obj10 = obj8;
                                    if (i44 != 2) {
                                        obj6 = obj10;
                                        bArr4 = bArr;
                                        unsafe2 = unsafe6;
                                        i23 = i40;
                                        v43Var3 = v43Var;
                                        obj5 = obj6;
                                        i19 = i24;
                                        z3 = true;
                                        i22 = i23;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        Object y = pVar3.y(i24, obj10);
                                        obj6 = obj10;
                                        unsafe2 = unsafe6;
                                        o = d.v(y, pVar3.p(i24), bArr, i40, i2, v43Var);
                                        bArr4 = bArr;
                                        v43Var3 = v43Var;
                                        pVar3.P(i24, obj6, y);
                                        v43Var7 = v43Var3;
                                        i37 = i51;
                                        i33 = i24;
                                        i36 = i41;
                                        i32 = i42;
                                        pyoVar2 = pyoVar3;
                                        i31 = o;
                                        obj8 = obj6;
                                        unsafe5 = unsafe2;
                                        i34 = i8;
                                        i35 = i4 | i49;
                                        i30 = i2;
                                        break;
                                    }
                                case 10:
                                    Unsafe unsafe7 = unsafe5;
                                    i26 = O;
                                    obj5 = obj8;
                                    unsafe4 = unsafe7;
                                    bArr3 = bArr;
                                    v43Var6 = v43Var;
                                    i27 = i40;
                                    if (i44 != 2) {
                                        i19 = i26;
                                        z3 = true;
                                        i22 = i27;
                                        unsafe2 = unsafe4;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        i31 = d.a(bArr3, i27, v43Var6);
                                        unsafe4.putObject(obj5, j, v43Var6.c);
                                        v43Var7 = v43Var6;
                                        i37 = i51;
                                        i33 = i26;
                                        i36 = i41;
                                        i32 = i42;
                                        pyoVar2 = pyoVar3;
                                        unsafe5 = unsafe4;
                                        i35 = i4 | i49;
                                        i30 = i2;
                                        obj8 = obj5;
                                        bArr4 = bArr3;
                                        i34 = i8;
                                        break;
                                    }
                                case 12:
                                    Unsafe unsafe8 = unsafe5;
                                    i26 = O;
                                    obj5 = obj8;
                                    unsafe4 = unsafe8;
                                    bArr3 = bArr;
                                    v43Var6 = v43Var;
                                    i27 = i40;
                                    if (i44 != 0) {
                                        i19 = i26;
                                        z3 = true;
                                        i22 = i27;
                                        unsafe2 = unsafe4;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        i31 = d.r(bArr3, i27, v43Var6);
                                        int i54 = v43Var6.a;
                                        hqw n2 = pVar3.n(i26);
                                        if ((i47 & Integer.MIN_VALUE) == 0 || n2 == null || n2.isInRange(i54)) {
                                            unsafe4.putInt(obj5, j, i54);
                                            v43Var7 = v43Var6;
                                            i37 = i51;
                                            i33 = i26;
                                            i36 = i41;
                                            i32 = i42;
                                            pyoVar2 = pyoVar3;
                                            unsafe5 = unsafe4;
                                            i35 = i4 | i49;
                                            i30 = i2;
                                            obj8 = obj5;
                                            bArr4 = bArr3;
                                            i34 = i8;
                                            break;
                                        } else {
                                            q(obj5).f(i41, Long.valueOf(i54));
                                            i30 = i2;
                                            v43Var7 = v43Var6;
                                            i37 = i51;
                                            i33 = i26;
                                            i36 = i41;
                                            i32 = i42;
                                            pyoVar2 = pyoVar3;
                                            i35 = i4;
                                            unsafe5 = unsafe4;
                                            obj8 = obj5;
                                            bArr4 = bArr3;
                                            i34 = i8;
                                        }
                                    }
                                case 15:
                                    Unsafe unsafe9 = unsafe5;
                                    i26 = O;
                                    obj5 = obj8;
                                    unsafe4 = unsafe9;
                                    bArr3 = bArr;
                                    v43Var6 = v43Var;
                                    i27 = i40;
                                    if (i44 != 0) {
                                        i19 = i26;
                                        z3 = true;
                                        i22 = i27;
                                        unsafe2 = unsafe4;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        i31 = d.r(bArr3, i27, v43Var6);
                                        unsafe4.putInt(obj5, j, eac.b(v43Var6.a));
                                        v43Var7 = v43Var6;
                                        i37 = i51;
                                        i33 = i26;
                                        i36 = i41;
                                        i32 = i42;
                                        pyoVar2 = pyoVar3;
                                        unsafe5 = unsafe4;
                                        i35 = i4 | i49;
                                        i30 = i2;
                                        obj8 = obj5;
                                        bArr4 = bArr3;
                                        i34 = i8;
                                        break;
                                    }
                                case 16:
                                    bArr3 = bArr;
                                    v43Var6 = v43Var;
                                    i27 = i40;
                                    if (i44 != 0) {
                                        Unsafe unsafe10 = unsafe5;
                                        i26 = O;
                                        obj5 = obj8;
                                        unsafe4 = unsafe10;
                                        i19 = i26;
                                        z3 = true;
                                        i22 = i27;
                                        unsafe2 = unsafe4;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        int t3 = d.t(bArr3, i27, v43Var6);
                                        Unsafe unsafe11 = unsafe5;
                                        int i55 = O;
                                        unsafe11.putLong(obj8, j, eac.c(v43Var6.b));
                                        Object obj11 = obj8;
                                        unsafe4 = unsafe11;
                                        obj5 = obj11;
                                        i30 = i2;
                                        v43Var7 = v43Var6;
                                        i37 = i51;
                                        i36 = i41;
                                        i32 = i42;
                                        pyoVar2 = pyoVar3;
                                        i35 = i4 | i49;
                                        i31 = t3;
                                        i33 = i55;
                                        unsafe5 = unsafe4;
                                        obj8 = obj5;
                                        bArr4 = bArr3;
                                        i34 = i8;
                                        break;
                                    }
                                case 17:
                                    if (i44 != 3) {
                                        i19 = O;
                                        obj5 = obj8;
                                        unsafe2 = unsafe5;
                                        i22 = i40;
                                        z3 = true;
                                        i5 = i3;
                                        obj2 = obj5;
                                        z = z3;
                                        i12 = i22;
                                        unsafe = unsafe2;
                                        i9 = i42;
                                        i10 = i19;
                                        pyoVar = pyoVar3;
                                        obj3 = null;
                                        i11 = 0;
                                        pVar = pVar3;
                                        break;
                                    } else {
                                        Object y2 = pVar3.y(O, obj8);
                                        int u2 = d.u(y2, pVar3.p(O), bArr, i40, i2, (i42 << 3) | 4, v43Var);
                                        pVar3.P(O, obj8, y2);
                                        i33 = O;
                                        bArr4 = bArr;
                                        v43Var7 = v43Var;
                                        i37 = i51;
                                        i36 = i41;
                                        i32 = i42;
                                        pyoVar2 = pyoVar3;
                                        i34 = i8;
                                        i35 = i4 | i49;
                                        i31 = u2;
                                        i30 = i2;
                                        break;
                                    }
                                default:
                                    i19 = O;
                                    obj5 = obj8;
                                    unsafe2 = unsafe5;
                                    i22 = i40;
                                    z3 = true;
                                    i5 = i3;
                                    obj2 = obj5;
                                    z = z3;
                                    i12 = i22;
                                    unsafe = unsafe2;
                                    i9 = i42;
                                    i10 = i19;
                                    pyoVar = pyoVar3;
                                    obj3 = null;
                                    i11 = 0;
                                    pVar = pVar3;
                                    break;
                            }
                        } else {
                            int i56 = O;
                            Object obj12 = obj8;
                            pyo pyoVar4 = pyoVar2;
                            Unsafe unsafe12 = unsafe5;
                            if (R != 27) {
                                i8 = i34;
                                i28 = i56;
                                if (R <= 49) {
                                    i4 = i35;
                                    long j2 = i47;
                                    unsafe = unsafe12;
                                    pyoVar = pyoVar4;
                                    obj3 = null;
                                    i11 = 0;
                                    z4 = true;
                                    i32 = i42;
                                    int H = pVar3.H(obj, bArr, i40, i2, i41, i32, i44, i28, j2, R, j, v43Var);
                                    p pVar4 = pVar3;
                                    i13 = i41;
                                    if (H != i40) {
                                        bArr4 = bArr;
                                        v43Var7 = v43Var;
                                        i36 = i13;
                                        pVar3 = pVar4;
                                        obj8 = obj;
                                        i31 = H;
                                        i33 = i28;
                                        pyoVar2 = pyoVar;
                                        i34 = i8;
                                        i35 = i4;
                                        unsafe5 = unsafe;
                                        i37 = 1048575;
                                        i30 = i2;
                                    } else {
                                        i5 = i3;
                                        pVar = pVar4;
                                        obj2 = obj;
                                        i12 = H;
                                        i10 = i28;
                                        i9 = i32;
                                        z2 = z4;
                                        if (i13 == i5 || i5 == 0) {
                                            if (pVar.f || pyoVar == pyo.b()) {
                                                i14 = i10;
                                                i15 = i9;
                                                i16 = i13;
                                                p2 = d.p(i16, bArr, i12, i2, q(obj2), v43Var);
                                                i30 = i2;
                                            } else {
                                                rxs a = pyoVar.a(i9, pVar.e);
                                                if (a != null) {
                                                    int i57 = i13;
                                                    GeneratedMessageLite.a aVar = (GeneratedMessageLite.a) obj2;
                                                    aVar.f();
                                                    yxq yxqVar = aVar.a;
                                                    int i58 = i57 >>> 3;
                                                    qxs qxsVar = a.c;
                                                    boolean e = qxsVar.e();
                                                    s sVar = pVar.m;
                                                    if (e && qxsVar.d()) {
                                                        switch (u43.a[a.a().ordinal()]) {
                                                            case 1:
                                                                i14 = i10;
                                                                i15 = i9;
                                                                d5m d5mVar = new d5m();
                                                                h = d.h(bArr, i12, d5mVar, v43Var);
                                                                yxqVar.r(qxsVar, d5mVar);
                                                                u = h;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            case 2:
                                                                i14 = i10;
                                                                i15 = i9;
                                                                bor borVar = new bor();
                                                                h = d.k(bArr, i12, borVar, v43Var);
                                                                yxqVar.r(qxsVar, borVar);
                                                                u = h;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            case 3:
                                                            case 4:
                                                                qlz qlzVar = new qlz();
                                                                h = d.r(bArr, i12, v43Var);
                                                                int i59 = v43Var.a + h;
                                                                while (h < i59) {
                                                                    h = d.t(bArr, h, v43Var);
                                                                    qlzVar.b(v43Var.b);
                                                                    i9 = i9;
                                                                    i10 = i10;
                                                                }
                                                                i14 = i10;
                                                                i15 = i9;
                                                                if (h != i59) {
                                                                    throw InvalidProtocolBufferException.m();
                                                                }
                                                                yxqVar.r(qxsVar, qlzVar);
                                                                u = h;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            case 5:
                                                            case 6:
                                                                o5w o5wVar = new o5w();
                                                                n = d.n(bArr, i12, o5wVar, v43Var);
                                                                yxqVar.r(qxsVar, o5wVar);
                                                                u = n;
                                                                i14 = i10;
                                                                i15 = i9;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            case 7:
                                                            case 8:
                                                                qlz qlzVar2 = new qlz();
                                                                n = d.j(bArr, i12, qlzVar2, v43Var);
                                                                yxqVar.r(qxsVar, qlzVar2);
                                                                u = n;
                                                                i14 = i10;
                                                                i15 = i9;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            case 9:
                                                            case 10:
                                                                o5w o5wVar2 = new o5w();
                                                                n = d.i(bArr, i12, o5wVar2, v43Var);
                                                                yxqVar.r(qxsVar, o5wVar2);
                                                                u = n;
                                                                i14 = i10;
                                                                i15 = i9;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            case 11:
                                                                i96 i96Var = new i96();
                                                                n = d.g(bArr, i12, i96Var, v43Var);
                                                                yxqVar.r(qxsVar, i96Var);
                                                                u = n;
                                                                i14 = i10;
                                                                i15 = i9;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            case 12:
                                                                o5w o5wVar3 = new o5w();
                                                                n = d.l(bArr, i12, o5wVar3, v43Var);
                                                                yxqVar.r(qxsVar, o5wVar3);
                                                                u = n;
                                                                i14 = i10;
                                                                i15 = i9;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            case 13:
                                                                qlz qlzVar3 = new qlz();
                                                                n = d.m(bArr, i12, qlzVar3, v43Var);
                                                                yxqVar.r(qxsVar, qlzVar3);
                                                                u = n;
                                                                i14 = i10;
                                                                i15 = i9;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            case 14:
                                                                o5w o5wVar4 = new o5w();
                                                                int n3 = d.n(bArr, i12, o5wVar4, v43Var);
                                                                r.k(aVar, i58, o5wVar4, qxsVar.a(), null, sVar);
                                                                yxqVar.r(qxsVar, o5wVar4);
                                                                u = n3;
                                                                i14 = i10;
                                                                i15 = i9;
                                                                i17 = i57;
                                                                p2 = u;
                                                                break;
                                                            default:
                                                                yci0.t(qxsVar.b(), "Type cannot be packed: ");
                                                                i14 = i10;
                                                                i15 = i9;
                                                                i17 = i57;
                                                                u = i11;
                                                                p2 = u;
                                                                break;
                                                        }
                                                    } else {
                                                        i14 = i10;
                                                        i15 = i9;
                                                        i17 = i57;
                                                        if (a.a() == WireFormat$FieldType.ENUM) {
                                                            int r2 = d.r(bArr, i12, v43Var);
                                                            dqw findValueByNumber = qxsVar.a().findValueByNumber(v43Var.a);
                                                            int i60 = v43Var.a;
                                                            if (findValueByNumber == null) {
                                                                r.n(aVar, i58, i60, obj3, sVar);
                                                                u = r2;
                                                                p2 = u;
                                                            } else {
                                                                valueOf = Integer.valueOf(i60);
                                                                t = r2;
                                                                if (a.d()) {
                                                                    yxqVar.a(qxsVar, valueOf);
                                                                } else {
                                                                    yxqVar.r(qxsVar, valueOf);
                                                                }
                                                                u = t;
                                                                p2 = u;
                                                            }
                                                        } else {
                                                            switch (u43.a[a.a().ordinal()]) {
                                                                case 1:
                                                                    valueOf = Double.valueOf(Double.longBitsToDouble(d.c(i12, bArr)));
                                                                    i18 = i12 + 8;
                                                                    t = i18;
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 2:
                                                                    valueOf = Float.valueOf(Float.intBitsToFloat(d.b(i12, bArr)));
                                                                    i18 = i12 + 4;
                                                                    t = i18;
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 3:
                                                                case 4:
                                                                    t = d.t(bArr, i12, v43Var);
                                                                    valueOf = Long.valueOf(v43Var.b);
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 5:
                                                                case 6:
                                                                    t = d.r(bArr, i12, v43Var);
                                                                    valueOf = Integer.valueOf(v43Var.a);
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 7:
                                                                case 8:
                                                                    valueOf = Long.valueOf(d.c(i12, bArr));
                                                                    i18 = i12 + 8;
                                                                    t = i18;
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 9:
                                                                case 10:
                                                                    valueOf = Integer.valueOf(d.b(i12, bArr));
                                                                    i18 = i12 + 4;
                                                                    t = i18;
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 11:
                                                                    t = d.t(bArr, i12, v43Var);
                                                                    boolean z6 = z2;
                                                                    if (v43Var.b == 0) {
                                                                        z6 = i11;
                                                                    }
                                                                    valueOf = Boolean.valueOf(z6);
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 12:
                                                                    t = d.r(bArr, i12, v43Var);
                                                                    valueOf = Integer.valueOf(eac.b(v43Var.a));
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 13:
                                                                    t = d.t(bArr, i12, v43Var);
                                                                    valueOf = Long.valueOf(eac.c(v43Var.b));
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 14:
                                                                    ny61.r("Shouldn't reach here.");
                                                                    u = i11;
                                                                    break;
                                                                case 15:
                                                                    t = d.a(bArr, i12, v43Var);
                                                                    valueOf = v43Var.c;
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 16:
                                                                    t = d.o(bArr, i12, v43Var);
                                                                    valueOf = v43Var.c;
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                                case 17:
                                                                    int i61 = (i58 << 3) | 4;
                                                                    som0 a2 = evf0.c.a(a.b().getClass());
                                                                    if (!a.d()) {
                                                                        Object g = yxqVar.g(qxsVar);
                                                                        if (g == null) {
                                                                            g = a2.d();
                                                                            yxqVar.r(qxsVar, g);
                                                                        }
                                                                        u = d.u(g, a2, bArr, i12, i2, i61, v43Var);
                                                                        break;
                                                                    } else {
                                                                        t = d.d(a2, bArr, i12, i2, i61, v43Var);
                                                                        yxqVar.a(qxsVar, v43Var.c);
                                                                        u = t;
                                                                        break;
                                                                    }
                                                                case 18:
                                                                    som0 a3 = evf0.c.a(a.b().getClass());
                                                                    if (!a.d()) {
                                                                        Object g2 = yxqVar.g(qxsVar);
                                                                        if (g2 == null) {
                                                                            g2 = a3.d();
                                                                            yxqVar.r(qxsVar, g2);
                                                                        }
                                                                        u = d.v(g2, a3, bArr, i12, i2, v43Var);
                                                                        break;
                                                                    } else {
                                                                        int e2 = d.e(a3, bArr, i12, i2, v43Var);
                                                                        yxqVar.a(qxsVar, v43Var.c);
                                                                        u = e2;
                                                                        break;
                                                                    }
                                                                default:
                                                                    t = i12;
                                                                    valueOf = null;
                                                                    if (a.d()) {
                                                                    }
                                                                    u = t;
                                                                    break;
                                                            }
                                                            p2 = u;
                                                        }
                                                    }
                                                } else {
                                                    p2 = d.p(i13, bArr, i12, i2, q(obj2), v43Var);
                                                    i17 = i13;
                                                    i14 = i10;
                                                    i15 = i9;
                                                }
                                                i30 = i2;
                                                i16 = i17;
                                            }
                                            i31 = p2;
                                            bArr4 = bArr;
                                            v43Var7 = v43Var;
                                            obj8 = obj2;
                                            i32 = i15;
                                            pyoVar2 = pyoVar;
                                            i33 = i14;
                                            i34 = i8;
                                            unsafe5 = unsafe;
                                            i37 = 1048575;
                                            i36 = i16;
                                            pVar3 = pVar;
                                            i35 = i4;
                                        } else {
                                            i30 = i2;
                                            i6 = i13;
                                            i31 = i12;
                                            i7 = 1048575;
                                            i34 = i8;
                                        }
                                    }
                                } else {
                                    pVar2 = pVar3;
                                    i13 = i41;
                                    i4 = i35;
                                    unsafe = unsafe12;
                                    i32 = i42;
                                    pyoVar = pyoVar4;
                                    obj3 = null;
                                    i11 = 0;
                                    z2 = true;
                                    z5 = true;
                                    i29 = i40;
                                    obj7 = obj;
                                    if (R != 50) {
                                        G = pVar2.G(obj7, bArr, i29, i2, i13, i32, i44, i47, R, j, i28, v43Var);
                                        pVar = pVar2;
                                        obj2 = obj7;
                                        i13 = i13;
                                        i9 = i32;
                                        if (G != i29) {
                                            break;
                                        }
                                        i12 = G;
                                        i10 = i28;
                                        i5 = i3;
                                        if (i13 == i5) {
                                        }
                                        if (pVar.f) {
                                        }
                                        i14 = i10;
                                        i15 = i9;
                                        i16 = i13;
                                        p2 = d.p(i16, bArr, i12, i2, q(obj2), v43Var);
                                        i30 = i2;
                                        i31 = p2;
                                        bArr4 = bArr;
                                        v43Var7 = v43Var;
                                        obj8 = obj2;
                                        i32 = i15;
                                        pyoVar2 = pyoVar;
                                        i33 = i14;
                                        i34 = i8;
                                        unsafe5 = unsafe;
                                        i37 = 1048575;
                                        i36 = i16;
                                        pVar3 = pVar;
                                        i35 = i4;
                                    } else if (i44 == 2) {
                                        pVar2.E(j, obj7, i28);
                                        throw null;
                                    }
                                }
                            } else if (i44 == 2) {
                                oqw oqwVar = (oqw) unsafe12.getObject(obj12, j);
                                if (!((p9) oqwVar).a) {
                                    int size = oqwVar.size();
                                    oqwVar = oqwVar.w(size == 0 ? 10 : size * 2);
                                    unsafe12.putObject(obj12, j, oqwVar);
                                }
                                i30 = i2;
                                v43Var7 = v43Var;
                                i31 = d.f(pVar3.p(i56), i41, bArr, i40, i2, oqwVar, v43Var);
                                i36 = i41;
                                i33 = i56;
                                unsafe5 = unsafe12;
                                i32 = i42;
                                pyoVar2 = pyoVar4;
                                i34 = i34;
                                i37 = 1048575;
                                obj8 = obj;
                                bArr4 = bArr;
                            } else {
                                i8 = i34;
                                obj7 = obj;
                                i29 = i40;
                                i4 = i35;
                                unsafe = unsafe12;
                                i32 = i42;
                                i28 = i56;
                                pyoVar = pyoVar4;
                                obj3 = null;
                                i11 = 0;
                                z5 = true;
                                pVar2 = pVar3;
                                i13 = i41;
                            }
                            i5 = i3;
                            pVar = pVar2;
                            i12 = i29;
                            obj2 = obj7;
                            z4 = z5;
                            i10 = i28;
                            i9 = i32;
                            z2 = z4;
                            if (i13 == i5) {
                            }
                            if (pVar.f) {
                            }
                            i14 = i10;
                            i15 = i9;
                            i16 = i13;
                            p2 = d.p(i16, bArr, i12, i2, q(obj2), v43Var);
                            i30 = i2;
                            i31 = p2;
                            bArr4 = bArr;
                            v43Var7 = v43Var;
                            obj8 = obj2;
                            i32 = i15;
                            pyoVar2 = pyoVar;
                            i33 = i14;
                            i34 = i8;
                            unsafe5 = unsafe;
                            i37 = 1048575;
                            i36 = i16;
                            pVar3 = pVar;
                            i35 = i4;
                        }
                    }
                    i13 = i41;
                    z2 = z;
                    if (i13 == i5) {
                    }
                    if (pVar.f) {
                    }
                    i14 = i10;
                    i15 = i9;
                    i16 = i13;
                    p2 = d.p(i16, bArr, i12, i2, q(obj2), v43Var);
                    i30 = i2;
                    i31 = p2;
                    bArr4 = bArr;
                    v43Var7 = v43Var;
                    obj8 = obj2;
                    i32 = i15;
                    pyoVar2 = pyoVar;
                    i33 = i14;
                    i34 = i8;
                    unsafe5 = unsafe;
                    i37 = 1048575;
                    i36 = i16;
                    pVar3 = pVar;
                    i35 = i4;
                } else {
                    obj2 = obj8;
                    i4 = i35;
                    unsafe = unsafe5;
                    i5 = i3;
                    pVar = pVar3;
                    i6 = i36;
                    i7 = i37;
                }
            }
            bArr4 = bArr;
            i30 = i2;
            v43Var7 = v43Var;
            i36 = i13;
            i31 = G;
            i32 = i9;
            pVar3 = pVar;
            obj8 = obj2;
            i33 = i28;
            pyoVar2 = pyoVar;
            i34 = i8;
            i35 = i4;
            unsafe5 = unsafe;
        }
    }

    public final int G(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, v43 v43Var) {
        Unsafe unsafe = q;
        long j2 = this.a[i8 + 2] & 1048575;
        switch (i7) {
            case SAFETY_TIPS_VALUE:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(d.c(i, bArr))));
                int i9 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i9;
            case 52:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(d.b(i, bArr))));
                int i10 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i10;
            case 53:
            case 54:
                if (i5 != 0) {
                    return i;
                }
                int t = d.t(bArr, i, v43Var);
                unsafe.putObject(obj, j, Long.valueOf(v43Var.b));
                unsafe.putInt(obj, j2, i4);
                return t;
            case SODA_DE_DE_VALUE:
            case 62:
                if (i5 != 0) {
                    return i;
                }
                int r = d.r(bArr, i, v43Var);
                unsafe.putObject(obj, j, Integer.valueOf(v43Var.a));
                unsafe.putInt(obj, j2, i4);
                return r;
            case 56:
            case 65:
                if (i5 != 1) {
                    return i;
                }
                unsafe.putObject(obj, j, Long.valueOf(d.c(i, bArr)));
                int i11 = i + 8;
                unsafe.putInt(obj, j2, i4);
                return i11;
            case SODA_ES_ES_VALUE:
            case 64:
                if (i5 != 5) {
                    return i;
                }
                unsafe.putObject(obj, j, Integer.valueOf(d.b(i, bArr)));
                int i12 = i + 4;
                unsafe.putInt(obj, j2, i4);
                return i12;
            case 58:
                if (i5 != 0) {
                    return i;
                }
                int t2 = d.t(bArr, i, v43Var);
                unsafe.putObject(obj, j, Boolean.valueOf(v43Var.b != 0));
                unsafe.putInt(obj, j2, i4);
                return t2;
            case 59:
                if (i5 != 2) {
                    return i;
                }
                int r2 = d.r(bArr, i, v43Var);
                int i13 = v43Var.a;
                if (i13 == 0) {
                    unsafe.putObject(obj, j, "");
                } else {
                    if ((i6 & 536870912) != 0) {
                        if (x.a.m(r2, r2 + i13, bArr) != 0) {
                            throw InvalidProtocolBufferException.f();
                        }
                    }
                    unsafe.putObject(obj, j, new String(bArr, r2, i13, rqw.a));
                    r2 += i13;
                }
                unsafe.putInt(obj, j2, i4);
                return r2;
            case 60:
                if (i5 != 2) {
                    return i;
                }
                Object z = z(i4, i8, obj);
                int v = d.v(z, p(i8), bArr, i, i2, v43Var);
                Q(i4, obj, z, i8);
                return v;
            case 61:
                if (i5 != 2) {
                    return i;
                }
                int a = d.a(bArr, i, v43Var);
                unsafe.putObject(obj, j, v43Var.c);
                unsafe.putInt(obj, j2, i4);
                return a;
            case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                if (i5 != 0) {
                    return i;
                }
                int r3 = d.r(bArr, i, v43Var);
                int i14 = v43Var.a;
                hqw n = n(i8);
                if (n != null && !n.isInRange(i14)) {
                    q(obj).f(i3, Long.valueOf(i14));
                    return r3;
                }
                unsafe.putObject(obj, j, Integer.valueOf(i14));
                unsafe.putInt(obj, j2, i4);
                return r3;
            case 66:
                if (i5 != 0) {
                    return i;
                }
                int r4 = d.r(bArr, i, v43Var);
                unsafe.putObject(obj, j, Integer.valueOf(eac.b(v43Var.a)));
                unsafe.putInt(obj, j2, i4);
                return r4;
            case 67:
                if (i5 != 0) {
                    return i;
                }
                int t3 = d.t(bArr, i, v43Var);
                unsafe.putObject(obj, j, Long.valueOf(eac.c(v43Var.b)));
                unsafe.putInt(obj, j2, i4);
                return t3;
            case TRANSLATE_KIT_VALUE:
                if (i5 == 3) {
                    Object z2 = z(i4, i8, obj);
                    int u = d.u(z2, p(i8), bArr, i, i2, (i3 & (-8)) | 4, v43Var);
                    Q(i4, obj, z2, i8);
                    return u;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int H(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, v43 v43Var) {
        int s;
        Unsafe unsafe = q;
        oqw oqwVar = (oqw) unsafe.getObject(obj, j2);
        if (!((p9) oqwVar).a) {
            oqwVar = oqwVar.w(oqwVar.size() * 2);
            unsafe.putObject(obj, j2, oqwVar);
        }
        oqw oqwVar2 = oqwVar;
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return d.h(bArr, i, oqwVar2, v43Var);
                }
                if (i5 == 1) {
                    d5m d5mVar = (d5m) oqwVar2;
                    d5mVar.b(Double.longBitsToDouble(d.c(i, bArr)));
                    int i8 = i + 8;
                    while (i8 < i2) {
                        int r = d.r(bArr, i8, v43Var);
                        if (i3 != v43Var.a) {
                            return i8;
                        }
                        d5mVar.b(Double.longBitsToDouble(d.c(r, bArr)));
                        i8 = r + 8;
                    }
                    return i8;
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return d.k(bArr, i, oqwVar2, v43Var);
                }
                if (i5 == 5) {
                    bor borVar = (bor) oqwVar2;
                    borVar.b(Float.intBitsToFloat(d.b(i, bArr)));
                    int i9 = i + 4;
                    while (i9 < i2) {
                        int r2 = d.r(bArr, i9, v43Var);
                        if (i3 != v43Var.a) {
                            return i9;
                        }
                        borVar.b(Float.intBitsToFloat(d.b(r2, bArr)));
                        i9 = r2 + 4;
                    }
                    return i9;
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    qlz qlzVar = (qlz) oqwVar2;
                    int r3 = d.r(bArr, i, v43Var);
                    int i10 = v43Var.a + r3;
                    while (r3 < i10) {
                        r3 = d.t(bArr, r3, v43Var);
                        qlzVar.b(v43Var.b);
                    }
                    if (r3 == i10) {
                        return r3;
                    }
                    throw InvalidProtocolBufferException.m();
                }
                if (i5 == 0) {
                    qlz qlzVar2 = (qlz) oqwVar2;
                    int t = d.t(bArr, i, v43Var);
                    qlzVar2.b(v43Var.b);
                    while (t < i2) {
                        int r4 = d.r(bArr, t, v43Var);
                        if (i3 != v43Var.a) {
                            return t;
                        }
                        t = d.t(bArr, r4, v43Var);
                        qlzVar2.b(v43Var.b);
                    }
                    return t;
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return d.n(bArr, i, oqwVar2, v43Var);
                }
                if (i5 == 0) {
                    return d.s(i3, bArr, i, i2, oqwVar2, v43Var);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return d.j(bArr, i, oqwVar2, v43Var);
                }
                if (i5 == 1) {
                    qlz qlzVar3 = (qlz) oqwVar2;
                    qlzVar3.b(d.c(i, bArr));
                    int i11 = i + 8;
                    while (i11 < i2) {
                        int r5 = d.r(bArr, i11, v43Var);
                        if (i3 != v43Var.a) {
                            return i11;
                        }
                        qlzVar3.b(d.c(r5, bArr));
                        i11 = r5 + 8;
                    }
                    return i11;
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return d.i(bArr, i, oqwVar2, v43Var);
                }
                if (i5 == 5) {
                    o5w o5wVar = (o5w) oqwVar2;
                    o5wVar.b(d.b(i, bArr));
                    int i12 = i + 4;
                    while (i12 < i2) {
                        int r6 = d.r(bArr, i12, v43Var);
                        if (i3 != v43Var.a) {
                            return i12;
                        }
                        o5wVar.b(d.b(r6, bArr));
                        i12 = r6 + 4;
                    }
                    return i12;
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return d.g(bArr, i, oqwVar2, v43Var);
                }
                if (i5 == 0) {
                    i96 i96Var = (i96) oqwVar2;
                    int t2 = d.t(bArr, i, v43Var);
                    i96Var.b(v43Var.b != 0);
                    while (t2 < i2) {
                        int r7 = d.r(bArr, t2, v43Var);
                        if (i3 != v43Var.a) {
                            return t2;
                        }
                        t2 = d.t(bArr, r7, v43Var);
                        i96Var.b(v43Var.b != 0);
                    }
                    return t2;
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        int r8 = d.r(bArr, i, v43Var);
                        int i13 = v43Var.a;
                        if (i13 < 0) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i13 == 0) {
                            oqwVar2.add("");
                        } else {
                            oqwVar2.add(new String(bArr, r8, i13, rqw.a));
                            r8 += i13;
                        }
                        while (r8 < i2) {
                            int r9 = d.r(bArr, r8, v43Var);
                            if (i3 != v43Var.a) {
                                return r8;
                            }
                            r8 = d.r(bArr, r9, v43Var);
                            int i14 = v43Var.a;
                            if (i14 < 0) {
                                throw InvalidProtocolBufferException.i();
                            }
                            if (i14 == 0) {
                                oqwVar2.add("");
                            } else {
                                oqwVar2.add(new String(bArr, r8, i14, rqw.a));
                                r8 += i14;
                            }
                        }
                        return r8;
                    }
                    int r10 = d.r(bArr, i, v43Var);
                    int i15 = v43Var.a;
                    if (i15 < 0) {
                        throw InvalidProtocolBufferException.i();
                    }
                    if (i15 == 0) {
                        oqwVar2.add("");
                    } else {
                        int i16 = r10 + i15;
                        if (x.a.m(r10, i16, bArr) != 0) {
                            throw InvalidProtocolBufferException.f();
                        }
                        oqwVar2.add(new String(bArr, r10, i15, rqw.a));
                        r10 = i16;
                    }
                    while (r10 < i2) {
                        int r11 = d.r(bArr, r10, v43Var);
                        if (i3 != v43Var.a) {
                            return r10;
                        }
                        r10 = d.r(bArr, r11, v43Var);
                        int i17 = v43Var.a;
                        if (i17 < 0) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i17 == 0) {
                            oqwVar2.add("");
                        } else {
                            int i18 = r10 + i17;
                            if (x.a.m(r10, i18, bArr) != 0) {
                                throw InvalidProtocolBufferException.f();
                            }
                            oqwVar2.add(new String(bArr, r10, i17, rqw.a));
                            r10 = i18;
                        }
                    }
                    return r10;
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return d.f(p(i6), i3, bArr, i, i2, oqwVar2, v43Var);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    int r12 = d.r(bArr, i, v43Var);
                    int i19 = v43Var.a;
                    if (i19 < 0) {
                        throw InvalidProtocolBufferException.i();
                    }
                    if (i19 > bArr.length - r12) {
                        throw InvalidProtocolBufferException.m();
                    }
                    if (i19 == 0) {
                        oqwVar2.add(ByteString.a);
                    } else {
                        oqwVar2.add(ByteString.f(r12, i19, bArr));
                        r12 += i19;
                    }
                    while (r12 < i2) {
                        int r13 = d.r(bArr, r12, v43Var);
                        if (i3 != v43Var.a) {
                            return r12;
                        }
                        r12 = d.r(bArr, r13, v43Var);
                        int i20 = v43Var.a;
                        if (i20 < 0) {
                            throw InvalidProtocolBufferException.i();
                        }
                        if (i20 > bArr.length - r12) {
                            throw InvalidProtocolBufferException.m();
                        }
                        if (i20 == 0) {
                            oqwVar2.add(ByteString.a);
                        } else {
                            oqwVar2.add(ByteString.f(r12, i20, bArr));
                            r12 += i20;
                        }
                    }
                    return r12;
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        s = d.s(i3, bArr, i, i2, oqwVar2, v43Var);
                    }
                    return i;
                }
                s = d.n(bArr, i, oqwVar2, v43Var);
                r.j(obj, i4, oqwVar2, n(i6), null, this.m);
                return s;
            case 33:
            case 47:
                if (i5 == 2) {
                    return d.l(bArr, i, oqwVar2, v43Var);
                }
                if (i5 == 0) {
                    o5w o5wVar2 = (o5w) oqwVar2;
                    int r14 = d.r(bArr, i, v43Var);
                    o5wVar2.b(eac.b(v43Var.a));
                    while (r14 < i2) {
                        int r15 = d.r(bArr, r14, v43Var);
                        if (i3 != v43Var.a) {
                            return r14;
                        }
                        r14 = d.r(bArr, r15, v43Var);
                        o5wVar2.b(eac.b(v43Var.a));
                    }
                    return r14;
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return d.m(bArr, i, oqwVar2, v43Var);
                }
                if (i5 == 0) {
                    qlz qlzVar4 = (qlz) oqwVar2;
                    int t3 = d.t(bArr, i, v43Var);
                    qlzVar4.b(eac.c(v43Var.b));
                    while (t3 < i2) {
                        int r16 = d.r(bArr, t3, v43Var);
                        if (i3 != v43Var.a) {
                            return t3;
                        }
                        t3 = d.t(bArr, r16, v43Var);
                        qlzVar4.b(eac.c(v43Var.b));
                    }
                    return t3;
                }
                return i;
            case 49:
                if (i5 == 3) {
                    som0 p2 = p(i6);
                    int i21 = (i3 & (-8)) | 4;
                    int d = d.d(p2, bArr, i, i2, i21, v43Var);
                    int i22 = i21;
                    oqwVar2.add(v43Var.c);
                    while (d < i2) {
                        int r17 = d.r(bArr, d, v43Var);
                        if (i3 != v43Var.a) {
                            return d;
                        }
                        int i23 = i22;
                        d = d.d(p2, bArr, r17, i2, i23, v43Var);
                        oqwVar2.add(v43Var.c);
                        i22 = i23;
                    }
                    return d;
                }
                return i;
            default:
                return i;
        }
    }

    public final void I(Object obj, int i, i iVar, som0 som0Var, pyo pyoVar) {
        this.l.getClass();
        iVar.C(hry.a(i & 1048575, obj), som0Var, pyoVar);
    }

    public final void J(Object obj, int i, i iVar) {
        if ((536870912 & i) != 0) {
            z321.p(i & 1048575, obj, iVar.P());
        } else if (this.g) {
            z321.p(i & 1048575, obj, iVar.L());
        } else {
            z321.p(i & 1048575, obj, iVar.j());
        }
    }

    public final void K(Object obj, int i, i iVar) {
        boolean z = (536870912 & i) != 0;
        hry hryVar = this.l;
        if (z) {
            hryVar.getClass();
            iVar.O(hry.a(i & 1048575, obj));
        } else {
            hryVar.getClass();
            iVar.M(hry.a(i & 1048575, obj));
        }
    }

    public final void M(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        z321.n(j, obj, (1 << (i2 >>> 20)) | z321.c.i(j, obj));
    }

    public final void N(int i, int i2, Object obj) {
        z321.n(this.a[i2 + 2] & 1048575, obj, i);
    }

    public final int O(int i, int i2) {
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

    public final void P(int i, Object obj, Object obj2) {
        q.putObject(obj, S(i) & 1048575, obj2);
        M(i, obj);
    }

    public final void Q(int i, Object obj, Object obj2, int i2) {
        q.putObject(obj, S(i2) & 1048575, obj2);
        N(i, i2, obj);
    }

    public final int S(int i) {
        return this.a[i + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0508  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022d  */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [long] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(Object obj, gp50 gp50Var) {
        Map.Entry entry;
        Iterator it;
        int length;
        int i;
        boolean z;
        int i2;
        int i3;
        Map.Entry entry2;
        int i4;
        boolean z2;
        p pVar = this;
        l lVar = (l) gp50Var.b;
        boolean z3 = pVar.f;
        syo syoVar = pVar.n;
        if (z3) {
            ((m) syoVar).getClass();
            yxq yxqVar = ((GeneratedMessageLite.a) obj).a;
            if (!yxqVar.j()) {
                Iterator n = yxqVar.n();
                entry = (Map.Entry) n.next();
                it = n;
                int[] iArr = pVar.a;
                length = iArr.length;
                Unsafe unsafe = q;
                i = 0;
                int i5 = 1048575;
                int i6 = 0;
                while (i < length) {
                    int S = pVar.S(i);
                    int i7 = iArr[i];
                    int R = R(S);
                    Iterator it2 = it;
                    if (R <= 17) {
                        int i8 = iArr[i + 2];
                        z = 1;
                        int i9 = i8 & 1048575;
                        Map.Entry entry3 = entry;
                        if (i9 != i5) {
                            i6 = i9 == 1048575 ? 0 : unsafe.getInt(obj, i9);
                            i5 = i9;
                        }
                        int i10 = i6;
                        i4 = 1 << (i8 >>> 20);
                        i2 = i5;
                        i3 = i10;
                        entry2 = entry3;
                    } else {
                        Map.Entry entry4 = entry;
                        z = 1;
                        i2 = i5;
                        i3 = i6;
                        entry2 = entry4;
                        i4 = 0;
                    }
                    while (entry2 != null) {
                        ((m) syoVar).getClass();
                        if (((qxs) entry2.getKey()).c() <= i7) {
                            syoVar.d(gp50Var, entry2);
                            entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        } else {
                            int i11 = S & 1048575;
                            Map.Entry entry5 = entry2;
                            int[] iArr2 = iArr;
                            long j = i11;
                            switch (R) {
                                case 0:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        double g = z321.c.g(j, obj);
                                        lVar.getClass();
                                        lVar.o(i7, Double.doubleToRawLongBits(g));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 1:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        float h = z321.c.h(j, obj);
                                        lVar.getClass();
                                        lVar.m(i7, Float.floatToRawIntBits(h));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 2:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        gp50Var.T(i7, unsafe.getLong(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 3:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        lVar.y(i7, unsafe.getLong(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 4:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        gp50Var.S(i7, unsafe.getInt(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 5:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        gp50Var.Q(i7, unsafe.getLong(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 6:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        gp50Var.P(i7, unsafe.getInt(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 7:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        lVar.k(i7, z321.c.d(j, obj));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 8:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        U(i7, unsafe.getObject(obj, j), gp50Var);
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 9:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        gp50Var.U(i7, unsafe.getObject(obj, j), pVar.p(i));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 10:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        gp50Var.O(i7, (ByteString) unsafe.getObject(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 11:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        lVar.w(i7, unsafe.getInt(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 12:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        lVar.q(i7, unsafe.getInt(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 13:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        lVar.m(i7, unsafe.getInt(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 14:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        lVar.o(i7, unsafe.getLong(obj, j));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 15:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        int i12 = unsafe.getInt(obj, j);
                                        lVar.w(i7, (i12 >> 31) ^ (i12 << 1));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 16:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        long j2 = unsafe.getLong(obj, j);
                                        lVar.y(i7, (j2 << 1) ^ (j2 >> 63));
                                    }
                                    pVar = this;
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 17:
                                    if (pVar.s(obj, i, i2, i3, i4)) {
                                        gp50Var.R(i7, unsafe.getObject(obj, j), pVar.p(i));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 18:
                                    r.q(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 19:
                                    r.u(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 20:
                                    r.x(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 21:
                                    r.F(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 22:
                                    r.w(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 23:
                                    r.t(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 24:
                                    r.s(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 25:
                                    r.o(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 26:
                                    r.D(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 27:
                                    r.y(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, pVar.p(i));
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 28:
                                    r.p(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 29:
                                    z2 = false;
                                    r.E(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 30:
                                    z2 = false;
                                    r.r(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 31:
                                    z2 = false;
                                    r.z(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 32:
                                    z2 = false;
                                    r.A(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 33:
                                    z2 = false;
                                    r.B(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 34:
                                    z2 = false;
                                    r.C(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, false);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 35:
                                    r.q(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 36:
                                    r.u(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 37:
                                    r.x(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 38:
                                    r.F(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 39:
                                    r.w(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 40:
                                    r.t(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 41:
                                    r.s(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 42:
                                    r.o(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 43:
                                    r.E(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 44:
                                    r.r(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 45:
                                    r.z(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 46:
                                    r.A(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 47:
                                    r.B(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 48:
                                    r.C(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, z);
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 49:
                                    r.v(iArr2[i], (List) unsafe.getObject(obj, j), gp50Var, pVar.p(i));
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 50:
                                    if (unsafe.getObject(obj, j) != null) {
                                        Object o = pVar.o(i);
                                        pVar.o.getClass();
                                        b64.D(o);
                                        throw null;
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case SAFETY_TIPS_VALUE:
                                    if (pVar.u(i7, i, obj)) {
                                        double doubleValue = ((Double) z321.c.k(j, obj)).doubleValue();
                                        lVar.getClass();
                                        lVar.o(i7, Double.doubleToRawLongBits(doubleValue));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 52:
                                    if (pVar.u(i7, i, obj)) {
                                        float floatValue = ((Float) z321.c.k(j, obj)).floatValue();
                                        lVar.getClass();
                                        lVar.m(i7, Float.floatToRawIntBits(floatValue));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 53:
                                    if (pVar.u(i7, i, obj)) {
                                        gp50Var.T(i7, D(j, obj));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 54:
                                    if (pVar.u(i7, i, obj)) {
                                        lVar.y(i7, D(j, obj));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case SODA_DE_DE_VALUE:
                                    if (pVar.u(i7, i, obj)) {
                                        gp50Var.S(i7, C(j, obj));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 56:
                                    if (pVar.u(i7, i, obj)) {
                                        gp50Var.Q(i7, D(j, obj));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case SODA_ES_ES_VALUE:
                                    if (pVar.u(i7, i, obj)) {
                                        gp50Var.P(i7, C(j, obj));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 58:
                                    if (pVar.u(i7, i, obj)) {
                                        lVar.k(i7, ((Boolean) z321.c.k(j, obj)).booleanValue());
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 59:
                                    if (pVar.u(i7, i, obj)) {
                                        U(i7, unsafe.getObject(obj, j), gp50Var);
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 60:
                                    if (pVar.u(i7, i, obj)) {
                                        gp50Var.U(i7, unsafe.getObject(obj, j), pVar.p(i));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 61:
                                    if (pVar.u(i7, i, obj)) {
                                        gp50Var.O(i7, (ByteString) unsafe.getObject(obj, j));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 62:
                                    if (pVar.u(i7, i, obj)) {
                                        lVar.w(i7, C(j, obj));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                                    if (pVar.u(i7, i, obj)) {
                                        lVar.q(i7, C(j, obj));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 64:
                                    if (pVar.u(i7, i, obj)) {
                                        lVar.m(i7, C(j, obj));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 65:
                                    if (pVar.u(i7, i, obj)) {
                                        lVar.o(i7, D(j, obj));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 66:
                                    if (pVar.u(i7, i, obj)) {
                                        int C = C(j, obj);
                                        lVar.w(i7, (C >> 31) ^ (C << 1));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case 67:
                                    if (pVar.u(i7, i, obj)) {
                                        long D = D(j, obj);
                                        lVar.y(i7, (D << z) ^ (D >> 63));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                case TRANSLATE_KIT_VALUE:
                                    if (pVar.u(i7, i, obj)) {
                                        gp50Var.R(i7, unsafe.getObject(obj, j), pVar.p(i));
                                    }
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                                default:
                                    i += 3;
                                    i6 = i3;
                                    iArr = iArr2;
                                    it = it2;
                                    i5 = i2;
                                    entry = entry5;
                            }
                        }
                    }
                    int i112 = S & 1048575;
                    Map.Entry entry52 = entry2;
                    int[] iArr22 = iArr;
                    long j3 = i112;
                    switch (R) {
                    }
                }
                Iterator it3 = it;
                while (entry != null) {
                    syoVar.d(gp50Var, entry);
                    entry = it3.hasNext() ? (Map.Entry) it3.next() : null;
                }
                ((u) pVar.m).getClass();
                ((GeneratedMessageLite) obj).unknownFields.g(gp50Var);
            }
        }
        entry = null;
        it = null;
        int[] iArr3 = pVar.a;
        length = iArr3.length;
        Unsafe unsafe2 = q;
        i = 0;
        int i52 = 1048575;
        int i62 = 0;
        while (i < length) {
        }
        Iterator it32 = it;
        while (entry != null) {
        }
        ((u) pVar.m).getClass();
        ((GeneratedMessageLite) obj).unknownFields.g(gp50Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0102, code lost:
    
        return false;
     */
    @Override // defpackage.som0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            if (i6 >= this.i) {
                if (this.f) {
                    ((m) this.n).getClass();
                    if (!((GeneratedMessageLite.a) obj).a.l()) {
                        break;
                    }
                }
                return true;
            }
            int i7 = this.h[i6];
            int[] iArr = this.a;
            int i8 = iArr[i7];
            int S = S(i7);
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
            if ((268435456 & S) != 0 && !s(obj, i2, i, i3, i11)) {
                break;
            }
            int R = R(S);
            if (R == 9 || R == 17) {
                if (s(obj, i2, i, i3, i11)) {
                    if (!p(i2).a(z321.c.k(S & 1048575, obj))) {
                        break;
                    }
                } else {
                    continue;
                }
                i6++;
                i4 = i;
                i5 = i3;
            } else {
                if (R != 27) {
                    if (R == 60 || R == 68) {
                        if (u(i8, i2, obj)) {
                            if (!p(i2).a(z321.c.k(S & 1048575, obj))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else if (R != 49) {
                        if (R != 50) {
                            continue;
                        } else {
                            Object k = z321.c.k(S & 1048575, obj);
                            this.o.getClass();
                            if (!((MapFieldLite) k).isEmpty()) {
                                b64.D(o(i2));
                                throw null;
                            }
                        }
                    }
                    i6++;
                    i4 = i;
                    i5 = i3;
                }
                List list = (List) z321.c.k(S & 1048575, obj);
                if (list.isEmpty()) {
                    continue;
                } else {
                    som0 p2 = p(i2);
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        if (!p2.a(list.get(i13))) {
                            break loop0;
                        }
                    }
                }
                i6++;
                i4 = i;
                i5 = i3;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.som0
    public final void b(Object obj, Object obj2) {
        Object obj3;
        l(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                Object obj4 = obj;
                r.l(this.m, obj4, obj2);
                if (this.f) {
                    ((m) this.n).getClass();
                    yxq yxqVar = ((GeneratedMessageLite.a) obj2).a;
                    if (yxqVar.j()) {
                        return;
                    }
                    ((GeneratedMessageLite.a) obj4).f().p(yxqVar);
                    return;
                }
                return;
            }
            int S = S(i);
            long j = 1048575 & S;
            int i2 = iArr[i];
            switch (R(S)) {
                case 0:
                    if (r(i, obj2)) {
                        w321 w321Var = z321.c;
                        obj3 = obj;
                        w321Var.o(obj3, j, w321Var.g(j, obj2));
                        M(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case 1:
                    if (r(i, obj2)) {
                        w321 w321Var2 = z321.c;
                        w321Var2.p(obj, j, w321Var2.h(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 2:
                    if (r(i, obj2)) {
                        z321.o(obj, j, z321.c.j(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (r(i, obj2)) {
                        z321.o(obj, j, z321.c.j(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 4:
                    if (r(i, obj2)) {
                        z321.n(j, obj, z321.c.i(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (r(i, obj2)) {
                        z321.o(obj, j, z321.c.j(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 6:
                    if (r(i, obj2)) {
                        z321.n(j, obj, z321.c.i(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 7:
                    if (r(i, obj2)) {
                        w321 w321Var3 = z321.c;
                        w321Var3.m(obj, j, w321Var3.d(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (r(i, obj2)) {
                        z321.p(j, obj, z321.c.k(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 9:
                    w(i, obj, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (r(i, obj2)) {
                        z321.p(j, obj, z321.c.k(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (r(i, obj2)) {
                        z321.n(j, obj, z321.c.i(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (r(i, obj2)) {
                        z321.n(j, obj, z321.c.i(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (r(i, obj2)) {
                        z321.n(j, obj, z321.c.i(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (r(i, obj2)) {
                        z321.o(obj, j, z321.c.j(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (r(i, obj2)) {
                        z321.n(j, obj, z321.c.i(j, obj2));
                        M(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (r(i, obj2)) {
                        z321.o(obj, j, z321.c.j(j, obj2));
                        M(i, obj);
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
                    this.l.getClass();
                    w321 w321Var4 = z321.c;
                    oqw oqwVar = (oqw) w321Var4.k(j, obj);
                    oqw oqwVar2 = (oqw) w321Var4.k(j, obj2);
                    int size = oqwVar.size();
                    int size2 = oqwVar2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((p9) oqwVar).a) {
                            oqwVar = oqwVar.w(size2 + size);
                        }
                        oqwVar.addAll(oqwVar2);
                    }
                    if (size > 0) {
                        oqwVar2 = oqwVar;
                    }
                    z321.p(j, obj, oqwVar2);
                    obj3 = obj;
                    break;
                case 50:
                    Class cls = r.a;
                    w321 w321Var5 = z321.c;
                    Object k = w321Var5.k(j, obj);
                    Object k2 = w321Var5.k(j, obj2);
                    this.o.getClass();
                    z321.p(j, obj, gi00.a(k, k2));
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
                        z321.p(j, obj, z321.c.k(j, obj2));
                        N(i2, i, obj);
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
                    if (u(i2, i, obj2)) {
                        z321.p(j, obj, z321.c.k(j, obj2));
                        N(i2, i, obj);
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

    @Override // defpackage.som0
    public final void c(Object obj) {
        if (t(obj)) {
            if (obj instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
                generatedMessageLite.clearMemoizedSerializedSize();
                generatedMessageLite.clearMemoizedHashCode();
                generatedMessageLite.markImmutable();
            }
            int[] iArr = this.a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int S = S(i);
                long j = 1048575 & S;
                int R = R(S);
                if (R != 9) {
                    if (R != 60 && R != 68) {
                        switch (R) {
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
                                p9 p9Var = (p9) ((oqw) z321.c.k(j, obj));
                                if (p9Var.a) {
                                    p9Var.a = false;
                                    break;
                                } else {
                                    break;
                                }
                            case 50:
                                Unsafe unsafe = q;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    this.o.getClass();
                                    ((MapFieldLite) object).g();
                                    unsafe.putObject(obj, j, object);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (u(iArr[i], i, obj)) {
                        p(i).c(q.getObject(obj, j));
                    }
                }
                if (r(i, obj)) {
                    p(i).c(q.getObject(obj, j));
                }
            }
            ((u) this.m).getClass();
            t tVar = ((GeneratedMessageLite) obj).unknownFields;
            if (tVar.e) {
                tVar.e = false;
            }
            if (this.f) {
                ((m) this.n).getClass();
                ((GeneratedMessageLite.a) obj).a.o();
            }
        }
    }

    @Override // defpackage.som0
    public final Object d() {
        this.k.getClass();
        return ((GeneratedMessageLite) this.e).newMutableInstance();
    }

    @Override // defpackage.som0
    public final int e(b bVar) {
        int i;
        int f;
        int f2;
        int h;
        int f3;
        int h2;
        int f4;
        int f5;
        int f6;
        int serializedSize;
        int g;
        int a;
        int f7;
        int serializedSize2;
        int f8;
        int size;
        int i2;
        int f9;
        int f10;
        int size2;
        int f11;
        int g2;
        int i3;
        int f12;
        int f13;
        int f14;
        int h3;
        int f15;
        int h4;
        p pVar = this;
        b bVar2 = bVar;
        Unsafe unsafe = q;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (true) {
            int[] iArr = pVar.a;
            if (i4 >= iArr.length) {
                ((u) pVar.m).getClass();
                int c = ((GeneratedMessageLite) bVar).unknownFields.c() + i6;
                if (!pVar.f) {
                    return c;
                }
                ((m) pVar.n).getClass();
                return ((GeneratedMessageLite.a) bVar).a.i() + c;
            }
            int S = pVar.S(i4);
            int R = R(S);
            int i8 = iArr[i4];
            int i9 = iArr[i4 + 2];
            int i10 = i9 & 1048575;
            if (R <= 17) {
                if (i10 != i7) {
                    i5 = i10 == 1048575 ? 0 : unsafe.getInt(bVar2, i10);
                    i7 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            long j = S & 1048575;
            if (R >= FieldType.DOUBLE_LIST_PACKED.a()) {
                FieldType.SINT64_LIST_PACKED.a();
            }
            switch (R) {
                case 0:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        i6 += l.f(i8) + 8;
                    }
                    i4 += 3;
                    bVar2 = bVar;
                case 1:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        f = l.f(i8);
                        f5 = f + 4;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 2:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        long j2 = unsafe.getLong(bVar2, j);
                        f2 = l.f(i8);
                        h = l.h(j2);
                        i6 += h + f2;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 3:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        long j3 = unsafe.getLong(bVar2, j);
                        f2 = l.f(i8);
                        h = l.h(j3);
                        i6 += h + f2;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 4:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        int i11 = unsafe.getInt(bVar2, j);
                        f3 = l.f(i8);
                        h2 = l.h(i11);
                        f5 = h2 + f3;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 5:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        f4 = l.f(i8);
                        f5 = f4 + 8;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 6:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        f = l.f(i8);
                        f5 = f + 4;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 7:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        f5 = l.f(i8) + 1;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 8:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        Object object = unsafe.getObject(bVar2, j);
                        i6 = (object instanceof ByteString ? l.b(i8, (ByteString) object) : l.e((String) object) + l.f(i8)) + i6;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 9:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        Object object2 = unsafe.getObject(bVar2, j);
                        som0 p2 = pVar.p(i4);
                        Class cls = r.a;
                        if (object2 instanceof u3y) {
                            a = ((u3y) object2).a(i8);
                            i6 += a;
                            i4 += 3;
                            bVar2 = bVar;
                        } else {
                            f6 = l.f(i8);
                            serializedSize = ((b) object2).getSerializedSize(p2);
                            g = l.g(serializedSize);
                            a = g + serializedSize + f6;
                            i6 += a;
                            i4 += 3;
                            bVar2 = bVar;
                        }
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 10:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        f5 = l.b(i8, (ByteString) unsafe.getObject(bVar2, j));
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 11:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        int i12 = unsafe.getInt(bVar2, j);
                        f3 = l.f(i8);
                        h2 = l.g(i12);
                        f5 = h2 + f3;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 12:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        int i13 = unsafe.getInt(bVar2, j);
                        f3 = l.f(i8);
                        h2 = l.h(i13);
                        f5 = h2 + f3;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 13:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        f = l.f(i8);
                        f5 = f + 4;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 14:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        f4 = l.f(i8);
                        f5 = f4 + 8;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 15:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        int i14 = unsafe.getInt(bVar2, j);
                        f3 = l.f(i8);
                        h2 = l.c(i14);
                        f5 = h2 + f3;
                        i6 += f5;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 16:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        long j4 = unsafe.getLong(bVar2, j);
                        f2 = l.f(i8);
                        h = l.d(j4);
                        i6 += h + f2;
                    }
                    pVar = this;
                    i4 += 3;
                    bVar2 = bVar;
                case 17:
                    if (pVar.s(bVar2, i4, i7, i5, i)) {
                        wt10 wt10Var = (wt10) unsafe.getObject(bVar2, j);
                        som0 p3 = pVar.p(i4);
                        Class cls2 = r.a;
                        f7 = l.f(i8) * 2;
                        serializedSize2 = ((b) wt10Var).getSerializedSize(p3);
                        a = serializedSize2 + f7;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 18:
                    a = r.c(i8, (List) unsafe.getObject(bVar2, j));
                    i6 += a;
                    i4 += 3;
                    bVar2 = bVar;
                case 19:
                    a = r.b(i8, (List) unsafe.getObject(bVar2, j));
                    i6 += a;
                    i4 += 3;
                    bVar2 = bVar;
                case 20:
                    List list = (List) unsafe.getObject(bVar2, j);
                    Class cls3 = r.a;
                    if (list.size() != 0) {
                        f8 = (l.f(i8) * list.size()) + r.e(list);
                        i6 += f8;
                        i4 += 3;
                        bVar2 = bVar;
                    }
                    f8 = 0;
                    i6 += f8;
                    i4 += 3;
                    bVar2 = bVar;
                case 21:
                    List list2 = (List) unsafe.getObject(bVar2, j);
                    Class cls4 = r.a;
                    size = list2.size();
                    if (size != 0) {
                        i2 = r.i(list2);
                        f9 = l.f(i8);
                        f8 = (f9 * size) + i2;
                        i6 += f8;
                        i4 += 3;
                        bVar2 = bVar;
                    }
                    f8 = 0;
                    i6 += f8;
                    i4 += 3;
                    bVar2 = bVar;
                case 22:
                    List list3 = (List) unsafe.getObject(bVar2, j);
                    Class cls5 = r.a;
                    size = list3.size();
                    if (size != 0) {
                        i2 = r.d(list3);
                        f9 = l.f(i8);
                        f8 = (f9 * size) + i2;
                        i6 += f8;
                        i4 += 3;
                        bVar2 = bVar;
                    }
                    f8 = 0;
                    i6 += f8;
                    i4 += 3;
                    bVar2 = bVar;
                case 23:
                    a = r.c(i8, (List) unsafe.getObject(bVar2, j));
                    i6 += a;
                    i4 += 3;
                    bVar2 = bVar;
                case 24:
                    a = r.b(i8, (List) unsafe.getObject(bVar2, j));
                    i6 += a;
                    i4 += 3;
                    bVar2 = bVar;
                case 25:
                    List list4 = (List) unsafe.getObject(bVar2, j);
                    Class cls6 = r.a;
                    int size3 = list4.size();
                    i6 += size3 == 0 ? 0 : (l.f(i8) + 1) * size3;
                    i4 += 3;
                    bVar2 = bVar;
                case 26:
                    List list5 = (List) unsafe.getObject(bVar2, j);
                    Class cls7 = r.a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        f8 = l.f(i8) * size4;
                        if (list5 instanceof i7y) {
                            i7y i7yVar = (i7y) list5;
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object v = i7yVar.v();
                                if (v instanceof ByteString) {
                                    int size5 = ((ByteString) v).size();
                                    f8 = l.g(size5) + size5 + f8;
                                } else {
                                    f8 = l.e((String) v) + f8;
                                }
                            }
                        } else {
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object obj = list5.get(i16);
                                if (obj instanceof ByteString) {
                                    int size6 = ((ByteString) obj).size();
                                    f8 = l.g(size6) + size6 + f8;
                                } else {
                                    f8 = l.e((String) obj) + f8;
                                }
                            }
                        }
                        i6 += f8;
                        i4 += 3;
                        bVar2 = bVar;
                    }
                    f8 = 0;
                    i6 += f8;
                    i4 += 3;
                    bVar2 = bVar;
                case 27:
                    List list6 = (List) unsafe.getObject(bVar2, j);
                    som0 p4 = pVar.p(i4);
                    Class cls8 = r.a;
                    int size7 = list6.size();
                    if (size7 == 0) {
                        f10 = 0;
                    } else {
                        f10 = l.f(i8) * size7;
                        for (int i17 = 0; i17 < size7; i17++) {
                            Object obj2 = list6.get(i17);
                            if (obj2 instanceof u3y) {
                                f10 = ((u3y) obj2).b() + f10;
                            } else {
                                int serializedSize3 = ((b) obj2).getSerializedSize(p4);
                                f10 = l.g(serializedSize3) + serializedSize3 + f10;
                            }
                        }
                    }
                    i6 += f10;
                    i4 += 3;
                    bVar2 = bVar;
                case 28:
                    List list7 = (List) unsafe.getObject(bVar2, j);
                    Class cls9 = r.a;
                    int size8 = list7.size();
                    if (size8 != 0) {
                        f8 = l.f(i8) * size8;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int size9 = ((ByteString) list7.get(i18)).size();
                            f8 += l.g(size9) + size9;
                        }
                        i6 += f8;
                        i4 += 3;
                        bVar2 = bVar;
                    }
                    f8 = 0;
                    i6 += f8;
                    i4 += 3;
                    bVar2 = bVar;
                case 29:
                    List list8 = (List) unsafe.getObject(bVar2, j);
                    Class cls10 = r.a;
                    size = list8.size();
                    if (size != 0) {
                        i2 = r.h(list8);
                        f9 = l.f(i8);
                        f8 = (f9 * size) + i2;
                        i6 += f8;
                        i4 += 3;
                        bVar2 = bVar;
                    }
                    f8 = 0;
                    i6 += f8;
                    i4 += 3;
                    bVar2 = bVar;
                case 30:
                    List list9 = (List) unsafe.getObject(bVar2, j);
                    Class cls11 = r.a;
                    size = list9.size();
                    if (size != 0) {
                        i2 = r.a(list9);
                        f9 = l.f(i8);
                        f8 = (f9 * size) + i2;
                        i6 += f8;
                        i4 += 3;
                        bVar2 = bVar;
                    }
                    f8 = 0;
                    i6 += f8;
                    i4 += 3;
                    bVar2 = bVar;
                case 31:
                    a = r.b(i8, (List) unsafe.getObject(bVar2, j));
                    i6 += a;
                    i4 += 3;
                    bVar2 = bVar;
                case 32:
                    a = r.c(i8, (List) unsafe.getObject(bVar2, j));
                    i6 += a;
                    i4 += 3;
                    bVar2 = bVar;
                case 33:
                    List list10 = (List) unsafe.getObject(bVar2, j);
                    Class cls12 = r.a;
                    size = list10.size();
                    if (size != 0) {
                        i2 = r.f(list10);
                        f9 = l.f(i8);
                        f8 = (f9 * size) + i2;
                        i6 += f8;
                        i4 += 3;
                        bVar2 = bVar;
                    }
                    f8 = 0;
                    i6 += f8;
                    i4 += 3;
                    bVar2 = bVar;
                case 34:
                    List list11 = (List) unsafe.getObject(bVar2, j);
                    Class cls13 = r.a;
                    size = list11.size();
                    if (size != 0) {
                        i2 = r.g(list11);
                        f9 = l.f(i8);
                        f8 = (f9 * size) + i2;
                        i6 += f8;
                        i4 += 3;
                        bVar2 = bVar;
                    }
                    f8 = 0;
                    i6 += f8;
                    i4 += 3;
                    bVar2 = bVar;
                case 35:
                    List list12 = (List) unsafe.getObject(bVar2, j);
                    Class cls14 = r.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(bVar2, j);
                    Class cls15 = r.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 37:
                    size2 = r.e((List) unsafe.getObject(bVar2, j));
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 38:
                    size2 = r.i((List) unsafe.getObject(bVar2, j));
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 39:
                    size2 = r.d((List) unsafe.getObject(bVar2, j));
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(bVar2, j);
                    Class cls16 = r.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(bVar2, j);
                    Class cls17 = r.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(bVar2, j);
                    Class cls18 = r.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 43:
                    size2 = r.h((List) unsafe.getObject(bVar2, j));
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 44:
                    size2 = r.a((List) unsafe.getObject(bVar2, j));
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(bVar2, j);
                    Class cls19 = r.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(bVar2, j);
                    Class cls20 = r.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 47:
                    size2 = r.f((List) unsafe.getObject(bVar2, j));
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 48:
                    size2 = r.g((List) unsafe.getObject(bVar2, j));
                    if (size2 > 0) {
                        f11 = l.f(i8);
                        g2 = l.g(size2);
                        i6 += g2 + f11 + size2;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(bVar2, j);
                    som0 p5 = pVar.p(i4);
                    Class cls21 = r.a;
                    int size10 = list19.size();
                    if (size10 == 0) {
                        i3 = 0;
                    } else {
                        i3 = 0;
                        for (int i19 = 0; i19 < size10; i19++) {
                            i3 += ((b) ((wt10) list19.get(i19))).getSerializedSize(p5) + (l.f(i8) * 2);
                        }
                    }
                    i6 += i3;
                    i4 += 3;
                    bVar2 = bVar;
                case 50:
                    Object object3 = unsafe.getObject(bVar2, j);
                    Object o = pVar.o(i4);
                    pVar.o.getClass();
                    MapFieldLite mapFieldLite = (MapFieldLite) object3;
                    b64.D(o);
                    if (mapFieldLite.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = mapFieldLite.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i4 += 3;
                    bVar2 = bVar;
                case SAFETY_TIPS_VALUE:
                    if (pVar.u(i8, i4, bVar2)) {
                        f12 = l.f(i8);
                        a = f12 + 8;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 52:
                    if (pVar.u(i8, i4, bVar2)) {
                        f13 = l.f(i8);
                        a = f13 + 4;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 53:
                    if (pVar.u(i8, i4, bVar2)) {
                        long D = D(j, bVar2);
                        f14 = l.f(i8);
                        h3 = l.h(D);
                        i6 += h3 + f14;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 54:
                    if (pVar.u(i8, i4, bVar2)) {
                        long D2 = D(j, bVar2);
                        f14 = l.f(i8);
                        h3 = l.h(D2);
                        i6 += h3 + f14;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case SODA_DE_DE_VALUE:
                    if (pVar.u(i8, i4, bVar2)) {
                        int C = C(j, bVar2);
                        f15 = l.f(i8);
                        h4 = l.h(C);
                        a = h4 + f15;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 56:
                    if (pVar.u(i8, i4, bVar2)) {
                        f12 = l.f(i8);
                        a = f12 + 8;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case SODA_ES_ES_VALUE:
                    if (pVar.u(i8, i4, bVar2)) {
                        f13 = l.f(i8);
                        a = f13 + 4;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 58:
                    if (pVar.u(i8, i4, bVar2)) {
                        a = l.f(i8) + 1;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 59:
                    if (pVar.u(i8, i4, bVar2)) {
                        Object object4 = unsafe.getObject(bVar2, j);
                        i6 = (object4 instanceof ByteString ? l.b(i8, (ByteString) object4) : l.e((String) object4) + l.f(i8)) + i6;
                    }
                    i4 += 3;
                    bVar2 = bVar;
                case 60:
                    if (pVar.u(i8, i4, bVar2)) {
                        Object object5 = unsafe.getObject(bVar2, j);
                        som0 p6 = pVar.p(i4);
                        Class cls22 = r.a;
                        if (object5 instanceof u3y) {
                            a = ((u3y) object5).a(i8);
                            i6 += a;
                            i4 += 3;
                            bVar2 = bVar;
                        } else {
                            f6 = l.f(i8);
                            serializedSize = ((b) object5).getSerializedSize(p6);
                            g = l.g(serializedSize);
                            a = g + serializedSize + f6;
                            i6 += a;
                            i4 += 3;
                            bVar2 = bVar;
                        }
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 61:
                    if (pVar.u(i8, i4, bVar2)) {
                        a = l.b(i8, (ByteString) unsafe.getObject(bVar2, j));
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 62:
                    if (pVar.u(i8, i4, bVar2)) {
                        int C2 = C(j, bVar2);
                        f15 = l.f(i8);
                        h4 = l.g(C2);
                        a = h4 + f15;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (pVar.u(i8, i4, bVar2)) {
                        int C3 = C(j, bVar2);
                        f15 = l.f(i8);
                        h4 = l.h(C3);
                        a = h4 + f15;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 64:
                    if (pVar.u(i8, i4, bVar2)) {
                        f13 = l.f(i8);
                        a = f13 + 4;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 65:
                    if (pVar.u(i8, i4, bVar2)) {
                        f12 = l.f(i8);
                        a = f12 + 8;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 66:
                    if (pVar.u(i8, i4, bVar2)) {
                        int C4 = C(j, bVar2);
                        f15 = l.f(i8);
                        h4 = l.c(C4);
                        a = h4 + f15;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case 67:
                    if (pVar.u(i8, i4, bVar2)) {
                        long D3 = D(j, bVar2);
                        f14 = l.f(i8);
                        h3 = l.d(D3);
                        i6 += h3 + f14;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (pVar.u(i8, i4, bVar2)) {
                        wt10 wt10Var2 = (wt10) unsafe.getObject(bVar2, j);
                        som0 p7 = pVar.p(i4);
                        Class cls23 = r.a;
                        f7 = l.f(i8) * 2;
                        serializedSize2 = ((b) wt10Var2).getSerializedSize(p7);
                        a = serializedSize2 + f7;
                        i6 += a;
                        i4 += 3;
                        bVar2 = bVar;
                    } else {
                        i4 += 3;
                        bVar2 = bVar;
                    }
                default:
                    i4 += 3;
                    bVar2 = bVar;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x06c7 A[Catch: all -> 0x06ce, TryCatch #17 {all -> 0x06ce, blocks: (B:41:0x06c2, B:43:0x06c7, B:45:0x06d0), top: B:40:0x06c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x06d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x06f7 A[LOOP:3: B:57:0x06f5->B:58:0x06f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0701  */
    @Override // defpackage.som0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Object obj, i iVar, pyo pyoVar) {
        p pVar;
        int[] iArr;
        Object obj2;
        pyo pyoVar2;
        i iVar2;
        yxq yxqVar;
        int R;
        hry hryVar;
        p pVar2 = this;
        Object obj3 = obj;
        pyo pyoVar3 = pyoVar;
        pyoVar3.getClass();
        l(obj3);
        s sVar = pVar2.m;
        int[] iArr2 = pVar2.h;
        int i = pVar2.j;
        int i2 = pVar2.i;
        Object obj4 = null;
        yxq yxqVar2 = null;
        while (true) {
            try {
                int b = iVar.b();
                try {
                    int O = (b < pVar2.c || b > pVar2.d) ? -1 : pVar2.O(b, 0);
                    if (O >= 0) {
                        pyo pyoVar4 = pyoVar3;
                        Object obj5 = obj4;
                        try {
                            int S = pVar2.S(O);
                            try {
                                R = R(S);
                                hryVar = pVar2.l;
                            } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                iVar2 = iVar;
                                obj2 = obj5;
                                yxqVar = yxqVar2;
                                iArr = iArr2;
                                pVar = pVar2;
                            }
                            switch (R) {
                                case 0:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    iVar2 = iVar;
                                    pVar = pVar2;
                                    try {
                                        try {
                                            z321.c.o(obj, B(S), iVar2.l());
                                            obj3 = obj;
                                            pVar.M(O, obj3);
                                            obj4 = obj2;
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                            obj3 = obj;
                                            obj4 = obj2;
                                            try {
                                                sVar.getClass();
                                                if (obj4 == null) {
                                                }
                                                if (!sVar.b(obj4, iVar2, 0)) {
                                                }
                                                pVar2 = pVar;
                                                iArr2 = iArr;
                                                yxqVar2 = yxqVar;
                                                pyoVar3 = pyoVar;
                                            } catch (Throwable th) {
                                                th = th;
                                                while (i2 < i) {
                                                }
                                                if (obj4 != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj3 = obj;
                                            obj4 = obj2;
                                            while (i2 < i) {
                                            }
                                            if (obj4 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                        obj3 = obj;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        obj3 = obj;
                                    }
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                    break;
                                case 1:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.c.p(obj3, B(S), iVar.t());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 2:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.o(obj3, B(S), iVar.z());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 3:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.o(obj3, B(S), iVar.S());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 4:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.n(B(S), obj3, iVar.x());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 5:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.o(obj3, B(S), iVar.r());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 6:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.n(B(S), obj3, iVar.p());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 7:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.c.m(obj3, B(S), iVar.h());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 8:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    pVar.J(obj3, S, iVar);
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 9:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    Object obj6 = (wt10) pVar.y(O, obj3);
                                    iVar.f(obj6, pVar.p(O), pyoVar4);
                                    pVar.P(O, obj3, obj6);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 10:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.p(B(S), obj3, iVar.j());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 11:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.n(B(S), obj3, iVar.Q());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 12:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    int n = iVar.n();
                                    hqw n2 = pVar.n(O);
                                    if (n2 != null && !n2.isInRange(n)) {
                                        obj4 = r.n(obj3, b, n, obj2, sVar);
                                        pVar2 = pVar;
                                        iArr2 = iArr;
                                        yxqVar2 = yxqVar;
                                        pyoVar3 = pyoVar;
                                    }
                                    z321.n(B(S), obj3, n);
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                    break;
                                case 13:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.n(B(S), obj3, iVar.D());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 14:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.o(obj3, B(S), iVar.F());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 15:
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    z321.n(B(S), obj3, iVar.H());
                                    pVar.M(O, obj3);
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 16:
                                    obj2 = obj5;
                                    iVar2 = iVar;
                                    pVar = pVar2;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    try {
                                        z321.o(obj3, B(S), iVar2.J());
                                        pVar.M(O, obj3);
                                        obj4 = obj2;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                        obj4 = obj2;
                                        sVar.getClass();
                                        if (obj4 == null) {
                                        }
                                        if (!sVar.b(obj4, iVar2, 0)) {
                                        }
                                        pVar2 = pVar;
                                        iArr2 = iArr;
                                        yxqVar2 = yxqVar;
                                        pyoVar3 = pyoVar;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj4 = obj2;
                                        while (i2 < i) {
                                        }
                                        if (obj4 != null) {
                                        }
                                        throw th;
                                    }
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                    break;
                                case 17:
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    Object obj7 = (wt10) pVar.y(O, obj3);
                                    iVar.d(obj7, pVar.p(O), pyoVar4);
                                    pVar.P(O, obj3, obj7);
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 18:
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    long B = B(S);
                                    hryVar.getClass();
                                    iVar.m(hry.a(B, obj3));
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 19:
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    long B2 = B(S);
                                    hryVar.getClass();
                                    iVar.u(hry.a(B2, obj3));
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 20:
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    long B3 = B(S);
                                    hryVar.getClass();
                                    iVar.A(hry.a(B3, obj3));
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 21:
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    long B4 = B(S);
                                    hryVar.getClass();
                                    iVar.T(hry.a(B4, obj3));
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 22:
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    long B5 = B(S);
                                    hryVar.getClass();
                                    iVar.y(hry.a(B5, obj3));
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 23:
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    long B6 = B(S);
                                    hryVar.getClass();
                                    iVar.s(hry.a(B6, obj3));
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 24:
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    long B7 = B(S);
                                    hryVar.getClass();
                                    iVar.q(hry.a(B7, obj3));
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 25:
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    long B8 = B(S);
                                    hryVar.getClass();
                                    iVar.i(hry.a(B8, obj3));
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 26:
                                    iVar2 = iVar;
                                    obj2 = obj5;
                                    pVar = pVar2;
                                    try {
                                        pVar.K(obj3, S, iVar2);
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                        obj4 = obj2;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused5) {
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                        obj4 = obj2;
                                        sVar.getClass();
                                        if (obj4 == null) {
                                        }
                                        if (!sVar.b(obj4, iVar2, 0)) {
                                        }
                                        pVar2 = pVar;
                                        iArr2 = iArr;
                                        yxqVar2 = yxqVar;
                                        pyoVar3 = pyoVar;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        iArr = iArr2;
                                        obj4 = obj2;
                                        while (i2 < i) {
                                        }
                                        if (obj4 != null) {
                                        }
                                        throw th;
                                    }
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                    break;
                                case 27:
                                    obj2 = obj5;
                                    try {
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused6) {
                                        iVar2 = iVar;
                                        pVar = pVar2;
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                        obj4 = obj2;
                                        sVar.getClass();
                                        if (obj4 == null) {
                                        }
                                        if (!sVar.b(obj4, iVar2, 0)) {
                                        }
                                        pVar2 = pVar;
                                        iArr2 = iArr;
                                        yxqVar2 = yxqVar;
                                        pyoVar3 = pyoVar;
                                    }
                                    try {
                                        pVar2.I(obj3, S, iVar, pVar2.p(O), pyoVar);
                                        pVar = pVar2;
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                        obj4 = obj2;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused7) {
                                        iVar2 = iVar;
                                        pVar = pVar2;
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                        obj4 = obj2;
                                        sVar.getClass();
                                        if (obj4 == null) {
                                        }
                                        if (!sVar.b(obj4, iVar2, 0)) {
                                        }
                                        pVar2 = pVar;
                                        iArr2 = iArr;
                                        yxqVar2 = yxqVar;
                                        pyoVar3 = pyoVar;
                                    }
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                    break;
                                case 28:
                                    obj2 = obj5;
                                    long B9 = B(S);
                                    hryVar.getClass();
                                    iVar.k(hry.a(B9, obj3));
                                    pVar = pVar2;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 29:
                                    obj2 = obj5;
                                    try {
                                        try {
                                            long B10 = B(S);
                                            hryVar.getClass();
                                            iVar.R(hry.a(B10, obj3));
                                            pVar = pVar2;
                                            yxqVar = yxqVar2;
                                            iArr = iArr2;
                                            obj4 = obj2;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            pVar = pVar2;
                                            iArr = iArr2;
                                            obj4 = obj2;
                                            while (i2 < i) {
                                            }
                                            if (obj4 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused8) {
                                        iVar2 = iVar;
                                        pVar = pVar2;
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                        obj4 = obj2;
                                        sVar.getClass();
                                        if (obj4 == null) {
                                        }
                                        if (!sVar.b(obj4, iVar2, 0)) {
                                        }
                                        pVar2 = pVar;
                                        iArr2 = iArr;
                                        yxqVar2 = yxqVar;
                                        pyoVar3 = pyoVar;
                                    }
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                    break;
                                case 30:
                                    try {
                                        long B11 = B(S);
                                        hryVar.getClass();
                                        oqw a = hry.a(B11, obj3);
                                        iVar.o(a);
                                        obj4 = r.j(obj3, b, a, pVar2.n(O), obj5, sVar);
                                        pVar = pVar2;
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused9) {
                                        obj2 = obj5;
                                        iVar2 = iVar;
                                        pVar = pVar2;
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                        obj4 = obj2;
                                        sVar.getClass();
                                        if (obj4 == null) {
                                        }
                                        if (!sVar.b(obj4, iVar2, 0)) {
                                        }
                                        pVar2 = pVar;
                                        iArr2 = iArr;
                                        yxqVar2 = yxqVar;
                                        pyoVar3 = pyoVar;
                                    } catch (Throwable th7) {
                                        th = th7;
                                        obj2 = obj5;
                                        pVar = pVar2;
                                        iArr = iArr2;
                                        obj4 = obj2;
                                        while (i2 < i) {
                                        }
                                        if (obj4 != null) {
                                        }
                                        throw th;
                                    }
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                    break;
                                case 31:
                                    long B12 = B(S);
                                    hryVar.getClass();
                                    iVar.E(hry.a(B12, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 32:
                                    long B13 = B(S);
                                    hryVar.getClass();
                                    iVar.G(hry.a(B13, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 33:
                                    long B14 = B(S);
                                    hryVar.getClass();
                                    iVar.I(hry.a(B14, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 34:
                                    long B15 = B(S);
                                    hryVar.getClass();
                                    iVar.K(hry.a(B15, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 35:
                                    long B16 = B(S);
                                    hryVar.getClass();
                                    iVar.m(hry.a(B16, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 36:
                                    long B17 = B(S);
                                    hryVar.getClass();
                                    iVar.u(hry.a(B17, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 37:
                                    long B18 = B(S);
                                    hryVar.getClass();
                                    iVar.A(hry.a(B18, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 38:
                                    long B19 = B(S);
                                    hryVar.getClass();
                                    iVar.T(hry.a(B19, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 39:
                                    long B20 = B(S);
                                    hryVar.getClass();
                                    iVar.y(hry.a(B20, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 40:
                                    long B21 = B(S);
                                    hryVar.getClass();
                                    iVar.s(hry.a(B21, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 41:
                                    long B22 = B(S);
                                    hryVar.getClass();
                                    iVar.q(hry.a(B22, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 42:
                                    long B23 = B(S);
                                    hryVar.getClass();
                                    iVar.i(hry.a(B23, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 43:
                                    long B24 = B(S);
                                    hryVar.getClass();
                                    iVar.R(hry.a(B24, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 44:
                                    long B25 = B(S);
                                    hryVar.getClass();
                                    oqw a2 = hry.a(B25, obj3);
                                    iVar.o(a2);
                                    obj4 = r.j(obj3, b, a2, pVar2.n(O), obj5, sVar);
                                    pVar = pVar2;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 45:
                                    long B26 = B(S);
                                    hryVar.getClass();
                                    iVar.E(hry.a(B26, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 46:
                                    long B27 = B(S);
                                    hryVar.getClass();
                                    iVar.G(hry.a(B27, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 47:
                                    long B28 = B(S);
                                    hryVar.getClass();
                                    iVar.I(hry.a(B28, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 48:
                                    long B29 = B(S);
                                    hryVar.getClass();
                                    iVar.K(hry.a(B29, obj3));
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 49:
                                    long B30 = B(S);
                                    som0 p2 = pVar2.p(O);
                                    hryVar.getClass();
                                    iVar.w(hry.a(B30, obj3), p2, pyoVar4);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 50:
                                    pVar2.v(O, obj3, pVar2.o(O));
                                    throw null;
                                    break;
                                case SAFETY_TIPS_VALUE:
                                    z321.p(B(S), obj3, Double.valueOf(iVar.l()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 52:
                                    z321.p(B(S), obj3, Float.valueOf(iVar.t()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 53:
                                    z321.p(B(S), obj3, Long.valueOf(iVar.z()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 54:
                                    z321.p(B(S), obj3, Long.valueOf(iVar.S()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case SODA_DE_DE_VALUE:
                                    z321.p(B(S), obj3, Integer.valueOf(iVar.x()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 56:
                                    z321.p(B(S), obj3, Long.valueOf(iVar.r()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case SODA_ES_ES_VALUE:
                                    z321.p(B(S), obj3, Integer.valueOf(iVar.p()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 58:
                                    z321.p(B(S), obj3, Boolean.valueOf(iVar.h()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 59:
                                    pVar2.J(obj3, S, iVar);
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 60:
                                    Object obj8 = (wt10) pVar2.z(b, O, obj3);
                                    iVar.f(obj8, pVar2.p(O), pyoVar4);
                                    pVar2.Q(b, obj3, obj8, O);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 61:
                                    z321.p(B(S), obj3, iVar.j());
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 62:
                                    z321.p(B(S), obj3, Integer.valueOf(iVar.Q()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                                    int n3 = iVar.n();
                                    hqw n4 = pVar2.n(O);
                                    if (n4 != null && !n4.isInRange(n3)) {
                                        obj4 = r.n(obj3, b, n3, obj5, sVar);
                                        pVar = pVar2;
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                        pVar2 = pVar;
                                        iArr2 = iArr;
                                        yxqVar2 = yxqVar;
                                        pyoVar3 = pyoVar;
                                    }
                                    z321.p(B(S), obj3, Integer.valueOf(n3));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                    break;
                                case 64:
                                    z321.p(B(S), obj3, Integer.valueOf(iVar.D()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 65:
                                    z321.p(B(S), obj3, Long.valueOf(iVar.F()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 66:
                                    z321.p(B(S), obj3, Integer.valueOf(iVar.H()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case 67:
                                    z321.p(B(S), obj3, Long.valueOf(iVar.J()));
                                    pVar2.N(b, O, obj3);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                case TRANSLATE_KIT_VALUE:
                                    Object obj9 = (wt10) pVar2.z(b, O, obj3);
                                    iVar.d(obj9, pVar2.p(O), pyoVar4);
                                    pVar2.Q(b, obj3, obj9, O);
                                    obj2 = obj5;
                                    yxqVar = yxqVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    obj4 = obj2;
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                                default:
                                    if (obj5 == null) {
                                        try {
                                            obj4 = sVar.a(obj3);
                                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused10) {
                                            iVar2 = iVar;
                                            obj4 = obj5;
                                            yxqVar = yxqVar2;
                                            iArr = iArr2;
                                            pVar = pVar2;
                                            sVar.getClass();
                                            if (obj4 == null) {
                                            }
                                            if (!sVar.b(obj4, iVar2, 0)) {
                                            }
                                            pVar2 = pVar;
                                            iArr2 = iArr;
                                            yxqVar2 = yxqVar;
                                            pyoVar3 = pyoVar;
                                        }
                                    } else {
                                        obj4 = obj5;
                                    }
                                    try {
                                        if (!sVar.b(obj4, iVar, 0)) {
                                            while (i2 < i) {
                                                pVar2.m(iArr2[i2], obj3, obj4);
                                                i2++;
                                            }
                                            if (obj4 == null) {
                                                return;
                                            }
                                        }
                                        pVar = pVar2;
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused11) {
                                        iVar2 = iVar;
                                        pVar = pVar2;
                                        yxqVar = yxqVar2;
                                        iArr = iArr2;
                                        sVar.getClass();
                                        if (obj4 == null) {
                                            obj4 = sVar.a(obj3);
                                        }
                                        if (!sVar.b(obj4, iVar2, 0)) {
                                            while (i2 < i) {
                                                pVar.m(iArr[i2], obj3, obj4);
                                                i2++;
                                            }
                                            if (obj4 == null) {
                                                return;
                                            }
                                            sVar.c(obj3, obj4);
                                            return;
                                        }
                                        pVar2 = pVar;
                                        iArr2 = iArr;
                                        yxqVar2 = yxqVar;
                                        pyoVar3 = pyoVar;
                                    }
                                    pVar2 = pVar;
                                    iArr2 = iArr;
                                    yxqVar2 = yxqVar;
                                    pyoVar3 = pyoVar;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            obj2 = obj5;
                            iArr = iArr2;
                            pVar = pVar2;
                        }
                    } else if (b == Integer.MAX_VALUE) {
                        while (i2 < i) {
                            pVar2.m(iArr2[i2], obj3, obj4);
                            i2++;
                        }
                        if (obj4 == null) {
                            return;
                        }
                    } else {
                        try {
                            boolean z = pVar2.f;
                            syo syoVar = pVar2.n;
                            rxs a3 = !z ? null : syoVar.a(pyoVar3, pVar2.e, b);
                            if (a3 != null) {
                                if (yxqVar2 == null) {
                                    try {
                                        yxqVar2 = syoVar.b(obj3);
                                    } catch (Throwable th9) {
                                        th = th9;
                                        pVar = pVar2;
                                        iArr = iArr2;
                                        while (i2 < i) {
                                            pVar.m(iArr[i2], obj3, obj4);
                                            i2++;
                                        }
                                        if (obj4 != null) {
                                            sVar.c(obj3, obj4);
                                        }
                                        throw th;
                                    }
                                }
                                yxq yxqVar3 = yxqVar2;
                                s sVar2 = sVar;
                                Object obj10 = obj3;
                                try {
                                    obj4 = syoVar.c(obj10, iVar, a3, pyoVar3, yxqVar3, obj4, sVar2);
                                    yxqVar2 = yxqVar3;
                                    sVar = sVar2;
                                    obj3 = obj10;
                                    pyoVar2 = pyoVar3;
                                } catch (Throwable th10) {
                                    th = th10;
                                    obj3 = obj10;
                                    sVar = sVar2;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    while (i2 < i) {
                                    }
                                    if (obj4 != null) {
                                    }
                                    throw th;
                                }
                            } else {
                                pyoVar2 = pyoVar3;
                                Object obj11 = obj4;
                                try {
                                    sVar.getClass();
                                    obj4 = obj11 == null ? sVar.a(obj3) : obj11;
                                    if (!sVar.b(obj4, iVar, 0)) {
                                        while (i2 < i) {
                                            pVar2.m(iArr2[i2], obj3, obj4);
                                            i2++;
                                        }
                                        if (obj4 == null) {
                                            return;
                                        }
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    obj4 = obj11;
                                    iArr = iArr2;
                                    pVar = pVar2;
                                    while (i2 < i) {
                                    }
                                    if (obj4 != null) {
                                    }
                                    throw th;
                                }
                            }
                            pyoVar3 = pyoVar2;
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    }
                } catch (Throwable th13) {
                    th = th13;
                    pVar = pVar2;
                    obj2 = obj4;
                }
            } catch (Throwable th14) {
                th = th14;
                pVar = pVar2;
            }
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
    @Override // defpackage.som0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(GeneratedMessageLite generatedMessageLite) {
        int i;
        int b;
        int i2;
        int[] iArr = this.a;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int S = S(i4);
            int i5 = iArr[i4];
            long j = 1048575 & S;
            int i6 = 1237;
            int i7 = 37;
            switch (R(S)) {
                case 0:
                    i = i3 * 53;
                    b = rqw.b(Double.doubleToLongBits(z321.c.g(j, generatedMessageLite)));
                    i3 = b + i;
                    break;
                case 1:
                    i = i3 * 53;
                    b = Float.floatToIntBits(z321.c.h(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 2:
                    i = i3 * 53;
                    b = rqw.b(z321.c.j(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 3:
                    i = i3 * 53;
                    b = rqw.b(z321.c.j(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 4:
                    i = i3 * 53;
                    b = z321.c.i(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 5:
                    i = i3 * 53;
                    b = rqw.b(z321.c.j(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 6:
                    i = i3 * 53;
                    b = z321.c.i(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 7:
                    i2 = i3 * 53;
                    boolean d = z321.c.d(j, generatedMessageLite);
                    Charset charset = rqw.a;
                    break;
                case 8:
                    i = i3 * 53;
                    b = ((String) z321.c.k(j, generatedMessageLite)).hashCode();
                    i3 = b + i;
                    break;
                case 9:
                    Object k = z321.c.k(j, generatedMessageLite);
                    if (k != null) {
                        i7 = k.hashCode();
                    }
                    i3 = (i3 * 53) + i7;
                    break;
                case 10:
                    i = i3 * 53;
                    b = z321.c.k(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 11:
                    i = i3 * 53;
                    b = z321.c.i(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 12:
                    i = i3 * 53;
                    b = z321.c.i(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 13:
                    i = i3 * 53;
                    b = z321.c.i(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 14:
                    i = i3 * 53;
                    b = rqw.b(z321.c.j(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 15:
                    i = i3 * 53;
                    b = z321.c.i(j, generatedMessageLite);
                    i3 = b + i;
                    break;
                case 16:
                    i = i3 * 53;
                    b = rqw.b(z321.c.j(j, generatedMessageLite));
                    i3 = b + i;
                    break;
                case 17:
                    Object k2 = z321.c.k(j, generatedMessageLite);
                    if (k2 != null) {
                        i7 = k2.hashCode();
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
                    b = z321.c.k(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case 50:
                    i = i3 * 53;
                    b = z321.c.k(j, generatedMessageLite).hashCode();
                    i3 = b + i;
                    break;
                case SAFETY_TIPS_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = rqw.b(Double.doubleToLongBits(((Double) z321.c.k(j, generatedMessageLite)).doubleValue()));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = Float.floatToIntBits(((Float) z321.c.k(j, generatedMessageLite)).floatValue());
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = rqw.b(D(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = rqw.b(D(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case SODA_DE_DE_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = C(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = rqw.b(D(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case SODA_ES_ES_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = C(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (u(i5, i4, generatedMessageLite)) {
                        i2 = i3 * 53;
                        boolean booleanValue = ((Boolean) z321.c.k(j, generatedMessageLite)).booleanValue();
                        Charset charset2 = rqw.a;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = ((String) z321.c.k(j, generatedMessageLite)).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z321.c.k(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z321.c.k(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = C(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = C(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = C(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = rqw.b(D(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = C(j, generatedMessageLite);
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = rqw.b(D(j, generatedMessageLite));
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
                case TRANSLATE_KIT_VALUE:
                    if (u(i5, i4, generatedMessageLite)) {
                        i = i3 * 53;
                        b = z321.c.k(j, generatedMessageLite).hashCode();
                        i3 = b + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        ((u) this.m).getClass();
        int hashCode = generatedMessageLite.unknownFields.hashCode() + (i3 * 53);
        if (!this.f) {
            return hashCode;
        }
        ((m) this.n).getClass();
        return ((GeneratedMessageLite.a) generatedMessageLite).a.hashCode() + (hashCode * 53);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (com.google.protobuf.r.m(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c8, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dc, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0108, code lost:
    
        if (com.google.protobuf.r.m(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0120, code lost:
    
        if (com.google.protobuf.r.m(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0138, code lost:
    
        if (com.google.protobuf.r.m(r5.k(r7, r12), r5.k(r7, r13)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014c, code lost:
    
        if (r5.d(r7, r12) == r5.d(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0160, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0176, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        if (r5.i(r7, r12) == r5.i(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        if (r5.j(r7, r12) == r5.j(r7, r13)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01cf, code lost:
    
        if (java.lang.Float.floatToIntBits(r5.h(r7, r12)) == java.lang.Float.floatToIntBits(r5.h(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ec, code lost:
    
        if (java.lang.Double.doubleToLongBits(r5.g(r7, r12)) == java.lang.Double.doubleToLongBits(r5.g(r7, r13))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (com.google.protobuf.r.m(r9.k(r7, r12), r9.k(r7, r13)) != false) goto L105;
     */
    @Override // defpackage.som0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int S = S(i);
                long j = S & 1048575;
                switch (R(S)) {
                    case 0:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var2 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var3 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var4 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var5 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var6 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var7 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var8 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var9 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var10 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var11 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var12 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var13 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var14 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var15 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var16 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var17 = z321.c;
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (k(generatedMessageLite, generatedMessageLite2, i)) {
                            w321 w321Var18 = z321.c;
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
                        w321 w321Var19 = z321.c;
                        z = r.m(w321Var19.k(j, generatedMessageLite), w321Var19.k(j, generatedMessageLite2));
                        break;
                    case 50:
                        w321 w321Var20 = z321.c;
                        z = r.m(w321Var20.k(j, generatedMessageLite), w321Var20.k(j, generatedMessageLite2));
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
                        w321 w321Var21 = z321.c;
                        if (w321Var21.i(j2, generatedMessageLite) == w321Var21.i(j2, generatedMessageLite2)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (z) {
                    i += 3;
                }
            } else {
                u uVar = (u) this.m;
                uVar.getClass();
                t tVar = generatedMessageLite.unknownFields;
                uVar.getClass();
                if (tVar.equals(generatedMessageLite2.unknownFields)) {
                    if (!this.f) {
                        return true;
                    }
                    m mVar = (m) this.n;
                    mVar.getClass();
                    yxq yxqVar = ((GeneratedMessageLite.a) generatedMessageLite).a;
                    mVar.getClass();
                    return yxqVar.equals(((GeneratedMessageLite.a) generatedMessageLite2).a);
                }
            }
        }
        return false;
    }

    @Override // defpackage.som0
    public final void i(Object obj, byte[] bArr, int i, int i2, v43 v43Var) {
        F(obj, bArr, i, i2, 0, v43Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ce  */
    @Override // defpackage.som0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(Object obj, gp50 gp50Var) {
        Iterator it;
        Map.Entry entry;
        int length;
        syo syoVar;
        l lVar = (l) gp50Var.b;
        if (Writer$FieldOrder.ASCENDING != Writer$FieldOrder.DESCENDING) {
            T(obj, gp50Var);
            return;
        }
        ((u) this.m).getClass();
        ((GeneratedMessageLite) obj).unknownFields.g(gp50Var);
        boolean z = this.f;
        syo syoVar2 = this.n;
        if (z) {
            ((m) syoVar2).getClass();
            yxq yxqVar = ((GeneratedMessageLite.a) obj).a;
            if (!yxqVar.j()) {
                it = yxqVar.e();
                entry = (Map.Entry) it.next();
                int[] iArr = this.a;
                length = iArr.length - 3;
                while (length >= 0) {
                    int S = S(length);
                    int i = iArr[length];
                    while (entry != null) {
                        ((m) syoVar2).getClass();
                        if (((qxs) entry.getKey()).c() > i) {
                            syoVar2.d(gp50Var, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        } else {
                            switch (R(S)) {
                                case 0:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        double g = z321.c.g(S & 1048575, obj);
                                        lVar.getClass();
                                        lVar.o(i, Double.doubleToRawLongBits(g));
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 1:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        float h = z321.c.h(S & 1048575, obj);
                                        lVar.getClass();
                                        lVar.m(i, Float.floatToRawIntBits(h));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 2:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        gp50Var.T(i, z321.c.j(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 3:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        lVar.y(i, z321.c.j(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 4:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        gp50Var.S(i, z321.c.i(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 5:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        gp50Var.Q(i, z321.c.j(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 6:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        gp50Var.P(i, z321.c.i(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 7:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        lVar.k(i, z321.c.d(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 8:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        U(i, z321.c.k(S & 1048575, obj), gp50Var);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 9:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        gp50Var.U(i, z321.c.k(S & 1048575, obj), p(length));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 10:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        gp50Var.O(i, (ByteString) z321.c.k(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 11:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        lVar.w(i, z321.c.i(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 12:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        lVar.q(i, z321.c.i(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 13:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        lVar.m(i, z321.c.i(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 14:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        lVar.o(i, z321.c.j(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 15:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        int i2 = z321.c.i(S & 1048575, obj);
                                        lVar.w(i, (i2 >> 31) ^ (i2 << 1));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 16:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        long j = z321.c.j(S & 1048575, obj);
                                        lVar.y(i, (j >> 63) ^ (j << 1));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 17:
                                    syoVar = syoVar2;
                                    if (r(length, obj)) {
                                        gp50Var.R(i, z321.c.k(S & 1048575, obj), p(length));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 18:
                                    syoVar = syoVar2;
                                    r.q(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 19:
                                    syoVar = syoVar2;
                                    r.u(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 20:
                                    syoVar = syoVar2;
                                    r.x(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 21:
                                    syoVar = syoVar2;
                                    r.F(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 22:
                                    syoVar = syoVar2;
                                    r.w(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 23:
                                    syoVar = syoVar2;
                                    r.t(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 24:
                                    syoVar = syoVar2;
                                    r.s(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 25:
                                    syoVar = syoVar2;
                                    r.o(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 26:
                                    syoVar = syoVar2;
                                    r.D(i, (List) z321.c.k(S & 1048575, obj), gp50Var);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 27:
                                    syoVar = syoVar2;
                                    r.y(i, (List) z321.c.k(S & 1048575, obj), gp50Var, p(length));
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 28:
                                    syoVar = syoVar2;
                                    r.p(i, (List) z321.c.k(S & 1048575, obj), gp50Var);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 29:
                                    syoVar = syoVar2;
                                    r.E(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 30:
                                    syoVar = syoVar2;
                                    r.r(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 31:
                                    syoVar = syoVar2;
                                    r.z(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 32:
                                    syoVar = syoVar2;
                                    r.A(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 33:
                                    syoVar = syoVar2;
                                    r.B(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 34:
                                    syoVar = syoVar2;
                                    r.C(i, (List) z321.c.k(S & 1048575, obj), gp50Var, false);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 35:
                                    syoVar = syoVar2;
                                    r.q(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 36:
                                    syoVar = syoVar2;
                                    r.u(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 37:
                                    syoVar = syoVar2;
                                    r.x(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 38:
                                    syoVar = syoVar2;
                                    r.F(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 39:
                                    syoVar = syoVar2;
                                    r.w(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 40:
                                    syoVar = syoVar2;
                                    r.t(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 41:
                                    syoVar = syoVar2;
                                    r.s(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 42:
                                    syoVar = syoVar2;
                                    r.o(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 43:
                                    syoVar = syoVar2;
                                    r.E(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 44:
                                    syoVar = syoVar2;
                                    r.r(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 45:
                                    syoVar = syoVar2;
                                    r.z(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 46:
                                    syoVar = syoVar2;
                                    r.A(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 47:
                                    syoVar = syoVar2;
                                    r.B(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 48:
                                    syoVar = syoVar2;
                                    r.C(i, (List) z321.c.k(S & 1048575, obj), gp50Var, true);
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 49:
                                    syoVar = syoVar2;
                                    r.v(i, (List) z321.c.k(S & 1048575, obj), gp50Var, p(length));
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 50:
                                    syoVar = syoVar2;
                                    if (z321.c.k(S & 1048575, obj) != null) {
                                        Object o = o(length);
                                        this.o.getClass();
                                        b64.D(o);
                                        throw null;
                                    }
                                    continue;
                                    continue;
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case SAFETY_TIPS_VALUE:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        double doubleValue = ((Double) z321.c.k(S & 1048575, obj)).doubleValue();
                                        lVar.getClass();
                                        lVar.o(i, Double.doubleToRawLongBits(doubleValue));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 52:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        float floatValue = ((Float) z321.c.k(S & 1048575, obj)).floatValue();
                                        lVar.getClass();
                                        lVar.m(i, Float.floatToRawIntBits(floatValue));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 53:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        gp50Var.T(i, D(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 54:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        lVar.y(i, D(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case SODA_DE_DE_VALUE:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        gp50Var.S(i, C(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 56:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        gp50Var.Q(i, D(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case SODA_ES_ES_VALUE:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        gp50Var.P(i, C(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 58:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        lVar.k(i, ((Boolean) z321.c.k(S & 1048575, obj)).booleanValue());
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 59:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        U(i, z321.c.k(S & 1048575, obj), gp50Var);
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 60:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        gp50Var.U(i, z321.c.k(S & 1048575, obj), p(length));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 61:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        gp50Var.O(i, (ByteString) z321.c.k(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 62:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        lVar.w(i, C(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case THIRD_PARTY_COOKIE_DEPRECATION_METADATA_VALUE:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        lVar.q(i, C(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 64:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        lVar.m(i, C(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 65:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        lVar.o(i, D(S & 1048575, obj));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 66:
                                    syoVar = syoVar2;
                                    if (u(i, length, obj)) {
                                        int C = C(S & 1048575, obj);
                                        lVar.w(i, (C >> 31) ^ (C << 1));
                                    } else {
                                        continue;
                                        continue;
                                    }
                                    length -= 3;
                                    syoVar2 = syoVar;
                                case 67:
                                    if (u(i, length, obj)) {
                                        syoVar = syoVar2;
                                        long D = D(S & 1048575, obj);
                                        lVar.y(i, (D >> 63) ^ (D << 1));
                                        length -= 3;
                                        syoVar2 = syoVar;
                                    }
                                    break;
                                case TRANSLATE_KIT_VALUE:
                                    if (u(i, length, obj)) {
                                        gp50Var.R(i, z321.c.k(S & 1048575, obj), p(length));
                                        break;
                                    }
                                    break;
                            }
                            syoVar = syoVar2;
                            length -= 3;
                            syoVar2 = syoVar;
                        }
                    }
                    switch (R(S)) {
                    }
                    syoVar = syoVar2;
                    length -= 3;
                    syoVar2 = syoVar;
                }
                syo syoVar3 = syoVar2;
                while (entry != null) {
                    syo syoVar4 = syoVar3;
                    syoVar4.d(gp50Var, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    syoVar3 = syoVar4;
                }
            }
        }
        it = null;
        entry = null;
        int[] iArr2 = this.a;
        length = iArr2.length - 3;
        while (length >= 0) {
        }
        syo syoVar32 = syoVar2;
        while (entry != null) {
        }
    }

    public final boolean k(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2, int i) {
        return r(i, generatedMessageLite) == r(i, generatedMessageLite2);
    }

    public final void m(int i, Object obj, Object obj2) {
        int i2 = this.a[i];
        Object k = z321.c.k(S(i) & 1048575, obj);
        if (k == null || n(i) == null) {
            return;
        }
        this.o.getClass();
        b64.D(o(i));
        throw null;
    }

    public final hqw n(int i) {
        return (hqw) this.b[qv10.b(i, 3, 2, 1)];
    }

    public final Object o(int i) {
        return this.b[(i / 3) * 2];
    }

    public final som0 p(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.b;
        som0 som0Var = (som0) objArr[i2];
        if (som0Var != null) {
            return som0Var;
        }
        som0 a = evf0.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a;
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0110 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int S = S(i);
            long j2 = S & 1048575;
            switch (R(S)) {
                case 0:
                    return Double.doubleToRawLongBits(z321.c.g(j2, obj)) != 0;
                case 1:
                    if (Float.floatToRawIntBits(z321.c.h(j2, obj)) != 0) {
                    }
                    break;
                case 2:
                    if (z321.c.j(j2, obj) != 0) {
                    }
                    break;
                case 3:
                    if (z321.c.j(j2, obj) != 0) {
                    }
                    break;
                case 4:
                    if (z321.c.i(j2, obj) != 0) {
                    }
                    break;
                case 5:
                    if (z321.c.j(j2, obj) != 0) {
                    }
                    break;
                case 6:
                    if (z321.c.i(j2, obj) != 0) {
                    }
                    break;
                case 7:
                    return z321.c.d(j2, obj);
                case 8:
                    Object k = z321.c.k(j2, obj);
                    if (k instanceof String) {
                        return !((String) k).isEmpty();
                    }
                    if (k instanceof ByteString) {
                        return !ByteString.a.equals(k);
                    }
                    w511.q();
                    return false;
                case 9:
                    if (z321.c.k(j2, obj) != null) {
                    }
                    break;
                case 10:
                    return !ByteString.a.equals(z321.c.k(j2, obj));
                case 11:
                    if (z321.c.i(j2, obj) != 0) {
                    }
                    break;
                case 12:
                    if (z321.c.i(j2, obj) != 0) {
                    }
                    break;
                case 13:
                    if (z321.c.i(j2, obj) != 0) {
                    }
                    break;
                case 14:
                    if (z321.c.j(j2, obj) != 0) {
                    }
                    break;
                case 15:
                    if (z321.c.i(j2, obj) != 0) {
                    }
                    break;
                case 16:
                    if (z321.c.j(j2, obj) != 0) {
                    }
                    break;
                case 17:
                    if (z321.c.k(j2, obj) != null) {
                    }
                    break;
                default:
                    w511.q();
                    return false;
            }
        } else if (((1 << (i2 >>> 20)) & z321.c.i(j, obj)) != 0) {
        }
    }

    public final boolean s(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? r(i, obj) : (i3 & i4) != 0;
    }

    public final boolean u(int i, int i2, Object obj) {
        return z321.c.i((long) (this.a[i2 + 2] & 1048575), obj) == i;
    }

    public final void v(int i, Object obj, Object obj2) {
        long S = S(i) & 1048575;
        Object k = z321.c.k(S, obj);
        gi00 gi00Var = this.o;
        if (k != null) {
            gi00Var.getClass();
            if (!((MapFieldLite) k).f()) {
                MapFieldLite i2 = MapFieldLite.b().i();
                gi00.a(i2, k);
                z321.p(S, obj, i2);
                k = i2;
            }
        } else {
            gi00Var.getClass();
            k = MapFieldLite.b().i();
            z321.p(S, obj, k);
        }
        gi00Var.getClass();
        b64.D(obj2);
        throw null;
    }

    public final void w(int i, Object obj, Object obj2) {
        if (r(i, obj2)) {
            long S = S(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, S);
            if (object == null) {
                yci0.h(this.a[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            som0 p2 = p(i);
            if (!r(i, obj)) {
                if (t(object)) {
                    Object d = p2.d();
                    p2.b(d, object);
                    unsafe.putObject(obj, S, d);
                } else {
                    unsafe.putObject(obj, S, object);
                }
                M(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, S);
            if (!t(object2)) {
                Object d2 = p2.d();
                p2.b(d2, object2);
                unsafe.putObject(obj, S, d2);
                object2 = d2;
            }
            p2.b(object2, object);
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (u(i2, i, obj2)) {
            long S = S(i) & 1048575;
            Unsafe unsafe = q;
            Object object = unsafe.getObject(obj2, S);
            if (object == null) {
                yci0.h(iArr[i], " is present but null: ", obj2, "Source subfield ");
                return;
            }
            som0 p2 = p(i);
            if (!u(i2, i, obj)) {
                if (t(object)) {
                    Object d = p2.d();
                    p2.b(d, object);
                    unsafe.putObject(obj, S, d);
                } else {
                    unsafe.putObject(obj, S, object);
                }
                N(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, S);
            if (!t(object2)) {
                Object d2 = p2.d();
                p2.b(d2, object2);
                unsafe.putObject(obj, S, d2);
                object2 = d2;
            }
            p2.b(object2, object);
        }
    }

    public final Object y(int i, Object obj) {
        som0 p2 = p(i);
        long S = S(i) & 1048575;
        if (!r(i, obj)) {
            return p2.d();
        }
        Object object = q.getObject(obj, S);
        if (t(object)) {
            return object;
        }
        Object d = p2.d();
        if (object != null) {
            p2.b(d, object);
        }
        return d;
    }

    public final Object z(int i, int i2, Object obj) {
        som0 p2 = p(i2);
        if (!u(i, i2, obj)) {
            return p2.d();
        }
        Object object = q.getObject(obj, S(i2) & 1048575);
        if (t(object)) {
            return object;
        }
        Object d = p2.d();
        if (object != null) {
            p2.b(d, object);
        }
        return d;
    }
}
