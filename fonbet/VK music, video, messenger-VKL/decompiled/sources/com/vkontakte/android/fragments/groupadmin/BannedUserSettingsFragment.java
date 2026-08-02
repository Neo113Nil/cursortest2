package com.vkontakte.android.fragments.groupadmin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import com.vkontakte.android.TabletDialogActivity;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import me.grishka.appkit.fragments.ToolbarFragment;
import xsna.abg0;
import xsna.bpu;
import xsna.cuz;
import xsna.dhr0;
import xsna.e43;
import xsna.ft9;
import xsna.iah0;
import xsna.j6r0;
import xsna.jx2;
import xsna.oz50;
import xsna.pvo0;
import xsna.q6r0;
import xsna.qz50;
import xsna.u1u0;
import xsna.u90;
import xsna.v06;
import xsna.w06;
import xsna.x06;
import xsna.y06;
import xsna.yfb;
import xsna.zou;
import xsna.zqu;

/* loaded from: classes7.dex */
public class BannedUserSettingsFragment extends ToolbarFragment {
    public static final int[] j0 = {0, 31536000, 2678400, 604800, 86400, 3600};
    public View b0;
    public Spinner c0;
    public Spinner d0;
    public EditText e0;
    public CheckBox f0;
    public a g0;
    public b h0;
    public UserProfile i0;

    public class a extends ArrayAdapter<CharSequence> {
        public final /* synthetic */ ColorStateList b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FragmentActivity fragmentActivity, List list, ColorStateList colorStateList) {
            super(fragmentActivity, R.layout.card_spinner_item, 0, list);
            this.b = colorStateList;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, @NonNull ViewGroup viewGroup) {
            View dropDownView = super.getDropDownView(i, view, viewGroup);
            if (view == null) {
                ((TextView) dropDownView).setTextColor(this.b);
            }
            return dropDownView;
        }
    }

    public class b extends ArrayAdapter<d> {
        public final /* synthetic */ Context b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FragmentActivity fragmentActivity, FragmentActivity fragmentActivity2) {
            super(fragmentActivity, R.layout.card_spinner_item);
            this.b = fragmentActivity2;
        }

        @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, @NonNull ViewGroup viewGroup) {
            if (view == null) {
                view = View.inflate(this.b, R.layout.spinner_item_subtitle, null);
            }
            d item = getItem(i);
            ((TextView) view.findViewById(android.R.id.text1)).setText(item.a);
            TextView textView = (TextView) view.findViewById(android.R.id.text2);
            if (item.b == null) {
                textView.setVisibility(8);
                return view;
            }
            textView.setVisibility(0);
            textView.setText(item.b);
            return view;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int[] iArr = BannedUserSettingsFragment.j0;
            BannedUserSettingsFragment bannedUserSettingsFragment = BannedUserSettingsFragment.this;
            UserId userId = (UserId) bannedUserSettingsFragment.getArguments().getParcelable("id");
            ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_BAN_USER;
            comFeatures.getClass();
            if (com.vk.toggle.b.A.a(comFeatures)) {
                jx2 jx2Var = new jx2(yfb.x(new zqu().t(userId, bannedUserSettingsFragment.i0.c)), new x06(bannedUserSettingsFragment, bannedUserSettingsFragment.getActivity()));
                jx2Var.g = bannedUserSettingsFragment.getActivity();
                jx2Var.a();
            } else {
                jx2 jx2Var2 = new jx2(new bpu(userId, bannedUserSettingsFragment.i0.c, false, 0, 0, null, false), new y06(bannedUserSettingsFragment, bannedUserSettingsFragment.getActivity()));
                jx2Var2.g = bannedUserSettingsFragment.getActivity();
                jx2Var2.a();
            }
        }
    }

    public static class d {
        public String a;
        public String b;
        public int c;

        public final String toString() {
            return this.a;
        }
    }

    public static void oo(BannedUserSettingsFragment bannedUserSettingsFragment, int i, int i2, String str, boolean z) {
        boolean containsKey = bannedUserSettingsFragment.i0.s.containsKey("ban_admin");
        if (!containsKey) {
            UserProfile userProfile = new UserProfile();
            userProfile.e = q6r0.f().r();
            userProfile.i = q6r0.f().w();
            userProfile.c = q6r0.f().y();
            bannedUserSettingsFragment.i0.s.putParcelable("ban_admin", userProfile);
            bannedUserSettingsFragment.i0.s.putInt("ban_date", pvo0.a());
        }
        if (i > 0) {
            bannedUserSettingsFragment.i0.s.putInt("ban_end_date", i);
        } else {
            bannedUserSettingsFragment.i0.s.remove("ban_end_date");
        }
        bannedUserSettingsFragment.i0.s.putString("ban_comment", str);
        bannedUserSettingsFragment.i0.s.putInt("ban_reason", i2);
        bannedUserSettingsFragment.i0.s.putBoolean("ban_comment_visible", z);
        Intent intent = new Intent(containsKey ? zou.c : zou.a);
        intent.putExtra(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, bannedUserSettingsFragment.i0);
        intent.putExtra("user_id", bannedUserSettingsFragment.i0.c);
        intent.putExtra("new_banned", true);
        cuz.a(e43.a).c(intent);
        bannedUserSettingsFragment.setResult(-1, intent);
        if (bannedUserSettingsFragment.getArguments().getBoolean("_dialog")) {
            bannedUserSettingsFragment.dismiss();
        } else {
            bannedUserSettingsFragment.finish();
        }
    }

    public static void po(BannedUserSettingsFragment bannedUserSettingsFragment) {
        Intent intent = new Intent(zou.b);
        intent.putExtra("user_id", bannedUserSettingsFragment.i0.c);
        intent.putExtra("new_banned", false);
        bannedUserSettingsFragment.setResult(-1, intent);
        cuz.a(e43.a).c(intent);
        bannedUserSettingsFragment.finish();
    }

    public static void qo(Activity activity, Bundle bundle) {
        oz50 oz50Var = new oz50(BannedUserSettingsFragment.class, null, bundle);
        TabletDialogActivity.a aVar = new TabletDialogActivity.a(0);
        aVar.b();
        qz50.a(oz50Var, aVar);
        oz50Var.k(activity);
    }

    public static void ro(u90 u90Var, UserId userId, UserProfile userProfile, Integer num) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("id", userId);
        bundle.putParcelable(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE, userProfile);
        oz50 oz50Var = new oz50(BannedUserSettingsFragment.class, null, bundle);
        TabletDialogActivity.a aVar = new TabletDialogActivity.a(0);
        aVar.b();
        qz50.a(oz50Var, aVar);
        oz50Var.i(u90Var, num.intValue());
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment
    public final View no(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        FragmentActivity activity = getActivity();
        View inflate = layoutInflater.inflate(R.layout.group_banned_user, (ViewGroup) null);
        this.b0 = inflate;
        this.c0 = (Spinner) inflate.findViewById(R.id.group_ban_duration);
        this.d0 = (Spinner) this.b0.findViewById(R.id.group_ban_reason);
        this.e0 = (EditText) this.b0.findViewById(R.id.group_ban_comment);
        this.f0 = (CheckBox) this.b0.findViewById(R.id.group_ban_show_comment);
        abg0 abg0Var = dhr0.t;
        boolean z = false;
        a aVar = new a(activity, Arrays.asList(getResources().getTextArray(R.array.group_ban_reasons)), new ColorStateList(new int[][]{new int[]{android.R.attr.state_checked}, new int[0]}, new int[]{abg0Var.c(R.attr.vk_ui_text_accent), abg0Var.c(R.attr.vk_ui_text_primary)}));
        this.g0 = aVar;
        aVar.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.d0.setAdapter((SpinnerAdapter) this.g0);
        UserProfile userProfile = (UserProfile) this.i0.s.getParcelable("ban_admin");
        this.h0 = new b(activity, activity);
        String[] stringArray = getResources().getStringArray(R.array.group_ban_duration_options);
        if (this.i0.s.containsKey("ban_end_date") && (i = this.i0.s.getInt("ban_end_date")) > 0) {
            d dVar = new d();
            dVar.a = getString(R.string.group_ban_subtitle_auto, pvo0.i(false, i, false, false));
            dVar.c = i;
            this.h0.add(dVar);
        }
        for (int i2 = 0; i2 < stringArray.length; i2++) {
            d dVar2 = new d();
            dVar2.a = stringArray[i2];
            if (i2 == 0) {
                dVar2.b = getString(R.string.group_ban_subtitle_manual);
            } else {
                int a2 = pvo0.a() + j0[i2];
                dVar2.c = a2;
                dVar2.b = getString(R.string.group_ban_subtitle_auto, pvo0.i(false, a2, false, false));
            }
            this.h0.add(dVar2);
        }
        ColorDrawable colorDrawable = new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background_modal));
        this.c0.setPopupBackgroundDrawable(colorDrawable);
        this.d0.setPopupBackgroundDrawable(colorDrawable);
        this.c0.setAdapter((SpinnerAdapter) this.h0);
        ((TextView) this.b0.findViewById(R.id.name)).setText(this.i0.e);
        TextView textView = (TextView) this.b0.findViewById(R.id.description);
        if (userProfile != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getString(this.i0.K().booleanValue() ? R.string.group_ban_banned_f : R.string.group_ban_banned_m));
            sb.append("\n");
            sb.append(getString(userProfile.K().booleanValue() ? R.string.added_by_f : R.string.added_by_m, userProfile.e));
            sb.append(" ");
            sb.append(pvo0.i(false, this.i0.s.getInt("ban_date"), false, false));
            textView.setText(sb.toString());
            this.d0.setSelection(Math.max(0, Math.min(this.g0.getCount() - 1, this.i0.s.getInt("ban_reason"))));
            this.e0.setText(this.i0.s.getString("ban_comment"));
            this.f0.setChecked(this.i0.s.getBoolean("ban_comment_visible"));
        } else {
            UserProfile userProfile2 = this.i0;
            boolean z2 = userProfile2.c.b >= 0 && userProfile2.s.getBoolean("show_group_status", true);
            if (z2 && (this.i0.s.getBoolean("is_group_member") || getArguments().getBoolean("is_group_member"))) {
                z = true;
            }
            if (z2) {
                textView.setText(z ? R.string.group_ban_member : R.string.group_ban_not_member);
            } else {
                textView.setVisibility(8);
            }
            this.b0.findViewById(R.id.wrapper).setVisibility(8);
            this.b0.findViewById(R.id.button_remove).setVisibility(8);
        }
        ((VKImageView) this.b0.findViewById(R.id.photo)).load(this.i0.h);
        this.b0.findViewById(R.id.button_remove).setOnClickListener(new c());
        return this.b0;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        UserProfile userProfile = (UserProfile) getArguments().getParcelable(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        this.i0 = userProfile;
        userProfile.s.setClassLoader(UserProfile.class.getClassLoader());
        setHasOptionsMenu(true);
        setTitle(this.i0.c.b >= 0 ? R.string.group_ban_user_title : R.string.group_ban_community_title);
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ko(configuration);
        so();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        MenuItem add = menu.add(R.string.save);
        add.setIcon(R.drawable.vk_icon_done_24);
        add.setShowAsAction(2);
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.a0.setScrollBarStyle(33554432);
        ko(getResources().getConfiguration());
        so();
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int i = ((d) this.c0.getSelectedItem()).c;
        int selectedItemPosition = this.d0.getSelectedItemPosition();
        String obj = this.e0.getText().toString();
        boolean isChecked = this.f0.isChecked();
        UserId userId = (UserId) getArguments().getParcelable("id");
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_BAN_USER;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            jx2 jx2Var = new jx2(yfb.x(new zqu().y(userId, this.i0.c, Integer.valueOf(i), Integer.valueOf(selectedItemPosition), obj, Boolean.valueOf(isChecked))), new v06(this, getActivity(), i, selectedItemPosition, obj, isChecked));
            jx2Var.g = getActivity();
            jx2Var.a();
            return true;
        }
        jx2 jx2Var2 = new jx2(new bpu(userId, this.i0.c, true, i, selectedItemPosition, obj, isChecked), new w06(this, getActivity(), i, selectedItemPosition, obj, isChecked));
        jx2Var2.g = getActivity();
        jx2Var2.a();
        return true;
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getArguments().getBoolean("_split")) {
            return;
        }
        u1u0.j(this.Q, R.drawable.vk_icon_arrow_left_outline_28);
    }

    public final void so() {
        int i;
        this.b0.setBackground(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_background)));
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.b0).getChildAt(0);
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            getResources();
            int c2 = dhr0.t.c(R.attr.vk_ui_background_content);
            WeakHashMap weakHashMap = j6r0.a;
            ft9 ft9Var = new ft9(iah0.a(2.0f), c2, !this.U);
            View childAt = viewGroup.getChildAt(i2);
            childAt.setBackground(ft9Var);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.topMargin = iah0.a(3.0f);
            marginLayoutParams.bottomMargin = iah0.a(2.0f);
        }
        if (this.V >= 924) {
            WeakHashMap weakHashMap2 = j6r0.a;
            i = iah0.a(32.0f);
        } else {
            i = 0;
        }
        viewGroup.setPadding(i, 0, i, 0);
    }
}
