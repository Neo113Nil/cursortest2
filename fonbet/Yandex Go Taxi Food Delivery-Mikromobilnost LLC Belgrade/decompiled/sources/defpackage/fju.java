package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final class fju {
    public static final String[] a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};
    public static final int[][] b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};
    public static final int[][] c;
    public static final int[][] d;

    static {
        Class cls = Integer.TYPE;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) cls, 5, 256);
        c = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            c[0][i] = i - 63;
        }
        c[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            c[1][i2] = i2 - 95;
        }
        c[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            c[2][i3] = i3 - 46;
        }
        int[] iArr2 = c[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, HProv.PP_SAME_MEDIA, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_VERSION_TIMESTAMP};
        for (int i4 = 0; i4 < 28; i4++) {
            c[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, HProv.PP_PASSWD_TERM, HProv.PP_DELETE_KEYSET};
        for (int i5 = 0; i5 < 31; i5++) {
            int i6 = iArr4[i5];
            if (i6 > 0) {
                c[4][i6] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, 6, 6);
        d = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = d;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            g3u0 g3u0Var = (g3u0) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList2.addFirst(g3u0Var);
                    break;
                }
                g3u0 g3u0Var2 = (g3u0) it2.next();
                if (g3u0Var2.c(g3u0Var)) {
                    break;
                }
                if (g3u0Var.c(g3u0Var2)) {
                    it2.remove();
                }
            }
        }
        return linkedList2;
    }
}
