package defpackage;

import com.google.android.gms.internal.play_billing.zzcv;

/* loaded from: classes11.dex */
public abstract class p991 {
    public abstract zzcv a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p991) {
            return a().equals(((p991) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
