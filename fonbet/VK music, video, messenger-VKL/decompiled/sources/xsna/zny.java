package xsna;

import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;

/* compiled from: LayoutHelper.android.kt */
/* loaded from: classes11.dex */
public final class zny {
    public final Layout a;
    public final ArrayList b;
    public final ArrayList c;
    public final boolean[] d;
    public char[] e;

    /* compiled from: LayoutHelper.android.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BidiRun(start=");
            sb.append(this.a);
            sb.append(", end=");
            sb.append(this.b);
            sb.append(", isRtl=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public zny(Layout layout) {
        this.a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int L = drm0.L(this.a.getText(), '\n', i, 4);
            i = L < 0 ? this.a.getText().length() : L + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.a.getText().length());
        this.b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.c = arrayList2;
        this.d = new boolean[this.b.size()];
        this.b.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r5.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bidi a(int i) {
        Bidi bidi;
        boolean[] zArr = this.d;
        boolean z = zArr[i];
        ArrayList arrayList = this.c;
        if (z) {
            return (Bidi) arrayList.get(i);
        }
        ArrayList arrayList2 = this.b;
        int intValue = i == 0 ? 0 : ((Number) arrayList2.get(i - 1)).intValue();
        int intValue2 = ((Number) arrayList2.get(i)).intValue();
        int i2 = intValue2 - intValue;
        char[] cArr = this.e;
        if (cArr == null || cArr.length < i2) {
            cArr = new char[i2];
        }
        char[] cArr2 = cArr;
        Layout layout = this.a;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i2)) {
            bidi = new Bidi(cArr2, 0, null, 0, i2, layout.getParagraphDirection(layout.getLineForOffset(e(i))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList.set(i, bidi);
        zArr[i] = true;
        if (bidi != null) {
            char[] cArr3 = this.e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.e = cArr2;
        return bidi;
    }

    public final float b(int i, boolean z) {
        Layout layout = this.a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    public final float c(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4 = i;
        if (!z2) {
            return b(i, z);
        }
        Layout layout = this.a;
        int s = xa4.s(layout, i4, z2);
        int lineStart = layout.getLineStart(s);
        int lineEnd = layout.getLineEnd(s);
        if (i4 != lineStart && i4 != lineEnd) {
            return b(i, z);
        }
        if (i4 == 0 || i4 == layout.getText().length()) {
            return b(i, z);
        }
        int d = d(i4, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(e(d))) == -1;
        int f = f(lineEnd, lineStart);
        int e = e(d);
        int i5 = lineStart - e;
        int i6 = f - e;
        Bidi a2 = a(d);
        Bidi createLineBidi = a2 != null ? a2.createLineBidi(i5, i6) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                z3 = !z3;
            }
            return i4 == lineStart ? z3 : !z3 ? layout.getLineLeft(s) : layout.getLineRight(s);
        }
        int runCount = createLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            aVarArr[i7] = new a(createLineBidi.getRunStart(i7) + lineStart, createLineBidi.getRunLimit(i7) + lineStart, createLineBidi.getRunLevel(i7) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i8 = 0; i8 < runCount2; i8++) {
            bArr[i8] = (byte) createLineBidi.getRunLevel(i8);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        if (i4 == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (aVarArr[i9].a == i4) {
                    i3 = i9;
                    break;
                }
                i9++;
            }
            boolean z4 = (z || z3 == aVarArr[i3].c) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(s) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(aVarArr[i3 - 1].a) : layout.getPrimaryHorizontal(aVarArr[i3 + 1].a) : layout.getLineRight(s);
        }
        if (i4 > f) {
            i4 = f(i4, lineStart);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                i2 = -1;
                break;
            }
            if (aVarArr[i10].b == i4) {
                i2 = i10;
                break;
            }
            i10++;
        }
        boolean z5 = (z || z3 == aVarArr[i2].c) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(s) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(aVarArr[i2 - 1].b) : layout.getPrimaryHorizontal(aVarArr[i2 + 1].b) : layout.getLineRight(s);
    }

    public final int d(int i, boolean z) {
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = this.b;
        int c = e43.c(arrayList, valueOf);
        int i2 = c < 0 ? -(c + 1) : c + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    public final int e(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.b.get(i - 1)).intValue();
    }

    public final int f(int i, int i2) {
        while (i > i2) {
            char charAt = this.a.getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((epx.g(charAt, 8192) < 0 || epx.g(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }
}
