package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vkontakte.android.R;
import xsna.llo;

/* compiled from: StoryWatermarkRenderingLayer.kt */
/* loaded from: classes3.dex */
public final class vnm0 implements uq10 {
    public final llo.b a;
    public final yo9 b;
    public final yo9 c;
    public final Drawable d;

    public vnm0(MediaUtils.d dVar) {
        Drawable a = m33.a(R.drawable.vk_icon_logo_vk_shadow_48, e43.a);
        this.d = a;
        og6 og6Var = new og6(1.0f, 0.075f, dVar.b, a);
        llo.b bVar = new llo.b(dVar.a, dVar.b);
        this.a = bVar;
        bVar.b();
        Canvas canvas = bVar.d;
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        try {
            float a2 = iah0.a(8);
            float width = (canvas.getWidth() - og6Var.c) - a2;
            float height = (canvas.getHeight() - og6Var.b) - a2;
            int save = canvas.save();
            canvas.translate(width, height);
            og6Var.draw(canvas);
            canvas.restoreToCount(save);
        } catch (Exception e) {
            L.i(e);
        }
        llo.b bVar2 = this.a;
        bVar2.b();
        Bitmap bitmap = bVar2.c;
        if (this.b == null) {
            this.b = new yo9(bitmap);
        }
        this.c = this.b;
    }

    @Override // xsna.uq10
    public final boolean c() {
        return false;
    }

    @Override // xsna.uq10
    public final uq10 copy() {
        llo.b bVar = this.a;
        return new vnm0(new MediaUtils.d(bVar.a, bVar.b));
    }

    @Override // xsna.uq10
    public final Bitmap d(int i, int i2) {
        return (Bitmap) this.c.c;
    }

    @Override // xsna.uq10
    public final boolean z0() {
        return false;
    }

    @Override // xsna.uq10
    public final void b() {
    }

    @Override // xsna.uq10
    public final void e() {
    }

    @Override // xsna.uq10
    public final void f() {
    }
}
