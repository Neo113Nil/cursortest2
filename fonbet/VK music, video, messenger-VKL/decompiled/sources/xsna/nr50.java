package xsna;

import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.Description;
import com.vk.newsfeed.common.data.displayitems.AdVkFeedItemState;

/* compiled from: MyTargetInternalNativeAdVideoSinglePartUiDto.kt */
/* loaded from: classes4.dex */
public final class nr50 extends ol60 implements jr50 {
    public final int h;
    public final gjx i;
    public final MyTargetNativeAdEntry j;
    public final AdVkFeedItemState k;
    public final String l;
    public final Description m;
    public final Description n;
    public final Description o;
    public final Description p;
    public final jq6 q;
    public final u1c0 r;
    public final float s;
    public final boolean t;

    public nr50(int i, gjx gjxVar, MyTargetNativeAdEntry myTargetNativeAdEntry, AdVkFeedItemState adVkFeedItemState, String str, Description description, Description description2, Description description3, Description description4, jq6 jq6Var, u1c0 u1c0Var, float f, boolean z) {
        super(367, 0, i, 0, null);
        this.h = i;
        this.i = gjxVar;
        this.j = myTargetNativeAdEntry;
        this.k = adVkFeedItemState;
        this.l = str;
        this.m = description;
        this.n = description2;
        this.o = description3;
        this.p = description4;
        this.q = jq6Var;
        this.r = u1c0Var;
        this.s = f;
        this.t = z;
    }

    @Override // xsna.jr50
    public final Description a() {
        return this.m;
    }

    @Override // xsna.jr50
    public final Description b() {
        return this.n;
    }

    @Override // xsna.jr50
    public final MyTargetNativeAdEntry c() {
        return this.j;
    }

    @Override // xsna.jr50
    public final gjx d() {
        return this.i;
    }

    @Override // xsna.jr50
    public final Description e() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr50)) {
            return false;
        }
        nr50 nr50Var = (nr50) obj;
        return this.h == nr50Var.h && epx.f(this.i, nr50Var.i) && epx.f(this.j, nr50Var.j) && this.k == nr50Var.k && epx.f(this.l, nr50Var.l) && epx.f(this.m, nr50Var.m) && epx.f(this.n, nr50Var.n) && epx.f(this.o, nr50Var.o) && epx.f(this.p, nr50Var.p) && epx.f(this.q, nr50Var.q) && epx.f(this.r, nr50Var.r) && Float.compare(this.s, nr50Var.s) == 0 && this.t == nr50Var.t;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.h;
    }

    @Override // xsna.jr50
    public final AdVkFeedItemState getState() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = (this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + (Integer.hashCode(this.h) * 31)) * 31)) * 31)) * 31;
        String str = this.l;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Description description = this.m;
        int hashCode3 = (hashCode2 + (description == null ? 0 : description.hashCode())) * 31;
        Description description2 = this.n;
        int hashCode4 = (hashCode3 + (description2 == null ? 0 : description2.hashCode())) * 31;
        Description description3 = this.o;
        int hashCode5 = (hashCode4 + (description3 == null ? 0 : description3.hashCode())) * 31;
        Description description4 = this.p;
        return Boolean.hashCode(this.t) + io.reactivex.rxjava3.subjects.b.a(this.s, (this.r.hashCode() + ((this.q.hashCode() + ((hashCode5 + (description4 != null ? description4.hashCode() : 0)) * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTargetInternalNativeAdVideoSinglePartUiDto(seqId=");
        sb.append(this.h);
        sb.append(", internalNativeBanner=");
        sb.append(this.i);
        sb.append(", rawEntry=");
        sb.append(this.j);
        sb.append(", state=");
        sb.append(this.k);
        sb.append(", title=");
        sb.append(this.l);
        sb.append(", ageRestriction=");
        sb.append(this.m);
        sb.append(", advertisingLabel=");
        sb.append(this.n);
        sb.append(", description=");
        sb.append(this.o);
        sb.append(", compositeCategory=");
        sb.append(this.p);
        sb.append(", baseVideoAutoplayHolderUiDto=");
        sb.append(this.q);
        sb.append(", footerDisplayItem=");
        sb.append(this.r);
        sb.append(", aspectRatio=");
        sb.append(this.s);
        sb.append(", displayAsClip=");
        return defpackage.q0.a(sb, this.t, ')');
    }
}
