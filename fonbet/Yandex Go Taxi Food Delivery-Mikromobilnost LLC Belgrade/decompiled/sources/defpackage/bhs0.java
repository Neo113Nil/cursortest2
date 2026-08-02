package defpackage;

import com.ybsdk.feature.card.internal.entities.CardProductTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bhs0 extends chs0 {
    public final CardProductTypeEntity a;

    public bhs0(CardProductTypeEntity cardProductTypeEntity) {
        this.a = cardProductTypeEntity;
    }

    public final CardProductTypeEntity a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhs0) && this.a == ((bhs0) obj).a;
    }

    public final int hashCode() {
        CardProductTypeEntity cardProductTypeEntity = this.a;
        if (cardProductTypeEntity == null) {
            return 0;
        }
        return cardProductTypeEntity.hashCode();
    }

    public final String toString() {
        return "Loading(productType=" + this.a + Extension.C_BRAKE;
    }
}
