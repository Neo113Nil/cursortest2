package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.google.gson.Gson;
import com.ironsource.B5;
import com.vk.catalog.mvi.block.video.impl.video.trailer.VideoTrailerView$State;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.imageloader.view.VKImageView;
import com.vk.libvideo.design.view.videotexture.VideoTextureView;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.story.impl.domain.interactor.cache.StoriesCacheManager;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.OpinionStickerState;
import com.vk.subscription.api.SubscribeStatus;
import com.vkontakte.android.R;
import java.lang.ref.SoftReference;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import xsna.n1b0;
import xsna.t7z;
import xsna.tj50;
import xsna.txb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ye40 implements izs {
    public final /* synthetic */ int b;

    public /* synthetic */ ye40(int i) {
        this.b = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        SoftReference<Bitmap> softReference = null;
        switch (this.b) {
            case 0:
                return new tt70(5, 0L, rli0.A(rli0.y(rli0.t(new i5g((List) obj), new wh1(26)), 2)));
            case 1:
                Context context = (Context) obj;
                VKImageView vKImageView = new VKImageView(context, null, 6, 0);
                njt hierarchy = vKImageView.getHierarchy();
                RoundingParams roundingParams = vKImageView.getHierarchy().c;
                if (roundingParams == null) {
                    roundingParams = new RoundingParams();
                }
                roundingParams.b = true;
                roundingParams.c(iah0.a(0.5f), context.getColor(R.color.vk_black_alpha8));
                hierarchy.u(roundingParams);
                vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                vKImageView.setPlaceholderImage(R.drawable.user_placeholder);
                return vKImageView;
            case 2:
                bn40.c((Throwable) obj, new Object[0]);
                return s3q0.a;
            case 3:
                h7f0 h7f0Var = (h7f0) obj;
                h7f0Var.u(h7f0Var.getCurrentState());
                return s3q0.a;
            case 4:
                return Integer.valueOf(((AttachVideoMsg) obj).c);
            case 5:
                OpinionStickerState opinionStickerState = (OpinionStickerState) obj;
                return new com.vk.story.viewer.impl.presentation.stories.view.dynstickers.opinion.h(opinionStickerState.b, opinionStickerState.c, opinionStickerState.d, opinionStickerState.e, opinionStickerState.f != null, opinionStickerState.g);
            case 6:
                return Long.valueOf(((Integer) obj).intValue() * 1000);
            case 7:
                tj50.a aVar = (tj50.a) obj;
                t3v t3vVar = new t3v(10);
                ao8 ao8Var = ao8.d;
                return new n1b0.b(aVar.a(t3vVar, ao8Var), aVar.a(k1b0.b, ao8Var), aVar.a(new xsq(18), ao8Var), aVar.a(new irt(9), ao8Var));
            case 8:
                qgi0.r((tgi0) obj, "trackTitle");
                return s3q0.a;
            case 9:
                return new txb0.a(((tj50.a) obj).e(pxb0.b));
            case 10:
                L.i((Throwable) obj);
                return s3q0.a;
            case 11:
                return ((PostingState.Editing) obj).i.h;
            case 12:
                float floatValue = ((Float) obj).floatValue();
                t7z.a.a(floatValue);
                return new t7z.a(floatValue);
            case 13:
                return new a6h0((ViewGroup) obj);
            case 14:
                com.vk.metrics.eventtracking.b.a.q((Throwable) obj);
                return s3q0.a;
            case 15:
                return (Narrative) j5g.Y((VKList) obj);
            case 16:
                StoriesCacheManager.StoriesCache storiesCache = (StoriesCacheManager.StoriesCache) obj;
                return new GetStoriesResponse(storiesCache.c, storiesCache.b.b);
            case 17:
                L.i((Throwable) obj);
                return s3q0.a;
            case 18:
                Throwable th = (Throwable) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{th});
                }
                return s3q0.a;
            case 19:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                Charset charset = emb.b;
                return v1v.a(B5.U, URLEncoder.encode(str, charset.name()), URLEncoder.encode(str2, charset.name()));
            case 20:
                return s3q0.a;
            case 21:
                qyg0 V0 = ((hyg0) obj).V0("SELECT `ugc_packs`.`ownerId` AS `ownerId`, `ugc_packs`.`id` AS `id`, `ugc_packs`.`stickers` AS `stickers`, `ugc_packs`.`hash` AS `hash`, `ugc_packs`.`editParams` AS `editParams` FROM ugc_packs");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (V0.step()) {
                        long j = V0.getLong(0);
                        Gson gson = psj.a;
                        UserId userId = new UserId(j);
                        long j2 = V0.getLong(1);
                        List j3 = psj.j(V0.l2(2));
                        String l2 = V0.l2(3);
                        String l22 = V0.isNull(4) ? null : V0.l2(4);
                        arrayList.add(new dwp0(userId, j2, j3, l2, l22 == null ? null : psj.i(l22)));
                    }
                    return arrayList;
                } finally {
                    V0.close();
                }
            case 22:
                SubscribeStatus.a aVar2 = SubscribeStatus.Companion;
                int intValue = ((Integer) obj).intValue();
                aVar2.getClass();
                return SubscribeStatus.a.a(intValue);
            case 23:
                return s3q0.a;
            case 24:
                return s3q0.a;
            case 25:
                return Boolean.valueOf(((Optional) obj).isPresent());
            case 26:
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    SoftReference<Bitmap> softReference2 = VideoTextureView.r;
                    softReference = new SoftReference<>(bitmap);
                }
                VideoTextureView.r = softReference;
                return s3q0.a;
            case 27:
                return VideoTrailerView$State.a((VideoTrailerView$State) obj, null, null, null, null, null, null, false, false, true, 4095);
            case 28:
                return s3q0.a;
            default:
                return mcr0.h(Uri.parse((String) obj));
        }
    }
}
