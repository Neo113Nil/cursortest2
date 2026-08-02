package xsna;

import com.vk.dto.stickers.StickerStockItem;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vk.stickers.details.AuthorSubscriptionRef;

/* compiled from: StickerStyleSelectorView.kt */
/* loaded from: classes6.dex */
public final class n7l0 implements g3l0 {
    public final /* synthetic */ o7l0 a;

    public n7l0(o7l0 o7l0Var) {
        this.a = o7l0Var;
    }

    @Override // xsna.g3l0
    public final void B(StickerStockItem stickerStockItem) {
        f7l0 presenter = this.a.getPresenter();
        if (presenter != null) {
            presenter.B(stickerStockItem);
        }
    }

    @Override // xsna.g3l0
    public final void e() {
        f7l0 presenter = this.a.getPresenter();
        if (presenter != null) {
            presenter.e();
        }
    }

    @Override // xsna.g3l0
    public final void m0(long j, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action action) {
        ucl0 packSearchClickTracker = this.a.getPackSearchClickTracker();
        if (packSearchClickTracker != null) {
            packSearchClickTracker.a(j, action);
        }
    }

    @Override // xsna.g3l0
    public final void R(StickerStockItem stickerStockItem) {
    }

    @Override // xsna.g3l0
    public final void j0(StickerStockItem stickerStockItem) {
    }

    @Override // xsna.g3l0
    public final void k0(boolean z) {
    }

    @Override // xsna.g3l0
    public final void l0(StickerStockItem stickerStockItem) {
    }

    @Override // xsna.g3l0
    public final void N(StickerStockItem stickerStockItem, AuthorSubscriptionRef authorSubscriptionRef) {
    }
}
