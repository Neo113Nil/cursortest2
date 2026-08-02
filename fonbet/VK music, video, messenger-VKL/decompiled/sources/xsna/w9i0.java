package xsna;

import java.util.List;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;
import xsna.v9i0;

/* compiled from: SelectSessionRoomViewState.kt */
/* loaded from: classes7.dex */
public final class w9i0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: SelectSessionRoomViewState.kt */
    public static final class a implements fm50<v9i0.a> {
        public static final a a = new a();
    }

    /* compiled from: SelectSessionRoomViewState.kt */
    public static final class b implements fm50<v9i0.b> {
        public static final b a = new b();
    }

    /* compiled from: SelectSessionRoomViewState.kt */
    public static final class c implements fm50<v9i0.c> {
        public final yzt0<Integer> a;
        public final yzt0<Integer> b;
        public final yzt0<List<lvi0>> c;

        public c(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowingRoomsList(titleResId=");
            sb.append(this.a);
            sb.append(", actionTitleResId=");
            sb.append(this.b);
            sb.append(", list=");
            return tr.c(sb, this.c, ')');
        }
    }

    /* compiled from: SelectSessionRoomViewState.kt */
    public static final class d implements fm50<v9i0.d> {
        public final yzt0<Integer> a;
        public final yzt0<Integer> b;
        public final yzt0<List<lvi0>> c;
        public final yzt0<SessionRoomId.Room> d;

        public d(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c) && epx.f(this.d, dVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowingRoomsListWithSelection(titleResId=");
            sb.append(this.a);
            sb.append(", actionTitleResId=");
            sb.append(this.b);
            sb.append(", list=");
            sb.append(this.c);
            sb.append(", selectedRoomId=");
            return tr.c(sb, this.d, ')');
        }
    }

    public w9i0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
