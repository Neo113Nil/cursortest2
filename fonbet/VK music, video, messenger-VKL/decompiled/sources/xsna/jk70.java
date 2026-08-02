package xsna;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.ik70;

/* compiled from: NotificationsSubscriptionsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class jk70 extends s770 {
    public final /* synthetic */ Context c;

    public jk70(Context context) {
        this.c = context;
    }

    @Override // xsna.s770
    public final void m(hkp hkpVar, Object obj, int i) {
        ik70.a aVar = (ik70.a) obj;
        Integer num = aVar.c;
        TextView textView = (TextView) hkpVar.f(R.id.action_subtitle);
        Integer num2 = aVar.e;
        if (num2 != null) {
            textView.setText(num2.intValue());
        }
        textView.setVisibility(num2 != null ? 0 : 8);
        ((TextView) hkpVar.f(R.id.action_text)).setText(aVar.d);
        ImageView imageView = (ImageView) hkpVar.f(R.id.action_icon);
        imageView.setImageResource(aVar.b);
        imageView.setVisibility(0);
        hkpVar.f(R.id.action_check_icon).setVisibility(aVar.f ? 0 : 8);
        ImageView imageView2 = (ImageView) hkpVar.f(R.id.action_icon_end);
        if (num != null) {
            imageView2.setImageResource(num.intValue());
        }
        imageView2.setVisibility(num != null ? 0 : 8);
    }

    @Override // xsna.s770
    public final hkp p(View view) {
        hkp hkpVar = new hkp(7);
        View findViewById = view.findViewById(R.id.action_icon);
        Context context = this.c;
        ((ImageView) findViewById).setColorFilter(e3m.f(R.attr.vk_ui_icon_accent_themed, context));
        hkpVar.d(findViewById);
        View findViewById2 = view.findViewById(R.id.action_text);
        TextView textView = (TextView) findViewById2;
        textView.setTextAppearance(R.style.VkUiTypography_Text);
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, context));
        hkpVar.d(findViewById2);
        View findViewById3 = view.findViewById(R.id.action_subtitle);
        ((TextView) findViewById3).setTextColor(e3m.f(R.attr.vk_ui_text_secondary, context));
        hkpVar.d(findViewById3);
        View findViewById4 = view.findViewById(R.id.action_icon_end);
        ((ImageView) findViewById4).setColorFilter(e3m.f(R.attr.vk_ui_icon_accent_themed, context));
        hkpVar.d(findViewById4);
        View findViewById5 = view.findViewById(R.id.action_check_icon);
        ImageView imageView = (ImageView) findViewById5;
        imageView.setImageResource(R.drawable.vk_icon_done_outline_24);
        imageView.setColorFilter(context.getColor(R.color.vk_azure_300));
        hkpVar.d(findViewById5);
        return hkpVar;
    }
}
