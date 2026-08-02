package xsna;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.superApp.dto.SuperAppGetSingleQueueResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppQueueSubscriptionInfoDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.view.shimmer.Shimmer;
import com.vk.core.view.shimmer.ShimmerFrameLayout;
import com.vk.libvideo.design.view.toolbar.VideoToolbarView;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.impl.discover.repository.TemporaryCache;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.MediaOwner;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.superapp.api.dto.menu.QueueParams;
import com.vk.video.playlist.playlistscreen.ui.entity.PlaylistScreenState;
import com.vkontakte.android.R;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import xsna.dug0;
import xsna.go20;
import xsna.goh0;
import xsna.hfr;
import xsna.ltd0;
import xsna.mmh0;
import xsna.sx40;
import xsna.tj50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class f6w implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ f6w(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                return String.valueOf(com.vk.im.engine.models.im_item.b.a(((a5w) obj).y9()));
            case 1:
                ((ojt) obj).b = 100;
                return s3q0.a;
            case 2:
                return Boolean.valueOf(!((Collection) ((Map.Entry) obj).getValue()).isEmpty());
            case 3:
                return fl3.I((Cursor) obj);
            case 4:
                int i = com.vk.newsfeed.common.recycler.holders.b.Q;
                return "";
            case 5:
                return Boolean.valueOf(((View) obj) instanceof VideoToolbarView);
            case 6:
                Throwable th = (Throwable) obj;
                return ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == 15) ? io.reactivex.rxjava3.core.q.H(th) : io.reactivex.rxjava3.core.q.B0(5000L, TimeUnit.MILLISECONDS);
            case 7:
                ht00 ht00Var = new ht00(R.layout.market_all_reviews_tabs_shimmer_view_holder, (ViewGroup) obj);
                ((ShimmerFrameLayout) ht00Var.itemView.findViewById(R.id.market_all_reviews_shimmer_view)).b(((Shimmer.a) ((Shimmer.a) ((Shimmer.a) new Shimmer.a().c(true).h()).i()).d()).g(0.08f).a());
                return ht00Var;
            case 8:
                SuperAppQueueSubscriptionInfoDto d = ((SuperAppGetSingleQueueResponseDto) obj).d();
                QueueParams queueParams = d != null ? new QueueParams(d.f(), d.d(), d.e(), d.g(), false, 16, null) : null;
                if (queueParams != null) {
                    k720 k720Var = k720.a;
                    if (!drm0.N(queueParams.d())) {
                        k720.T.onNext(queueParams);
                    }
                }
                return s3q0.a;
            case 9:
                ((zak0) go20.r).setValue((go20.i) obj);
                return s3q0.a;
            case 10:
                return Long.valueOf(((yj30) obj).a);
            case 11:
                hfr.a aVar = new hfr.a(rli0.j(new i5g(((UIBlockList) obj).y), new p7x(8)));
                while (true) {
                    if (aVar.hasNext()) {
                        if (((UIBlockMusicTrack) ((UIBlock) aVar.next())).z.Pb()) {
                            r4 = true;
                        }
                    }
                }
                return Boolean.valueOf(r4);
            case 12:
                return j5g.O0((List) obj);
            case 13:
                return new tvf0((NewsEntriesContainer) obj, null);
            case 14:
                cj60 cj60Var = (cj60) obj;
                if (cj60Var.b.isEmpty() && !cj60Var.c && !cj60Var.d) {
                    r4 = true;
                }
                return Boolean.valueOf(r4);
            case 15:
                return Boolean.valueOf(((dug0.c) obj).c());
            case 16:
                return air.b('\"', "\"", (String) obj);
            case 17:
                return VideoLargeListState.a((VideoLargeListState) obj, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, 0, 67108351);
            case 18:
                int i2 = PollResultsFragment.b0;
                return Boolean.valueOf(((VKApiExecutionException) obj).s() == 253);
            case 19:
                MediaOwner mediaOwner = ((PostingState.Editing) obj).c.g;
                if (mediaOwner != null) {
                    return mediaOwner.b;
                }
                return null;
            case 20:
                return new ltd0.d((List) obj);
            case 21:
                List list = (List) obj;
                Object obj2 = list.get(0);
                int intValue = (obj2 != null ? (Integer) obj2 : null).intValue();
                Object obj3 = list.get(1);
                return new qko0(jgz.c(intValue, (obj3 != null ? (Integer) obj3 : null).intValue()));
            case 22:
                return new mmh0.e(((tj50.a) obj).a(new p6e0(3), ao8.d));
            case 23:
                CharSequence charSequence = ((goh0.a) obj).b.Y0;
                String obj4 = charSequence != null ? charSequence.toString() : null;
                return obj4 == null ? "" : obj4;
            case 24:
                qgi0.r((tgi0) obj, "narrative_bottom_sheet_close_icon");
                return s3q0.a;
            case 25:
                id3 id3Var = (id3) obj;
                hd3.a(id3Var, btm0.c);
                hd3.b(id3Var, "⚠️");
                return s3q0.a;
            case 26:
                return PlaylistScreenState.a((PlaylistScreenState) obj, null, null, false, false, null, null, null, 1983);
            case 27:
                return ((dug0.c) obj).c;
            case 28:
                wmi0 wmi0Var = wmi0.a;
                String[] strArr = (String[]) ((TemporaryCache) obj).b.toArray(new String[0]);
                wmi0Var.c((String[]) Arrays.copyOf(strArr, strArr.length));
                return s3q0.a;
            default:
                return Boolean.valueOf(((sx40) obj) instanceof sx40.s);
        }
    }
}
