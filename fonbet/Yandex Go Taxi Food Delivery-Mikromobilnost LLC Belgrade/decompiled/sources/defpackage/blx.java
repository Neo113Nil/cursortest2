package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class blx {
    public final float a;
    public final int b;
    public final List c;
    public final int d;
    public final int e;
    public final int f;

    public blx(float f, ArrayList arrayList, int i, int i2, int i3) {
        this.a = f;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = i;
        this.e = i2;
        while (i <= i2) {
            if (((alx) arrayList.get(i)).f == 0.0f) {
                this.b++;
            }
            i++;
        }
        this.f = i3;
    }

    public final alx a() {
        return (alx) this.c.get(this.d);
    }

    public final alx b() {
        return (alx) this.c.get(0);
    }

    public final alx c() {
        return (alx) this.c.get(this.e);
    }

    public final alx d() {
        return (alx) b64.c(1, this.c);
    }
}
