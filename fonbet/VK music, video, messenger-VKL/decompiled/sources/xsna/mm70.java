package xsna;

import android.content.Intent;

/* compiled from: NspkChooserNavigationEvent.kt */
/* loaded from: classes2.dex */
public abstract class mm70 implements vl50 {

    /* compiled from: NspkChooserNavigationEvent.kt */
    public static final class a extends mm70 {
        public static final a a = new a();
    }

    /* compiled from: NspkChooserNavigationEvent.kt */
    public static final class b extends mm70 {
        public final Intent a;

        public b(Intent intent) {
            this.a = intent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenBankApp(intent=" + this.a + ')';
        }
    }
}
