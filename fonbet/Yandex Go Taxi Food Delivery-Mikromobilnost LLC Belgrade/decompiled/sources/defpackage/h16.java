package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes10.dex */
public final class h16 implements otj0, rwv {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;

    public h16(b16 b16Var, Bitmap bitmap) {
        z2a1.e(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        z2a1.e(b16Var, "BitmapPool must not be null");
        this.c = b16Var;
    }

    public static h16 c(b16 b16Var, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new h16(b16Var, bitmap);
    }

    @Override // defpackage.otj0
    public final void a() {
        switch (this.a) {
            case 0:
                ((b16) this.c).c((Bitmap) this.b);
                break;
            default:
                ((otj0) this.c).a();
                break;
        }
    }

    @Override // defpackage.otj0
    public final Class b() {
        switch (this.a) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // defpackage.otj0
    public final Object get() {
        switch (this.a) {
            case 0:
                return (Bitmap) this.b;
            default:
                return new BitmapDrawable((Resources) this.b, (Bitmap) ((otj0) this.c).get());
        }
    }

    @Override // defpackage.otj0
    public final int getSize() {
        switch (this.a) {
            case 0:
                return pw21.f((Bitmap) this.b);
            default:
                return ((otj0) this.c).getSize();
        }
    }

    @Override // defpackage.rwv
    public final void initialize() {
        switch (this.a) {
            case 0:
                ((Bitmap) this.b).prepareToDraw();
                break;
            default:
                otj0 otj0Var = (otj0) this.c;
                if (otj0Var instanceof rwv) {
                    ((rwv) otj0Var).initialize();
                    break;
                }
                break;
        }
    }

    public h16(Resources resources, otj0 otj0Var) {
        z2a1.e(resources, "Argument must not be null");
        this.b = resources;
        z2a1.e(otj0Var, "Argument must not be null");
        this.c = otj0Var;
    }
}
