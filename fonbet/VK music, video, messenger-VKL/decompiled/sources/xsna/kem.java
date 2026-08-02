package xsna;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vkontakte.android.R;
import xsna.iem;

/* compiled from: DialogGroupCallBannerVc.kt */
/* loaded from: classes2.dex */
public final class kem {
    public final View a;
    public final StackAvatarView b;
    public final View c;
    public final View d;
    public iem.a e;

    public kem(LayoutInflater layoutInflater, ViewGroup viewGroup, kkm kkmVar) {
        View inflate = layoutInflater.inflate(R.layout.vkim_dialog_group_call_banner, viewGroup, false);
        this.a = inflate;
        StackAvatarView stackAvatarView = (StackAvatarView) inflate.findViewById(R.id.stack_avatar_view);
        this.b = stackAvatarView;
        View findViewById = inflate.findViewById(R.id.stack_avatar_placeholder);
        this.c = findViewById;
        TextView textView = (TextView) inflate.findViewById(R.id.join_btn);
        kkmVar.c(textView, R.attr.vk_legacy_text_link);
        View findViewById2 = inflate.findViewById(R.id.close_btn);
        this.d = findViewById2;
        vam vamVar = new vam(this, 1);
        jjc.g(inflate, vamVar);
        jjc.g(textView, vamVar);
        jjc.g(findViewById2, new nvg(this, 13));
        f4m.j(stackAvatarView);
        f4m.j(findViewById);
    }
}
