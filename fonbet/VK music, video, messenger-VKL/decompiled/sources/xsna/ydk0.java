package xsna;

import java.util.List;

/* compiled from: SocialGraphFriendsMvi.kt */
/* loaded from: classes5.dex */
public final class ydk0 implements ao50 {
    public final fi50 a;

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static final class a implements fm50<xdk0> {
        public final yzt0<AbstractC4091a> a;

        /* compiled from: SocialGraphFriendsMvi.kt */
        /* renamed from: xsna.ydk0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC4091a {

            /* compiled from: SocialGraphFriendsMvi.kt */
            /* renamed from: xsna.ydk0$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC4092a extends AbstractC4091a {

                /* compiled from: SocialGraphFriendsMvi.kt */
                /* renamed from: xsna.ydk0$a$a$a$a, reason: collision with other inner class name */
                public static final class C4093a extends AbstractC4092a {
                    public final List<itx> a;
                    public final boolean b;

                    /* JADX WARN: Multi-variable type inference failed */
                    public C4093a(List<? extends itx> list, boolean z) {
                        this.a = list;
                        this.b = z;
                    }

                    @Override // xsna.ydk0.a.AbstractC4091a
                    public final boolean a() {
                        return this.b;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C4093a)) {
                            return false;
                        }
                        C4093a c4093a = (C4093a) obj;
                        return epx.f(this.a, c4093a.a) && this.b == c4093a.b;
                    }

                    public final int hashCode() {
                        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("Contacts(list=");
                        sb.append(this.a);
                        sb.append(", wasAddedAtLeastOnce=");
                        return defpackage.q0.a(sb, this.b, ')');
                    }
                }

                /* compiled from: SocialGraphFriendsMvi.kt */
                /* renamed from: xsna.ydk0$a$a$a$b */
                public static final class b extends AbstractC4092a {
                    public final List<itx> a;
                    public final boolean b;

                    /* JADX WARN: Multi-variable type inference failed */
                    public b(List<? extends itx> list, boolean z) {
                        this.a = list;
                        this.b = z;
                    }

                    @Override // xsna.ydk0.a.AbstractC4091a
                    public final boolean a() {
                        return this.b;
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
                        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder("SearchResult(list=");
                        sb.append(this.a);
                        sb.append(", wasAddedAtLeastOnce=");
                        return defpackage.q0.a(sb, this.b, ')');
                    }
                }
            }

            /* compiled from: SocialGraphFriendsMvi.kt */
            /* renamed from: xsna.ydk0$a$a$b */
            public static final class b extends AbstractC4091a {
                public final boolean a;

                public b(boolean z) {
                    this.a = z;
                }

                @Override // xsna.ydk0.a.AbstractC4091a
                public final boolean a() {
                    return this.a;
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
                    return defpackage.q0.a(new StringBuilder("EmptyContacts(wasAddedAtLeastOnce="), this.a, ')');
                }
            }

            /* compiled from: SocialGraphFriendsMvi.kt */
            /* renamed from: xsna.ydk0$a$a$c */
            public static final class c extends AbstractC4091a {
                public final boolean a;

                public c(boolean z) {
                    this.a = z;
                }

                @Override // xsna.ydk0.a.AbstractC4091a
                public final boolean a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && this.a == ((c) obj).a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.a);
                }

                public final String toString() {
                    return defpackage.q0.a(new StringBuilder("EmptySearchResult(wasAddedAtLeastOnce="), this.a, ')');
                }
            }

            /* compiled from: SocialGraphFriendsMvi.kt */
            /* renamed from: xsna.ydk0$a$a$d */
            public static final class d extends AbstractC4091a {
                public final Throwable a;

                public d(Throwable th) {
                    this.a = th;
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
                    return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
                }
            }

            /* compiled from: SocialGraphFriendsMvi.kt */
            /* renamed from: xsna.ydk0$a$a$e */
            public static final class e extends AbstractC4091a {
                public final boolean a;

                public e(boolean z) {
                    this.a = z;
                }

                @Override // xsna.ydk0.a.AbstractC4091a
                public final boolean a() {
                    return this.a;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && this.a == ((e) obj).a;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.a);
                }

                public final String toString() {
                    return defpackage.q0.a(new StringBuilder("Loading(wasAddedAtLeastOnce="), this.a, ')');
                }
            }

            public boolean a() {
                return false;
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("ContentViewState(contentState="), this.a, ')');
        }
    }

    public ydk0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
