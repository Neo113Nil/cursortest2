package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: MusicPickerAction.kt */
/* loaded from: classes4.dex */
public interface lr40 extends kj50 {

    /* compiled from: MusicPickerAction.kt */
    public static final class a implements lr40 {
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AttachPlaylist(canShowDialog=");
            sb.append(this.b);
            sb.append(", isPrivatePlaylist=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: MusicPickerAction.kt */
    public static final class b implements lr40 {
        public final UserId b;

        public b(UserId userId) {
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return Long.hashCode(this.b.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("Init(ownerId="), this.b, ')');
        }
    }

    /* compiled from: MusicPickerAction.kt */
    public static final class c implements lr40 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -103189516;
        }

        public final String toString() {
            return "RemoveAttach";
        }
    }
}
