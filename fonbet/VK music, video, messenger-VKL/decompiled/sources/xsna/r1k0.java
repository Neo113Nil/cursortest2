package xsna;

import java.util.List;

/* compiled from: SlidingBlockDelegate.kt */
/* loaded from: classes7.dex */
public final class r1k0 implements hfz {
    public final b b;

    /* compiled from: SlidingBlockDelegate.kt */
    public interface a {

        /* compiled from: SlidingBlockDelegate.kt */
        /* renamed from: xsna.r1k0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3589a implements a {
            public final int a;

            /* compiled from: SlidingBlockDelegate.kt */
            /* renamed from: xsna.r1k0$a$a$a, reason: collision with other inner class name */
            public static final class C3590a extends AbstractC3589a {
                public final String b;
                public final int c;

                public C3590a(String str, int i) {
                    super(i);
                    this.b = str;
                    this.c = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3590a)) {
                        return false;
                    }
                    C3590a c3590a = (C3590a) obj;
                    return epx.f(this.b, c3590a.b) && this.c == c3590a.c;
                }

                public final int hashCode() {
                    String str = this.b;
                    return Integer.hashCode(this.c) + ((str == null ? 0 : str.hashCode()) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Empty(currentUserPhoto=");
                    sb.append(this.b);
                    sb.append(", amountOfComments=");
                    return vu5.b(sb, this.c, ')');
                }
            }

            /* compiled from: SlidingBlockDelegate.kt */
            /* renamed from: xsna.r1k0$a$a$b */
            public static final class b extends AbstractC3589a {
                public final String b;
                public final String c;
                public final int d;

                public b(String str, String str2, int i) {
                    super(i);
                    this.b = str;
                    this.c = str2;
                    this.d = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
                }

                public final int hashCode() {
                    String str = this.b;
                    return Integer.hashCode(this.d) + urd0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("TopComment(authorPhoto=");
                    sb.append(this.b);
                    sb.append(", text=");
                    sb.append(this.c);
                    sb.append(", amountOfComments=");
                    return vu5.b(sb, this.d, ')');
                }
            }

            public AbstractC3589a(int i) {
                this.a = i;
            }
        }

        /* compiled from: SlidingBlockDelegate.kt */
        public static final class b implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "RelatedAudio(title=null, coverUrl=null)";
            }
        }
    }

    /* compiled from: SlidingBlockDelegate.kt */
    public interface b {

        /* compiled from: SlidingBlockDelegate.kt */
        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 703466161;
            }

            public final String toString() {
                return "Empty";
            }
        }

        /* compiled from: SlidingBlockDelegate.kt */
        /* renamed from: xsna.r1k0$b$b, reason: collision with other inner class name */
        public static final class C3591b implements b {
            public final List a;

            public C3591b(List list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3591b) && epx.f(this.a, ((C3591b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return jr.a(')', new StringBuilder("Loaded(cards="), this.a);
            }
        }

        /* compiled from: SlidingBlockDelegate.kt */
        public static final class c implements b {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -613376608;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public r1k0(b bVar) {
        this.b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1k0) && epx.f(this.b, ((r1k0) obj).b);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SlidingCardsBlock(cardsState=" + this.b + ')';
    }
}
