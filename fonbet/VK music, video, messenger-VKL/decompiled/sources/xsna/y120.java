package xsna;

/* compiled from: MemberRestrictionAction.kt */
/* loaded from: classes2.dex */
public abstract class y120 {

    /* compiled from: MemberRestrictionAction.kt */
    public static final class b extends y120 {
        public static final b a = new b();
    }

    /* compiled from: MemberRestrictionAction.kt */
    public static final class a extends y120 {
        public final Long a;

        public a(Long l) {
            this.a = l;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            Long l = this.a;
            if (l == null) {
                return 0;
            }
            return l.hashCode();
        }

        public final String toString() {
            return iq.b(new StringBuilder("ReadOnly(forTime="), this.a, ')');
        }

        public a() {
            this((Long) null);
        }

        public /* synthetic */ a(int i) {
            this((Long) null);
        }
    }
}
