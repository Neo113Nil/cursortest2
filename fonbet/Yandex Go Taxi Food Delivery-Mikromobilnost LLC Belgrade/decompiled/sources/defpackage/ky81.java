package defpackage;

import com.google.android.gms.common.Feature;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class ky81 {
    public final wn2 a;
    public final Feature b;

    public /* synthetic */ ky81(wn2 wn2Var, Feature feature) {
        this.a = wn2Var;
        this.b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ky81)) {
            return false;
        }
        ky81 ky81Var = (ky81) obj;
        return ooc.m(this.a, ky81Var.a) && ooc.m(this.b, ky81Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        kjz kjzVar = new kjz(this);
        kjzVar.b(this.a, "key");
        kjzVar.b(this.b, "feature");
        return kjzVar.toString();
    }
}
