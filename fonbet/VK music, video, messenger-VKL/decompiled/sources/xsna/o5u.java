package xsna;

import com.vk.dto.common.data.CallProducerButton;

/* compiled from: GoodPreviewContent.kt */
/* loaded from: classes18.dex */
public final class o5u {
    public final boolean a;
    public final CallProducerButton b;
    public final CallProducerButton c;
    public final CallProducerButton d;
    public final CallProducerButton e;

    public /* synthetic */ o5u(CallProducerButton callProducerButton, boolean z) {
        this(z, callProducerButton, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5u)) {
            return false;
        }
        o5u o5uVar = (o5u) obj;
        return this.a == o5uVar.a && epx.f(this.b, o5uVar.b) && epx.f(this.c, o5uVar.c) && epx.f(this.d, o5uVar.d) && epx.f(this.e, o5uVar.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        CallProducerButton callProducerButton = this.b;
        int hashCode2 = (hashCode + (callProducerButton == null ? 0 : callProducerButton.hashCode())) * 31;
        CallProducerButton callProducerButton2 = this.c;
        int hashCode3 = (hashCode2 + (callProducerButton2 == null ? 0 : callProducerButton2.hashCode())) * 31;
        CallProducerButton callProducerButton3 = this.d;
        int hashCode4 = (hashCode3 + (callProducerButton3 == null ? 0 : callProducerButton3.hashCode())) * 31;
        CallProducerButton callProducerButton4 = this.e;
        return hashCode4 + (callProducerButton4 != null ? callProducerButton4.hashCode() : 0);
    }

    public final String toString() {
        return "GoodPreviewButtons(canAddToCart=" + this.a + ", callProducerButton=" + this.b + ", primaryButton=" + this.c + ", secondaryButton=" + this.d + ", cartButton=" + this.e + ')';
    }

    public o5u(boolean z, CallProducerButton callProducerButton, CallProducerButton callProducerButton2, CallProducerButton callProducerButton3, CallProducerButton callProducerButton4) {
        this.a = z;
        this.b = callProducerButton;
        this.c = callProducerButton2;
        this.d = callProducerButton3;
        this.e = callProducerButton4;
    }
}
