package xsna;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.voip.ui.settings.participants_view.CallSettingsItem;
import com.vkontakte.android.R;

/* compiled from: VhInviteUsersHeader.kt */
/* loaded from: classes7.dex */
public final class xrr0 extends jqr0<CallSettingsItem.g> {
    public static final /* synthetic */ int m = 0;
    public final fuw0 l;

    public xrr0(LinearLayout linearLayout) {
        super(linearLayout);
        this.l = fuw0.a;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        f4m.m(1, linearLayout);
        f4m.t(iah0.a(12), linearLayout);
        ImageView imageView = new ImageView(this.itemView.getContext());
        linearLayout.addView(imageView);
        imageView.setImageDrawable(new baf0(m33.a(R.drawable.vk_icon_user_add_outline_56, imageView.getContext()), dhr0.t.c(R.attr.vk_ui_icon_accent)));
        float f = 16;
        f4m.t(iah0.a(f), imageView);
        TextView textView = new TextView(this.itemView.getContext());
        linearLayout.addView(textView);
        textView.setTextAppearance(R.style.VkUiTypography_DisplayTitle4);
        textView.setText(R.string.voip_participants_invite_users_header_title);
        dhr0.a.getClass();
        textView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, dhr0.s()));
        textView.setGravity(1);
        bwt0.f0(textView, 0, iah0.a(2), 0, iah0.a(f), 5);
    }
}
