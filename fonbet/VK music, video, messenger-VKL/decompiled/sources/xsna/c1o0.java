package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.vmoji.dto.VmojiGetCharacterByIdResponseDto;
import com.vk.catalog2.common.ui.mvp.video.VideoCatalogAlbumBottomSheet;
import com.vk.dto.common.data.VKList;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.market.attached.TaggedItemsBottomSheet;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.stat.scheme.CommonVideoAdsStat$TypeOverlayAdClose;
import com.vk.vmoji.character.model.VmojiProductModel;
import java.util.List;
import xsna.cvd0;
import xsna.egp0;
import xsna.gyw0;
import xsna.iyw0;
import xsna.jto0;
import xsna.o9w0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class c1o0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c1o0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                int i2 = TaggedItemsBottomSheet.o1;
                bwt0.p0((ProgressBar) obj3, true);
                bwt0.p0((RecyclerView) obj2, false);
                break;
            case 1:
                ((i0b0) obj3).invoke(jto0.b.a((jto0.b) obj2, null, null, null, null, false, null, false, false, false, false, null, ((Boolean) obj).booleanValue(), false, false, null, false, 63487));
                break;
            case 2:
                ((xfp0) obj3).V(egp0.a.C2808a.b, (MusicTrack) obj2);
                break;
            case 3:
                ((rkq0) obj3).h((dw20) obj2, (List) obj);
                break;
            case 4:
                vmq0 vmq0Var = (vmq0) obj3;
                j15 j15Var = (j15) obj2;
                VKList<Playlist> vKList = (VKList) obj;
                cvd0.a aVar = j15Var.j;
                vmq0Var.D(j15Var, new VKList<>(aVar != null ? aVar.b : null), vKList, false);
                break;
            case 5:
                s0s0 s0s0Var = (s0s0) obj3;
                VideoAdvertisementsRepository.AdType adType = (VideoAdvertisementsRepository.AdType) obj2;
                kmk0 kmk0Var = s0s0Var.b;
                kmk0Var.getClass();
                (adType == VideoAdvertisementsRepository.AdType.SPORT_BANNER ? kmk0Var.a : kmk0Var.b).d(CommonVideoAdsStat$TypeOverlayAdClose.CloseSource.OTHER, CommonVideoAdsStat$TypeOverlayAdClose.CloseReason.TTL_TIMEOUT);
                s0s0Var.c(adType);
                break;
            case 6:
                ((ikv0) obj).a();
                VideoCatalogAlbumBottomSheet.a.b((Context) obj3, (VideoAlbum) obj2);
                break;
            case 7:
                View view = (View) obj3;
                qot0 qot0Var = (qot0) obj2;
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                if (!qot0Var.p) {
                    qot0Var.o = null;
                    qot0Var.p = true;
                }
                break;
            case 8:
                break;
            case 9:
                ((f6w0) obj3).b.b((VmojiProductModel) obj2);
                break;
            case 10:
                r9w0 r9w0Var = (r9w0) obj3;
                VmojiGetCharacterByIdResponseDto vmojiGetCharacterByIdResponseDto = (VmojiGetCharacterByIdResponseDto) obj;
                aaw0 aaw0Var = r9w0Var.g;
                VmojiProductModel vmojiProductModel = ((o9w0.h) ((o9w0) obj2)).b;
                n9m0 n9m0Var = new n9m0(r9w0Var, 23);
                View view2 = aaw0Var.a.getView();
                if (view2 != null) {
                    view2.post(new l5p(aaw0Var, vmojiProductModel, vmojiGetCharacterByIdResponseDto, n9m0Var, 2));
                }
                break;
            default:
                cyw0 cyw0Var = (cyw0) obj3;
                iyw0.a aVar2 = (iyw0.a) obj;
                boolean z = !aVar2.i;
                cyw0Var.T(new gyw0.g(z));
                cyw0.V(cyw0Var, null, null, null, null, null, null, null, Boolean.valueOf(z), null, aVar2, 383);
                break;
        }
        return s3q0.a;
    }
}
