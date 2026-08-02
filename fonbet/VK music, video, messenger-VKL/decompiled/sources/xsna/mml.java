package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.b;
import com.google.common.collect.ImmutableList;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* compiled from: DefaultShaderProgram.java */
/* loaded from: classes12.dex */
public final class mml extends pd6 implements pfq {
    public static final com.google.common.collect.g w;
    public static final float[] x;
    public static final float[] y;
    public final androidx.media3.common.util.b h;
    public final ImmutableList<j0u> i;
    public final ImmutableList<pjg0> j;
    public final boolean k;
    public final float[][] l;
    public final float[][] m;
    public final float[] n;
    public final float[] o;
    public final float[] p;
    public final int q;
    public com.google.common.collect.g r;
    public Gainmap s;
    public int t;
    public boolean u;
    public boolean v;

    static {
        float[] fArr = {-1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        float[] fArr2 = {-1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        float[] fArr3 = {1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        float[] fArr4 = {1.0f, -1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        ImmutableList.b bVar = ImmutableList.c;
        Object[] objArr = {fArr, fArr2, fArr3, fArr4};
        ne7.l(objArr);
        w = ImmutableList.l(4, objArr);
        x = new float[]{1.0f, 1.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.1646f, 1.8814f, 1.4746f, -0.5714f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        y = new float[]{1.1689f, 1.1689f, 1.1689f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -0.1881f, 2.1502f, 1.6853f, -0.653f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
    }

    public mml(androidx.media3.common.util.b bVar, ImmutableList immutableList, ImmutableList immutableList2, boolean z) {
        super(z, 1);
        this.h = bVar;
        this.i = immutableList;
        this.j = immutableList2;
        this.k = z;
        int[] iArr = {immutableList.size(), 16};
        Class cls = Float.TYPE;
        this.l = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        this.m = (float[][]) Array.newInstance((Class<?>) cls, immutableList2.size(), 16);
        this.n = GlUtil.g();
        this.o = GlUtil.g();
        this.p = new float[16];
        this.r = w;
        this.t = -1;
        int i = 9729;
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            i = Math.max(i, ((j0u) immutableList.get(i2)).d());
        }
        this.q = i;
    }

    public static mml j(Context context, com.google.common.collect.g gVar, com.google.common.collect.g gVar2, boolean z) throws VideoFrameProcessingException {
        return new mml(l(context, "shaders/vertex_shader_transformation_es2.glsl", gVar2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl"), ImmutableList.m(gVar), ImmutableList.m(gVar2), z);
    }

    public static mml k(Context context, com.google.common.collect.g gVar, List list, m6g m6gVar, int i) throws VideoFrameProcessingException {
        boolean h = m6g.h(m6gVar);
        boolean z = i == 2;
        androidx.media3.common.util.b l = l(context, h ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", h ? "shaders/fragment_shader_oetf_es3.glsl" : z ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i2 = m6gVar.c;
        if (h) {
            fxc0.p(i2 == 7 || i2 == 6);
            l.f("uOutputColorTransfer", i2);
        } else if (z) {
            fxc0.p(i2 == 3 || i2 == 10);
            l.f("uOutputColorTransfer", i2);
        }
        return new mml(l, ImmutableList.m(gVar), ImmutableList.m(list), h);
    }

    public static androidx.media3.common.util.b l(Context context, String str, String str2) throws VideoFrameProcessingException {
        try {
            androidx.media3.common.util.b bVar = new androidx.media3.common.util.b(context, str, str2);
            bVar.e("uTexTransformationMatrix", GlUtil.g());
            return bVar;
        } catch (GlUtil.GlException | IOException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    public static mml m(androidx.media3.common.util.b bVar, m6g m6gVar, m6g m6gVar2, ImmutableList immutableList) {
        boolean h = m6g.h(m6gVar);
        int i = m6gVar.a;
        boolean z = (i == 1 || i == 2) && m6gVar2.a == 6;
        int i2 = m6gVar2.c;
        if (h) {
            if (i2 == 3) {
                i2 = 10;
            }
            fxc0.p(i2 == 1 || i2 == 10 || i2 == 6 || i2 == 7);
            bVar.f("uOutputColorTransfer", i2);
        } else if (z) {
            fxc0.p(i2 == 1 || i2 == 6 || i2 == 7);
            bVar.f("uOutputColorTransfer", i2);
        } else {
            bVar.f("uSdrWorkingColorSpace", 0);
            fxc0.p(i2 == 3 || i2 == 1);
            bVar.f("uOutputColorTransfer", i2);
        }
        return new mml(bVar, immutableList, com.google.common.collect.g.f, h || z);
    }

    public static boolean p(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                fxc0.A(fArr4.length == 16, "A 4x4 transformation matrix must have 16 elements");
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    @Override // xsna.pd6
    public final jxj0 g(int i, int i2) {
        return wn10.b(i, i2, this.i);
    }

    @Override // xsna.pd6
    public final void h(int i, long j) throws VideoFrameProcessingException {
        boolean z;
        boolean z2;
        androidx.media3.common.util.b bVar = this.h;
        ImmutableList<pjg0> immutableList = this.j;
        int[] iArr = {immutableList.size(), 16};
        int i2 = 0;
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) cls, iArr);
        for (int i3 = 0; i3 < immutableList.size(); i3++) {
            fArr[i3] = immutableList.get(i3).b();
        }
        boolean p = p(this.m, fArr);
        float[] fArr2 = this.p;
        float[] fArr3 = this.o;
        if (p) {
            Matrix.setIdentityM(fArr3, 0);
            for (int i4 = 0; i4 < immutableList.size(); i4++) {
                Matrix.multiplyMM(this.p, 0, immutableList.get(i4).b(), 0, this.o, 0);
                System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
            }
            z = true;
        } else {
            z = false;
        }
        ImmutableList<j0u> immutableList2 = this.i;
        float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) cls, immutableList2.size(), 16);
        for (int i5 = 0; i5 < immutableList2.size(); i5++) {
            fArr4[i5] = immutableList2.get(i5).c(j);
        }
        float[][] fArr5 = this.l;
        boolean p2 = p(fArr5, fArr4);
        float[] fArr6 = this.n;
        if (p2) {
            Matrix.setIdentityM(fArr6, 0);
            this.r = w;
            int length = fArr5.length;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    z2 = z;
                    int i7 = i2;
                    Matrix.invertM(fArr2, i7, fArr6, i7);
                    this.r = wn10.d(fArr2, this.r);
                    break;
                }
                float[] fArr7 = fArr5[i6];
                Matrix.multiplyMM(this.p, 0, fArr7, 0, this.n, 0);
                System.arraycopy(fArr2, i2, fArr6, i2, fArr2.length);
                com.google.common.collect.g d = wn10.d(fArr7, this.r);
                fxc0.q(d.e >= 3, "A polygon must have at least 3 vertices.");
                ImmutableList.a aVar = new ImmutableList.a();
                aVar.e(d);
                int i8 = 0;
                while (i8 < 6) {
                    float[] fArr8 = wn10.a[i8];
                    com.google.common.collect.g g = aVar.g();
                    ImmutableList.a aVar2 = new ImmutableList.a();
                    boolean z3 = z;
                    int i9 = 0;
                    while (i9 < g.e) {
                        float[] fArr9 = (float[]) g.get(i9);
                        int i10 = length;
                        float[] fArr10 = (float[]) g.get(((r5 + i9) - 1) % g.e);
                        if (wn10.c(fArr9, fArr8)) {
                            if (!wn10.c(fArr10, fArr8)) {
                                float[] a = wn10.a(fArr8, fArr8, fArr10, fArr9);
                                if (!Arrays.equals(fArr9, a)) {
                                    aVar2.c(a);
                                }
                            }
                            aVar2.c(fArr9);
                        } else if (wn10.c(fArr10, fArr8)) {
                            float[] a2 = wn10.a(fArr8, fArr8, fArr10, fArr9);
                            if (!Arrays.equals(fArr10, a2)) {
                                aVar2.c(a2);
                            }
                        }
                        i9++;
                        length = i10;
                    }
                    i8++;
                    aVar = aVar2;
                    z = z3;
                }
                z2 = z;
                int i11 = length;
                com.google.common.collect.g g2 = aVar.g();
                this.r = g2;
                if (g2.e < 3) {
                    break;
                }
                i6++;
                z = z2;
                length = i11;
                i2 = 0;
            }
            i2 = 1;
        } else {
            z2 = z;
        }
        boolean z4 = z2 || i2 != 0;
        if (this.r.e < 3) {
            return;
        }
        if (this.u && !z4 && this.v) {
            return;
        }
        try {
            int i12 = bVar.a;
            HashMap hashMap = bVar.e;
            GLES20.glUseProgram(i12);
            GlUtil.d();
            o();
            int i13 = this.q;
            b.C0044b c0044b = (b.C0044b) hashMap.get("uTexSampler");
            c0044b.getClass();
            c0044b.e = i;
            c0044b.f = 0;
            c0044b.g = i13;
            bVar.e("uTransformationMatrix", fArr6);
            b.C0044b c0044b2 = (b.C0044b) hashMap.get("uRgbMatrix");
            if (c0044b2 != null) {
                System.arraycopy(fArr3, 0, c0044b2.c, 0, fArr3.length);
            }
            com.google.common.collect.g gVar = this.r;
            float[] fArr11 = new float[gVar.e * 4];
            for (int i14 = 0; i14 < gVar.e; i14++) {
                System.arraycopy(gVar.get(i14), 0, fArr11, i14 * 4, 4);
            }
            bVar.c(fArr11);
            bVar.b();
            GLES20.glDrawArrays(6, 0, this.r.e);
            GlUtil.d();
            this.v = true;
        } catch (GlUtil.GlException e) {
            throw new VideoFrameProcessingException(j, e);
        }
    }

    @Override // xsna.pd6
    public final boolean i() {
        return (this.v && this.u) ? false : true;
    }

    public final void n(Gainmap gainmap) throws GlUtil.GlException {
        Bitmap gainmapContents;
        Bitmap gainmapContents2;
        float[] gamma;
        float[] gamma2;
        float[] ratioMax;
        float[] ratioMax2;
        float[] ratioMin;
        float[] ratioMin2;
        float[] epsilonHdr;
        float[] epsilonHdr2;
        float[] epsilonSdr;
        float[] epsilonSdr2;
        float displayRatioForFullHdr;
        float displayRatioForFullHdr2;
        float minDisplayRatioForHdrTransition;
        float minDisplayRatioForHdrTransition2;
        Bitmap gainmapContents3;
        Bitmap gainmapContents4;
        Bitmap gainmapContents5;
        Bitmap gainmapContents6;
        if (this.k) {
            Gainmap gainmap2 = this.s;
            if (gainmap2 != null) {
                gamma = gainmap2.getGamma();
                gamma2 = gainmap.getGamma();
                if (gamma == gamma2) {
                    ratioMax = gainmap2.getRatioMax();
                    ratioMax2 = gainmap.getRatioMax();
                    if (ratioMax == ratioMax2) {
                        ratioMin = gainmap2.getRatioMin();
                        ratioMin2 = gainmap.getRatioMin();
                        if (ratioMin == ratioMin2) {
                            epsilonHdr = gainmap2.getEpsilonHdr();
                            epsilonHdr2 = gainmap.getEpsilonHdr();
                            if (epsilonHdr == epsilonHdr2) {
                                epsilonSdr = gainmap2.getEpsilonSdr();
                                epsilonSdr2 = gainmap.getEpsilonSdr();
                                if (epsilonSdr == epsilonSdr2) {
                                    displayRatioForFullHdr = gainmap2.getDisplayRatioForFullHdr();
                                    displayRatioForFullHdr2 = gainmap.getDisplayRatioForFullHdr();
                                    if (displayRatioForFullHdr == displayRatioForFullHdr2) {
                                        minDisplayRatioForHdrTransition = gainmap2.getMinDisplayRatioForHdrTransition();
                                        minDisplayRatioForHdrTransition2 = gainmap.getMinDisplayRatioForHdrTransition();
                                        if (minDisplayRatioForHdrTransition == minDisplayRatioForHdrTransition2) {
                                            gainmapContents3 = gainmap2.getGainmapContents();
                                            gainmapContents4 = gainmap.getGainmapContents();
                                            if (gainmapContents3 == gainmapContents4) {
                                                gainmapContents5 = gainmap2.getGainmapContents();
                                                int generationId = gainmapContents5.getGenerationId();
                                                gainmapContents6 = gainmap.getGainmapContents();
                                                if (generationId == gainmapContents6.getGenerationId()) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.v = false;
            this.s = gainmap;
            int i = this.t;
            if (i != -1) {
                gainmapContents = gainmap.getGainmapContents();
                GlUtil.a(gainmapContents.getWidth(), gainmapContents.getHeight());
                GlUtil.b(3553, i, 9729);
                GLUtils.texImage2D(3553, 0, gainmapContents, 0);
                GlUtil.d();
                return;
            }
            gainmapContents2 = gainmap.getGainmapContents();
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GlUtil.d();
            int i2 = iArr[0];
            GlUtil.a(gainmapContents2.getWidth(), gainmapContents2.getHeight());
            GlUtil.b(3553, i2, 9729);
            GLUtils.texImage2D(3553, 0, gainmapContents2, 0);
            GlUtil.d();
            this.t = i2;
        }
    }

    public final void o() throws GlUtil.GlException {
        Bitmap gainmapContents;
        float[] gamma;
        int i;
        float[] ratioMin;
        float[] ratioMax;
        float[] epsilonSdr;
        float[] epsilonHdr;
        float displayRatioForFullHdr;
        float minDisplayRatioForHdrTransition;
        float[] ratioMax2;
        float[] ratioMin2;
        if (this.s == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 34) {
            throw new IllegalStateException("Gainmaps not supported under API 34.");
        }
        int i2 = this.t;
        androidx.media3.common.util.b bVar = this.h;
        bVar.g(i2, 1, "uGainmapTexSampler");
        Gainmap gainmap = this.s;
        gainmapContents = gainmap.getGainmapContents();
        int i3 = gainmapContents.getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
        gamma = gainmap.getGamma();
        int i4 = (gamma[0] == 1.0f && gamma[1] == 1.0f && gamma[2] == 1.0f) ? 1 : 0;
        if (t2t.a(gamma)) {
            ratioMax2 = gainmap.getRatioMax();
            if (t2t.a(ratioMax2)) {
                ratioMin2 = gainmap.getRatioMin();
                if (t2t.a(ratioMin2)) {
                    i = 1;
                    bVar.f("uGainmapIsAlpha", i3);
                    bVar.f("uNoGamma", i4);
                    bVar.f("uSingleChannel", i);
                    ratioMin = gainmap.getRatioMin();
                    bVar.e("uLogRatioMin", new float[]{(float) Math.log(ratioMin[0]), (float) Math.log(ratioMin[1]), (float) Math.log(ratioMin[2])});
                    ratioMax = gainmap.getRatioMax();
                    bVar.e("uLogRatioMax", new float[]{(float) Math.log(ratioMax[0]), (float) Math.log(ratioMax[1]), (float) Math.log(ratioMax[2])});
                    epsilonSdr = gainmap.getEpsilonSdr();
                    bVar.e("uEpsilonSdr", epsilonSdr);
                    epsilonHdr = gainmap.getEpsilonHdr();
                    bVar.e("uEpsilonHdr", epsilonHdr);
                    bVar.e("uGainmapGamma", gamma);
                    displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
                    bVar.d("uDisplayRatioHdr", displayRatioForFullHdr);
                    minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
                    bVar.d("uDisplayRatioSdr", minDisplayRatioForHdrTransition);
                    GlUtil.d();
                }
            }
        }
        i = 0;
        bVar.f("uGainmapIsAlpha", i3);
        bVar.f("uNoGamma", i4);
        bVar.f("uSingleChannel", i);
        ratioMin = gainmap.getRatioMin();
        bVar.e("uLogRatioMin", new float[]{(float) Math.log(ratioMin[0]), (float) Math.log(ratioMin[1]), (float) Math.log(ratioMin[2])});
        ratioMax = gainmap.getRatioMax();
        bVar.e("uLogRatioMax", new float[]{(float) Math.log(ratioMax[0]), (float) Math.log(ratioMax[1]), (float) Math.log(ratioMax[2])});
        epsilonSdr = gainmap.getEpsilonSdr();
        bVar.e("uEpsilonSdr", epsilonSdr);
        epsilonHdr = gainmap.getEpsilonHdr();
        bVar.e("uEpsilonHdr", epsilonHdr);
        bVar.e("uGainmapGamma", gamma);
        displayRatioForFullHdr = gainmap.getDisplayRatioForFullHdr();
        bVar.d("uDisplayRatioHdr", displayRatioForFullHdr);
        minDisplayRatioForHdrTransition = gainmap.getMinDisplayRatioForHdrTransition();
        bVar.d("uDisplayRatioSdr", minDisplayRatioForHdrTransition);
        GlUtil.d();
    }

    @Override // xsna.o0u
    public final void release() throws VideoFrameProcessingException {
        try {
            this.a.b();
            try {
                GLES20.glDeleteProgram(this.h.a);
                GlUtil.d();
                int i = this.t;
                if (i != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    GlUtil.d();
                }
            } catch (GlUtil.GlException e) {
                throw new VideoFrameProcessingException(e);
            }
        } catch (GlUtil.GlException e2) {
            throw new VideoFrameProcessingException(e2);
        }
    }
}
