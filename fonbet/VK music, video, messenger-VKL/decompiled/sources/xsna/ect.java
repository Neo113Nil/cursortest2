package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;

/* compiled from: GamesCatalogEventBus.kt */
/* loaded from: classes17.dex */
public abstract class ect {

    /* compiled from: GamesCatalogEventBus.kt */
    public static final class a extends ect {
        public final int a;

        public a(int i) {
            this.a = i;
        }
    }

    /* compiled from: GamesCatalogEventBus.kt */
    public static final class b extends ect {
        public final long a;

        public b(long j) {
            this.a = j;
        }
    }

    /* compiled from: GamesCatalogEventBus.kt */
    public static final class c extends ect {
    }

    /* compiled from: GamesCatalogEventBus.kt */
    public static final class d extends ect {
        public final WebApiApplication a;

        public d(WebApiApplication webApiApplication) {
            this.a = webApiApplication;
        }
    }

    /* compiled from: GamesCatalogEventBus.kt */
    public static final class e extends ect {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1532173443;
        }

        public final String toString() {
            return "ReadAllNotification";
        }
    }
}
