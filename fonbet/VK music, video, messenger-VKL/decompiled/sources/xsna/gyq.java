package xsna;

import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.RoundedCornersDrawable;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import kotlin.Triple;

/* compiled from: FeedDigestSpotlightHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class gyq extends ol60 {
    public final DigestItem A;
    public final Digest B;
    public final Triple<DigestItem, Digest, xah0> C;
    public final CharSequence h;
    public final boolean i;
    public final Drawable j;
    public final CharSequence k;
    public final CharSequence l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final String p;
    public final boolean q;
    public final String r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final String v;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final StringBuilder z;

    public gyq(String str, boolean z, RoundedCornersDrawable roundedCornersDrawable, CharSequence charSequence, CharSequence charSequence2, boolean z2, int i, boolean z3, String str2, boolean z4, String str3, boolean z5, boolean z6, boolean z7, String str4, boolean z8, boolean z9, int i2, StringBuilder sb, DigestItem digestItem, Digest digest, Triple triple) {
        super(MBSupportMuteAdType.INTERSTITIAL_VIDEO, 0, 0, 0, null);
        this.h = str;
        this.i = z;
        this.j = roundedCornersDrawable;
        this.k = charSequence;
        this.l = charSequence2;
        this.m = z2;
        this.n = i;
        this.o = z3;
        this.p = str2;
        this.q = z4;
        this.r = str3;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = str4;
        this.w = z8;
        this.x = z9;
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
        if (!(obj instanceof gyq)) {
            return false;
        }
        gyq gyqVar = (gyq) obj;
        return epx.f(this.h, gyqVar.h) && this.i == gyqVar.i && epx.f(this.j, gyqVar.j) && epx.f(this.k, gyqVar.k) && epx.f(this.l, gyqVar.l) && this.m == gyqVar.m && this.n == gyqVar.n && this.o == gyqVar.o && epx.f(this.p, gyqVar.p) && this.q == gyqVar.q && epx.f(this.r, gyqVar.r) && this.s == gyqVar.s && this.t == gyqVar.t && this.u == gyqVar.u && epx.f(this.v, gyqVar.v) && this.w == gyqVar.w && this.x == gyqVar.x && this.y == gyqVar.y && epx.f(this.z, gyqVar.z) && epx.f(this.A, gyqVar.A) && epx.f(this.B, gyqVar.B) && epx.f(this.C, gyqVar.C);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        CharSequence charSequence = this.h;
        int b = qoy.b((charSequence == null ? 0 : charSequence.hashCode()) * 31, 31, this.i);
        Drawable drawable = this.j;
        int c = u11.c((b + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.k);
        CharSequence charSequence2 = this.l;
        int b2 = qoy.b(shy.a(this.n, qoy.b(qoy.b((c + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.m), 31, false), 31), 31, this.o);
        String str = this.p;
        int b3 = qoy.b((b2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.q);
        String str2 = this.r;
        int b4 = qoy.b(qoy.b(qoy.b((b3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.s), 31, this.t), 31, this.u);
        String str3 = this.v;
        return Integer.hashCode(0) + ((this.C.hashCode() + ((this.B.hashCode() + ((this.A.hashCode() + ((this.z.hashCode() + shy.a(this.y, qoy.b(qoy.b((b4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.w), 31, this.x), 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FeedDigestSpotlightHolderUiDto(titleText=" + ((Object) this.h) + ", isTitleVisible=" + this.i + ", overlayDrawable=" + this.j + ", nameText=" + ((Object) this.k) + ", text=" + ((Object) this.l) + ", isTextVisible=" + this.m + ", hasObsceneText=false, date=" + this.n + ", isDateVisible=" + this.o + ", badgeText=" + this.p + ", isBadgeVisible=" + this.q + ", photoUrl=" + this.r + ", isPhotoVisible=" + this.s + ", isSeparatorVisible=" + this.t + ", isCommentsDividerViewVisible=" + this.u + ", commentsCounterViewText=" + this.v + ", isCommentsCounterViewVisible=" + this.w + ", isCommentsIconViewVisible=" + this.x + ", paddingBottom=" + this.y + ", stringBuilder=" + ((Object) this.z) + ", digestItem=" + this.A + ", digest=" + this.B + ", item=" + this.C + ", seqId=0)";
    }
}
