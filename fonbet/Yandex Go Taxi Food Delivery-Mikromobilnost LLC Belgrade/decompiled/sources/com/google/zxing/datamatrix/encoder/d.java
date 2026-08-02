package com.google.zxing.datamatrix.encoder;

import defpackage.ki20;
import defpackage.l1b1;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.JCP.tools.LicenseUtility;
import ru.CryptoPro.JCSP.KeyStore.CSPStore;

/* loaded from: classes11.dex */
public abstract class d {
    public static final char[] a = {'!', OpenList.CHAR_QUOTE, '#', '$', '%', '&', '\'', '(', ')', '*', '+', HexString.CHAR_COMMA, LicenseUtility.SEPARATOR, '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', CSPStore.UNIQUE_SEPARATOR, ']', '^', '_'};

    public static void a(b[][] bVarArr, b bVar) {
        int i = bVar.c + bVar.d;
        if (bVarArr[i][bVar.c().ordinal()] == null || bVarArr[i][bVar.c().ordinal()].f > bVar.f) {
            bVarArr[i][bVar.c().ordinal()] = bVar;
        }
    }

    public static void b(ki20 ki20Var, b[][] bVarArr, int i, b bVar) {
        if (ki20Var.b(i)) {
            a(bVarArr, new b(ki20Var, MinimalEncoder$Mode.ASCII, i, 1, bVar));
            return;
        }
        char charAt = ki20Var.charAt(i);
        int i2 = 0;
        if (bVar == null || bVar.c() != MinimalEncoder$Mode.EDF) {
            if (l1b1.d(charAt) && ki20Var.d(i, 2) && l1b1.d(ki20Var.charAt(i + 1))) {
                a(bVarArr, new b(ki20Var, MinimalEncoder$Mode.ASCII, i, 2, bVar));
            } else {
                a(bVarArr, new b(ki20Var, MinimalEncoder$Mode.ASCII, i, 1, bVar));
            }
            MinimalEncoder$Mode[] minimalEncoder$ModeArr = {MinimalEncoder$Mode.C40, MinimalEncoder$Mode.TEXT};
            for (int i3 = 0; i3 < 2; i3++) {
                MinimalEncoder$Mode minimalEncoder$Mode = minimalEncoder$ModeArr[i3];
                int[] iArr = new int[1];
                if (c(ki20Var, i, minimalEncoder$Mode == MinimalEncoder$Mode.C40, iArr) > 0) {
                    a(bVarArr, new b(ki20Var, minimalEncoder$Mode, i, iArr[0], bVar));
                }
            }
            if (ki20Var.d(i, 3) && l1b1.i(ki20Var.charAt(i)) && l1b1.i(ki20Var.charAt(i + 1)) && l1b1.i(ki20Var.charAt(i + 2))) {
                a(bVarArr, new b(ki20Var, MinimalEncoder$Mode.X12, i, 3, bVar));
            }
            a(bVarArr, new b(ki20Var, MinimalEncoder$Mode.B256, i, 1, bVar));
        }
        while (i2 < 3) {
            int i4 = i + i2;
            if (!ki20Var.d(i4, 1) || !l1b1.g(ki20Var.charAt(i4))) {
                break;
            }
            int i5 = i2 + 1;
            a(bVarArr, new b(ki20Var, MinimalEncoder$Mode.EDF, i, i5, bVar));
            i2 = i5;
        }
        if (i2 == 3 && ki20Var.d(i, 4) && l1b1.g(ki20Var.charAt(i + 3))) {
            a(bVarArr, new b(ki20Var, MinimalEncoder$Mode.EDF, i, 4, bVar));
        }
    }

    public static int c(ki20 ki20Var, int i, boolean z, int[] iArr) {
        int[] iArr2 = ki20Var.b;
        int i2 = 0;
        for (int i3 = i; i3 < iArr2.length; i3++) {
            if (ki20Var.b(i3)) {
                iArr[0] = 0;
                return 0;
            }
            char charAt = ki20Var.charAt(i3);
            if ((z && l1b1.f(charAt)) || (!z && l1b1.h(charAt))) {
                i2++;
            } else if (d(charAt, ki20Var.c)) {
                int i4 = charAt & 255;
                i2 = (i4 < 128 || (!(z && l1b1.f((char) (i4 + (-128)))) && (z || !l1b1.h((char) (i4 + (-128)))))) ? i2 + 4 : i2 + 3;
            } else {
                i2 += 2;
            }
            if (i2 % 3 == 0 || ((i2 - 2) % 3 == 0 && i3 + 1 == iArr2.length)) {
                iArr[0] = (i3 - i) + 1;
                return (int) Math.ceil(i2 / 3.0d);
            }
        }
        iArr[0] = 0;
        return 0;
    }

    public static boolean d(char c, int i) {
        return c != i && c >= 128 && c <= 255;
    }
}
