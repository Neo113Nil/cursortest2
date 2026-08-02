package xsna;

import android.graphics.Paint;
import android.graphics.RectF;
import com.vkontakte.android.R;

/* compiled from: ExpandAnimationController.kt */
/* loaded from: classes17.dex */
public final class o7q implements too0 {
    public com.vk.core.view.components.text.links.a b;
    public final Paint c;
    public boolean d;
    public final RectF e;
    public float f;
    public boolean g;

    public o7q() {
        Paint paint = new Paint();
        this.c = paint;
        this.e = new RectF();
        paint.setColor(krv0.l(R.attr.vk_ui_background_content));
    }

    @Override // xsna.too0
    public final void Ng() {
        this.c.setColor(krv0.l(R.attr.vk_ui_background_content));
    }

    public final void a(float f) {
        if (this.g) {
            this.e.bottom = f;
        }
        this.d = false;
        com.vk.core.view.components.text.links.a aVar = this.b;
        if (aVar != null) {
            aVar.j = Integer.MAX_VALUE;
        }
    }
}
