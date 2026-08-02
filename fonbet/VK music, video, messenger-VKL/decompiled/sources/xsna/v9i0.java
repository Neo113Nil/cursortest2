package xsna;

import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: SelectSessionRoomState.kt */
/* loaded from: classes7.dex */
public interface v9i0 extends km50 {

    /* compiled from: SelectSessionRoomState.kt */
    public static final class a implements v9i0 {
        public static final a b = new a();
    }

    /* compiled from: SelectSessionRoomState.kt */
    public static final class b implements v9i0 {
        public static final b b = new b();
    }

    /* compiled from: SelectSessionRoomState.kt */
    public static final class c implements v9i0 {
        public final Integer b;
        public final Integer c;
        public final List<lvi0> d;

        public c(Integer num, Integer num2, List<lvi0> list) {
            this.b = num;
            this.c = num2;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            Integer num = this.b;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.c;
            return this.d.hashCode() + ((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowingRoomsList(titleResId=");
            sb.append(this.b);
            sb.append(", actionTitleResId=");
            sb.append(this.c);
            sb.append(", list=");
            return ms9.a(')', sb, this.d);
        }
    }

    /* compiled from: SelectSessionRoomState.kt */
    public static final class d implements v9i0 {
        public final Integer b;
        public final Integer c;
        public final List<lvi0> d;
        public final SessionRoomId.Room e;

        public d(Integer num, Integer num2, List<lvi0> list, SessionRoomId.Room room) {
            this.b = num;
            this.c = num2;
            this.d = list;
            this.e = room;
        }

        public static d a(d dVar, List list, SessionRoomId.Room room, int i) {
            Integer num = dVar.b;
            Integer num2 = dVar.c;
            if ((i & 4) != 0) {
                list = dVar.d;
            }
            if ((i & 8) != 0) {
                room = dVar.e;
            }
            dVar.getClass();
            return new d(num, num2, list, room);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d) && epx.f(this.e, dVar.e);
        }

        public final int hashCode() {
            Integer num = this.b;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.c;
            return this.e.hashCode() + fw3.a((hashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.d);
        }

        public final String toString() {
            return "ShowingRoomsListWithSelection(titleResId=" + this.b + ", actionTitleResId=" + this.c + ", list=" + this.d + ", selectedRoomId=" + this.e + ')';
        }
    }
}
