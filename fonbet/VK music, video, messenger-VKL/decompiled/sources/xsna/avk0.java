package xsna;

import androidx.appcompat.widget.AppCompatTextView;
import com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch;
import com.vk.clips.sdk.shared.item.static_ads.a;
import kotlin.NoWhenBranchMatchedException;
import xsna.mwk0;
import xsna.wk50;

/* compiled from: StaticAdsBindingActionApplier.kt */
/* loaded from: classes17.dex */
public final class avk0 implements oj50<mwk0, com.vk.clips.sdk.shared.item.static_ads.a, StaticAdsItemPatch> {
    public final ojh0 a;
    public final su b;
    public final kxk0 c;
    public final hvk0 d;

    public avk0(ojh0 ojh0Var, su suVar, kxk0 kxk0Var, hvk0 hvk0Var) {
        this.a = ojh0Var;
        this.b = suVar;
        this.c = kxk0Var;
        this.d = hvk0Var;
    }

    @Override // xsna.oj50
    public final void a(wk50.a aVar, km50 km50Var, kj50 kj50Var) {
        mwk0 mwk0Var = (mwk0) km50Var;
        com.vk.clips.sdk.shared.item.static_ads.a aVar2 = (com.vk.clips.sdk.shared.item.static_ads.a) kj50Var;
        if (aVar2 instanceof a.InterfaceC0687a) {
            a.InterfaceC0687a interfaceC0687a = (a.InterfaceC0687a) aVar2;
            if (!(interfaceC0687a instanceof a.InterfaceC0687a.C0688a)) {
                if (!(interfaceC0687a instanceof a.InterfaceC0687a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.b.e();
                aVar.b(StaticAdsItemPatch.b.C0686b.b);
                return;
            }
            a.InterfaceC0687a.C0688a c0688a = (a.InterfaceC0687a.C0688a) aVar2;
            if (mwk0Var instanceof mwk0.b) {
                c(aVar, c0688a);
                return;
            }
            if (!(mwk0Var instanceof mwk0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((mwk0.a) mwk0Var).b.g;
            boolean f = epx.f(str, c0688a.g);
            this.d.b.remove(str);
            if (f) {
                aVar.b(new StaticAdsItemPatch.b.a.C0685b(b(c0688a)));
            } else {
                c(aVar, c0688a);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final jxk0 b(a.InterfaceC0687a.C0688a c0688a) {
        kxk0 kxk0Var = this.c;
        CharSequence a = kxk0Var.b.a(c0688a.e);
        return new jxk0(c0688a.b, c0688a.c, c0688a.d, c0688a.e, a, ((p2m) kxk0Var.d.getValue()).a((AppCompatTextView) kxk0Var.c.getValue(), pw0.b(kxk0Var.a, a)), c0688a.g, c0688a.h);
    }

    public final void c(wk50.a aVar, a.InterfaceC0687a.C0688a c0688a) {
        aVar.b(new StaticAdsItemPatch.b.a.C0684a(b(c0688a), c0688a.f));
        aVar.b.e();
        ru.a(aVar, c0688a.b.b, this.a, this.b, new yg7(aVar, 13));
    }

    @Override // xsna.oj50
    public final void onDestroy() {
    }
}
