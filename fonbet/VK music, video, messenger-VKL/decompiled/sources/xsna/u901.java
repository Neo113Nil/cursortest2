package xsna;

import android.content.SharedPreferences;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class u901 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ x901 e;

    public u901(x901 x901Var, String str, long j) {
        this.e = x901Var;
        exc0.f(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.o().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.o().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
