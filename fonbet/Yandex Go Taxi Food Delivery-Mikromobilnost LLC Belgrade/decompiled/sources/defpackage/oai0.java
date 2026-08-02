package defpackage;

import com.yandex.messaging.internal.entities.FullReactionInfo;
import java.util.List;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public final class oai0 extends xij {
    public final List a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public oai0(List list, List list2, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = list2;
        this.d = z2;
    }

    @Override // defpackage.xij
    public final boolean a(int i, int i2) {
        boolean z = this.b;
        List list = this.a;
        FullReactionInfo fullReactionInfo = (z && i == list.size()) ? null : (FullReactionInfo) a.S(i, list);
        boolean z2 = this.d;
        List list2 = this.c;
        return jl40.l(fullReactionInfo, (z2 && i2 == list2.size()) ? null : (FullReactionInfo) a.S(i2, list2));
    }

    @Override // defpackage.xij
    public final boolean b(int i, int i2) {
        boolean z = this.b;
        List list = this.a;
        FullReactionInfo fullReactionInfo = (z && i == list.size()) ? null : (FullReactionInfo) a.S(i, list);
        Integer valueOf = fullReactionInfo != null ? Integer.valueOf(fullReactionInfo.getType()) : null;
        boolean z2 = this.d;
        List list2 = this.c;
        FullReactionInfo fullReactionInfo2 = (z2 && i2 == list2.size()) ? null : (FullReactionInfo) a.S(i2, list2);
        return jl40.l(valueOf, fullReactionInfo2 != null ? Integer.valueOf(fullReactionInfo2.getType()) : null);
    }

    @Override // defpackage.xij
    public final int d() {
        return this.c.size() + (this.d ? 1 : 0);
    }

    @Override // defpackage.xij
    public final int e() {
        return this.a.size() + (this.b ? 1 : 0);
    }
}
