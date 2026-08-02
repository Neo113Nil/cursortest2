package xsna;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.ext.CounterType;
import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: SuperAppShowcaseFooterMenuHolder.kt */
/* loaded from: classes6.dex */
public final class mbn0 extends ucn0<lbn0> {
    public static final int u = iah0.a(24);
    public final u7n0 p;
    public final TextView q;
    public final ViewGroup r;
    public final TextView s;
    public final ImageView t;

    public mbn0(View view, u7n0 u7n0Var, wxt0 wxt0Var) {
        super(view, wxt0Var);
        this.p = u7n0Var;
        TextView textView = (TextView) this.itemView.findViewById(R.id.title);
        this.q = textView;
        this.r = (ViewGroup) this.itemView.findViewById(R.id.icon);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.counter);
        this.s = textView2;
        this.t = (ImageView) this.itemView.findViewById(R.id.dot);
        jjc.g(view, new n9m0(this, 6));
        textView.setTextSize(1, 16.0f);
        textView2.setTextSize(1, 15.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // xsna.hf6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W5(zif0 zif0Var) {
        Integer num;
        String str;
        Drawable a;
        WebImageSize f;
        CustomMenuInfo customMenuInfo = ((lbn0) zif0Var).b;
        Context context = this.itemView.getContext();
        List<String> list = customMenuInfo.h;
        String str2 = null;
        if (list != null) {
            String str3 = (String) j5g.b0(!dhr0.C().b ? 1 : 0, list);
            if (str3 == null) {
                str3 = null;
            }
            try {
                num = Integer.valueOf(Color.parseColor(str3));
            } catch (Throwable unused) {
            }
            int intValue = num == null ? num.intValue() : e3m.f(R.attr.vk_ui_text_primary, context);
            TextView textView = this.q;
            textView.setTextColor(intValue);
            this.itemView.getContext();
            str = customMenuInfo.f;
            if (drm0.N(str)) {
                str = null;
            }
            textView.setText(str);
            VKImageController<View> b6 = b6(this.r);
            a = m33.a(R.drawable.vk_icon_services_outline_28, this.itemView.getContext());
            VKImageController.b bVar = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, Integer.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, this.itemView.getContext())), null, null, 63487);
            if (a == null) {
                b6.a(a, bVar);
            } else {
                WebImage webImage = customMenuInfo.k;
                if (webImage != null && (f = webImage.f(u)) != null) {
                    str2 = f.b;
                }
                b6.f(str2, bVar);
            }
            dz5.h(customMenuInfo.g, CounterType.WITH_PLUS, this.s, this.t, null, null, null, null, 120);
        }
        num = null;
        if (num == null) {
        }
        TextView textView2 = this.q;
        textView2.setTextColor(intValue);
        this.itemView.getContext();
        str = customMenuInfo.f;
        if (drm0.N(str)) {
        }
        textView2.setText(str);
        VKImageController<View> b62 = b6(this.r);
        a = m33.a(R.drawable.vk_icon_services_outline_28, this.itemView.getContext());
        VKImageController.b bVar2 = new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, 0, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, Integer.valueOf(e3m.f(R.attr.vk_ui_icon_accent_themed, this.itemView.getContext())), null, null, 63487);
        if (a == null) {
        }
        dz5.h(customMenuInfo.g, CounterType.WITH_PLUS, this.s, this.t, null, null, null, null, 120);
    }
}
