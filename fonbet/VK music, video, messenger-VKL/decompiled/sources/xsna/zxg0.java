package xsna;

import android.content.DialogInterface;
import android.content.Intent;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.sdk.SDKInviteActivity;

/* compiled from: SDKInviteActivity.java */
/* loaded from: classes7.dex */
public final class zxg0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ UserId c;
    public final /* synthetic */ SDKInviteActivity d;

    public zxg0(SDKInviteActivity sDKInviteActivity, int i, UserId userId) {
        this.d = sDKInviteActivity;
        this.b = i;
        this.c = userId;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SDKInviteActivity sDKInviteActivity = this.d;
        dialogInterface.cancel();
        if (i == -2) {
            Intent intent = new Intent();
            intent.putExtra("com.vkontakte.android.sdk.extra_mid", this.b);
            UserId userId = this.c;
            fkq0.a.invoke();
            intent.putExtra("com.vkontakte.android.sdk.extra_user_id", (int) userId.b);
            sDKInviteActivity.setResult(-1, intent);
            sDKInviteActivity.finish();
        }
    }
}
