package xsna;

import com.vk.profile.community.impl.ui.cover.redesign.delegate.BaseCommunityLiveCoverItemDelegate;
import com.vk.stat.scheme.MobileOfficialAppsGroupsStat$LiveCoverEvent;

/* compiled from: CommunityPictureCoverViewController.kt */
/* loaded from: classes5.dex */
public final class kch implements b780 {
    public final /* synthetic */ lch b;

    public kch(lch lchVar) {
        this.b = lchVar;
    }

    @Override // xsna.b780
    public final void b(String str, Throwable th) {
        lch lchVar = this.b;
        lchVar.a.setTooltipVisibility(false);
        lchVar.e.invoke(BaseCommunityLiveCoverItemDelegate.ViewState.ERROR);
        b9h b9hVar = lchVar.g;
        siz.b(Long.valueOf(b9hVar.b.b), MobileOfficialAppsGroupsStat$LiveCoverEvent.LiveCoverEventType.DOWNLOADING_ERROR, siz.a(b9hVar.a), null, null);
    }

    @Override // xsna.b780
    public final void g(String str) {
        lch lchVar = this.b;
        lchVar.a.setTooltipVisibility(true);
        lchVar.e.invoke(BaseCommunityLiveCoverItemDelegate.ViewState.PROGRESS);
    }

    @Override // xsna.b780
    public final void t(int i, int i2, String str) {
        lch lchVar = this.b;
        lchVar.e.invoke(BaseCommunityLiveCoverItemDelegate.ViewState.COMMON);
        if (lchVar.b.b.a) {
            lchVar.play();
        }
    }

    @Override // xsna.b780
    public final void onCancel(String str) {
    }
}
