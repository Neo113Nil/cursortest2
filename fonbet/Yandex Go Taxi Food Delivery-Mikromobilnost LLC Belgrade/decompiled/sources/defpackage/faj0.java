package defpackage;

import java.util.List;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.RequiredAltChoiceOptionSelectorView;
import ru.yandex.taxi.utils.h;

/* loaded from: classes6.dex */
public final class faj0 implements iaj0 {
    public final /* synthetic */ RequiredAltChoiceOptionSelectorView a;

    public faj0(RequiredAltChoiceOptionSelectorView requiredAltChoiceOptionSelectorView) {
        this.a = requiredAltChoiceOptionSelectorView;
    }

    @Override // defpackage.iaj0
    public final void render(List list) {
        h hVar;
        hVar = this.a.listDelegate;
        hVar.c(list);
    }
}
