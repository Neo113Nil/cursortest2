package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.credentials.UserCredentials;

/* compiled from: StorageNameProvider.kt */
/* loaded from: classes.dex */
public interface ihl0 extends xt50<String> {

    /* compiled from: StorageNameProvider.kt */
    public static final class a implements ihl0 {
        public final fpo a;
        public final Peer b;
        public final bpn0 c = new bpn0(new w62(this, 5));

        public a(fpo fpoVar, Peer peer) {
            this.a = fpoVar;
            this.b = peer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        @Override // xsna.xt50
        public final String get() {
            return (String) this.c.getValue();
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Lazy(userId=");
            UserCredentials a = this.a.a();
            sb.append(a != null ? Long.valueOf(a.g()) : null);
            sb.append(", community=");
            return vu5.a(')', this.b.b, sb);
        }
    }

    /* compiled from: StorageNameProvider.kt */
    /* loaded from: classes2.dex */
    public static final class b implements ihl0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        @Override // xsna.xt50
        public final String get() {
            return null;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Static(fileName=null)";
        }
    }
}
