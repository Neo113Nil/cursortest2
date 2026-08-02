package xsna;

import com.vk.dto.gift.Gift;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.views.gift.GiftView;

/* compiled from: GiftView.kt */
/* loaded from: classes6.dex */
public final class kzt implements b780 {
    public final /* synthetic */ GiftView b;
    public final /* synthetic */ Gift c;

    public kzt(GiftView giftView, Gift gift) {
        this.b = giftView;
        this.c = gift;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        int i = GiftView.A;
        VKImageView vKImageView = this.b.q;
        vKImageView.setOnLoadCallback(null);
        GiftView.f(0, vKImageView);
        vKImageView.load(this.c.f);
    }

    @Override // xsna.b780
    public final void g(String str) {
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
    }
}
