package xsna;

import android.content.DialogInterface;
import android.os.Handler;
import android.widget.EditText;
import com.vk.im.channelcreation.impl.g;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vkontakte.android.sdk.SDKInviteDialog;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class ts8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ts8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SDKInviteDialog.a aVar;
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((gzs) obj).invoke();
                dialogInterface.dismiss();
                break;
            case 1:
                ((com.vk.im.channelcreation.impl.h) obj).O(g.j.b);
                dialogInterface.dismiss();
                break;
            case 2:
                ((kvt) obj).k();
                break;
            case 3:
                SDKInviteDialog sDKInviteDialog = (SDKInviteDialog) obj;
                int i3 = SDKInviteDialog.X;
                dialogInterface.cancel();
                if (i == -2) {
                    new Handler(sDKInviteDialog.getActivity().getMainLooper()).postDelayed(new tn9(sDKInviteDialog, 17), 250L);
                    break;
                } else if (i == -1 && (aVar = sDKInviteDialog.Q) != null) {
                    EditText editText = sDKInviteDialog.R;
                    aVar.s0(editText != null ? editText.getText() : null, sDKInviteDialog.P, sDKInviteDialog.O);
                    break;
                }
                break;
            default:
                ((UserProfileDialogs) obj).a.a(UserProfileAction.s.c.e.b);
                break;
        }
    }
}
