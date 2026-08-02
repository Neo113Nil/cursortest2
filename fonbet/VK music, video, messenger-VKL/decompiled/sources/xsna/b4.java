package xsna;

import android.view.View;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.MobileOfficialAppsSharingStat$TypeEventSource;

/* compiled from: AboutVideoAction.kt */
/* loaded from: classes2.dex */
public abstract class b4 {

    /* compiled from: AboutVideoAction.kt */
    public static final class a extends b4 {
        public static final a a = new a();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class a0 extends b4 {
        public final VideoFile a;

        public a0(VideoFile videoFile) {
            this.a = videoFile;
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class b extends b4 {
        public final Long a;

        public b(Long l) {
            this.a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            Long l = this.a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return iq.b(new StringBuilder("ArchivalContentClick(publishedDate="), this.a, ')');
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class b0 extends b4 {
        public final VideoFile a;
        public final uc b;
        public final boolean c;
        public final CommonVideoStat$TypeScreenMode d;

        public b0(VideoFile videoFile, h270 h270Var, boolean z, CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode) {
            this.a = videoFile;
            this.b = h270Var;
            this.c = z;
            this.d = commonVideoStat$TypeScreenMode;
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static abstract class c extends b4 {

        /* compiled from: AboutVideoAction.kt */
        public static final class a extends c {
            public static final a a = new a();
        }

        /* compiled from: AboutVideoAction.kt */
        public static abstract class b extends c {

            /* compiled from: AboutVideoAction.kt */
            public static final class a extends b {
                public static final a a = new a();
            }

            /* compiled from: AboutVideoAction.kt */
            /* renamed from: xsna.b4$c$b$b, reason: collision with other inner class name */
            public static final class C2584b extends b {
                public static final C2584b a = new C2584b();
            }

            /* compiled from: AboutVideoAction.kt */
            /* renamed from: xsna.b4$c$b$c, reason: collision with other inner class name */
            public static final class C2585c extends b {
                public static final C2585c a = new C2585c();
            }
        }

        /* compiled from: AboutVideoAction.kt */
        /* renamed from: xsna.b4$c$c, reason: collision with other inner class name */
        public static final class C2586c extends c {
            public static final C2586c a = new C2586c();
        }

        /* compiled from: AboutVideoAction.kt */
        public static final class d extends c {
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
                return ho8.a(new StringBuilder("OpenAnalytics(videoAnalyticsUrl="), this.a, ')');
            }
        }

        /* compiled from: AboutVideoAction.kt */
        public static final class e extends b4 {
            public final ezn a;

            public e(ezn eznVar) {
                this.a = eznVar;
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
                return "OpenDonut(donutAction=" + this.a + ')';
            }
        }

        /* compiled from: AboutVideoAction.kt */
        public static final class f extends c {
            public static final f a = new f();
        }

        /* compiled from: AboutVideoAction.kt */
        public static final class g extends c {
            public static final g a = new g();
        }

        /* compiled from: AboutVideoAction.kt */
        public static final class h extends c {
            public final String a;
            public final gzs<s3q0> b;
            public final String c;

            public h(String str, String str2, gzs gzsVar) {
                this.a = str;
                this.b = gzsVar;
                this.c = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof h)) {
                    return false;
                }
                h hVar = (h) obj;
                return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && epx.f(this.c, hVar.c);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                gzs<s3q0> gzsVar = this.b;
                int hashCode2 = (hashCode + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
                String str2 = this.c;
                return hashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UpdateSubscription(sourceScreen=");
                sb.append(this.a);
                sb.append(", onSuccess=");
                sb.append(this.b);
                sb.append(", sourceUi=");
                return ho8.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class c0 extends b4 {
        public static final c0 a = new c0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c0);
        }

        public final int hashCode() {
            return -538581576;
        }

        public final String toString() {
            return "RelatedAudioCellClick";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class d extends b4 {
        public static final d a = new d();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class d0 extends b4 {
        public static final d0 a = new d0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d0);
        }

        public final int hashCode() {
            return -1575497444;
        }

        public final String toString() {
            return "RelatedAudioRowClick";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class e extends b4 {
        public static final e a = new e();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class e0 extends b4 {
        public final VideoFile a;

        public e0(VideoFile videoFile) {
            this.a = videoFile;
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static abstract class f extends b4 {

        /* compiled from: AboutVideoAction.kt */
        public static final class a extends f {
            public final rz00 a;

            public a(rz00 rz00Var) {
                this.a = rz00Var;
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
                return "OpenGood(params=" + this.a + ')';
            }
        }

        /* compiled from: AboutVideoAction.kt */
        public static final class b extends f {
            public final rz00 a;
            public final int b;

            public b(rz00 rz00Var, int i) {
                this.a = rz00Var;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && this.b == bVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("TrackShowGood(params=");
                sb.append(this.a);
                sb.append(", position=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class f0 extends b4 {
        public final MobileOfficialAppsSharingStat$TypeEventSource a;

        public f0(MobileOfficialAppsSharingStat$TypeEventSource mobileOfficialAppsSharingStat$TypeEventSource) {
            this.a = mobileOfficialAppsSharingStat$TypeEventSource;
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class g extends b4 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -764446575;
        }

        public final String toString() {
            return "HideBanner";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class g0 extends b4 {
        public static final g0 a = new g0();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class h extends b4 {
        public final boolean a;

        public h(boolean z) {
            this.a = z;
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class h0 extends b4 {
        public final long a;

        public h0(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && this.a == ((h0) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("SeekTo(position="));
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class i extends b4 {
        public static final i a = new i();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class i0 extends b4 {
        public final int a;
        public final int b;

        public i0(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i0)) {
                return false;
            }
            i0 i0Var = (i0) obj;
            return this.a == i0Var.a && this.b == i0Var.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowDialog(titleId=");
            sb.append(this.a);
            sb.append(", descriptionId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class j extends b4 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1179790717;
        }

        public final String toString() {
            return "MarkBannerAsShown";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class j0 extends b4 {
        public static final j0 a = new j0();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class k extends b4 {
        public final VideoFile a;
        public final VideoScreenMode b;

        public k(VideoFile videoFile, VideoScreenMode videoScreenMode) {
            this.a = videoFile;
            this.b = videoScreenMode;
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class k0 extends b4 {
        public final VideoFile a;

        public k0(VideoFile videoFile) {
            this.a = videoFile;
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class l extends b4 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            ((l) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OnAdBannerAdChoiceClicked(adChoice=null)";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class l0 extends b4 {
        public final boolean a;

        public l0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l0) && this.a == ((l0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("UpdateSubscriptionSucceed(newSubscribeStatus="), this.a, ')');
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class m extends b4 {
        public static final m a = new m();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -832032458;
        }

        public final String toString() {
            return "OnAdBannerClicked";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class m0 extends b4 {
        public static final m0 a = new m0();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class n extends b4 {
        public static final n a = new n();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return -2013932704;
        }

        public final String toString() {
            return "OnAdBannerCloseClicked";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class o extends b4 {
        public static final o a = new o();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof o);
        }

        public final int hashCode() {
            return 778476375;
        }

        public final String toString() {
            return "OnAdBannerMenuClicked";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class p extends b4 {
        public final DonutVideoAction a;

        public p(DonutVideoAction donutVideoAction) {
            this.a = donutVideoAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && epx.f(this.a, ((p) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnDonutBadgeClicked(donutAction=" + this.a + ')';
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class q extends b4 {
        public static final q a = new q();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1213952445;
        }

        public final String toString() {
            return "OnOverlayCloseClicked";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class r extends b4 {
        public final String a;

        public r(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && epx.f(this.a, ((r) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnTrapBannerClicked(activationUrl="), this.a, ')');
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class s extends b4 {
        public static final s a = new s();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof s);
        }

        public final int hashCode() {
            return -1274547350;
        }

        public final String toString() {
            return "OnTrapBannerCloseClicked";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class t extends b4 {
        public static final t a = new t();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class u extends b4 {
        public final VideoFile a;

        public u(VideoFile videoFile) {
            this.a = videoFile;
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class v extends b4 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof v)) {
                return false;
            }
            ((v) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OpenCategory(categoryId=null)";
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class w extends b4 {
        public static final w a = new w();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class x extends b4 {
        public final View a;

        public x(View view) {
            this.a = view;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof x) && epx.f(this.a, ((x) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return br.b(new StringBuilder("OpenEpisodes(view="), this.a, ')');
        }
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class y extends b4 {
        public static final y a = new y();
    }

    /* compiled from: AboutVideoAction.kt */
    public static final class z extends b4 {
        public final VideoFile a;
        public final uc b;
        public final CommonVideoStat$TypeScreenMode c;

        public z(VideoFile videoFile, uc ucVar, CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode) {
            this.a = videoFile;
            this.b = ucVar;
            this.c = commonVideoStat$TypeScreenMode;
        }
    }
}
