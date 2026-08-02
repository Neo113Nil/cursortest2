package defpackage;

import com.yandex.payment.sdk.datasource.bind.interfaces.CardButtonTitle;
import com.yandex.payment.sdk.ui.CardInput$State;

/* loaded from: classes2.dex */
public final class p560 extends qg8 {
    public String h;
    public boolean i;
    public vga0 j;
    public final dy40 k;
    public final dy40 l;
    public final dy40 m;
    public rk6 n;

    public p560(rwo rwoVar) {
        super(rwoVar);
        this.k = new dy40();
        this.l = new dy40();
        this.m = new dy40();
    }

    @Override // defpackage.qg8
    public final void b() {
        on8 on8Var = this.f;
        if (on8Var != null) {
            on8Var.b(kn8.a);
        }
        g98 g98Var = this.d;
        if (g98Var != null) {
            g98Var.e(e98.a);
        }
        vga0 vga0Var = this.j;
        if (vga0Var != null) {
            vga0Var.a(new o560(this));
        }
    }

    @Override // defpackage.qg8
    public final f98 d(CardInput$State cardInput$State) {
        boolean z = this.i;
        return (!z && this.h == null && (cardInput$State == CardInput$State.CARD_NUMBER || cardInput$State == CardInput$State.CARD_NUMBER_VALID)) ? new c98(CardButtonTitle.ShowNext) : (!z && this.h == null && (cardInput$State == CardInput$State.CARD_DETAILS || cardInput$State == CardInput$State.CARD_DETAILS_VALID)) ? new c98(CardButtonTitle.ShowProcess) : super.d(cardInput$State);
    }
}
