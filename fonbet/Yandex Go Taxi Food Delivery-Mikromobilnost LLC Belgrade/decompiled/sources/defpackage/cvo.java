package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cvo {
    public final boolean a;
    public final Set b;
    public final Set c;
    public final int d;

    public cvo(int i, Set set, Set set2, boolean z) {
        this.a = z;
        this.b = set;
        this.c = set2;
        this.d = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Set] */
    public static cvo a(cvo cvoVar, boolean z, LinkedHashSet linkedHashSet, Set set, int i, int i2) {
        if ((i2 & 1) != 0) {
            z = cvoVar.a;
        }
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if ((i2 & 2) != 0) {
            linkedHashSet2 = cvoVar.b;
        }
        if ((i2 & 4) != 0) {
            set = cvoVar.c;
        }
        if ((i2 & 8) != 0) {
            i = cvoVar.d;
        }
        cvoVar.getClass();
        return new cvo(i, linkedHashSet2, set, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvo)) {
            return false;
        }
        cvo cvoVar = (cvo) obj;
        return this.a == cvoVar.a && jl40.l(this.b, cvoVar.b) && jl40.l(this.c, cvoVar.c) && this.d == cvoVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + g8e.e(this.c, g8e.e(this.b, Boolean.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "ExplorerUiState(isVisible=" + this.a + ", h3Indices=" + this.b + ", rawH3Indices=" + this.c + ", resolution=" + this.d + Extension.C_BRAKE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ cvo(int i) {
        this(10, r1, r1, false);
        EmptySet emptySet = EmptySet.a;
    }

    public cvo() {
        this(0);
    }
}
