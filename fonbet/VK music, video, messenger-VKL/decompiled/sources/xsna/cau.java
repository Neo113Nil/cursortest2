package xsna;

import android.content.Intent;

/* compiled from: GooglePayTransactionEvent.kt */
/* loaded from: classes6.dex */
public final class cau {
    public final Intent a;
    public final int b;

    public cau(int i, Intent intent) {
        this.a = intent;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cau)) {
            return false;
        }
        cau cauVar = (cau) obj;
        return epx.f(this.a, cauVar.a) && this.b == cauVar.b;
    }

    public final int hashCode() {
        Intent intent = this.a;
        return Integer.hashCode(this.b) + ((intent == null ? 0 : intent.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GooglePayTransactionEvent(data=");
        sb.append(this.a);
        sb.append(", resultCode=");
        return vu5.b(sb, this.b, ')');
    }
}
