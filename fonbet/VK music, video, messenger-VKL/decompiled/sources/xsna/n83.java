package xsna;

import android.content.DialogInterface;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.appredirects.entity.App;
import com.vk.appredirects.ui.AppRedirectsSettingsFragment;
import com.vk.common.view.settings.RadioButtonGroupSettingsView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class n83 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n83(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i2) {
            case 0:
                int i3 = AppRedirectsSettingsFragment.L0;
                ((defpackage.c) obj2).invoke(App.values()[((RadioButtonGroupSettingsView) obj).getCheckedId()]);
                break;
            default:
                Group group = (Group) obj2;
                CommunitiesManageNotificationsFragment communitiesManageNotificationsFragment = (CommunitiesManageNotificationsFragment) obj;
                int i4 = CommunitiesManageNotificationsFragment.Z;
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                UserId userId = group.c;
                tfx tfxVar = new tfx("notifications.deleteGroupSource", new at(24), new bt(22));
                tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
                hg1.m(rsg0.y0(new fj70(yfb.y(tfxVar, new irt(6)), yfb.y(xqu.e(new zqu(), null, Collections.singletonList(GroupsFilterDto.ENABLED_NOTIFICATIONS), null, 1, 91), new ow60(1))), null, null, 3), communitiesManageNotificationsFragment.getActivity(), 0L, false, 62).subscribe(new iu1(new k82(4, communitiesManageNotificationsFragment, group), 11), new qs2(new x4(21), 10));
                break;
        }
    }
}
