package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.core.tool.view.galvitalayout.GalvitaLayout;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFileOld;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vkontakte.android.R;

/* compiled from: MarketProductMediaItemsAdapter.kt */
/* loaded from: classes18.dex */
public final class jc10 extends o5t<MediaContentItem> {
    public final Context c;
    public final w6e d;
    public final kdg0 e;
    public final g7s0 f;

    /* compiled from: MarketProductMediaItemsAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketProductLinkedContentItemDto.ContentTypeDto.values().length];
            try {
                iArr[MarketProductLinkedContentItemDto.ContentTypeDto.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public jc10(Context context, w6e w6eVar, kdg0 kdg0Var, g7s0 g7s0Var) {
        this.c = context;
        this.d = w6eVar;
        this.e = kdg0Var;
        this.f = g7s0Var;
    }

    @Override // xsna.o5t
    public final float a(int i) {
        MediaContentItem mediaContentItem = (MediaContentItem) j5g.b0(i, this.a);
        if (mediaContentItem == null) {
            return 1.0f;
        }
        int i2 = mediaContentItem.d;
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
        if (i2 > 0) {
            return ((r10.widthPixels / this.c.getResources().getDisplayMetrics().density) - 24) / i2;
        }
        Float f = null;
        if (marketProductLinkedContentItemDto.d() != MarketProductLinkedContentItemDto.ContentTypeDto.VIDEO) {
            PhotosPhotoDto e = marketProductLinkedContentItemDto.e();
            if (e == null) {
                return 1.0f;
            }
            ImageSize imageSize = (ImageSize) ixj0.b(xfa0.a(e).y.b);
            Integer valueOf = imageSize != null ? Integer.valueOf(imageSize.d.b) : null;
            Integer valueOf2 = imageSize != null ? Integer.valueOf(imageSize.d.c) : null;
            if (valueOf != null && valueOf2 != null) {
                f = Float.valueOf(valueOf.intValue() / valueOf2.intValue());
            }
            if (f != null) {
                return f.floatValue();
            }
            return 1.0f;
        }
        VideoVideoFullDto g = marketProductLinkedContentItemDto.g();
        if (g == null) {
            return 1.0f;
        }
        VideoFileOld d = ums0.d(ums0.a, g, null, null, null, 30);
        ImageSize imageSize2 = (ImageSize) ixj0.b(d.I0.b);
        if (imageSize2 == null) {
            imageSize2 = (ImageSize) ixj0.b(d.J0.b);
        }
        Integer valueOf3 = imageSize2 != null ? Integer.valueOf(imageSize2.d.b) : null;
        Integer valueOf4 = imageSize2 != null ? Integer.valueOf(imageSize2.d.c) : null;
        if (valueOf3 != null && valueOf4 != null) {
            f = Float.valueOf(valueOf3.intValue() / valueOf4.intValue());
        }
        if (f != null) {
            return f.floatValue();
        }
        return 1.0f;
    }

    @Override // xsna.o5t
    public final int b(int i) {
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto;
        MediaContentItem mediaContentItem = (MediaContentItem) j5g.b0(i, this.a);
        MarketProductLinkedContentItemDto.ContentTypeDto d = (mediaContentItem == null || (marketProductLinkedContentItemDto = mediaContentItem.b) == null) ? null : marketProductLinkedContentItemDto.d();
        return (d == null ? -1 : a.$EnumSwitchMapping$0[d.ordinal()]) == 1 ? 1 : 0;
    }

    @Override // xsna.o5t
    public final void c(d6t d6tVar, int i) {
        MediaContentItem mediaContentItem = (MediaContentItem) j5g.b0(i, this.a);
        if (mediaContentItem != null && (d6tVar instanceof wa10)) {
            ((wa10) d6tVar).a(mediaContentItem);
        }
    }

    @Override // xsna.o5t
    public final d6t d(GalvitaLayout galvitaLayout, int i) {
        w6e w6eVar = this.d;
        kdg0 kdg0Var = this.e;
        if (i == 1) {
            qcy<Object>[] qcyVarArr = bwt0.a;
            return new jd10((ViewGroup) LayoutInflater.from(galvitaLayout.getContext()).inflate(R.layout.good_media_content_video_item_view, (ViewGroup) galvitaLayout, false), i, w6eVar, kdg0Var, this.f);
        }
        qcy<Object>[] qcyVarArr2 = bwt0.a;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(galvitaLayout.getContext()).inflate(R.layout.good_media_content_photo_item_view, (ViewGroup) galvitaLayout, false);
        tb10 tb10Var = new tb10(viewGroup, i, w6eVar, kdg0Var);
        viewGroup.setOnClickListener(new hpg(1, tb10Var, w6eVar));
        return tb10Var;
    }
}
