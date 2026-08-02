package xsna;

/* compiled from: GamesCatalogTopBarState.kt */
/* loaded from: classes17.dex */
public final class tet {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final zbt d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tet() {
        this((String) null, r0, r0, 15);
        boolean z = false;
    }

    public static tet a(tet tetVar, String str, boolean z, boolean z2, zbt zbtVar, int i) {
        if ((i & 1) != 0) {
            str = tetVar.a;
        }
        if ((i & 2) != 0) {
            z = tetVar.b;
        }
        if ((i & 4) != 0) {
            z2 = tetVar.c;
        }
        if ((i & 8) != 0) {
            zbtVar = tetVar.d;
        }
        tetVar.getClass();
        return new tet(str, z, z2, zbtVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tet)) {
            return false;
        }
        tet tetVar = (tet) obj;
        return epx.f(this.a, tetVar.a) && this.b == tetVar.b && this.c == tetVar.c && epx.f(this.d, tetVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int b = qoy.b(qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        zbt zbtVar = this.d;
        return b + (zbtVar != null ? zbtVar.hashCode() : 0);
    }

    public final String toString() {
        return "GamesCatalogTopBarState(avatarUrl=" + this.a + ", isAvatarVisible=" + this.b + ", isBackButtonVisible=" + this.c + ", giftIcon=" + this.d + ')';
    }

    public /* synthetic */ tet(String str, boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (zbt) null);
    }

    public tet(String str, boolean z, boolean z2, zbt zbtVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = zbtVar;
    }
}
