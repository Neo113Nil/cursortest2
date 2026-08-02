package defpackage;

import android.os.SystemClock;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes9.dex */
public final class e8y {
    public static final x7y Companion = new x7y();
    public static final i3y[] g;
    public final w7y a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;
    public final long f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{null, null, null, a.b(lazyThreadSafetyMode, new wwx(7)), a.b(lazyThreadSafetyMode, new wwx(8))};
    }

    public /* synthetic */ e8y(int i, w7y w7yVar, String str, String str2, List list, List list2) {
        if (30 != (i & 30)) {
            qje.Z(i, 30, t7y.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = new w7y();
        } else {
            this.a = w7yVar;
        }
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = list2;
        this.f = SystemClock.elapsedRealtimeNanos();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LbsParams(common=");
        sb.append(this.a);
        sb.append(", ip=");
        sb.append(this.b);
        sb.append(", id='");
        tse0.x(this.c, "', gsmCells=", ", wifiNetworks=", sb, this.d);
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }

    public e8y(String str, String str2, List list, List list2) {
        this.a = new w7y();
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = list2;
        this.f = SystemClock.elapsedRealtimeNanos();
    }
}
