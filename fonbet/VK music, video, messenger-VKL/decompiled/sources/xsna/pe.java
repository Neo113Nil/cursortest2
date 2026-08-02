package xsna;

import android.content.Context;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.voip.api.join.JoinData;
import com.vkontakte.android.R;

/* compiled from: AbstractGroupCallInviteVc.kt */
/* loaded from: classes7.dex */
public abstract class pe {
    public final Context a;
    public TextView b;
    public AvatarView c;
    public TextView d;

    public pe(Context context) {
        this.a = context;
    }

    public abstract void a();

    public void b(s89 s89Var) {
        JoinData joinData = s89Var.e;
        Context context = this.a;
        elr0 a = elr0.a(R.drawable.ic_call_invite_72, null, context.getResources());
        AvatarView avatarView = this.c;
        if (avatarView == null) {
            avatarView = null;
        }
        avatarView.T0(joinData.d, a);
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        textView.setText(joinData.c);
        int i = s89Var.d;
        TextView textView2 = this.d;
        (textView2 != null ? textView2 : null).setText(i == 0 ? context.getResources().getString(R.string.voip_history_ongoing_call_no_participants) : context.getResources().getQuantityString(R.plurals.voip_history_ongoing_call_participants_count, i, Integer.valueOf(i)));
        a();
    }
}
