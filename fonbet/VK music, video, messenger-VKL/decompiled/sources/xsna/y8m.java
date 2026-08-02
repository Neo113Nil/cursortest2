package xsna;

import android.net.Uri;
import android.view.View;
import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.api.generated.audio.dto.AudioGetIdsBySourceResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetPhotoUploadServerResponseDto;
import com.vk.catalog.mvi.block.video.impl.movies.detail.buttons.entity.MovieButtonsBlockState;
import com.vk.core.preference.Preference;
import com.vk.dto.common.Good;
import com.vk.dto.common.ImageSize;
import com.vk.dto.market.GoodVariantItem;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.im.ui.views.dialog_actions.DialogActionsListView;
import com.vk.superapp.api.dto.menu.QueueParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.n9n0;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class y8m implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ y8m(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.b) {
            case 0:
                LinkedHashMap linkedHashMap = DialogActionsListView.j;
                break;
            case 1:
                Uri parse = Uri.parse(((ImageSize) obj).d.d);
                if (!rhs.b().d(parse) && !rhs.b().c(parse) && !rhs.b().f(parse)) {
                    z = false;
                }
                break;
            case 2:
                break;
            case 3:
                qgi0.r((tgi0) obj, "clip_edit_done");
                break;
            case 4:
                break;
            case 5:
                tj50.a aVar = (tj50.a) obj;
                int i = 2;
                h0u0 d = tj50.a.d(aVar, xtv.b, auv.b, new hre(i));
                h0u0 c = tj50.a.c(aVar, buv.b, cuv.b, duv.b, new mcm(i));
                h0u0 b = tj50.a.b(aVar, euv.b, new gzn(9));
                h0u0 b2 = tj50.a.b(aVar, qtv.b, new xht(4));
                rtv rtvVar = rtv.b;
                ao8 ao8Var = ao8.d;
                break;
            case 6:
                qgi0.r((tgi0) obj, "vk_banner_test_tag");
                break;
            case 7:
                break;
            case 8:
                int i2 = MarketEditAlbumGoodsFragment.c1;
                List<GoodVariantItem> list = ((Good) obj).u;
                if (list != null && !list.isEmpty()) {
                    z = false;
                }
                break;
            case 9:
                qgi0.r((tgi0) obj, "errorTitle");
                break;
            case 10:
                k720 k720Var = k720.a;
                q9n0 K = k720.K((q9n0) obj);
                k720.H();
                k720.W(K);
                k720.Y(null);
                k720.A = null;
                k720.X(new n9n0(K, n9n0.a.b.a));
                String str = (String) k720.c.getValue();
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                Preference.F(currentTimeMillis, "menu_items", str);
                k720.j = (int) currentTimeMillis;
                QueueParams queueParams = K.f;
                if (!drm0.N(queueParams.d())) {
                    k720.T.onNext(queueParams);
                }
                k720.V(K.b);
                n9n0 n9n0Var = k720.R;
                if (n9n0Var != null) {
                    k720.a0(n9n0Var);
                }
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                ((vak0) go20.l).g(((Float) obj).floatValue());
                break;
            case 14:
                List<AudioAudioRawIdTrackedDto> d2 = ((AudioGetIdsBySourceResponseDto) obj).d();
                if (d2 == null) {
                    d2 = EmptyList.b;
                }
                List<AudioAudioRawIdTrackedDto> list2 = d2;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AudioAudioRawIdTrackedDto) it.next()).d());
                }
                break;
            case 15:
                MovieButtonsBlockState movieButtonsBlockState = (MovieButtonsBlockState) obj;
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                View view = (View) obj;
                view.post(new xab(view, 8));
                break;
            case 21:
                break;
            case 22:
                StoriesGetPhotoUploadServerResponseDto storiesGetPhotoUploadServerResponseDto = (StoriesGetPhotoUploadServerResponseDto) obj;
                break;
            case 23:
                break;
            case 24:
                break;
            case 25:
                ((Long) obj).longValue();
                break;
            case 26:
                Throwable th = (Throwable) obj;
                j03.l(th);
                com.vk.metrics.eventtracking.b.a.a(th);
                break;
            case 27:
                ((etv0) obj).b(false);
                break;
            case 28:
                qgi0.r((tgi0) obj, "community_rebooking_button");
                break;
            default:
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ y8m(ec20 ec20Var) {
        this.b = 11;
    }
}
