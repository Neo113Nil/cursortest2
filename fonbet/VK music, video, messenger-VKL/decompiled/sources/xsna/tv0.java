package xsna;

import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.statistic.DeprecatedStatisticUrl;
import com.vkontakte.android.attachments.ShitAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;

/* compiled from: AdsClipsAnalyticsImpl.kt */
/* loaded from: classes16.dex */
public final class tv0 implements rv0 {
    public final hqa0 a;
    public final Object b = msy.a(LazyThreadSafetyMode.NONE, new sv0(0));

    public tv0(hqa0 hqa0Var) {
        this.a = hqa0Var;
    }

    public static void i(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.vkontakte.android.data.b.p((DeprecatedStatisticUrl) it.next());
        }
    }

    @Override // xsna.rv0
    public final void a(String str) {
        this.a.d(str);
    }

    @Override // xsna.rv0
    public final void b(ShitAttachment shitAttachment) {
        if (!j()) {
            i(shitAttachment.S.b("clip_comment"));
            return;
        }
        this.a.a(shitAttachment.a0.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLIP_COMMENT));
    }

    @Override // xsna.rv0
    public final void c(PromoPost promoPost) {
        if (!j()) {
            i(promoPost.v.b("clip_share"));
            return;
        }
        this.a.a(promoPost.B.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLIP_SHARE));
    }

    @Override // xsna.rv0
    public final void d(ShitAttachment shitAttachment) {
        if (!j()) {
            i(shitAttachment.S.b("clip_author_click"));
            return;
        }
        this.a.a(shitAttachment.a0.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLIP_AUTHOR_CLICK));
    }

    @Override // xsna.rv0
    public final void e(ShitAttachment shitAttachment) {
        VideoFile videoFile;
        VideoAttachment videoAttachment = shitAttachment.I;
        if (videoAttachment == null || (videoFile = videoAttachment.k) == null || !videoFile.X()) {
            if (j()) {
                this.a.a(shitAttachment.a0.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLIP_BOOKMARK));
            } else {
                i(shitAttachment.S.b("clip_bookmark"));
            }
        }
    }

    @Override // xsna.rv0
    public final void f(ShitAttachment shitAttachment) {
        VideoFile videoFile;
        VideoAttachment videoAttachment = shitAttachment.I;
        if (videoAttachment == null || (videoFile = videoAttachment.k) == null || !videoFile.O9()) {
            if (j()) {
                this.a.a(shitAttachment.a0.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLIP_LIKE));
            } else {
                i(shitAttachment.S.b("clip_like"));
            }
        }
    }

    @Override // xsna.rv0
    public final void g(ShitAttachment shitAttachment) {
        if (!j()) {
            i(shitAttachment.S.b("clip_share"));
            return;
        }
        this.a.a(shitAttachment.a0.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLIP_SHARE));
    }

    @Override // xsna.rv0
    public final void h(ShitAttachment shitAttachment) {
        VideoFile videoFile;
        VideoAttachment videoAttachment = shitAttachment.I;
        if (videoAttachment == null || (videoFile = videoAttachment.k) == null || !videoFile.U()) {
            if (j()) {
                this.a.a(shitAttachment.a0.u6(AdsItemBlockAdStatPixelDto.TypeDto.CLIP_SUBSCRIBE));
            } else {
                i(shitAttachment.S.b("clip_subscribe"));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean j() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
