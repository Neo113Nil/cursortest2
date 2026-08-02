package com.google.zxing.datamatrix.encoder;

import defpackage.ki20;
import defpackage.l1b1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class b {
    public static final int[] g = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};
    public static final int[] h = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};
    public static final int[] i = {5, 10, 16, 33, 32, 49};
    public final ki20 a;
    public final MinimalEncoder$Mode b;
    public final int c;
    public final int d;
    public final b e;
    public final int f;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
    
        if (r10 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ae, code lost:
    
        if (r10 != com.google.zxing.datamatrix.encoder.MinimalEncoder$Mode.X12) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d4, code lost:
    
        if (r10 != com.google.zxing.datamatrix.encoder.MinimalEncoder$Mode.X12) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(ki20 ki20Var, MinimalEncoder$Mode minimalEncoder$Mode, int i2, int i3, b bVar) {
        this.a = ki20Var;
        this.b = minimalEncoder$Mode;
        this.c = i2;
        this.d = i3;
        this.e = bVar;
        int i4 = 0;
        int i5 = bVar != null ? bVar.f : 0;
        MinimalEncoder$Mode c = bVar == null ? MinimalEncoder$Mode.ASCII : bVar.c();
        switch (a.a[minimalEncoder$Mode.ordinal()]) {
            case 1:
                i5 = (ki20Var.b(i2) || d.d(ki20Var.charAt(i2), ki20Var.c)) ? i5 + 2 : i5 + 1;
                if (c != MinimalEncoder$Mode.C40) {
                    if (c != MinimalEncoder$Mode.TEXT) {
                        break;
                    }
                }
                i5++;
                break;
            case 2:
                int i6 = i5 + 1;
                if (c == MinimalEncoder$Mode.B256) {
                    for (b bVar2 = this; bVar2 != null && bVar2.b == MinimalEncoder$Mode.B256 && i4 <= 250; bVar2 = bVar2.e) {
                        i4++;
                    }
                    i5 = i6;
                    if (c != MinimalEncoder$Mode.ASCII) {
                        if (c != MinimalEncoder$Mode.C40) {
                            if (c != MinimalEncoder$Mode.TEXT) {
                                break;
                            }
                        }
                        i5 += 2;
                        break;
                    }
                    i5++;
                    break;
                }
                i5 += 2;
                if (c != MinimalEncoder$Mode.ASCII) {
                }
                i5++;
            case 3:
            case 4:
            case 5:
                MinimalEncoder$Mode minimalEncoder$Mode2 = MinimalEncoder$Mode.X12;
                if (minimalEncoder$Mode == minimalEncoder$Mode2) {
                    i5 += 2;
                } else {
                    i5 = (d.c(ki20Var, i2, minimalEncoder$Mode == MinimalEncoder$Mode.C40, new int[1]) * 2) + i5;
                }
                if (c != MinimalEncoder$Mode.ASCII && c != MinimalEncoder$Mode.B256) {
                    if (c != minimalEncoder$Mode) {
                        if (c != MinimalEncoder$Mode.C40) {
                            if (c != MinimalEncoder$Mode.TEXT) {
                            }
                        }
                        i5 += 2;
                        break;
                    }
                }
                i5++;
                break;
            case 6:
                int i7 = i5 + 3;
                if (c != MinimalEncoder$Mode.ASCII && c != MinimalEncoder$Mode.B256) {
                    if (c != MinimalEncoder$Mode.C40 && c != MinimalEncoder$Mode.TEXT && c != MinimalEncoder$Mode.X12) {
                        i5 = i7;
                        break;
                    } else {
                        i5 += 5;
                        break;
                    }
                } else {
                    i5 += 4;
                    break;
                }
                break;
        }
        this.f = i5;
    }

    public static int a(boolean z, int i2, char c, int i3) {
        if (c == i3) {
            return 27;
        }
        if (z) {
            if (c <= 31) {
                return c;
            }
            if (c != ' ') {
                return c <= '/' ? c - '!' : c <= '9' ? c - ',' : c <= '@' ? c - '+' : c <= 'Z' ? c - '3' : c <= '_' ? c - 'E' : c <= 127 ? c - '`' : c;
            }
        } else {
            if (c == 0) {
                return 0;
            }
            if (i2 == 0 && c <= 3) {
                return c - 1;
            }
            if (i2 == 1 && c <= 31) {
                return c;
            }
            if (c != ' ') {
                if (c >= '!' && c <= '/') {
                    return c - '!';
                }
                if (c >= '0' && c <= '9') {
                    return c - ',';
                }
                if (c >= ':' && c <= '@') {
                    return c - '+';
                }
                if (c >= 'A' && c <= 'Z') {
                    return c - '@';
                }
                if (c >= '[' && c <= '_') {
                    return c - 'E';
                }
                if (c == '`') {
                    return 0;
                }
                return (c < 'a' || c > 'z') ? (c < '{' || c > 127) ? c : c - '`' : c - 'S';
            }
        }
        return 3;
    }

    public static int f(char c, int i2, boolean z) {
        if ((z && c <= 31) || (!z && c <= 31)) {
            return 0;
        }
        char[] cArr = d.a;
        if (z) {
            for (int i3 = 0; i3 < 27; i3++) {
                if (cArr[i3] == c) {
                    return 1;
                }
            }
            if (c == i2) {
                return 1;
            }
        }
        if (z) {
            return 2;
        }
        for (int i4 = 0; i4 < 27; i4++) {
            if (cArr[i4] == c) {
                return 1;
            }
        }
        return c == i2 ? 1 : 2;
    }

    public static int g(char c) {
        if (c == '\r') {
            return 0;
        }
        if (c == '*') {
            return 1;
        }
        if (c == '>') {
            return 2;
        }
        if (c == ' ') {
            return 3;
        }
        return (c < '0' || c > '9') ? (c < 'A' || c > 'Z') ? c : c - '3' : c - ',';
    }

    public static void h(int i2, int i3, int i4, int i5, byte[] bArr) {
        int i6 = ((i4 & 255) * 40) + ((i3 & 255) * 1600) + (i5 & 255) + 1;
        bArr[i2] = (byte) (i6 / 256);
        bArr[i2 + 1] = (byte) (i6 % 256);
    }

    public final byte[] b(int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.d; i3++) {
            char charAt = this.a.charAt(this.c + i3);
            if ((z && l1b1.f(charAt)) || (!z && l1b1.h(charAt))) {
                arrayList.add(Byte.valueOf((byte) a(z, 0, charAt, i2)));
            } else if (d.d(charAt, i2)) {
                char c = (char) ((charAt & 255) - 128);
                if (!(z && l1b1.f(c)) && (z || !l1b1.h(c))) {
                    arrayList.add((byte) 1);
                    arrayList.add((byte) 30);
                    int f = f(c, i2, z);
                    arrayList.add(Byte.valueOf((byte) f));
                    arrayList.add(Byte.valueOf((byte) a(z, f, c, i2)));
                } else {
                    arrayList.add((byte) 1);
                    arrayList.add((byte) 30);
                    arrayList.add(Byte.valueOf((byte) a(z, 0, c, i2)));
                }
            } else {
                int f2 = f(charAt, i2, z);
                arrayList.add(Byte.valueOf((byte) f2));
                arrayList.add(Byte.valueOf((byte) a(z, f2, charAt, i2)));
            }
        }
        if (arrayList.size() % 3 != 0) {
            arrayList.add((byte) 0);
        }
        byte[] bArr = new byte[(arrayList.size() / 3) * 2];
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5 += 3) {
            h(i4, ((Byte) arrayList.get(i5)).byteValue() & 255, ((Byte) arrayList.get(i5 + 1)).byteValue() & 255, ((Byte) arrayList.get(i5 + 2)).byteValue() & 255, bArr);
            i4 += 2;
        }
        return bArr;
    }

    public final MinimalEncoder$Mode c() {
        MinimalEncoder$Mode minimalEncoder$Mode = MinimalEncoder$Mode.EDF;
        int i2 = this.d;
        int i3 = this.f;
        MinimalEncoder$Mode minimalEncoder$Mode2 = this.b;
        if (minimalEncoder$Mode2 == minimalEncoder$Mode) {
            if (i2 < 4) {
                return MinimalEncoder$Mode.ASCII;
            }
            int d = d();
            if (d > 0) {
                int i4 = i3 + d;
                if (e(i4) - i4 <= 2 - d) {
                    return MinimalEncoder$Mode.ASCII;
                }
            }
        }
        if (minimalEncoder$Mode2 == MinimalEncoder$Mode.C40 || minimalEncoder$Mode2 == MinimalEncoder$Mode.TEXT || minimalEncoder$Mode2 == MinimalEncoder$Mode.X12) {
            if (this.c + i2 >= this.a.b.length && e(i3) - i3 == 0) {
                return MinimalEncoder$Mode.ASCII;
            }
            if (d() == 1) {
                int i5 = i3 + 1;
                if (e(i5) - i5 == 0) {
                    return MinimalEncoder$Mode.ASCII;
                }
            }
        }
        return minimalEncoder$Mode2;
    }

    public final int d() {
        ki20 ki20Var = this.a;
        int i2 = ki20Var.c;
        int length = ki20Var.b.length;
        int i3 = this.c + this.d;
        int i4 = length - i3;
        if (i4 > 4 || i3 >= length) {
            return 0;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                if (d.d(ki20Var.charAt(i3), i2)) {
                    return 0;
                }
                int i5 = i3 + 1;
                if (d.d(ki20Var.charAt(i5), i2)) {
                    return 0;
                }
                if (!l1b1.d(ki20Var.charAt(i3)) || !l1b1.d(ki20Var.charAt(i5))) {
                }
            } else if (i4 == 3) {
                if ((!l1b1.d(ki20Var.charAt(i3)) || !l1b1.d(ki20Var.charAt(i3 + 1)) || d.d(ki20Var.charAt(i3 + 2), i2)) && (!l1b1.d(ki20Var.charAt(i3 + 1)) || !l1b1.d(ki20Var.charAt(i3 + 2)) || d.d(ki20Var.charAt(i3), i2))) {
                    return 0;
                }
            } else if (!l1b1.d(ki20Var.charAt(i3)) || !l1b1.d(ki20Var.charAt(i3 + 1)) || !l1b1.d(ki20Var.charAt(i3 + 2)) || !l1b1.d(ki20Var.charAt(i3 + 3))) {
                return 0;
            }
            return 2;
        }
        if (d.d(ki20Var.charAt(i3), i2)) {
            return 0;
        }
        return 1;
    }

    public final int e(int i2) {
        int i3 = a.b[this.a.w.ordinal()];
        int i4 = 0;
        if (i3 == 1) {
            for (int i5 = 0; i5 < 24; i5++) {
                int i6 = h[i5];
                if (i6 >= i2) {
                    return i6;
                }
            }
        } else if (i3 == 2) {
            for (int i7 = 0; i7 < 6; i7++) {
                int i8 = i[i7];
                if (i8 >= i2) {
                    return i8;
                }
            }
        }
        while (true) {
            int[] iArr = g;
            if (i4 >= 28) {
                return iArr[27];
            }
            int i9 = iArr[i4];
            if (i9 >= i2) {
                return i9;
            }
            i4++;
        }
    }
}
