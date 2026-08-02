package xsna;

import com.vk.voip.api.id.CallId;

/* compiled from: GroupCallTipNavigationEvent.kt */
/* loaded from: classes7.dex */
public interface oiu {

    /* compiled from: GroupCallTipNavigationEvent.kt */
    public static final class a implements oiu {
        public static final a a = new a();
    }

    /* compiled from: GroupCallTipNavigationEvent.kt */
    public static final class b implements oiu {
        public final CallId a;

        public b(CallId callId) {
            this.a = callId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.b.hashCode();
        }

        public final String toString() {
            return "OpenShareLinkPager(callId=" + this.a + ')';
        }
    }
}
