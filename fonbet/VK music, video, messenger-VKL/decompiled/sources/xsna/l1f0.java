package xsna;

import androidx.compose.runtime.a;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l1f0 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;

    public /* synthetic */ l1f0(Object obj, Object obj2, xzs xzsVar, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = xzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                aia0 aia0Var = (aia0) this.c;
                zjo zjoVar = (zjo) this.d;
                gzs gzsVar = (gzs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1681903111, intValue, -1, "com.vk.im.design.view.ReactionPickerContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReactionPickerContent.kt:78)");
                    }
                    b1f0.b(aia0Var.a, aia0Var.f, zjoVar, gzsVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                q1t0 q1t0Var = (q1t0) this.c;
                com.vk.repository.internal.repos.stickers.suggests.a aVar2 = (com.vk.repository.internal.repos.stickers.suggests.a) this.d;
                izs izsVar = (izs) this.e;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2117485338, intValue2, -1, "com.vk.profile.design.compose.header.header.picture.paging.page.VideoPageContent.<anonymous>.<anonymous> (VideoPage.kt:226)");
                }
                q630 d = txj0.d(q630.a.a, 1.0f);
                boolean J = aVar3.J(q1t0Var) | aVar3.J(aVar2) | aVar3.J(izsVar);
                Object x = aVar3.x();
                if (J || x == a.C0011a.a) {
                    x = new s2b(q1t0Var, aVar2, izsVar, 10);
                    aVar3.R(x);
                }
                qka0.a(48, aVar3, (gzs) x, d);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                break;
        }
        return s3q0.a;
    }
}
