package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lp5s0;", "Lkr;", "Companion", "n5s0", "o5s0", "flex-sections-action_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class p5s0 extends kr {
    public static final o5s0 Companion = new o5s0();
    public static final i3y[] c;
    public final Set a;
    public final Set b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new wyr0(3)), a.b(lazyThreadSafetyMode, new wyr0(4))};
    }

    public /* synthetic */ p5s0(int i, Set set, Set set2) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p5s0.class != obj.getClass()) {
            return false;
        }
        p5s0 p5s0Var = (p5s0) obj;
        return jl40.l(this.a, p5s0Var.a) && jl40.l(this.b, p5s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAllSnippetsAction(showSnippetIds=" + this.a + ", showSnippetTags=" + this.b + Extension.C_BRAKE;
    }

    public p5s0() {
        EmptySet emptySet = EmptySet.a;
        this.a = emptySet;
        this.b = emptySet;
    }
}
