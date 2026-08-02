package androidx.camera.video;

import defpackage.ny61;
import defpackage.w6e;
import defpackage.xnw0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes10.dex */
public final class a {
    public static final a d = new a(0, StreamInfo$StreamState.INACTIVE, null);
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final w6e f = new w6e(new a(0, StreamInfo$StreamState.ACTIVE, null));
    public final int a;
    public final StreamInfo$StreamState b;
    public final xnw0 c;

    public a(int i, StreamInfo$StreamState streamInfo$StreamState, xnw0 xnw0Var) {
        this.a = i;
        if (streamInfo$StreamState == null) {
            ny61.t("Null streamState");
            throw null;
        }
        this.b = streamInfo$StreamState;
        this.c = xnw0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.a == aVar.a && this.b.equals(aVar.b)) {
                xnw0 xnw0Var = aVar.c;
                xnw0 xnw0Var2 = this.c;
                if (xnw0Var2 != null ? xnw0Var2.equals(xnw0Var) : xnw0Var == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        xnw0 xnw0Var = this.c;
        return (xnw0Var == null ? 0 : xnw0Var.hashCode()) ^ hashCode;
    }

    public final String toString() {
        return "StreamInfo{id=" + this.a + ", streamState=" + this.b + ", inProgressTransformationInfo=" + this.c + "}";
    }
}
