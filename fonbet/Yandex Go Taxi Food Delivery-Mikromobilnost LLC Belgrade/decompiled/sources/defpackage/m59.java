package defpackage;

import androidx.emoji2.emojipicker.ItemType;

/* loaded from: classes10.dex */
public final class m59 extends g3x {
    public final String c;

    public m59(String str) {
        super(ItemType.CATEGORY_TITLE);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m59) && jl40.l(this.c, ((m59) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("CategoryTitle(title="), this.c, ')');
    }
}
