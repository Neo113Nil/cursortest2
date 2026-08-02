package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemPreviewImage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* compiled from: PreviewURLCreator.kt */
/* loaded from: classes6.dex */
public final class u5d0 {
    public static final bpn0 a = new bpn0(new e20(23));
    public static final bpn0 b = new bpn0(new f20(28));

    /* compiled from: PreviewURLCreator.kt */
    public static final class a {
        public static String a(StickerStockItem stickerStockItem, int i) {
            bpn0 bpn0Var = u5d0.a;
            return b(i, stickerStockItem.C, false);
        }

        public static String b(int i, StickerStockItemPreviewImage stickerStockItemPreviewImage, boolean z) {
            if (stickerStockItemPreviewImage == null) {
                return null;
            }
            return z ? c(stickerStockItemPreviewImage, i, (Map) u5d0.b.getValue(), stickerStockItemPreviewImage.Bb()) : c(stickerStockItemPreviewImage, i, (Map) u5d0.a.getValue(), stickerStockItemPreviewImage.Ab());
        }

        public static String c(StickerStockItemPreviewImage stickerStockItemPreviewImage, final int i, Map map, Image image) {
            ImageSize Cb;
            String str;
            if (image != null && (Cb = image.Cb(i, true, false)) != null && (str = Cb.d.d) != null) {
                return str;
            }
            Set keySet = map.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj : keySet) {
                if (((Number) obj).intValue() >= i) {
                    arrayList.add(obj);
                }
            }
            Integer num = (Integer) j5g.r0(new Comparator() { // from class: xsna.t5d0
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int intValue = ((Integer) obj2).intValue();
                    int i2 = i;
                    return Math.abs(intValue - i2) - Math.abs(((Integer) obj3).intValue() - i2);
                }
            }, arrayList);
            if (num == null) {
                num = (Integer) j5g.l0(map.keySet());
            }
            StringBuilder sb = new StringBuilder(stickerStockItemPreviewImage.zb());
            sb.append(DomExceptionUtils.SEPARATOR);
            return i5s.a(sb, (String) map.get(num), ".webp");
        }
    }
}
