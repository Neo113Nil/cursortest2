package xsna;

import com.vk.donut.price.model.template.DonutPriceTemplate;
import java.util.ArrayList;

/* compiled from: DonutHorizontalGalleryTeaserUiDto.kt */
/* loaded from: classes4.dex */
public final class zzn extends ol60 {
    public final ArrayList h;
    public final String i;
    public final String j;
    public final DonutPriceTemplate k;
    public final r1o l;
    public final Float m;

    public zzn(ArrayList arrayList, String str, String str2, DonutPriceTemplate donutPriceTemplate, r1o r1oVar, Float f) {
        super(22, 0, 0, 0, null);
        this.h = arrayList;
        this.i = str;
        this.j = str2;
        this.k = donutPriceTemplate;
        this.l = r1oVar;
        this.m = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return epx.f(this.h, zznVar.h) && epx.f(this.i, zznVar.i) && epx.f(this.j, zznVar.j) && epx.f(this.k, zznVar.k) && epx.f(this.l, zznVar.l) && epx.f(this.m, zznVar.m);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        int hashCode = this.h.hashCode() * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DonutPriceTemplate donutPriceTemplate = this.k;
        int hashCode4 = (this.l.hashCode() + ((hashCode3 + (donutPriceTemplate == null ? 0 : donutPriceTemplate.b.hashCode())) * 31)) * 31;
        Float f = this.m;
        return Integer.hashCode(0) + ((hashCode4 + (f == null ? 0 : f.hashCode())) * 31);
    }

    public final String toString() {
        return "DonutHorizontalGalleryTeaserUiDto(images=" + this.h + ", placeholderDescription=" + this.i + ", placeholderAction=" + this.j + ", donutPriceTemplate=" + this.k + ", action=" + this.l + ", ratio=" + this.m + ", seqId=0)";
    }
}
