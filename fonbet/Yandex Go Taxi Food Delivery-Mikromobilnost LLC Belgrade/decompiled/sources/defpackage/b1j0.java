package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lb1j0;", "Lkr;", "Companion", "z0j0", "a1j0", "flex-sections-action_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class b1j0 extends kr {
    public static final a1j0 Companion = new a1j0();
    public static final i3y[] e;
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        e = new i3y[]{a.b(lazyThreadSafetyMode, new lqi0(12)), a.b(lazyThreadSafetyMode, new lqi0(13)), a.b(lazyThreadSafetyMode, new lqi0(14)), a.b(lazyThreadSafetyMode, new lqi0(15))};
    }

    public /* synthetic */ b1j0(int i, Set set, Set set2, Set set3, Set set4) {
        int i2 = i & 1;
        EmptySet emptySet = EmptySet.a;
        if (i2 == 0) {
            this.a = emptySet;
        } else {
            this.a = set;
        }
        if ((i & 2) == 0) {
            this.b = emptySet;
        } else {
            this.b = set2;
        }
        if ((i & 4) == 0) {
            this.c = emptySet;
        } else {
            this.c = set3;
        }
        if ((i & 8) == 0) {
            this.d = emptySet;
        } else {
            this.d = set4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b1j0.class != obj.getClass()) {
            return false;
        }
        b1j0 b1j0Var = (b1j0) obj;
        return jl40.l(this.a, b1j0Var.a) && jl40.l(this.b, b1j0Var.b) && jl40.l(this.c, b1j0Var.c) && jl40.l(this.d, b1j0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + g8e.e(this.c, g8e.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ReplaceAllSnippetsAction(hideSnippetIds=" + this.a + ", hideSnippetTags=" + this.b + ", showSnippetIds=" + this.c + ", showSnippetTags=" + this.d + Extension.C_BRAKE;
    }

    public b1j0() {
        EmptySet emptySet = EmptySet.a;
        this.a = emptySet;
        this.b = emptySet;
        this.c = emptySet;
        this.d = emptySet;
    }
}
