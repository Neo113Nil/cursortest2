package xsna;

import com.vk.dto.newsfeed.entries.MyTargetNativeAdEntry;
import com.vk.feed.core.models.Description;
import com.vk.newsfeed.common.data.displayitems.AdVkFeedItemState;
import java.util.ArrayList;

/* compiled from: MyTargetInternalNativeAdCarouselSinglePartUiDto.kt */
/* loaded from: classes4.dex */
public final class tq50 extends ol60 implements jr50 {
    public final gjx h;
    public final MyTargetNativeAdEntry i;
    public final AdVkFeedItemState j;
    public final String k;
    public final Description l;
    public final Description m;
    public final Description n;
    public final Description o;
    public final ArrayList p;

    public tq50(gjx gjxVar, MyTargetNativeAdEntry myTargetNativeAdEntry, AdVkFeedItemState adVkFeedItemState, String str, Description description, Description description2, Description description3, Description description4, ArrayList arrayList) {
        super(371, 0, 0, 0, null);
        this.h = gjxVar;
        this.i = myTargetNativeAdEntry;
        this.j = adVkFeedItemState;
        this.k = str;
        this.l = description;
        this.m = description2;
        this.n = description3;
        this.o = description4;
        this.p = arrayList;
    }

    @Override // xsna.jr50
    public final Description a() {
        return this.l;
    }

    @Override // xsna.jr50
    public final Description b() {
        return this.m;
    }

    @Override // xsna.jr50
    public final MyTargetNativeAdEntry c() {
        return this.i;
    }

    @Override // xsna.jr50
    public final gjx d() {
        return this.h;
    }

    @Override // xsna.jr50
    public final Description e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq50)) {
            return false;
        }
        tq50 tq50Var = (tq50) obj;
        tq50Var.getClass();
        return epx.f(this.h, tq50Var.h) && epx.f(this.i, tq50Var.i) && this.j == tq50Var.j && epx.f(this.k, tq50Var.k) && epx.f(this.l, tq50Var.l) && epx.f(this.m, tq50Var.m) && epx.f(this.n, tq50Var.n) && epx.f(this.o, tq50Var.o) && epx.f(this.p, tq50Var.p);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    @Override // xsna.jr50
    public final AdVkFeedItemState getState() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + (Integer.hashCode(0) * 31)) * 31)) * 31)) * 31;
        String str = this.k;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Description description = this.l;
        int hashCode3 = (hashCode2 + (description == null ? 0 : description.hashCode())) * 31;
        Description description2 = this.m;
        int hashCode4 = (hashCode3 + (description2 == null ? 0 : description2.hashCode())) * 31;
        Description description3 = this.n;
        int hashCode5 = (hashCode4 + (description3 == null ? 0 : description3.hashCode())) * 31;
        Description description4 = this.o;
        return this.p.hashCode() + ((hashCode5 + (description4 != null ? description4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MyTargetInternalNativeAdCarouselSinglePartUiDto(seqId=0, internalNativeBanner=");
        sb.append(this.h);
        sb.append(", rawEntry=");
        sb.append(this.i);
        sb.append(", state=");
        sb.append(this.j);
        sb.append(", title=");
        sb.append(this.k);
        sb.append(", ageRestriction=");
        sb.append(this.l);
        sb.append(", advertisingLabel=");
        sb.append(this.m);
        sb.append(", description=");
        sb.append(this.n);
        sb.append(", compositeCategory=");
        sb.append(this.o);
        sb.append(", cards=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.p);
    }
}
