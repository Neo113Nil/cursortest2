package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class mpg {
    public Uri a;
    public long b;
    public byte[] d;
    public long f;
    public String h;
    public int i;
    public int c = 1;
    public Map e = Collections.EMPTY_MAP;
    public long g = -1;

    public final npg a() {
        d6z.A(this.a, "The uri must be set.");
        return new npg(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
