package xsna;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.vk.superapp.api.dto.app.AppsGroupsContainer;
import com.vk.superapp.api.dto.group.WebGroup;
import com.vk.webapp.community_picker.AppsCommunityPickerFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.dw20;

/* compiled from: AppsCommunityPickerContract.kt */
/* loaded from: classes7.dex */
public final class me3 implements le3 {
    public final AppsCommunityPickerFragment b;
    public List<AppsGroupsContainer> c = EmptyList.b;

    public me3(AppsCommunityPickerFragment appsCommunityPickerFragment) {
        this.b = appsCommunityPickerFragment;
    }

    @Override // xsna.le3
    public final void Y(final AppsGroupsContainer appsGroupsContainer) {
        if (!appsGroupsContainer.c) {
            cvk.u(R.string.vk_apps_cant_add_app_to_community, false);
            return;
        }
        WebGroup webGroup = appsGroupsContainer.b;
        AppsGroupsContainer.CheckboxState checkboxState = appsGroupsContainer.e;
        AppsGroupsContainer.CheckboxState checkboxState2 = AppsGroupsContainer.CheckboxState.HIDDEN;
        final AppsCommunityPickerFragment appsCommunityPickerFragment = this.b;
        if (checkboxState == checkboxState2) {
            dw20.b bVar = new dw20.b(appsCommunityPickerFragment.requireContext(), null);
            cbq.a(bVar);
            bVar.M(R.drawable.vk_icon_users_outline_56, Integer.valueOf(R.attr.vk_ui_icon_accent));
            bVar.w0(appsCommunityPickerFragment.getString(R.string.vk_add_mini_app_to_community, webGroup.c));
            bVar.j0(appsCommunityPickerFragment.getString(R.string.vk_apps_add), new com.vk.voip.a(3, appsCommunityPickerFragment, appsGroupsContainer));
            bVar.V(appsCommunityPickerFragment.getString(R.string.vk_apps_cancel_request), new qe3(0));
            bVar.I(true);
            bVar.I0(null);
            return;
        }
        View inflate = appsCommunityPickerFragment.getLayoutInflater().inflate(R.layout.apps_community_picker, (ViewGroup) null);
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
        ((TextView) inflate.findViewById(R.id.community_text)).setText(appsCommunityPickerFragment.getString(R.string.vk_add_mini_app_to_community, webGroup.c));
        final com.google.android.material.bottomsheet.b bVar2 = new com.google.android.material.bottomsheet.b(appsCommunityPickerFragment.requireContext(), R.style.VkBottomSheetTransparentThemeWithMargin);
        bVar2.setContentView(inflate);
        TextView textView2 = (TextView) inflate.findViewById(R.id.negative_button);
        textView2.setOnClickListener(new ne3(bVar2, 0));
        textView2.setContentDescription(appsCommunityPickerFragment.getString(R.string.vk_button) + ' ' + ((Object) textView2.getText()));
        TextView textView3 = (TextView) inflate.findViewById(R.id.positive_button);
        textView3.setOnClickListener(new View.OnClickListener() { // from class: xsna.oe3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = AppsCommunityPickerFragment.U;
                WebGroup webGroup2 = appsGroupsContainer.b;
                boolean isChecked = checkBox.isChecked();
                Intent intent = new Intent();
                intent.putExtra("picked_group_id", webGroup2.b);
                intent.putExtra("should_send_push", isChecked);
                AppsCommunityPickerFragment appsCommunityPickerFragment2 = AppsCommunityPickerFragment.this;
                appsCommunityPickerFragment2.setResult(-1, intent);
                appsCommunityPickerFragment2.finish();
                bVar2.dismiss();
            }
        });
        textView3.setContentDescription(appsCommunityPickerFragment.getString(R.string.vk_button) + ' ' + ((Object) textView3.getText()));
        bVar2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.pe3
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                int i = AppsCommunityPickerFragment.U;
                com.google.android.material.bottomsheet.b bVar3 = com.google.android.material.bottomsheet.b.this;
                View findViewById = bVar3.findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    bVar3.o().W(findViewById.getHeight(), false);
                    bVar3.o().X(3);
                    int i2 = iah0.f().widthPixels;
                    int i3 = AppsCommunityPickerFragment.U;
                    if (i2 > i3) {
                        findViewById.getLayoutParams().width = i3;
                    }
                    findViewById.getParent().requestLayout();
                }
            }
        });
        bVar2.show();
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.le3
    public final void r4(List<AppsGroupsContainer> list) {
        this.c = list;
        AppsCommunityPickerFragment.a aVar = this.b.T;
        aVar.c = list;
        aVar.notifyDataSetChanged();
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
