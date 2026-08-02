package xsna;

import xsna.tlo0;

/* compiled from: CommunityCheckListHeaderItem.kt */
/* loaded from: classes18.dex */
public final class hwg implements hfz {
    public final String b;
    public final String c;
    public final tlo0.f d;
    public final tlo0.f e;
    public final tlo0.g f;
    public final int g;
    public final int h;

    public hwg(String str, String str2, tlo0.f fVar, tlo0.f fVar2, tlo0.g gVar, int i, int i2) {
        this.b = str;
        this.c = str2;
        this.d = fVar;
        this.e = fVar2;
        this.f = gVar;
        this.g = i;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwg)) {
            return false;
        }
        hwg hwgVar = (hwg) obj;
        return this.b.equals(hwgVar.b) && this.c.equals(hwgVar.c) && this.d.equals(hwgVar.d) && this.e.equals(hwgVar.e) && this.f.equals(hwgVar.f) && this.g == hwgVar.g && this.h == hwgVar.h;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + shy.a(this.g, (this.f.hashCode() + shy.a(this.e.a, shy.a(this.d.a, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommunityCheckListHeaderItem(imageLightUrl=");
        sb.append(this.b);
        sb.append(", imageDarkUrl=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", progressTitle=");
        sb.append(this.f);
        sb.append(", completedTipsCount=");
        sb.append(this.g);
        sb.append(", totalTipsCount=");
        return vu5.b(sb, this.h, ')');
    }
}
