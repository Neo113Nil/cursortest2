package xsna;

import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SelectSessionRoomAction.kt */
/* loaded from: classes7.dex */
public interface p9i0 extends kj50 {

    /* compiled from: SelectSessionRoomAction.kt */
    public static final class a implements p9i0 {
        public static final a b = new a();
    }

    /* compiled from: SelectSessionRoomAction.kt */
    public static final class b implements p9i0 {
        public static final b b = new b();
    }

    /* compiled from: SelectSessionRoomAction.kt */
    public static final class c implements p9i0 {
        public static final c b = new c();
    }

    /* compiled from: SelectSessionRoomAction.kt */
    public static final class d implements p9i0 {
        public final SessionRoomId.Room b;

        public d(SessionRoomId.Room room) {
            this.b = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PickRoom(roomId=" + this.b + ')';
        }
    }

    /* compiled from: SelectSessionRoomAction.kt */
    public static final class e implements p9i0 {
        public final List<lvi0> b;

        public e(List<lvi0> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("UpdateList(list="), this.b);
        }
    }
}
