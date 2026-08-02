package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import com.vk.dto.stickers.StickerItem;
import kotlin.LazyThreadSafetyMode;
import xsna.o8l0;

/* compiled from: StickerBarVc.kt */
/* loaded from: classes2.dex */
public final class i2l0 {
    public final ViewGroup a;
    public final kcl0 b;
    public final a c = new a();
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new lva0(this, 19));
    public ViewPropertyAnimator e;
    public o8l0 f;
    public t50 g;
    public boolean h;
    public View i;

    /* compiled from: StickerBarVc.kt */
    public final class a implements o8l0.a {
        public a() {
        }

        @Override // xsna.o8l0.a
        public final void a(StickerItem stickerItem) {
            t50 t50Var = i2l0.this.g;
            if (t50Var != null) {
                t50Var.invoke(stickerItem);
            }
        }
    }

    public i2l0(ViewGroup viewGroup, kcl0 kcl0Var) {
        this.a = viewGroup;
        this.b = kcl0Var;
    }
}
