package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.filters.model.FilterItem;
import com.vk.media.filters.model.Hsl;
import com.vk.media.pipeline.custom.utils.GLException;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import xsna.kht;
import xsna.pms0;

/* compiled from: CustomVideoFramesProcessor.kt */
/* loaded from: classes3.dex */
public final class apk implements pms0 {
    public final f100 a;
    public final fgr b;
    public final nny c;
    public final float[] d;
    public final float[] e;
    public float[] f;
    public boolean g;
    public w1t h;
    public w1t i;
    public f0u j;
    public n0u k;
    public pms0.a l;

    public apk(List<? extends uq10> list, Context context, f100 f100Var) {
        this.a = f100Var;
        this.b = new fgr(context, f100Var);
        this.c = new nny(f100Var, list);
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        this.d = fArr;
        float[] fArr2 = new float[16];
        Matrix.setIdentityM(fArr2, 0);
        this.e = fArr2;
        this.f = new float[16];
    }

    @Override // xsna.pms0
    public final void a() {
        this.b.a();
        nny nnyVar = this.c;
        int[] iArr = nnyVar.d;
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i != -1) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            f100 f100Var = nnyVar.a;
            GLES20.glDeleteTextures(1, new int[]{intValue}, 0);
            GLException m = qxm0.m();
            if (m == null || f100Var == null) {
                if (m != null) {
                    throw m;
                }
            } else {
                f100Var.a("GlUtil", m);
            }
        }
        jw5.o(-1, 0, 6, nnyVar.d);
        w1t w1tVar = nnyVar.e;
        if (w1tVar != null) {
            w1tVar.c();
        }
        nnyVar.e = null;
        w1t w1tVar2 = this.h;
        if (w1tVar2 != null) {
            w1tVar2.c();
        }
        this.h = null;
        w1t w1tVar3 = this.i;
        if (w1tVar3 != null) {
            w1tVar3.c();
        }
        this.i = null;
        f0u f0uVar = this.j;
        if (f0uVar != null) {
            f0uVar.a();
        }
        this.j = null;
        n0u n0uVar = this.k;
        if (n0uVar != null) {
            n0uVar.c();
        }
        this.k = null;
    }

    @Override // xsna.pms0
    public final boolean b() {
        return this.c.c;
    }

    @Override // xsna.pms0
    public final void c(FilterItem filterItem, float[] fArr, pms0.a aVar) {
        umv umvVar;
        boolean z = false;
        this.g = false;
        this.f = Arrays.copyOf(fArr, fArr.length);
        this.l = aVar;
        boolean z2 = true;
        fgr fgrVar = this.b;
        if (filterItem != null) {
            lcr lcrVar = fgrVar.e;
            bpn0 bpn0Var = fgrVar.d;
            if (lcrVar == null) {
                lcr e = ((tfr) bpn0Var.getValue()).e();
                fgrVar.e = e;
                if (e != null) {
                    tpw tpwVar = (tpw) e;
                    tpwVar.g = new pmb();
                    e0u e0uVar = new e0u();
                    e0uVar.init();
                    tpwVar.a = e0uVar;
                    e0u e0uVar2 = new e0u();
                    e0uVar2.d = false;
                    e0uVar2.init();
                    tpwVar.b = e0uVar2;
                    vgv vgvVar = new vgv("uniform mat4 mvpMatrix;\nuniform mat4 texMatrix;\nattribute highp vec4 aPosition;\nattribute highp vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n   gl_Position = mvpMatrix * aPosition;   vTextureCoord = (texMatrix * aTextureCoord).xy;}\n", "\n%s\nprecision mediump float;\n\nvarying highp vec2 vTextureCoord;\n\nuniform lowp %s sTexture;\n\nuniform mediump vec3 hsl_red;\nuniform mediump vec3 hsl_orange;\nuniform mediump vec3 hsl_yellow;\nuniform mediump vec3 hsl_green;\nuniform mediump vec3 hsl_cyan;\nuniform mediump vec3 hsl_blue;\nuniform mediump vec3 hsl_purple;\nuniform mediump vec3 hsl_magenta;\n\nconst mediump vec3 hsl_default = vec3(0.0, 0.0, 0.0);\n\nvec3 RGB2HSL(vec3 rgb) {\n    float h = 0.0, s = 0.0, l = 0.0;\n    float r = rgb.r;\n    float g = rgb.g;\n    float b = rgb.b;\n    float cmax = max(r, max(g, b));\n    float cmin = min(r, min(g, b));\n    float delta = cmax - cmin;\n    l = (cmax + cmin) / 2.0;\n    if (delta == 0.0) {\n        s = 0.0;\n        h = 0.0;\n    } else {\n        if (l <= 0.5)\n        s = delta / (cmax + cmin);\n        else\n        s = delta / (2.0 - (cmax + cmin));\n        if (cmax == r) {\n            if (g >= b)\n            h = 60.0 * (g - b) / delta;\n            else\n            h = 60.0 * (g - b) / delta + 360.0;\n        } else if (cmax == g) {\n            h = 60.0 * (b - r) / delta + 120.0;\n        } else {\n            h = 60.0 * (r - g) / delta + 240.0;\n        }\n    }\n    return vec3(h, s, l);\n}\n\nfloat hueToRgb(float p, float q, float t) {\n    if (t < 0.0)\n    t += 1.0;\n    if (t > 1.0)\n    t -= 1.0;\n    float res = p;\n    if (t < 2.0 / 3.0)\n        res = p + (q - p) * (2.0 / 3.0 - t) * 6.0;\n    if (t < 0.5)\n        res = q;\n    if (t < 1.0 / 6.0)\n        res = p + (q - p) * 6.0 * t;\n    return res;\n}\n\nvec3 HSL2RGB(vec3 hsl) {\n    float r, g, b;\n    float h = hsl.x * (1.0 / 360.0);\n    if (hsl.y == 0.0) {\n        r = g = b = hsl.z; // gray\n    } else {\n        float q = hsl.z < 0.5 ? hsl.z * (1.0 + hsl.y) : (hsl.z + hsl.y - hsl.z * hsl.y);\n        float p = 2.0 * hsl.z - q;\n        r = hueToRgb(p, q, h + 1.0 / 3.0);\n        g = hueToRgb(p, q, h);\n        b = hueToRgb(p, q, h - 1.0 / 3.0);\n    }\n    return vec3(r, g, b);\n}\n\nvec3 pixel_adjust(float h, float hue, float saturation, float brightness, float left_left, float left, float right, float right_right, vec3 delta_hsb) {\n    float t = 0.0;\n    if (left_left < left && left > right && right < right_right) {\n        t = h >= left && h <= 360.0 ? 1.0 : t;\n        t = h >= 0.0 && h <= right ? 1.0 : t;\n        t = h >= left_left && h <= left ? (h - left_left) / (left - left_left) : t;\n        t = h >= right && h <= right_right ? (right_right - h) / (right_right - right) : t;  \n    }\n    if (left_left > left && left < right && right < right_right) {\n        t = h >= left && h <= right ? 1.0 : t;\n        t = h >= 0.0 && h <= left ? (h + 360.0 - left_left) / (left + 360.0 - left_left) : t;\n        t = h >= left_left && h <= 360.0 ? (h - left_left) / (left + 360.0 - left_left) : t;\n        t = h >= right && h <= right_right ? (right_right - h) / (right_right - right) : t;\n    }\n    if (left_left <= left && left < right && right <= right_right) {\n        t = h >= left && h <= right ? 1.0 : t;\n        t = h >= left_left && h <= left ? (h - left_left) / (left - left_left) : t;\n        t = h >= right && h <= right_right ? (right_right - h) / (right_right - right) : t;\n    }\n    if (left_left < left && left < right && right > right_right) {\n        t = h >= left && h <= right ? 1.0 : t;\n        t = h >= left_left && h <= left ? (h - left_left) / (left - left_left) : t;\n        t = h >= right && h <= 360.0 ? (right_right + 360.0 - h) / (right_right + 360.0 - right) : t;\n        t = h >= 0.0 && h <= right_right ? (right_right - h) / (right_right + 360.0 - right) : t;\n    }\n    delta_hsb.x += hue * t;\n    delta_hsb.y += saturation * t;\n    delta_hsb.z += brightness * t;\n    return delta_hsb;\n}\n\nvoid main() {\n    vec4 textureColor = texture2D(sTexture, vTextureCoord);\n\n    vec3 hsb = RGB2HSL(textureColor.rgb);\n    // Adjust each channel\n    vec3 delta_hsb = vec3(0.0);\n    delta_hsb = hsl_red != hsl_default ? pixel_adjust(hsb.x, hsl_red.x, hsl_red.y, hsl_red.z, 315.0, 330.0, 5.0, 20.0, delta_hsb) : delta_hsb;\n    delta_hsb = hsl_orange != hsl_default ? pixel_adjust(hsb.x, hsl_orange.x, hsl_orange.y, hsl_orange.z, 350.0, 20.0, 40.0, 60.0, delta_hsb) : delta_hsb;\n    delta_hsb = hsl_yellow != hsl_default ? pixel_adjust(hsb.x, hsl_yellow.x, hsl_yellow.y, hsl_yellow.z, 25.0, 50.0, 70.0, 90.0, delta_hsb) : delta_hsb;\n    delta_hsb = hsl_green != hsl_default ? pixel_adjust(hsb.x, hsl_green.x, hsl_green.y, hsl_green.z, 50.0, 70.0, 160.0, 190.0, delta_hsb) : delta_hsb;\n    delta_hsb = hsl_cyan != hsl_default ? pixel_adjust(hsb.x, hsl_cyan.x, hsl_cyan.y, hsl_cyan.z, 135.0, 165., 195.0, 225.0, delta_hsb) : delta_hsb;\n    delta_hsb = hsl_blue != hsl_default ? pixel_adjust(hsb.x, hsl_blue.x, hsl_blue.y, hsl_blue.z, 145.0, 180., 235.0, 270.0, delta_hsb) : delta_hsb;\n    delta_hsb = hsl_purple != hsl_default ? pixel_adjust(hsb.x, hsl_purple.x, hsl_purple.y, hsl_purple.z, 235.0, 255.0, 315.0, 335.0, delta_hsb) : delta_hsb;\n    delta_hsb = hsl_magenta != hsl_default ? pixel_adjust(hsb.x, hsl_magenta.x, hsl_magenta.y, hsl_magenta.z, 255.0, 285.0, 335.0, 5.0, delta_hsb) : delta_hsb;\n\n    // Adjust hue\n    hsb.x = hsb.x + delta_hsb.x;\n    hsb.x = hsb.x > 360.0 ? hsb.x - 360.0 : hsb.x;\n    hsb.x = hsb.x < 0.0 ? hsb.x + 360.0 : hsb.x;\n\n    // adjust saturation\n    delta_hsb.y = clamp(delta_hsb.y * 0.01, -1.0, 1.0);\n    if (delta_hsb.y < 0.0) {\n        hsb.y = hsb.y * (1.0 + delta_hsb.y);\n    } else {\n        delta_hsb.y = delta_hsb.y * 0.5; // move to bissness layer\n        float temp = hsb.y * (1.0 - delta_hsb.y);\n        hsb.y = hsb.y + (hsb.y - temp);\n    }\n\n    // adjust brightness\n    delta_hsb.z = clamp(delta_hsb.z * 0.01, -1.0, 1.0);\n    float radio = hsb.z >= 0.5 ? hsb.y : hsb.y * 2.0 * hsb.z;\n    if (delta_hsb.z <= 0.0) {\n        float temp = hsb.z - radio * (1.0 - hsb.z) * delta_hsb.z;\n        hsb.z = hsb.z + (hsb.z - temp);\n    } else {\n        delta_hsb.z = (1.0 - delta_hsb.y) * delta_hsb.z;\n        hsb.z = hsb.z + radio * (1.15 - hsb.z) * delta_hsb.z;\n    }\n    hsb.y = clamp(hsb.y, 0.0, 1.0);\n    hsb.z = clamp(hsb.z, 0.0, 1.0);\n\n    vec3 color = HSL2RGB(hsb);\n    gl_FragColor = vec4(color, textureColor.a);\n}\n");
                    vgvVar.q = new Hsl(null, null, null, null, null, null, null, null, 255, null);
                    vgvVar.r = -1;
                    vgvVar.s = -1;
                    vgvVar.t = -1;
                    vgvVar.u = -1;
                    vgvVar.v = -1;
                    vgvVar.w = -1;
                    vgvVar.x = -1;
                    vgvVar.y = -1;
                    vgvVar.d = false;
                    vgvVar.init();
                    tpwVar.e = vgvVar;
                    kht b = kht.a.b(true);
                    b.d = false;
                    b.init();
                    tpwVar.d = b;
                    kht b2 = kht.a.b(false);
                    b2.d = false;
                    b2.init();
                    tpwVar.c = b2;
                    jwj jwjVar = new jwj();
                    jwjVar.d = false;
                    jwjVar.init();
                    tpwVar.f = jwjVar;
                }
            }
            ocr ocrVar = fgrVar.f;
            if (!epx.f(ocrVar != null ? ocrVar.a : null, filterItem)) {
                ocr ocrVar2 = fgrVar.f;
                if (ocrVar2 != null && (umvVar = ocrVar2.b) != null) {
                    umvVar.release();
                }
                umv c = ((tfr) bpn0Var.getValue()).c(filterItem.b, fgrVar.b);
                c.d();
                c.init();
                fgrVar.f = new ocr(filterItem, c);
            }
        } else {
            fgrVar.a();
        }
        float[] fArr2 = this.e;
        nny nnyVar = this.c;
        nnyVar.f = fArr2;
        if (nnyVar.e == null) {
            nnyVar.e = new w1t(nnyVar.a, z, 30);
        }
        ocr ocrVar3 = fgrVar.f;
        boolean z3 = (ocrVar3 != null) | nnyVar.c;
        this.g = z3;
        w1t w1tVar = this.h;
        boolean z4 = w1tVar == null || this.i == null;
        f100 f100Var = this.a;
        if (z3 && ocrVar3 == null && z4) {
            if (w1tVar != null) {
                w1tVar.c();
            }
            int i = 14;
            this.h = new w1t(f100Var, z2, i);
            w1t w1tVar2 = this.i;
            if (w1tVar2 != null) {
                w1tVar2.c();
            }
            this.i = new w1t(f100Var, z, i);
        }
        this.k = new n0u(f100Var);
        if (f100Var != null) {
            f100Var.v("CustomVideoFramesProcessor", "configure custom video frames processor: \n filters=" + filterItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0228  */
    @Override // xsna.pms0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(float[] fArr, long j, int i, int i2, int i3, boolean z) {
        int i4;
        f0u f0uVar;
        int i5;
        float[] fArr2;
        f0u f0uVar2;
        n0u n0uVar;
        if (!this.g) {
            return false;
        }
        int i6 = 770;
        int i7 = 771;
        GLES20.glBlendFunc(770, 771);
        int i8 = 3042;
        GLES20.glEnable(3042);
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        int i9 = 16640;
        GLES20.glClear(16640);
        GLES20.glViewport(0, 0, i, i2);
        nny nnyVar = this.c;
        int[] iArr = nnyVar.d;
        List<uq10> list = nnyVar.b;
        int size = list.size();
        int i10 = 0;
        while (true) {
            i4 = i8;
            f0uVar = null;
            i5 = i9;
            int[] iArr2 = iArr;
            if (i10 >= size) {
                break;
            }
            uq10 uq10Var = list.get(i10);
            Bitmap d = (iArr2[i10] == -1 || uq10Var.z0()) ? uq10Var.d((int) j, -1) : null;
            if (iArr2[i10] == -1 && d != null) {
                int[] iArr3 = new int[1];
                GLES20.glGenTextures(1, iArr3, 0);
                nnyVar.a("glGenTextures layer");
                iArr2[i10] = iArr3[0];
            } else if (d == null && uq10Var.z0()) {
                iArr2[i10] = -1;
            }
            if (d != null) {
                GLES20.glBindTexture(3553, iArr2[i10]);
                nnyVar.a("glBindTexture layer");
                GLUtils.texImage2D(3553, 0, d, 0);
                nnyVar.a("texImage2D layer");
                GLES20.glTexParameteri(3553, 10241, 9729);
                nnyVar.a("glTexParameteri layer");
                GLES20.glTexParameteri(3553, 10240, 9729);
                nnyVar.a("glTexParameteri layer");
            }
            i10++;
            i8 = i4;
            i9 = i5;
            iArr = iArr2;
            i6 = 770;
            i7 = 771;
        }
        GLES20.glBlendFunc(i6, i7);
        GLES20.glEnable(i4);
        GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        GLES20.glClear(i5);
        GLES20.glViewport(0, 0, i, i2);
        float[] fArr3 = this.d;
        nnyVar.b(fArr3, true);
        pms0.a aVar = this.l;
        if (aVar == null || aVar.c) {
            fArr2 = fArr3;
            e(i3, z, new Size(i, i2), fArr, this.f);
        } else {
            IntBuffer allocate = IntBuffer.allocate(1);
            GLES20.glGetIntegerv(36006, allocate);
            int i11 = allocate.get(0);
            f0u f0uVar3 = this.j;
            if (f0uVar3 != null) {
                if (f0uVar3.a == i && f0uVar3.b == i2) {
                    f0uVar = f0uVar3;
                }
                if (f0uVar != null) {
                    fArr2 = fArr3;
                    f0uVar2 = f0uVar;
                    GLES20.glBindFramebuffer(36160, f0uVar2.c);
                    e(i3, z, new Size(i, i2), fArr, this.e);
                    s3q0 s3q0Var = s3q0.a;
                    GLES20.glBindFramebuffer(36160, 0);
                    n0uVar = this.k;
                    if (n0uVar != null) {
                        throw new IllegalStateException("CustomVideoFramesProcessor Render corners program is null");
                    }
                    pms0.a aVar2 = this.l;
                    if (aVar2 == null) {
                        throw new IllegalStateException("CustomVideoFramesProcessor Corner radius params are null");
                    }
                    n0uVar.o = aVar2.a;
                    n0uVar.p = aVar2.b;
                    n0uVar.c = f0uVar2.e;
                    n0uVar.e = this.e;
                    n0uVar.d = this.f;
                    GLES20.glBindFramebuffer(36160, i11);
                    n0uVar.d();
                }
            }
            if (f0uVar3 != null) {
                f0uVar3.a();
            }
            f0u f0uVar4 = new f0u();
            int[] iArr4 = new int[1];
            GLES20.glGetIntegerv(3379, iArr4, 0);
            int i12 = iArr4[0];
            if (i > i12 || i2 > i12) {
                throw new IllegalArgumentException(("GL_MAX_TEXTURE_SIZE " + iArr4[0]).toString());
            }
            GLES20.glGetIntegerv(34024, iArr4, 0);
            int i13 = iArr4[0];
            if (i > i13 || i2 > i13) {
                throw new IllegalArgumentException(("GL_MAX_RENDERBUFFER_SIZE " + iArr4[0]).toString());
            }
            GLES20.glGetIntegerv(36006, iArr4, 0);
            int i14 = iArr4[0];
            GLES20.glGetIntegerv(36007, iArr4, 0);
            int i15 = iArr4[0];
            GLES20.glGetIntegerv(32873, iArr4, 0);
            int i16 = iArr4[0];
            f0uVar4.a();
            try {
                f0uVar4.a = i;
                f0uVar4.b = i2;
                GLES20.glGenFramebuffers(1, iArr4, 0);
                int i17 = iArr4[0];
                f0uVar4.c = i17;
                GLES20.glBindFramebuffer(36160, i17);
                GLES20.glGenRenderbuffers(1, iArr4, 0);
                int i18 = iArr4[0];
                f0uVar4.d = i18;
                GLES20.glBindRenderbuffer(36161, i18);
                GLES20.glRenderbufferStorage(36161, 33189, i, i2);
                GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, f0uVar4.d);
                GLES20.glGenTextures(1, iArr4, 0);
                int i19 = iArr4[0];
                f0uVar4.e = i19;
                GLES20.glBindTexture(3553, i19);
                GLES20.glTexParameterf(3553, 10240, 9729);
                GLES20.glTexParameterf(3553, 10241, 9728);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                fArr2 = fArr3;
                f0uVar2 = f0uVar4;
            } catch (RuntimeException e) {
                e = e;
                f0uVar2 = f0uVar4;
            }
            try {
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, f0uVar2.e, 0);
                int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                if (glCheckFramebufferStatus != 36053) {
                    throw new IllegalStateException("Failed to initialize framebuffer object " + glCheckFramebufferStatus);
                }
                GLES20.glBindFramebuffer(36160, i14);
                GLES20.glBindRenderbuffer(36161, i15);
                GLES20.glBindTexture(3553, i16);
                this.j = f0uVar2;
                GLES20.glBindFramebuffer(36160, f0uVar2.c);
                e(i3, z, new Size(i, i2), fArr, this.e);
                s3q0 s3q0Var2 = s3q0.a;
                GLES20.glBindFramebuffer(36160, 0);
                n0uVar = this.k;
                if (n0uVar != null) {
                }
            } catch (RuntimeException e2) {
                e = e2;
                f0uVar2.a();
                throw e;
            }
        }
        GLES20.glBlendFunc(1, 771);
        nnyVar.b(fArr2, false);
        return true;
    }

    public final void e(int i, boolean z, Size size, float[] fArr, float[] fArr2) {
        fgr fgrVar = this.b;
        if (fgrVar.f == null) {
            w1t w1tVar = z ? this.h : this.i;
            if (w1tVar != null) {
                w1tVar.c = i;
                w1tVar.d = fArr2;
                w1tVar.e = fArr;
                w1tVar.d();
                return;
            }
            return;
        }
        lcr lcrVar = fgrVar.e;
        if (lcrVar != null) {
            lcrVar.a(size.getWidth(), size.getHeight());
            lcrVar.d(size.getWidth(), size.getHeight());
            lcrVar.c(fArr2);
            lcrVar.b(fArr);
            lcrVar.e(i, fgrVar.f, z);
        }
    }
}
