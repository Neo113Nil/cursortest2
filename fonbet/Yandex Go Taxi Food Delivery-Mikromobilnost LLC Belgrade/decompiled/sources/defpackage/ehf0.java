package defpackage;

import com.yandex.go.ultima_mode.profile.mvp.ProfileUltimaModeView;

/* loaded from: classes14.dex */
public final class ehf0 implements wgf0 {
    public final /* synthetic */ ProfileUltimaModeView a;

    public ehf0(ProfileUltimaModeView profileUltimaModeView) {
        this.a = profileUltimaModeView;
    }

    @Override // defpackage.wgf0
    public final void g1(zgf0 zgf0Var) {
        boolean z = zgf0Var instanceof xgf0;
        ProfileUltimaModeView profileUltimaModeView = this.a;
        if (z) {
            profileUltimaModeView.renderContentState((xgf0) zgf0Var);
        } else if (zgf0Var instanceof ygf0) {
            profileUltimaModeView.renderEmptyState();
        } else {
            w511.b();
        }
    }
}
