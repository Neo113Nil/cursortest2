package xsna;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.ironsource.C4217a2;
import kotlin.NoWhenBranchMatchedException;
import xsna.cmx0;

/* compiled from: PreferencesTrackerStore.kt */
/* loaded from: classes3.dex */
public final class dzc0 implements shp0 {
    public final SharedPreferences a;
    public final long b;
    public final bpn0 c = new bpn0(new m960(this, 14));

    public dzc0(SharedPreferences sharedPreferences, long j) {
        this.a = sharedPreferences;
        this.b = j;
    }

    public final cmx0 a() {
        return ((gsw) this.c.getValue()).a();
    }

    public final boolean b(cmx0 cmx0Var) {
        String str;
        bpn0 bpn0Var = this.c;
        boolean z = !epx.f(((gsw) bpn0Var.getValue()).a(), cmx0Var);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (cmx0Var instanceof cmx0.b) {
            str = "enabled";
        } else if (cmx0Var instanceof cmx0.a) {
            str = C4217a2.e;
        } else {
            if (!cmx0Var.equals(cmx0.d.a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "unknown";
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString("state", str);
        edit.putLong("taken", elapsedRealtime);
        edit.putLong("expiry", elapsedRealtime + this.b);
        edit.apply();
        ((gsw) bpn0Var.getValue()).b(cmx0Var);
        return z;
    }
}
