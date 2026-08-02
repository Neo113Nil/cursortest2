package xsna;

import com.vkontakte.android.R;

/* compiled from: CommonCallListViewItem.kt */
/* loaded from: classes7.dex */
public abstract class big implements l59 {

    /* compiled from: CommonCallListViewItem.kt */
    public static final class a extends big {
        public final int b;
        public final int c;
        public final int d;
        public final Integer e;

        public a() {
            this(0, 31);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.d, shy.a(this.c, shy.a(0, Integer.hashCode(this.b) * 31, 31), 31), 31);
            Integer num = this.e;
            return a + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Divider(marginTop=");
            sb.append(this.b);
            sb.append(", marginBottom=0, marginStart=");
            sb.append(this.c);
            sb.append(", marginEnd=");
            sb.append(this.d);
            sb.append(", backgroundColorAttrRes=");
            return uqi.b(sb, this.e, ')');
        }

        public a(int i, int i2) {
            Integer valueOf = Integer.valueOf(R.attr.vk_ui_background_content);
            i = (i2 & 1) != 0 ? 0 : i;
            int b = cn70.b(16);
            int b2 = cn70.b(16);
            valueOf = (i2 & 16) != 0 ? null : valueOf;
            this.b = i;
            this.c = b;
            this.d = b2;
            this.e = valueOf;
        }
    }

    /* compiled from: CommonCallListViewItem.kt */
    public static final class b extends big {
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

        public final int hashCode() {
            return Integer.hashCode(0) + (Integer.hashCode(0) * 31);
        }

        public final String toString() {
            return "EmptySpace(height=0, colorAttrRes=0)";
        }
    }

    /* compiled from: CommonCallListViewItem.kt */
    public static final class c extends big {
        public final Throwable b;

        public c(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("PageLoadingError(throwable="), this.b, ')');
        }
    }

    /* compiled from: CommonCallListViewItem.kt */
    public static final class d extends big {
        public static final d b = new d();
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }
}
