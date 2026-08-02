package defpackage;

import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Llhu;", "Lkr;", "Companion", "jhu", "khu", "flex-sections-action_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class lhu extends kr {
    public static final khu Companion = new khu();
    public static final i3y[] c;
    public final Set a;
    public final Set b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{a.b(lazyThreadSafetyMode, new mvt(23)), a.b(lazyThreadSafetyMode, new mvt(24))};
    }

    public /* synthetic */ lhu(int i, Set set, Set set2) {
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
        if (obj == null || lhu.class != obj.getClass()) {
            return false;
        }
        lhu lhuVar = (lhu) obj;
        return jl40.l(this.a, lhuVar.a) && jl40.l(this.b, lhuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HideAllSnippetsAction(hideSnippetIds=" + this.a + ", hideSnippetTags=" + this.b + Extension.C_BRAKE;
    }

    public lhu() {
        EmptySet emptySet = EmptySet.a;
        this.a = emptySet;
        this.b = emptySet;
    }
}
