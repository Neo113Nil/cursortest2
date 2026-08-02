package defpackage;

import ru.yandex.taxi.design.ClickableImageView;
import ru.yandex.taxi.settings.presentation.menu_item.PushDisabledMenuItem;

/* loaded from: classes6.dex */
public final class j1g0 implements k1g0 {
    public final /* synthetic */ PushDisabledMenuItem a;

    public j1g0(PushDisabledMenuItem pushDisabledMenuItem) {
        this.a = pushDisabledMenuItem;
    }

    @Override // defpackage.k1g0
    public final void M6(String str) {
        pav pavVar;
        PushDisabledMenuItem pushDisabledMenuItem = this.a;
        ClickableImageView trailImageView = pushDisabledMenuItem.getTrailImageView();
        if (evu0.J(str)) {
            trailImageView.setImageDrawable(null);
        }
        pavVar = pushDisabledMenuItem.imageLoader;
        ((nac) pavVar.a(trailImageView)).c(str);
    }

    @Override // defpackage.k1g0
    public final void setSubtitle(String str) {
        this.a.setSubtitle(str);
    }

    @Override // defpackage.k1g0
    public final void setTitle(String str) {
        this.a.setTitle(str);
    }
}
