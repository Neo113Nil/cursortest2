package xsna;

import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;

/* compiled from: VmojiRecommendationsState.kt */
/* loaded from: classes7.dex */
public abstract class naw0 implements kj50 {

    /* compiled from: VmojiRecommendationsState.kt */
    public static final class a extends naw0 {
        public static final a b = new a();
    }

    /* compiled from: VmojiRecommendationsState.kt */
    public static final class b extends naw0 {
        public static final b b = new b();
    }

    /* compiled from: VmojiRecommendationsState.kt */
    public static abstract class c extends naw0 {

        /* compiled from: VmojiRecommendationsState.kt */
        public static final class a extends c {
            public static final a b = new a();
        }

        /* compiled from: VmojiRecommendationsState.kt */
        public static final class b extends c {
            public static final b b = new b();
        }
    }

    /* compiled from: VmojiRecommendationsState.kt */
    public static final class d extends naw0 {
        public static final d b = new d();
    }

    /* compiled from: VmojiRecommendationsState.kt */
    public static final class e extends naw0 {
        public final VmojiStickerPackPreviewModel b;

        public e(VmojiStickerPackPreviewModel vmojiStickerPackPreviewModel) {
            this.b = vmojiStickerPackPreviewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "StickerPackOpen(pack=" + this.b + ')';
        }
    }
}
