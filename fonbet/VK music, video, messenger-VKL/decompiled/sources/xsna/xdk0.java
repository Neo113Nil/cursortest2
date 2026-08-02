package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: SocialGraphFriendsMvi.kt */
/* loaded from: classes5.dex */
public final class xdk0 implements km50 {
    public final a b;
    public final boolean c;

    /* compiled from: SocialGraphFriendsMvi.kt */
    public static abstract class a implements km50 {

        /* compiled from: SocialGraphFriendsMvi.kt */
        /* renamed from: xsna.xdk0$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC3997a extends a {
            public final List<itx> b = EmptyList.b;

            /* compiled from: SocialGraphFriendsMvi.kt */
            /* renamed from: xsna.xdk0$a$a$a, reason: collision with other inner class name */
            public static final class C3998a extends AbstractC3997a {
                public final List<itx> c;

                /* JADX WARN: Multi-variable type inference failed */
                public C3998a(List<? extends itx> list) {
                    super(0);
                    this.c = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3998a) && epx.f(this.c, ((C3998a) obj).c);
                }

                public final int hashCode() {
                    return this.c.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("Data(list="), this.c);
                }
            }

            /* compiled from: SocialGraphFriendsMvi.kt */
            /* renamed from: xsna.xdk0$a$a$b */
            public static final class b extends AbstractC3997a {
                public final List<itx> c;

                /* JADX WARN: Multi-variable type inference failed */
                public b(List<? extends itx> list) {
                    super(0);
                    this.c = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && epx.f(this.c, ((b) obj).c);
                }

                public final int hashCode() {
                    return this.c.hashCode();
                }

                public final String toString() {
                    return ms9.a(')', new StringBuilder("SearchResult(list="), this.c);
                }
            }

            public AbstractC3997a(int i) {
            }
        }

        /* compiled from: SocialGraphFriendsMvi.kt */
        public static final class b extends a {
            public final Throwable b;

            public b(Throwable th) {
                this.b = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
            }
        }

        /* compiled from: SocialGraphFriendsMvi.kt */
        public static final class c extends a {
            public static final c b = new c();
        }
    }

    public xdk0() {
        this(0);
    }

    public static xdk0 a(xdk0 xdk0Var, a aVar, int i) {
        if ((i & 1) != 0) {
            aVar = xdk0Var.b;
        }
        boolean z = (i & 2) != 0 ? xdk0Var.c : true;
        xdk0Var.getClass();
        return new xdk0(aVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdk0)) {
            return false;
        }
        xdk0 xdk0Var = (xdk0) obj;
        return epx.f(this.b, xdk0Var.b) && this.c == xdk0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SocialGraphFriendsState(contentState=");
        sb.append(this.b);
        sb.append(", wasAddedAtLeastOnce=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public xdk0(a aVar, boolean z) {
        this.b = aVar;
        this.c = z;
    }

    public /* synthetic */ xdk0(int i) {
        this(a.c.b, false);
    }
}
