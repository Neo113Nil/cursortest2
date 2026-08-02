package defpackage;

import ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView;

/* loaded from: classes6.dex */
public final class bos0 implements szl {
    public final /* synthetic */ SlideableFlexModalView a;

    public bos0(SlideableFlexModalView slideableFlexModalView) {
        this.a = slideableFlexModalView;
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        if (neoVar instanceof hzl) {
            this.a.onContentUpdated();
        }
    }

    @Override // defpackage.szl
    public final void dispose() {
    }
}
