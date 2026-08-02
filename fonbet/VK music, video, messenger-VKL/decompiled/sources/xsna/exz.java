package xsna;

import android.content.Context;

/* compiled from: LocalizedText.kt */
/* loaded from: classes5.dex */
public final class exz implements wwz {
    public final String a;

    public exz(String str) {
        this.a = str;
    }

    @Override // xsna.wwz
    public final String a(Context context) {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exz) && epx.f(this.a, ((exz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
