package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.MarketItemsForReviewView;
import xsna.m610;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class slh implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ slh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                sst0 sst0Var = (sst0) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-488642313, intValue, -1, "com.vk.profile.core.tabs.ui.videos.CommunityProfileContentVideoViewHolder.setupShimmers.<anonymous>.<anonymous>.<anonymous> (CommunityProfileContentVideoViewHolder.kt:302)");
                    }
                    ylh.c(sst0Var.l, null, 0, 0, 0, 0L, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 1:
                ((MarketItemsForReviewView) this.c).f.onNext(new m610.b(((Long) obj).longValue(), (UserId) obj2, ((Float) obj3).floatValue()));
                break;
            default:
                wb50 wb50Var = (wb50) this.c;
                va8 va8Var = (va8) obj;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= aVar2.J(va8Var) ? 4 : 2;
                }
                if (aVar2.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1312741321, intValue2, -1, "com.vk.newsfeed.posting.music_picker.presentation.view.MusicTrackImage.Content.<anonymous> (MusicTrackCell.kt:301)");
                    }
                    wb50Var.b(va8Var, aVar2, intValue2 & 14);
                    if (((Boolean) ((zak0) wb50Var.i).getValue()).booleanValue()) {
                        aVar2.K(-2095428567);
                        m6b0.a(qa50.a, ((Boolean) ((zak0) wb50Var.h).getValue()).booleanValue(), ahn.E(txj0.d(q630.a.a, 1.0f), "AudioTrackPlayingIndicator"), aVar2, 390);
                    } else {
                        aVar2.K(-2106997767);
                    }
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
