package xsna;

import android.content.DialogInterface;
import com.vkontakte.android.sdk.SDKInviteActivity;

/* compiled from: SDKInviteActivity.java */
/* loaded from: classes7.dex */
public final class yxg0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ SDKInviteActivity b;

    public yxg0(SDKInviteActivity sDKInviteActivity) {
        this.b = sDKInviteActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            int i2 = SDKInviteActivity.C;
            this.b.T1();
        }
        dialogInterface.cancel();
    }
}
