package xsna;

import kotlin.Pair;
import org.json.JSONObject;

/* compiled from: MediaViewParams.kt */
/* loaded from: classes4.dex */
public final class o020 implements g5p {
    public final Float a;
    public final boolean b;

    public o020() {
        this(null);
    }

    @Override // xsna.g5p
    public final boolean I() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o020) && epx.f(this.a, ((o020) obj).a);
    }

    @Override // xsna.g5p
    public final f5p getId() {
        return u020.a;
    }

    public final int hashCode() {
        Float f = this.a;
        if (f == null) {
            return 0;
        }
        return f.hashCode();
    }

    public final String toString() {
        return new JSONObject(on00.f(new Pair("aspectRatio", this.a))).toString();
    }

    public o020(Float f) {
        this.a = f;
        this.b = true;
    }
}
