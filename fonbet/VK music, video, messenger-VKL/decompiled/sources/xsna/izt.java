package xsna;

import com.vk.games.model.GamesCatalogActionType;

/* compiled from: GamesCatalogGiftIcon.kt */
/* loaded from: classes17.dex */
public final class izt {
    public final GamesCatalogActionType a;
    public final String b;

    public izt(GamesCatalogActionType gamesCatalogActionType, String str) {
        this.a = gamesCatalogActionType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izt)) {
            return false;
        }
        izt iztVar = (izt) obj;
        return this.a == iztVar.a && epx.f(this.b, iztVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftIconAction(type=");
        sb.append(this.a);
        sb.append(", url=");
        return ho8.a(sb, this.b, ')');
    }
}
