package xsna;

import android.content.Context;
import com.vk.im.design.view.chat_profile.ChatProfileActionsView;
import com.vkontakte.android.R;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class jwb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ jwb(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Context context = this.c;
        switch (i) {
            case 0:
                int i2 = ChatProfileActionsView.z;
                return new xub(R.drawable.vk_icon_more_horizontal_28, 4, context.getString(R.string.vkim_chat_profile_action_more), Integer.valueOf(R.attr.vk_ui_accent_purple));
            default:
                int i3 = OneVideoAdControlsViewNew.E;
                return m33.a(R.drawable.one_video_icon_chevron_16, context);
        }
    }
}
