package xsna;

/* compiled from: ChannelReactionSetMode.kt */
/* loaded from: classes2.dex */
public interface wab {

    /* compiled from: ChannelReactionSetMode.kt */
    public static final class a implements wab {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        @Override // xsna.wab
        public final int a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("AddReaction(reactionId="), this.a, ')');
        }
    }

    /* compiled from: ChannelReactionSetMode.kt */
    public static final class b implements wab {
        public static final b a = new b();
        public static final int b = -1;

        @Override // xsna.wab
        public final int a() {
            return b;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 635690113;
        }

        public final String toString() {
            return "RemoveReaction";
        }
    }

    int a();
}
