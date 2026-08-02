package xsna;

import android.annotation.TargetApi;
import android.opengl.EGL14;
import android.util.Log;

/* compiled from: EglCore.java */
@TargetApi(18)
/* loaded from: classes12.dex */
public final class hap implements yt60, ydp0 {
    public Object b;
    public Object c;
    public Object d;

    public /* synthetic */ hap(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        StringBuilder b = ho8.b(str, ": EGL error: 0x");
        b.append(Integer.toHexString(eglGetError));
        Log.e("Grafika", b.toString());
        throw new RuntimeException(et.a(eglGetError, ho8.b(str, ": EGL error: 0x")));
    }

    @Override // xsna.yt60
    public zt60 Z() {
        return (k8n) this.c;
    }

    @Override // xsna.yt60
    public au60 d0() {
        return (a9n) this.b;
    }

    @Override // xsna.yt60
    public xt60 h1() {
        return (u7n) this.d;
    }
}
