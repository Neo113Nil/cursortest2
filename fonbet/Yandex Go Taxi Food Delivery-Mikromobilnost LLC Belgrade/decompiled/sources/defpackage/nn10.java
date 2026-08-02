package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.ultima_mode.menu.mvp.MenuUltimaModeView;
import com.yandex.go.ultima_mode.ui.header.UltimaModeHeaderView;
import com.yandex.go.ultima_mode.ui.progress_bar.UltimaModeProgressBarView;

/* loaded from: classes14.dex */
public final class nn10 implements zo31 {
    public final MenuUltimaModeView a;
    public final UltimaModeHeaderView b;
    public final UltimaModeProgressBarView c;
    public final GoLinearLayout d;

    public nn10(MenuUltimaModeView menuUltimaModeView, UltimaModeHeaderView ultimaModeHeaderView, UltimaModeProgressBarView ultimaModeProgressBarView, GoLinearLayout goLinearLayout) {
        this.a = menuUltimaModeView;
        this.b = ultimaModeHeaderView;
        this.c = ultimaModeProgressBarView;
        this.d = goLinearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
