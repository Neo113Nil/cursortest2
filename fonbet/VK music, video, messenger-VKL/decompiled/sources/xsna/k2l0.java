package xsna;

import android.view.View;
import com.vk.stickers.views.LongtapRecyclerView;

/* compiled from: StickerBarVc.kt */
/* loaded from: classes2.dex */
public final class k2l0 implements LongtapRecyclerView.a {
    public final /* synthetic */ LongtapRecyclerView a;
    public final /* synthetic */ i2l0 b;

    public k2l0(LongtapRecyclerView longtapRecyclerView, i2l0 i2l0Var) {
        this.a = longtapRecyclerView;
        this.b = i2l0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.stickers.views.LongtapRecyclerView.a
    public final void b() {
        ((c5l0) this.b.d.getValue()).a(false);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.stickers.views.LongtapRecyclerView.a
    public final void c(View view) {
        int childAdapterPosition = this.a.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            zal0 a = g2v.d().a();
            i2l0 i2l0Var = this.b;
            c5l0 c5l0Var = (c5l0) i2l0Var.d.getValue();
            o8l0 o8l0Var = i2l0Var.f;
            if (o8l0Var == null) {
                o8l0Var = null;
            }
            a.y(c5l0Var, o8l0Var.i, childAdapterPosition, null);
        }
    }

    @Override // com.vk.stickers.views.LongtapRecyclerView.a
    public final void a() {
    }
}
