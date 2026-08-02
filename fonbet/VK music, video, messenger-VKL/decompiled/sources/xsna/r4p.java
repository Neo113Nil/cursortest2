package xsna;

import java.util.Map;

/* compiled from: EditorSavedState.kt */
/* loaded from: classes4.dex */
public final class r4p {
    public final i4p a;
    public final Map<f5p, g5p> b;

    /* JADX WARN: Multi-variable type inference failed */
    public r4p(i4p i4pVar, Map<f5p, ? extends g5p> map) {
        this.a = i4pVar;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r4p)) {
            return false;
        }
        Map<f5p, g5p> map = this.b;
        for (f5p f5pVar : map.keySet()) {
            if (!epx.f(((r4p) obj).b.get(f5pVar), map.get(f5pVar))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EditorSavedState(imageState=" + this.a + ", toolParams=" + this.b + ")";
    }
}
