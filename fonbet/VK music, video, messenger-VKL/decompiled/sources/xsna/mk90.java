package xsna;

/* compiled from: GapBuffer.kt */
/* loaded from: classes11.dex */
public final class mk90 {
    public String a;
    public sgt b;
    public int c;
    public int d;

    public final int a() {
        sgt sgtVar = this.b;
        if (sgtVar == null) {
            return this.a.length();
        }
        return (sgtVar.a - sgtVar.a()) + (this.a.length() - (this.d - this.c));
    }

    public final void b(int i, int i2, String str) {
        if (i > i2) {
            vzw.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            vzw.a("start must be non-negative, but was " + i);
        }
        sgt sgtVar = this.b;
        if (sgtVar == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(this.a.length() - i2, 64);
            int i3 = i - min;
            this.a.getChars(i3, i, cArr, 0);
            int i4 = max - min2;
            int i5 = min2 + i2;
            this.a.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            sgt sgtVar2 = new sgt();
            sgtVar2.a = max;
            sgtVar2.b = cArr;
            sgtVar2.c = length;
            sgtVar2.d = i4;
            this.b = sgtVar2;
            this.c = i3;
            this.d = i5;
            return;
        }
        int i6 = this.c;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > sgtVar.a - sgtVar.a()) {
            this.a = toString();
            this.b = null;
            this.c = -1;
            this.d = -1;
            b(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > sgtVar.a()) {
            int a = length2 - sgtVar.a();
            int i9 = sgtVar.a;
            do {
                i9 *= 2;
            } while (i9 - sgtVar.a < a);
            char[] cArr2 = new char[i9];
            System.arraycopy(sgtVar.b, 0, cArr2, 0, sgtVar.c);
            int i10 = sgtVar.a;
            int i11 = sgtVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            System.arraycopy(sgtVar.b, i11, cArr2, i13, (i12 + i11) - i11);
            sgtVar.b = cArr2;
            sgtVar.a = i9;
            sgtVar.d = i13;
        }
        int i14 = sgtVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = sgtVar.b;
            System.arraycopy(cArr3, i8, cArr3, sgtVar.d - i15, i15);
            sgtVar.c = i7;
            sgtVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int a2 = sgtVar.a() + i7;
            int a3 = sgtVar.a() + i8;
            int i16 = sgtVar.d;
            int i17 = a2 - i16;
            char[] cArr4 = sgtVar.b;
            System.arraycopy(cArr4, i16, cArr4, sgtVar.c, i17);
            sgtVar.c += i17;
            sgtVar.d = a3;
        } else {
            sgtVar.d = sgtVar.a() + i8;
            sgtVar.c = i7;
        }
        str.getChars(0, str.length(), sgtVar.b, sgtVar.c);
        sgtVar.c = str.length() + sgtVar.c;
    }

    public final String toString() {
        sgt sgtVar = this.b;
        if (sgtVar == null) {
            return this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.a, 0, this.c);
        sb.append(sgtVar.b, 0, sgtVar.c);
        char[] cArr = sgtVar.b;
        int i = sgtVar.d;
        sb.append(cArr, i, sgtVar.a - i);
        String str = this.a;
        sb.append((CharSequence) str, this.d, str.length());
        return sb.toString();
    }
}
