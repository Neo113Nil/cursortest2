package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.k840;

/* compiled from: PlayerBannerAdDelegate.kt */
/* loaded from: classes16.dex */
public final class vza0 implements mzt0, SwitchCatalogVh.b {
    public final h7m b;
    public final FunctionReferenceImpl c;
    public izs<? super bnn0, Integer> d = uza0.c;
    public final Object e = msy.a(LazyThreadSafetyMode.NONE, new z260(this, 12));
    public String f = "";

    /* JADX WARN: Multi-variable type inference failed */
    public vza0(l7m l7mVar, gzs gzsVar) {
        this.b = l7mVar;
        this.c = (FunctionReferenceImpl) gzsVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(Integer num) {
        if (k840.a.i.b()) {
            return;
        }
        ?? r0 = this.e;
        ((p2k0) r0.getValue()).G(num);
        ((p2k0) r0.getValue()).u(this.f);
    }

    @Override // com.vk.catalog2.common.ui.holders.SwitchCatalogVh.b
    public final void j(bnn0 bnn0Var) {
        a(this.d.invoke(bnn0Var));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.mzt0
    public final void u(UIBlock uIBlock) {
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null) {
            return;
        }
        this.f = ((UIBlockList) uIBlock).c;
        rxz rxzVar = new rxz(uIBlockList, 13);
        this.d = rxzVar;
        a((Integer) rxzVar.invoke(this.c.invoke()));
    }
}
