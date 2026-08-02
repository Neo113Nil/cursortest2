package xsna;

import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SelectSessionRoomPatch.kt */
/* loaded from: classes7.dex */
public interface t9i0 extends xl50 {

    /* compiled from: SelectSessionRoomPatch.kt */
    public static final class a implements t9i0 {
        public static final a b = new a();
    }

    /* compiled from: SelectSessionRoomPatch.kt */
    public static final class b implements t9i0 {
        public final Integer b;
        public final Integer c;

        public b(Integer num, Integer num2) {
            this.b = num;
            this.c = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            Integer num = this.b;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.c;
            return hashCode + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Init(titleResId=");
            sb.append(this.b);
            sb.append(", actionTitleResId=");
            return uqi.b(sb, this.c, ')');
        }
    }

    /* compiled from: SelectSessionRoomPatch.kt */
    public static final class c implements t9i0 {
        public final SessionRoomId.Room b;

        public c(SessionRoomId.Room room) {
            this.b = room;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PickRoom(roomId=" + this.b + ')';
        }
    }

    /* compiled from: SelectSessionRoomPatch.kt */
    public static final class d implements t9i0 {
        public final List<lvi0> b;

        public d(List<lvi0> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("UpdateList(list="), this.b);
        }
    }
}
