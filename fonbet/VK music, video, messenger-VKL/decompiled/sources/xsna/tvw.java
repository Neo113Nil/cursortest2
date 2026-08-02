package xsna;

import android.content.Context;
import com.vk.feed.core.models.ImagePhoto;
import com.vk.feed.core.models.info.InfoButton;
import com.vk.feed.core.models.info.InfoPopup;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.dw20;
import xsna.e3m;

/* compiled from: InfoBlockPopupInteractor.kt */
/* loaded from: classes4.dex */
public final class tvw {
    /* JADX WARN: Type inference failed for: r8v5, types: [T, xsna.dw20] */
    public static void a(Context context, InfoPopup infoPopup) {
        Integer num;
        String str;
        String str2 = infoPopup.b;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dw20.b bVar = new dw20.b(context, null);
        ImagePhoto imagePhoto = infoPopup.c;
        if (imagePhoto == null || (str = imagePhoto.d) == null) {
            num = null;
        } else if (str.equals("logo_dzen")) {
            num = Integer.valueOf(R.drawable.vk_icon_logo_dzen_56);
        } else if (str.equals("info_outline")) {
            num = Integer.valueOf(R.drawable.vk_icon_info_outline_56);
        } else {
            Integer d = wp.d(context, "vk_icon_", str, "_56");
            num = d == null ? wp.d(context, "vk_icon_", str, "_outline_56") : d;
        }
        if (num != null && num.intValue() != 0) {
            if (num.intValue() == R.drawable.vk_icon_logo_dzen_56) {
            }
        }
        if (str2.length() > 0) {
            bVar.w0(str2);
            bVar.A0(Integer.valueOf(R.style.VkUiTypography_Subhead));
            e3m.a aVar = e3m.a;
            bVar.y0(context.getColor(R.color.vk_steel_gray_500));
        }
        InfoButton infoButton = infoPopup.d;
        String str3 = infoButton != null ? infoButton.b : null;
        if (str3 != null && str3.length() != 0) {
            bVar.V(str3, new u0w(ref$ObjectRef, 1));
        }
        ref$ObjectRef.element = bVar.P0().I0(null);
    }
}
