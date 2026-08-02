package xsna;

import com.vk.clips.attachments.api.publish.cta.ClipInvolvementActionButton;
import com.vk.clips.upload.vk.ui.api.ClipsUploadUiVkNavigator;
import com.vk.clips.upload.vk.ui.impl.fragment.entity.params.ClipsUploadDataInternal;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.common.id.UserId;
import com.vk.dto.posting.PostingVisibilityMode;
import java.util.List;
import java.util.Set;
import xsna.ln50;

/* compiled from: ClipsUploadTask.kt */
/* loaded from: classes17.dex */
public interface mjf extends hn50<Object> {

    /* compiled from: ClipsUploadTask.kt */
    public interface a extends mjf {

        /* compiled from: ClipsUploadTask.kt */
        /* renamed from: xsna.mjf$a$a, reason: collision with other inner class name */
        public static final class C3346a implements a {
            public final UserId b;

            public C3346a(UserId userId) {
                this.b = userId;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3346a) && epx.f(this.b, ((C3346a) obj).b);
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return pjf.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("ChannelCreated(channelId="), this.b, ')');
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class b implements a {
            public static final b b = new b();

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return vjf.a;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class c implements a {
            public final UserId b;

            public c(UserId userId) {
                this.b = userId;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return ikf.a;
            }

            public final int hashCode() {
                UserId userId = this.b;
                if (userId == null) {
                    return 0;
                }
                return Long.hashCode(userId.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("LoadLinksAvailabilityForUser(groupId="), this.b, ')');
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class d implements a {
            public static final d b = new d();
            public static final wjf c = wjf.a;

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final Object getId() {
                return c;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class e implements a {
            public static final e b = new e();
            public static final xjf c = xjf.a;

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final Object getId() {
                return c;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class f implements a {
            public static final f b = new f();

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return zjf.a;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class g implements a {
            public static final g b = new g();

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return akf.a;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class h implements a {
            public static final h b = new h();
            public static final bkf c = bkf.a;

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final Object getId() {
                return c;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class i implements a {
            public final List<ClipsVideoItemLocation> b;

            public i(List<ClipsVideoItemLocation> list) {
                this.b = list;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return fkf.a;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("LoadSuggestedGeolocations(videoLocations="), this.b);
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class j implements a {
            public static final j b = new j();

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return yjf.a;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class k implements a {
            public static final k b = new k();

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return gkf.a;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class l implements a {
            public static final l b = new l();
            public static final hkf c = hkf.a;

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final Object getId() {
                return c;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class m implements a {
            public final UserId b;

            public m(UserId userId) {
                this.b = userId;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && epx.f(this.b, ((m) obj).b);
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return qjf.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("PreselectCta(groupId="), this.b, ')');
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class n implements a {
            public final UserId b;

            public n(UserId userId) {
                this.b = userId;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && epx.f(this.b, ((n) obj).b);
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return ckf.a;
            }

            public final int hashCode() {
                return Long.hashCode(this.b.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("RefreshGroupClosedStatus(groupId="), this.b, ')');
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class o implements a {
            public final ClipsUploadDataInternal b;
            public final UserId c;

            public o(ClipsUploadDataInternal clipsUploadDataInternal, UserId userId) {
                this.b = clipsUploadDataInternal;
                this.c = userId;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof o)) {
                    return false;
                }
                o oVar = (o) obj;
                return epx.f(this.b, oVar.b) && epx.f(this.c, oVar.c);
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return ujf.a;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                UserId userId = this.c;
                return hashCode + (userId == null ? 0 : Long.hashCode(userId.b));
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StartInitialStateLoading(uploadData=");
                sb.append(this.b);
                sb.append(", pickedAuthor=");
                return gp.b(sb, this.c, ')');
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class p implements a {
            public final PostingVisibilityMode b;

            public p(PostingVisibilityMode postingVisibilityMode) {
                this.b = postingVisibilityMode;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof p) && this.b == ((p) obj).b;
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return jkf.a;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "UpdateClipPrivacy(newMode=" + this.b + ')';
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class q implements a {
            public static final q b = new q();
            public static final lkf c = lkf.a;

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final Object getId() {
                return c;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class r implements a {
            public final UserId b;
            public final ClipInvolvementActionButton<?> c;

            public r(UserId userId, ClipInvolvementActionButton<?> clipInvolvementActionButton) {
                this.b = userId;
                this.c = clipInvolvementActionButton;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof r)) {
                    return false;
                }
                r rVar = (r) obj;
                return epx.f(this.b, rVar.b) && epx.f(this.c, rVar.c);
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return rjf.a;
            }

            public final int hashCode() {
                return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
            }

            public final String toString() {
                return "ValidateCta(groupId=" + this.b + ", currentCta=" + this.c + ')';
            }
        }
    }

    /* compiled from: ClipsUploadTask.kt */
    public interface b extends mjf {

        /* compiled from: ClipsUploadTask.kt */
        public static final class a implements b {
            public static final a b = new a();

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return njf.a;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        /* renamed from: xsna.mjf$b$b, reason: collision with other inner class name */
        public static final class C3347b implements b {
            public static final C3347b b = new C3347b();

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return sjf.a;
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class c implements b {
            public static final c b = new c();

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return dkf.a;
            }
        }
    }

    /* compiled from: ClipsUploadTask.kt */
    public static final class c implements mjf {
        public final ClipsUploadUiVkNavigator.ClipUploadDataCompact b;
        public final Set<Object> c;

        public c(ClipsUploadUiVkNavigator.ClipUploadDataCompact clipUploadDataCompact, Set<Object> set) {
            this.b = clipUploadDataCompact;
            this.c = set;
        }

        @Override // xsna.hn50
        public final ln50<Object> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        @Override // xsna.hn50
        public final /* bridge */ /* synthetic */ Object getId() {
            return tjf.a;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialLoadCompact(inputParams=");
            sb.append(this.b);
            sb.append(", enabledFeatures=");
            return ur.c(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsUploadTask.kt */
    public static final class d implements mjf {
        public final ClipsUploadUiVkNavigator.ClipUploadDataFull b;
        public final Set<Object> c;

        public d(ClipsUploadUiVkNavigator.ClipUploadDataFull clipUploadDataFull, Set<Object> set) {
            this.b = clipUploadDataFull;
            this.c = set;
        }

        @Override // xsna.hn50
        public final ln50<Object> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        @Override // xsna.hn50
        public final /* bridge */ /* synthetic */ Object getId() {
            return tjf.a;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InitialLoadFull(inputParams=");
            sb.append(this.b);
            sb.append(", enabledFeatures=");
            return ur.c(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsUploadTask.kt */
    public interface e extends mjf {

        /* compiled from: ClipsUploadTask.kt */
        public static final class a implements e {
            public final String b;

            public a(String str) {
                this.b = str;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return ojf.a;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("CancelUpload(reason="), this.b, ')');
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class b implements e {
            public final ClipsUploadDataInternal b;

            public b(ClipsUploadDataInternal clipsUploadDataInternal) {
                this.b = clipsUploadDataInternal;
            }

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            @Override // xsna.hn50
            public final /* bridge */ /* synthetic */ Object getId() {
                return ekf.a;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "PreStartClipUpload(uploadData=" + this.b + ')';
            }
        }

        /* compiled from: ClipsUploadTask.kt */
        public static final class c implements e {
            public static final c b = new c();
            public static final kkf c = kkf.a;

            @Override // xsna.hn50
            public final ln50<Object> d() {
                return ln50.a.a;
            }

            @Override // xsna.hn50
            public final Object getId() {
                return c;
            }
        }
    }
}
