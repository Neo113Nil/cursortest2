package xsna;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieFeatureFlag;
import com.airbnb.lottie.RenderMode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.Lambda;
import xsna.dt1;
import xsna.q630;
import xsna.wkj;

/* compiled from: LottieAnimation.kt */
/* loaded from: classes12.dex */
public final class z600 {

    /* compiled from: LottieAnimation.kt */
    public static final class a extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ dt1 $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ boolean $applyShadowToLayers;
        final /* synthetic */ AsyncUpdates $asyncUpdates;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ i700 $composition;
        final /* synthetic */ wkj $contentScale;
        final /* synthetic */ l800 $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ gzs<Float> $progress;
        final /* synthetic */ RenderMode $renderMode;
        final /* synthetic */ boolean $safeMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i700 i700Var, gzs<Float> gzsVar, q630 q630Var, boolean z, boolean z2, boolean z3, boolean z4, RenderMode renderMode, boolean z5, l800 l800Var, dt1 dt1Var, wkj wkjVar, boolean z6, boolean z7, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z8, int i, int i2, int i3) {
            super(2);
            this.$composition = i700Var;
            this.$progress = gzsVar;
            this.$modifier = q630Var;
            this.$outlineMasksAndMattes = z;
            this.$applyOpacityToLayers = z2;
            this.$applyShadowToLayers = z3;
            this.$enableMergePaths = z4;
            this.$renderMode = renderMode;
            this.$maintainOriginalImageBounds = z5;
            this.$dynamicProperties = l800Var;
            this.$alignment = dt1Var;
            this.$contentScale = wkjVar;
            this.$clipToCompositionBounds = z6;
            this.$clipTextToBoundingBox = z7;
            this.$fontMap = map;
            this.$asyncUpdates = asyncUpdates;
            this.$safeMode = z8;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            z600.a(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$applyShadowToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, this.$safeMode, aVar, ne7.I(this.$$changed | 1), ne7.I(this.$$changed1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: LottieAnimation.kt */
    public static final class b extends Lambda implements izs<oio, s3q0> {
        final /* synthetic */ dt1 $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ boolean $applyShadowToLayers;
        final /* synthetic */ AsyncUpdates $asyncUpdates;
        final /* synthetic */ Rect $bounds;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ i700 $composition;
        final /* synthetic */ wkj $contentScale;
        final /* synthetic */ Context $context;
        final /* synthetic */ k800 $drawable;
        final /* synthetic */ l800 $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ Matrix $matrix;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ gzs<Float> $progress;
        final /* synthetic */ RenderMode $renderMode;
        final /* synthetic */ boolean $safeMode;
        final /* synthetic */ wh50<l800> $setDynamicProperties$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Rect rect, wkj wkjVar, dt1 dt1Var, Matrix matrix, k800 k800Var, boolean z, boolean z2, RenderMode renderMode, AsyncUpdates asyncUpdates, i700 i700Var, Map<String, ? extends Typeface> map, l800 l800Var, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Context context, gzs<Float> gzsVar, wh50<l800> wh50Var) {
            super(1);
            this.$bounds = rect;
            this.$contentScale = wkjVar;
            this.$alignment = dt1Var;
            this.$matrix = matrix;
            this.$drawable = k800Var;
            this.$enableMergePaths = z;
            this.$safeMode = z2;
            this.$renderMode = renderMode;
            this.$asyncUpdates = asyncUpdates;
            this.$composition = i700Var;
            this.$fontMap = map;
            this.$dynamicProperties = l800Var;
            this.$outlineMasksAndMattes = z3;
            this.$applyOpacityToLayers = z4;
            this.$applyShadowToLayers = z5;
            this.$maintainOriginalImageBounds = z6;
            this.$clipToCompositionBounds = z7;
            this.$clipTextToBoundingBox = z8;
            this.$context = context;
            this.$progress = gzsVar;
            this.$setDynamicProperties$delegate = wh50Var;
        }

        /* JADX WARN: Code restructure failed: missing block: B:152:0x0482, code lost:
        
            if (r7.K != r5.i()) goto L151;
         */
        /* JADX WARN: Code restructure failed: missing block: B:153:0x0484, code lost:
        
            r4.execute(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:157:0x04a8, code lost:
        
            if (r7.K != r5.i()) goto L151;
         */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke(oio oioVar) {
            oio oioVar2 = oioVar;
            Rect rect = this.$bounds;
            wkj wkjVar = this.$contentScale;
            dt1 dt1Var = this.$alignment;
            Matrix matrix = this.$matrix;
            k800 k800Var = this.$drawable;
            boolean z = this.$enableMergePaths;
            boolean z2 = this.$safeMode;
            RenderMode renderMode = this.$renderMode;
            AsyncUpdates asyncUpdates = this.$asyncUpdates;
            i700 i700Var = this.$composition;
            Map<String, Typeface> map = this.$fontMap;
            l800 l800Var = this.$dynamicProperties;
            boolean z3 = this.$outlineMasksAndMattes;
            boolean z4 = this.$applyOpacityToLayers;
            boolean z5 = this.$applyShadowToLayers;
            boolean z6 = this.$maintainOriginalImageBounds;
            boolean z7 = this.$clipToCompositionBounds;
            boolean z8 = this.$clipTextToBoundingBox;
            Context context = this.$context;
            gzs<Float> gzsVar = this.$progress;
            wh50<l800> wh50Var = this.$setDynamicProperties$delegate;
            yq9 a = oioVar2.a0().a();
            long floatToRawIntBits = (Float.floatToRawIntBits(rect.width()) << 32) | (Float.floatToRawIntBits(rect.height()) & 4294967295L);
            long h = pli.h(an10.b(Float.intBitsToFloat((int) (oioVar2.d() >> 32))), an10.b(Float.intBitsToFloat((int) (oioVar2.d() & 4294967295L))));
            long a2 = wkjVar.a(floatToRawIntBits, oioVar2.d());
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            int i = m4h0.a;
            int i2 = (int) (a2 >> 32);
            int intBitsToFloat2 = (int) (Float.intBitsToFloat(i2) * intBitsToFloat);
            float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            int i3 = (int) (a2 & 4294967295L);
            long a3 = dt1Var.a(pli.h(intBitsToFloat2, (int) (Float.intBitsToFloat(i3) * intBitsToFloat3)), h, oioVar2.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate((int) (a3 >> 32), (int) (a3 & 4294967295L));
            matrix.preScale(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3));
            k800Var.i(LottieFeatureFlag.MergePathsApi19, z);
            k800Var.f = z2;
            k800Var.y = renderMode;
            k800Var.f();
            k800Var.O = asyncUpdates;
            k800Var.s(i700Var);
            if (map != k800Var.m) {
                k800Var.m = map;
                k800Var.invalidateSelf();
            }
            if (l800Var != wh50Var.getValue()) {
                l800 value = wh50Var.getValue();
                if (value != null) {
                    for (n800 n800Var : value.a) {
                        k800Var.a(n800Var.b, n800Var.a, null);
                    }
                    for (n800 n800Var2 : value.b) {
                        k800Var.a(n800Var2.b, n800Var2.a, null);
                    }
                    for (n800 n800Var3 : value.c) {
                        k800Var.a(n800Var3.b, n800Var3.a, null);
                    }
                    for (n800 n800Var4 : value.d) {
                        k800Var.a(n800Var4.b, n800Var4.a, null);
                    }
                    for (n800 n800Var5 : value.e) {
                        k800Var.a(n800Var5.b, n800Var5.a, null);
                    }
                    for (n800 n800Var6 : value.f) {
                        k800Var.a(n800Var6.b, n800Var6.a, null);
                    }
                    for (n800 n800Var7 : value.g) {
                        k800Var.a(n800Var7.b, n800Var7.a, null);
                    }
                    for (n800 n800Var8 : value.h) {
                        k800Var.a(n800Var8.b, n800Var8.a, null);
                    }
                    for (n800 n800Var9 : value.i) {
                        k800Var.a(n800Var9.b, n800Var9.a, null);
                    }
                    for (n800 n800Var10 : value.j) {
                        k800Var.a(n800Var10.b, n800Var10.a, null);
                    }
                }
                if (l800Var != null) {
                    for (n800 n800Var11 : l800Var.a) {
                        k800Var.a(n800Var11.b, n800Var11.a, new m800(n800Var11.c));
                    }
                    for (n800 n800Var12 : l800Var.b) {
                        k800Var.a(n800Var12.b, n800Var12.a, new m800(n800Var12.c));
                    }
                    for (n800 n800Var13 : l800Var.c) {
                        k800Var.a(n800Var13.b, n800Var13.a, new m800(n800Var13.c));
                    }
                    for (n800 n800Var14 : l800Var.d) {
                        k800Var.a(n800Var14.b, n800Var14.a, new m800(n800Var14.c));
                    }
                    for (n800 n800Var15 : l800Var.e) {
                        k800Var.a(n800Var15.b, n800Var15.a, new m800(n800Var15.c));
                    }
                    for (n800 n800Var16 : l800Var.f) {
                        k800Var.a(n800Var16.b, n800Var16.a, new m800(n800Var16.c));
                    }
                    for (n800 n800Var17 : l800Var.g) {
                        k800Var.a(n800Var17.b, n800Var17.a, new m800(n800Var17.c));
                    }
                    for (n800 n800Var18 : l800Var.h) {
                        k800Var.a(n800Var18.b, n800Var18.a, new m800(n800Var18.c));
                    }
                    for (n800 n800Var19 : l800Var.i) {
                        k800Var.a(n800Var19.b, n800Var19.a, new m800(n800Var19.c));
                    }
                    for (n800 n800Var20 : l800Var.j) {
                        k800Var.a(n800Var20.b, n800Var20.a, new m800(n800Var20.c));
                    }
                }
                wh50Var.setValue(l800Var);
            }
            if (k800Var.u != z3) {
                k800Var.u = z3;
                com.airbnb.lottie.model.layer.b bVar = k800Var.r;
                if (bVar != null) {
                    bVar.q(z3);
                }
            }
            k800Var.v = z4;
            k800Var.w = z5;
            k800Var.p = z6;
            if (z7 != k800Var.q) {
                k800Var.q = z7;
                com.airbnb.lottie.model.layer.b bVar2 = k800Var.r;
                if (bVar2 != null) {
                    bVar2.L = z7;
                }
                k800Var.invalidateSelf();
            }
            if (z8 != k800Var.x) {
                k800Var.x = z8;
                k800Var.invalidateSelf();
            }
            Iterator<String> it = k800.S.iterator();
            go00 go00Var = null;
            while (it.hasNext()) {
                go00Var = k800Var.b.e(it.next());
                if (go00Var != null) {
                    break;
                }
            }
            if (k800Var.b(context) || go00Var == null) {
                k800Var.B(gzsVar.invoke().floatValue());
            } else {
                k800Var.B(go00Var.b);
            }
            k800Var.setBounds(0, 0, rect.width(), rect.height());
            Canvas canvas = e52.a;
            Canvas canvas2 = ((d52) a).a;
            kv3 kv3Var = k800Var.Q;
            ThreadPoolExecutor threadPoolExecutor = k800.T;
            z800 z800Var = k800Var.c;
            Semaphore semaphore = k800Var.P;
            com.airbnb.lottie.model.layer.b bVar3 = k800Var.r;
            i700 i700Var2 = k800Var.b;
            if (bVar3 != null && i700Var2 != null) {
                AsyncUpdates asyncUpdates2 = k800Var.O;
                if (asyncUpdates2 == null) {
                    asyncUpdates2 = tky.a;
                }
                boolean z9 = asyncUpdates2 == AsyncUpdates.ENABLED;
                if (z9) {
                    try {
                        semaphore.acquire();
                        if (k800Var.C()) {
                            k800Var.B(z800Var.i());
                        }
                    } catch (InterruptedException unused) {
                        if (z9) {
                            semaphore.release();
                        }
                    } catch (Throwable th) {
                        if (z9) {
                            semaphore.release();
                            if (bVar3.K != z800Var.i()) {
                                threadPoolExecutor.execute(kv3Var);
                            }
                        }
                        throw th;
                    }
                }
                if (k800Var.f) {
                    try {
                        int i4 = k800Var.s;
                        if (k800Var.z) {
                            canvas2.save();
                            canvas2.concat(matrix);
                            k800Var.q(canvas2, bVar3);
                            canvas2.restore();
                        } else {
                            bVar3.e(canvas2, matrix, i4, null);
                        }
                    } catch (Throwable unused2) {
                        n100.a.getClass();
                        AsyncUpdates asyncUpdates3 = tky.a;
                    }
                } else {
                    int i5 = k800Var.s;
                    if (k800Var.z) {
                        canvas2.save();
                        canvas2.concat(matrix);
                        k800Var.q(canvas2, bVar3);
                        canvas2.restore();
                    } else {
                        bVar3.e(canvas2, matrix, i5, null);
                    }
                }
                k800Var.N = false;
                if (z9) {
                    semaphore.release();
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: LottieAnimation.kt */
    public static final class c extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$default;
        final /* synthetic */ dt1 $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ boolean $applyShadowToLayers;
        final /* synthetic */ AsyncUpdates $asyncUpdates;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ i700 $composition;
        final /* synthetic */ wkj $contentScale;
        final /* synthetic */ l800 $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ gzs<Float> $progress;
        final /* synthetic */ RenderMode $renderMode;
        final /* synthetic */ boolean $safeMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(i700 i700Var, gzs<Float> gzsVar, q630 q630Var, boolean z, boolean z2, boolean z3, boolean z4, RenderMode renderMode, boolean z5, l800 l800Var, dt1 dt1Var, wkj wkjVar, boolean z6, boolean z7, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z8, int i, int i2, int i3) {
            super(2);
            this.$composition = i700Var;
            this.$progress = gzsVar;
            this.$modifier = q630Var;
            this.$outlineMasksAndMattes = z;
            this.$applyOpacityToLayers = z2;
            this.$applyShadowToLayers = z3;
            this.$enableMergePaths = z4;
            this.$renderMode = renderMode;
            this.$maintainOriginalImageBounds = z5;
            this.$dynamicProperties = l800Var;
            this.$alignment = dt1Var;
            this.$contentScale = wkjVar;
            this.$clipToCompositionBounds = z6;
            this.$clipTextToBoundingBox = z7;
            this.$fontMap = map;
            this.$asyncUpdates = asyncUpdates;
            this.$safeMode = z8;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            z600.a(this.$composition, this.$progress, this.$modifier, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$applyShadowToLayers, this.$enableMergePaths, this.$renderMode, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$asyncUpdates, this.$safeMode, aVar, ne7.I(this.$$changed | 1), ne7.I(this.$$changed1), this.$$default);
            return s3q0.a;
        }
    }

    /* compiled from: LottieAnimation.kt */
    public static final class d extends Lambda implements gzs<Float> {
        final /* synthetic */ c700 $progress$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s600 s600Var) {
            super(0);
            this.$progress$delegate = s600Var;
        }

        @Override // xsna.gzs
        public final Float invoke() {
            return Float.valueOf(this.$progress$delegate.getValue().floatValue());
        }
    }

    /* compiled from: LottieAnimation.kt */
    public static final class e extends Lambda implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ int $$changed1;
        final /* synthetic */ int $$changed2;
        final /* synthetic */ int $$default;
        final /* synthetic */ dt1 $alignment;
        final /* synthetic */ boolean $applyOpacityToLayers;
        final /* synthetic */ boolean $applyShadowToLayers;
        final /* synthetic */ AsyncUpdates $asyncUpdates;
        final /* synthetic */ h700 $clipSpec;
        final /* synthetic */ boolean $clipTextToBoundingBox;
        final /* synthetic */ boolean $clipToCompositionBounds;
        final /* synthetic */ i700 $composition;
        final /* synthetic */ wkj $contentScale;
        final /* synthetic */ l800 $dynamicProperties;
        final /* synthetic */ boolean $enableMergePaths;
        final /* synthetic */ Map<String, Typeface> $fontMap;
        final /* synthetic */ boolean $isPlaying;
        final /* synthetic */ int $iterations;
        final /* synthetic */ boolean $maintainOriginalImageBounds;
        final /* synthetic */ q630 $modifier;
        final /* synthetic */ boolean $outlineMasksAndMattes;
        final /* synthetic */ RenderMode $renderMode;
        final /* synthetic */ boolean $restartOnPlay;
        final /* synthetic */ boolean $reverseOnRepeat;
        final /* synthetic */ boolean $safeMode;
        final /* synthetic */ float $speed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(i700 i700Var, q630 q630Var, boolean z, boolean z2, h700 h700Var, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, RenderMode renderMode, boolean z7, boolean z8, l800 l800Var, dt1 dt1Var, wkj wkjVar, boolean z9, boolean z10, Map<String, ? extends Typeface> map, boolean z11, AsyncUpdates asyncUpdates, int i2, int i3, int i4, int i5) {
            super(2);
            this.$composition = i700Var;
            this.$modifier = q630Var;
            this.$isPlaying = z;
            this.$restartOnPlay = z2;
            this.$clipSpec = h700Var;
            this.$speed = f;
            this.$iterations = i;
            this.$outlineMasksAndMattes = z3;
            this.$applyOpacityToLayers = z4;
            this.$applyShadowToLayers = z5;
            this.$enableMergePaths = z6;
            this.$renderMode = renderMode;
            this.$reverseOnRepeat = z7;
            this.$maintainOriginalImageBounds = z8;
            this.$dynamicProperties = l800Var;
            this.$alignment = dt1Var;
            this.$contentScale = wkjVar;
            this.$clipToCompositionBounds = z9;
            this.$clipTextToBoundingBox = z10;
            this.$fontMap = map;
            this.$safeMode = z11;
            this.$asyncUpdates = asyncUpdates;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$changed2 = i4;
            this.$$default = i5;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            z600.b(this.$composition, this.$modifier, this.$isPlaying, this.$restartOnPlay, this.$clipSpec, this.$speed, this.$iterations, this.$outlineMasksAndMattes, this.$applyOpacityToLayers, this.$applyShadowToLayers, this.$enableMergePaths, this.$renderMode, this.$reverseOnRepeat, this.$maintainOriginalImageBounds, this.$dynamicProperties, this.$alignment, this.$contentScale, this.$clipToCompositionBounds, this.$clipTextToBoundingBox, this.$fontMap, this.$safeMode, this.$asyncUpdates, aVar, ne7.I(this.$$changed | 1), ne7.I(this.$$changed1), ne7.I(this.$$changed2), this.$$default);
            return s3q0.a;
        }
    }

    public static final void a(i700 i700Var, gzs<Float> gzsVar, q630 q630Var, boolean z, boolean z2, boolean z3, boolean z4, RenderMode renderMode, boolean z5, l800 l800Var, dt1 dt1Var, wkj wkjVar, boolean z6, boolean z7, Map<String, ? extends Typeface> map, AsyncUpdates asyncUpdates, boolean z8, androidx.compose.runtime.a aVar, int i, int i2, int i3) {
        dt1 dt1Var2;
        Object obj;
        androidx.compose.runtime.a M = aVar.M(382909894);
        q630 q630Var2 = (i3 & 4) != 0 ? q630.a.a : q630Var;
        boolean z9 = (i3 & 8) != 0 ? false : z;
        boolean z10 = (i3 & 16) != 0 ? false : z2;
        boolean z11 = (i3 & 32) != 0 ? true : z3;
        boolean z12 = (i3 & 64) != 0 ? false : z4;
        RenderMode renderMode2 = (i3 & 128) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z13 = (i3 & 256) != 0 ? false : z5;
        l800 l800Var2 = (i3 & 512) != 0 ? null : l800Var;
        if ((i3 & 1024) != 0) {
            dt1.a.getClass();
            dt1Var2 = dt1.a.f;
        } else {
            dt1Var2 = dt1Var;
        }
        wkj wkjVar2 = (i3 & 2048) != 0 ? wkj.a.b : wkjVar;
        boolean z14 = (i3 & 4096) != 0 ? true : z6;
        boolean z15 = (i3 & 8192) != 0 ? false : z7;
        Map<String, ? extends Typeface> map2 = (i3 & 16384) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i3 & 32768) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z16 = (i3 & 65536) != 0 ? false : z8;
        if (androidx.compose.runtime.b.d()) {
            obj = null;
            androidx.compose.runtime.b.f(382909894, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:97)");
        } else {
            obj = null;
        }
        M.T(185152185);
        Object x = M.x();
        a.C0011a.C0012a c0012a = a.C0011a.a;
        if (x == c0012a) {
            x = new k800();
            M.R(x);
        }
        k800 k800Var = (k800) x;
        M.b0();
        M.T(185152232);
        Object x2 = M.x();
        if (x2 == c0012a) {
            x2 = new Matrix();
            M.R(x2);
        }
        Matrix matrix = (Matrix) x2;
        M.b0();
        M.T(185152312);
        boolean J = M.J(i700Var);
        Object x3 = M.x();
        if (J || x3 == c0012a) {
            x3 = androidx.compose.runtime.k.b(obj);
            M.R(x3);
        }
        wh50 wh50Var = (wh50) x3;
        M.b0();
        M.T(185152364);
        if (i700Var == null || i700Var.b() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            q630 q630Var3 = q630Var2;
            wkj wkjVar3 = wkjVar2;
            boolean z17 = z12;
            l800 l800Var3 = l800Var2;
            boolean z18 = z9;
            boolean z19 = z10;
            dt1 dt1Var3 = dt1Var2;
            boolean z20 = z13;
            boolean z21 = z14;
            boolean z22 = z15;
            AsyncUpdates asyncUpdates3 = asyncUpdates2;
            boolean z23 = z16;
            Map<String, ? extends Typeface> map3 = map2;
            RenderMode renderMode3 = renderMode2;
            ja8.a(q630Var3, M, (i >> 6) & 14);
            M.b0();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new a(i700Var, gzsVar, q630Var3, z18, z19, z11, z17, renderMode3, z20, l800Var3, dt1Var3, wkjVar3, z21, z22, map3, asyncUpdates3, z23, i, i2, i3);
                return;
            }
            return;
        }
        M.b0();
        l800 l800Var4 = l800Var2;
        Map<String, ? extends Typeface> map4 = map2;
        RenderMode renderMode4 = renderMode2;
        Rect rect = i700Var.k;
        Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
        q630 g = q630Var2.g(new a700(rect.width(), rect.height()));
        q630 q630Var4 = q630Var2;
        wkj wkjVar4 = wkjVar2;
        boolean z24 = z16;
        dt1 dt1Var4 = dt1Var2;
        boolean z25 = z11;
        boolean z26 = z12;
        AsyncUpdates asyncUpdates4 = asyncUpdates2;
        b bVar = new b(rect, wkjVar4, dt1Var4, matrix, k800Var, z26, z24, renderMode4, asyncUpdates4, i700Var, map4, l800Var4, z9, z10, z25, z13, z14, z15, context, gzsVar, wh50Var);
        boolean z27 = z13;
        boolean z28 = z9;
        boolean z29 = z10;
        boolean z30 = z14;
        boolean z31 = z15;
        xa4.i(0, M, bVar, g);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new c(i700Var, gzsVar, q630Var4, z28, z29, z25, z26, renderMode4, z27, l800Var4, dt1Var4, wkjVar4, z30, z31, map4, asyncUpdates4, z24, i, i2, i3);
        }
    }

    public static final void b(i700 i700Var, q630 q630Var, boolean z, boolean z2, h700 h700Var, float f, int i, boolean z3, boolean z4, boolean z5, boolean z6, RenderMode renderMode, boolean z7, boolean z8, l800 l800Var, dt1 dt1Var, wkj wkjVar, boolean z9, boolean z10, Map<String, ? extends Typeface> map, boolean z11, AsyncUpdates asyncUpdates, androidx.compose.runtime.a aVar, int i2, int i3, int i4, int i5) {
        dt1 dt1Var2;
        l800 l800Var2;
        androidx.compose.runtime.a M = aVar.M(1331239405);
        q630 q630Var2 = (i5 & 2) != 0 ? q630.a.a : q630Var;
        boolean z12 = (i5 & 4) != 0 ? true : z;
        boolean z13 = (i5 & 8) != 0 ? true : z2;
        h700 h700Var2 = (i5 & 16) != 0 ? null : h700Var;
        float f2 = (i5 & 32) != 0 ? 1.0f : f;
        int i6 = (i5 & 64) != 0 ? 1 : i;
        boolean z14 = (i5 & 128) != 0 ? false : z3;
        boolean z15 = (i5 & 256) != 0 ? false : z4;
        boolean z16 = (i5 & 512) != 0 ? true : z5;
        boolean z17 = (i5 & 1024) != 0 ? false : z6;
        RenderMode renderMode2 = (i5 & 2048) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z18 = (i5 & 4096) != 0 ? false : z7;
        boolean z19 = (i5 & 8192) != 0 ? false : z8;
        l800 l800Var3 = (i5 & 16384) != 0 ? null : l800Var;
        if ((i5 & 32768) != 0) {
            dt1.a.getClass();
            dt1Var2 = dt1.a.f;
        } else {
            dt1Var2 = dt1Var;
        }
        wkj wkjVar2 = (i5 & 65536) != 0 ? wkj.a.b : wkjVar;
        boolean z20 = (i5 & 131072) != 0 ? true : z9;
        boolean z21 = (i5 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? false : z10;
        Map<String, ? extends Typeface> map2 = (i5 & 524288) != 0 ? null : map;
        boolean z22 = (i5 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? false : z11;
        AsyncUpdates asyncUpdates2 = (i5 & 2097152) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (androidx.compose.runtime.b.d()) {
            l800Var2 = l800Var3;
            androidx.compose.runtime.b.f(1331239405, i2, i3, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:224)");
        } else {
            l800Var2 = l800Var3;
        }
        int i7 = i2 >> 3;
        boolean z23 = z12;
        boolean z24 = z13;
        h700 h700Var3 = h700Var2;
        int i8 = i6;
        s600 k = emi.k(i700Var, z23, z24, z18, h700Var3, f2, i8, M, (i7 & 896) | (i7 & 112) | 8 | ((i3 << 3) & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016), 896);
        q630 q630Var3 = q630Var2;
        boolean z25 = z16;
        boolean z26 = z14;
        M.T(185157769);
        boolean J = M.J(k);
        Object x = M.x();
        if (J || x == a.C0011a.a) {
            x = new d(k);
            M.R(x);
        }
        gzs gzsVar = (gzs) x;
        M.b0();
        int i9 = i2 >> 12;
        int i10 = i3 << 18;
        int i11 = (i9 & 7168) | ((i2 << 3) & 896) | 1073741832 | (i9 & 57344) | (i9 & 458752) | (i10 & 3670016) | (i10 & 29360128) | ((i3 << 15) & 234881024);
        int i12 = i3 >> 15;
        l800 l800Var4 = l800Var2;
        boolean z27 = z17;
        boolean z28 = z15;
        dt1 dt1Var3 = dt1Var2;
        wkj wkjVar3 = wkjVar2;
        boolean z29 = z20;
        boolean z30 = z21;
        Map<String, ? extends Typeface> map3 = map2;
        boolean z31 = z22;
        AsyncUpdates asyncUpdates3 = asyncUpdates2;
        a(i700Var, gzsVar, q630Var3, z26, z28, z25, z27, renderMode2, z19, l800Var4, dt1Var3, wkjVar3, z29, z30, map3, asyncUpdates3, z31, M, i11, (i12 & 896) | (i12 & 14) | 32768 | (i12 & 112) | (i12 & 7168) | ((i4 << 12) & 458752) | ((i4 << 18) & 3670016), 0);
        float f3 = f2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new e(i700Var, q630Var3, z23, z24, h700Var3, f3, i8, z26, z28, z25, z27, renderMode2, z18, z19, l800Var4, dt1Var3, wkjVar3, z29, z30, map3, z31, asyncUpdates3, i2, i3, i4, i5);
        }
    }
}
