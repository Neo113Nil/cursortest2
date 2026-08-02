package xsna;

import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.viewer.edit.api.domain.model.ClipCoauthorSdkItem;
import java.util.List;

/* compiled from: ClipEditSdkMviAction.kt */
/* loaded from: classes17.dex */
public interface usc extends lj50 {

    /* compiled from: ClipEditSdkMviAction.kt */
    public interface a extends usc {

        /* compiled from: ClipEditSdkMviAction.kt */
        /* renamed from: xsna.usc$a$a, reason: collision with other inner class name */
        public static final class C3818a implements a {
            public final boolean b;

            public C3818a(boolean z) {
                this.b = z;
            }
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class b implements a {
            public final List<ClipCoauthorSdkItem> b;

            public b(List<ClipCoauthorSdkItem> list) {
                this.b = list;
            }
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class c implements a {
            public final String b;

            public c(String str) {
                this.b = str;
            }
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class d implements a {
            public final SdkClipOrdData b;

            public d(SdkClipOrdData sdkClipOrdData) {
                this.b = sdkClipOrdData;
            }
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class e implements a {
            public final String b;

            public e(String str) {
                this.b = str;
            }
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class f implements a {
            public final e2s0 b;

            public f(e2s0 e2s0Var) {
                this.b = e2s0Var;
            }
        }
    }

    /* compiled from: ClipEditSdkMviAction.kt */
    public interface b extends usc {

        /* compiled from: ClipEditSdkMviAction.kt */
        public interface a extends b {

            /* compiled from: ClipEditSdkMviAction.kt */
            /* renamed from: xsna.usc$b$a$a, reason: collision with other inner class name */
            public static final class C3819a implements a {
                public static final C3819a b = new C3819a();
            }

            /* compiled from: ClipEditSdkMviAction.kt */
            /* renamed from: xsna.usc$b$a$b, reason: collision with other inner class name */
            public static final class C3820b implements a {
                public static final C3820b b = new C3820b();
            }

            /* compiled from: ClipEditSdkMviAction.kt */
            public static final class c implements a {
                public static final c b = new c();
            }

            /* compiled from: ClipEditSdkMviAction.kt */
            public static final class d implements a {
                public static final d b = new d();
            }

            /* compiled from: ClipEditSdkMviAction.kt */
            public static final class e implements a {
                public static final e b = new e();
            }
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        /* renamed from: xsna.usc$b$b, reason: collision with other inner class name */
        public static final class C3821b implements b {
            public static final C3821b b = new C3821b();
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class c implements b {
            public static final c b = new c();
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class d implements b {
            public static final d b = new d();
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class e implements b {
            public static final e b = new e();
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class f implements b {
            public static final f b = new f();
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class g implements b {
            public final String b;

            public g(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("OnTrendingBadgeClick(hashtag="), this.b, ')');
            }
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public static final class h implements b {
            public static final h b = new h();
        }

        /* compiled from: ClipEditSdkMviAction.kt */
        public interface i extends b {

            /* compiled from: ClipEditSdkMviAction.kt */
            public static final class a implements i {
                public static final a b = new a();
            }

            /* compiled from: ClipEditSdkMviAction.kt */
            /* renamed from: xsna.usc$b$i$b, reason: collision with other inner class name */
            public static final class C3822b implements i {
                public static final C3822b b = new C3822b();
            }

            /* compiled from: ClipEditSdkMviAction.kt */
            public static final class c implements i {
                public static final c b = new c();
            }

            /* compiled from: ClipEditSdkMviAction.kt */
            public static final class d implements i {
                public static final d b = new d();
            }
        }
    }
}
