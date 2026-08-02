package xsna;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: MultiParagraph.kt */
/* loaded from: classes11.dex */
public final class m540 {
    public final n540 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public m540(n540 n540Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int h;
        int i5;
        this.a = n540Var;
        this.b = i;
        if (o6j.k(j) != 0 || o6j.j(j) != 0) {
            vzw.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = n540Var.e;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            bh90 bh90Var = (bh90) arrayList2.get(i6);
            bb2 bb2Var = bh90Var.a;
            int i8 = o6j.i(j);
            if (o6j.d(j)) {
                i4 = i6;
                h = o6j.h(j) - ((int) Math.ceil(f));
                if (h < 0) {
                    h = 0;
                }
            } else {
                i4 = i6;
                h = o6j.h(j);
            }
            i3 = 0;
            ya2 ya2Var = new ya2(bb2Var, this.b - i7, i2, s6j.b(0, i8, 0, h, 5));
            float c = ya2Var.c() + f;
            fjo0 fjo0Var = ya2Var.d;
            int i9 = i7 + fjo0Var.g;
            arrayList.add(new ah90(ya2Var, bh90Var.b, bh90Var.c, i7, i9, f, c));
            if (!fjo0Var.d) {
                if (i9 == this.b) {
                    i5 = i4;
                    if (i5 != e43.h(this.a.e)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i9;
                f = c;
            }
            z = true;
            i7 = i9;
            f = c;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = o6j.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            ah90 ah90Var = (ah90) arrayList.get(i10);
            List<zhf0> e = ah90Var.a.e();
            ArrayList arrayList4 = new ArrayList(e.size());
            int size3 = e.size();
            for (int i11 = i3; i11 < size3; i11++) {
                zhf0 zhf0Var = e.get(i11);
                arrayList4.add(zhf0Var != null ? ah90Var.a(zhf0Var) : null);
            }
            g5g.y(arrayList4, arrayList3);
        }
        if (arrayList3.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = j5g.u0(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public final void a(final long j, final float[] fArr) {
        l(qko0.f(j));
        m(qko0.e(j));
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        c4g0.q(this.h, j, new izs() { // from class: xsna.k540
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                long j2;
                ya2 ya2Var;
                boolean z;
                float a;
                float a2;
                ah90 ah90Var = (ah90) obj;
                int i = ah90Var.b;
                ya2 ya2Var2 = ah90Var.a;
                int i2 = ah90Var.c;
                long j3 = j;
                int f = i > qko0.f(j3) ? ah90Var.b : qko0.f(j3);
                if (i2 >= qko0.e(j3)) {
                    i2 = qko0.e(j3);
                }
                long c = jgz.c(ah90Var.d(f), ah90Var.d(i2));
                Ref$IntRef ref$IntRef2 = ref$IntRef;
                int i3 = ref$IntRef2.element;
                fjo0 fjo0Var = ya2Var2.d;
                int f2 = qko0.f(c);
                int e = qko0.e(c);
                Layout layout = fjo0Var.f;
                int length = layout.getText().length();
                if (f2 < 0) {
                    vzw.a("startOffset must be > 0");
                }
                if (f2 >= length) {
                    vzw.a("startOffset must be less than text length");
                }
                if (e <= f2) {
                    vzw.a("endOffset must be greater than startOffset");
                }
                if (e > length) {
                    vzw.a("endOffset must be smaller or equal to text length");
                }
                int i4 = (e - f2) * 4;
                float[] fArr2 = fArr;
                if (fArr2.length - i3 < i4) {
                    vzw.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                }
                int lineForOffset = layout.getLineForOffset(f2);
                int lineForOffset2 = layout.getLineForOffset(e - 1);
                gfv gfvVar = new gfv(fjo0Var);
                if (lineForOffset <= lineForOffset2) {
                    while (true) {
                        int lineStart = layout.getLineStart(lineForOffset);
                        int f3 = fjo0Var.f(lineForOffset);
                        int max = Math.max(f2, lineStart);
                        int min = Math.min(e, f3);
                        float g = fjo0Var.g(lineForOffset);
                        float e2 = fjo0Var.e(lineForOffset);
                        j2 = c;
                        ya2Var = ya2Var2;
                        boolean z2 = false;
                        boolean z3 = layout.getParagraphDirection(lineForOffset) == 1;
                        while (max < min) {
                            boolean isRtlCharAt = layout.isRtlCharAt(max);
                            if (!z3 || isRtlCharAt) {
                                if (z3 && isRtlCharAt) {
                                    z2 = false;
                                    float a3 = gfvVar.a(false, max, false, false);
                                    z = z3;
                                    a = gfvVar.a(true, max + 1, true, false);
                                    a2 = a3;
                                } else {
                                    z = z3;
                                    z2 = false;
                                    if (z || !isRtlCharAt) {
                                        a = gfvVar.a(false, max, false, false);
                                        a2 = gfvVar.a(true, max + 1, true, false);
                                    } else {
                                        a2 = gfvVar.a(false, max, false, true);
                                        a = gfvVar.a(true, max + 1, true, true);
                                    }
                                }
                                fArr2[i3] = a;
                                fArr2[i3 + 1] = g;
                                fArr2[i3 + 2] = a2;
                                fArr2[i3 + 3] = e2;
                                i3 += 4;
                                max++;
                                z3 = z;
                            } else {
                                a = gfvVar.a(z2, max, z2, true);
                                z = z3;
                                a2 = gfvVar.a(true, max + 1, true, true);
                            }
                            z2 = false;
                            fArr2[i3] = a;
                            fArr2[i3 + 1] = g;
                            fArr2[i3 + 2] = a2;
                            fArr2[i3 + 3] = e2;
                            i3 += 4;
                            max++;
                            z3 = z;
                        }
                        if (lineForOffset == lineForOffset2) {
                            break;
                        }
                        lineForOffset++;
                        ya2Var2 = ya2Var;
                        c = j2;
                    }
                } else {
                    j2 = c;
                    ya2Var = ya2Var2;
                }
                int d = (qko0.d(j2) * 4) + ref$IntRef2.element;
                int i5 = ref$IntRef2.element;
                while (true) {
                    Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                    if (i5 >= d) {
                        ref$IntRef2.element = d;
                        ref$FloatRef2.element = ya2Var.c() + ref$FloatRef2.element;
                        return s3q0.a;
                    }
                    int i6 = i5 + 1;
                    float f4 = fArr2[i6];
                    float f5 = ref$FloatRef2.element;
                    fArr2[i6] = f4 + f5;
                    int i7 = i5 + 3;
                    fArr2[i7] = fArr2[i7] + f5;
                    i5 += 4;
                }
            }
        });
    }

    public final float b(int i) {
        n(i);
        ArrayList arrayList = this.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.o(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        return ya2Var.d.e(i - ah90Var.d) + ah90Var.f;
    }

    public final int c(int i, boolean z) {
        int f;
        n(i);
        ArrayList arrayList = this.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.o(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        int i2 = i - ah90Var.d;
        fjo0 fjo0Var = ya2Var.d;
        if (z) {
            Layout layout = fjo0Var.f;
            ThreadLocal<qbo0> threadLocal = njo0.a;
            if (layout.getEllipsisCount(i2) <= 0 || fjo0Var.b != TextUtils.TruncateAt.END) {
                zny c = fjo0Var.c();
                Layout layout2 = c.a;
                f = c.f(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            f = fjo0Var.f(i2);
        }
        return f + ah90Var.b;
    }

    public final int d(int i) {
        int length = this.a.a.c.length();
        ArrayList arrayList = this.h;
        ah90 ah90Var = (ah90) arrayList.get(i >= length ? e43.h(arrayList) : i < 0 ? 0 : c4g0.n(i, arrayList));
        return ah90Var.a.d.f.getLineForOffset(ah90Var.d(i)) + ah90Var.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.p(arrayList, f));
        int i = ah90Var.c - ah90Var.b;
        int i2 = ah90Var.d;
        if (i == 0) {
            return i2;
        }
        ya2 ya2Var = ah90Var.a;
        float f2 = f - ah90Var.f;
        fjo0 fjo0Var = ya2Var.d;
        return fjo0Var.f.getLineForVertical(((int) f2) - fjo0Var.h) + i2;
    }

    public final int f(int i) {
        n(i);
        ArrayList arrayList = this.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.o(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        return ya2Var.d.f.getLineStart(i - ah90Var.d) + ah90Var.b;
    }

    public final float g(int i) {
        n(i);
        ArrayList arrayList = this.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.o(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        return ya2Var.d.g(i - ah90Var.d) + ah90Var.f;
    }

    public final int h(long j) {
        int i = (int) (j & 4294967295L);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.p(arrayList, intBitsToFloat));
        int i2 = ah90Var.c;
        int i3 = ah90Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        ya2 ya2Var = ah90Var.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - ah90Var.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
        fjo0 fjo0Var = ya2Var.d;
        int lineForVertical = fjo0Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits))) - fjo0Var.h);
        return fjo0Var.f.getOffsetForHorizontal(lineForVertical, (fjo0Var.b(lineForVertical) * (-1)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i3;
    }

    public final long i(zhf0 zhf0Var, int i, hio0 hio0Var) {
        long j;
        long j2;
        float f = zhf0Var.b;
        ArrayList arrayList = this.h;
        int p = c4g0.p(arrayList, f);
        float f2 = ((ah90) arrayList.get(p)).g;
        float f3 = zhf0Var.d;
        if (f2 >= f3 || p == e43.h(arrayList)) {
            ah90 ah90Var = (ah90) arrayList.get(p);
            return ah90Var.b(ah90Var.a.f(ah90Var.c(zhf0Var), i, hio0Var), true);
        }
        int p2 = c4g0.p(arrayList, f3);
        long j3 = qko0.b;
        while (true) {
            j = qko0.b;
            if (!qko0.b(j3, j) || p > p2) {
                break;
            }
            ah90 ah90Var2 = (ah90) arrayList.get(p);
            j3 = ah90Var2.b(ah90Var2.a.f(ah90Var2.c(zhf0Var), i, hio0Var), true);
            p++;
        }
        if (qko0.b(j3, j)) {
            return j;
        }
        while (true) {
            j2 = qko0.b;
            if (!qko0.b(j, j2) || p > p2) {
                break;
            }
            ah90 ah90Var3 = (ah90) arrayList.get(p2);
            j = ah90Var3.b(ah90Var3.a.f(ah90Var3.c(zhf0Var), i, hio0Var), true);
            p2--;
        }
        return qko0.b(j, j2) ? j3 : jgz.c((int) (j3 >> 32), (int) (4294967295L & j));
    }

    public final void j(yq9 yq9Var, long j, v4j0 v4j0Var, pdo0 pdo0Var, qio qioVar) {
        yq9Var.e();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ah90 ah90Var = (ah90) arrayList.get(i);
            ah90Var.a.i(yq9Var, j, v4j0Var, pdo0Var, qioVar);
            yq9Var.p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ah90Var.a.c());
        }
        yq9Var.a();
    }

    public final void k(yq9 yq9Var, yk8 yk8Var, float f, v4j0 v4j0Var, pdo0 pdo0Var, qio qioVar) {
        yq9Var.e();
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 1) {
            f870.j(this, yq9Var, yk8Var, f, v4j0Var, pdo0Var, qioVar);
        } else if (yk8Var instanceof rek0) {
            f870.j(this, yq9Var, yk8Var, f, v4j0Var, pdo0Var, qioVar);
        } else {
            if (!(yk8Var instanceof n4j0)) {
                throw new NoWhenBranchMatchedException();
            }
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                ah90 ah90Var = (ah90) arrayList.get(i);
                f3 += ah90Var.a.c();
                f2 = Math.max(f2, ah90Var.a.g());
            }
            Shader c = ((n4j0) yk8Var).c((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
            Matrix matrix = new Matrix();
            c.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ya2 ya2Var = ((ah90) arrayList.get(i2)).a;
                ya2Var.j(yq9Var, new bl8(c), f, v4j0Var, pdo0Var, qioVar);
                yq9Var.p(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ya2Var.c());
                matrix.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -ya2Var.c());
                c.setLocalMatrix(matrix);
            }
        }
        yq9Var.a();
    }

    public final void l(int i) {
        boolean z = false;
        n540 n540Var = this.a;
        if (i >= 0 && i < n540Var.a.c.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder b = ji.b(i, "offset(", ") is out of bounds [0, ");
        b.append(n540Var.a.c.length());
        b.append(')');
        vzw.a(b.toString());
    }

    public final void m(int i) {
        boolean z = false;
        n540 n540Var = this.a;
        if (i >= 0 && i <= n540Var.a.c.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder b = ji.b(i, "offset(", ") is out of bounds [0, ");
        b.append(n540Var.a.c.length());
        b.append(']');
        vzw.a(b.toString());
    }

    public final void n(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        vzw.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
