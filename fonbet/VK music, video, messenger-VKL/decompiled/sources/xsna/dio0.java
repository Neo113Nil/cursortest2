package xsna;

import com.vk.feed.core.models.attachment.EntryAttachment;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.typography.FontFamily;
import java.util.List;

/* compiled from: TextHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class dio0 extends ol60 {
    public final List<EntryAttachment> A;
    public final String B;
    public final String C;
    public final boolean D;
    public final NewsEntry h;
    public final NewsEntry i;
    public final boolean j;
    public final boolean k;
    public final v1c0 l;
    public final String m;
    public final fj90 n;
    public final FontFamily o;
    public final boolean p;
    public final float q;
    public final s1q r;
    public final boolean s;
    public final int t;
    public final int u;
    public final float v;
    public final float w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public dio0(NewsEntry newsEntry, NewsEntry newsEntry2, boolean z, boolean z2, v1c0 v1c0Var, String str, fj90 fj90Var, FontFamily fontFamily, boolean z3, float f, s1q s1qVar, boolean z4, int i, int i2, float f2, float f3, boolean z5, boolean z6, boolean z7, List list, String str2, String str3, boolean z8) {
        super(2, 0, 0, 0, null);
        this.h = newsEntry;
        this.i = newsEntry2;
        this.j = z;
        this.k = z2;
        this.l = v1c0Var;
        this.m = str;
        this.n = fj90Var;
        this.o = fontFamily;
        this.p = z3;
        this.q = f;
        this.r = s1qVar;
        this.s = z4;
        this.t = i;
        this.u = i2;
        this.v = f2;
        this.w = f3;
        this.x = z5;
        this.y = z6;
        this.z = z7;
        this.A = list;
        this.B = str2;
        this.C = str3;
        this.D = z8;
    }

    public static dio0 i(dio0 dio0Var, s1q s1qVar, int i, int i2, int i3) {
        NewsEntry newsEntry = dio0Var.h;
        NewsEntry newsEntry2 = dio0Var.i;
        boolean z = dio0Var.j;
        boolean z2 = dio0Var.k;
        v1c0 v1c0Var = dio0Var.l;
        String str = dio0Var.m;
        fj90 fj90Var = dio0Var.n;
        FontFamily fontFamily = dio0Var.o;
        boolean z3 = dio0Var.p;
        float f = dio0Var.q;
        s1q s1qVar2 = (i3 & 1024) != 0 ? dio0Var.r : s1qVar;
        boolean z4 = dio0Var.s;
        int i4 = (i3 & 4096) != 0 ? dio0Var.t : i;
        int i5 = (i3 & 8192) != 0 ? dio0Var.u : i2;
        float f2 = dio0Var.v;
        int i6 = i5;
        float f3 = dio0Var.w;
        boolean z5 = dio0Var.x;
        boolean z6 = dio0Var.y;
        boolean z7 = dio0Var.z;
        List<EntryAttachment> list = dio0Var.A;
        String str2 = dio0Var.B;
        String str3 = dio0Var.C;
        boolean z8 = dio0Var.D;
        dio0Var.getClass();
        dio0Var.getClass();
        return new dio0(newsEntry, newsEntry2, z, z2, v1c0Var, str, fj90Var, fontFamily, z3, f, s1qVar2, z4, i4, i6, f2, f3, z5, z6, z7, list, str2, str3, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dio0)) {
            return false;
        }
        dio0 dio0Var = (dio0) obj;
        return epx.f(this.h, dio0Var.h) && epx.f(this.i, dio0Var.i) && this.j == dio0Var.j && this.k == dio0Var.k && epx.f(this.l, dio0Var.l) && epx.f(this.m, dio0Var.m) && epx.f(this.n, dio0Var.n) && this.o == dio0Var.o && this.p == dio0Var.p && Float.compare(this.q, dio0Var.q) == 0 && epx.f(this.r, dio0Var.r) && this.s == dio0Var.s && this.t == dio0Var.t && this.u == dio0Var.u && Float.compare(this.v, dio0Var.v) == 0 && Float.compare(this.w, dio0Var.w) == 0 && this.x == dio0Var.x && this.y == dio0Var.y && this.z == dio0Var.z && epx.f(this.A, dio0Var.A) && epx.f(this.B, dio0Var.B) && epx.f(this.C, dio0Var.C) && this.D == dio0Var.D;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = (this.l.hashCode() + qoy.b(qoy.b(e630.b(this.h.hashCode() * 31, 31, this.i), 31, this.j), 31, this.k)) * 31;
        String str = this.m;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        fj90 fj90Var = this.n;
        int a = io.reactivex.rxjava3.subjects.b.a(this.q, qoy.b((this.o.hashCode() + ((hashCode2 + (fj90Var == null ? 0 : fj90Var.hashCode())) * 31)) * 31, 31, this.p), 31);
        s1q s1qVar = this.r;
        int a2 = fw3.a(qoy.b(qoy.b(qoy.b(io.reactivex.rxjava3.subjects.b.a(this.w, io.reactivex.rxjava3.subjects.b.a(this.v, shy.a(this.u, shy.a(this.t, qoy.b((a + (s1qVar == null ? 0 : s1qVar.hashCode())) * 31, 31, this.s), 31), 31), 31), 31), 31, this.x), 31, this.y), 31, this.z), 31, this.A);
        String str2 = this.B;
        return Integer.hashCode(0) + qoy.b(urd0.a((a2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.C), 31, this.D);
    }

    public final s1q j() {
        return this.r;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextHolderUiDto(entry=");
        sb.append(this.h);
        sb.append(", rootEntry=");
        sb.append(this.i);
        sb.append(", isInRepost=");
        sb.append(this.j);
        sb.append(", isInLegoTheme=");
        sb.append(this.k);
        sb.append(", displayItemContext=");
        sb.append(this.l);
        sb.append(", text=");
        sb.append(this.m);
        sb.append(", parsedText=");
        sb.append(this.n);
        sb.append(", fontFamily=");
        sb.append(this.o);
        sb.append(", hasObsceneText=");
        sb.append(this.p);
        sb.append(", textSize=");
        sb.append(this.q);
        sb.append(", excerptConfig=");
        sb.append(this.r);
        sb.append(", hasExcerptConfig=");
        sb.append(this.s);
        sb.append(", bottomPadding=");
        sb.append(this.t);
        sb.append(", topPadding=");
        sb.append(this.u);
        sb.append(", lineSpacingAdd=");
        sb.append(this.v);
        sb.append(", lineSpacingMult=");
        sb.append(this.w);
        sb.append(", shouldTrimByCuttableSpans=");
        sb.append(this.x);
        sb.append(", expandCollapsePostEnabled=");
        sb.append(this.y);
        sb.append(", textCopyingEnabled=");
        sb.append(this.z);
        sb.append(", chipsAttachmentsInText=");
        sb.append(this.A);
        sb.append(", chipAuthorFirstName=");
        sb.append(this.B);
        sb.append(", chipAuthorLastName=");
        sb.append(this.C);
        sb.append(", bindChipSpan=");
        return n23.b(sb, this.D, ", seqId=0)");
    }
}
