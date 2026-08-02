package xsna;

import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.vmoji.dto.VmojiPurchaseProductResponseDto;
import com.vk.catalog2.common.ui.holders.sticker.StickerPackHorizontalPreviewListItemVh;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.DeletedStoryContainer;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.feed.core.models.feedback.StarsFeedback;
import com.vk.libvideo.api.ad.VideoAdvertisementsRepository;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.stickers.bridge.GiftData;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import xsna.gyw0;
import xsna.iyw0;
import xsna.o9w0;
import xsna.zxw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kpk0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kpk0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((npk0) this.c).U6((StarsFeedback) this.d);
                return s3q0.a;
            case 1:
                f3l0 f3l0Var = (f3l0) this.c;
                ybf0 ybf0Var = new ybf0(f3l0Var.i, f3l0Var.j, (RecyclerView.u) f3l0Var.q.getValue(), f3l0Var.l, f3l0Var.m, (GiftData) this.d, (ViewGroup) obj);
                f3l0Var.r.add(ybf0Var);
                Bundle bundle = f3l0Var.o;
                if (bundle != null) {
                    ybf0Var.o = bundle;
                }
                f3l0Var.s.add(ybf0Var);
                return ybf0Var;
            case 2:
                StickerPackHorizontalPreviewListItemVh stickerPackHorizontalPreviewListItemVh = (StickerPackHorizontalPreviewListItemVh) this.c;
                StickerPackPreview stickerPackPreview = (StickerPackPreview) this.d;
                f9l0 f9l0Var = stickerPackHorizontalPreviewListItemVh.b;
                View view = stickerPackHorizontalPreviewListItemVh.h;
                if (view == null) {
                    view = null;
                }
                f9l0Var.e(view.getContext(), stickerPackPreview, stickerPackHorizontalPreviewListItemVh.c, stickerPackHorizontalPreviewListItemVh.d.b);
                return s3q0.a;
            case 3:
                ctl0 ctl0Var = (ctl0) this.c;
                as80 as80Var = (as80) this.d;
                StoriesContainer storiesContainer = (StoriesContainer) obj;
                if (!(storiesContainer instanceof DeletedStoryContainer)) {
                    storiesContainer.d = false;
                    ctl0Var.b.e(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, new as80(storiesContainer, as80Var.b));
                }
                return s3q0.a;
            case 4:
                ((rem0) ((zgm0) this.c).b.e.b).a(new uem0((UserId) this.d, (Set) obj)).subscribe();
                return s3q0.a;
            case 5:
                izs izsVar = (izs) this.c;
                tho0 tho0Var = (tho0) obj;
                ((wh50) this.d).setValue(tho0Var);
                izsVar.invoke(tho0Var.a.c);
                return s3q0.a;
            case 6:
                rkq0 rkq0Var = (rkq0) this.c;
                ArrayList a = rkq0Var.b().a((ArrayList) obj, (Set) this.d);
                ((foz) rkq0Var.j.getValue()).b(a);
                if (a != null) {
                    return a;
                }
                throw new IllegalStateException("no lives privacy settings received");
            case 7:
                s0s0 s0s0Var = (s0s0) this.c;
                VideoAdvertisementsRepository.AdType adType = (VideoAdvertisementsRepository.AdType) this.d;
                VideoAdvertisementsRepository.a aVar = (VideoAdvertisementsRepository.a) obj;
                if (aVar instanceof VideoAdvertisementsRepository.a.d) {
                    int i = ((VideoAdvertisementsRepository.a.d) aVar).a.a.d;
                    io.reactivex.rxjava3.disposables.c cVar = s0s0Var.m;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    s0s0Var.m = io.reactivex.rxjava3.core.q.B0(i, TimeUnit.SECONDS).subscribe(new f2u(new c1o0(5, s0s0Var, adType), 26));
                }
                return aVar;
            case 8:
                m8u0 m8u0Var = (m8u0) this.c;
                PlaybackActionMeta playbackActionMeta = (PlaybackActionMeta) this.d;
                if (m8u0Var.g) {
                    m8u0Var.b.f(playbackActionMeta);
                }
                return s3q0.a;
            case 9:
                w7k0.d(((w5v0) this.c).b(), (ContextWrapper) this.d, R.string.music_player_snack_bar_common_error);
                return s3q0.a;
            case 10:
                ((r9w0) this.c).U((VmojiPurchaseProductResponseDto) obj, ((o9w0.c) ((o9w0) this.d)).b);
                return s3q0.a;
            default:
                cyw0 cyw0Var = (cyw0) this.c;
                zxw0.l lVar = (zxw0.l) ((zxw0) this.d);
                cyw0Var.T(new gyw0.c(lVar.b));
                cyw0.V(cyw0Var, null, null, null, null, lVar.b, null, null, null, null, (iyw0.a) obj, 495);
                return s3q0.a;
        }
    }
}
