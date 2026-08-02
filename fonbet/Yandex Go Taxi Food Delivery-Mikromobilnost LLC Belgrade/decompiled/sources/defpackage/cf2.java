package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes10.dex */
public final class cf2 implements otj0 {
    public final /* synthetic */ int a;
    public final Object b;

    public cf2(byte[] bArr) {
        this.a = 1;
        z2a1.e(bArr, "Argument must not be null");
        this.b = bArr;
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    @Override // defpackage.otj0
    public final void a() {
        switch (this.a) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.b;
                animatedImageDrawable.stop();
                animatedImageDrawable.clearAnimationCallbacks();
                break;
        }
    }

    @Override // defpackage.otj0
    public final Class b() {
        switch (this.a) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.b).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // defpackage.otj0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (AnimatedImageDrawable) obj;
            case 1:
                return (byte[]) obj;
            case 2:
                return (File) obj;
            default:
                return (Bitmap) obj;
        }
    }

    @Override // defpackage.otj0
    public final int getSize() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) obj;
                return pw21.g(Bitmap.Config.ARGB_8888) * animatedImageDrawable.getIntrinsicHeight() * animatedImageDrawable.getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) obj).length;
            case 2:
                return 1;
            default:
                return pw21.f((Bitmap) obj);
        }
    }

    public /* synthetic */ cf2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public cf2(File file) {
        this.a = 2;
        z2a1.e(file, "Argument must not be null");
        this.b = file;
    }
}
