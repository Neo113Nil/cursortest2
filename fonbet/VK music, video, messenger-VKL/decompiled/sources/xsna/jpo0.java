package xsna;

import android.net.Uri;
import androidx.recyclerview.widget.m;
import com.vkontakte.android.R;
import java.util.Arrays;

/* compiled from: ThemeItem.kt */
/* loaded from: classes2.dex */
public abstract class jpo0 implements t1c {
    public static final b b = new b();
    public final String a;

    /* compiled from: ThemeItem.kt */
    public static final class b extends m.e<jpo0> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(jpo0 jpo0Var, jpo0 jpo0Var2) {
            return jpo0Var.equals(jpo0Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(jpo0 jpo0Var, jpo0 jpo0Var2) {
            jpo0 jpo0Var3 = jpo0Var;
            jpo0 jpo0Var4 = jpo0Var2;
            if (!jpo0Var3.getClass().equals(jpo0Var4.getClass())) {
                return false;
            }
            if (jpo0Var3 instanceof c) {
                return epx.f(((c) jpo0Var3).c, ((c) jpo0Var4).c);
            }
            return true;
        }
    }

    /* compiled from: ThemeItem.kt */
    public static final class c extends jpo0 {
        public final String c;
        public final Uri d;
        public final Uri e;
        public final int[] f;
        public final int[] g;
        public final String h;
        public final boolean i;

        public c(String str, Uri uri, Uri uri2, int[] iArr, int[] iArr2, String str2, boolean z) {
            super(str);
            this.c = str;
            this.d = uri;
            this.e = uri2;
            this.f = iArr;
            this.g = iArr2;
            this.h = str2;
            this.i = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!c.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && Arrays.equals(this.f, cVar.f) && Arrays.equals(this.g, cVar.g) && this.i == cVar.i && epx.f(this.h, cVar.h);
        }

        public final int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            Uri uri = this.d;
            int hashCode2 = (hashCode + (uri != null ? uri.hashCode() : 0)) * 31;
            Uri uri2 = this.e;
            int b = qoy.b(dq.d(dq.d((hashCode2 + (uri2 != null ? uri2.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.i);
            String str = this.h;
            return b + (str != null ? str.hashCode() : 0);
        }

        @Override // xsna.t1c
        public final boolean isChecked() {
            return this.i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Custom(name=");
            sb.append(this.c);
            sb.append(", backgroundUri=");
            sb.append(this.d);
            sb.append(", backgroundUriDark=");
            sb.append(this.e);
            sb.append(", gradient=");
            mq.f(this.f, sb, ", gradientDark=");
            mq.f(this.g, sb, ", themeTitle=");
            sb.append(this.h);
            sb.append(", isChecked=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }

    /* compiled from: ThemeItem.kt */
    public static final class d extends jpo0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // xsna.t1c
        public final boolean isChecked() {
            return false;
        }

        public final String toString() {
            throw null;
        }
    }

    public jpo0(String str) {
        this.a = str;
    }

    /* compiled from: ThemeItem.kt */
    public static abstract class a<T extends a<T>> extends jpo0 {
        public final int c;
        public final int d;
        public final int e;
        public final boolean f;

        /* compiled from: ThemeItem.kt */
        /* renamed from: xsna.jpo0$a$a, reason: collision with other inner class name */
        public static final class C3138a extends a<C3138a> {
            public C3138a(boolean z) {
                super(R.string.vkim_create_theme, z);
            }

            @Override // xsna.jpo0.a
            public final a a() {
                return new C3138a(true);
            }
        }

        /* compiled from: ThemeItem.kt */
        public static final class b extends a<b> {
            public b(boolean z) {
                super(R.string.vkim_edit_theme, z);
            }

            @Override // xsna.jpo0.a
            public final a a() {
                return new b(true);
            }
        }

        /* compiled from: ThemeItem.kt */
        public static final class c extends a<c> {
            public c(boolean z) {
                super(R.string.vkim_reset_theme, R.drawable.vk_icon_block_outline_28, "", R.attr.vk_legacy_icon_secondary, z);
            }

            @Override // xsna.jpo0.a
            public final a a() {
                return new c(true);
            }
        }

        public /* synthetic */ a(int i, boolean z) {
            this(i, R.drawable.vk_icon_brush_outline_28, tgw.b(i, "action:", "_2131236449"), R.attr.vk_legacy_accent, z);
        }

        public abstract a a();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            a aVar = obj instanceof a ? (a) obj : null;
            return aVar != null && epx.f(this.a, aVar.a) && this.f == aVar.f;
        }

        public final int hashCode() {
            return (Boolean.hashCode(this.f) * 31) + this.a.hashCode();
        }

        @Override // xsna.t1c
        public final boolean isChecked() {
            return this.f;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action.");
            sb.append(qjg.a(this));
            sb.append("(id=");
            sb.append(this.a);
            sb.append(", isChecked=");
            return defpackage.q0.a(sb, this.f, ')');
        }

        public a(int i, int i2, String str, int i3, boolean z) {
            super(str);
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = z;
        }
    }
}
