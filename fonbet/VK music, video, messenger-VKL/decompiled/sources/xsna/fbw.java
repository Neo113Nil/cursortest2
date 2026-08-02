package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ImReactionsInteractor.kt */
/* loaded from: classes2.dex */
public interface fbw {

    /* compiled from: ImReactionsInteractor.kt */
    public static final class a {
        public final long a;
        public final int b;
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;

        public a(long j, int i, int i2, boolean z, int i3, String str) {
            this.a = j;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = i3;
            this.f = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && epx.f(this.f, aVar.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + shy.a(this.e, qoy.b(shy.a(this.c, shy.a(this.b, Long.hashCode(this.a) * 31, 31), 31), 31, this.d), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImReactionsInteractorSendReactionArgs(dialogId=");
            sb.append(this.a);
            sb.append(", cnvMsgId=");
            sb.append(this.b);
            sb.append(", msgLocalId=");
            sb.append(this.c);
            sb.append(", isChannel=");
            sb.append(this.d);
            sb.append(", reactionId=");
            sb.append(this.e);
            sb.append(", source=");
            return ho8.a(sb, this.f, ')');
        }
    }

    void a();

    void b(long j, ArrayList arrayList);

    void c(long j, List<Integer> list);

    void d(int i, int i2, long j, boolean z);

    void e(a aVar);
}
