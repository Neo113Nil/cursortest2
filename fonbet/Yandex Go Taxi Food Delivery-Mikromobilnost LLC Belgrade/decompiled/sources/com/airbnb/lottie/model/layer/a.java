package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.content.TextRangeUnits;
import defpackage.ae2;
import defpackage.bc;
import defpackage.be2;
import defpackage.byr;
import defpackage.cuz;
import defpackage.e131;
import defpackage.fge;
import defpackage.gqy0;
import defpackage.hqy0;
import defpackage.i35;
import defpackage.kor;
import defpackage.l35;
import defpackage.lb7;
import defpackage.lfc;
import defpackage.m2v;
import defpackage.mxx;
import defpackage.nsz;
import defpackage.puz;
import defpackage.qhr0;
import defpackage.rnz;
import defpackage.vtz;
import defpackage.xqy0;
import defpackage.xxr;
import defpackage.yqy0;
import defpackage.zw21;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes10.dex */
public final class a extends l35 {
    public final StringBuilder C;
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final RectF G;
    public final Matrix H;
    public final Paint I;
    public final Paint J;
    public final HashMap K;
    public final rnz L;
    public final ArrayList M;
    public final ArrayList N;
    public final hqy0 O;
    public final LottieDrawable P;
    public final nsz Q;
    public final TextRangeUnits R;
    public final lfc S;
    public e131 T;
    public final lfc U;
    public e131 V;
    public final kor W;
    public e131 X;
    public final kor Y;
    public e131 Z;
    public final lfc a0;
    public e131 b0;
    public e131 c0;
    public final lfc d0;
    public final lfc e0;
    public final lfc f0;

    public a(LottieDrawable lottieDrawable, mxx mxxVar) {
        super(lottieDrawable, mxxVar);
        m2v m2vVar;
        m2v m2vVar2;
        ae2 ae2Var;
        m2v m2vVar3;
        ae2 ae2Var2;
        m2v m2vVar4;
        ae2 ae2Var3;
        bc bcVar;
        ae2 ae2Var4;
        bc bcVar2;
        be2 be2Var;
        bc bcVar3;
        be2 be2Var2;
        bc bcVar4;
        ae2 ae2Var5;
        bc bcVar5;
        ae2 ae2Var6;
        this.C = new StringBuilder(2);
        this.D = new StringBuilder(0);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new RectF();
        this.H = new Matrix();
        final int i = 1;
        this.I = new Paint(i) { // from class: com.airbnb.lottie.model.layer.TextLayer$1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.J = new Paint(i) { // from class: com.airbnb.lottie.model.layer.TextLayer$2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.K = new HashMap();
        this.L = new rnz();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.R = TextRangeUnits.INDEX;
        this.P = lottieDrawable;
        this.Q = mxxVar.b;
        hqy0 hqy0Var = new hqy0((List) mxxVar.q.b);
        this.O = hqy0Var;
        hqy0Var.a(this);
        c(hqy0Var);
        lb7 lb7Var = mxxVar.r;
        if (lb7Var != null && (bcVar5 = (bc) lb7Var.b) != null && (ae2Var6 = (ae2) bcVar5.a) != null) {
            i35 I = ae2Var6.I();
            this.S = (lfc) I;
            I.a(this);
            c(I);
        }
        if (lb7Var != null && (bcVar4 = (bc) lb7Var.b) != null && (ae2Var5 = (ae2) bcVar4.b) != null) {
            i35 I2 = ae2Var5.I();
            this.U = (lfc) I2;
            I2.a(this);
            c(I2);
        }
        if (lb7Var != null && (bcVar3 = (bc) lb7Var.b) != null && (be2Var2 = (be2) bcVar3.c) != null) {
            kor I3 = be2Var2.I();
            this.W = I3;
            I3.a(this);
            c(I3);
        }
        if (lb7Var != null && (bcVar2 = (bc) lb7Var.b) != null && (be2Var = (be2) bcVar2.w) != null) {
            kor I4 = be2Var.I();
            this.Y = I4;
            I4.a(this);
            c(I4);
        }
        if (lb7Var != null && (bcVar = (bc) lb7Var.b) != null && (ae2Var4 = (ae2) bcVar.x) != null) {
            i35 I5 = ae2Var4.I();
            this.a0 = (lfc) I5;
            I5.a(this);
            c(I5);
        }
        if (lb7Var != null && (m2vVar4 = (m2v) lb7Var.c) != null && (ae2Var3 = (ae2) m2vVar4.a) != null) {
            i35 I6 = ae2Var3.I();
            this.d0 = (lfc) I6;
            I6.a(this);
            c(I6);
        }
        if (lb7Var != null && (m2vVar3 = (m2v) lb7Var.c) != null && (ae2Var2 = (ae2) m2vVar3.b) != null) {
            i35 I7 = ae2Var2.I();
            this.e0 = (lfc) I7;
            I7.a(this);
            c(I7);
        }
        if (lb7Var != null && (m2vVar2 = (m2v) lb7Var.c) != null && (ae2Var = (ae2) m2vVar2.c) != null) {
            i35 I8 = ae2Var.I();
            this.f0 = (lfc) I8;
            I8.a(this);
            c(I8);
        }
        if (lb7Var == null || (m2vVar = (m2v) lb7Var.c) == null) {
            return;
        }
        this.R = (TextRangeUnits) m2vVar.w;
    }

    public static void s(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void t(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.l35, defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        nsz nszVar = this.Q;
        rectF.set(0.0f, 0.0f, nszVar.k.width(), nszVar.k.height());
    }

    @Override // defpackage.l35, defpackage.tix
    public final void g(puz puzVar, Object obj) {
        super.g(puzVar, obj);
        PointF pointF = cuz.a;
        if (obj == 1) {
            e131 e131Var = this.T;
            if (e131Var != null) {
                m(e131Var);
            }
            if (puzVar == null) {
                this.T = null;
                return;
            }
            e131 e131Var2 = new e131(puzVar, null);
            this.T = e131Var2;
            e131Var2.a(this);
            c(this.T);
            return;
        }
        if (obj == 2) {
            e131 e131Var3 = this.V;
            if (e131Var3 != null) {
                m(e131Var3);
            }
            if (puzVar == null) {
                this.V = null;
                return;
            }
            e131 e131Var4 = new e131(puzVar, null);
            this.V = e131Var4;
            e131Var4.a(this);
            c(this.V);
            return;
        }
        if (obj == cuz.q) {
            e131 e131Var5 = this.X;
            if (e131Var5 != null) {
                m(e131Var5);
            }
            if (puzVar == null) {
                this.X = null;
                return;
            }
            e131 e131Var6 = new e131(puzVar, null);
            this.X = e131Var6;
            e131Var6.a(this);
            c(this.X);
            return;
        }
        if (obj == cuz.r) {
            e131 e131Var7 = this.Z;
            if (e131Var7 != null) {
                m(e131Var7);
            }
            if (puzVar == null) {
                this.Z = null;
                return;
            }
            e131 e131Var8 = new e131(puzVar, null);
            this.Z = e131Var8;
            e131Var8.a(this);
            c(this.Z);
            return;
        }
        if (obj == cuz.D) {
            e131 e131Var9 = this.b0;
            if (e131Var9 != null) {
                m(e131Var9);
            }
            if (puzVar == null) {
                this.b0 = null;
                return;
            }
            e131 e131Var10 = new e131(puzVar, null);
            this.b0 = e131Var10;
            e131Var10.a(this);
            c(this.b0);
            return;
        }
        if (obj != cuz.K) {
            if (obj == cuz.M) {
                hqy0 hqy0Var = this.O;
                hqy0Var.getClass();
                hqy0Var.k(new gqy0(new vtz(), puzVar, new DocumentData()));
                return;
            }
            return;
        }
        e131 e131Var11 = this.c0;
        if (e131Var11 != null) {
            m(e131Var11);
        }
        if (puzVar == null) {
            this.c0 = null;
            return;
        }
        e131 e131Var12 = new e131(puzVar, null);
        this.c0 = e131Var12;
        e131Var12.a(this);
        c(this.c0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x03d7, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r20 = r1;
        r1 = r25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02a9  */
    @Override // defpackage.l35
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Canvas canvas, Matrix matrix, int i, com.airbnb.lottie.utils.a aVar) {
        Typeface typeface;
        float floatValue;
        int size;
        int i2;
        List list;
        int i3;
        xxr xxrVar;
        float f;
        List list2;
        Bidi bidi;
        float floatValue2;
        int i4;
        int i5;
        int i6;
        List list3;
        int i7;
        List list4;
        DocumentData documentData = (DocumentData) this.O.f();
        nsz nszVar = this.Q;
        xxr xxrVar2 = (xxr) nszVar.f.get(documentData.b);
        if (xxrVar2 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        r(documentData, i, 0);
        LottieDrawable lottieDrawable = this.P;
        boolean useTextGlyphs = lottieDrawable.useTextGlyphs();
        Paint paint = this.I;
        Paint paint2 = this.J;
        kor korVar = this.Y;
        int i8 = 0;
        byte b = 2;
        if (useTextGlyphs) {
            e131 e131Var = this.b0;
            float floatValue3 = e131Var != null ? ((Float) e131Var.f()).floatValue() : documentData.c;
            float f2 = 0.0f;
            float[] fArr = (float[]) zw21.e.get();
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f3 = zw21.f;
            fArr[2] = f3;
            fArr[3] = f3;
            float f4 = floatValue3 / 100.0f;
            matrix.mapPoints(fArr);
            float f5 = fArr[2];
            float f6 = fArr[0];
            float f7 = fArr[3];
            float f8 = fArr[1];
            List asList = Arrays.asList(documentData.a.replaceAll(Constants.LINE_SEPARATOR, "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
            int size2 = asList.size();
            float f9 = documentData.e / 10.0f;
            e131 e131Var2 = this.Z;
            if (e131Var2 != null) {
                floatValue2 = ((Float) e131Var2.f()).floatValue();
            } else {
                if (korVar != null) {
                    floatValue2 = ((Float) korVar.f()).floatValue();
                }
                float f10 = f9;
                i4 = 0;
                int i9 = -1;
                while (i4 < size2) {
                    String str = (String) asList.get(i4);
                    PointF pointF = documentData.m;
                    int i10 = size2;
                    float f11 = f4;
                    int i11 = i4;
                    List x = x(str, pointF == null ? f2 : pointF.x, xxrVar2, f11, f10, true);
                    int i12 = i8;
                    while (i12 < x.size()) {
                        yqy0 yqy0Var = (yqy0) x.get(i12);
                        int i13 = i9 + 1;
                        canvas.save();
                        List list5 = x;
                        if (w(canvas, documentData, i13, yqy0Var.b)) {
                            String str2 = yqy0Var.a;
                            i5 = i12;
                            int i14 = i8;
                            while (i14 < str2.length()) {
                                String str3 = str2;
                                float f12 = f10;
                                byr byrVar = (byr) nszVar.h.b(byr.a(str2.charAt(i14), xxrVar2.a, xxrVar2.c));
                                if (byrVar == null) {
                                    i6 = i14;
                                    list3 = asList;
                                    i7 = i13;
                                } else {
                                    r(documentData, i, i14);
                                    HashMap hashMap = this.K;
                                    if (hashMap.containsKey(byrVar)) {
                                        list4 = (List) hashMap.get(byrVar);
                                        i6 = i14;
                                        list3 = asList;
                                        i7 = i13;
                                    } else {
                                        ArrayList arrayList = byrVar.a;
                                        i6 = i14;
                                        int size3 = arrayList.size();
                                        list3 = asList;
                                        ArrayList arrayList2 = new ArrayList(size3);
                                        i7 = i13;
                                        int i15 = i8;
                                        while (i15 < size3) {
                                            arrayList2.add(new fge(lottieDrawable, this, (qhr0) arrayList.get(i15), nszVar));
                                            i15++;
                                            size3 = size3;
                                            arrayList = arrayList;
                                        }
                                        hashMap.put(byrVar, arrayList2);
                                        list4 = arrayList2;
                                    }
                                    int i16 = i8;
                                    while (i16 < list4.size()) {
                                        Path path = ((fge) list4.get(i16)).getPath();
                                        path.computeBounds(this.G, i8);
                                        Matrix matrix2 = this.H;
                                        matrix2.reset();
                                        List list6 = list4;
                                        matrix2.preTranslate(f2, (-documentData.g) * zw21.c());
                                        matrix2.preScale(f11, f11);
                                        path.transform(matrix2);
                                        if (documentData.k) {
                                            t(path, paint, canvas);
                                            t(path, paint2, canvas);
                                        } else {
                                            t(path, paint2, canvas);
                                            t(path, paint, canvas);
                                        }
                                        i16++;
                                        list4 = list6;
                                        i8 = 0;
                                        f2 = 0.0f;
                                    }
                                    canvas.translate((zw21.c() * ((float) byrVar.c) * f11) + f12, 0.0f);
                                }
                                i14 = i6 + 1;
                                f10 = f12;
                                str2 = str3;
                                asList = list3;
                                i13 = i7;
                                i8 = 0;
                                f2 = 0.0f;
                            }
                        } else {
                            i5 = i12;
                        }
                        float f13 = f10;
                        List list7 = asList;
                        int i17 = i13;
                        canvas.restore();
                        i12 = i5 + 1;
                        x = list5;
                        f10 = f13;
                        asList = list7;
                        i9 = i17;
                        i8 = 0;
                        f2 = 0.0f;
                    }
                    i4 = i11 + 1;
                    f4 = f11;
                    size2 = i10;
                    i8 = 0;
                    f2 = 0.0f;
                }
            }
            f9 += floatValue2;
            float f102 = f9;
            i4 = 0;
            int i92 = -1;
            while (i4 < size2) {
            }
        } else {
            e131 e131Var3 = this.c0;
            if ((e131Var3 == null || (typeface = (Typeface) e131Var3.f()) == null) && (typeface = lottieDrawable.getTypeface(xxrVar2)) == null) {
                typeface = xxrVar2.d;
            }
            if (typeface != null) {
                String str4 = documentData.a;
                lottieDrawable.getTextDelegate();
                paint.setTypeface(typeface);
                e131 e131Var4 = this.b0;
                float floatValue4 = e131Var4 != null ? ((Float) e131Var4.f()).floatValue() : documentData.c;
                paint.setTextSize(zw21.c() * floatValue4);
                paint2.setTypeface(paint.getTypeface());
                paint2.setTextSize(paint.getTextSize());
                float f14 = documentData.e / 10.0f;
                e131 e131Var5 = this.Z;
                if (e131Var5 != null) {
                    floatValue = ((Float) e131Var5.f()).floatValue();
                } else {
                    if (korVar != null) {
                        floatValue = ((Float) korVar.f()).floatValue();
                    }
                    float c = ((zw21.c() * f14) * floatValue4) / 100.0f;
                    List asList2 = Arrays.asList(str4.replaceAll(Constants.LINE_SEPARATOR, "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                    size = asList2.size();
                    i2 = 0;
                    int i18 = -1;
                    int i19 = 0;
                    while (i2 < size) {
                        String str5 = (String) asList2.get(i2);
                        PointF pointF2 = documentData.m;
                        float f15 = c;
                        List x2 = x(str5, pointF2 == null ? 0.0f : pointF2.x, xxrVar2, 0.0f, f15, false);
                        int i20 = 0;
                        while (i20 < x2.size()) {
                            yqy0 yqy0Var2 = (yqy0) x2.get(i20);
                            int i21 = i18 + 1;
                            canvas.save();
                            if (w(canvas, documentData, i21, paint.measureText(yqy0Var2.a))) {
                                String str6 = yqy0Var2.a;
                                list = x2;
                                i3 = i20;
                                xxrVar = xxrVar2;
                                if (Bidi.requiresBidi(str6.toCharArray(), 0, str6.length())) {
                                    Bidi bidi2 = new Bidi(str6, -2);
                                    int runCount = bidi2.getRunCount();
                                    byte[] bArr = new byte[runCount];
                                    f = f15;
                                    Integer[] numArr = new Integer[runCount];
                                    i18 = i21;
                                    int i22 = 0;
                                    while (i22 < runCount) {
                                        bArr[i22] = (byte) bidi2.getRunLevel(i22);
                                        numArr[i22] = Integer.valueOf(i22);
                                        i22++;
                                        asList2 = asList2;
                                    }
                                    list2 = asList2;
                                    Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                    StringBuilder sb = this.E;
                                    sb.setLength(0);
                                    int i23 = 0;
                                    while (i23 < runCount) {
                                        int intValue = numArr[i23].intValue();
                                        int i24 = runCount;
                                        int runStart = bidi2.getRunStart(intValue);
                                        Integer[] numArr2 = numArr;
                                        int runLimit = bidi2.getRunLimit(intValue);
                                        int runLevel = bidi2.getRunLevel(intValue);
                                        String substring = str6.substring(runStart, runLimit);
                                        if ((runLevel & 1) == 0) {
                                            sb.append(substring);
                                            bidi = bidi2;
                                        } else {
                                            StringBuilder sb2 = this.F;
                                            int i25 = 0;
                                            sb2.setLength(0);
                                            bidi = bidi2;
                                            while (i25 < substring.length()) {
                                                String q = q(i25, substring);
                                                sb2.insert(0, q);
                                                i25 += q.length();
                                                substring = substring;
                                            }
                                            sb.append((CharSequence) sb2);
                                        }
                                        i23++;
                                        runCount = i24;
                                        numArr = numArr2;
                                        bidi2 = bidi;
                                    }
                                    str6 = sb.toString();
                                } else {
                                    f = f15;
                                    i18 = i21;
                                    list2 = asList2;
                                }
                                ArrayList arrayList3 = this.M;
                                arrayList3.clear();
                                int i26 = 0;
                                while (i26 < str6.length()) {
                                    String q2 = q(i26, str6);
                                    arrayList3.add(q2);
                                    i26 += q2.length();
                                }
                                int i27 = 0;
                                while (i27 < arrayList3.size()) {
                                    StringBuilder sb3 = this.D;
                                    sb3.setLength(0);
                                    sb3.append((String) arrayList3.get(i27));
                                    int i28 = i27 + 1;
                                    while (i28 < arrayList3.size()) {
                                        String str7 = (String) arrayList3.get(i28);
                                        int i29 = 0;
                                        while (i29 < str7.length()) {
                                            ArrayList arrayList4 = arrayList3;
                                            byte b2 = b;
                                            if (Character.getDirectionality(str7.codePointAt(i29)) == b2) {
                                                break;
                                            }
                                            i29++;
                                            b = b2;
                                            arrayList3 = arrayList4;
                                        }
                                    }
                                    ArrayList arrayList5 = arrayList3;
                                    byte b3 = b;
                                    String sb4 = sb3.toString();
                                    r(documentData, i, i19 + i27);
                                    if (documentData.k) {
                                        s(sb4, paint, canvas);
                                        s(sb4, paint2, canvas);
                                    } else {
                                        s(sb4, paint2, canvas);
                                        s(sb4, paint, canvas);
                                    }
                                    canvas.translate(paint.measureText(sb4) + f, 0.0f);
                                    b = b3;
                                    i27 = i28;
                                    arrayList3 = arrayList5;
                                }
                            } else {
                                list = x2;
                                i3 = i20;
                                xxrVar = xxrVar2;
                                f = f15;
                                i18 = i21;
                                list2 = asList2;
                            }
                            byte b4 = b;
                            i19 = yqy0Var2.a.length() + i19;
                            canvas.restore();
                            i20 = i3 + 1;
                            xxrVar2 = xxrVar;
                            b = b4;
                            f15 = f;
                            asList2 = list2;
                            x2 = list;
                        }
                        i2++;
                        xxrVar2 = xxrVar2;
                        c = f15;
                    }
                }
                f14 += floatValue;
                float c2 = ((zw21.c() * f14) * floatValue4) / 100.0f;
                List asList22 = Arrays.asList(str4.replaceAll(Constants.LINE_SEPARATOR, "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                size = asList22.size();
                i2 = 0;
                int i182 = -1;
                int i192 = 0;
                while (i2 < size) {
                }
            }
        }
        canvas.restore();
    }

    public final String q(int i, String str) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (Character.getType(codePointAt2) != 16 && Character.getType(codePointAt2) != 27 && Character.getType(codePointAt2) != 6 && Character.getType(codePointAt2) != 28 && Character.getType(codePointAt2) != 8 && Character.getType(codePointAt2) != 19) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        rnz rnzVar = this.L;
        if (rnzVar.e(j) >= 0) {
            return (String) rnzVar.c(j);
        }
        StringBuilder sb = this.C;
        sb.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb2 = sb.toString();
        rnzVar.h(j, sb2);
        return sb2;
    }

    public final void r(DocumentData documentData, int i, int i2) {
        e131 e131Var = this.T;
        Paint paint = this.I;
        if (e131Var != null) {
            paint.setColor(((Integer) e131Var.f()).intValue());
        } else {
            lfc lfcVar = this.S;
            if (lfcVar == null || !v(i2)) {
                paint.setColor(documentData.h);
            } else {
                paint.setColor(((Integer) lfcVar.f()).intValue());
            }
        }
        e131 e131Var2 = this.V;
        Paint paint2 = this.J;
        if (e131Var2 != null) {
            paint2.setColor(((Integer) e131Var2.f()).intValue());
        } else {
            lfc lfcVar2 = this.U;
            if (lfcVar2 == null || !v(i2)) {
                paint2.setColor(documentData.i);
            } else {
                paint2.setColor(((Integer) lfcVar2.f()).intValue());
            }
        }
        i35 i35Var = this.w.p;
        int i3 = 100;
        int intValue = i35Var == null ? 100 : ((Integer) i35Var.f()).intValue();
        lfc lfcVar3 = this.a0;
        if (lfcVar3 != null && v(i2)) {
            i3 = ((Integer) lfcVar3.f()).intValue();
        }
        int round = Math.round((((i3 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i) / 255.0f);
        paint.setAlpha(round);
        paint2.setAlpha(round);
        e131 e131Var3 = this.X;
        if (e131Var3 != null) {
            paint2.setStrokeWidth(((Float) e131Var3.f()).floatValue());
            return;
        }
        kor korVar = this.W;
        if (korVar == null || !v(i2)) {
            paint2.setStrokeWidth(zw21.c() * documentData.j);
        } else {
            paint2.setStrokeWidth(((Float) korVar.f()).floatValue());
        }
    }

    public final yqy0 u(int i) {
        ArrayList arrayList = this.N;
        for (int size = arrayList.size(); size < i; size++) {
            yqy0 yqy0Var = new yqy0();
            yqy0Var.a = "";
            yqy0Var.b = 0.0f;
            arrayList.add(yqy0Var);
        }
        return (yqy0) arrayList.get(i - 1);
    }

    public final boolean v(int i) {
        lfc lfcVar;
        int length = ((DocumentData) this.O.f()).a.length();
        lfc lfcVar2 = this.d0;
        if (lfcVar2 == null || (lfcVar = this.e0) == null) {
            return true;
        }
        int min = Math.min(((Integer) lfcVar2.f()).intValue(), ((Integer) lfcVar.f()).intValue());
        int max = Math.max(((Integer) lfcVar2.f()).intValue(), ((Integer) lfcVar.f()).intValue());
        lfc lfcVar3 = this.f0;
        if (lfcVar3 != null) {
            int intValue = ((Integer) lfcVar3.f()).intValue();
            min += intValue;
            max += intValue;
        }
        if (this.R == TextRangeUnits.INDEX) {
            return i >= min && i < max;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) min) && f < ((float) max);
    }

    public final boolean w(Canvas canvas, DocumentData documentData, int i, float f) {
        PointF pointF = documentData.l;
        PointF pointF2 = documentData.m;
        float c = zw21.c();
        float f2 = (i * documentData.f * c) + (pointF == null ? 0.0f : (documentData.f * c) + pointF.y);
        if (this.P.getClipTextToBoundingBox() && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + documentData.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = xqy0.a[documentData.d.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
            return true;
        }
        if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (i2 != 3) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List x(String str, float f, xxr xxrVar, float f2, float f3, boolean z) {
        float measureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                byr byrVar = (byr) this.Q.h.b(byr.a(charAt, xxrVar.a, xxrVar.c));
                if (byrVar != null) {
                    measureText = (zw21.c() * ((float) byrVar.c) * f2) + f3;
                }
            } else {
                measureText = this.I.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (charAt == ' ') {
                z2 = true;
                f6 = measureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = measureText;
            } else {
                f5 += measureText;
            }
            f4 += measureText;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                yqy0 u = u(i);
                if (i3 == i2) {
                    u.a = str.substring(i2, i4).trim();
                    u.b = (f4 - measureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = measureText;
                    f5 = f4;
                } else {
                    u.a = str.substring(i2, i3 - 1).trim();
                    u.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            yqy0 u2 = u(i);
            u2.a = str.substring(i2);
            u2.b = f4;
        }
        return this.N.subList(0, i);
    }
}
