package xsna;

import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ShareStoryListItem.kt */
/* loaded from: classes16.dex */
public abstract class m8j0 implements hfz {

    /* compiled from: ShareStoryListItem.kt */
    public static final class a extends b {
        public final int c;
        public final List<rdm0> d;
        public final UserId e;

        public a(UserId userId, ListBuilder listBuilder) {
            super(R.string.author, listBuilder);
            this.c = R.string.author;
            this.d = listBuilder;
            this.e = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.c == aVar.c && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return Long.hashCode(this.e.b) + fw3.a(Integer.hashCode(this.c) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthorData(titleId=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", currentAuthor=");
            return gp.b(sb, this.e, ')');
        }
    }

    /* compiled from: ShareStoryListItem.kt */
    public static abstract class b extends m8j0 {
        public final List<rdm0> b;

        public b(int i, List list) {
            this.b = list;
        }
    }

    /* compiled from: ShareStoryListItem.kt */
    public static final class c extends b {
        public final int c;
        public final List<rdm0> d;
        public final boolean e;
        public final String f;

        public c(String str, ListBuilder listBuilder, boolean z) {
            super(R.string.attach_narrative, listBuilder);
            this.c = R.string.attach_narrative;
            this.d = listBuilder;
            this.e = z;
            this.f = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.c == cVar.c && epx.f(this.d, cVar.d) && this.e == cVar.e && epx.f(this.f, cVar.f);
        }

        public final int hashCode() {
            int b = qoy.b(fw3.a(Integer.hashCode(this.c) * 31, 31, this.d), 31, this.e);
            String str = this.f;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NarrativeData(titleId=");
            sb.append(this.c);
            sb.append(", items=");
            sb.append(this.d);
            sb.append(", needUpdatePagination=");
            sb.append(this.e);
            sb.append(", nextForm=");
            return ho8.a(sb, this.f, ')');
        }
    }

    /* compiled from: ShareStoryListItem.kt */
    public static final class d extends m8j0 {
        public static final d b = new d();
    }

    /* compiled from: ShareStoryListItem.kt */
    public static final class e extends m8j0 {
        public static final e b = new e();
    }

    /* compiled from: ShareStoryListItem.kt */
    public static final class f extends m8j0 {
        public static final f b = new f();
    }

    /* compiled from: ShareStoryListItem.kt */
    public static final class g extends m8j0 {
        public final int b = R.string.story_online_booking;
        public final int c = R.drawable.vk_icon_calendar_outline_24;
        public final boolean d;

        public g(boolean z) {
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.b == gVar.b && this.c == gVar.c && this.d == gVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Switch(titleId=");
            sb.append(this.b);
            sb.append(", iconId=");
            sb.append(this.c);
            sb.append(", isChecked=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }
}
