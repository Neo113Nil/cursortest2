package xsna;

import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.profile.user.impl.ui.adapter.UserProfileAdapterItem;
import xsna.pox0;
import xsna.q70;
import xsna.tt9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p70 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p70(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((q70.a) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 1:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) obj4;
                int i2 = GalleryFragmentImpl.R0;
                break;
            case 2:
                q48 q48Var = (q48) obj4;
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = MarketItemReviewsFragment.w0;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1777640514, intValue, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment.handleShowOzonReviewsButton.<anonymous> (MarketItemReviewsFragment.kt:439)");
                    }
                    rrv0.d(null, null, null, null, kai.c(559823011, new s70(6, q48Var, marketItemReviewsFragment), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                s4d0.b((agw) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                nud0.d((tt9.b.a.C3769a) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                ((xqq0) obj4).s6((UserProfileAdapterItem.j.b.a) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                x8u0.e((b78) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                ((Integer) obj2).getClass();
                wox0.a((pox0.g) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ p70(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
