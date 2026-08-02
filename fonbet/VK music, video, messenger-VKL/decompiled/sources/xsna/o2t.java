package xsna;

import android.opengl.GLES20;
import xsna.dz9;

/* compiled from: GPUImageRenderer.java */
/* loaded from: classes12.dex */
public final class o2t implements Runnable {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public o2t(nr01 nr01Var, ds01 ds01Var, com.google.android.gms.cast.internal.zza zzaVar) {
        this.c = ds01Var;
        this.d = zzaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.b) {
            case 0:
                r2t r2tVar = (r2t) this.d;
                n2t n2tVar = r2tVar.b;
                r2tVar.b = (i0u) this.c;
                n2tVar.h = false;
                GLES20.glDeleteProgram(n2tVar.d);
                n2tVar.c();
                r2tVar.b.b();
                GLES20.glUseProgram(r2tVar.b.a());
                r2tVar.b.f(r2tVar.g, r2tVar.h);
                break;
            default:
                ds01 ds01Var = (ds01) this.c;
                String str = ((com.google.android.gms.cast.internal.zza) this.d).b;
                if (o0a.c(str, ds01Var.i)) {
                    z = false;
                } else {
                    ds01Var.i = str;
                    z = true;
                }
                ds01.u.a("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(ds01Var.k));
                dz9.c cVar = ds01Var.d;
                if (cVar != null && (z || ds01Var.k)) {
                    cVar.onApplicationStatusChanged();
                }
                ds01Var.k = false;
                break;
        }
    }

    public o2t(r2t r2tVar, i0u i0uVar) {
        this.d = r2tVar;
        this.c = i0uVar;
    }
}
