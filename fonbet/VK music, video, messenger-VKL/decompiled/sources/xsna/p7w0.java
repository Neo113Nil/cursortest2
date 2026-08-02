package xsna;

import com.vk.vmoji.character.model.CharacterContext;
import com.vk.vmoji.character.model.RecommendationsBlockModel;
import com.vk.vmoji.character.model.VmojiCharacterModel;
import com.vk.vmoji.character.model.VmojiProductModel;
import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import com.vk.vmoji.character.model.VmojiStickerPacksModel;
import java.util.List;

/* compiled from: VmojiCharacterPatch.kt */
/* loaded from: classes7.dex */
public abstract class p7w0 implements xl50 {

    /* compiled from: VmojiCharacterPatch.kt */
    public static final class a extends p7w0 {
        public static final a b = new a();
    }

    /* compiled from: VmojiCharacterPatch.kt */
    public static final class b extends p7w0 {
        public final VmojiStickerPackPreviewModel b;

        public b(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel) {
            this.b = vmojiStickerPackPreviewModel;
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
            return "HideMyStickerPack(pack=" + this.b + ')';
        }
    }

    /* compiled from: VmojiCharacterPatch.kt */
    public static abstract class c extends p7w0 {

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class a extends c {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class b extends c {
            public final VmojiCharacterModel b;
            public final VmojiStickerPacksModel c;
            public final List<RecommendationsBlockModel> d;

            public b(VmojiCharacterModel vmojiCharacterModel, VmojiStickerPacksModel vmojiStickerPacksModel, List<RecommendationsBlockModel> list) {
                this.b = vmojiCharacterModel;
                this.c = vmojiStickerPacksModel;
                this.d = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(character=");
                sb.append(this.b);
                sb.append(", stickerPacks=");
                sb.append(this.c);
                sb.append(", recommendationBlocks=");
                return ms9.a(')', sb, this.d);
            }
        }

        /* compiled from: VmojiCharacterPatch.kt */
        /* renamed from: xsna.p7w0$c$c, reason: collision with other inner class name */
        public static final class C3496c extends c {
            public final CharacterContext b;

            public C3496c(CharacterContext characterContext) {
                this.b = characterContext;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3496c) && this.b == ((C3496c) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "StartLoad(characterContext=" + this.b + ')';
            }
        }
    }

    /* compiled from: VmojiCharacterPatch.kt */
    public static abstract class d extends p7w0 {

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class a extends d {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class b extends d {
            public final VmojiStickerPacksModel b;

            public b(VmojiStickerPacksModel vmojiStickerPacksModel) {
                this.b = vmojiStickerPacksModel;
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
                return "Result(stickerPacksModel=" + this.b + ')';
            }
        }

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class c extends d {
            public static final c b = new c();
        }
    }

    /* compiled from: VmojiCharacterPatch.kt */
    public static abstract class e extends p7w0 {
        public final String b;

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class a extends e {
            public final String c;
            public final Throwable d;

            public a(String str, Throwable th) {
                super(str);
                this.c = str;
                this.d = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(blockId1=");
                sb.append(this.c);
                sb.append(", throwable=");
                return oq.c(sb, this.d, ')');
            }
        }

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class b extends e {
            public final String c;
            public final RecommendationsBlockModel d;

            public b(String str, RecommendationsBlockModel recommendationsBlockModel) {
                super(str);
                this.c = str;
                this.d = recommendationsBlockModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + (this.c.hashCode() * 31);
            }

            public final String toString() {
                return "Result(blockId1=" + this.c + ", stickerPacksModel=" + this.d + ')';
            }
        }

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class c extends e {
            public final String c;

            public c(String str) {
                super(str);
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.c, ((c) obj).c);
            }

            public final int hashCode() {
                return this.c.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Start(blockId1="), this.c, ')');
            }
        }

        public e(String str) {
            this.b = str;
        }
    }

    /* compiled from: VmojiCharacterPatch.kt */
    public static abstract class f extends p7w0 {

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class a extends f {
            public final Throwable b;

            public a(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class b extends f {
            public final VmojiCharacterModel b;
            public final VmojiStickerPacksModel c;
            public final List<RecommendationsBlockModel> d;

            public b(VmojiCharacterModel vmojiCharacterModel, VmojiStickerPacksModel vmojiStickerPacksModel, List<RecommendationsBlockModel> list) {
                this.b = vmojiCharacterModel;
                this.c = vmojiStickerPacksModel;
                this.d = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(character=");
                sb.append(this.b);
                sb.append(", stickerPacks=");
                sb.append(this.c);
                sb.append(", recommendationBlocks=");
                return ms9.a(')', sb, this.d);
            }
        }

        /* compiled from: VmojiCharacterPatch.kt */
        public static final class c extends f {
            public static final c b = new c();
        }
    }

    /* compiled from: VmojiCharacterPatch.kt */
    public static final class g extends p7w0 {
        public static final g b = new g();
    }

    /* compiled from: VmojiCharacterPatch.kt */
    public static final class h extends p7w0 {
        public final VmojiProductModel b;

        public h(VmojiProductModel vmojiProductModel) {
            this.b = vmojiProductModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SelectVmojiProduct(product=" + this.b + ')';
        }
    }

    /* compiled from: VmojiCharacterPatch.kt */
    public static final class i extends p7w0 {
        public final VmojiStickerPackPreviewModel b;

        public i(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel) {
            this.b = vmojiStickerPackPreviewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowMyStickerPack(pack=" + this.b + ')';
        }
    }
}
