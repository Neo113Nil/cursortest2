package xsna;

import android.content.Context;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.podcasts.dto.PodcastsSuccessResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetGridShortVideosResponseDto;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.tile.VkTile;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.masks.Mask;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.edl0;
import xsna.gpu;
import xsna.thy;
import xsna.tj50;
import xsna.w2x0;
import xsna.y430;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class d4r implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ d4r(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hik0 hik0Var = null;
        switch (this.b) {
            case 0:
                return jee.a((ShortVideoGetGridShortVideosResponseDto) obj);
            case 1:
                return ((jet) obj).b;
            case 2:
                return ((jnt) obj).c;
            case 3:
                Serializer.c<Videos> cVar = Videos.CREATOR;
                return Collections.singletonList(Videos.a.a((VideoFile) obj));
            case 4:
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("response");
                return Integer.valueOf(optJSONObject != null ? optJSONObject.optInt("count") : 0);
            case 5:
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList.size() == 1) {
                    return (Mask) j5g.Y(arrayList);
                }
                throw new IllegalStateException("Mask array size != 1");
            case 6:
                sew sewVar = (sew) obj;
                return sewVar.a + " - " + com.vk.im.engine.models.im_item.b.a(sewVar.b);
            case 7:
                return s3q0.a;
            case 8:
                h4l0.a.a(new c790((StickerStockItem) obj));
                return s3q0.a;
            case 9:
                return String.valueOf(((Peer) obj).b);
            case 10:
                VkTile vkTile = new VkTile((Context) obj, null, 6);
                vkTile.setBackgroundColor(-1);
                vkTile.setClipChildren(false);
                return vkTile;
            case 11:
                return new y430.a(((tj50.a) obj).a(new v4v(14), ao8.d));
            case 12:
                return xa4.k((Attach) obj);
            case 13:
                List list = (List) obj;
                Iterator it = list.iterator();
                long j = 0;
                while (it.hasNext()) {
                    Iterable iterable = ((AudioBook) it.next()).k;
                    if (iterable == null) {
                        iterable = EmptyList.b;
                    }
                    Iterator it2 = iterable.iterator();
                    long j2 = 0;
                    while (it2.hasNext()) {
                        j2 += ((AudioBookChapter) it2.next()).d != null ? r9.c : 0L;
                    }
                    j += j2;
                }
                return new tt70(4, j, rli0.A(rli0.y(rli0.t(new i5g(list), new gvs(11)), 2)));
            case 14:
                return Boolean.valueOf(!(((n8b0) obj).a.H instanceof DownloadingState.Downloading));
            case 15:
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return Boolean.valueOf(((zg60) obj).c.d);
            case 16:
                qgi0.r((tgi0) obj, "order_header_title");
                return s3q0.a;
            case 17:
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.U().b(new w2x0.a(false, 7));
                return s3q0.a;
            case 18:
                return ((PodcastsSuccessResponseDto) obj).d() == 1 ? io.reactivex.rxjava3.internal.operators.completable.i.b : io.reactivex.rxjava3.core.a.k(new VKApiException("Can`t disable notifications"));
            case 19:
                L.i((Throwable) obj);
                cvk.u(R.string.common_network_error, false);
                return s3q0.a;
            case 20:
                qgi0.r((tgi0) obj, "priority_block_empty_text_title");
                return s3q0.a;
            case 21:
                thy.b bVar = (thy.b) obj;
                bVar.a = 1332;
                bVar.a(0, Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)).b = x2e0.d;
                bVar.a(666, Float.valueOf(290.0f));
                return s3q0.a;
            case 22:
                return Boolean.valueOf(((gpu) obj) instanceof gpu.b);
            case 23:
                return Boolean.valueOf(!((List) obj).isEmpty());
            case 24:
                return Boolean.FALSE;
            case 25:
                qgi0.r((tgi0) obj, "errorDescription");
                return s3q0.a;
            case 26:
                return s3q0.a;
            case 27:
                List list2 = (List) obj;
                Object obj2 = list2.get(0);
                izs izsVar = (izs) i2h0.i.c;
                Boolean bool = Boolean.FALSE;
                hik0 hik0Var2 = (epx.f(obj2, bool) || obj2 == null) ? null : (hik0) izsVar.invoke(obj2);
                Object obj3 = list2.get(1);
                hik0 hik0Var3 = (epx.f(obj3, bool) || obj3 == null) ? null : (hik0) izsVar.invoke(obj3);
                Object obj4 = list2.get(2);
                hik0 hik0Var4 = (epx.f(obj4, bool) || obj4 == null) ? null : (hik0) izsVar.invoke(obj4);
                Object obj5 = list2.get(3);
                if (!epx.f(obj5, bool) && obj5 != null) {
                    hik0Var = (hik0) izsVar.invoke(obj5);
                }
                return new tjo0(hik0Var2, hik0Var3, hik0Var4, hik0Var);
            case 28:
                qgi0.c((tgi0) obj);
                return s3q0.a;
            default:
                return new edl0.c(R.layout.style_divider, (ViewGroup) obj);
        }
    }

    public /* synthetic */ d4r(Object obj, int i) {
        this.b = i;
    }
}
