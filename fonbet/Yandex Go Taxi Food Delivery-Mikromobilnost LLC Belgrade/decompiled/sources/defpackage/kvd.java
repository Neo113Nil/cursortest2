package defpackage;

import java.util.List;
import ru.yandex.taxi.requirements.ui.selector.compound.CompoundOptionSelectorView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.h;

/* loaded from: classes6.dex */
public final class kvd implements hvd {
    public final /* synthetic */ CompoundOptionSelectorView a;

    public kvd(CompoundOptionSelectorView compoundOptionSelectorView) {
        this.a = compoundOptionSelectorView;
    }

    @Override // defpackage.hvd
    public final void applyTheme(ThemeType themeType) {
        this.a.applyTheme(themeType);
    }

    @Override // defpackage.hvd
    public final void render(List list) {
        h hVar;
        hVar = this.a.listDelegate;
        hVar.c(list);
    }
}
