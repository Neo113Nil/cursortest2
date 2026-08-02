package defpackage;

import com.yandex.go.design.divider.CardDivider;

/* loaded from: classes14.dex */
public final class kdk0 extends qpk0 {
    public static final /* synthetic */ int S = 0;
    public final CardDivider R;

    public kdk0(CardDivider cardDivider) {
        super(cardDivider);
        this.R = cardDivider;
    }

    @Override // defpackage.wys
    public final void c(Object obj) {
        bgk0 bgk0Var = (bgk0) obj;
        boolean z = bgk0Var instanceof fdk0;
        CardDivider cardDivider = this.R;
        if (z) {
            cardDivider.setColor(((fdk0) bgk0Var).b);
        } else if (bgk0Var instanceof hdk0) {
            cardDivider.setColor(((hdk0) bgk0Var).b);
        } else if (bgk0Var instanceof gdk0) {
            cardDivider.setColor(((gdk0) bgk0Var).b);
        }
    }
}
