package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.h7u0;

/* compiled from: LeaveUtils.kt */
/* loaded from: classes5.dex */
public final class lzy {
    public static final h7u0.a a(Context context, gzs gzsVar, boolean z) {
        int i = z ? R.string.community_admin_leave_closed_group_message_with_monetization : R.string.community_admin_leave_closed_group_message;
        int i2 = h7u0.p;
        h7u0.a c = h7u0.b.c(context);
        c.g0(R.string.community_admin_leave_closed_group_title);
        TextView textView = new TextView(new lpj(context, R.style.VkUiTypography_Text));
        textView.setText(i);
        textView.setLineSpacing(cn70.e() * 1, 1.0f);
        dhr0.a.m0(textView, R.attr.vk_ui_text_subhead);
        textView.setPadding(cn70.b(24), cn70.b(6), cn70.b(24), 0);
        textView.setTextSize(16.0f);
        c.f = textView;
        c.c0(R.string.community_admin_leave_closed_group_leave, new jzy(0, gzsVar));
        c.W(R.string.community_admin_leave_closed_group_cancel, new kzy(0));
        return c;
    }
}
