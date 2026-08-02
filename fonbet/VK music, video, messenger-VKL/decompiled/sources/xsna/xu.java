package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.ActionButton;

/* compiled from: ActionButtonListItem.kt */
/* loaded from: classes4.dex */
public abstract class xu {
    public final int a;

    /* compiled from: ActionButtonListItem.kt */
    public static final class a extends xu {
        public final ActionButton b;
        public final boolean c;
        public final String d;
        public final boolean e;

        public a(ActionButton actionButton, boolean z, String str, boolean z2) {
            super(1);
            this.b = actionButton;
            this.c = z;
            this.d = str;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + urd0.a(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action(action=");
            sb.append(this.b);
            sb.append(", isSelected=");
            sb.append(this.c);
            sb.append(", description=");
            sb.append(this.d);
            sb.append(", isOnboardingEnabled=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ActionButtonListItem.kt */
    public static final class b extends xu {
        public final Integer b;
        public final boolean c;

        public b(boolean z, Integer num) {
            super(0);
            this.b = num;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            Integer num = this.b;
            return Boolean.hashCode(this.c) + ((num == null ? 0 : num.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SectionTitle(title=");
            sb.append(this.b);
            sb.append(", isFirstSection=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public xu(int i) {
        this.a = i;
    }
}
