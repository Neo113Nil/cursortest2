package xsna;

import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import xsna.tlo0;

/* compiled from: CourierMapOneTimeEvent.kt */
/* loaded from: classes18.dex */
public interface kzj {

    /* compiled from: CourierMapOneTimeEvent.kt */
    public static final class a implements kzj {
    }

    /* compiled from: CourierMapOneTimeEvent.kt */
    public static final class b implements kzj {
        public final String a;

        public b() {
            this(null);
        }

        public b(String str) {
            this.a = str;
        }
    }

    /* compiled from: CourierMapOneTimeEvent.kt */
    public static final class c implements kzj {
        public final String a;
        public final Coordinates b;

        public c(String str, Coordinates coordinates) {
            this.a = str;
            this.b = coordinates;
        }
    }

    /* compiled from: CourierMapOneTimeEvent.kt */
    public static final class d implements kzj {
        public final tlo0.f a;

        public d(tlo0.f fVar) {
            this.a = fVar;
        }
    }
}
