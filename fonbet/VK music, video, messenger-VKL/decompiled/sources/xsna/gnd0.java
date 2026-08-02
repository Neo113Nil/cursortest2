package xsna;

import com.vk.dto.common.Good;
import com.vk.ecomm.market.good.ui.topbar.ProductCardTopBarControlAction;
import kotlin.collections.builders.ListBuilder;
import xsna.fnd0;

/* compiled from: ProductCardTopBarViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class gnd0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    public static final fnd0 a(cxo cxoVar) {
        String str;
        String str2;
        Object[] objArr = cxoVar.a() || !(cxoVar.r == null || (str2 = cxoVar.B) == null || str2.length() <= 0);
        Good good = cxoVar.r;
        if (good == null) {
            return fnd0.b.a;
        }
        boolean z = good.V;
        if (objArr != true) {
            return new fnd0.a(z, end0.a, new cnd0(cxoVar.t), z ? null : new zmd0(cxoVar.w));
        }
        ListBuilder e = e43.e();
        boolean z2 = cxoVar.a() && !b210.a(cxoVar.r, ((Boolean) cxoVar.d.getValue()).booleanValue());
        if (z2) {
            e.add(ProductCardTopBarControlAction.Edit);
        }
        if (cxoVar.r != null && (str = cxoVar.B) != null && str.length() > 0) {
            Good good2 = cxoVar.r;
            String str3 = good2 != null ? good2.c0 : null;
            if (str3 == null || str3.length() == 0) {
                e.add(ProductCardTopBarControlAction.Promote);
            } else {
                e.add(ProductCardTopBarControlAction.Statistics);
            }
        }
        e.add(ProductCardTopBarControlAction.CopyLink);
        if (z2) {
            e.add(ProductCardTopBarControlAction.Remove);
        }
        return new fnd0.a(z, new and0(e.g()), z ? new cnd0(cxoVar.t) : new zmd0(cxoVar.w), end0.a);
    }
}
