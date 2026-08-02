package xsna;

import androidx.compose.foundation.lazy.layout.a;

/* compiled from: IntervalList.kt */
/* loaded from: classes11.dex */
public final class nox<T> {
    public final int a;
    public final int b;
    public final a.InterfaceC0009a c;

    public nox(int i, int i2, a.InterfaceC0009a interfaceC0009a) {
        this.a = i;
        this.b = i2;
        this.c = interfaceC0009a;
        if (i < 0) {
            xzw.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        xzw.a("size should be > 0");
    }
}
