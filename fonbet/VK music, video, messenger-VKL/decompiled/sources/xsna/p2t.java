package xsna;

import android.opengl.GLES20;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes12.dex */
public final class p2t implements Runnable {
    public final /* synthetic */ r2t b;

    public p2t(r2t r2tVar) {
        this.b = r2tVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r2t r2tVar = this.b;
        GLES20.glDeleteTextures(1, new int[]{r2tVar.d}, 0);
        r2tVar.d = -1;
    }
}
