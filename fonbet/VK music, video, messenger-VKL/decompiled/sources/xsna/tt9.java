package xsna;

import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import xsna.tlo0;

/* compiled from: ProfileCard.kt */
/* loaded from: classes16.dex */
public final class tt9 {
    public final ut9 a;
    public final b b;
    public final a c;

    /* compiled from: ProfileCard.kt */
    public interface a {

        /* compiled from: ProfileCard.kt */
        /* renamed from: xsna.tt9$a$a, reason: collision with other inner class name */
        public static final class C3768a implements a {
            public final tlo0 a;
            public final SemanticsConfiguration b;

            public C3768a(tlo0 tlo0Var, com.vk.core.compose.component.semantics.a aVar) {
                this.a = tlo0Var;
                this.b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3768a)) {
                    return false;
                }
                C3768a c3768a = (C3768a) obj;
                return epx.f(this.a, c3768a.a) && epx.f(this.b, c3768a.b);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                SemanticsConfiguration semanticsConfiguration = this.b;
                return hashCode + (semanticsConfiguration == null ? 0 : semanticsConfiguration.hashCode());
            }

            public final String toString() {
                return "Text(text=" + this.a + ", semanticsConfiguration=" + this.b + ')';
            }
        }
    }

    public tt9(ut9 ut9Var, b bVar, a.C3768a c3768a) {
        this.a = ut9Var;
        this.b = bVar;
        this.c = c3768a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt9)) {
            return false;
        }
        tt9 tt9Var = (tt9) obj;
        return this.a.equals(tt9Var.a) && this.b.equals(tt9Var.b) && epx.f(this.c, tt9Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        a aVar = this.c;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "CardState(top=" + this.a + ", middle=" + this.b + ", bottom=" + this.c + ')';
    }

    /* compiled from: ProfileCard.kt */
    public static final class b {
        public final C3771b a;
        public final a b;

        /* compiled from: ProfileCard.kt */
        public interface a {

            /* compiled from: ProfileCard.kt */
            /* renamed from: xsna.tt9$b$a$a, reason: collision with other inner class name */
            public static final class C3769a implements a {
                public final us2 a;
                public final String b;
                public final gzs<s3q0> c;
                public final com.vk.core.compose.component.semantics.a d;

                public C3769a(us2 us2Var, String str, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar) {
                    this.a = us2Var;
                    this.b = str;
                    this.c = gzsVar;
                    this.d = aVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3769a)) {
                        return false;
                    }
                    C3769a c3769a = (C3769a) obj;
                    return this.a.equals(c3769a.a) && epx.f(this.b, c3769a.b) && epx.f(this.c, c3769a.c) && this.d.equals(c3769a.d);
                }

                @Override // xsna.tt9.b.a
                public final us2 getText() {
                    return this.a;
                }

                public final int hashCode() {
                    int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
                    gzs<s3q0> gzsVar = this.c;
                    return this.d.hashCode() + ((a + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31);
                }

                public final String toString() {
                    return "ExpandableText(text=" + ((Object) this.a) + ", expandSpanText=" + this.b + ", onClick=" + this.c + ", semanticsConfiguration=" + this.d + ')';
                }
            }

            /* compiled from: ProfileCard.kt */
            /* renamed from: xsna.tt9$b$a$b, reason: collision with other inner class name */
            public static final class C3770b implements a {
                public final us2 a;
                public final com.vk.core.compose.component.semantics.a b;

                public C3770b() {
                    throw null;
                }

                public C3770b(us2 us2Var, com.vk.core.compose.component.semantics.a aVar) {
                    this.a = us2Var;
                    this.b = aVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3770b)) {
                        return false;
                    }
                    C3770b c3770b = (C3770b) obj;
                    return epx.f(this.a, c3770b.a) && epx.f(this.b, c3770b.b);
                }

                @Override // xsna.tt9.b.a
                public final us2 getText() {
                    return this.a;
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 961;
                    com.vk.core.compose.component.semantics.a aVar = this.b;
                    return hashCode + (aVar == null ? 0 : aVar.hashCode());
                }

                public final String toString() {
                    return "Text(text=" + ((Object) this.a) + ", onClick=null, semanticsConfiguration=" + this.b + ')';
                }
            }

            us2 getText();
        }

        public b(C3771b c3771b, a aVar) {
            this.a = c3771b;
            this.b = aVar;
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
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Middle(title=" + this.a + ", description=" + this.b + ')';
        }

        /* compiled from: ProfileCard.kt */
        /* renamed from: xsna.tt9$b$b, reason: collision with other inner class name */
        public static final class C3771b {
            public final C3774b a;
            public final a b;

            /* compiled from: ProfileCard.kt */
            /* renamed from: xsna.tt9$b$b$a */
            public static final class a {
                public final C3772a a;
                public final C3773b b;

                /* compiled from: ProfileCard.kt */
                /* renamed from: xsna.tt9$b$b$a$a, reason: collision with other inner class name */
                public static final class C3772a {
                    public final lg90 a;
                    public final long b;
                    public final gzs<s3q0> c;

                    public C3772a() {
                        throw null;
                    }

                    public C3772a(gzs gzsVar, lg90 lg90Var) {
                        long j = l5g.k;
                        this.a = lg90Var;
                        this.b = j;
                        this.c = gzsVar;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C3772a)) {
                            return false;
                        }
                        C3772a c3772a = (C3772a) obj;
                        return epx.f(this.a, c3772a.a) && l5g.d(this.b, c3772a.b) && epx.f(this.c, c3772a.c);
                    }

                    public final int hashCode() {
                        int hashCode = this.a.hashCode() * 961;
                        int i = l5g.l;
                        int a = bh10.a(hashCode, 31, this.b);
                        gzs<s3q0> gzsVar = this.c;
                        return a + (gzsVar == null ? 0 : gzsVar.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("StatusIcon(painter=");
                        sb.append(this.a);
                        sb.append(", contentDescription=null, tint=");
                        dn.h(this.b, ", onClick=", sb);
                        return uf3.d(sb, this.c, ')');
                    }
                }

                /* compiled from: ProfileCard.kt */
                /* renamed from: xsna.tt9$b$b$a$b, reason: collision with other inner class name */
                public static final class C3773b {
                    public final lg90 a;
                    public final long b;
                    public final gzs<s3q0> c;

                    public C3773b() {
                        throw null;
                    }

                    public C3773b(long j, gzs gzsVar, lg90 lg90Var) {
                        this.a = lg90Var;
                        this.b = j;
                        this.c = gzsVar;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C3773b)) {
                            return false;
                        }
                        C3773b c3773b = (C3773b) obj;
                        return epx.f(this.a, c3773b.a) && l5g.d(this.b, c3773b.b) && epx.f(this.c, c3773b.c);
                    }

                    public final int hashCode() {
                        int hashCode = this.a.hashCode() * 961;
                        int i = l5g.l;
                        int a = bh10.a(hashCode, 31, this.b);
                        gzs<s3q0> gzsVar = this.c;
                        return a + (gzsVar == null ? 0 : gzsVar.hashCode());
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("VerifyIcon(painter=");
                        sb.append(this.a);
                        sb.append(", contentDescription=null, tint=");
                        dn.h(this.b, ", onClick=", sb);
                        return uf3.d(sb, this.c, ')');
                    }
                }

                public a() {
                    this(null, null);
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
                }

                public final int hashCode() {
                    C3772a c3772a = this.a;
                    int hashCode = (c3772a == null ? 0 : c3772a.hashCode()) * 31;
                    C3773b c3773b = this.b;
                    return hashCode + (c3773b != null ? c3773b.hashCode() : 0);
                }

                public final String toString() {
                    return "Icons(status=" + this.a + ", verify=" + this.b + ')';
                }

                public a(C3772a c3772a, C3773b c3773b) {
                    this.a = c3772a;
                    this.b = c3773b;
                }
            }

            /* compiled from: ProfileCard.kt */
            /* renamed from: xsna.tt9$b$b$b, reason: collision with other inner class name */
            public static final class C3774b {
                public final tlo0.h a;
                public final com.vk.core.compose.component.semantics.a b;

                public C3774b() {
                    throw null;
                }

                public C3774b(tlo0.h hVar, com.vk.core.compose.component.semantics.a aVar) {
                    this.a = hVar;
                    this.b = aVar;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3774b)) {
                        return false;
                    }
                    C3774b c3774b = (C3774b) obj;
                    return epx.f(this.a, c3774b.a) && epx.f(this.b, c3774b.b);
                }

                public final int hashCode() {
                    int hashCode = this.a.a.hashCode() * 961;
                    com.vk.core.compose.component.semantics.a aVar = this.b;
                    return hashCode + (aVar == null ? 0 : aVar.hashCode());
                }

                public final String toString() {
                    return "Text(text=" + this.a + ", onClick=null, semanticsConfiguration=" + this.b + ')';
                }
            }

            public C3771b(C3774b c3774b, a aVar) {
                this.a = c3774b;
                this.b = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3771b)) {
                    return false;
                }
                C3771b c3771b = (C3771b) obj;
                return epx.f(this.a, c3771b.a) && epx.f(this.b, c3771b.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Title(title=" + this.a + ", icons=" + this.b + ')';
            }

            public /* synthetic */ C3771b(C3774b c3774b) {
                this(c3774b, new a(null, null));
            }
        }
    }
}
