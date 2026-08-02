package xsna;

import java.util.ArrayList;

/* compiled from: AttachmentsPhotoMarketTagsSnapshot.kt */
/* loaded from: classes7.dex */
public final class v84 {
    public final boolean a;
    public final boolean b;
    public final ArrayList c;

    public v84(ArrayList arrayList, boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v84)) {
            return false;
        }
        v84 v84Var = (v84) obj;
        return this.a == v84Var.a && this.b == v84Var.b && this.c.equals(v84Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachmentsPhotoMarketTagsSnapshot(hasMarketTags=");
        sb.append(this.a);
        sb.append(", tagsLoaded=");
        sb.append(this.b);
        sb.append(", taggedGoods=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
    }
}
