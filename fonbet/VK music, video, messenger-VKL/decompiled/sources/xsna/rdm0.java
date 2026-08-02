package xsna;

import com.vkontakte.android.R;

/* compiled from: StoryShareContentListItem.kt */
/* loaded from: classes16.dex */
public abstract class rdm0 implements hfz {

    /* compiled from: StoryShareContentListItem.kt */
    public static final class a extends rdm0 {
        public static final a b = new a();
    }

    @Override // xsna.hfz
    public Number getItemId() {
        return 0;
    }

    /* compiled from: StoryShareContentListItem.kt */
    public static final class b extends rdm0 {
        public final long b;
        public final String c;
        public final String d;
        public final boolean e;
        public final x7j0 f;
        public final Integer g;
        public final String h;

        public b(long j, String str, String str2, boolean z, x7j0 x7j0Var, Integer num, String str3) {
            this.b = j;
            this.c = str;
            this.d = str2;
            this.e = z;
            this.f = x7j0Var;
            this.g = num;
            this.h = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && epx.f(this.f, bVar.f) && epx.f(this.g, bVar.g) && epx.f(this.h, bVar.h);
        }

        @Override // xsna.rdm0, xsna.hfz
        public final Number getItemId() {
            return Long.valueOf(this.b);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.b) * 31;
            String str = this.c;
            int hashCode2 = (this.f.hashCode() + qoy.b(urd0.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e)) * 31;
            Integer num = this.g;
            return this.h.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(id=");
            sb.append(this.b);
            sb.append(", uri=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", isSelected=");
            sb.append(this.e);
            sb.append(", action=");
            sb.append(this.f);
            sb.append(", emptyDrawableId=");
            sb.append(this.g);
            sb.append(", testTag=");
            return ho8.a(sb, this.h, ')');
        }

        public /* synthetic */ b(long j, String str, String str2, boolean z, x7j0 x7j0Var, String str3, int i) {
            this(j, str, str2, z, x7j0Var, (i & 32) != 0 ? null : Integer.valueOf(R.id.add_outline_28), (i & 64) != 0 ? "" : str3);
        }
    }
}
