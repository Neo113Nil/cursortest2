package xsna;

import android.view.View;
import android.widget.Magnifier;

/* compiled from: PlatformMagnifier.android.kt */
/* loaded from: classes11.dex */
public final class vta0 implements uta0 {
    public static final vta0 a = new vta0();

    /* compiled from: PlatformMagnifier.android.kt */
    public static class a implements tta0 {
        public final Magnifier a;

        public a(Magnifier magnifier) {
            this.a = magnifier;
        }

        @Override // xsna.tta0
        public final long a() {
            Magnifier magnifier = this.a;
            return (magnifier.getWidth() << 32) | (magnifier.getHeight() & 4294967295L);
        }

        @Override // xsna.tta0
        public void b(long j, long j2, float f) {
            this.a.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }

        @Override // xsna.tta0
        public final void c() {
            this.a.update();
        }

        @Override // xsna.tta0
        public final void dismiss() {
            this.a.dismiss();
        }
    }

    @Override // xsna.uta0
    public final boolean a() {
        return false;
    }

    @Override // xsna.uta0
    public final tta0 b(View view, boolean z, long j, float f, float f2, boolean z2, azl azlVar, float f3) {
        return new a(new Magnifier(view));
    }
}
