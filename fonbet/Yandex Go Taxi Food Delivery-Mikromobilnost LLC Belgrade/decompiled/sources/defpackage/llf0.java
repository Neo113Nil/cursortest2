package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes5.dex */
public final class llf0 {
    public final String a;
    public final nsz b;
    public final int c;
    public final double d;
    public final int e;
    public final Bitmap f;

    public llf0(String str, nsz nszVar, int i, double d, int i2, Bitmap bitmap, int i3) {
        nszVar = (i3 & 2) != 0 ? null : nszVar;
        i = (i3 & 4) != 0 ? 0 : i;
        d = (i3 & 8) != 0 ? 0.0d : d;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        bitmap = (i3 & 32) != 0 ? null : bitmap;
        this.a = str;
        this.b = nszVar;
        this.c = i;
        this.d = d;
        this.e = i2;
        this.f = bitmap;
    }

    public final double a() {
        return this.d;
    }

    public final nsz b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final Bitmap d() {
        return this.f;
    }

    public final int e() {
        return this.e;
    }

    public final String f() {
        return this.a;
    }
}
