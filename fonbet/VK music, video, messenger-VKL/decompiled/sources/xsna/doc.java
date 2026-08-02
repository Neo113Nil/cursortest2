package xsna;

import com.vk.clips.coauthors.list.common.mvi.entity.state.ClipCoauthorListItem;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;

/* compiled from: ClipCoauthorListEvent.kt */
/* loaded from: classes16.dex */
public interface doc extends pk50 {

    /* compiled from: ClipCoauthorListEvent.kt */
    public static final class a implements doc {
        public final ClipCoauthorListItem a;
        public final ArrayList b;
        public final int c;

        public a(ClipCoauthorListItem clipCoauthorListItem, ArrayList arrayList, int i) {
            this.a = clipCoauthorListItem;
            this.b = arrayList;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + qr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EditCoauthors(mainOwner=");
            sb.append(this.a);
            sb.append(", coowners=");
            sb.append(this.b);
            sb.append(", clipId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipCoauthorListEvent.kt */
    public static final class b implements doc {
        public static final b a = new b();
    }

    /* compiled from: ClipCoauthorListEvent.kt */
    public static final class c implements doc {
        public final UserId a;
        public final boolean b;

        public c(UserId userId, boolean z) {
            this.a = userId;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenProfile(id=");
            sb.append(this.a);
            sb.append(", isOwner=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
