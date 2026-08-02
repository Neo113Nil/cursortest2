package xsna;

import com.vk.dto.common.Attachment;
import java.util.List;

/* compiled from: RepliesEvent.kt */
/* loaded from: classes18.dex */
public interface h2g0 extends pk50 {

    /* compiled from: RepliesEvent.kt */
    public static final class a implements h2g0 {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    /* compiled from: RepliesEvent.kt */
    public static final class b implements h2g0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
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
            return defpackage.q0.a(new StringBuilder("NavigateBack(dataOnScreenChanged="), this.a, ')');
        }
    }

    /* compiled from: RepliesEvent.kt */
    public static final class c implements h2g0 {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ScrollToComment(id="), this.a, ')');
        }
    }

    /* compiled from: RepliesEvent.kt */
    public static final class d implements h2g0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1074900608;
        }

        public final String toString() {
            return "ScrollToReview";
        }
    }

    /* compiled from: RepliesEvent.kt */
    public static final class e implements h2g0 {
        public final String a;
        public final List<Attachment> b;

        /* JADX WARN: Multi-variable type inference failed */
        public e(String str, List<? extends Attachment> list) {
            this.a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetWriteBarData(text=");
            sb.append(this.a);
            sb.append(", attachments=");
            return ms9.a(')', sb, this.b);
        }
    }

    /* compiled from: RepliesEvent.kt */
    public static final class f implements h2g0 {
        public final tlo0 a;

        public f(tlo0 tlo0Var) {
            this.a = tlo0Var;
        }
    }
}
