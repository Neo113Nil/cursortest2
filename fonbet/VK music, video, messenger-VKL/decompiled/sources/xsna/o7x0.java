package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: VpnSnackbarManager.kt */
/* loaded from: classes16.dex */
public final class o7x0 {
    public static final /* synthetic */ qcy<Object>[] g;
    public final Context a;
    public final a b;
    public final ih80 c;
    public final ky6 d;
    public final pgn e;
    public ikv0 f;

    /* compiled from: VpnSnackbarManager.kt */
    public static final class a {
        public final long a;
        public final long b;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(showFrequencyHours=");
            sb.append(this.a);
            sb.append(", showDurationMs=");
            return vu5.a(')', this.b, sb);
        }

        public a(int i) {
            this.a = 7L;
            this.b = 10000L;
        }
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(o7x0.class, "disposable", "getDisposable()Lio/reactivex/rxjava3/disposables/Disposable;", 0);
        fpf0.a.getClass();
        g = new qcy[]{mutablePropertyReference1Impl};
    }

    public o7x0(Context context, a aVar, ih80 ih80Var) {
        ky6 j = Preference.j();
        this.a = context;
        this.b = aVar;
        this.c = ih80Var;
        this.d = j;
        this.e = new pgn();
    }
}
