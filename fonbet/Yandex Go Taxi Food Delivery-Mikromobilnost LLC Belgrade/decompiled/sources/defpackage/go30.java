package defpackage;

import ru.yandex.taxi.masstransit.main.ui.header.compose.MtHeader;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;

/* loaded from: classes6.dex */
public final class go30 implements ko30 {
    public final /* synthetic */ MtMainFlexModalView a;

    public go30(MtMainFlexModalView mtMainFlexModalView) {
        this.a = mtMainFlexModalView;
    }

    @Override // defpackage.ko30
    public final void I4() {
        MtMainFlexModalView mtMainFlexModalView = this.a;
        mtMainFlexModalView.post(new do30(mtMainFlexModalView, 4));
    }

    @Override // defpackage.ko30
    public final void aa(km30 km30Var) {
        MtHeader header;
        MtHeader header2;
        MtMainFlexModalView mtMainFlexModalView = this.a;
        header = mtMainFlexModalView.getHeader();
        km30Var.getClass();
        header.setVisibility(km30Var != km30.e ? 0 : 8);
        header2 = mtMainFlexModalView.getHeader();
        header2.render(km30Var);
        mtMainFlexModalView.post(new do30(mtMainFlexModalView, 5));
    }
}
