package defpackage;

import com.yandex.go.payments.cards.ui.Card3dsView;
import com.yandex.go.payments.cards.verification.d3s.Card3dsModalView;

/* loaded from: classes13.dex */
public final class g88 extends jey {
    public final /* synthetic */ Card3dsModalView a;

    public g88(Card3dsModalView card3dsModalView) {
        this.a = card3dsModalView;
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStart() {
        Card3dsView card3dsView;
        card3dsView = this.a.card3dsView;
        if (card3dsView != null) {
            card3dsView.resume();
        }
    }

    @Override // defpackage.jey, defpackage.iey
    public final void onStop() {
        Card3dsView card3dsView;
        card3dsView = this.a.card3dsView;
        if (card3dsView != null) {
            card3dsView.pause();
        }
    }
}
