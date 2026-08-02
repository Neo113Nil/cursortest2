package xsna;

import com.vk.vmoji.character.model.RecommendationsBlockModel;

/* compiled from: VmojiCharacterItem.kt */
/* loaded from: classes7.dex */
public final class dbf0 extends z6w0 {
    public final RecommendationsBlockModel b;
    public final sf90 c;

    public dbf0(RecommendationsBlockModel recommendationsBlockModel, sf90 sf90Var) {
        this.b = recommendationsBlockModel;
        this.c = sf90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbf0)) {
            return false;
        }
        dbf0 dbf0Var = (dbf0) obj;
        return epx.f(this.b, dbf0Var.b) && epx.f(this.c, dbf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "RecommendationsBlockItem(block=" + this.b + ", pagingState=" + this.c + ')';
    }
}
