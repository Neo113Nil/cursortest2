package xsna;

import com.vk.dto.common.data.CallProducerButton;

/* compiled from: GoodPreviewButtonsItem.kt */
/* loaded from: classes18.dex */
public final class p5u implements n4d0 {
    public final k7u b;
    public final boolean c;
    public final boolean d;
    public final CallProducerButton e;

    public p5u(k7u k7uVar, boolean z, boolean z2, CallProducerButton callProducerButton) {
        this.b = k7uVar;
        this.c = z;
        this.d = z2;
        this.e = callProducerButton;
    }

    @Override // xsna.n4d0
    public final int N9() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5u)) {
            return false;
        }
        p5u p5uVar = (p5u) obj;
        return epx.f(this.b, p5uVar.b) && this.c == p5uVar.c && this.d == p5uVar.d && epx.f(this.e, p5uVar.e);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        CallProducerButton callProducerButton = this.e;
        return Integer.hashCode(4) + ((b + (callProducerButton == null ? 0 : callProducerButton.hashCode())) * 31);
    }

    public final String toString() {
        return "GoodPreviewButtonsItem(good=" + this.b + ", canAddToCart=" + this.c + ", isAddedToCart=" + this.d + ", callProducerButton=" + this.e + ", blockType=4)";
    }
}
