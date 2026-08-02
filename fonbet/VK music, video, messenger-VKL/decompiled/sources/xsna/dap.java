package xsna;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;
import xsna.l2t;

/* compiled from: Egl2ConfigChooser.java */
/* loaded from: classes3.dex */
public final class dap implements l2t.e {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;

    public dap() {
        int[] iArr = new int[15];
        System.arraycopy(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12344}, 0, iArr, 0, 12);
        iArr[12] = 12352;
        iArr[13] = 4;
        iArr[14] = 12344;
        this.a = iArr;
        this.b = 8;
        this.c = 8;
        this.d = 8;
    }

    public static int a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr = new int[1];
        if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, iArr)) {
            return iArr[0];
        }
        return 0;
    }

    @Override // xsna.l2t.e
    public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        EGLConfig eGLConfig;
        int[] iArr = new int[1];
        if (!egl10.eglChooseConfig(eGLDisplay, this.a, null, 0, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i = 0;
        int i2 = iArr[0];
        if (i2 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i2];
        if (!egl10.eglChooseConfig(eGLDisplay, this.a, eGLConfigArr, i2, iArr)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        while (true) {
            if (i >= i2) {
                eGLConfig = null;
                break;
            }
            eGLConfig = eGLConfigArr[i];
            int a = a(egl10, eGLDisplay, eGLConfig, 12325);
            int a2 = a(egl10, eGLDisplay, eGLConfig, 12326);
            if (a >= 0 && a2 >= 0) {
                int a3 = a(egl10, eGLDisplay, eGLConfig, 12324);
                int a4 = a(egl10, eGLDisplay, eGLConfig, 12323);
                int a5 = a(egl10, eGLDisplay, eGLConfig, 12322);
                int a6 = a(egl10, eGLDisplay, eGLConfig, 12321);
                if (a3 == this.b && a4 == this.c && a5 == this.d && a6 == 0) {
                    break;
                }
            }
            i++;
        }
        if (eGLConfig != null) {
            return eGLConfig;
        }
        throw new IllegalArgumentException("No config chosen");
    }
}
