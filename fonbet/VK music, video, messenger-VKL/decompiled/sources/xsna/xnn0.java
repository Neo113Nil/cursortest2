package xsna;

import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.impl.ui.FooterButtonType;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: AdapterData.kt */
/* loaded from: classes6.dex */
public interface xnn0 {

    /* compiled from: AdapterData.kt */
    public static final class a implements xnn0 {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("AddButton(marginStart="), this.a, ')');
        }
    }

    /* compiled from: AdapterData.kt */
    public static final class b implements xnn0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1596204777;
        }

        public final String toString() {
            return "Divider";
        }
    }

    /* compiled from: AdapterData.kt */
    public static final class c implements xnn0 {
        public final xxo a;
        public final SwitcherUiMode b;
        public final com.vk.superapp.multiaccount.api.f c;

        public c(xxo xxoVar, SwitcherUiMode switcherUiMode, com.vk.superapp.multiaccount.api.f fVar) {
            this.a = xxoVar;
            this.b = switcherUiMode;
            this.c = fVar;
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
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Ecoplate(config=" + this.a + ", switcherUiMode=" + this.b + ", user=" + this.c + ')';
        }
    }

    /* compiled from: AdapterData.kt */
    public static final class d implements xnn0 {
        public final FooterButtonType a;

        public d(FooterButtonType footerButtonType) {
            this.a = footerButtonType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "FooterButton(buttonType=" + this.a + ')';
        }
    }

    /* compiled from: AdapterData.kt */
    public static abstract class e implements xnn0 {
        public final Integer a;
        public final String b;
        public final int c;
        public final Integer d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final boolean i;

        /* compiled from: AdapterData.kt */
        public static final class a extends e {
            public final Integer j;
            public final String k;
            public final Integer l;

            public a() {
                this(7);
            }

            @Override // xsna.xnn0.e
            public final String a() {
                return this.k;
            }

            @Override // xsna.xnn0.e
            public final Integer b() {
                return this.l;
            }

            @Override // xsna.xnn0.e
            public final Integer c() {
                return this.j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l);
            }

            public final int hashCode() {
                Integer num = this.j;
                int a = urd0.a((num == null ? 0 : num.hashCode()) * 31, 31, this.k);
                Integer num2 = this.l;
                return a + (num2 != null ? num2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Header(textResourceId=");
                sb.append(this.j);
                sb.append(", text=");
                sb.append(this.k);
                sb.append(", textColorOverride=");
                return uqi.b(sb, this.l, ')');
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public a(int i) {
                super(r5, "", R.style.VkUiTypography_DisplayTitle2, r8, iah0.a(r15), iah0.a(r15), iah0.a(r15), iah0.a(12), false);
                Integer valueOf = Integer.valueOf(R.string.vk_auth_select_account_title);
                Integer valueOf2 = Integer.valueOf(R.attr.vk_ui_text_primary);
                Integer num = (i & 1) != 0 ? null : valueOf;
                Integer num2 = (i & 4) != 0 ? null : valueOf2;
                float f = 4;
                this.j = num;
                this.k = "";
                this.l = num2;
            }
        }

        /* compiled from: AdapterData.kt */
        public static final class b extends e {
            public final Integer j;
            public final String k;

            public b() {
                this(null, 3);
            }

            @Override // xsna.xnn0.e
            public final String a() {
                return this.k;
            }

            @Override // xsna.xnn0.e
            public final Integer c() {
                return this.j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.j, bVar.j) && epx.f(this.k, bVar.k);
            }

            public final int hashCode() {
                Integer num = this.j;
                return this.k.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Text(textResourceId=");
                sb.append(this.j);
                sb.append(", text=");
                return ho8.a(sb, this.k, ')');
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public b(String str, int i) {
                super(r2, r3, R.style.VkUiTypography_FootnoteCapsMedium, Integer.valueOf(R.attr.vk_ui_text_secondary), iah0.a(16), iah0.a(r12), 0, iah0.a(r12), true);
                Integer valueOf = (i & 1) != 0 ? null : Integer.valueOf(R.string.vk_auth_choose_other_accounts);
                String str2 = (i & 2) != 0 ? "" : str;
                float f = 6;
                this.j = valueOf;
                this.k = str2;
            }
        }

        public e(Integer num, String str, int i, Integer num2, int i2, int i3, int i4, int i5, boolean z) {
            this.a = num;
            this.b = str;
            this.c = i;
            this.d = num2;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = z;
        }

        public String a() {
            return this.b;
        }

        public Integer b() {
            return this.d;
        }

        public Integer c() {
            return this.a;
        }
    }

    /* compiled from: AdapterData.kt */
    public static final class f implements xnn0 {
        public final ArrayList a;

        public f(ArrayList arrayList) {
            this.a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("RelatedUser(relatedUsers="), this.a);
        }
    }

    /* compiled from: AdapterData.kt */
    public static final class g implements xnn0 {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.a == ((g) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Spacer(height="), this.a, ')');
        }

        public g() {
            this(iah0.a(8));
        }
    }

    /* compiled from: AdapterData.kt */
    public static final class h implements xnn0 {
        public final com.vk.superapp.multiaccount.api.f a;
        public final l0r0 b;
        public final int c;

        public h(com.vk.superapp.multiaccount.api.f fVar, l0r0 l0r0Var, int i) {
            this.a = fVar;
            this.b = l0r0Var;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b) && this.c == hVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("User(value=");
            sb.append(this.a);
            sb.append(", userViewHolderState=");
            sb.append(this.b);
            sb.append(", marginStart=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
