package xsna;

import com.vk.dto.stickers.VmojiAvatar;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;

/* compiled from: VmojiCharacterAction.kt */
/* loaded from: classes7.dex */
public abstract class e6w0 implements kj50 {

    /* compiled from: VmojiCharacterAction.kt */
    public static final class a extends e6w0 {
        public static final a b = new a();
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class b extends e6w0 {
        public final VmojiProductModel b;

        public b(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BuyVmojiProduct(product=" + this.b + ')';
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class c extends e6w0 {
        public final VmojiProductModel b;

        public c(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BuyVmojiProductConfirmed(product=" + this.b + ')';
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class d extends e6w0 {
        public static final d b = new d();
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class e extends e6w0 {
        public static final e b = new e();
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class f extends e6w0 {
        public static final f b = new f();
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class g extends e6w0 {
        public static final g b = new g();
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static abstract class h extends e6w0 {

        /* compiled from: VmojiCharacterAction.kt */
        public static final class a extends h {
            public static final a b = new a();
        }

        /* compiled from: VmojiCharacterAction.kt */
        public static final class b extends h {
            public static final b b = new b();
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static abstract class i extends e6w0 {
        public final String b;

        /* compiled from: VmojiCharacterAction.kt */
        public static final class a extends i {
            public final String c;

            public a(String str) {
                super(str);
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.c, ((a) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ByRetryClick(blockId1="), this.c, ')');
            }
        }

        /* compiled from: VmojiCharacterAction.kt */
        public static final class b extends i {
            public final String c;

            public b(String str) {
                super(str);
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.c, ((b) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ByScroll(blockId1="), this.c, ')');
            }
        }

        public i(String str) {
            this.b = str;
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class j extends e6w0 {
        public final VmojiAvatar b;
        public final boolean c;

        public j(VmojiAvatar vmojiAvatar, boolean z) {
            this.b = vmojiAvatar;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.b, jVar.b) && this.c == jVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("More(avatar=");
            sb.append(this.b);
            sb.append(", isHideFromKeyboard=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class k extends e6w0 {
        public final VmojiStickerPackPreviewModel b;
        public final boolean c;

        public k(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel, boolean z) {
            this.b = vmojiStickerPackPreviewModel;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && this.c == kVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MyStickerPackMore(pack=");
            sb.append(this.b);
            sb.append(", isHidden=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class l extends e6w0 {
        public static final l b = new l();
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class m extends e6w0 {
        public static final m b = new m();
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class n extends e6w0 {
        public final VmojiProductModel b;

        public n(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectVmojiProduct(product=" + this.b + ')';
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class o extends e6w0 {
        public static final o b = new o();
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class p extends e6w0 {
        public final VmojiCharacterModel b;

        public p(VmojiCharacterModel vmojiCharacterModel) {
            this.b = vmojiCharacterModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.b, ((p) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowAllVmojiProducts(character=" + this.b + ')';
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class q extends e6w0 {
        public final RecommendationsBlockModel b;

        public q(RecommendationsBlockModel recommendationsBlockModel) {
            this.b = recommendationsBlockModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && epx.f(this.b, ((q) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowStickersCatalog(block=" + this.b + ')';
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class r extends e6w0 {
        public final VmojiStickerPackPreviewModel b;

        public r(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel) {
            this.b = vmojiStickerPackPreviewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.b, ((r) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "StickerPackOpen(pack=" + this.b + ')';
        }
    }

    /* compiled from: VmojiCharacterAction.kt */
    public static final class s extends e6w0 {
        public final VmojiProductModel b;

        public s(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.b, ((s) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TryOnVmojiProduct(product=" + this.b + ')';
        }
    }
}
