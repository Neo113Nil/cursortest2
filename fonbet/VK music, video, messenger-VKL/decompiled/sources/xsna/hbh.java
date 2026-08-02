package xsna;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class hbh implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hbh(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.b) {
            case 0:
                CommunityNotificationSettingsFragment communityNotificationSettingsFragment = (CommunityNotificationSettingsFragment) this.c;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                long j = communityNotificationSettingsFragment.T;
                dj70 dj70Var = new dj70("notifications.deleteGroupSource");
                dj70Var.D(j, "group_id");
                hg1.m(rsg0.y0(dj70Var, null, null, 3), communityNotificationSettingsFragment.getActivity(), 0L, false, 62).subscribe(new w00(new cqf(communityNotificationSettingsFragment, 7), 15), new y00(new ak(14), 16));
                break;
            case 1:
                Activity activity = (Activity) this.c;
                try {
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("appmarket://search?q=maps"));
                    intent.addFlags(268435456);
                    activity.startActivity(intent);
                    break;
                } catch (Exception e) {
                    com.vk.metrics.eventtracking.b.a.q(e);
                    return;
                }
            default:
                ((h24) this.c).invoke();
                break;
        }
    }
}
