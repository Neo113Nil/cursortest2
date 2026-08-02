package xsna;

import com.vk.clips.attachments.api.main.video.ClipsVideoAttachmentData;
import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewParams;
import com.vk.clips.upload.edit.api.preview.ClipsChoosePreviewResult;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.dto.clips.external.ClipsDraftablePlaylist;
import com.vk.dto.common.clips.ClipsLinkAttachment;
import com.vk.dto.common.clips.CoOwnerItem;
import com.vk.dto.common.id.UserId;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.posting.PostingVisibilityMode;
import com.vk.dto.stories.entities.OrdData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ClipsUploadAction.kt */
/* loaded from: classes17.dex */
public interface lbf extends lj50 {

    /* compiled from: ClipsUploadAction.kt */
    public interface a extends lbf {

        /* compiled from: ClipsUploadAction.kt */
        /* renamed from: xsna.lbf$a$a, reason: collision with other inner class name */
        public static final class C3246a implements a {
            public final UserId b;
            public final boolean c;
            public final boolean d;

            public C3246a(UserId userId, int i) {
                boolean z = (i & 2) == 0;
                boolean z2 = (i & 4) == 0;
                this.b = userId;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3246a)) {
                    return false;
                }
                C3246a c3246a = (C3246a) obj;
                return epx.f(this.b, c3246a.b) && this.c == c3246a.c && this.d == c3246a.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(Long.hashCode(this.b.b) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AuthorSelected(authorId=");
                sb.append(this.b);
                sb.append(", force=");
                sb.append(this.c);
                sb.append(", forceReload=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class b implements a {
            public final ClipsChoosePreviewResult b;

            public b(ClipsChoosePreviewResult clipsChoosePreviewResult) {
                this.b = clipsChoosePreviewResult;
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
                return "CoverSelected(cover=" + this.b + ')';
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class c implements a {
            public final String b;

            public c(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("DescriptionChanged(newDescription="), this.b, ')');
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class d implements a {
            public static final d b = new d();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class e implements a {
            public static final e b = new e();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class f implements a {
            public final String b;
            public final String c;
            public final String d;

            public f(String str, String str2, String str3) {
                this.b = str;
                this.c = str2;
                this.d = str3;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class g implements a {
            public static final g b = new g();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class h implements a {
            public static final h b = new h();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class i implements a {
            public static final i b = new i();
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface j extends a {

            /* compiled from: ClipsUploadAction.kt */
            /* renamed from: xsna.lbf$a$j$a, reason: collision with other inner class name */
            public static final class C3247a implements j {
                public static final C3247a b = new C3247a();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements j {
                public final ClipUploadData b;

                public b(ClipUploadData clipUploadData) {
                    this.b = clipUploadData;
                }
            }
        }
    }

    /* compiled from: ClipsUploadAction.kt */
    public interface b extends lbf {

        /* compiled from: ClipsUploadAction.kt */
        public static final class a implements b {
            public static final a b = new a();
        }

        /* compiled from: ClipsUploadAction.kt */
        /* renamed from: xsna.lbf$b$b, reason: collision with other inner class name */
        public static final class C3248b implements b {
            public static final C3248b b = new C3248b();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class c implements b {
            public final ClipsChoosePreviewParams b;

            public c(ClipsChoosePreviewParams clipsChoosePreviewParams) {
                this.b = clipsChoosePreviewParams;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class d implements b {
            public static final d b = new d();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class e implements b {
            public static final e b = new e();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class f implements b {
            public static final f b = new f();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class g implements b {
            public static final g b = new g();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class h implements b {
            public static final h b = new h();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class i implements b {
            public static final i b = new i();
        }
    }

    /* compiled from: ClipsUploadAction.kt */
    public interface c extends lbf {

        /* compiled from: ClipsUploadAction.kt */
        public interface a extends c {

            /* compiled from: ClipsUploadAction.kt */
            /* renamed from: xsna.lbf$c$a$a, reason: collision with other inner class name */
            public static final class C3249a implements a {
                public static final C3249a b = new C3249a();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements a {
                public static final b b = new b();
            }

            /* compiled from: ClipsUploadAction.kt */
            /* renamed from: xsna.lbf$c$a$c, reason: collision with other inner class name */
            public static final class C3250c implements a {
                public static final C3250c b = new C3250c();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class d implements a {
                public static final d b = new d();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class e implements a {
                public final ClipInvolvementActionButton<?> b;

                public e(ClipInvolvementActionButton<?> clipInvolvementActionButton) {
                    this.b = clipInvolvementActionButton;
                }
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class f implements a {
                public static final f b = new f();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class g implements a {
                public static final g b = new g();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class h implements a {
                public static final h b = new h();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class i implements a {
                public static final i b = new i();
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class b implements c {
            public static final b b = new b();
        }

        /* compiled from: ClipsUploadAction.kt */
        /* renamed from: xsna.lbf$c$c, reason: collision with other inner class name */
        public static final class C3251c implements c {
            public static final C3251c b = new C3251c();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class d implements c {
            public static final d b = new d();
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface e extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements e {
                public static final a b = new a();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements e {
                public static final b b = new b();
            }

            /* compiled from: ClipsUploadAction.kt */
            /* renamed from: xsna.lbf$c$e$c, reason: collision with other inner class name */
            public static final class C3252c implements e {
                public final List<CoOwnerItem> b;

                public C3252c(List<CoOwnerItem> list) {
                    this.b = list;
                }
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class d implements e {
                public static final d b = new d();
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface f extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements f {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    ((a) obj).getClass();
                    return epx.f(null, null);
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return gp.b(new StringBuilder("ChannelCreated(channelId="), null, ')');
                }
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements f {
                public static final b b = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1655920454;
                }

                public final String toString() {
                    return "Clicked";
                }
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface g extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements g {
                public static final a b = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1299966463;
                }

                public final String toString() {
                    return "OnUnavailableClick";
                }
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements g {
                public final Long b;

                public b(Long l) {
                    this.b = l;
                }
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class h implements c {
            public static final h b = new h();
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface i extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements i {
                public final GeoLocation b;

                public a(GeoLocation geoLocation) {
                    this.b = geoLocation;
                }
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements i {
                public static final b b = new b();
            }

            /* compiled from: ClipsUploadAction.kt */
            /* renamed from: xsna.lbf$c$i$c, reason: collision with other inner class name */
            public static final class C3253c implements i {
                public static final C3253c b = new C3253c();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class d implements i {
                public final int b;

                public d(int i) {
                    this.b = i;
                }
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class j implements c {
            public final String b;

            public j(String str) {
                this.b = str;
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface k extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements k {
                public static final a b = new a();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements k {
                public static final b b = new b();
            }

            /* compiled from: ClipsUploadAction.kt */
            /* renamed from: xsna.lbf$c$k$c, reason: collision with other inner class name */
            public static final class C3254c implements k {
                public final ClipsLinkAttachment b;

                public C3254c(ClipsLinkAttachment clipsLinkAttachment) {
                    this.b = clipsLinkAttachment;
                }
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class d implements k {
                public static final d b = new d();
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface l extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements l {
                public static final a b = new a();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements l {
                public final ArrayList b;

                public b(ArrayList arrayList) {
                    this.b = arrayList;
                }
            }

            /* compiled from: ClipsUploadAction.kt */
            /* renamed from: xsna.lbf$c$l$c, reason: collision with other inner class name */
            public static final class C3255c implements l {
                public static final C3255c b = new C3255c();
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class m implements c {
            public static final m b = new m();
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface n extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements n {
                public static final a b = new a();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements n {
                public final OrdData b;

                public b(OrdData ordData) {
                    this.b = ordData;
                }
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface o extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements o {
                public static final a b = new a();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements o {
                public static final b b = new b();
            }

            /* compiled from: ClipsUploadAction.kt */
            /* renamed from: xsna.lbf$c$o$c, reason: collision with other inner class name */
            public static final class C3256c implements o {
                public final ClipsDraftablePlaylist b;

                public C3256c(ClipsDraftablePlaylist clipsDraftablePlaylist) {
                    this.b = clipsDraftablePlaylist;
                }
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class p implements c {
            public static final p b = new p();
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class q implements c {
            public final boolean b;

            public q(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof q) && this.b == ((q) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("PostToWallOnboardingAnimationEnd(isPostToUser="), this.b, ')');
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class r implements c {
            public final boolean b;

            public r(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof r) && this.b == ((r) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("PostToWallOnboardingShowed(isPostToUser="), this.b, ')');
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface s extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements s {
                public final boolean b;

                public a() {
                    this(false);
                }

                public a(boolean z) {
                    this.b = z;
                }
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements s {
                public final PostingVisibilityMode b;

                public b(PostingVisibilityMode postingVisibilityMode) {
                    this.b = postingVisibilityMode;
                }
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class t implements c {
            public static final t b = new t();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof t);
            }

            public final int hashCode() {
                return -1696353428;
            }

            public final String toString() {
                return "RedirectBannerHidden";
            }
        }

        /* compiled from: ClipsUploadAction.kt */
        public static final class u implements c {
            public static final u b = new u();
        }

        /* compiled from: ClipsUploadAction.kt */
        public interface v extends c {

            /* compiled from: ClipsUploadAction.kt */
            public static final class a implements v {
                public static final a b = new a();
            }

            /* compiled from: ClipsUploadAction.kt */
            public static final class b implements v {
                public static final b b = new b();
            }

            /* compiled from: ClipsUploadAction.kt */
            /* renamed from: xsna.lbf$c$v$c, reason: collision with other inner class name */
            public static final class C3257c implements v {
                public final ClipsVideoAttachmentData b;

                public C3257c(ClipsVideoAttachmentData clipsVideoAttachmentData) {
                    this.b = clipsVideoAttachmentData;
                }
            }
        }
    }
}
