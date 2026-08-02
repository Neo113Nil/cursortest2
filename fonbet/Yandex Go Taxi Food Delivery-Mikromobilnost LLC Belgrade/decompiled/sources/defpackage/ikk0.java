package defpackage;

import ru.yandex.taxi.design.DividerWithColorView;

/* loaded from: classes14.dex */
public final class ikk0 extends qpk0 {
    public static final /* synthetic */ int S = 0;
    public final DividerWithColorView R;

    public ikk0(DividerWithColorView dividerWithColorView) {
        super(dividerWithColorView);
        this.R = dividerWithColorView;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        hkk0 hkk0Var = (hkk0) obj;
        boolean z = hkk0Var instanceof fkk0;
        DividerWithColorView dividerWithColorView = this.R;
        if (z) {
            dividerWithColorView.updateColor(((fkk0) hkk0Var).b);
        } else if (hkk0Var instanceof gkk0) {
            dividerWithColorView.updateColor(((gkk0) hkk0Var).b);
        } else {
            w511.b();
        }
    }
}
