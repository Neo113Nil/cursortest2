package xsna;

import com.vk.music.bottomsheets.domain.model.mixsettings.MixSettings;

/* compiled from: MusicVkMixSettingsViewState.kt */
/* loaded from: classes3.dex */
public final class df50 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: MusicVkMixSettingsViewState.kt */
    public interface a extends fm50<cf50> {

        /* compiled from: MusicVkMixSettingsViewState.kt */
        /* renamed from: xsna.df50$a$a, reason: collision with other inner class name */
        public static final class C2730a implements a {
            public final yzt0<MixSettings> a;

            public C2730a(h0u0 h0u0Var) {
                this.a = h0u0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2730a) && epx.f(this.a, ((C2730a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tr.c(new StringBuilder("Content(settings="), this.a, ')');
            }
        }

        /* compiled from: MusicVkMixSettingsViewState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1479514597;
            }

            public final String toString() {
                return "Error";
            }
        }

        /* compiled from: MusicVkMixSettingsViewState.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1994991065;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public df50(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
