package xsna;

import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: CourierMapViewState.kt */
/* loaded from: classes18.dex */
public abstract class ht0 {
    public final tlo0.f a;
    public final boolean b;

    /* compiled from: CourierMapViewState.kt */
    public static final class a extends ht0 {
        public static final a c = new a(tq.h(tlo0.Companion, R.string.ecomm_checkout_input_address), true);
    }

    /* compiled from: CourierMapViewState.kt */
    public static final class b extends ht0 {
        public b() {
            super(tq.h(tlo0.Companion, R.string.ecomm_checkout_deliver_here), false);
        }

        @Override // xsna.ht0
        public final boolean a() {
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "DeliverHere(isEnabled=false)";
        }
    }

    public ht0(tlo0.f fVar, boolean z) {
        this.a = fVar;
        this.b = z;
    }

    public boolean a() {
        return this.b;
    }
}
