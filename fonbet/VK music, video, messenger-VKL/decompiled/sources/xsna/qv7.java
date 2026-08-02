package xsna;

import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class qv7 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ izs c;

    public /* synthetic */ qv7(izs izsVar) {
        this.c = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
        Integer num = (Integer) obj2;
        switch (this.b) {
            case 0:
                num.getClass();
                wv7.a(this.c, aVar, ne7.I(1));
                break;
            default:
                int intValue = num.intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1579954075, intValue, -1, "com.vk.ecomm.reviews.impl.marketitem.createreview.presentation.view.CreateMarketItemReviewView.ThemedContent.<anonymous> (CreateMarketItemReviewView.kt:80)");
                    }
                    f9k.b(0, aVar, d370.N(R.string.create_product_review_toolbar_title, 0, aVar), this.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qv7(izs izsVar, int i) {
        this.c = izsVar;
    }
}
