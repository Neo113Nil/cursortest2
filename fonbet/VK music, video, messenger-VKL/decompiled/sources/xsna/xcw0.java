package xsna;

import ru.ok.android.externcalls.sdk.dev.MediaDumpManager;

/* compiled from: VoipActionsViewEvent.kt */
/* loaded from: classes7.dex */
public interface xcw0 {

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class a implements xcw0 {
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
            return defpackage.q0.a(new StringBuilder("AsrOnlineEnabled(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class a0 implements xcw0 {
        public static final a0 a = new a0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class b implements xcw0 {
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class b0 implements xcw0 {
        public static final b0 a = new b0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class c implements xcw0 {
        public static final c a = new c();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class c0 implements xcw0 {
        public static final c0 a = new c0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class d implements xcw0 {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ChangeScreencastEnabled(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class d0 implements xcw0 {
        public final boolean a;

        public d0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d0) && this.a == ((d0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ScreensharingChanged(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class e implements xcw0 {
        static {
            new e();
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class e0 implements xcw0 {
        public static final e0 a = new e0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class f implements xcw0 {
        public static final f a = new f();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class f0 implements xcw0 {
        public static final f0 a = new f0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class g implements xcw0 {
        public static final g a = new g();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class g0 implements xcw0 {
        public static final g0 a = new g0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class h implements xcw0 {
        public static final h a = new h();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class h0 implements xcw0 {
        public final boolean a;

        public h0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h0) && this.a == ((h0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowChatHistoryChanged(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class i implements xcw0 {
        public static final i a = new i();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class i0 implements xcw0 {
        public static final i0 a = new i0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class j implements xcw0 {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.a == ((j) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FrontCameraMirroringChanged(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class j0 implements xcw0 {
        public static final j0 a = new j0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class k implements xcw0 {
        public final boolean a;

        public k(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("GesturesFeedbackChanged(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class k0 implements xcw0 {
        public static final k0 a = new k0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class l implements xcw0 {
        public static final l a = new l();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class l0 implements xcw0 {
        public final MediaDumpManager.Source a;

        public l0(MediaDumpManager.Source source) {
            this.a = source;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l0) && this.a == ((l0) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ToggleAudioDumpRecord(requestedSource=" + this.a + ')';
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class m implements xcw0 {
        public static final m a = new m();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class m0 implements xcw0 {
        public final boolean a;

        public m0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m0) && this.a == ((m0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("WatchTogetherChanged(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class n implements xcw0 {
        public static final n a = new n();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class n0 implements xcw0 {
        public static final n0 a = new n0();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class o implements xcw0 {
        public static final o a = new o();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class p implements xcw0 {
        public static final p a = new p();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class q implements xcw0 {
        public static final q a = new q();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class r implements xcw0 {
        public static final r a = new r();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class s implements xcw0 {
        public static final s a = new s();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class t implements xcw0 {
        public static final t a = new t();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class u implements xcw0 {
        public static final u a = new u();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class v implements xcw0 {
        public static final v a = new v();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class w implements xcw0 {
        public final u59 a;

        public w(u59 u59Var) {
            this.a = u59Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && epx.f(this.a, ((w) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenParticipantPermissions(menu=" + this.a + ')';
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class x implements xcw0 {
        public final u59 a;

        public x(u59 u59Var) {
            this.a = u59Var;
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
            return "OpenParticipantSettings(menu=" + this.a + ')';
        }
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class y implements xcw0 {
        public static final y a = new y();
    }

    /* compiled from: VoipActionsViewEvent.kt */
    public static final class z implements xcw0 {
        public final boolean a;

        public z(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && this.a == ((z) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("RecordChanged(isEnabled="), this.a, ')');
        }
    }
}
