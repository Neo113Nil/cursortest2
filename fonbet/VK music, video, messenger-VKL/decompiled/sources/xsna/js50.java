package xsna;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.ls50;

/* compiled from: MyTargetNonVideoImmediateFeature.kt */
/* loaded from: classes17.dex */
public final class js50 {
    public final ks50 a;
    public final fh9 b;

    public js50(ks50 ks50Var, fh9 fh9Var) {
        this.a = ks50Var;
        this.b = fh9Var;
        ks50Var.a.add(new jk5(2, this, js50.class, "onStateChanged", "onStateChanged(Lcom/vk/clips/sdk/shared/item/common/ads/feature/mytarget/MyTargetNonVideoItemImmediateState;Lcom/vk/clips/sdk/shared/item/common/ads/feature/mytarget/MyTargetNonVideoItemImmediateState;)V", 0));
    }

    public final void a(String str, wp50 wp50Var) {
        ks50 ks50Var = this.a;
        ls50 ls50Var = ks50Var.b;
        if (ls50Var instanceof ls50.b) {
            ks50Var.getClass();
            ls50.a aVar = new ls50.a(str, wp50Var);
            ls50 ls50Var2 = ks50Var.b;
            if (aVar != ls50Var2) {
                Iterator it = ks50Var.a.iterator();
                while (it.hasNext()) {
                    ((wzs) it.next()).invoke(ls50Var2, aVar);
                }
            }
            ks50Var.b = aVar;
            return;
        }
        if (!(ls50Var instanceof ls50.a)) {
            throw new NoWhenBranchMatchedException();
        }
        if (epx.f(((ls50.a) ls50Var).a, str)) {
            return;
        }
        ks50Var.getClass();
        ls50.a aVar2 = new ls50.a(str, wp50Var);
        ls50 ls50Var3 = ks50Var.b;
        if (aVar2 != ls50Var3) {
            Iterator it2 = ks50Var.a.iterator();
            while (it2.hasNext()) {
                ((wzs) it2.next()).invoke(ls50Var3, aVar2);
            }
        }
        ks50Var.b = aVar2;
    }
}
