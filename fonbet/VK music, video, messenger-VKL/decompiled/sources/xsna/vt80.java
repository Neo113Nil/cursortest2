package xsna;

import com.vk.dto.newsfeed.entries.OptionalNativeAdEntry;
import com.vkontakte.android.R;

/* compiled from: OptionalNativeAdUiDto.kt */
/* loaded from: classes4.dex */
public final class vt80 extends ol60 {
    public final x9v0 h;
    public final Object i;
    public final CharSequence j;
    public final baf0 k;
    public final int l;
    public final OptionalNativeAdEntry m;
    public final a n;

    /* compiled from: OptionalNativeAdUiDto.kt */
    public static final class a {
        public final int a;
        public final String b;
        public final int c;

        public a(int i, String str, int i2) {
            this.a = i;
            this.b = str;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnalyticsData(position=");
            sb.append(this.a);
            sb.append(", trackCode=");
            sb.append(this.b);
            sb.append(", adRequestId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public vt80(x9v0 x9v0Var, CharSequence charSequence, CharSequence charSequence2, baf0 baf0Var, OptionalNativeAdEntry optionalNativeAdEntry, a aVar) {
        super(359, 0, 0, 0, null);
        this.h = x9v0Var;
        this.i = charSequence;
        this.j = charSequence2;
        this.k = baf0Var;
        this.l = R.attr.vk_ui_text_primary;
        this.m = optionalNativeAdEntry;
        this.n = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt80)) {
            return false;
        }
        vt80 vt80Var = (vt80) obj;
        vt80Var.getClass();
        return epx.f(this.h, vt80Var.h) && epx.f(this.i, vt80Var.i) && epx.f(this.j, vt80Var.j) && epx.f(this.k, vt80Var.k) && this.l == vt80Var.l && epx.f(this.m, vt80Var.m) && epx.f(this.n, vt80Var.n);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int a2 = vul0.a((this.h.hashCode() + (Integer.hashCode(0) * 31)) * 31, 31, this.i);
        CharSequence charSequence = this.j;
        int hashCode = (a2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        baf0 baf0Var = this.k;
        return this.n.hashCode() + ((this.m.hashCode() + shy.a(this.l, (hashCode + (baf0Var != null ? baf0Var.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "OptionalNativeAdUiDto(seqId=0, nativeAd=" + this.h + ", subtitle=" + this.i + ", buttonText=" + ((Object) this.j) + ", ratingDrawable=" + this.k + ", ratingDrawableTintAttr=" + this.l + ", raw=" + this.m + ", analytics=" + this.n + ')';
    }
}
