package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.dto.group.GroupChat;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: ChatItemBinder.kt */
/* loaded from: classes5.dex */
public final class ksb implements View.OnClickListener {
    public final View b;
    public final cpu c;
    public final mxv d;
    public final VKImageView e;
    public final TextView f;
    public final View g;
    public final TextView h;
    public jsb i;

    public ksb(View view, cpu cpuVar, mxv mxvVar) {
        this.b = view;
        this.c = cpuVar;
        this.d = mxvVar;
        this.e = (VKImageView) view.findViewById(R.id.photo);
        this.f = (TextView) view.findViewById(R.id.title);
        this.g = view.findViewById(R.id.icon);
        this.h = (TextView) view.findViewById(R.id.description);
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jsb jsbVar;
        GroupChat groupChat;
        if (jjc.b() || (jsbVar = this.i) == null || (groupChat = jsbVar.b) == null) {
            return;
        }
        long j = groupChat.h;
        View view2 = this.b;
        if (j > 0) {
            o0w.x(this.d.b(), view2.getContext(), null, j + 2000000000, null, null, null, false, null, null, null, null, null, null, "community_page", null, null, null, false, null, null, null, null, null, 1073733626);
        } else {
            this.c.i(view2.getContext(), groupChat.e);
        }
    }
}
