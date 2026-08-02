package xsna;

import androidx.fragment.app.Fragment;
import com.vk.voip.ui.actions.menu.fragments.VoipMainMenuFragmentBase;
import java.util.ArrayList;

/* compiled from: VoipCallMainMenuAction.kt */
/* loaded from: classes7.dex */
public interface ghw0 {

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class a implements ghw0 {
        public final Fragment a;

        public a(Fragment fragment) {
            this.a = fragment;
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
            return "AddContentFragment(fragment=" + this.a + ')';
        }
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class b implements ghw0 {
        public static final b a = new b();
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class c implements ghw0 {
        public static final c a = new c();
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class d implements ghw0 {
        public static final d a = new d();
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class e implements ghw0 {
        public static final e a = new e();
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class f implements ghw0 {
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

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ContentFragmentRemoved(fragment=" + this.a + ')';
        }
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class g implements ghw0 {
        public static final g a = new g();
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class h implements ghw0 {
        public final gzs<Fragment> a;

        /* JADX WARN: Multi-variable type inference failed */
        public h(gzs<? extends Fragment> gzsVar) {
            this.a = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return uf3.d(new StringBuilder("ContentPrepare(createFragmentFactory="), this.a, ')');
        }
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class i implements ghw0 {
        public static final i a = new i();
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class j implements ghw0 {
        public static final j a = new j();
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public interface k extends ghw0 {

        /* compiled from: VoipCallMainMenuAction.kt */
        public static final class a implements k {
            public static final a a = new a();
        }

        /* compiled from: VoipCallMainMenuAction.kt */
        public static final class b implements k {
            public static final b a = new b();
        }

        /* compiled from: VoipCallMainMenuAction.kt */
        public static final class c implements k {
            public final ld a;

            public c(ld ldVar) {
                this.a = ldVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ForceLaunchContent(factory=" + this.a + ')';
            }
        }
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class l implements ghw0 {
        public final Fragment a;

        public l(Fragment fragment) {
            this.a = fragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && epx.f(this.a, ((l) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "MaybeCollapse(fragment=" + this.a + ')';
        }
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class m implements ghw0 {
        public static final m a = new m();
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class n implements ghw0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            ((n) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Long.hashCode(10000L);
        }

        public final String toString() {
            return "OnboardingSchedule(timeout=10000)";
        }
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class o implements ghw0 {
        public static final o a = new o();
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class p implements ghw0 {
        public final VoipMainMenuFragmentBase a;
        public final boolean b;

        public p(VoipMainMenuFragmentBase voipMainMenuFragmentBase, boolean z) {
            this.a = voipMainMenuFragmentBase;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return this.a.equals(pVar.a) && this.b == pVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetContentFragment(fragment=");
            sb.append(this.a);
            sb.append(", isGoingBack=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class q implements ghw0 {
        public final ArrayList a;

        public q(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.a.equals(((q) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("SetOnboardingRequestors(keys="), this.a);
        }
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class r implements ghw0 {
        public final boolean a;

        public r(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.a == ((r) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetVisible(visible="), this.a, ')');
        }
    }

    /* compiled from: VoipCallMainMenuAction.kt */
    public static final class s implements ghw0 {
        public static final s a = new s();
    }
}
