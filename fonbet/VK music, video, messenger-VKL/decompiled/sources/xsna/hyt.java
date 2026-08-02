package xsna;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import xsna.fyt;
import xsna.kyt;

/* compiled from: GifDrawableResource.java */
/* loaded from: classes12.dex */
public final class hyt extends cko<gyt> {
    @Override // xsna.hag0
    public final void a() {
        cl3 cl3Var;
        cl3 cl3Var2;
        cl3 cl3Var3;
        gyt gytVar = (gyt) this.b;
        gytVar.stop();
        gytVar.e = true;
        kyt kytVar = gytVar.b.a;
        y7g0 y7g0Var = kytVar.d;
        kytVar.c.clear();
        Bitmap bitmap = kytVar.l;
        if (bitmap != null) {
            kytVar.e.c(bitmap);
            kytVar.l = null;
        }
        kytVar.f = false;
        kyt.a aVar = kytVar.i;
        if (aVar != null) {
            y7g0Var.c(aVar);
            kytVar.i = null;
        }
        kyt.a aVar2 = kytVar.k;
        if (aVar2 != null) {
            y7g0Var.c(aVar2);
            kytVar.k = null;
        }
        kyt.a aVar3 = kytVar.n;
        if (aVar3 != null) {
            y7g0Var.c(aVar3);
            kytVar.n = null;
        }
        gpk0 gpk0Var = kytVar.a;
        fyt.a aVar4 = gpk0Var.c;
        gpk0Var.l = null;
        byte[] bArr = gpk0Var.i;
        if (bArr != null && (cl3Var3 = ((dyt) aVar4).b) != null) {
            cl3Var3.put(bArr);
        }
        int[] iArr = gpk0Var.j;
        if (iArr != null && (cl3Var2 = ((dyt) aVar4).b) != null) {
            cl3Var2.put(iArr);
        }
        Bitmap bitmap2 = gpk0Var.m;
        if (bitmap2 != null) {
            ((dyt) aVar4).a.c(bitmap2);
        }
        gpk0Var.m = null;
        gpk0Var.d = null;
        gpk0Var.s = null;
        byte[] bArr2 = gpk0Var.e;
        if (bArr2 != null && (cl3Var = ((dyt) aVar4).b) != null) {
            cl3Var.put(bArr2);
        }
        kytVar.j = true;
    }

    @Override // xsna.hag0
    @NonNull
    public final Class<gyt> b() {
        return gyt.class;
    }

    @Override // xsna.hag0
    public final int getSize() {
        kyt kytVar = ((gyt) this.b).b.a;
        gpk0 gpk0Var = kytVar.a;
        return (gpk0Var.j.length * 4) + gpk0Var.d.limit() + gpk0Var.i.length + kytVar.o;
    }

    @Override // xsna.cko, xsna.hzw
    public final void initialize() {
        ((gyt) this.b).b.a.l.prepareToDraw();
    }
}
