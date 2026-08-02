package defpackage;

import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class g1b {
    public final String a;
    public final DriveState b;
    public final boolean c;
    public final String d;

    public g1b(String str, DriveState driveState, boolean z, String str2) {
        this.a = str;
        this.b = driveState;
        this.c = z;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1b)) {
            return false;
        }
        g1b g1bVar = (g1b) obj;
        return jl40.l(this.a, g1bVar.a) && this.b == g1bVar.b && this.c == g1bVar.c && jl40.l(this.d, g1bVar.d);
    }

    public final int hashCode() {
        int e = unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        return e + (str == null ? 0 : str.hashCode());
    }
}
