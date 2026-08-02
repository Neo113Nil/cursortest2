package defpackage;

import io.appmetrica.analytics.BuildConfig;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public final class aa31 {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final aa31[] f = a();
    public final int a;
    public final int[] b;
    public final we6[] c;
    public final int d;

    public aa31(int i, int[] iArr, we6... we6VarArr) {
        this.a = i;
        this.b = iArr;
        this.c = we6VarArr;
        we6 we6Var = we6VarArr[0];
        int i2 = we6Var.b;
        int i3 = 0;
        for (i6z0 i6z0Var : (i6z0[]) we6Var.c) {
            i3 += (i6z0Var.c + i2) * i6z0Var.b;
        }
        this.d = i3;
    }

    public static aa31[] a() {
        int i = 1;
        int i2 = 13;
        int i3 = 14;
        int i4 = 16;
        int i5 = 10;
        int i6 = 17;
        aa31 aa31Var = new aa31(1, new int[0], new we6(7, new i6z0[]{new i6z0(i, 19, i2)}, i3), new we6(i5, new i6z0[]{new i6z0(i, i4, i2)}, i3), new we6(i2, new i6z0[]{new i6z0(i, i2, i2)}, i3), new we6(i6, new i6z0[]{new i6z0(i, 9, i2)}, i3));
        int i7 = 28;
        int i8 = 22;
        int i9 = 2;
        aa31 aa31Var2 = new aa31(2, new int[]{6, 18}, new we6(i5, new i6z0[]{new i6z0(i, 34, i2)}, i3), new we6(i4, new i6z0[]{new i6z0(i, i7, i2)}, i3), new we6(i8, new i6z0[]{new i6z0(i, i8, i2)}, i3), new we6(i7, new i6z0[]{new i6z0(i, i4, i2)}, i3));
        int i10 = 26;
        aa31 aa31Var3 = new aa31(3, new int[]{6, 22}, new we6(15, new i6z0[]{new i6z0(i, 55, i2)}, i3), new we6(i10, new i6z0[]{new i6z0(i, 44, i2)}, i3), new we6(18, new i6z0[]{new i6z0(i9, i6, i2)}, i3), new we6(i8, new i6z0[]{new i6z0(i9, i2, i2)}, i3));
        aa31 aa31Var4 = new aa31(4, new int[]{6, 26}, new we6(20, new i6z0[]{new i6z0(i, 80, i2)}, i3), new we6(18, new i6z0[]{new i6z0(i9, 32, i2)}, i3), new we6(i10, new i6z0[]{new i6z0(i9, 24, i2)}, i3), new we6(16, new i6z0[]{new i6z0(4, 9, i2)}, i3));
        int i11 = 2;
        aa31 aa31Var5 = new aa31(5, new int[]{6, 30}, new we6(26, new i6z0[]{new i6z0(i, 108, i2)}, i3), new we6(24, new i6z0[]{new i6z0(i11, 43, i2)}, i3), new we6(18, new i6z0[]{new i6z0(i11, 15, i2), new i6z0(i11, 16, i2)}, i3), new we6(22, new i6z0[]{new i6z0(i11, 11, i2), new i6z0(i11, 12, i2)}, i3));
        int i12 = 4;
        aa31 aa31Var6 = new aa31(6, new int[]{6, 34}, new we6(18, new i6z0[]{new i6z0(i11, 68, i2)}, i3), new we6(16, new i6z0[]{new i6z0(i12, 27, i2)}, i3), new we6(24, new i6z0[]{new i6z0(i12, 19, i2)}, i3), new we6(28, new i6z0[]{new i6z0(i12, 15, i2)}, i3));
        int i13 = 2;
        we6 we6Var = new we6(20, new i6z0[]{new i6z0(i13, 78, i2)}, i3);
        int i14 = 4;
        we6 we6Var2 = new we6(18, new i6z0[]{new i6z0(i14, 31, i2)}, i3);
        i6z0[] i6z0VarArr = {new i6z0(i13, i3, i2), new i6z0(i14, 15, i2)};
        int i15 = 14;
        aa31 aa31Var7 = new aa31(7, new int[]{6, 22, 38}, we6Var, we6Var2, new we6(18, i6z0VarArr, i15), new we6(26, new i6z0[]{new i6z0(i14, i2, i2), new i6z0(1, i15, i2)}, i15));
        int i16 = 2;
        we6 we6Var3 = new we6(24, new i6z0[]{new i6z0(i16, 97, i2)}, i15);
        we6 we6Var4 = new we6(22, new i6z0[]{new i6z0(i16, 38, i2), new i6z0(i16, 39, i2)}, i15);
        i6z0[] i6z0VarArr2 = {new i6z0(4, 18, i2), new i6z0(i16, 19, i2)};
        int i17 = 14;
        int i18 = 26;
        aa31 aa31Var8 = new aa31(8, new int[]{6, 24, 42}, we6Var3, we6Var4, new we6(22, i6z0VarArr2, i17), new we6(i18, new i6z0[]{new i6z0(4, i17, i2), new i6z0(2, 15, i2)}, 14));
        int i19 = 2;
        int i20 = 14;
        we6 we6Var5 = new we6(30, new i6z0[]{new i6z0(i19, BuildConfig.API_LEVEL, i2)}, i20);
        we6 we6Var6 = new we6(22, new i6z0[]{new i6z0(3, 36, i2), new i6z0(i19, 37, i2)}, i20);
        int i21 = 4;
        aa31 aa31Var9 = new aa31(9, new int[]{6, 26, 46}, we6Var5, we6Var6, new we6(20, new i6z0[]{new i6z0(i21, 16, i2), new i6z0(i21, 17, i2)}, 14), new we6(24, new i6z0[]{new i6z0(i21, 12, i2), new i6z0(i21, i2, i2)}, 14));
        int i22 = 2;
        we6 we6Var7 = new we6(18, new i6z0[]{new i6z0(i22, 68, i2), new i6z0(i22, 69, i2)}, 14);
        int i23 = 26;
        int i24 = 24;
        int i25 = 14;
        aa31 aa31Var10 = new aa31(10, new int[]{6, 28, 50}, we6Var7, new we6(i23, new i6z0[]{new i6z0(4, 43, i2), new i6z0(1, 44, i2)}, 14), new we6(i24, new i6z0[]{new i6z0(6, 19, i2), new i6z0(2, 20, i2)}, 14), new we6(28, new i6z0[]{new i6z0(6, 15, i2), new i6z0(2, 16, i2)}, i25));
        int i26 = 4;
        aa31 aa31Var11 = new aa31(11, new int[]{6, 30, 54}, new we6(20, new i6z0[]{new i6z0(i26, 81, i2)}, i25), new we6(30, new i6z0[]{new i6z0(1, 50, i2), new i6z0(i26, 51, i2)}, i25), new we6(28, new i6z0[]{new i6z0(i26, 22, i2), new i6z0(i26, 23, i2)}, 14), new we6(24, new i6z0[]{new i6z0(3, 12, i2), new i6z0(8, i2, i2)}, 14));
        int i27 = 2;
        we6 we6Var8 = new we6(24, new i6z0[]{new i6z0(i27, 92, i2), new i6z0(i27, 93, i2)}, 14);
        int i28 = 22;
        we6 we6Var9 = new we6(i28, new i6z0[]{new i6z0(6, 36, i2), new i6z0(i27, 37, i2)}, 14);
        int i29 = 14;
        int i30 = 4;
        int i31 = 14;
        aa31 aa31Var12 = new aa31(12, new int[]{6, 32, 58}, we6Var8, we6Var9, new we6(26, new i6z0[]{new i6z0(4, 20, i2), new i6z0(6, 21, i2)}, i29), new we6(28, new i6z0[]{new i6z0(7, i29, i2), new i6z0(i30, 15, i2)}, i31));
        we6 we6Var10 = new we6(26, new i6z0[]{new i6z0(i30, HProv.PP_SET_PIN, i2)}, i31);
        we6 we6Var11 = new we6(22, new i6z0[]{new i6z0(8, 37, i2), new i6z0(1, 38, i2)}, i31);
        int i32 = 24;
        we6 we6Var12 = new we6(i32, new i6z0[]{new i6z0(8, 20, i2), new i6z0(4, 21, i2)}, 14);
        int i33 = 12;
        aa31 aa31Var13 = new aa31(13, new int[]{6, 34, 62}, we6Var10, we6Var11, we6Var12, new we6(22, new i6z0[]{new i6z0(i33, 11, i2), new i6z0(4, i33, i2)}, 14));
        int i34 = 14;
        int i35 = 5;
        int i36 = 24;
        aa31 aa31Var14 = new aa31(14, new int[]{6, 26, 46, 66}, new we6(30, new i6z0[]{new i6z0(3, HProv.PP_CACHE_SIZE, i2), new i6z0(1, BuildConfig.API_LEVEL, i2)}, i34), new we6(24, new i6z0[]{new i6z0(4, 40, i2), new i6z0(i35, 41, i2)}, i34), new we6(20, new i6z0[]{new i6z0(11, 16, i2), new i6z0(i35, 17, i2)}, 14), new we6(i36, new i6z0[]{new i6z0(11, 12, i2), new i6z0(5, i2, i2)}, 14));
        int i37 = 5;
        we6 we6Var13 = new we6(22, new i6z0[]{new i6z0(i37, 87, i2), new i6z0(1, 88, i2)}, 14);
        int i38 = 24;
        we6 we6Var14 = new we6(i38, new i6z0[]{new i6z0(i37, 41, i2), new i6z0(i37, 42, i2)}, 14);
        int i39 = 30;
        aa31 aa31Var15 = new aa31(15, new int[]{6, 26, 48, 70}, we6Var13, we6Var14, new we6(i39, new i6z0[]{new i6z0(i37, i38, i2), new i6z0(7, 25, i2)}, 14), new we6(24, new i6z0[]{new i6z0(11, 12, i2), new i6z0(7, i2, i2)}, 14));
        we6 we6Var15 = new we6(24, new i6z0[]{new i6z0(5, 98, i2), new i6z0(1, 99, i2)}, 14);
        int i40 = 28;
        aa31 aa31Var16 = new aa31(16, new int[]{6, 26, 50, 74}, we6Var15, new we6(i40, new i6z0[]{new i6z0(7, 45, i2), new i6z0(3, 46, i2)}, 14), new we6(24, new i6z0[]{new i6z0(15, 19, i2), new i6z0(2, 20, i2)}, 14), new we6(30, new i6z0[]{new i6z0(3, 15, i2), new i6z0(i2, 16, i2)}, 14));
        int i41 = 13;
        int i42 = 1;
        we6 we6Var16 = new we6(28, new i6z0[]{new i6z0(i42, HProv.PP_SET_PIN, i41), new i6z0(5, 108, i41)}, 14);
        we6 we6Var17 = new we6(28, new i6z0[]{new i6z0(10, 46, i41), new i6z0(i42, 47, i41)}, 14);
        i6z0[] i6z0VarArr3 = {new i6z0(i42, 22, i41), new i6z0(15, 23, i41)};
        int i43 = 14;
        aa31 aa31Var17 = new aa31(17, new int[]{6, 30, 54, 78}, we6Var16, we6Var17, new we6(28, i6z0VarArr3, i43), new we6(28, new i6z0[]{new i6z0(2, i43, i41), new i6z0(17, 15, i41)}, 14));
        int i44 = 13;
        int i45 = 14;
        we6 we6Var18 = new we6(30, new i6z0[]{new i6z0(5, 120, i44), new i6z0(1, Constants.VPN_TRAFFIC, i44)}, i45);
        we6 we6Var19 = new we6(26, new i6z0[]{new i6z0(9, 43, i44), new i6z0(4, 44, i44)}, i45);
        i6z0[] i6z0VarArr4 = {new i6z0(17, 22, i44), new i6z0(1, 23, i44)};
        int i46 = 14;
        int i47 = 28;
        aa31 aa31Var18 = new aa31(18, new int[]{6, 30, 56, 82}, we6Var18, we6Var19, new we6(28, i6z0VarArr4, i46), new we6(i47, new i6z0[]{new i6z0(2, i46, i44), new i6z0(19, 15, i44)}, 14));
        int i48 = 3;
        int i49 = 14;
        we6 we6Var20 = new we6(28, new i6z0[]{new i6z0(i48, 113, i44), new i6z0(4, 114, i44)}, i49);
        we6 we6Var21 = new we6(26, new i6z0[]{new i6z0(i48, 44, i44), new i6z0(11, 45, i44)}, i49);
        int i50 = 14;
        aa31 aa31Var19 = new aa31(19, new int[]{6, 30, 58, 86}, we6Var20, we6Var21, new we6(26, new i6z0[]{new i6z0(17, 21, i44), new i6z0(4, 22, i44)}, i50), new we6(26, new i6z0[]{new i6z0(9, i44, i44), new i6z0(16, i50, i44)}, i50));
        int i51 = 13;
        int i52 = 3;
        int i53 = 14;
        int i54 = 30;
        int i55 = 15;
        int i56 = 28;
        aa31 aa31Var20 = new aa31(20, new int[]{6, 34, 62, 90}, new we6(28, new i6z0[]{new i6z0(i52, HProv.PP_SET_PIN, i51), new i6z0(5, 108, i51)}, i53), new we6(26, new i6z0[]{new i6z0(i52, 41, i51), new i6z0(i51, 42, i51)}, i53), new we6(i54, new i6z0[]{new i6z0(15, 24, i51), new i6z0(5, 25, i51)}, 14), new we6(i56, new i6z0[]{new i6z0(i55, i55, i51), new i6z0(10, 16, i51)}, 14));
        int i57 = 4;
        int i58 = 14;
        we6 we6Var22 = new we6(i56, new i6z0[]{new i6z0(i57, BuildConfig.API_LEVEL, i51), new i6z0(i57, HProv.PP_NK_SYNC, i51)}, i58);
        int i59 = 17;
        int i60 = 28;
        int i61 = 30;
        aa31 aa31Var21 = new aa31(21, new int[]{6, 28, 50, 72, 94}, we6Var22, new we6(26, new i6z0[]{new i6z0(i59, 42, i51)}, i58), new we6(i60, new i6z0[]{new i6z0(i59, 22, i51), new i6z0(6, 23, i51)}, 14), new we6(i61, new i6z0[]{new i6z0(19, 16, i51), new i6z0(6, 17, i51)}, 14));
        int i62 = 13;
        i6z0[] i6z0VarArr5 = {new i6z0(2, 111, i62), new i6z0(7, 112, i62)};
        int i63 = 14;
        int i64 = 28;
        we6 we6Var23 = new we6(i64, i6z0VarArr5, i63);
        we6 we6Var24 = new we6(i64, new i6z0[]{new i6z0(17, 46, i62)}, i63);
        i6z0[] i6z0VarArr6 = {new i6z0(7, 24, i62), new i6z0(16, 25, i62)};
        int i65 = 14;
        aa31 aa31Var22 = new aa31(22, new int[]{6, 26, 50, 74, 98}, we6Var23, we6Var24, new we6(30, i6z0VarArr6, i65), new we6(24, new i6z0[]{new i6z0(34, i62, i62)}, i65));
        int i66 = 14;
        we6 we6Var25 = new we6(30, new i6z0[]{new i6z0(4, Constants.VPN_TRAFFIC, i62), new i6z0(5, 122, i62)}, i66);
        we6 we6Var26 = new we6(28, new i6z0[]{new i6z0(4, 47, i62), new i6z0(i66, 48, i62)}, i66);
        int i67 = 14;
        we6 we6Var27 = new we6(30, new i6z0[]{new i6z0(11, 24, i62), new i6z0(i67, 25, i62)}, i67);
        int i68 = 16;
        int i69 = 14;
        aa31 aa31Var23 = new aa31(23, new int[]{6, 30, 54, 78, 102}, we6Var25, we6Var26, we6Var27, new we6(30, new i6z0[]{new i6z0(i68, 15, i62), new i6z0(i69, i68, i62)}, i69));
        int i70 = 6;
        int i71 = 13;
        int i72 = 14;
        int i73 = 16;
        int i74 = 30;
        int i75 = 30;
        aa31 aa31Var24 = new aa31(24, new int[]{6, 28, 54, 80, 106}, new we6(30, new i6z0[]{new i6z0(i70, HProv.PP_NK_SYNC, i71), new i6z0(4, HProv.PP_INFO, i71)}, i72), new we6(28, new i6z0[]{new i6z0(i70, 45, i71), new i6z0(i72, 46, i71)}, i72), new we6(i74, new i6z0[]{new i6z0(11, 24, i71), new i6z0(i73, 25, i71)}, 14), new we6(i75, new i6z0[]{new i6z0(i74, i73, i71), new i6z0(2, 17, i71)}, 14));
        int i76 = 13;
        int i77 = 8;
        int i78 = 14;
        int i79 = 22;
        aa31 aa31Var25 = new aa31(25, new int[]{6, 32, 58, 84, 110}, new we6(26, new i6z0[]{new i6z0(i77, 106, i76), new i6z0(4, HProv.PP_SET_PIN, i76)}, i78), new we6(28, new i6z0[]{new i6z0(i77, 47, i76), new i6z0(i76, 48, i76)}, i78), new we6(30, new i6z0[]{new i6z0(7, 24, i76), new i6z0(i79, 25, i76)}, 14), new we6(30, new i6z0[]{new i6z0(i79, 15, i76), new i6z0(i76, 16, i76)}, 14));
        int i80 = 13;
        int i81 = 28;
        we6 we6Var28 = new we6(i81, new i6z0[]{new i6z0(10, 114, i80), new i6z0(2, HProv.PP_CACHE_SIZE, i80)}, 14);
        int i82 = 28;
        aa31 aa31Var26 = new aa31(26, new int[]{6, 30, 58, 86, 114}, we6Var28, new we6(i82, new i6z0[]{new i6z0(19, 46, i80), new i6z0(4, 47, i80)}, 14), new we6(28, new i6z0[]{new i6z0(i82, 22, i80), new i6z0(6, 23, i80)}, 14), new we6(30, new i6z0[]{new i6z0(33, 16, i80), new i6z0(4, 17, i80)}, 14));
        int i83 = 13;
        int i84 = 14;
        int i85 = 30;
        int i86 = 30;
        int i87 = 30;
        aa31 aa31Var27 = new aa31(27, new int[]{6, 34, 62, 90, HProv.PP_INFO}, new we6(i85, new i6z0[]{new i6z0(8, 122, i83), new i6z0(4, HProv.PP_PASSWD_TERM, i83)}, i84), new we6(28, new i6z0[]{new i6z0(22, 45, i83), new i6z0(3, 46, i83)}, i84), new we6(i86, new i6z0[]{new i6z0(8, 23, i83), new i6z0(26, 24, i83)}, 14), new we6(i87, new i6z0[]{new i6z0(12, 15, i83), new i6z0(28, 16, i83)}, 14));
        int i88 = 13;
        int i89 = 3;
        int i90 = 14;
        int i91 = 30;
        int i92 = 30;
        aa31 aa31Var28 = new aa31(28, new int[]{6, 26, 50, 74, 98, 122}, new we6(30, new i6z0[]{new i6z0(i89, HProv.PP_NK_SYNC, i88), new i6z0(10, HProv.PP_INFO, i88)}, i90), new we6(28, new i6z0[]{new i6z0(i89, 45, i88), new i6z0(23, 46, i88)}, i90), new we6(i91, new i6z0[]{new i6z0(4, 24, i88), new i6z0(31, 25, i88)}, 14), new we6(i92, new i6z0[]{new i6z0(11, 15, i88), new i6z0(31, 16, i88)}, 14));
        int i93 = 7;
        int i94 = 14;
        aa31 aa31Var29 = new aa31(29, new int[]{6, 30, 54, 78, 102, HProv.PP_DELETE_SAVED_PASSWD}, new we6(30, new i6z0[]{new i6z0(i93, BuildConfig.API_LEVEL, i88), new i6z0(i93, HProv.PP_NK_SYNC, i88)}, i94), new we6(28, new i6z0[]{new i6z0(21, 45, i88), new i6z0(i93, 46, i88)}, i94), new we6(30, new i6z0[]{new i6z0(1, 23, i88), new i6z0(37, 24, i88)}, 14), new we6(30, new i6z0[]{new i6z0(19, 15, i88), new i6z0(26, 16, i88)}, 14));
        int i95 = 10;
        int i96 = 14;
        int i97 = 25;
        int i98 = 30;
        aa31 aa31Var30 = new aa31(30, new int[]{6, 26, 52, 78, 104, 130}, new we6(30, new i6z0[]{new i6z0(5, HProv.PP_CACHE_SIZE, i88), new i6z0(i95, BuildConfig.API_LEVEL, i88)}, i96), new we6(28, new i6z0[]{new i6z0(19, 47, i88), new i6z0(i95, 48, i88)}, i96), new we6(30, new i6z0[]{new i6z0(15, 24, i88), new i6z0(i97, i97, i88)}, i96), new we6(i98, new i6z0[]{new i6z0(23, 15, i88), new i6z0(25, 16, i88)}, 14));
        int[] iArr = {6, 30, 56, 82, 108, HProv.PP_CONTAINER_EXTENSION_DEL};
        i6z0[] i6z0VarArr7 = {new i6z0(i88, HProv.PP_CACHE_SIZE, i88), new i6z0(3, BuildConfig.API_LEVEL, i88)};
        int i99 = 14;
        we6 we6Var29 = new we6(i98, i6z0VarArr7, i99);
        we6 we6Var30 = new we6(28, new i6z0[]{new i6z0(2, 46, i88), new i6z0(29, 47, i88)}, i99);
        int i100 = 30;
        we6 we6Var31 = new we6(i100, new i6z0[]{new i6z0(42, 24, i88), new i6z0(1, 25, i88)}, 14);
        i6z0[] i6z0VarArr8 = {new i6z0(23, 15, i88), new i6z0(28, 16, i88)};
        int i101 = 14;
        int i102 = 30;
        aa31 aa31Var31 = new aa31(31, iArr, we6Var29, we6Var30, we6Var31, new we6(i102, i6z0VarArr8, i101));
        aa31 aa31Var32 = new aa31(32, new int[]{6, 34, 60, 86, 112, HProv.PP_VERSION_EX}, new we6(i102, new i6z0[]{new i6z0(17, HProv.PP_CACHE_SIZE, i88)}, i101), new we6(28, new i6z0[]{new i6z0(10, 46, i88), new i6z0(23, 47, i88)}, i101), new we6(30, new i6z0[]{new i6z0(10, 24, i88), new i6z0(35, 25, i88)}, 14), new we6(30, new i6z0[]{new i6z0(19, 15, i88), new i6z0(35, 16, i88)}, 14));
        int i103 = 14;
        int i104 = 30;
        int i105 = 30;
        aa31 aa31Var33 = new aa31(33, new int[]{6, 30, 58, 86, 114, 142}, new we6(30, new i6z0[]{new i6z0(17, HProv.PP_CACHE_SIZE, i88), new i6z0(1, BuildConfig.API_LEVEL, i88)}, i103), new we6(28, new i6z0[]{new i6z0(i103, 46, i88), new i6z0(21, 47, i88)}, i103), new we6(i104, new i6z0[]{new i6z0(29, 24, i88), new i6z0(19, 25, i88)}, 14), new we6(i105, new i6z0[]{new i6z0(11, 15, i88), new i6z0(46, 16, i88)}, 14));
        int i106 = 14;
        int i107 = 30;
        aa31 aa31Var34 = new aa31(34, new int[]{6, 34, 62, 90, HProv.PP_INFO, HProv.PP_CONTAINER_STATUS}, new we6(30, new i6z0[]{new i6z0(i88, HProv.PP_CACHE_SIZE, i88), new i6z0(6, BuildConfig.API_LEVEL, i88)}, i106), new we6(28, new i6z0[]{new i6z0(i106, 46, i88), new i6z0(23, 47, i88)}, i106), new we6(i107, new i6z0[]{new i6z0(44, 24, i88), new i6z0(7, 25, i88)}, 14), new we6(30, new i6z0[]{new i6z0(59, 16, i88), new i6z0(1, 17, i88)}, 14));
        int i108 = 12;
        int i109 = 14;
        aa31 aa31Var35 = new aa31(35, new int[]{6, 30, 54, 78, 102, HProv.PP_DELETE_SAVED_PASSWD, 150}, new we6(30, new i6z0[]{new i6z0(i108, Constants.VPN_TRAFFIC, i88), new i6z0(7, 122, i88)}, i109), new we6(28, new i6z0[]{new i6z0(i108, 47, i88), new i6z0(26, 48, i88)}, i109), new we6(30, new i6z0[]{new i6z0(39, 24, i88), new i6z0(i109, 25, i88)}, i109), new we6(30, new i6z0[]{new i6z0(22, 15, i88), new i6z0(41, 16, i88)}, 14));
        int i110 = 13;
        int i111 = 6;
        int i112 = 14;
        int i113 = 30;
        aa31 aa31Var36 = new aa31(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new we6(30, new i6z0[]{new i6z0(i111, Constants.VPN_TRAFFIC, i110), new i6z0(i112, 122, i110)}, i112), new we6(28, new i6z0[]{new i6z0(i111, 47, i110), new i6z0(34, 48, i110)}, i112), new we6(i113, new i6z0[]{new i6z0(46, 24, i110), new i6z0(10, 25, i110)}, 14), new we6(30, new i6z0[]{new i6z0(2, 15, i110), new i6z0(64, 16, i110)}, 14));
        int i114 = 14;
        int i115 = 30;
        int i116 = 30;
        aa31 aa31Var37 = new aa31(37, new int[]{6, 28, 54, 80, 106, HProv.PP_CONTAINER_EXTENSION, HProv.PP_LICENSE}, new we6(30, new i6z0[]{new i6z0(17, 122, i110), new i6z0(4, HProv.PP_PASSWD_TERM, i110)}, i114), new we6(28, new i6z0[]{new i6z0(29, 46, i110), new i6z0(i114, 47, i110)}, i114), new we6(i115, new i6z0[]{new i6z0(49, 24, i110), new i6z0(10, 25, i110)}, 14), new we6(i116, new i6z0[]{new i6z0(24, 15, i110), new i6z0(46, 16, i110)}, 14));
        int[] iArr2 = {6, 32, 58, 84, 110, HProv.PP_LCD_QUERY, 162};
        i6z0[] i6z0VarArr9 = {new i6z0(4, 122, i110), new i6z0(18, HProv.PP_PASSWD_TERM, i110)};
        int i117 = 14;
        int i118 = 30;
        aa31 aa31Var38 = new aa31(38, iArr2, new we6(30, i6z0VarArr9, i117), new we6(28, new i6z0[]{new i6z0(i110, 46, i110), new i6z0(32, 47, i110)}, i117), new we6(30, new i6z0[]{new i6z0(48, 24, i110), new i6z0(i117, 25, i110)}, i117), new we6(i118, new i6z0[]{new i6z0(42, 15, i110), new i6z0(32, 16, i110)}, 14));
        int i119 = 13;
        int i120 = 14;
        int i121 = 30;
        aa31 aa31Var39 = new aa31(39, new int[]{6, 26, 54, 82, 110, HProv.PP_VERSION_EX, 166}, new we6(30, new i6z0[]{new i6z0(20, HProv.PP_NK_SYNC, i119), new i6z0(4, HProv.PP_INFO, i119)}, i120), new we6(28, new i6z0[]{new i6z0(40, 47, i119), new i6z0(7, 48, i119)}, i120), new we6(i121, new i6z0[]{new i6z0(43, 24, i119), new i6z0(22, 25, i119)}, 14), new we6(30, new i6z0[]{new i6z0(10, 15, i119), new i6z0(67, 16, i119)}, 14));
        int[] iArr3 = {6, 30, 58, 86, 114, 142, MSException.ERROR_BUSY};
        int i122 = 13;
        i6z0[] i6z0VarArr10 = {new i6z0(19, HProv.PP_INFO, i122), new i6z0(6, 119, i122)};
        int i123 = 14;
        int i124 = 34;
        return new aa31[]{aa31Var, aa31Var2, aa31Var3, aa31Var4, aa31Var5, aa31Var6, aa31Var7, aa31Var8, aa31Var9, aa31Var10, aa31Var11, aa31Var12, aa31Var13, aa31Var14, aa31Var15, aa31Var16, aa31Var17, aa31Var18, aa31Var19, aa31Var20, aa31Var21, aa31Var22, aa31Var23, aa31Var24, aa31Var25, aa31Var26, aa31Var27, aa31Var28, aa31Var29, aa31Var30, aa31Var31, aa31Var32, aa31Var33, aa31Var34, aa31Var35, aa31Var36, aa31Var37, aa31Var38, aa31Var39, new aa31(40, iArr3, new we6(30, i6z0VarArr10, i123), new we6(28, new i6z0[]{new i6z0(18, 47, i122), new i6z0(31, 48, i122)}, i123), new we6(30, new i6z0[]{new i6z0(i124, 24, i122), new i6z0(i124, 25, i122)}, 14), new we6(30, new i6z0[]{new i6z0(20, 15, i122), new i6z0(61, 16, i122)}, 14))};
    }

    public static aa31 b(int i) {
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (int i4 = 0; i4 < 34; i4++) {
            int i5 = e[i4];
            if (i5 == i) {
                return c(i4 + 7);
            }
            int bitCount = Integer.bitCount(i5 ^ i);
            if (bitCount < i2) {
                i3 = i4 + 7;
                i2 = bitCount;
            }
        }
        if (i2 <= 3) {
            return c(i3);
        }
        return null;
    }

    public static aa31 c(int i) {
        if (i >= 1 && i <= 40) {
            return f[i - 1];
        }
        w511.q();
        return null;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
