package xsna;

import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: SemanticsProperties.kt */
/* loaded from: classes11.dex */
public final class pgi0 extends Lambda implements izs<List<Float>, Boolean> {
    final /* synthetic */ gzs<Float> $action;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgi0(btm btmVar) {
        super(1);
        this.$action = btmVar;
    }

    @Override // xsna.izs
    public final Boolean invoke(List<Float> list) {
        boolean z;
        List<Float> list2 = list;
        Float invoke = this.$action.invoke();
        if (invoke == null) {
            z = false;
        } else {
            list2.add(invoke);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
