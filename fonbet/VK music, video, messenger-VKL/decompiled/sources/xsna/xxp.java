package xsna;

import android.net.Uri;
import com.vk.dto.common.VerifyInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.EventAttachment;
import java.util.List;

/* compiled from: EventAttachmentHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class xxp extends ol60 {
    public final boolean A;
    public final boolean B;
    public final int C;
    public final int D;
    public final String E;
    public final boolean F;
    public final boolean G;
    public final EventAttachment H;
    public final NewsEntry I;
    public final Uri h;
    public final boolean i;
    public final int j;
    public final String k;
    public final int l;
    public final boolean m;
    public final String n;
    public final VerifyInfo o;
    public final boolean p;
    public final String q;
    public final boolean r;
    public final String s;
    public final String t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final List<Uri> y;
    public final boolean z;

    public xxp(Uri uri, boolean z, int i, String str, int i2, boolean z2, String str2, VerifyInfo verifyInfo, boolean z3, String str3, boolean z4, String str4, String str5, boolean z5, boolean z6, boolean z7, boolean z8, List list, boolean z9, boolean z10, boolean z11, int i3, int i4, String str6, boolean z12, boolean z13, EventAttachment eventAttachment, NewsEntry newsEntry) {
        super(81, 0, 0, 0, null);
        this.h = uri;
        this.i = z;
        this.j = i;
        this.k = str;
        this.l = i2;
        this.m = z2;
        this.n = str2;
        this.o = verifyInfo;
        this.p = z3;
        this.q = str3;
        this.r = z4;
        this.s = str4;
        this.t = str5;
        this.u = z5;
        this.v = z6;
        this.w = z7;
        this.x = z8;
        this.y = list;
        this.z = z9;
        this.A = z10;
        this.B = z11;
        this.C = i3;
        this.D = i4;
        this.E = str6;
        this.F = z12;
        this.G = z13;
        this.H = eventAttachment;
        this.I = newsEntry;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxp)) {
            return false;
        }
        xxp xxpVar = (xxp) obj;
        return epx.f(this.h, xxpVar.h) && this.i == xxpVar.i && this.j == xxpVar.j && epx.f(this.k, xxpVar.k) && this.l == xxpVar.l && this.m == xxpVar.m && epx.f(this.n, xxpVar.n) && epx.f(this.o, xxpVar.o) && this.p == xxpVar.p && epx.f(this.q, xxpVar.q) && this.r == xxpVar.r && epx.f(this.s, xxpVar.s) && epx.f(this.t, xxpVar.t) && this.u == xxpVar.u && this.v == xxpVar.v && this.w == xxpVar.w && this.x == xxpVar.x && epx.f(this.y, xxpVar.y) && this.z == xxpVar.z && this.A == xxpVar.A && this.B == xxpVar.B && this.C == xxpVar.C && this.D == xxpVar.D && epx.f(this.E, xxpVar.E) && this.F == xxpVar.F && this.G == xxpVar.G && epx.f(this.H, xxpVar.H) && epx.f(this.I, xxpVar.I);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        Uri uri = this.h;
        int b = qoy.b(shy.a(this.l, urd0.a(shy.a(this.j, qoy.b((uri == null ? 0 : uri.hashCode()) * 31, 31, this.i), 31), 31, this.k), 31), 31, this.m);
        String str = this.n;
        int b2 = qoy.b((this.o.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.p);
        String str2 = this.q;
        int b3 = qoy.b((b2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.r);
        String str3 = this.s;
        int hashCode = (b3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.t;
        int hashCode2 = (this.H.hashCode() + qoy.b(qoy.b(urd0.a(shy.a(this.D, shy.a(this.C, qoy.b(qoy.b(qoy.b(fw3.a(qoy.b(qoy.b(qoy.b(qoy.b((hashCode + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31), 31), 31, this.E), 31, this.F), 31, this.G)) * 31;
        NewsEntry newsEntry = this.I;
        return Integer.hashCode(0) + ((hashCode2 + (newsEntry == null ? 0 : newsEntry.hashCode())) * 31);
    }

    public final String toString() {
        return "EventAttachmentHolderUiDto(photoUri72Dp=" + this.h + ", shouldShowDynamicTime=" + this.i + ", date=" + this.j + ", dateString=" + this.k + ", dateTextColor=" + this.l + ", isDateVisible=" + this.m + ", nameText=" + this.n + ", verifyInfo=" + this.o + ", isVerifiedIconVisible=" + this.p + ", addressText=" + this.q + ", isAddressVisible=" + this.r + ", text=" + this.s + ", joinButtonText=" + this.t + ", isJoinButtonVisible=" + this.u + ", isLeaveButtonVisible=" + this.v + ", isFooterWrapperVisible=" + this.w + ", isFooterVisible=" + this.x + ", photosUris=" + this.y + ", arePhotosVisible=" + this.z + ", isLockIconVisible=" + this.A + ", isPrivacyMessageVisible=" + this.B + ", faveButtonBackgroundResId=" + this.C + ", faveButtonBackgroundColorAttrId=" + this.D + ", faveButtonContentDescription=" + this.E + ", isFaveButtonVisible=" + this.F + ", isActionsButtonVisible=" + this.G + ", attachment=" + this.H + ", entry=" + this.I + ", seqId=0)";
    }
}
