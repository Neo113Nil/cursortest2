package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import ru.yandex.taxi.design.BadgeView;
import ru.yandex.taxi.requirements.ui.selector.compound.CompoundOptionTrailView;

/* loaded from: classes6.dex */
public final class lvd implements zo31 {
    public final CompoundOptionTrailView a;
    public final BadgeView b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;

    public lvd(CompoundOptionTrailView compoundOptionTrailView, BadgeView badgeView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.a = compoundOptionTrailView;
        this.b = badgeView;
        this.c = appCompatImageView;
        this.d = appCompatImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
