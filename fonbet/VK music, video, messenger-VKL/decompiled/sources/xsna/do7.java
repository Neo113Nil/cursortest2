package xsna;

import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionAction;
import com.vk.libvideo.design.view.overlay.VideoOverlayView;
import kotlin.NoWhenBranchMatchedException;
import xsna.a390;
import xsna.h5h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class do7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ do7(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        Image image;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                eo7.a((co7) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((h5h.d) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((y1l) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                hwl.b((String) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                int I = ne7.I(1);
                kb00.j(this.c, (izs) this.d, (androidx.compose.runtime.a) obj, I);
                return s3q0.a;
            case 5:
                a390 a390Var = (a390) this.c;
                VideoRestriction videoRestriction = (VideoRestriction) this.d;
                int intValue = ((Integer) obj2).intValue();
                a390Var.getClass();
                int i = a390.a.$EnumSwitchMapping$0[((VideoOverlayView.VideoRestrictionSize) obj).ordinal()];
                if (i == 1) {
                    image = videoRestriction.g;
                } else {
                    if (i != 2 && i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    image = videoRestriction.h;
                }
                ImageSize Cb = image.Cb(intValue, false, true);
                if (Cb != null) {
                    return Cb.d.d;
                }
                return null;
            case 6:
                ((Integer) obj2).getClass();
                vma0.a((izs) this.c, (SubscriptionAction) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                com.vk.ecomm.product_list.presentation.g.c((bqd0) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                gud0.f((zxe) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                txk0.c((dh7) this.c, (izs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                ((cen0) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((TopBar$Middle.Text.a.C0755a) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ do7(a390 a390Var, VideoRestriction videoRestriction) {
        this.b = 5;
        this.c = a390Var;
        this.d = videoRestriction;
    }
}
