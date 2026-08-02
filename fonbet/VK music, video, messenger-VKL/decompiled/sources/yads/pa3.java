package yads;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import xsna.l6g;

/* loaded from: classes10.dex */
public final class pa3 {
    public final String a;
    public final int b;
    public final int c;
    public int d;
    public String e;

    public pa3(int i, int i2, int i3) {
        this.a = i != Integer.MIN_VALUE ? l6g.a(i, DomExceptionUtils.SEPARATOR) : "";
        this.b = i2;
        this.c = i3;
        this.d = Integer.MIN_VALUE;
        this.e = "";
    }

    public final void a() {
        int i = this.d;
        this.d = i == Integer.MIN_VALUE ? this.b : i + this.c;
        this.e = this.a + this.d;
    }

    public final void b() {
        if (this.d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }
}
