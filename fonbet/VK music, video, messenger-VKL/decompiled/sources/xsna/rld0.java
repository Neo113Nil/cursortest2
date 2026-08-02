package xsna;

import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.Image;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelSubtype;
import com.vk.ecomm.market.good.good2.presentation.label.ProductLabelType;
import com.vk.toggle.b;
import com.vk.toggle.features.SoccomFeatures;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONObject;

/* compiled from: ProductCardMainInfoViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class rld0 {
    public static final boolean a;
    public static final boolean b;
    public static final bpn0 c;

    /* compiled from: ProductCardMainInfoViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductLabelSubtype.values().length];
            try {
                iArr[ProductLabelSubtype.FOMO_FRIENDS_VIEWS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductLabelSubtype.FOMO_FRIENDS_PURCHASES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductLabelSubtype.FOMO_BOOKMARKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductLabelSubtype.FOMO_VIEWS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductLabelSubtype.FOMO_POPULAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductLabelSubtype.FOMO_PURCHASES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProductLabelSubtype.FOMO_POPULAR_SELLER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProductLabelSubtype.FOMO_GOOD_SELLER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        JSONObject g;
        SoccomFeatures soccomFeatures = SoccomFeatures.PRODUCT_CARD_RATING;
        soccomFeatures.getClass();
        com.vk.toggle.b bVar = com.vk.toggle.b.A;
        a = bVar.a(soccomFeatures);
        boolean z = false;
        b.d j = bVar.j(soccomFeatures.getKey(), false);
        if (j != null && (g = j.g()) != null && g.has("is_label_rating_enabled")) {
            z = g.getBoolean("is_label_rating_enabled");
        }
        b = z;
        c = new bpn0(new dgc0(1));
    }

    public static final boolean a(Map.Entry<String, lpd0> entry) {
        if (entry.getValue().a == ProductLabelType.OZON) {
            return entry.getValue().b == ProductLabelSubtype.PAYMENT || entry.getValue().b == ProductLabelSubtype.DELIVERY;
        }
        return false;
    }

    public static final List<Image> b(List<? extends List<BaseImageDto>> list) {
        if (list == null) {
            return EmptyList.b;
        }
        List<? extends List<BaseImageDto>> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(b210.f((List) it.next()));
        }
        return arrayList;
    }
}
