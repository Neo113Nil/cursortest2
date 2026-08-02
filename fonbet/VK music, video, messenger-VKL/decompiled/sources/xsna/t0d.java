package xsna;

import android.view.MotionEvent;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipItemEvent.kt */
/* loaded from: classes17.dex */
public interface t0d {

    /* compiled from: ClipItemEvent.kt */
    public interface a extends t0d {

        /* compiled from: ClipItemEvent.kt */
        /* renamed from: xsna.t0d$a$a, reason: collision with other inner class name */
        public static final class C3711a implements a {
            public final SdkClipVideoFile a;
            public final int b;
            public final Integer c;
            public final UserId d;

            public C3711a(SdkClipVideoFile sdkClipVideoFile, int i, Integer num, UserId userId) {
                this.a = sdkClipVideoFile;
                this.b = i;
                this.c = num;
                this.d = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3711a)) {
                    return false;
                }
                C3711a c3711a = (C3711a) obj;
                return epx.f(this.a, c3711a.a) && this.b == c3711a.b && epx.f(this.c, c3711a.c) && epx.f(this.d, c3711a.d);
            }

            public final int hashCode() {
                int a = shy.a(this.b, this.a.hashCode() * 31, 31);
                Integer num = this.c;
                return Long.hashCode(this.d.b) + ((a + (num == null ? 0 : num.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CommentClicked(clip=");
                sb.append(this.a);
                sb.append(", id=");
                sb.append(this.b);
                sb.append(", parentCommentId=");
                sb.append(this.c);
                sb.append(", userId=");
                return gp.b(sb, this.d, ')');
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class b implements a {
            public final SdkClipVideoFile a;

            public b(SdkClipVideoFile sdkClipVideoFile) {
                this.a = sdkClipVideoFile;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return cq.d(new StringBuilder("LikeClicked(clip="), this.a, ')');
            }
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class b implements t0d {
        public final SdkClipVideoFile a;

        public b(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("AddToFavorites(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class c implements t0d {
        public final SdkClipVideoFile a;

        public c(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("Bind(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public interface d extends t0d {

        /* compiled from: ClipItemEvent.kt */
        public static final class a implements d {
            public final kih0 a;

            public a(kih0 kih0Var) {
                this.a = kih0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // xsna.t0d.d
            public final kih0 j() {
                return this.a;
            }

            public final String toString() {
                return "Disable(autoPlay=" + this.a + ')';
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class b implements d {
            public final kih0 a;

            public b(kih0 kih0Var) {
                this.a = kih0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            @Override // xsna.t0d.d
            public final kih0 j() {
                return this.a;
            }

            public final String toString() {
                return "Enable(autoPlay=" + this.a + ')';
            }
        }

        kih0 j();
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class e implements t0d {
        public final SdkClipVideoFile a;

        public e(SdkClipVideoFile sdkClipVideoFile) {
            this.a = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cq.d(new StringBuilder("HandleShareClicked(clip="), this.a, ')');
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class f implements t0d {
        public final SdkClipVideoFile a;
        public final MotionEvent b;
        public final kih0 c;
        public final y0r d;

        public f(SdkClipVideoFile sdkClipVideoFile, MotionEvent motionEvent, kih0 kih0Var, y0r y0rVar) {
            this.a = sdkClipVideoFile;
            this.b = motionEvent;
            this.c = kih0Var;
            this.d = y0rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && epx.f(this.c, fVar.c) && epx.f(this.d, fVar.d);
        }

        public final int hashCode() {
            int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
            y0r y0rVar = this.d;
            return hashCode + (y0rVar == null ? 0 : y0rVar.hashCode());
        }

        public final String toString() {
            return "HandleSingleTap(clip=" + this.a + ", motionEvent=" + this.b + ", autoPlay=" + this.c + ", cacheInfo=" + this.d + ')';
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static abstract class g implements t0d {

        /* compiled from: ClipItemEvent.kt */
        public static final class a extends g {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2012844817;
            }

            public final String toString() {
                return "OnLostNetwork";
            }
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class h implements t0d {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1411315940;
        }

        public final String toString() {
            return "InterceptLinkCommunityWithSubscribeClick";
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public interface i extends t0d {

        /* compiled from: ClipItemEvent.kt */
        public static final class a implements i {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 990878370;
            }

            public final String toString() {
                return "ClearStorage";
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class b implements i {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("RemoveBanner(uniqueKey="), this.a, ')');
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class c implements i {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("RestoreBanner(uniqueKey="), this.a, ')');
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class d implements i {
            public final String a;

            public d(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("SaveBanner(uniqueKey="), this.a, ')');
            }
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class j implements t0d {
        public final kih0 a;

        public j(kih0 kih0Var) {
            this.a = kih0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ResetErrorState(autoPlay=" + this.a + ')';
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public interface k extends t0d {

        /* compiled from: ClipItemEvent.kt */
        public static final class a implements k {
        }

        /* compiled from: ClipItemEvent.kt */
        public interface b extends k {

            /* compiled from: ClipItemEvent.kt */
            public static final class a implements b {
                public final SdkClipVideoFile a;

                public a(SdkClipVideoFile sdkClipVideoFile) {
                    this.a = sdkClipVideoFile;
                }

                @Override // xsna.t0d.k.b
                public final SdkClipVideoFile a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return cq.d(new StringBuilder("Edit(promoClip="), this.a, ')');
                }
            }

            /* compiled from: ClipItemEvent.kt */
            /* renamed from: xsna.t0d$k$b$b, reason: collision with other inner class name */
            public static final class C3712b implements b {
                public final SdkClipVideoFile a;

                public C3712b(SdkClipVideoFile sdkClipVideoFile) {
                    this.a = sdkClipVideoFile;
                }

                @Override // xsna.t0d.k.b
                public final SdkClipVideoFile a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3712b) && epx.f(this.a, ((C3712b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return cq.d(new StringBuilder("EditPrivacy(promoClip="), this.a, ')');
                }
            }

            /* compiled from: ClipItemEvent.kt */
            public static final class c implements b {
                public final SdkClipVideoFile a;

                public c(SdkClipVideoFile sdkClipVideoFile) {
                    this.a = sdkClipVideoFile;
                }

                @Override // xsna.t0d.k.b
                public final SdkClipVideoFile a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return cq.d(new StringBuilder("Remove(promoClip="), this.a, ')');
                }
            }

            /* compiled from: ClipItemEvent.kt */
            public static final class d implements b {
                public final SdkClipVideoFile a;

                public d(SdkClipVideoFile sdkClipVideoFile) {
                    this.a = sdkClipVideoFile;
                }

                @Override // xsna.t0d.k.b
                public final SdkClipVideoFile a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return cq.d(new StringBuilder("RemoveCommunity(promoClip="), this.a, ')');
                }
            }

            SdkClipVideoFile a();
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class c implements k {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 351368439;
            }

            public final String toString() {
                return "FullVideoLoadError";
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class d implements k {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 599432298;
            }

            public final String toString() {
                return "OnLostNetwork";
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public interface e extends k {

            /* compiled from: ClipItemEvent.kt */
            public static final class a implements e {
                public final SdkClipVideoFile a;

                public a(SdkClipVideoFile sdkClipVideoFile) {
                    this.a = sdkClipVideoFile;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return cq.d(new StringBuilder("EditPrivacyDisabledByPromo(promoClip="), this.a, ')');
                }
            }

            /* compiled from: ClipItemEvent.kt */
            public static final class b implements e {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -329013919;
                }

                public final String toString() {
                    return "Error";
                }
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class f implements k {
            public final UserId a;

            public f(UserId userId) {
                this.a = userId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            public final int hashCode() {
                return Long.hashCode(this.a.b);
            }

            public final String toString() {
                return gp.b(new StringBuilder("SubscriptionSuccess(ownerId="), this.a, ')');
            }
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class l implements t0d {
        public static final l a = new l();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 1890864195;
        }

        public final String toString() {
            return "SpawnStickerOnLike";
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public interface m extends t0d {

        /* compiled from: ClipItemEvent.kt */
        public static final class a implements m {
            public final nlh0 a;
            public final UserId b;
            public final mre c;

            public a(nlh0 nlh0Var, UserId userId, mre mreVar) {
                this.a = nlh0Var;
                this.b = userId;
                this.c = mreVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b.b);
            }

            public final String toString() {
                return "Coauthor(controller=" + this.a + ", authorId=" + this.b + ", onSuccess=" + this.c + ')';
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class b implements m {
            public final nlh0 a;
            public final izs<SdkClipVideoFile, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(nlh0 nlh0Var, izs<? super SdkClipVideoFile, s3q0> izsVar) {
                this.a = nlh0Var;
                this.b = izsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                izs<SdkClipVideoFile, s3q0> izsVar = this.b;
                return hashCode + (izsVar == null ? 0 : izsVar.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Owner(controller=");
                sb.append(this.a);
                sb.append(", onSuccess=");
                return up.c(sb, this.b, ')');
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class c implements m {
            public final nlh0 a;

            public c(nlh0 nlh0Var) {
                this.a = nlh0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "OwnerFromActionButton(controller=" + this.a + ')';
            }
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class n implements t0d {
        public final boolean a;
        public final SdkClipVideoFile b;

        public n(SdkClipVideoFile sdkClipVideoFile, boolean z) {
            this.a = z;
            this.b = sdkClipVideoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.a == nVar.a && this.b.equals(nVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToggleCinemaMode(enable=");
            sb.append(this.a);
            sb.append(", clip=");
            return cq.d(sb, this.b, ')');
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class o implements t0d {
        public final SdkClipVideoFile a;
        public final kih0 b;
        public final y0r c;

        public o(SdkClipVideoFile sdkClipVideoFile, kih0 kih0Var, y0r y0rVar) {
            this.a = sdkClipVideoFile;
            this.b = kih0Var;
            this.c = y0rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.a, oVar.a) && epx.f(this.b, oVar.b) && epx.f(this.c, oVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            y0r y0rVar = this.c;
            return hashCode + (y0rVar == null ? 0 : y0rVar.hashCode());
        }

        public final String toString() {
            return "ToggleMute(clip=" + this.a + ", autoPlay=" + this.b + ", cacheInfo=" + this.c + ')';
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public static final class p implements t0d {
        public final kih0 a;
        public final y0r b;

        public p(kih0 kih0Var, y0r y0rVar) {
            this.a = kih0Var;
            this.b = y0rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.a, pVar.a) && epx.f(this.b, pVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            y0r y0rVar = this.b;
            return hashCode + (y0rVar == null ? 0 : y0rVar.hashCode());
        }

        public final String toString() {
            return "TogglePlay(autoPlay=" + this.a + ", cacheInfo=" + this.b + ')';
        }
    }

    /* compiled from: ClipItemEvent.kt */
    public interface q extends t0d {

        /* compiled from: ClipItemEvent.kt */
        public static final class a implements q {
            public final nlh0 a;
            public final UserId b;
            public final k7f c;

            public a(nlh0 nlh0Var, UserId userId, k7f k7fVar) {
                this.a = nlh0Var;
                this.b = userId;
                this.c = k7fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + bh10.a(this.a.hashCode() * 31, 31, this.b.b);
            }

            public final String toString() {
                return "Coauthor(controller=" + this.a + ", authorId=" + this.b + ", onSuccess=" + this.c + ')';
            }
        }

        /* compiled from: ClipItemEvent.kt */
        public static final class b implements q {
            public final nlh0 a;
            public final izs<SdkClipVideoFile, s3q0> b;

            /* JADX WARN: Multi-variable type inference failed */
            public b(nlh0 nlh0Var, izs<? super SdkClipVideoFile, s3q0> izsVar) {
                this.a = nlh0Var;
                this.b = izsVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                izs<SdkClipVideoFile, s3q0> izsVar = this.b;
                return hashCode + (izsVar == null ? 0 : izsVar.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Owner(controller=");
                sb.append(this.a);
                sb.append(", onSuccess=");
                return up.c(sb, this.b, ')');
            }
        }
    }
}
