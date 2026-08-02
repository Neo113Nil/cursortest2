package xsna;

import java.util.ArrayList;

/* compiled from: ReplyVideoStickerStateMapper.kt */
/* loaded from: classes15.dex */
public final class s4g0 {
    public final boolean a;
    public final int b;
    public final String c;
    public final boolean d;
    public final b e;
    public final ArrayList f;
    public final a g;

    /* compiled from: ReplyVideoStickerStateMapper.kt */
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

    /* compiled from: ReplyVideoStickerStateMapper.kt */
    public static final class b {
        public final CharSequence a;
        public final boolean b;
        public final boolean c;

        public b(CharSequence charSequence, boolean z, boolean z2) {
            this.a = charSequence;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            CharSequence charSequence = this.a;
            return Boolean.hashCode(this.c) + qoy.b(shy.a(2, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31), 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextState(text=");
            sb.append((Object) this.a);
            sb.append(", textMaxLines=2, isVisible=");
            sb.append(this.b);
            sb.append(", isBackgroundVisible=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public s4g0(boolean z, int i, String str, boolean z2, b bVar, ArrayList arrayList, a aVar) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = z2;
        this.e = bVar;
        this.f = arrayList;
        this.g = aVar;
    }
}
