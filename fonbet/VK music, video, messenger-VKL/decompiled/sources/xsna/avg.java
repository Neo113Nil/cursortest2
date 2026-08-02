package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.group.GroupChat;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: CommunityChatItemHolder.kt */
/* loaded from: classes5.dex */
public final class avg extends vif0<tmb> {
    public final ksb n;

    public avg(ViewGroup viewGroup, cpu cpuVar, mxv mxvVar) {
        super(tf3.b(viewGroup, R.layout.item_profile_group_chat, viewGroup, false));
        this.n = new ksb(this.itemView, cpuVar, mxvVar);
    }

    @Override // xsna.vif0
    public final void i6(tmb tmbVar) {
        tmb tmbVar2 = tmbVar;
        if (tmbVar2 instanceof jsb) {
            jsb jsbVar = (jsb) tmbVar2;
            ksb ksbVar = this.n;
            TextView textView = ksbVar.h;
            View view = ksbVar.g;
            ksbVar.i = jsbVar;
            VKImageView vKImageView = ksbVar.e;
            GroupChat groupChat = jsbVar.b;
            vKImageView.s0(groupChat.d);
            ksbVar.f.setText(groupChat.c);
            if (groupChat.l) {
                bwt0.X(R.drawable.vk_icon_donut_color_12, view);
                bwt0.p0(view, true);
            } else {
                bwt0.p0(view, false);
            }
            CharSequence charSequence = (CharSequence) jsbVar.c.getValue();
            if (charSequence == null || charSequence.length() == 0) {
                bwt0.p0(textView, false);
            } else {
                textView.setText(charSequence);
                bwt0.p0(textView, true);
            }
        }
    }
}
