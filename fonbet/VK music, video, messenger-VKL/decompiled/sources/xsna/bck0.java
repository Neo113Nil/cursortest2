package xsna;

import android.os.Bundle;
import java.util.Objects;
import ru.ok.android.api.core.ApiInvocationException;

/* compiled from: SnippetPlaybackParams.kt */
/* loaded from: classes3.dex */
public final class bck0 {
    public final kx40 a;
    public final boolean b;
    public final Bundle c;

    /* JADX WARN: Multi-variable type inference failed */
    public bck0() {
        this((kx40) null, (Bundle) (0 == true ? 1 : 0), 7);
    }

    public static bck0 a(bck0 bck0Var, kx40 kx40Var) {
        boolean z = bck0Var.b;
        Bundle bundle = bck0Var.c;
        bck0Var.getClass();
        return new bck0(kx40Var, z, bundle);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bck0)) {
            return false;
        }
        bck0 bck0Var = (bck0) obj;
        return epx.f(this.a, bck0Var.a) && this.b == bck0Var.b && epx.f(this.c, bck0Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b), this.c);
    }

    public final String toString() {
        return xqm0.g("<" + bck0.class.getSimpleName() + "> \n            isLoopEnabled: " + this.b + ",\n            payload: " + this.c + ",\n            playbackParams: " + this.a + "\n        ");
    }

    public bck0(kx40 kx40Var, boolean z, Bundle bundle) {
        this.a = kx40Var;
        this.b = z;
        this.c = bundle;
    }

    public /* synthetic */ bck0(kx40 kx40Var, Bundle bundle, int i) {
        this((i & 1) != 0 ? new kx40(null, null, null, null, null, false, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED) : kx40Var, false, (i & 4) != 0 ? Bundle.EMPTY : bundle);
    }
}
