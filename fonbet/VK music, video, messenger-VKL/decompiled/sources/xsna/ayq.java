package xsna;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import kotlin.Triple;

/* compiled from: FeedDigestInversedHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class ayq extends ol60 {
    public final DigestItem A;
    public final Digest B;
    public final Triple<DigestItem, Digest, xah0> C;
    public final CharSequence h;
    public final CharSequence i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final String o;
    public final Drawable p;
    public final boolean q;
    public final Drawable r;
    public final Drawable s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final StringBuilder z;

    public ayq(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, boolean z2, String str, boolean z3, String str2, ColorDrawable colorDrawable, boolean z4, baf0 baf0Var, ShapeDrawable shapeDrawable, boolean z5, boolean z6, String str3, boolean z7, boolean z8, int i2, StringBuilder sb, DigestItem digestItem, Digest digest, Triple triple) {
        super(MBSupportMuteAdType.INTERSTITIAL_VIDEO, 0, 0, 0, null);
        this.h = charSequence;
        this.i = charSequence2;
        this.j = z;
        this.k = i;
        this.l = z2;
        this.m = str;
        this.n = z3;
        this.o = str2;
        this.p = colorDrawable;
        this.q = z4;
        this.r = baf0Var;
        this.s = shapeDrawable;
        this.t = z5;
        this.u = z6;
        this.v = str3;
        this.w = z7;
        this.x = z8;
        this.y = i2;
        this.z = sb;
        this.A = digestItem;
        this.B = digest;
        this.C = triple;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ayq)) {
            return false;
        }
        ayq ayqVar = (ayq) obj;
        return epx.f(this.h, ayqVar.h) && epx.f(this.i, ayqVar.i) && this.j == ayqVar.j && this.k == ayqVar.k && this.l == ayqVar.l && epx.f(this.m, ayqVar.m) && this.n == ayqVar.n && epx.f(this.o, ayqVar.o) && epx.f(this.p, ayqVar.p) && this.q == ayqVar.q && epx.f(this.r, ayqVar.r) && epx.f(this.s, ayqVar.s) && this.t == ayqVar.t && this.u == ayqVar.u && epx.f(this.v, ayqVar.v) && this.w == ayqVar.w && this.x == ayqVar.x && this.y == ayqVar.y && epx.f(this.z, ayqVar.z) && epx.f(this.A, ayqVar.A) && epx.f(this.B, ayqVar.B) && epx.f(this.C, ayqVar.C);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        CharSequence charSequence = this.i;
        int b = qoy.b(shy.a(this.k, qoy.b(qoy.b((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.j), 31, false), 31), 31, this.l);
        String str = this.m;
        int b2 = qoy.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.n);
        String str2 = this.o;
        int hashCode2 = (b2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Drawable drawable = this.p;
        int b3 = qoy.b((hashCode2 + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.q);
        Drawable drawable2 = this.r;
        int hashCode3 = (b3 + (drawable2 == null ? 0 : drawable2.hashCode())) * 31;
        Drawable drawable3 = this.s;
        int b4 = qoy.b(qoy.b((hashCode3 + (drawable3 == null ? 0 : drawable3.hashCode())) * 31, 31, this.t), 31, this.u);
        String str3 = this.v;
        return Integer.hashCode(0) + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + shy.a(this.y, qoy.b(qoy.b((b4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.w), 31, this.x), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FeedDigestInversedHolderUiDto(nameText=" + ((Object) this.h) + ", text=" + ((Object) this.i) + ", isTextVisible=" + this.j + ", hasObsceneText=false, date=" + this.k + ", isDateVisible=" + this.l + ", badgeText=" + this.m + ", isBadgeVisible=" + this.n + ", thumbUrl=" + this.o + ", thumbBackground=" + this.p + ", isThumbVisible=" + this.q + ", overlayImageDrawable=" + this.r + ", overlayBackground=" + this.s + ", isOverlayVisible=" + this.t + ", isCommentsDividerViewVisible=" + this.u + ", commentsCounterViewText=" + this.v + ", isCommentsCounterViewVisible=" + this.w + ", isCommentsIconViewVisible=" + this.x + ", paddingBottom=" + this.y + ", stringBuilder=" + ((Object) this.z) + ", digestItem=" + this.A + ", digest=" + this.B + ", item=" + this.C + ", seqId=0)";
    }
}
