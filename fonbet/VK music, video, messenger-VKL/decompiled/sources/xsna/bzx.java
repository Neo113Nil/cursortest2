package xsna;

import com.vk.voip.ui.change_name.ui.result.VoipChangeNameResult;

/* compiled from: JoinCallAction.kt */
/* loaded from: classes7.dex */
public interface bzx extends kj50 {

    /* compiled from: JoinCallAction.kt */
    public static final class a implements bzx {
        public static final a b = new a();
    }

    /* compiled from: JoinCallAction.kt */
    public static final class b implements bzx {
        public static final b b = new b();
    }

    /* compiled from: JoinCallAction.kt */
    public static final class c implements bzx {
        public static final c b = new c();
    }

    /* compiled from: JoinCallAction.kt */
    public static final class d implements bzx {
        public final VoipChangeNameResult b;

        public d(VoipChangeNameResult voipChangeNameResult) {
            this.b = voipChangeNameResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.b.hashCode();
        }

        public final String toString() {
            return "JoinAsUpdateByResult(joinAsResult=" + this.b + ')';
        }
    }

    /* compiled from: JoinCallAction.kt */
    public static final class e implements bzx {
        public static final e b = new e();
    }

    /* compiled from: JoinCallAction.kt */
    public static final class f implements bzx {
        public static final f b = new f();
    }

    /* compiled from: JoinCallAction.kt */
    public static final class g implements bzx {
        public static final g b = new g();
    }
}
