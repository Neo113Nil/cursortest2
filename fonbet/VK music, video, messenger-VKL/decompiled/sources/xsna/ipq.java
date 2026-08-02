package xsna;

import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.entities.FavePage;

/* compiled from: FaveFeedMviPatch.kt */
/* loaded from: classes4.dex */
public interface ipq extends yl50 {

    /* compiled from: FaveFeedMviPatch.kt */
    public interface a extends ipq {

        /* compiled from: FaveFeedMviPatch.kt */
        /* renamed from: xsna.ipq$a$a, reason: collision with other inner class name */
        public static final class C3071a implements a {
            public final FavePage a;

            public C3071a(FavePage favePage) {
                this.a = favePage;
            }
        }

        /* compiled from: FaveFeedMviPatch.kt */
        public static final class b implements a {
            public final FavePage a;

            public b(FavePage favePage) {
                this.a = favePage;
            }
        }

        /* compiled from: FaveFeedMviPatch.kt */
        public static final class c implements a {
            public final tqq a;

            public c(tqq tqqVar) {
                this.a = tqqVar;
            }
        }
    }

    /* compiled from: FaveFeedMviPatch.kt */
    public interface b extends ipq {

        /* compiled from: FaveFeedMviPatch.kt */
        public static final class a implements b {
            public final FaveTag a;

            public a(FaveTag faveTag) {
                this.a = faveTag;
            }
        }
    }
}
