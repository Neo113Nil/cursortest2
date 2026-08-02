package xsna;

import com.vk.push.core.network.model.ErrorStatus;
import java.util.List;

/* compiled from: PushMessageResultDto.kt */
/* loaded from: classes5.dex */
public abstract class vje0 {

    /* compiled from: PushMessageResultDto.kt */
    public static final class b extends vje0 {
        public final String a;
        public final String b;
        public final List<pje0> c;
        public final boolean d;

        public b(String str, String str2, boolean z, List list) {
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int a = fw3.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            boolean z = this.d;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return a + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(token=");
            sb.append(this.a);
            sb.append(", projectId=");
            sb.append(this.b);
            sb.append(", messages=");
            sb.append(this.c);
            sb.append(", partialContent=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: PushMessageResultDto.kt */
    public static final class a extends vje0 {
        public final String a;
        public final String b;
        public final ErrorStatus c;

        public a(String str, String str2, ErrorStatus errorStatus) {
            this.a = str;
            this.b = str2;
            this.c = errorStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return "Error(token=" + this.a + ", message=" + this.b + ", status=" + this.c + ')';
        }

        public /* synthetic */ a(String str, String str2) {
            this(str, str2, ErrorStatus.UNSPECIFIED_ERROR);
        }
    }
}
