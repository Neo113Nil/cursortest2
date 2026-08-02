package sg.bigo.ads.ba;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class a {
    String a;
    sg.bigo.ads.ay.a b;
    d c;
    float d;
    int e;
    String f;

    public a(@NonNull sg.bigo.ads.ay.a aVar) {
        this.b = aVar;
        this.a = aVar.a;
    }

    public final void a(long j) {
        this.b.i = j;
    }

    public final void b(long j) {
        this.b.g = j;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != a.class) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.d.equals(aVar.b.d) && this.b.c.equals(aVar.b.c);
    }

    public String toString() {
        return this.b.toString();
    }
}
