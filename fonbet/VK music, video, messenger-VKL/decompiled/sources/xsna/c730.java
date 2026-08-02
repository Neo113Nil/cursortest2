package xsna;

import com.vk.dto.stickers.images.ModifierType;

/* compiled from: ImageUrlMorpheme.kt */
/* loaded from: classes18.dex */
public final class c730 implements hmw {
    public final ModifierType a;

    public c730(ModifierType modifierType) {
        this.a = modifierType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c730) && this.a == ((c730) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ModifierMorpheme(type=" + this.a + ')';
    }
}
