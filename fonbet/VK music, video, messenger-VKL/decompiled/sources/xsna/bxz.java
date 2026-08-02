package xsna;

import android.content.Context;
import java.util.List;

/* compiled from: LocalizedText.kt */
/* loaded from: classes5.dex */
public final class bxz implements wwz {
    public final List<wwz> a;

    /* JADX WARN: Multi-variable type inference failed */
    public bxz(List<? extends wwz> list) {
        this.a = list;
    }

    @Override // xsna.wwz
    public final String a(Context context) {
        return j5g.g0(this.a, "", null, null, 0, new axz(context, 0), 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxz) && epx.f(this.a, ((bxz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return j5g.g0(this.a, "", null, null, 0, null, 62);
    }
}
