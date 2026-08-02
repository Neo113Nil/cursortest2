package xsna;

import java.util.Arrays;

/* compiled from: Meter.kt */
/* loaded from: classes4.dex */
public final class zi20 {
    public final kbe a;
    public final String b;
    public long c = System.currentTimeMillis();

    public zi20(kbe kbeVar, String str) {
        this.a = kbeVar;
        this.b = str;
    }

    public final void a(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        n4p n4pVar = ((w3p) this.a.c).u;
        if (n4pVar != null) {
            n4pVar.d(this.b + ": " + String.format(str, Arrays.copyOf(new Object[]{Long.valueOf(currentTimeMillis - this.c)}, 1)));
        }
        this.c = currentTimeMillis;
    }
}
