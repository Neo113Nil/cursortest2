package xsna;

import com.vk.dto.common.data.LikeInfo;
import java.util.List;
import xsna.xn60;

/* compiled from: PostMviAction.kt */
/* loaded from: classes4.dex */
public interface t4c0 extends lj50 {

    /* compiled from: PostMviAction.kt */
    public interface a extends t4c0 {

        /* compiled from: PostMviAction.kt */
        /* renamed from: xsna.t4c0$a$a, reason: collision with other inner class name */
        public static final class C3717a implements a {
            public static final C3717a b = new C3717a();
        }

        /* compiled from: PostMviAction.kt */
        public static final class b implements a {
        }
    }

    /* compiled from: PostMviAction.kt */
    public static final class b implements t4c0, pj50<xn60.a> {
        public final xn60.a b;

        public b(xn60.a aVar) {
            this.b = aVar;
        }

        @Override // xsna.pj50
        public final xn60.a h() {
            return this.b;
        }
    }

    /* compiled from: PostMviAction.kt */
    public static final class c implements t4c0, pj50<xn60.b> {
        public final xn60.b b;

        public c(xn60.b bVar) {
            this.b = bVar;
        }

        @Override // xsna.pj50
        public final xn60.b h() {
            return this.b;
        }
    }

    /* compiled from: PostMviAction.kt */
    public interface d extends t4c0 {

        /* compiled from: PostMviAction.kt */
        public static final class a implements d {
            public final List<LikeInfo> b;

            public a(List<LikeInfo> list) {
                this.b = list;
            }
        }
    }

    /* compiled from: PostMviAction.kt */
    public static final class e implements t4c0, pj50<xn60.d> {
        public final xn60.d b;

        public e(xn60.d dVar) {
            this.b = dVar;
        }

        @Override // xsna.pj50
        public final xn60.d h() {
            return this.b;
        }
    }

    /* compiled from: PostMviAction.kt */
    public interface f extends t4c0 {

        /* compiled from: PostMviAction.kt */
        public static final class a implements f {
            public static final a b = new a();
        }
    }
}
