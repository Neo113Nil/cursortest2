package xsna;

import com.vk.api.generated.ads.dto.AdsItemBlockAdItemDto;
import com.vk.api.generated.ads.dto.AdsItemBlockAdStatPixelDto;
import com.vk.dto.ads.PixelStats;
import com.vk.toggle.features.SmbAdFeatures;
import com.vkontakte.android.attachments.ShitAttachment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: AdsBlockDtoToAdsMapper.kt */
/* loaded from: classes3.dex */
public final class ru0 {
    public final uu0 a;
    public final hqa0 b;

    /* compiled from: AdsBlockDtoToAdsMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdsItemBlockAdItemDto.TypeDto.values().length];
            try {
                iArr[AdsItemBlockAdItemDto.TypeDto.SITE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdsItemBlockAdItemDto.TypeDto.APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdsItemBlockAdItemDto.TypeDto.APP_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdsItemBlockAdItemDto.TypeDto.APP_SLIDER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdsItemBlockAdItemDto.TypeDto.SITE_SLIDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AdsItemBlockAdItemDto.TypeDto.POST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AdsItemBlockAdItemDto.TypeDto.HTML5_AD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ru0(uu0 uu0Var, hqa0 hqa0Var) {
        this.a = uu0Var;
        this.b = hqa0Var;
    }

    public final void a(dqa0 dqa0Var, gzs<s3q0> gzsVar) {
        ArrayList<ShitAttachment.Card> arrayList;
        SmbAdFeatures smbAdFeatures = SmbAdFeatures.FEATURE_SMB_PIXEL_STATS_REFACTORING;
        smbAdFeatures.getClass();
        if (!com.vk.toggle.b.A.a(smbAdFeatures)) {
            gzsVar.invoke();
            return;
        }
        List<PixelStats> u6 = dqa0Var.u6(AdsItemBlockAdStatPixelDto.TypeDto.LOAD);
        hqa0 hqa0Var = this.b;
        hqa0Var.a(u6);
        if (!(dqa0Var instanceof ShitAttachment) || (arrayList = ((ShitAttachment) dqa0Var).K) == null) {
            return;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            hqa0Var.a(((ShitAttachment.Card) it.next()).q.u6(AdsItemBlockAdStatPixelDto.TypeDto.LOAD));
        }
    }
}
