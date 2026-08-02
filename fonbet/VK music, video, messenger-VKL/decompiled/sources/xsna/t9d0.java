package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PrimaryItemsCreator.kt */
/* loaded from: classes7.dex */
public final class t9d0 {

    /* compiled from: PrimaryItemsCreator.kt */
    public static final class a {
        public final List<bbd0> a;
        public final boolean b;
        public final boolean c;
        public final CallMemberId d;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            CallMemberId callMemberId = this.d;
            return b + (callMemberId == null ? 0 : callMemberId.hashCode());
        }

        public final String toString() {
            return "ItemsInfo(items=" + this.a + ", isScreenCaptureEnabled=" + this.b + ", isWatchTogetherEnabled=" + this.c + ", participantId=" + this.d + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends bbd0> list, boolean z, boolean z2, CallMemberId callMemberId) {
            this.a = list;
            this.b = z;
            this.c = z2;
            this.d = callMemberId;
        }

        public a(int i) {
            this(EmptyList.b, false, false, null);
        }
    }
}
