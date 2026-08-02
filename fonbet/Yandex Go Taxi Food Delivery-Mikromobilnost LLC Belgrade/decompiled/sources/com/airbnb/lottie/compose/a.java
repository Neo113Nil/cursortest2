package com.airbnb.lottie.compose;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.provider.Settings;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import com.google.ar.core.ImageMetadata;
import defpackage.aii0;
import defpackage.atz;
import defpackage.blm0;
import defpackage.bts;
import defpackage.btz;
import defpackage.c530;
import defpackage.cjs0;
import defpackage.cma1;
import defpackage.cui0;
import defpackage.did;
import defpackage.dsz;
import defpackage.dvw;
import defpackage.f530;
import defpackage.fid;
import defpackage.i28;
import defpackage.j18;
import defpackage.jl40;
import defpackage.jt1;
import defpackage.m810;
import defpackage.mdh;
import defpackage.mhe;
import defpackage.msz;
import defpackage.n;
import defpackage.nhe;
import defpackage.nsz;
import defpackage.nuz;
import defpackage.ny61;
import defpackage.o430;
import defpackage.oyr;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.psz;
import defpackage.puz;
import defpackage.qam;
import defpackage.qeb1;
import defpackage.rzo;
import defpackage.s72;
import defpackage.six;
import defpackage.sjh;
import defpackage.sls;
import defpackage.ssz;
import defpackage.t72;
import defpackage.tje;
import defpackage.tls;
import defpackage.ttz;
import defpackage.uyj;
import defpackage.vng;
import defpackage.vsz;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsz;
import defpackage.x4c;
import defpackage.x4e;
import defpackage.xsz;
import defpackage.xw00;
import defpackage.yci0;
import defpackage.yrz;
import defpackage.ysz;
import defpackage.zpn;
import defpackage.zsz;
import defpackage.zw21;
import defpackage.zy11;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public abstract class a {
    public static final void a(final nsz nszVar, final sls slsVar, f530 f530Var, boolean z, boolean z2, boolean z3, boolean z4, RenderMode renderMode, boolean z5, ttz ttzVar, jt1 jt1Var, nhe nheVar, boolean z6, boolean z7, Map map, AsyncUpdates asyncUpdates, boolean z8, fid fidVar, final int i, final int i2, final int i3) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(382909894);
        final f530 f530Var2 = (i3 & 4) != 0 ? c530.a : f530Var;
        final boolean z9 = (i3 & 8) != 0 ? false : z;
        final boolean z10 = (i3 & 16) != 0 ? false : z2;
        final boolean z11 = (i3 & 32) != 0 ? true : z3;
        boolean z12 = (i3 & 64) != 0 ? false : z4;
        RenderMode renderMode2 = (i3 & 128) != 0 ? RenderMode.AUTOMATIC : renderMode;
        final boolean z13 = (i3 & 256) != 0 ? false : z5;
        ttz ttzVar2 = (i3 & 512) != 0 ? null : ttzVar;
        jt1 jt1Var2 = (i3 & 1024) != 0 ? x4c.y : jt1Var;
        nhe nheVar2 = (i3 & 2048) != 0 ? mhe.b : nheVar;
        final boolean z14 = (i3 & 4096) != 0 ? true : z6;
        final boolean z15 = (i3 & 8192) != 0 ? false : z7;
        final Map map2 = (i3 & 16384) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (32768 & i3) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z16 = (i3 & 65536) != 0 ? false : z8;
        btsVar.f0(185152185);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = new LottieDrawable();
            btsVar.o0(Q);
        }
        final LottieDrawable lottieDrawable = (LottieDrawable) Q;
        btsVar.t(false);
        btsVar.f0(185152232);
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = new Matrix();
            btsVar.o0(Q2);
        }
        final Matrix matrix = (Matrix) Q2;
        btsVar.t(false);
        btsVar.f0(185152312);
        boolean k = btsVar.k(nszVar);
        Object Q3 = btsVar.Q();
        if (k || Q3 == o430Var) {
            Q3 = f.j(null);
            btsVar.o0(Q3);
        }
        final oz40 oz40Var = (oz40) Q3;
        btsVar.t(false);
        btsVar.f0(185152364);
        if (nszVar == null || nszVar.b() == 0.0f) {
            final boolean z17 = z13;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            final boolean z18 = z12;
            final RenderMode renderMode3 = renderMode2;
            final jt1 jt1Var3 = jt1Var2;
            final boolean z19 = z10;
            final boolean z20 = z15;
            final ttz ttzVar3 = ttzVar2;
            final nhe nheVar3 = nheVar2;
            final boolean z21 = z14;
            final boolean z22 = z16;
            pi6.a(f530Var2, btsVar, (i >> 6) & 14);
            btsVar.t(false);
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new wls() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Number) obj2).intValue();
                        a.a(nsz.this, slsVar, f530Var2, z9, z19, z11, z18, renderMode3, z17, ttzVar3, jt1Var3, nheVar3, z21, z20, map2, asyncUpdates3, z22, (fid) obj, vng.O(i | 1), vng.O(i2), i3);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        btsVar.t(false);
        final jt1 jt1Var4 = jt1Var2;
        final ttz ttzVar4 = ttzVar2;
        final Rect rect = nszVar.k;
        final Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        f530 k2 = f530Var2.k(new dsz(rect.width(), rect.height()));
        final nhe nheVar4 = nheVar2;
        final f530 f530Var3 = f530Var2;
        final boolean z23 = z9;
        final Map map3 = map2;
        final boolean z24 = z11;
        final boolean z25 = z12;
        final RenderMode renderMode4 = renderMode2;
        final AsyncUpdates asyncUpdates4 = asyncUpdates2;
        final boolean z26 = z16;
        tls tlsVar = new tls() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                qam qamVar = (qam) obj;
                Rect rect2 = rect;
                nhe nheVar5 = nheVar4;
                jt1 jt1Var5 = jt1Var4;
                Matrix matrix2 = matrix;
                LottieDrawable lottieDrawable2 = lottieDrawable;
                boolean z27 = z25;
                boolean z28 = z26;
                RenderMode renderMode5 = renderMode4;
                AsyncUpdates asyncUpdates5 = asyncUpdates4;
                nsz nszVar2 = nszVar;
                Map<String, Typeface> map4 = map3;
                ttz ttzVar5 = ttzVar4;
                boolean z29 = z23;
                boolean z30 = z10;
                boolean z31 = z24;
                boolean z32 = z13;
                boolean z33 = z14;
                boolean z34 = z15;
                Context context2 = context;
                sls slsVar2 = slsVar;
                oz40 oz40Var2 = oz40Var;
                i28 q = qamVar.N().q();
                long a = cma1.a(rect2.width(), rect2.height());
                long h = rzo.h(m810.b(cjs0.d(qamVar.c())), m810.b(cjs0.b(qamVar.c())));
                long j = nheVar5.j(a, qamVar.c());
                float d = cjs0.d(a);
                int i4 = blm0.a;
                int i5 = (int) (j >> 32);
                int intBitsToFloat = (int) (Float.intBitsToFloat(i5) * d);
                float b = cjs0.b(a);
                int i6 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                long a2 = jt1Var5.a(rzo.h(intBitsToFloat, (int) (Float.intBitsToFloat(i6) * b)), h, qamVar.getLayoutDirection());
                matrix2.reset();
                matrix2.preTranslate((int) (a2 >> 32), (int) (a2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                matrix2.preScale(Float.intBitsToFloat(i5), Float.intBitsToFloat(i6));
                lottieDrawable2.enableFeatureFlag(LottieFeatureFlag.MergePathsApi19, z27);
                lottieDrawable2.setSafeMode(z28);
                lottieDrawable2.setRenderMode(renderMode5);
                lottieDrawable2.setAsyncUpdates(asyncUpdates5);
                lottieDrawable2.setComposition(nszVar2);
                lottieDrawable2.setFontMap(map4);
                if (ttzVar5 != ((ttz) oz40Var2.getValue())) {
                    ttz ttzVar6 = (ttz) oz40Var2.getValue();
                    if (ttzVar6 != null) {
                        Iterator it = ttzVar6.a.iterator();
                        while (it.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it.next()).a, (six) 1, (puz) null);
                        }
                        Iterator it2 = ttzVar6.b.iterator();
                        while (it2.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it2.next()).a, (six) 1, (puz) null);
                        }
                        Iterator it3 = ttzVar6.c.iterator();
                        while (it3.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it3.next()).a, (six) 1, (puz) null);
                        }
                        Iterator it4 = ttzVar6.d.iterator();
                        while (it4.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it4.next()).a, (six) 1, (puz) null);
                        }
                        Iterator it5 = ttzVar6.e.iterator();
                        while (it5.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it5.next()).a, (six) 1, (puz) null);
                        }
                        Iterator it6 = ttzVar6.f.iterator();
                        while (it6.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it6.next()).a, (six) 1, (puz) null);
                        }
                        Iterator it7 = ttzVar6.g.iterator();
                        while (it7.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it7.next()).a, (six) 1, (puz) null);
                        }
                        Iterator it8 = ttzVar6.h.iterator();
                        while (it8.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it8.next()).a, (six) 1, (puz) null);
                        }
                        Iterator it9 = ttzVar6.i.iterator();
                        while (it9.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it9.next()).a, (six) 1, (puz) null);
                        }
                        Iterator it10 = ttzVar6.j.iterator();
                        while (it10.hasNext()) {
                            lottieDrawable2.addValueCallback(((d) it10.next()).a, (six) 1, (puz) null);
                        }
                    }
                    if (ttzVar5 != null) {
                        for (d dVar : ttzVar5.a) {
                            lottieDrawable2.addValueCallback(dVar.a, (six) 1, (puz) new c(dVar.b));
                        }
                        for (d dVar2 : ttzVar5.b) {
                            lottieDrawable2.addValueCallback(dVar2.a, (six) 1, (puz) new c(dVar2.b));
                        }
                        for (d dVar3 : ttzVar5.c) {
                            lottieDrawable2.addValueCallback(dVar3.a, (six) 1, (puz) new c(dVar3.b));
                        }
                        for (d dVar4 : ttzVar5.d) {
                            lottieDrawable2.addValueCallback(dVar4.a, (six) 1, (puz) new c(dVar4.b));
                        }
                        for (d dVar5 : ttzVar5.e) {
                            lottieDrawable2.addValueCallback(dVar5.a, (six) 1, (puz) new c(dVar5.b));
                        }
                        for (d dVar6 : ttzVar5.f) {
                            lottieDrawable2.addValueCallback(dVar6.a, (six) 1, (puz) new c(dVar6.b));
                        }
                        for (d dVar7 : ttzVar5.g) {
                            lottieDrawable2.addValueCallback(dVar7.a, (six) 1, (puz) new c(dVar7.b));
                        }
                        for (d dVar8 : ttzVar5.h) {
                            lottieDrawable2.addValueCallback(dVar8.a, (six) 1, (puz) new c(dVar8.b));
                        }
                        for (d dVar9 : ttzVar5.i) {
                            lottieDrawable2.addValueCallback(dVar9.a, (six) 1, (puz) new c(dVar9.b));
                        }
                        for (d dVar10 : ttzVar5.j) {
                            lottieDrawable2.addValueCallback(dVar10.a, (six) 1, (puz) new c(dVar10.b));
                        }
                    }
                    oz40Var2.setValue(ttzVar5);
                }
                lottieDrawable2.setOutlineMasksAndMattes(z29);
                lottieDrawable2.setApplyingOpacityToLayersEnabled(z30);
                lottieDrawable2.setApplyingShadowToLayersEnabled(z31);
                lottieDrawable2.setMaintainOriginalImageBounds(z32);
                lottieDrawable2.setClipToCompositionBounds(z33);
                lottieDrawable2.setClipTextToBoundingBox(z34);
                xw00 markerForAnimationsDisabled = lottieDrawable2.getMarkerForAnimationsDisabled();
                if (lottieDrawable2.animationsEnabled(context2) || markerForAnimationsDisabled == null) {
                    lottieDrawable2.setProgress(((Number) slsVar2.invoke()).floatValue());
                } else {
                    lottieDrawable2.setProgress(markerForAnimationsDisabled.b);
                }
                lottieDrawable2.setBounds(0, 0, rect2.width(), rect2.height());
                Canvas canvas = t72.a;
                lottieDrawable2.draw(((s72) q).a, matrix2);
                return zy11.a;
            }
        };
        final boolean z27 = z13;
        final boolean z28 = z10;
        final boolean z29 = z14;
        final boolean z30 = z15;
        qeb1.a(0, btsVar, tlsVar, k2);
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    a.a(nsz.this, slsVar, f530Var3, z23, z28, z24, z25, renderMode4, z27, ttzVar4, jt1Var4, nheVar4, z29, z30, map3, asyncUpdates4, z26, (fid) obj, vng.O(i | 1), vng.O(i2), i3);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(final nsz nszVar, f530 f530Var, boolean z, boolean z2, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, RenderMode renderMode, boolean z7, boolean z8, ttz ttzVar, jt1 jt1Var, nhe nheVar, boolean z9, boolean z10, Map map, boolean z11, AsyncUpdates asyncUpdates, fid fidVar, final int i2, final int i3, final int i4, final int i5) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1331239405);
        final f530 f530Var2 = (i5 & 2) != 0 ? c530.a : f530Var;
        boolean z12 = (i5 & 4) != 0 ? true : z;
        boolean z13 = (i5 & 8) != 0 ? true : z2;
        float f2 = (i5 & 32) != 0 ? 1.0f : f;
        int i6 = (i5 & 64) != 0 ? 1 : i;
        boolean z14 = (i5 & 128) != 0 ? false : z3;
        boolean z15 = (i5 & 256) != 0 ? false : z4;
        boolean z16 = (i5 & 512) != 0 ? true : z5;
        boolean z17 = (i5 & 1024) != 0 ? false : z6;
        RenderMode renderMode2 = (i5 & 2048) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z18 = (i5 & 4096) != 0 ? false : z7;
        boolean z19 = (i5 & 8192) != 0 ? false : z8;
        ttz ttzVar2 = (i5 & 16384) != 0 ? null : ttzVar;
        jt1 jt1Var2 = (i5 & 32768) != 0 ? x4c.y : jt1Var;
        nhe nheVar2 = (i5 & 65536) != 0 ? mhe.b : nheVar;
        boolean z20 = (i5 & 131072) != 0 ? true : z9;
        boolean z21 = (i5 & 262144) != 0 ? false : z10;
        Map map2 = (i5 & 524288) == 0 ? map : null;
        boolean z22 = (i5 & 1048576) != 0 ? false : z11;
        AsyncUpdates asyncUpdates2 = (i5 & 2097152) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        final boolean z23 = z12;
        final boolean z24 = z13;
        final boolean z25 = z18;
        final yrz c = c(nszVar, z23, z24, z25, f2, i6, btsVar, 896);
        final ttz ttzVar3 = ttzVar2;
        final boolean z26 = z17;
        btsVar.f0(185157769);
        boolean k = btsVar.k(c);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new sls() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$6$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.sls
                public final Object invoke() {
                    return Float.valueOf(((Number) ((LottieAnimatableImpl) c).getValue()).floatValue());
                }
            };
            btsVar.o0(Q);
        }
        sls slsVar = (sls) Q;
        btsVar.t(false);
        int i7 = i2 >> 12;
        int i8 = (i7 & 7168) | ((i2 << 3) & 896) | 1073741832 | (57344 & i7) | (i7 & ImageMetadata.JPEG_GPS_COORDINATES);
        int i9 = i3 << 18;
        int i10 = i8 | (i9 & 3670016) | (i9 & 29360128) | ((i3 << 15) & 234881024);
        int i11 = i3 >> 15;
        final boolean z27 = z14;
        final boolean z28 = z15;
        final boolean z29 = z16;
        final RenderMode renderMode3 = renderMode2;
        final boolean z30 = z19;
        final Map map3 = map2;
        final jt1 jt1Var3 = jt1Var2;
        final nhe nheVar3 = nheVar2;
        final boolean z31 = z20;
        final boolean z32 = z21;
        final boolean z33 = z22;
        final AsyncUpdates asyncUpdates3 = asyncUpdates2;
        a(nszVar, slsVar, f530Var2, z27, z28, z29, z26, renderMode3, z30, ttzVar3, jt1Var3, nheVar3, z31, z32, map3, asyncUpdates3, z33, btsVar, i10, (i11 & 14) | 32768 | (i11 & 112) | (i11 & 896) | (i11 & 7168) | ((i4 << 12) & ImageMetadata.JPEG_GPS_COORDINATES) | ((i4 << 18) & 3670016), 0);
        final float f3 = f2;
        final int i12 = i6;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$7
                final /* synthetic */ msz $clipSpec;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    a.b(nsz.this, f530Var2, z23, z24, f3, i12, z27, z28, z29, z26, renderMode3, z25, z30, ttzVar3, jt1Var3, nheVar3, z31, z32, map3, z33, asyncUpdates3, (fid) obj, vng.O(i2 | 1), vng.O(i3), vng.O(i4), i5);
                    return zy11.a;
                }
            };
        }
    }

    public static final yrz c(nsz nszVar, boolean z, boolean z2, boolean z3, float f, int i, fid fidVar, int i2) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(683659508);
        boolean z4 = (i2 & 2) != 0 ? true : z;
        boolean z5 = (i2 & 4) != 0 ? true : z2;
        boolean z6 = (i2 & 8) != 0 ? false : z3;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        int i3 = (i2 & 64) != 0 ? 1 : i;
        LottieCancellationBehavior lottieCancellationBehavior = LottieCancellationBehavior.Immediately;
        if (i3 <= 0) {
            w511.f(oyr.j(i3, "Iterations must be a positive number (", ")."));
            return null;
        }
        if (Float.isInfinite(f2) || Float.isNaN(f2)) {
            w511.f(x4e.f("Speed must be a finite number. It is ", Extension.DOT_CHAR, f2));
            return null;
        }
        btsVar.f0(2024497114);
        btsVar.f0(-610207850);
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (Q == o430Var) {
            Q = new LottieAnimatableImpl();
            btsVar.o0(Q);
        }
        yrz yrzVar = (yrz) Q;
        btsVar.t(false);
        btsVar.t(false);
        btsVar.f0(-180606964);
        Object Q2 = btsVar.Q();
        if (Q2 == o430Var) {
            Q2 = n.f(z4, btsVar);
        }
        oz40 oz40Var = (oz40) Q2;
        btsVar.t(false);
        btsVar.f0(-180606834);
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        Matrix matrix = zw21.a;
        float f3 = f2 / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        btsVar.t(false);
        zpn.h(new Object[]{nszVar, Boolean.valueOf(z4), null, Float.valueOf(f3), Integer.valueOf(i3)}, new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(z4, z5, yrzVar, nszVar, i3, z6, f3, lottieCancellationBehavior, false, oz40Var, null), btsVar);
        btsVar.t(false);
        return yrzVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
    
        if (r0 == r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (r1 == r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(Context context, btz btzVar, String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        RememberLottieCompositionKt$lottieComposition$1 rememberLottieCompositionKt$lottieComposition$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str5;
        String str6;
        String str7;
        nsz nszVar;
        Object k0;
        Context context2;
        nsz nszVar2;
        String str8;
        String str9;
        if (continuationImpl instanceof RememberLottieCompositionKt$lottieComposition$1) {
            rememberLottieCompositionKt$lottieComposition$1 = (RememberLottieCompositionKt$lottieComposition$1) continuationImpl;
            int i2 = rememberLottieCompositionKt$lottieComposition$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rememberLottieCompositionKt$lottieComposition$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rememberLottieCompositionKt$lottieComposition$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rememberLottieCompositionKt$lottieComposition$1.label;
                Object obj2 = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    nuz e = e(context, btzVar, str4, false);
                    if (e == null) {
                        yci0.x("Unable to create parsing task for ", btzVar, Extension.DOT_CHAR);
                        return null;
                    }
                    rememberLottieCompositionKt$lottieComposition$1.L$0 = context;
                    str5 = str;
                    rememberLottieCompositionKt$lottieComposition$1.L$1 = str5;
                    str6 = str2;
                    rememberLottieCompositionKt$lottieComposition$1.L$2 = str6;
                    str7 = str3;
                    rememberLottieCompositionKt$lottieComposition$1.L$3 = str7;
                    rememberLottieCompositionKt$lottieComposition$1.label = 1;
                    j18 j18Var = new j18(1, dvw.b(rememberLottieCompositionKt$lottieComposition$1));
                    j18Var.u();
                    e.b(new cui0(j18Var, 0));
                    e.a(new cui0(j18Var, 1));
                    obj = j18Var.s();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            nsz nszVar3 = (nsz) rememberLottieCompositionKt$lottieComposition$1.L$0;
                            kotlin.b.b(obj);
                            return nszVar3;
                        }
                        nszVar2 = (nsz) rememberLottieCompositionKt$lottieComposition$1.L$3;
                        str9 = (String) rememberLottieCompositionKt$lottieComposition$1.L$2;
                        str8 = (String) rememberLottieCompositionKt$lottieComposition$1.L$1;
                        context2 = (Context) rememberLottieCompositionKt$lottieComposition$1.L$0;
                        kotlin.b.b(obj);
                        rememberLottieCompositionKt$lottieComposition$1.L$0 = nszVar2;
                        rememberLottieCompositionKt$lottieComposition$1.L$1 = null;
                        rememberLottieCompositionKt$lottieComposition$1.L$2 = null;
                        rememberLottieCompositionKt$lottieComposition$1.L$3 = null;
                        rememberLottieCompositionKt$lottieComposition$1.label = 3;
                        if (!nszVar2.f.isEmpty()) {
                            sjh sjhVar = uyj.a;
                            Object k02 = tje.k0(mdh.b, new RememberLottieCompositionKt$loadFontsFromAssets$2(nszVar2, context2, str8, str9, null), rememberLottieCompositionKt$lottieComposition$1);
                            if (k02 == coroutineSingletons) {
                                obj2 = k02;
                            }
                        }
                        return obj2 != coroutineSingletons ? coroutineSingletons : nszVar2;
                    }
                    String str10 = (String) rememberLottieCompositionKt$lottieComposition$1.L$3;
                    String str11 = (String) rememberLottieCompositionKt$lottieComposition$1.L$2;
                    String str12 = (String) rememberLottieCompositionKt$lottieComposition$1.L$1;
                    Context context3 = (Context) rememberLottieCompositionKt$lottieComposition$1.L$0;
                    kotlin.b.b(obj);
                    str7 = str10;
                    str6 = str11;
                    str5 = str12;
                    context = context3;
                }
                nszVar = (nsz) obj;
                rememberLottieCompositionKt$lottieComposition$1.L$0 = context;
                rememberLottieCompositionKt$lottieComposition$1.L$1 = str6;
                rememberLottieCompositionKt$lottieComposition$1.L$2 = str7;
                rememberLottieCompositionKt$lottieComposition$1.L$3 = nszVar;
                rememberLottieCompositionKt$lottieComposition$1.label = 2;
                if (!nszVar.d.isEmpty()) {
                    sjh sjhVar2 = uyj.a;
                    k0 = tje.k0(mdh.b, new RememberLottieCompositionKt$loadImagesFromAssets$2(nszVar, context, str5, null), rememberLottieCompositionKt$lottieComposition$1);
                }
                k0 = obj2;
                if (k0 != coroutineSingletons) {
                    context2 = context;
                    nszVar2 = nszVar;
                    str8 = str6;
                    str9 = str7;
                    rememberLottieCompositionKt$lottieComposition$1.L$0 = nszVar2;
                    rememberLottieCompositionKt$lottieComposition$1.L$1 = null;
                    rememberLottieCompositionKt$lottieComposition$1.L$2 = null;
                    rememberLottieCompositionKt$lottieComposition$1.L$3 = null;
                    rememberLottieCompositionKt$lottieComposition$1.label = 3;
                    if (!nszVar2.f.isEmpty()) {
                    }
                    if (obj2 != coroutineSingletons) {
                    }
                }
            }
        }
        rememberLottieCompositionKt$lottieComposition$1 = new RememberLottieCompositionKt$lottieComposition$1(continuationImpl);
        Object obj3 = rememberLottieCompositionKt$lottieComposition$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rememberLottieCompositionKt$lottieComposition$1.label;
        Object obj22 = zy11.a;
        if (i != 0) {
        }
        nszVar = (nsz) obj3;
        rememberLottieCompositionKt$lottieComposition$1.L$0 = context;
        rememberLottieCompositionKt$lottieComposition$1.L$1 = str6;
        rememberLottieCompositionKt$lottieComposition$1.L$2 = str7;
        rememberLottieCompositionKt$lottieComposition$1.L$3 = nszVar;
        rememberLottieCompositionKt$lottieComposition$1.label = 2;
        if (!nszVar.d.isEmpty()) {
        }
        k0 = obj22;
        if (k0 != coroutineSingletons) {
        }
    }

    public static final nuz e(Context context, btz btzVar, String str, boolean z) {
        if (btzVar instanceof zsz) {
            if (!jl40.l(str, "__LottieInternalDefaultCacheKey__")) {
                return ssz.f(context, ((zsz) btzVar).a, str);
            }
            int i = ((zsz) btzVar).a;
            return ssz.f(context, i, ssz.n(i, context));
        }
        if (btzVar instanceof atz) {
            return jl40.l(str, "__LottieInternalDefaultCacheKey__") ? ssz.h(context, ((atz) btzVar).a) : ssz.i(context, ((atz) btzVar).a, str);
        }
        if (btzVar instanceof xsz) {
            if (z) {
                return null;
            }
            ny61.u();
            return null;
        }
        if (btzVar instanceof vsz) {
            int i2 = 1;
            if (!jl40.l(str, "__LottieInternalDefaultCacheKey__")) {
                String str2 = ((vsz) btzVar).a;
                HashMap hashMap = ssz.a;
                return ssz.a(str, new psz(i2, context.getApplicationContext(), str2, str), null);
            }
            String str3 = ((vsz) btzVar).a;
            HashMap hashMap2 = ssz.a;
            String concat = "asset_".concat(str3);
            return ssz.a(concat, new psz(i2, context.getApplicationContext(), str3, concat), null);
        }
        if (btzVar instanceof ysz) {
            if (jl40.l(str, "__LottieInternalDefaultCacheKey__")) {
                ny61.u();
                return null;
            }
            ny61.u();
            return null;
        }
        if (!(btzVar instanceof wsz)) {
            w511.b();
            return null;
        }
        context.getContentResolver();
        ny61.u();
        return null;
    }

    public static final LottieCompositionResultImpl f(btz btzVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.f0(-1248473602);
        RememberLottieCompositionKt$rememberLottieComposition$1 rememberLottieCompositionKt$rememberLottieComposition$1 = new RememberLottieCompositionKt$rememberLottieComposition$1(3, null);
        Context context = (Context) btsVar.m(AndroidCompositionLocals_androidKt.b);
        btsVar.f0(1388713953);
        int i2 = (i & 14) ^ 6;
        boolean z = (i2 > 4 && btsVar.k(btzVar)) || (i & 6) == 4;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (z || Q == o430Var) {
            Q = f.j(new LottieCompositionResultImpl());
            btsVar.o0(Q);
        }
        oz40 oz40Var = (oz40) Q;
        btsVar.t(false);
        btsVar.f0(1388714244);
        boolean k = ((i2 > 4 && btsVar.k(btzVar)) || (i & 6) == 4) | btsVar.k("__LottieInternalDefaultCacheKey__");
        Object Q2 = btsVar.Q();
        if (k || Q2 == o430Var) {
            Q2 = e(context, btzVar, "__LottieInternalDefaultCacheKey__", true);
            btsVar.o0(Q2);
        }
        btsVar.t(false);
        zpn.f(btzVar, "__LottieInternalDefaultCacheKey__", new RememberLottieCompositionKt$rememberLottieComposition$3(rememberLottieCompositionKt$rememberLottieComposition$1, context, btzVar, null, "fonts/", ".ttf", "__LottieInternalDefaultCacheKey__", oz40Var, null), btsVar);
        LottieCompositionResultImpl lottieCompositionResultImpl = (LottieCompositionResultImpl) oz40Var.getValue();
        btsVar.t(false);
        return lottieCompositionResultImpl;
    }
}
