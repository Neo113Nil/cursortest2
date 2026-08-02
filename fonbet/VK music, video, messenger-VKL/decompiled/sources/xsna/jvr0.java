package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vkontakte.android.R;

/* compiled from: VhSharedChat.kt */
/* loaded from: classes2.dex */
public final class jvr0 extends zqr0<View> {
    public static final /* synthetic */ int r = 0;
    public final TextView o;
    public final TextView p;
    public final AvatarView q;

    public jvr0(View view) {
        super(view);
        this.o = (TextView) this.l.findViewById(R.id.item_shared_chat__title);
        this.p = (TextView) this.l.findViewById(R.id.item_shared_chat__subtitle);
        this.q = (AvatarView) this.l.findViewById(R.id.item_shared_chat__avatar);
    }

    @Override // xsna.zqr0, xsna.jsx0
    public final boolean H4() {
        return false;
    }
}
