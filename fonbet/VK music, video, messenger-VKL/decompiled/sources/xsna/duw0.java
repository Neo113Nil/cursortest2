package xsna;

/* compiled from: VoipParticipantSettingsViewState.kt */
/* loaded from: classes7.dex */
public final class duw0 implements ao50 {
    public final fi50 a;

    /* compiled from: VoipParticipantSettingsViewState.kt */
    public interface a {

        /* compiled from: VoipParticipantSettingsViewState.kt */
        /* renamed from: xsna.duw0$a$a, reason: collision with other inner class name */
        public static final class C2755a implements a {
            public final Throwable a;

            public C2755a(Throwable th) {
                this.a = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2755a) && epx.f(this.a, ((C2755a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(error="), this.a, ')');
            }
        }

        /* compiled from: VoipParticipantSettingsViewState.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1501879008;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: VoipParticipantSettingsViewState.kt */
        public static final class b implements a {
            public final c a;
            public final d b;
            public final C2756a c;
            public final C2757b d;

            /* compiled from: VoipParticipantSettingsViewState.kt */
            /* renamed from: xsna.duw0$a$b$a, reason: collision with other inner class name */
            public static final class C2756a {
                public final boolean a;
                public final boolean b;
                public final boolean c;
                public final boolean d;

                public C2756a() {
                    this(false, false, false, false);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2756a)) {
                        return false;
                    }
                    C2756a c2756a = (C2756a) obj;
                    return this.a == c2756a.a && this.b == c2756a.b && this.c == c2756a.c && this.d == c2756a.d;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.d) + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Button(isShowMediaRequestAttention=");
                    sb.append(this.a);
                    sb.append(", isShowMoveToWaitingRoom=");
                    sb.append(this.b);
                    sb.append(", isShowRename=");
                    sb.append(this.c);
                    sb.append(", isShowExclude=");
                    return defpackage.q0.a(sb, this.d, ')');
                }

                public C2756a(boolean z, boolean z2, boolean z3, boolean z4) {
                    this.a = z;
                    this.b = z2;
                    this.c = z3;
                    this.d = z4;
                }
            }

            /* compiled from: VoipParticipantSettingsViewState.kt */
            public static final class c {
                public final sew0 a;
                public final String b;
                public final boolean c;
                public final boolean d;

                public c(sew0 sew0Var, String str, boolean z, boolean z2) {
                    this.a = sew0Var;
                    this.b = str;
                    this.c = z;
                    this.d = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d;
                }

                public final int hashCode() {
                    sew0 sew0Var = this.a;
                    return Boolean.hashCode(this.d) + qoy.b(urd0.a((sew0Var == null ? 0 : sew0Var.hashCode()) * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Header(avatar=");
                    sb.append(this.a);
                    sb.append(", name=");
                    sb.append(this.b);
                    sb.append(", isHandRaised=");
                    sb.append(this.c);
                    sb.append(", canOpenProfile=");
                    return defpackage.q0.a(sb, this.d, ')');
                }
            }

            /* compiled from: VoipParticipantSettingsViewState.kt */
            public interface d {

                /* compiled from: VoipParticipantSettingsViewState.kt */
                /* renamed from: xsna.duw0$a$b$d$a, reason: collision with other inner class name */
                public static final class C2761a implements d {
                    public static final C2761a a = new C2761a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C2761a);
                    }

                    public final int hashCode() {
                        return -480520711;
                    }

                    public final String toString() {
                        return "Hide";
                    }
                }

                /* compiled from: VoipParticipantSettingsViewState.kt */
                /* renamed from: xsna.duw0$a$b$d$b, reason: collision with other inner class name */
                public static final class C2762b implements d {
                    public final boolean a;
                    public final boolean b;
                    public final boolean c;

                    public C2762b(boolean z, boolean z2, boolean z3) {
                        this.a = z;
                        this.b = z2;
                        this.c = z3;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C2762b)) {
                            return false;
                        }
                        C2762b c2762b = (C2762b) obj;
                        return this.a == c2762b.a && this.b == c2762b.b && this.c == c2762b.c;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Info(isHandLowered=");
                        sb.append(this.a);
                        sb.append(", isMicrophoneMute=");
                        sb.append(this.b);
                        sb.append(", isCameraTurnOff=");
                        return defpackage.q0.a(sb, this.c, ')');
                    }
                }
            }

            public b(c cVar, d dVar, C2756a c2756a, C2757b c2757b) {
                this.a = cVar;
                this.b = dVar;
                this.c = c2756a;
                this.d = c2757b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Info(header=" + this.a + ", toolbar=" + this.b + ", button=" + this.c + ", buttonWithState=" + this.d + ')';
            }

            /* compiled from: VoipParticipantSettingsViewState.kt */
            /* renamed from: xsna.duw0$a$b$b, reason: collision with other inner class name */
            public static final class C2757b {
                public final InterfaceC2758a a;
                public final InterfaceC2758a b;

                /* compiled from: VoipParticipantSettingsViewState.kt */
                /* renamed from: xsna.duw0$a$b$b$a, reason: collision with other inner class name */
                public interface InterfaceC2758a {

                    /* compiled from: VoipParticipantSettingsViewState.kt */
                    /* renamed from: xsna.duw0$a$b$b$a$a, reason: collision with other inner class name */
                    public static final class C2759a implements InterfaceC2758a {
                        public static final C2759a a = new C2759a();

                        public final boolean equals(Object obj) {
                            return this == obj || (obj instanceof C2759a);
                        }

                        public final int hashCode() {
                            return -1631331208;
                        }

                        public final String toString() {
                            return "Hide";
                        }
                    }

                    /* compiled from: VoipParticipantSettingsViewState.kt */
                    /* renamed from: xsna.duw0$a$b$b$a$b, reason: collision with other inner class name */
                    public static final class C2760b implements InterfaceC2758a {
                        public final boolean a;

                        public C2760b(boolean z) {
                            this.a = z;
                        }

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return (obj instanceof C2760b) && this.a == ((C2760b) obj).a;
                        }

                        public final int hashCode() {
                            return Boolean.hashCode(this.a);
                        }

                        public final String toString() {
                            return defpackage.q0.a(new StringBuilder("Show(isActivated="), this.a, ')');
                        }
                    }
                }

                public C2757b(InterfaceC2758a interfaceC2758a, InterfaceC2758a interfaceC2758a2) {
                    this.a = interfaceC2758a;
                    this.b = interfaceC2758a2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C2757b)) {
                        return false;
                    }
                    C2757b c2757b = (C2757b) obj;
                    return epx.f(this.a, c2757b.a) && epx.f(this.b, c2757b.b);
                }

                public final int hashCode() {
                    return this.b.hashCode() + (this.a.hashCode() * 31);
                }

                public final String toString() {
                    return "ButtonWithState(pinnedForAll=" + this.a + ", grantedAdmin=" + this.b + ')';
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public C2757b() {
                    this(r0, r0);
                    InterfaceC2758a.C2759a c2759a = InterfaceC2758a.C2759a.a;
                }
            }
        }
    }

    /* compiled from: VoipParticipantSettingsViewState.kt */
    public static final class b implements fm50<buw0> {
        public final yzt0<a> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public duw0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
