package xsna;

import com.vk.dto.video.VideoNotificationsStatus;
import java.util.ArrayList;

/* compiled from: VideoProfileHeaderViewState.kt */
/* loaded from: classes6.dex */
public abstract class f8t0 implements ao50 {

    /* compiled from: VideoProfileHeaderViewState.kt */
    public static final class a extends f8t0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -819452780;
        }

        public final String toString() {
            return "Hidden";
        }
    }

    /* compiled from: VideoProfileHeaderViewState.kt */
    public static final class b extends f8t0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -209176686;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: VideoProfileHeaderViewState.kt */
    public static final class c extends f8t0 {
        public final qlw a;
        public final k b;
        public final g c;
        public final j.a d;
        public final f e;
        public final h f;
        public final l g;
        public final b h;
        public final a i;
        public final i j;
        public final e k;
        public final d l;
        public final InterfaceC2856c m;
        public final boolean n;
        public final boolean o;
        public final boolean p;

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface a {

            /* compiled from: VideoProfileHeaderViewState.kt */
            /* renamed from: xsna.f8t0$c$a$a, reason: collision with other inner class name */
            public static final class C2853a implements a {
                public static final C2853a a = new C2853a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2853a);
                }

                public final int hashCode() {
                    return 1195107688;
                }

                public final String toString() {
                    return "Age16";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class b implements a {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1195107690;
                }

                public final String toString() {
                    return "Age18";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            /* renamed from: xsna.f8t0$c$a$c, reason: collision with other inner class name */
            public static final class C2854c implements a {
                public static final C2854c a = new C2854c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2854c);
                }

                public final int hashCode() {
                    return -1207978828;
                }

                public final String toString() {
                    return "None";
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface b {

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class a implements b {
                public final boolean a;

                public a(boolean z) {
                    this.a = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && this.a == ((a) obj).a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.a);
                }

                public final String toString() {
                    return defpackage.q0.a(new StringBuilder("Can(isChecked="), this.a, ')');
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            /* renamed from: xsna.f8t0$c$b$b, reason: collision with other inner class name */
            public static final class C2855b implements b {
                public static final C2855b a = new C2855b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2855b);
                }

                public final int hashCode() {
                    return 2134710103;
                }

                public final String toString() {
                    return "Cant";
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        /* renamed from: xsna.f8t0$c$c, reason: collision with other inner class name */
        public interface InterfaceC2856c {

            /* compiled from: VideoProfileHeaderViewState.kt */
            /* renamed from: xsna.f8t0$c$c$a */
            public static final class a implements InterfaceC2856c {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1888565385;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            /* renamed from: xsna.f8t0$c$c$b */
            public static final class b implements InterfaceC2856c {
                public final int a;

                public b(int i) {
                    this.a = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.a == ((b) obj).a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("Visible(progress="), this.a, ')');
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface d {

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class a implements d {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -945782789;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class b implements d {
                public final ArrayList a;

                public b(ArrayList arrayList) {
                    this.a = arrayList;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.a.equals(((b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("Visible(visibleItems="), this.a);
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public static final class e {
            public final pyn a;

            public e(pyn pynVar) {
                this.a = pynVar;
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
                return "DonutChannelButtonState(state=" + this.a + ')';
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface f {

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class a implements f {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -346789657;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class b implements f {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1553611990;
                }

                public final String toString() {
                    return "Visible";
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface g {

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class a implements g {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -1607603298;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class b implements g {
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
                    return ho8.a(new StringBuilder("Visible(text="), this.a, ')');
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface h {

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class a implements h {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 1401807179;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class b implements h {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 1531363398;
                }

                public final String toString() {
                    return "Visible";
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface i {

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class a implements i {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -185777550;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class b implements i {
                public final VideoNotificationsStatus a;
                public final boolean b;
                public final boolean c;

                public b(VideoNotificationsStatus videoNotificationsStatus, boolean z, boolean z2) {
                    this.a = videoNotificationsStatus;
                    this.b = z;
                    this.c = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
                }

                public final int hashCode() {
                    VideoNotificationsStatus videoNotificationsStatus = this.a;
                    return Boolean.hashCode(this.c) + qoy.b((videoNotificationsStatus == null ? 0 : videoNotificationsStatus.hashCode()) * 31, 31, this.b);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Visible(typeNotification=");
                    sb.append(this.a);
                    sb.append(", isSubscribed=");
                    sb.append(this.b);
                    sb.append(", isEnabled=");
                    return defpackage.q0.a(sb, this.c, ')');
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface j {

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class a implements j {
                public final String a;

                public a(String str) {
                    this.a = str;
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
                    return ho8.a(new StringBuilder("AboutChannel(text="), this.a, ')');
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class b implements j {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return 921782074;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            /* renamed from: xsna.f8t0$c$j$c, reason: collision with other inner class name */
            public static final class C2857c implements j {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2857c)) {
                        return false;
                    }
                    ((C2857c) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "Visible(text=null, isEditable=false)";
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface k {

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class a implements k {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return -538650322;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class b implements k {
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
                    return ho8.a(new StringBuilder("Visible(text="), this.a, ')');
                }
            }
        }

        /* compiled from: VideoProfileHeaderViewState.kt */
        public interface l {

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class a implements l {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 123768226;
                }

                public final String toString() {
                    return "Gone";
                }
            }

            /* compiled from: VideoProfileHeaderViewState.kt */
            public static final class b implements l {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1936973681;
                }

                public final String toString() {
                    return "Visible";
                }
            }
        }

        public c(qlw qlwVar, k kVar, g gVar, j.a aVar, f fVar, h hVar, l lVar, b bVar, a aVar2, i iVar, e eVar, d dVar, InterfaceC2856c interfaceC2856c, boolean z, boolean z2, boolean z3) {
            this.a = qlwVar;
            this.b = kVar;
            this.c = gVar;
            this.d = aVar;
            this.e = fVar;
            this.f = hVar;
            this.g = lVar;
            this.h = bVar;
            this.i = aVar2;
            this.j = iVar;
            this.k = eVar;
            this.l = dVar;
            this.m = interfaceC2856c;
            this.n = z;
            this.o = z2;
            this.p = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h) && epx.f(this.i, cVar.i) && epx.f(this.j, cVar.j) && epx.f(this.k, cVar.k) && epx.f(this.l, cVar.l) && epx.f(this.m, cVar.m) && this.n == cVar.n && this.o == cVar.o && this.p == cVar.p;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.p) + qoy.b(qoy.b((this.m.hashCode() + ((this.l.hashCode() + ((this.k.a.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + urd0.a((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.n), 31, this.o);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Visible(avatar=");
            sb.append(this.a);
            sb.append(", titleState=");
            sb.append(this.b);
            sb.append(", intertitleState=");
            sb.append(this.c);
            sb.append(", subtitleState=");
            sb.append(this.d);
            sb.append(", editProfileButtonState=");
            sb.append(this.e);
            sb.append(", openAuthorCabinetButtonState=");
            sb.append(this.f);
            sb.append(", uploadVideoButtonState=");
            sb.append(this.g);
            sb.append(", changeOwnerIconState=");
            sb.append(this.h);
            sb.append(", ageMarkIconState=");
            sb.append(this.i);
            sb.append(", subscribeButtonState=");
            sb.append(this.j);
            sb.append(", donutButtonState=");
            sb.append(this.k);
            sb.append(", creatorOnboardingItemsState=");
            sb.append(this.l);
            sb.append(", creatorOnboardingCounterState=");
            sb.append(this.m);
            sb.append(", isVerified=");
            sb.append(this.n);
            sb.append(", isAPlusMarked=");
            sb.append(this.o);
            sb.append(", isLive=");
            return defpackage.q0.a(sb, this.p, ')');
        }
    }
}
