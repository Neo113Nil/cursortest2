package xsna;

import android.R;
import com.vk.stickers.views.VKStickerImageView;

/* compiled from: AutoSuggestPackHolder.kt */
/* loaded from: classes5.dex */
public final class xj5 implements b780 {
    public final /* synthetic */ yj5 b;

    public xj5(yj5 yj5Var) {
        this.b = yj5Var;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        yj5 yj5Var = this.b;
        VKStickerImageView vKStickerImageView = yj5Var.n;
        if (vKStickerImageView != null) {
            vKStickerImageView.setBackgroundColor(yj5Var.itemView.getContext().getColor(R.color.transparent));
        }
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
    }
}
