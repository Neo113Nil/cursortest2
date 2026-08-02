package xsna;

import java.util.ArrayList;

/* compiled from: TimelineBlock.kt */
/* loaded from: classes18.dex */
public final class gwo0 {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public gwo0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwo0)) {
            return false;
        }
        gwo0 gwo0Var = (gwo0) obj;
        return this.a.equals(gwo0Var.a) && this.b.equals(gwo0Var.b) && this.c.equals(gwo0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qr.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimelineBlock(videoItems=");
        sb.append(this.a);
        sb.append(", audioItems=");
        sb.append(this.b);
        sb.append(", stickerItems=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
    }
}
