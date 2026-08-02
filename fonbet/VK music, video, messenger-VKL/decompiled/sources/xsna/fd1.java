package xsna;

import android.text.SpannableStringBuilder;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.unit.LayoutDirection;
import com.vk.im.engine.models.InfoBar;
import com.vkontakte.android.R;
import xsna.dg70;
import xsna.q630;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class fd1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fd1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                hd1 hd1Var = (hd1) this.c;
                jai jaiVar = (jai) this.d;
                ((Integer) obj2).getClass();
                hd1Var.a(ne7.I(7), (androidx.compose.runtime.a) obj, jaiVar);
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                l7c.l((jrd0) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                f6s f6sVar = (f6s) this.c;
                q6s q6sVar = (q6s) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1821993375, intValue, -1, "com.vk.newsfeed.common.recycler.holders.FooterComposeHolder.<anonymous>.<anonymous> (FooterComposeHolder.kt:167)");
                    }
                    f6sVar.b7(q6sVar, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                g2m g2mVar = (g2m) this.c;
                g4u g4uVar = (g4u) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-490561739, intValue2, -1, "com.vk.ecomm.market.good.ui.holder.description.GoodDescriptionCharacteristicsComposeViewHolder.onBind.<anonymous>.<anonymous> (GoodDescriptionComposeViewHolders.kt:70)");
                    }
                    k4u.a(g2mVar, g4uVar.n, ahn.E(txj0.f(q630.a.a, 1.0f), "product_card_description_block"), aVar2, 384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 4:
                ovw ovwVar = (ovw) this.c;
                InfoBar.Payload.MaxAd maxAd = (InfoBar.Payload.MaxAd) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(195052654, intValue3, -1, "com.vk.dialogslist.impl.list.adapter.viewholder.InfoBarViewHolder.getTopContent.<anonymous> (InfoBarViewHolder.kt:114)");
                    }
                    String obj3 = tlo0.b.a(tq.h(tlo0.Companion, R.string.vkim_max_ad_banner_advertisement_title), ovwVar.itemView.getContext()).toString();
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tlo0.b.a(new tlo0.f(R.string.vkim_max_ad_banner_advertisement_tooltip), ovwVar.itemView.getContext()).toString());
                    nik0.d(spannableStringBuilder, dhr0.t.c(R.attr.vk_ui_text_accent), 0, 6);
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (x == c0012a) {
                        x = new x84(12);
                        aVar3.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y = aVar3.y(ovwVar) | aVar3.y(maxAd);
                    Object x2 = aVar3.x();
                    if (y || x2 == c0012a) {
                        x2 = new ks2(15, ovwVar, maxAd);
                        aVar3.R(x2);
                    }
                    jwv.a(obj3, new d5p0(spannableStringBuilder, gzsVar, (gzs) x2), null, aVar3, 0);
                    Object x3 = aVar3.x();
                    if (x3 == c0012a) {
                        x3 = new g8(29);
                        aVar3.R(x3);
                    }
                    ae2.a(6, 6, aVar3, (izs) x3, null, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 5:
                efu efuVar = (efu) this.c;
                a.e eVar = (a.e) this.d;
                azl azlVar = (azl) obj;
                o6j o6jVar = (o6j) obj2;
                if (o6j.i(o6jVar.a) == Integer.MAX_VALUE) {
                    xzw.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int i = o6j.i(o6jVar.a);
                int[] N0 = j5g.N0(efuVar.a(azlVar, i, azlVar.r0(eVar.a())));
                int[] iArr = new int[N0.length];
                eVar.b(azlVar, i, N0, LayoutDirection.Ltr, iArr);
                return new ury(N0, iArr);
            case 6:
                q630 q630Var = (q630) this.c;
                gzs gzsVar2 = (gzs) this.d;
                ((Integer) obj2).getClass();
                wz40.a(ne7.I(7), (androidx.compose.runtime.a) obj, gzsVar2, q630Var);
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                fg70.l((dg70.n) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                cg80.d((hh80) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((mjr) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                rj50 rj50Var = (rj50) obj;
                hjl0 hjl0Var = (hjl0) obj2;
                return hjl0Var instanceof nqd0 ? rj50Var.a((d64) this.c, hjl0Var) : rj50Var.a((d64) this.d, hjl0Var);
            default:
                q630 q630Var2 = (q630) this.c;
                lg90 lg90Var = (lg90) this.d;
                ((Integer) obj2).getClass();
                nyu0.b(ne7.I(65), (androidx.compose.runtime.a) obj, q630Var2, lg90Var);
                return s3q0.a;
        }
    }

    public /* synthetic */ fd1(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
