package xsna;

import com.vk.clips.sdk.shared.api.routing.models.ClipFeedOpenAction;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.impl.feed.wrapper.presentation.event.ClipsWrapperHintButtonPosition;
import com.vk.dto.common.VideoFile;
import com.vk.dto.hints.Hint;
import com.vk.dto.music.MusicTrack;
import java.util.List;

/* compiled from: ClipsWrapperAction.kt */
/* loaded from: classes17.dex */
public interface npf extends kj50 {

    /* compiled from: ClipsWrapperAction.kt */
    public static final class a<T extends ClipFeedTab> implements npf {
        public final rfc b;

        public a(rfc rfcVar) {
            this.b = rfcVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b.equals(((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ActivateTabByClass(tabClass=" + this.b + ')';
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public static final class b implements npf {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ActivateTabWithIndex(index="), this.b, ')');
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public interface c extends npf {
    }

    /* compiled from: ClipsWrapperAction.kt */
    public interface d extends npf {

        /* compiled from: ClipsWrapperAction.kt */
        public static final class a implements d {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1256061950;
            }

            public final String toString() {
                return "Cancel";
            }
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public interface e extends npf {

        /* compiled from: ClipsWrapperAction.kt */
        public static final class a implements e {
            public final boolean b;

            public a(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("ActiveProfilePageChange(isUser="), this.b, ')');
            }
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public interface f extends npf {

        /* compiled from: ClipsWrapperAction.kt */
        public static final class a implements f {
            public final Hint b;

            public a(Hint hint) {
                this.b = hint;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.b.hashCode();
            }

            public final String toString() {
                return "Dismiss(hint=" + this.b + ')';
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class b implements f {
            public final Hint b;
            public final ClipsWrapperHintButtonPosition c;

            public b(Hint hint, ClipsWrapperHintButtonPosition clipsWrapperHintButtonPosition) {
                this.b = hint;
                this.c = clipsWrapperHintButtonPosition;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && this.c == bVar.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.b.hashCode() * 31);
            }

            public final String toString() {
                return "Show(hint=" + this.b + ", position=" + this.c + ')';
            }
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public static final class g implements npf {
        public final boolean b;
        public final ClipFeedTab.WithPayload.Payload c;
        public final boolean d;

        public g() {
            this(false, null, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && epx.f(this.c, gVar.c) && this.d == gVar.d;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            ClipFeedTab.WithPayload.Payload payload = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (payload == null ? 0 : payload.b.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitLoad(isCanDisplayUploads=");
            sb.append(this.b);
            sb.append(", initialTabPayload=");
            sb.append(this.c);
            sb.append(", shouldLoadTabs=");
            return defpackage.q0.a(sb, this.d, ')');
        }

        public g(boolean z, ClipFeedTab.WithPayload.Payload payload, boolean z2) {
            this.b = z;
            this.c = payload;
            this.d = z2;
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public interface h extends npf {

        /* compiled from: ClipsWrapperAction.kt */
        public static final class a implements h {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1489009412;
            }

            public final String toString() {
                return "Back";
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class b implements h {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 546783916;
            }

            public final String toString() {
                return "CatalogSearch";
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class c implements h {
            public final VideoFile b;

            public c(VideoFile videoFile) {
                this.b = videoFile;
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
                return lq.a(new StringBuilder("ClipPromotion(video="), this.b, ')');
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class d implements h {
            public final VideoFile b;

            public d(VideoFile videoFile) {
                this.b = videoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return lq.a(new StringBuilder("ClipStatistics(video="), this.b, ')');
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class e implements h {
            public final String b;
            public final String c;
            public final MusicTrack d;

            public e() {
                this(null, null, null);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && epx.f(this.d, eVar.d);
            }

            public final int hashCode() {
                String str = this.b;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.c;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                MusicTrack musicTrack = this.d;
                return hashCode2 + (musicTrack != null ? musicTrack.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CreateClip(trackCode=");
                sb.append(this.b);
                sb.append(", trendingHashtag=");
                sb.append(this.c);
                sb.append(", musicTrack=");
                return rq.c(sb, this.d, ')');
            }

            public e(MusicTrack musicTrack, String str, String str2) {
                this.b = str;
                this.c = str2;
                this.d = musicTrack;
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class f implements h {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 77057621;
            }

            public final String toString() {
                return "InterestsChoice";
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class g implements h {
        }

        /* compiled from: ClipsWrapperAction.kt */
        /* renamed from: xsna.npf$h$h, reason: collision with other inner class name */
        public static final class C3409h implements h {
            public static final C3409h b = new C3409h();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3409h);
            }

            public final int hashCode() {
                return 1095004660;
            }

            public final String toString() {
                return "Login";
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class i implements h {
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class j implements h {
            public final boolean b;

            public j(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.b == ((j) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("MoreMenu(withShare="), this.b, ')');
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class k implements h {
            public static final k b = new k();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof k);
            }

            public final int hashCode() {
                return -1329773111;
            }

            public final String toString() {
                return "MultiAccount";
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class l implements h {
            public static final l b = new l();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof l);
            }

            public final int hashCode() {
                return -619276940;
            }

            public final String toString() {
                return "Profile";
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class m implements h {
            public static final m b = new m();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof m);
            }

            public final int hashCode() {
                return -223595395;
            }

            public final String toString() {
                return "Search";
            }
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public interface i extends npf {

        /* compiled from: ClipsWrapperAction.kt */
        public static final class a implements i {
            public final ClipFeedOpenAction b;

            public a(ClipFeedOpenAction clipFeedOpenAction) {
                this.b = clipFeedOpenAction;
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
                return "Apply(openAction=" + this.b + ')';
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class b implements i {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1535354292;
            }

            public final String toString() {
                return "Lock";
            }
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class c implements i {
            public static final c b = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1736261235;
            }

            public final String toString() {
                return "Unlock";
            }
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public static final class j implements npf {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1741590231;
        }

        public final String toString() {
            return "ResetScroll";
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public static final class k implements npf {
        public final tqf b;

        public k(tqf tqfVar) {
            this.b = tqfVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ShowFeedOnboarding(focusedItem=" + this.b + ')';
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public static final class l implements npf {
    }

    /* compiled from: ClipsWrapperAction.kt */
    public static final class m implements npf {
        public final String b;
        public final String c;

        public m(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowShopsTabOnboarding(hintTitle=");
            sb.append(this.b);
            sb.append(", hintId=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public static final class n implements npf {
        public final List<ClipFeedTab> b;

        /* JADX WARN: Multi-variable type inference failed */
        public n(List<? extends ClipFeedTab> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("ShowTabs(tabs="), this.b);
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public static final class o implements npf {
        public final ClipFeedTab b;

        public o(ClipFeedTab clipFeedTab) {
            this.b = clipFeedTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && epx.f(this.b, ((o) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "TrackTab(tab=" + this.b + ')';
        }
    }

    /* compiled from: ClipsWrapperAction.kt */
    public interface p extends npf {

        /* compiled from: ClipsWrapperAction.kt */
        public static final class a implements p {
            public static final a b = new a();
        }

        /* compiled from: ClipsWrapperAction.kt */
        public static final class b implements p {
            public static final b b = new b();
        }
    }
}
