package xsna;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.content.TextRangeUnits;
import com.airbnb.lottie.model.layer.Layer;
import com.unity3d.services.UnityAdsConstants;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TextLayer.java */
/* loaded from: classes12.dex */
public final class ejo0 extends com.airbnb.lottie.model.layer.a {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final a J;
    public final b K;
    public final HashMap L;
    public final x500<String> M;
    public final ArrayList N;
    public final ArrayList O;
    public final vio0 P;
    public final k800 Q;
    public final i700 R;
    public final TextRangeUnits S;

    @Nullable
    public final u6g T;

    @Nullable
    public pjr0 U;

    @Nullable
    public final u6g V;

    @Nullable
    public pjr0 W;

    @Nullable
    public final hqr X;

    @Nullable
    public pjr0 Y;

    @Nullable
    public final hqr Z;

    @Nullable
    public pjr0 a0;

    @Nullable
    public final u9x b0;

    @Nullable
    public pjr0 c0;

    @Nullable
    public pjr0 d0;

    @Nullable
    public final u9x e0;

    @Nullable
    public final u9x f0;

    @Nullable
    public final u9x g0;

    /* compiled from: TextLayer.java */
    public class a extends Paint {
    }

    /* compiled from: TextLayer.java */
    public class b extends Paint {
    }

    /* compiled from: TextLayer.java */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DocumentData.Justification.values().length];
            a = iArr;
            try {
                iArr[DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TextLayer.java */
    public static class d {
        public String a = "";
        public float b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public ejo0(k800 k800Var, Layer layer) {
        super(k800Var, layer);
        bg2 bg2Var;
        bg2 bg2Var2;
        pf2 pf2Var;
        bg2 bg2Var3;
        pf2 pf2Var2;
        bg2 bg2Var4;
        pf2 pf2Var3;
        cg2 cg2Var;
        pf2 pf2Var4;
        cg2 cg2Var2;
        nf2 nf2Var;
        cg2 cg2Var3;
        nf2 nf2Var2;
        cg2 cg2Var4;
        mf2 mf2Var;
        cg2 cg2Var5;
        mf2 mf2Var2;
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        a aVar = new a(1);
        aVar.setStyle(Paint.Style.FILL);
        this.J = aVar;
        b bVar = new b(1);
        bVar.setStyle(Paint.Style.STROKE);
        this.K = bVar;
        this.L = new HashMap();
        this.M = new x500<>();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = TextRangeUnits.INDEX;
        this.Q = k800Var;
        this.R = layer.b;
        vio0 vio0Var = new vio0((List) layer.q.c);
        this.P = vio0Var;
        vio0Var.a(this);
        h(vio0Var);
        zf2 zf2Var = layer.r;
        if (zf2Var != null && (cg2Var5 = zf2Var.a) != null && (mf2Var2 = cg2Var5.a) != null) {
            tf6<?, ?> j = mf2Var2.j();
            this.T = (u6g) j;
            j.a(this);
            h(j);
        }
        if (zf2Var != null && (cg2Var4 = zf2Var.a) != null && (mf2Var = cg2Var4.b) != null) {
            tf6<?, ?> j2 = mf2Var.j();
            this.V = (u6g) j2;
            j2.a(this);
            h(j2);
        }
        if (zf2Var != null && (cg2Var3 = zf2Var.a) != null && (nf2Var2 = cg2Var3.c) != null) {
            hqr j3 = nf2Var2.j();
            this.X = j3;
            j3.a(this);
            h(j3);
        }
        if (zf2Var != null && (cg2Var2 = zf2Var.a) != null && (nf2Var = cg2Var2.d) != null) {
            hqr j4 = nf2Var.j();
            this.Z = j4;
            j4.a(this);
            h(j4);
        }
        if (zf2Var != null && (cg2Var = zf2Var.a) != null && (pf2Var4 = cg2Var.e) != null) {
            tf6<?, ?> j5 = pf2Var4.j();
            this.b0 = (u9x) j5;
            j5.a(this);
            h(j5);
        }
        if (zf2Var != null && (bg2Var4 = zf2Var.b) != null && (pf2Var3 = bg2Var4.a) != null) {
            tf6<?, ?> j6 = pf2Var3.j();
            this.e0 = (u9x) j6;
            j6.a(this);
            h(j6);
        }
        if (zf2Var != null && (bg2Var3 = zf2Var.b) != null && (pf2Var2 = bg2Var3.b) != null) {
            tf6<?, ?> j7 = pf2Var2.j();
            this.f0 = (u9x) j7;
            j7.a(this);
            h(j7);
        }
        if (zf2Var != null && (bg2Var2 = zf2Var.b) != null && (pf2Var = bg2Var2.c) != null) {
            tf6<?, ?> j8 = pf2Var.j();
            this.g0 = (u9x) j8;
            j8.a(this);
            h(j8);
        }
        if (zf2Var == null || (bg2Var = zf2Var.b) == null) {
            return;
        }
        this.S = bg2Var.d;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawText(str, 0, str.length(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // com.airbnb.lottie.model.layer.a, xsna.vdy
    public final <T> void f(T t, @Nullable a900<T> a900Var) {
        super.f(t, a900Var);
        PointF pointF = t800.a;
        if (t == 1) {
            pjr0 pjr0Var = this.U;
            if (pjr0Var != null) {
                o(pjr0Var);
            }
            if (a900Var == null) {
                this.U = null;
                return;
            }
            pjr0 pjr0Var2 = new pjr0(null, a900Var);
            this.U = pjr0Var2;
            pjr0Var2.a(this);
            h(this.U);
            return;
        }
        if (t == 2) {
            pjr0 pjr0Var3 = this.W;
            if (pjr0Var3 != null) {
                o(pjr0Var3);
            }
            if (a900Var == null) {
                this.W = null;
                return;
            }
            pjr0 pjr0Var4 = new pjr0(null, a900Var);
            this.W = pjr0Var4;
            pjr0Var4.a(this);
            h(this.W);
            return;
        }
        if (t == t800.q) {
            pjr0 pjr0Var5 = this.Y;
            if (pjr0Var5 != null) {
                o(pjr0Var5);
            }
            if (a900Var == null) {
                this.Y = null;
                return;
            }
            pjr0 pjr0Var6 = new pjr0(null, a900Var);
            this.Y = pjr0Var6;
            pjr0Var6.a(this);
            h(this.Y);
            return;
        }
        if (t == t800.r) {
            pjr0 pjr0Var7 = this.a0;
            if (pjr0Var7 != null) {
                o(pjr0Var7);
            }
            if (a900Var == null) {
                this.a0 = null;
                return;
            }
            pjr0 pjr0Var8 = new pjr0(null, a900Var);
            this.a0 = pjr0Var8;
            pjr0Var8.a(this);
            h(this.a0);
            return;
        }
        if (t == t800.D) {
            pjr0 pjr0Var9 = this.c0;
            if (pjr0Var9 != null) {
                o(pjr0Var9);
            }
            if (a900Var == null) {
                this.c0 = null;
                return;
            }
            pjr0 pjr0Var10 = new pjr0(null, a900Var);
            this.c0 = pjr0Var10;
            pjr0Var10.a(this);
            h(this.c0);
            return;
        }
        if (t != t800.K) {
            if (t == t800.M) {
                vio0 vio0Var = this.P;
                vio0Var.getClass();
                vio0Var.k(new uio0(new p800(), a900Var, new DocumentData()));
                return;
            }
            return;
        }
        pjr0 pjr0Var11 = this.d0;
        if (pjr0Var11 != null) {
            o(pjr0Var11);
        }
        if (a900Var == null) {
            this.d0 = null;
            return;
        }
        pjr0 pjr0Var12 = new pjr0(null, a900Var);
        this.d0 = pjr0Var12;
        pjr0Var12.a(this);
        h(this.d0);
    }

    @Override // com.airbnb.lottie.model.layer.a, xsna.plo
    public final void g(RectF rectF, Matrix matrix, boolean z) {
        super.g(rectF, matrix, z);
        i700 i700Var = this.R;
        rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i700Var.k.width(), i700Var.k.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0507, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03d5  */
    @Override // com.airbnb.lottie.model.layer.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(Canvas canvas, Matrix matrix, int i, @Nullable com.airbnb.lottie.utils.a aVar) {
        int i2;
        String str;
        Typeface typeface;
        float floatValue;
        int size;
        int i3;
        List<d> list;
        int i4;
        o4s o4sVar;
        float f;
        List list2;
        int i5;
        Bidi bidi;
        Canvas canvas2;
        float floatValue2;
        int i6;
        List<d> list3;
        String str2;
        int i7;
        int i8;
        int i9;
        k800 k800Var;
        List list4;
        b bVar;
        a aVar2;
        b bVar2;
        a aVar3;
        DocumentData f2 = this.P.f();
        i700 i700Var = this.R;
        o4s o4sVar2 = (o4s) i700Var.f.get(f2.b);
        if (o4sVar2 == null) {
            return;
        }
        String str3 = o4sVar2.c;
        String str4 = o4sVar2.a;
        canvas.save();
        canvas.concat(matrix);
        t(f2, i, 0);
        k800 k800Var2 = this.Q;
        Map<String, Typeface> map = k800Var2.m;
        hqr hqrVar = this.Z;
        int i10 = 0;
        a aVar4 = this.J;
        b bVar3 = this.K;
        if (map == null) {
            i2 = 2;
            if (k800Var2.b.h.d > 0) {
                pjr0 pjr0Var = this.c0;
                float floatValue3 = pjr0Var != null ? ((Float) pjr0Var.f()).floatValue() : f2.c;
                float[] fArr = b3r0.e.get();
                float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                float[] fArr2 = fArr;
                fArr2[0] = 0.0f;
                fArr2[1] = 0.0f;
                float f4 = b3r0.f;
                fArr2[2] = f4;
                fArr2[3] = f4;
                float f5 = floatValue3 / 100.0f;
                matrix.mapPoints(fArr2);
                a aVar5 = aVar4;
                k800 k800Var3 = k800Var2;
                i700 i700Var2 = i700Var;
                String str5 = str3;
                Math.hypot(fArr2[2] - fArr2[0], fArr2[3] - fArr2[1]);
                List asList = Arrays.asList(f2.a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                int size2 = asList.size();
                float f6 = f2.e / 10.0f;
                pjr0 pjr0Var2 = this.a0;
                if (pjr0Var2 == null) {
                    if (hqrVar != null) {
                        floatValue2 = hqrVar.f().floatValue();
                    }
                    float f7 = f6;
                    i6 = 0;
                    int i11 = -1;
                    while (i6 < size2) {
                        String str6 = (String) asList.get(i6);
                        PointF pointF = f2.m;
                        float f8 = f5;
                        List<d> z = z(str6, pointF == null ? f3 : pointF.x, o4sVar2, f8, f7, true);
                        int i12 = i10;
                        while (i12 < z.size()) {
                            d dVar = z.get(i12);
                            i11++;
                            canvas.save();
                            if (y(canvas, f2, i11, dVar.b)) {
                                String str7 = dVar.a;
                                list3 = z;
                                int i13 = i10;
                                while (i13 < str7.length()) {
                                    List list5 = asList;
                                    String str8 = str5;
                                    int i14 = i12;
                                    float f9 = f7;
                                    i700 i700Var3 = i700Var2;
                                    r4s g = i700Var3.h.g(r4s.a(str7.charAt(i13), str4, str8));
                                    if (g == null) {
                                        i700Var2 = i700Var3;
                                        str2 = str7;
                                        i7 = size2;
                                        i8 = i6;
                                        i9 = i13;
                                        bVar = bVar3;
                                        k800Var = k800Var3;
                                        aVar2 = aVar5;
                                    } else {
                                        t(f2, i, i13);
                                        HashMap hashMap = this.L;
                                        if (hashMap.containsKey(g)) {
                                            list4 = (List) hashMap.get(g);
                                            str2 = str7;
                                            i7 = size2;
                                            i8 = i6;
                                            i9 = i13;
                                            k800Var = k800Var3;
                                        } else {
                                            str2 = str7;
                                            ArrayList arrayList = g.a;
                                            i7 = size2;
                                            int size3 = arrayList.size();
                                            i8 = i6;
                                            ArrayList arrayList2 = new ArrayList(size3);
                                            i9 = i13;
                                            int i15 = i10;
                                            while (i15 < size3) {
                                                arrayList2.add(new igj(k800Var3, this, (a6j0) arrayList.get(i15), i700Var3));
                                                size3 = size3;
                                                i15++;
                                                arrayList = arrayList;
                                            }
                                            k800Var = k800Var3;
                                            hashMap.put(g, arrayList2);
                                            list4 = arrayList2;
                                        }
                                        int i16 = i10;
                                        while (i16 < list4.size()) {
                                            Path path = ((igj) list4.get(i16)).getPath();
                                            i700 i700Var4 = i700Var3;
                                            path.computeBounds(this.H, i10);
                                            Matrix matrix2 = this.I;
                                            matrix2.reset();
                                            List list6 = list4;
                                            matrix2.preTranslate(f3, (-f2.g) * b3r0.c());
                                            matrix2.preScale(f8, f8);
                                            path.transform(matrix2);
                                            if (f2.k) {
                                                aVar3 = aVar5;
                                                v(path, aVar3, canvas);
                                                bVar2 = bVar3;
                                                v(path, bVar2, canvas);
                                            } else {
                                                bVar2 = bVar3;
                                                aVar3 = aVar5;
                                                v(path, bVar2, canvas);
                                                v(path, aVar3, canvas);
                                            }
                                            i16++;
                                            bVar3 = bVar2;
                                            aVar5 = aVar3;
                                            list4 = list6;
                                            i700Var3 = i700Var4;
                                            i10 = 0;
                                            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        }
                                        i700Var2 = i700Var3;
                                        bVar = bVar3;
                                        aVar2 = aVar5;
                                        canvas.translate((b3r0.c() * ((float) g.c) * f8) + f9, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                    }
                                    f7 = f9;
                                    bVar3 = bVar;
                                    str5 = str8;
                                    aVar5 = aVar2;
                                    k800Var3 = k800Var;
                                    i12 = i14;
                                    asList = list5;
                                    str7 = str2;
                                    i6 = i8;
                                    size2 = i7;
                                    i10 = 0;
                                    f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                    i13 = i9 + 1;
                                }
                            } else {
                                list3 = z;
                            }
                            int i17 = i12;
                            float f10 = f7;
                            List list7 = asList;
                            int i18 = size2;
                            int i19 = i6;
                            b bVar4 = bVar3;
                            k800 k800Var4 = k800Var3;
                            a aVar6 = aVar5;
                            String str9 = str5;
                            canvas.restore();
                            f7 = f10;
                            bVar3 = bVar4;
                            str5 = str9;
                            aVar5 = aVar6;
                            k800Var3 = k800Var4;
                            asList = list7;
                            i6 = i19;
                            size2 = i18;
                            i10 = 0;
                            f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            i12 = i17 + 1;
                            z = list3;
                        }
                        f5 = f8;
                        asList = asList;
                        i10 = 0;
                        f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        i6++;
                    }
                    canvas2 = canvas;
                    canvas2.restore();
                }
                floatValue2 = ((Float) pjr0Var2.f()).floatValue();
                f6 += floatValue2;
                float f72 = f6;
                i6 = 0;
                int i112 = -1;
                while (i6 < size2) {
                }
                canvas2 = canvas;
                canvas2.restore();
            }
        } else {
            i2 = 2;
        }
        pjr0 pjr0Var3 = this.d0;
        if (pjr0Var3 == null || (typeface = (Typeface) pjr0Var3.f()) == null) {
            Map<String, Typeface> map2 = k800Var2.m;
            if (map2 != null) {
                if (map2.containsKey(str4)) {
                    typeface = map2.get(str4);
                } else {
                    String str10 = o4sVar2.b;
                    if (map2.containsKey(str10)) {
                        typeface = map2.get(str10);
                    } else {
                        String b2 = pzl.b(str4, "-", str3);
                        if (map2.containsKey(b2)) {
                            typeface = map2.get(b2);
                        }
                    }
                }
                str = "\n";
                if (typeface == null) {
                    typeface = o4sVar2.d;
                }
            }
            q4s l = k800Var2.l();
            if (l != null) {
                ih50<String> ih50Var = l.a;
                ih50Var.a = str4;
                ih50Var.b = str3;
                HashMap hashMap2 = l.b;
                Typeface typeface2 = (Typeface) hashMap2.get(ih50Var);
                if (typeface2 != null) {
                    typeface = typeface2;
                    str = "\n";
                } else {
                    HashMap hashMap3 = l.c;
                    Typeface typeface3 = (Typeface) hashMap3.get(str4);
                    if (typeface3 != null) {
                        typeface = typeface3;
                        str = "\n";
                    } else {
                        Typeface typeface4 = o4sVar2.d;
                        if (typeface4 != null) {
                            str = "\n";
                            typeface = typeface4;
                        } else {
                            StringBuilder c2 = r11.c("fonts/", str4);
                            str = "\n";
                            c2.append(l.e);
                            typeface = Typeface.createFromAsset(l.d, c2.toString());
                            hashMap3.put(str4, typeface);
                        }
                    }
                    boolean contains = str3.contains("Italic");
                    boolean contains2 = str3.contains("Bold");
                    int i20 = (contains && contains2) ? 3 : contains ? i2 : contains2 ? 1 : 0;
                    if (typeface.getStyle() != i20) {
                        typeface = Typeface.create(typeface, i20);
                    }
                    hashMap2.put(ih50Var, typeface);
                }
            } else {
                str = "\n";
                typeface = null;
            }
            if (typeface == null) {
            }
        } else {
            str = "\n";
        }
        if (typeface != null) {
            String str11 = f2.a;
            aVar4.setTypeface(typeface);
            pjr0 pjr0Var4 = this.c0;
            float floatValue4 = pjr0Var4 != null ? ((Float) pjr0Var4.f()).floatValue() : f2.c;
            aVar4.setTextSize(b3r0.c() * floatValue4);
            bVar3.setTypeface(aVar4.getTypeface());
            bVar3.setTextSize(aVar4.getTextSize());
            float f11 = f2.e / 10.0f;
            pjr0 pjr0Var5 = this.a0;
            if (pjr0Var5 != null) {
                floatValue = ((Float) pjr0Var5.f()).floatValue();
            } else {
                if (hqrVar != null) {
                    floatValue = hqrVar.f().floatValue();
                }
                float c3 = ((b3r0.c() * f11) * floatValue4) / 100.0f;
                List asList2 = Arrays.asList(str11.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
                size = asList2.size();
                i3 = 0;
                int i21 = 0;
                int i22 = -1;
                while (i3 < size) {
                    String str12 = (String) asList2.get(i3);
                    PointF pointF2 = f2.m;
                    float f12 = c3;
                    int i23 = i2;
                    int i24 = 0;
                    for (List<d> z2 = z(str12, pointF2 == null ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : pointF2.x, o4sVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f12, false); i24 < z2.size(); z2 = list) {
                        d dVar2 = z2.get(i24);
                        i22++;
                        canvas.save();
                        if (y(canvas, f2, i22, aVar4.measureText(dVar2.a))) {
                            String str13 = dVar2.a;
                            list = z2;
                            i4 = i24;
                            o4sVar = o4sVar2;
                            if (Bidi.requiresBidi(str13.toCharArray(), 0, str13.length())) {
                                Bidi bidi2 = new Bidi(str13, -2);
                                int runCount = bidi2.getRunCount();
                                byte[] bArr = new byte[runCount];
                                f = f12;
                                Integer[] numArr = new Integer[runCount];
                                list2 = asList2;
                                int i25 = 0;
                                while (i25 < runCount) {
                                    bArr[i25] = (byte) bidi2.getRunLevel(i25);
                                    numArr[i25] = Integer.valueOf(i25);
                                    i25++;
                                    size = size;
                                }
                                i5 = size;
                                Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                StringBuilder sb = this.F;
                                sb.setLength(0);
                                int i26 = 0;
                                while (i26 < runCount) {
                                    int intValue = numArr[i26].intValue();
                                    int i27 = runCount;
                                    int runStart = bidi2.getRunStart(intValue);
                                    Integer[] numArr2 = numArr;
                                    int runLimit = bidi2.getRunLimit(intValue);
                                    int runLevel = bidi2.getRunLevel(intValue);
                                    String substring = str13.substring(runStart, runLimit);
                                    if ((runLevel & 1) == 0) {
                                        sb.append(substring);
                                        bidi = bidi2;
                                    } else {
                                        StringBuilder sb2 = this.G;
                                        int i28 = 0;
                                        sb2.setLength(0);
                                        bidi = bidi2;
                                        while (i28 < substring.length()) {
                                            String s = s(i28, substring);
                                            sb2.insert(0, s);
                                            i28 += s.length();
                                            substring = substring;
                                        }
                                        sb.append((CharSequence) sb2);
                                    }
                                    i26++;
                                    runCount = i27;
                                    numArr = numArr2;
                                    bidi2 = bidi;
                                }
                                str13 = sb.toString();
                            } else {
                                f = f12;
                                list2 = asList2;
                                i5 = size;
                            }
                            ArrayList arrayList3 = this.N;
                            arrayList3.clear();
                            int i29 = 0;
                            while (i29 < str13.length()) {
                                String s2 = s(i29, str13);
                                arrayList3.add(s2);
                                i29 += s2.length();
                            }
                            int i30 = 0;
                            while (i30 < arrayList3.size()) {
                                StringBuilder sb3 = this.E;
                                sb3.setLength(0);
                                sb3.append((String) arrayList3.get(i30));
                                int i31 = i30 + 1;
                                while (i31 < arrayList3.size()) {
                                    String str14 = (String) arrayList3.get(i31);
                                    int i32 = 0;
                                    while (i32 < str14.length()) {
                                        ArrayList arrayList4 = arrayList3;
                                        if (Character.getDirectionality(str14.codePointAt(i32)) == 2) {
                                            break;
                                        }
                                        i32++;
                                        arrayList3 = arrayList4;
                                    }
                                }
                                ArrayList arrayList5 = arrayList3;
                                String sb4 = sb3.toString();
                                t(f2, i, i30 + i21);
                                if (f2.k) {
                                    u(sb4, aVar4, canvas);
                                    u(sb4, bVar3, canvas);
                                } else {
                                    u(sb4, bVar3, canvas);
                                    u(sb4, aVar4, canvas);
                                }
                                canvas.translate(aVar4.measureText(sb4) + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                                i30 = i31;
                                arrayList3 = arrayList5;
                            }
                        } else {
                            list = z2;
                            i4 = i24;
                            o4sVar = o4sVar2;
                            f = f12;
                            list2 = asList2;
                            i5 = size;
                        }
                        i21 += dVar2.a.length();
                        canvas.restore();
                        i24 = i4 + 1;
                        o4sVar2 = o4sVar;
                        i23 = 2;
                        f12 = f;
                        asList2 = list2;
                        size = i5;
                    }
                    i3++;
                    o4sVar2 = o4sVar2;
                    i2 = i23;
                    c3 = f12;
                    size = size;
                }
            }
            f11 += floatValue;
            float c32 = ((b3r0.c() * f11) * floatValue4) / 100.0f;
            List asList22 = Arrays.asList(str11.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str, "\r").split("\r"));
            size = asList22.size();
            i3 = 0;
            int i212 = 0;
            int i222 = -1;
            while (i3 < size) {
            }
        }
        canvas2 = canvas;
        canvas2.restore();
    }

    public final String s(int i, String str) {
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
        x500<String> x500Var = this.M;
        if (x500Var.containsKey(j)) {
            return x500Var.get(j);
        }
        StringBuilder sb = this.D;
        sb.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb2 = sb.toString();
        x500Var.put(j, sb2);
        return sb2;
    }

    public final void t(DocumentData documentData, int i, int i2) {
        pjr0 pjr0Var = this.U;
        a aVar = this.J;
        if (pjr0Var != null) {
            aVar.setColor(((Integer) pjr0Var.f()).intValue());
        } else {
            u6g u6gVar = this.T;
            if (u6gVar == null || !x(i2)) {
                aVar.setColor(documentData.h);
            } else {
                aVar.setColor(u6gVar.f().intValue());
            }
        }
        pjr0 pjr0Var2 = this.W;
        b bVar = this.K;
        if (pjr0Var2 != null) {
            bVar.setColor(((Integer) pjr0Var2.f()).intValue());
        } else {
            u6g u6gVar2 = this.V;
            if (u6gVar2 == null || !x(i2)) {
                bVar.setColor(documentData.i);
            } else {
                bVar.setColor(u6gVar2.f().intValue());
            }
        }
        tf6<Integer, Integer> tf6Var = this.w.p;
        int i3 = 100;
        int intValue = tf6Var == null ? 100 : tf6Var.f().intValue();
        u9x u9xVar = this.b0;
        if (u9xVar != null && x(i2)) {
            i3 = u9xVar.f().intValue();
        }
        int round = Math.round((((i3 / 100.0f) * ((intValue * 255.0f) / 100.0f)) * i) / 255.0f);
        aVar.setAlpha(round);
        bVar.setAlpha(round);
        pjr0 pjr0Var3 = this.Y;
        if (pjr0Var3 != null) {
            bVar.setStrokeWidth(((Float) pjr0Var3.f()).floatValue());
            return;
        }
        hqr hqrVar = this.X;
        if (hqrVar == null || !x(i2)) {
            bVar.setStrokeWidth(b3r0.c() * documentData.j);
        } else {
            bVar.setStrokeWidth(hqrVar.f().floatValue());
        }
    }

    public final d w(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            arrayList.add(new d());
        }
        return (d) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        u9x u9xVar;
        int length = this.P.f().a.length();
        u9x u9xVar2 = this.e0;
        if (u9xVar2 == null || (u9xVar = this.f0) == null) {
            return true;
        }
        int min = Math.min(u9xVar2.f().intValue(), u9xVar.f().intValue());
        int max = Math.max(u9xVar2.f().intValue(), u9xVar.f().intValue());
        u9x u9xVar3 = this.g0;
        if (u9xVar3 != null) {
            int intValue = u9xVar3.f().intValue();
            min += intValue;
            max += intValue;
        }
        if (this.S == TextRangeUnits.INDEX) {
            return i >= min && i < max;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) min) && f < ((float) max);
    }

    public final boolean y(Canvas canvas, DocumentData documentData, int i, float f) {
        PointF pointF = documentData.l;
        PointF pointF2 = documentData.m;
        float c2 = b3r0.c();
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f3 = (i * documentData.f * c2) + (pointF == null ? 0.0f : (documentData.f * c2) + pointF.y);
        if (this.Q.x && pointF2 != null && pointF != null && f3 >= pointF.y + pointF2.y + documentData.c) {
            return false;
        }
        float f4 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f2 = pointF2.x;
        }
        int i2 = c.a[documentData.d.ordinal()];
        if (i2 == 1) {
            canvas.translate(f4, f3);
            return true;
        }
        if (i2 == 2) {
            canvas.translate((f4 + f2) - f, f3);
            return true;
        }
        if (i2 != 3) {
            return true;
        }
        canvas.translate(((f2 / 2.0f) + f4) - (f / 2.0f), f3);
        return true;
    }

    public final List<d> z(String str, float f, o4s o4sVar, float f2, float f3, boolean z) {
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
                r4s g = this.R.h.g(r4s.a(charAt, o4sVar.a, o4sVar.c));
                if (g != null) {
                    measureText = (b3r0.c() * ((float) g.c) * f2) + f3;
                }
            } else {
                measureText = this.J.measureText(str.substring(i4, i4 + 1)) + f3;
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
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 >= f && charAt != ' ') {
                i++;
                d w = w(i);
                if (i3 == i2) {
                    w.a = str.substring(i2, i4).trim();
                    w.b = (f4 - measureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = measureText;
                    f5 = f4;
                } else {
                    w.a = str.substring(i2, i3 - 1).trim();
                    w.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            i++;
            d w2 = w(i);
            w2.a = str.substring(i2);
            w2.b = f4;
        }
        return this.O.subList(0, i);
    }
}
