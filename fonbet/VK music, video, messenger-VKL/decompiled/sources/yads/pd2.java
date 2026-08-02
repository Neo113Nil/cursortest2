package yads;

import java.util.Set;
import kotlin.jvm.internal.Lambda;
import xsna.izs;

/* loaded from: classes10.dex */
public final class pd2 extends Lambda implements izs {
    public final /* synthetic */ Set b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd2(Set set) {
        super(1);
        this.b = set;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return Boolean.valueOf(this.b.contains(((u5) obj).a));
    }
}
