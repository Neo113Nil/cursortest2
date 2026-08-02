package xsna;

import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.superapp.browser.internal.ui.communitypicker.VkCommunityPickerActivity;
import com.vkontakte.android.R;
import kotlin.collections.EmptyList;
import xsna.dw20;

/* compiled from: VkCommunityPickerPresenter.kt */
/* loaded from: classes6.dex */
public final class hmu0 implements gmu0 {
    public final VkCommunityPickerActivity a;

    public hmu0(VkCommunityPickerActivity vkCommunityPickerActivity) {
        this.a = vkCommunityPickerActivity;
        EmptyList emptyList = EmptyList.b;
    }

    @Override // xsna.gmu0
    public final void Y(final AppsGroupsContainer appsGroupsContainer) {
        boolean z = appsGroupsContainer.c;
        final VkCommunityPickerActivity vkCommunityPickerActivity = this.a;
        if (!z) {
            Toast.makeText(vkCommunityPickerActivity, R.string.vk_apps_cant_add_app_to_community, 0).show();
            return;
        }
        WebGroup webGroup = appsGroupsContainer.b;
        AppsGroupsContainer.CheckboxState checkboxState = appsGroupsContainer.e;
        if (checkboxState == AppsGroupsContainer.CheckboxState.HIDDEN) {
            dw20.b bVar = new dw20.b(vkCommunityPickerActivity, null);
            cbq.a(bVar);
            bVar.M(R.drawable.vk_icon_users_outline_56, Integer.valueOf(R.attr.vk_ui_text_accent));
            bVar.w0(vkCommunityPickerActivity.getString(R.string.vk_add_mini_app_to_community, webGroup.c));
            bVar.j0(vkCommunityPickerActivity.getString(R.string.vk_apps_add), new i5(24, vkCommunityPickerActivity, appsGroupsContainer));
            bVar.V(vkCommunityPickerActivity.getString(R.string.vk_apps_cancel_request), new zpt0(4));
            bVar.I(true);
            bVar.I0(null);
            return;
        }
        View inflate = vkCommunityPickerActivity.getLayoutInflater().inflate(R.layout.vk_add_community_dialog, (ViewGroup) null);
        final CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.push_check_box);
        if (checkboxState == AppsGroupsContainer.CheckboxState.DISABLE) {
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            if (textView != null) {
                textView.setAlpha(0.4f);
            }
            checkBox.setChecked(false);
            checkBox.setEnabled(false);
        } else if (checkboxState == AppsGroupsContainer.CheckboxState.AVAILABLE) {
            checkBox.setChecked(true);
        }
        ((TextView) inflate.findViewById(R.id.community_text)).setText(vkCommunityPickerActivity.getString(R.string.vk_add_mini_app_to_community, webGroup.c));
        final com.google.android.material.bottomsheet.b bVar2 = new com.google.android.material.bottomsheet.b(vkCommunityPickerActivity, R.style.VkBottomSheetTransparentThemeWithMargin);
        bVar2.setContentView(inflate);
        ((TextView) inflate.findViewById(R.id.negative_button)).setOnClickListener(new f9(bVar2, 15));
        ((TextView) inflate.findViewById(R.id.positive_button)).setOnClickListener(new View.OnClickListener() { // from class: xsna.fmu0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = VkCommunityPickerActivity.g;
                WebGroup webGroup2 = appsGroupsContainer.b;
                boolean isChecked = checkBox.isChecked();
                Intent intent = new Intent();
                intent.putExtra("picked_group_id", webGroup2.b);
                intent.putExtra("should_send_push", isChecked);
                VkCommunityPickerActivity vkCommunityPickerActivity2 = VkCommunityPickerActivity.this;
                vkCommunityPickerActivity2.setResult(-1, intent);
                vkCommunityPickerActivity2.finish();
                bVar2.dismiss();
            }
        });
        bVar2.setOnShowListener(new ceu0(bVar2, 1));
        bVar2.show();
    }
}
