package xsna;

import androidx.fragment.app.Fragment;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: VoipCallMainMenuState.kt */
/* loaded from: classes7.dex */
public interface jhw0 {

    /* compiled from: VoipCallMainMenuState.kt */
    public interface a {

        /* compiled from: VoipCallMainMenuState.kt */
        /* renamed from: xsna.jhw0$a$a, reason: collision with other inner class name */
        public static final class C3120a implements a {
            public final Fragment a;

            public C3120a(Fragment fragment) {
                this.a = fragment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3120a) && epx.f(this.a, ((C3120a) obj).a);
            }

            @Override // xsna.jhw0.a
            public final Fragment getContent() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Dismounting(content=" + this.a + ')';
            }
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class b implements a {
            public final Fragment a;

            public b(Fragment fragment) {
                this.a = fragment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            @Override // xsna.jhw0.a
            public final Fragment getContent() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Mounted(content=" + this.a + ')';
            }
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class c implements a {
            public final Fragment a;

            public c(Fragment fragment) {
                this.a = fragment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            @Override // xsna.jhw0.a
            public final Fragment getContent() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Mounting(content=" + this.a + ')';
            }
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class d implements a {
            public final Fragment a;
            public final VoipMainMenuFragmentBase b;
            public final boolean c;

            public d(Fragment fragment, VoipMainMenuFragmentBase voipMainMenuFragmentBase, boolean z) {
                this.a = fragment;
                this.b = voipMainMenuFragmentBase;
                this.c = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && this.b.equals(dVar.b) && this.c == dVar.c;
            }

            @Override // xsna.jhw0.a
            public final Fragment getContent() {
                return this.a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Replacing(content=");
                sb.append(this.a);
                sb.append(", child=");
                sb.append(this.b);
                sb.append(", isGoingBack=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class e implements a {
            public final Fragment a;
            public final boolean b;

            public e(Fragment fragment, boolean z) {
                this.a = fragment;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return epx.f(this.a, eVar.a) && this.b == eVar.b;
            }

            @Override // xsna.jhw0.a
            public final Fragment getContent() {
                return this.a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Running(content=");
                sb.append(this.a);
                sb.append(", isRoot=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class f implements a {
            public final Fragment a;

            public f(Fragment fragment) {
                this.a = fragment;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
            }

            @Override // xsna.jhw0.a
            public final Fragment getContent() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Starting(content=" + this.a + ')';
            }
        }

        Fragment getContent();
    }

    /* compiled from: VoipCallMainMenuState.kt */
    public static final class b implements jhw0 {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final f d;
        public final a e;
        public final d f;
        public final List<String> g;
        public final gzs<Fragment> h;

        /* JADX WARN: Multi-variable type inference failed */
        public b(boolean z, boolean z2, boolean z3, f fVar, a aVar, d dVar, List<String> list, gzs<? extends Fragment> gzsVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = fVar;
            this.e = aVar;
            this.f = dVar;
            this.g = list;
            this.h = gzsVar;
        }

        public static b e(b bVar, boolean z, boolean z2, f fVar, a aVar, d dVar, List list, int i) {
            boolean z3 = (i & 1) != 0 ? bVar.a : true;
            if ((i & 2) != 0) {
                z = bVar.b;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                z2 = bVar.c;
            }
            boolean z5 = z2;
            if ((i & 8) != 0) {
                fVar = bVar.d;
            }
            f fVar2 = fVar;
            if ((i & 16) != 0) {
                aVar = bVar.e;
            }
            a aVar2 = aVar;
            if ((i & 32) != 0) {
                dVar = bVar.f;
            }
            d dVar2 = dVar;
            List list2 = (i & 64) != 0 ? bVar.g : list;
            gzs<Fragment> gzsVar = bVar.h;
            bVar.getClass();
            return new b(z3, z4, z5, fVar2, aVar2, dVar2, list2, gzsVar);
        }

        @Override // xsna.jhw0
        public final List<String> a() {
            return this.g;
        }

        @Override // xsna.jhw0
        public final gzs<Fragment> b() {
            return this.h;
        }

        @Override // xsna.jhw0
        public final f c() {
            return this.d;
        }

        @Override // xsna.jhw0
        public final boolean d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + fw3.a((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31, 31, this.g);
        }

        @Override // xsna.jhw0
        public final boolean isEnabled() {
            return this.c;
        }

        @Override // xsna.jhw0
        public final boolean isVisible() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GotContent(hasPermissions=");
            sb.append(this.a);
            sb.append(", isVisible=");
            sb.append(this.b);
            sb.append(", isEnabled=");
            sb.append(this.c);
            sb.append(", sliderState=");
            sb.append(this.d);
            sb.append(", contentState=");
            sb.append(this.e);
            sb.append(", onboardingState=");
            sb.append(this.f);
            sb.append(", pendingOnboardingRequests=");
            sb.append(this.g);
            sb.append(", createFragmentFactory=");
            return uf3.d(sb, this.h, ')');
        }
    }

    /* compiled from: VoipCallMainMenuState.kt */
    public static final class c implements jhw0 {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final f d;
        public final List<String> e;
        public final gzs<Fragment> f;

        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z, boolean z2, boolean z3, f fVar, List<String> list, gzs<? extends Fragment> gzsVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = fVar;
            this.e = list;
            this.f = gzsVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static c e(c cVar, boolean z, boolean z2, f fVar, ArrayList arrayList, int i) {
            boolean z3 = (i & 1) != 0 ? cVar.a : true;
            if ((i & 2) != 0) {
                z = cVar.b;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                z2 = cVar.c;
            }
            boolean z5 = z2;
            if ((i & 8) != 0) {
                fVar = cVar.d;
            }
            f fVar2 = fVar;
            List list = arrayList;
            if ((i & 16) != 0) {
                list = cVar.e;
            }
            gzs<Fragment> gzsVar = cVar.f;
            cVar.getClass();
            return new c(z3, z4, z5, fVar2, list, gzsVar);
        }

        @Override // xsna.jhw0
        public final List<String> a() {
            return this.e;
        }

        @Override // xsna.jhw0
        public final gzs<Fragment> b() {
            return this.f;
        }

        @Override // xsna.jhw0
        public final f c() {
            return this.d;
        }

        @Override // xsna.jhw0
        public final boolean d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + fw3.a((this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        }

        @Override // xsna.jhw0
        public final boolean isEnabled() {
            return this.c;
        }

        @Override // xsna.jhw0
        public final boolean isVisible() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NoContent(hasPermissions=");
            sb.append(this.a);
            sb.append(", isVisible=");
            sb.append(this.b);
            sb.append(", isEnabled=");
            sb.append(this.c);
            sb.append(", sliderState=");
            sb.append(this.d);
            sb.append(", pendingOnboardingRequests=");
            sb.append(this.e);
            sb.append(", createFragmentFactory=");
            return uf3.d(sb, this.f, ')');
        }
    }

    /* compiled from: VoipCallMainMenuState.kt */
    public interface d {

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class a implements d {
            public static final a a = new a();
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class b implements d {
            public static final b a = new b();
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class c implements d {
            public static final c a = new c();
        }

        /* compiled from: VoipCallMainMenuState.kt */
        /* renamed from: xsna.jhw0$d$d, reason: collision with other inner class name */
        public static final class C3121d implements d {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3121d)) {
                    return false;
                }
                ((C3121d) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Long.hashCode(10000L);
            }

            public final String toString() {
                return "Scheduled(timeout=10000)";
            }
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class e implements d {
        }
    }

    /* compiled from: VoipCallMainMenuState.kt */
    public static final class e implements jhw0 {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final f d;
        public final List<String> e;
        public final gzs<Fragment> f;

        /* JADX WARN: Multi-variable type inference failed */
        public e(boolean z, boolean z2, boolean z3, f fVar, List<String> list, gzs<? extends Fragment> gzsVar) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = fVar;
            this.e = list;
            this.f = gzsVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static e e(e eVar, boolean z, boolean z2, f fVar, ArrayList arrayList, int i) {
            boolean z3 = (i & 1) != 0 ? eVar.a : true;
            if ((i & 2) != 0) {
                z = eVar.b;
            }
            boolean z4 = z;
            if ((i & 4) != 0) {
                z2 = eVar.c;
            }
            boolean z5 = z2;
            if ((i & 8) != 0) {
                fVar = eVar.d;
            }
            f fVar2 = fVar;
            List list = arrayList;
            if ((i & 16) != 0) {
                list = eVar.e;
            }
            gzs<Fragment> gzsVar = eVar.f;
            eVar.getClass();
            return new e(z3, z4, z5, fVar2, list, gzsVar);
        }

        @Override // xsna.jhw0
        public final List<String> a() {
            return this.e;
        }

        @Override // xsna.jhw0
        public final gzs<Fragment> b() {
            return this.f;
        }

        @Override // xsna.jhw0
        public final f c() {
            return this.d;
        }

        @Override // xsna.jhw0
        public final boolean d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && epx.f(this.d, eVar.d) && epx.f(this.e, eVar.e) && epx.f(this.f, eVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + fw3.a((this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
        }

        @Override // xsna.jhw0
        public final boolean isEnabled() {
            return this.c;
        }

        @Override // xsna.jhw0
        public final boolean isVisible() {
            return this.b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RequestingContent(hasPermissions=");
            sb.append(this.a);
            sb.append(", isVisible=");
            sb.append(this.b);
            sb.append(", isEnabled=");
            sb.append(this.c);
            sb.append(", sliderState=");
            sb.append(this.d);
            sb.append(", pendingOnboardingRequests=");
            sb.append(this.e);
            sb.append(", createFragmentFactory=");
            return uf3.d(sb, this.f, ')');
        }
    }

    /* compiled from: VoipCallMainMenuState.kt */
    public interface f {

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class a implements f {
            public static final a a = new a();
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class b implements f {
            public final boolean a;

            public b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a == ((b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return defpackage.q0.a(new StringBuilder("Expanded(showingRoot="), this.a, ')');
            }
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class c implements f {
            public static final c a = new c();
        }

        /* compiled from: VoipCallMainMenuState.kt */
        public static final class d implements f {
            public static final d a = new d();
        }
    }

    List<String> a();

    gzs<Fragment> b();

    f c();

    boolean d();

    boolean isEnabled();

    boolean isVisible();
}
