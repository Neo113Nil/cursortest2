package xsna;

import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: PostStickerViewStateRedesign.kt */
/* loaded from: classes15.dex */
public final class e8c0 {
    public final d a;
    public final c b;
    public final e c;
    public final b d;
    public final a e;

    /* compiled from: PostStickerViewStateRedesign.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityState(contentTextRes=");
            sb.append(this.a);
            sb.append(", styleTextRes=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: PostStickerViewStateRedesign.kt */
    public static final class b {
        public final q7c0 a;

        public b(q7c0 q7c0Var) {
            this.a = q7c0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            q7c0 q7c0Var = this.a;
            if (q7c0Var == null) {
                return 0;
            }
            return q7c0Var.hashCode();
        }

        public final String toString() {
            return "AttachmentsState(mainAttachmentType=" + this.a + ')';
        }
    }

    /* compiled from: PostStickerViewStateRedesign.kt */
    public static final class c {
        public final boolean a;
        public final ArrayList b;
        public final int c;

        public c(ArrayList arrayList, int i, boolean z) {
            this.a = z;
            this.b = arrayList;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b.equals(cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(R.drawable.vk_icon_arrow_uturn_right_12, qr.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AuthorState(isVisible=");
            sb.append(this.a);
            sb.append(", authors=");
            sb.append(this.b);
            sb.append(", iconResId=2131236360, prefixResId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: PostStickerViewStateRedesign.kt */
    public static final class d {
        public final boolean a;
        public final int b;
        public final boolean c;

        public d(int i, boolean z, boolean z2) {
            this.a = z;
            this.b = i;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FullContainerState(isBackgroundVisible=");
            sb.append(this.a);
            sb.append(", bottomSeparatorHeight=");
            sb.append(this.b);
            sb.append(", isFullscreen=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: PostStickerViewStateRedesign.kt */
    public static final class e {
        public final CharSequence a;
        public final int b;
        public final boolean c;
        public final boolean d;

        public e(CharSequence charSequence, int i, boolean z, boolean z2) {
            this.a = charSequence;
            this.b = i;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
        }

        public final int hashCode() {
            CharSequence charSequence = this.a;
            return Boolean.hashCode(this.d) + qoy.b(shy.a(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextState(text=");
            sb.append((Object) this.a);
            sb.append(", textMaxLines=");
            sb.append(this.b);
            sb.append(", isVisible=");
            sb.append(this.c);
            sb.append(", isOnlyText=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    public e8c0(d dVar, c cVar, e eVar, b bVar, a aVar) {
        this.a = dVar;
        this.b = cVar;
        this.c = eVar;
        this.d = bVar;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8c0)) {
            return false;
        }
        e8c0 e8c0Var = (e8c0) obj;
        return epx.f(this.a, e8c0Var.a) && epx.f(this.b, e8c0Var.b) && epx.f(this.c, e8c0Var.c) && epx.f(this.d, e8c0Var.d) && epx.f(this.e, e8c0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PostStickerViewStateRedesign(fullContainerState=" + this.a + ", authorState=" + this.b + ", textState=" + this.c + ", attachmentsState=" + this.d + ", accessibilityState=" + this.e + ')';
    }
}
