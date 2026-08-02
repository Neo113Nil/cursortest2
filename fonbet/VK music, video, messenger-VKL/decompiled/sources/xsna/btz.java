package xsna;

import com.vk.dto.stickers.StickerStockItemPreviewImage;
import com.vk.stickers.views.sticker.StickerPackPreview;
import com.vk.toggle.features.VasFeatures;
import xsna.u5d0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class btz implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ btz(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        int i2 = this.c;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                ctz.a((izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).intValue();
                ((sjg0) obj3).c(ne7.I(i2 | 1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            default:
                StickerPackPreview stickerPackPreview = (StickerPackPreview) obj3;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                bpn0 bpn0Var = u5d0.a;
                String b = u5d0.a.b(intValue2, stickerPackPreview.p, intValue > intValue2);
                StickerStockItemPreviewImage stickerStockItemPreviewImage = stickerPackPreview.p;
                String zb = stickerStockItemPreviewImage != null ? stickerStockItemPreviewImage.zb() : null;
                VasFeatures vasFeatures = VasFeatures.STICKERS_URL_CHECK;
                vasFeatures.getClass();
                if (com.vk.toggle.b.A.a(vasFeatures)) {
                    Integer m = zb != null ? arm0.m(10, zb.substring(drm0.K(0, 6, zb, "/packs/", false) + 7, drm0.K(0, 6, zb, "/icon", false))) : null;
                    if (m == null || m.intValue() != i2) {
                        com.vk.metrics.eventtracking.b.a.a(new RuntimeException("Wrong sticker pack image; packIdFromUrl=" + m + "; packPreview=" + i2));
                    }
                }
                return b;
        }
    }
}
