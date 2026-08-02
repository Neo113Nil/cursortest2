package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes10.dex */
public final class t30 {
    public Uri a;
    public long d;
    public String f;
    public int g;
    public final int b = 1;
    public final Map c = Collections.EMPTY_MAP;
    public long e = -1;

    public final u30 a() {
        ni.a(this.a, "The uri must be set.");
        return new u30(this.a, 0L, this.b, null, this.c, this.d, this.e, this.f, this.g, null);
    }

    public final t30 a(int i) {
        this.g = i;
        return this;
    }

    public final t30 a(String str) {
        this.f = str;
        return this;
    }

    public final t30 a(Uri uri) {
        this.a = uri;
        return this;
    }
}
