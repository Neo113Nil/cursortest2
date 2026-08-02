package xsna;

import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastAuthor;
import com.vk.libvideo.live.api.broadcast_settings.models.BroadcastStream;
import java.util.ArrayList;

/* compiled from: BroadcastSettingsContract.kt */
/* loaded from: classes3.dex */
public abstract class nj8 implements hfz {

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class a extends nj8 {
        public final BroadcastAuthor b;
        public final boolean c;
        public final boolean d;

        public a(BroadcastAuthor broadcastAuthor, boolean z, boolean z2) {
            this.b = broadcastAuthor;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Author(author=");
            sb.append(this.b);
            sb.append(", isSelected=");
            sb.append(this.c);
            sb.append(", isBlocked=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class b extends nj8 {
        public final ArrayList b;

        public b(ArrayList arrayList) {
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("AuthorSelector(authors="), this.b);
        }
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class c extends nj8 {
        public static final c b = new c();
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class d extends nj8 {
        public final int b;
        public final Integer c;

        public d(int i, Integer num) {
            this.b = i;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && epx.f(this.c, dVar.c);
        }

        @Override // xsna.nj8, xsna.hfz
        public final Number getItemId() {
            return Integer.valueOf(this.b);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            Integer num = this.c;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Header(titleResId=");
            sb.append(this.b);
            sb.append(", subtitleResId=");
            return uqi.b(sb, this.c, ')');
        }
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class e extends nj8 {
        public final BroadcastAuthor b;
        public final BroadcastStream c;
        public final boolean d;

        public e(BroadcastAuthor broadcastAuthor, BroadcastStream broadcastStream, boolean z) {
            this.b = broadcastAuthor;
            this.c = broadcastStream;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c) && this.d == eVar.d;
        }

        @Override // xsna.nj8, xsna.hfz
        public final Number getItemId() {
            Integer a = yj8.a(this.c);
            return Integer.valueOf(a != null ? a.intValue() : 0);
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Stream(author=");
            sb.append(this.b);
            sb.append(", stream=");
            sb.append(this.c);
            sb.append(", isSelected=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }
}
