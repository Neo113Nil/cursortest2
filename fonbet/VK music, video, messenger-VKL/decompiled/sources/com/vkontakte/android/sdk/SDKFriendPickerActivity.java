package com.vkontakte.android.sdk;

import android.R;
import android.os.Bundle;
import com.vk.pushes.PushAwareActivity;
import com.vkontakte.android.fragments.friends.FriendsFragment;
import xsna.ybs;

/* loaded from: classes7.dex */
public class SDKFriendPickerActivity extends PushAwareActivity {

    public static class PickerFragment extends FriendsFragment {
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (n().f(R.id.content) == null) {
            ybs q = n().q();
            Bundle bundleExtra = getIntent().getBundleExtra("args");
            PickerFragment pickerFragment = new PickerFragment();
            pickerFragment.setArguments(bundleExtra);
            q.a(R.id.content, pickerFragment);
        }
    }
}
