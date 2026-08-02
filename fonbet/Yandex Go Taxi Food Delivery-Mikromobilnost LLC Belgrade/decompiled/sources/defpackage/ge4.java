package defpackage;

import ru.yandex.taxi.order.back.BackButtonView;

/* loaded from: classes6.dex */
public final class ge4 implements de4 {
    public final /* synthetic */ BackButtonView a;

    public ge4(BackButtonView backButtonView) {
        this.a = backButtonView;
    }

    @Override // defpackage.de4
    public final void setVisible(boolean z) {
        BackButtonView backButtonView = this.a;
        if (z) {
            cma1.J(backButtonView);
        } else {
            cma1.L(backButtonView);
        }
    }

    @Override // defpackage.de4
    public final void updateBadgeText(String str) {
        this.a.setBadgeText(str);
    }
}
