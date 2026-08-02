package xsna;

import com.vk.dto.uxpolls.PollAnswer;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PollState.kt */
/* loaded from: classes6.dex */
public interface trb0 extends km50 {

    /* compiled from: PollState.kt */
    public static final class a implements trb0 {
        public final Map<Integer, PollAnswer> b;
        public final int c;
        public final boolean d;
        public final boolean e;

        public a(Map<Integer, PollAnswer> map, int i, boolean z, boolean z2) {
            this.b = map;
            this.c = i;
            this.d = z;
            this.e = z2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static a a(a aVar, LinkedHashMap linkedHashMap, int i, int i2) {
            Map map = linkedHashMap;
            if ((i2 & 1) != 0) {
                map = aVar.b;
            }
            if ((i2 & 2) != 0) {
                i = aVar.c;
            }
            boolean z = (i2 & 4) != 0 ? aVar.d : true;
            boolean z2 = (i2 & 8) != 0 ? aVar.e : true;
            aVar.getClass();
            return new a(map, i, z, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(shy.a(this.c, this.b.hashCode() * 31, 31), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(answers=");
            sb.append(this.b);
            sb.append(", page=");
            sb.append(this.c);
            sb.append(", autoCloseProcessing=");
            sb.append(this.d);
            sb.append(", isEndPoll=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }
}
