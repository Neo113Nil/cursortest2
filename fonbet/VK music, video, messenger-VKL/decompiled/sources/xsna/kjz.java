package xsna;

import android.view.ViewGroup;
import xsna.dai;

/* compiled from: LiveInlineHolderViewState.kt */
/* loaded from: classes16.dex */
public final class kjz {
    public final dai.e<ViewGroup, yjk0> a;
    public final dai.c b;

    public kjz() {
        this(null);
    }

    public final dai.e<ViewGroup, yjk0> a() {
        return this.a;
    }

    public final dai.c b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjz)) {
            return false;
        }
        kjz kjzVar = (kjz) obj;
        return epx.f(this.a, kjzVar.a) && epx.f(this.b, kjzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LiveInlineHolderViewState(onViewCreated=" + this.a + ", onViewDisposed=" + this.b + ')';
    }

    public kjz(Object obj) {
        dai.e<ViewGroup, yjk0> eVar = new dai.e<>();
        dai.c cVar = new dai.c();
        this.a = eVar;
        this.b = cVar;
    }
}
