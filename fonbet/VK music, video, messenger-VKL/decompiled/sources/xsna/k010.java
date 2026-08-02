package xsna;

import com.vk.comments.core.BoardComment;
import com.vk.dto.common.id.UserId;

/* compiled from: MarketItemCommentsAction.kt */
/* loaded from: classes17.dex */
public interface k010 extends kj50 {

    /* compiled from: MarketItemCommentsAction.kt */
    public static final class a implements k010 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 414188393;
        }

        public final String toString() {
            return "ActivateAllComments";
        }
    }

    /* compiled from: MarketItemCommentsAction.kt */
    public static final class b implements k010 {
        public final BoardComment b;

        public b(BoardComment boardComment) {
            this.b = boardComment;
        }
    }

    /* compiled from: MarketItemCommentsAction.kt */
    public static final class c implements k010 {
        public static final c b = new c();
    }

    /* compiled from: MarketItemCommentsAction.kt */
    public static final class d implements k010 {
        public static final d b = new d();
    }

    /* compiled from: MarketItemCommentsAction.kt */
    public interface e extends k010 {

        /* compiled from: MarketItemCommentsAction.kt */
        public static final class a implements e {
            public final int b;

            public a(int i) {
                this.b = i;
            }
        }

        /* compiled from: MarketItemCommentsAction.kt */
        public static final class b implements e {
            public final int b;

            public b(int i) {
                this.b = i;
            }
        }

        /* compiled from: MarketItemCommentsAction.kt */
        public static final class c implements e {
            public final UserId b;

            public c(UserId userId) {
                this.b = userId;
            }
        }

        /* compiled from: MarketItemCommentsAction.kt */
        public static final class d implements e {
        }
    }

    /* compiled from: MarketItemCommentsAction.kt */
    public static final class f implements k010 {
        public final BoardComment b;

        public f(BoardComment boardComment) {
            this.b = boardComment;
        }
    }

    /* compiled from: MarketItemCommentsAction.kt */
    public static final class g implements k010 {
        public final BoardComment b;

        public g(BoardComment boardComment) {
            this.b = boardComment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.b;
        }

        public final String toString() {
            return "OnEditCommentClick(comment=" + this.b + ')';
        }
    }

    /* compiled from: MarketItemCommentsAction.kt */
    public static final class h implements k010 {
        public final int b;

        public h(int i) {
            this.b = i;
        }
    }

    /* compiled from: MarketItemCommentsAction.kt */
    public static final class i implements k010 {
    }

    /* compiled from: MarketItemCommentsAction.kt */
    public static final class j implements k010 {
        public static final j b = new j();
    }
}
