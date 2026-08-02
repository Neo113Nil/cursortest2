package xsna;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: DefaultDrawableFactory.java */
/* loaded from: classes12.dex */
public final class pdl implements tjo {
    public final Resources a;
    public final tjo b;

    public pdl(Resources resources, tjo tjoVar) {
        this.a = resources;
        this.b = tjoVar;
    }

    @Override // xsna.tjo
    public final Drawable a(svf svfVar) {
        try {
            if (lhs.d()) {
                lhs.a("DefaultDrawableFactory#createDrawable");
            }
            if (!(svfVar instanceof xvf)) {
                tjo tjoVar = this.b;
                if (tjoVar == null || !tjoVar.b(svfVar)) {
                    if (lhs.d()) {
                        lhs.b();
                    }
                    return null;
                }
                Drawable a = tjoVar.a(svfVar);
                if (lhs.d()) {
                    lhs.b();
                }
                return a;
            }
            xvf xvfVar = (xvf) svfVar;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, xvfVar.W3());
            if ((xvfVar.getRotationAngle() == 0 || xvfVar.getRotationAngle() == -1) && (xvfVar.w0() == 1 || xvfVar.w0() == 0)) {
                if (lhs.d()) {
                    lhs.b();
                }
                return bitmapDrawable;
            }
            az80 az80Var = new az80(bitmapDrawable, xvfVar.getRotationAngle(), xvfVar.w0());
            if (lhs.d()) {
                lhs.b();
            }
            return az80Var;
        } catch (Throwable th) {
            if (lhs.d()) {
                lhs.b();
            }
            throw th;
        }
    }

    @Override // xsna.tjo
    public final boolean b(svf svfVar) {
        return true;
    }
}
