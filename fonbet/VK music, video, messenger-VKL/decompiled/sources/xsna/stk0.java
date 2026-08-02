package xsna;

import android.graphics.Color;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vkontakte.android.R;

/* compiled from: StateExt.kt */
/* loaded from: classes18.dex */
public final class stk0 {

    /* compiled from: StateExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeliveryPoint.Service.values().length];
            try {
                iArr[DeliveryPoint.Service.SDEK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeliveryPoint.Service.BOXBERRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeliveryPoint.Service.RUSSIAN_POST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int a(DeliveryPoint.PlaceMark placeMark, DeliveryPoint.Service service) {
        String str = placeMark.c;
        if (str != null) {
            return Color.parseColor(str);
        }
        int i = a.$EnumSwitchMapping$0[service.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? dhr0.t.c(R.attr.vk_ui_icon_secondary) : dhr0.t.c(R.attr.vk_ui_accent_blue) : dhr0.t.c(R.attr.vk_ui_accent_raspberry_pink) : dhr0.t.c(R.attr.vk_ui_accent_green);
    }
}
