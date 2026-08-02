package xsna;

import java.util.ArrayList;

/* compiled from: MusicDynamicGridItemVh.kt */
/* loaded from: classes16.dex */
public final class tpo {
    public final String a;
    public final ArrayList b;

    public tpo(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpo)) {
            return false;
        }
        tpo tpoVar = (tpo) obj;
        return epx.f(this.a, tpoVar.a) && this.b.equals(tpoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicGridTileModel(title=");
        sb.append(this.a);
        sb.append(", images=");
        return bo.c(')', sb, this.b);
    }
}
