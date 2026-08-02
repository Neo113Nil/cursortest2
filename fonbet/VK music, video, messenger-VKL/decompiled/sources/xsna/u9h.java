package xsna;

import java.util.ArrayList;
import xsna.tlo0;

/* compiled from: CommunityMarksStatisticItem.kt */
/* loaded from: classes18.dex */
public final class u9h implements hfz {
    public final tlo0.d b;
    public final float c;
    public final String d;
    public final int e;
    public final ArrayList f;
    public final boolean g;

    public u9h(tlo0.d dVar, float f, String str, int i, ArrayList arrayList, boolean z) {
        this.b = dVar;
        this.c = f;
        this.d = str;
        this.e = i;
        this.f = arrayList;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9h)) {
            return false;
        }
        u9h u9hVar = (u9h) obj;
        return this.b.equals(u9hVar.b) && Float.compare(this.c, u9hVar.c) == 0 && this.d.equals(u9hVar.d) && this.e == u9hVar.e && this.f.equals(u9hVar.f) && this.g == u9hVar.g;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qr.a(this.f, shy.a(this.e, urd0.a(io.reactivex.rxjava3.subjects.b.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityMarksStatisticItem(descriptionText=");
        sb.append(this.b);
        sb.append(", rating=");
        sb.append(this.c);
        sb.append(", ratingText=");
        sb.append(this.d);
        sb.append(", reviewCount=");
        sb.append(this.e);
        sb.append(", marksStat=");
        sb.append(this.f);
        sb.append(", isEnabled=");
        return defpackage.q0.a(sb, this.g, ')');
    }
}
