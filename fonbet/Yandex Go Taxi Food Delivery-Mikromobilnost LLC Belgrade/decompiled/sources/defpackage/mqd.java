package defpackage;

import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import kotlin.a;

/* loaded from: classes2.dex */
public final class mqd implements ued0 {
    public final PlusPayCompositeOffers a;
    public final i3y b = a.a(new lyc(7, this));

    public mqd(PlusPayCompositeOffers plusPayCompositeOffers) {
        this.a = plusPayCompositeOffers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqd) && jl40.l(this.a, ((mqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CompositeOffersImpl(actualOffer=" + this.a + ')';
    }
}
