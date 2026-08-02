package xsna;

import java.util.List;

/* compiled from: ChatMembersLoader.kt */
/* loaded from: classes2.dex */
public abstract class ltb {

    /* compiled from: ChatMembersLoader.kt */
    public static final class a extends ltb {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: ChatMembersLoader.kt */
    public static final class b extends ltb {
        public final List<hfz> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends hfz> list) {
            this.a = list;
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
            return ms9.a(')', new StringBuilder("Loaded(memberItems="), this.a);
        }
    }

    /* compiled from: ChatMembersLoader.kt */
    public static final class c extends ltb {
        public static final c a = new c();
    }
}
