package xsna;

import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class wu00 implements izs {
    public final /* synthetic */ yu00 b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        d9a d9aVar = this.b.c;
        ay00 ay00Var = (ay00) obj;
        if (ay00Var instanceof hy00) {
            hy00 hy00Var = (hy00) ay00Var;
            d9aVar.b(new c9a(d9aVar, hy00Var.a(), hy00Var.b()));
        } else if (ay00Var instanceof gu00) {
            d9aVar.b(new b9a(d9aVar, ((gu00) ay00Var).a(), ProductTileCtaButtonType.GO_TO_CART));
        } else if (ay00Var instanceof iu00) {
            d9aVar.b(new b9a(d9aVar, ((iu00) ay00Var).a(), ProductTileCtaButtonType.ADD_TO_CART));
        } else if (ay00Var instanceof fu00) {
            d9aVar.b(new n40(14, d9aVar, ((fu00) ay00Var).q()));
        }
        return s3q0.a;
    }
}
