package xsna;

import com.vk.stickers.views.gift.GiftView;

/* compiled from: GiftView.kt */
/* loaded from: classes6.dex */
public final class lzt implements b780 {
    public final /* synthetic */ GiftView b;

    public lzt(GiftView giftView) {
        this.b = giftView;
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        int i3 = GiftView.A;
        GiftView giftView = this.b;
        giftView.g();
        giftView.q.setOnLoadCallback(null);
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
