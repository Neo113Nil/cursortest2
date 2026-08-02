package defpackage;

import android.net.Uri;

/* loaded from: classes10.dex */
public final class n74 extends ny80 {
    public final Uri a;

    public n74(Uri uri) {
        if (uri != null) {
            this.a = uri;
        } else {
            ny61.t("Null outputUri");
            throw null;
        }
    }

    @Override // defpackage.ny80
    public final Uri a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ny80) {
            return this.a.equals(((ny80) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OutputResults{outputUri=" + this.a + "}";
    }
}
