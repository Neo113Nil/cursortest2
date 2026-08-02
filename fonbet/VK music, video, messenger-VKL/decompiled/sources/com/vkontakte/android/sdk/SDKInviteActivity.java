package com.vkontakte.android.sdk;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import com.vk.auth.main.AuthActivity;
import com.vk.core.fragments.FragmentEntry;
import com.vk.dto.common.a;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.pushes.PushAwareActivity;
import com.vkontakte.android.sdk.SDKInviteDialog;
import ru.ok.android.sdk.SharedKt;
import xsna.fkq0;
import xsna.fvj;
import xsna.jx2;
import xsna.q6r0;
import xsna.qf3;

/* loaded from: classes7.dex */
public class SDKInviteActivity extends PushAwareActivity implements SDKInviteDialog.a {
    public static final /* synthetic */ int C = 0;
    public CharSequence A;
    public int B;
    public UserProfile v;
    public boolean w = false;
    public long[] x;
    public CharSequence y;
    public CharSequence z;

    public final void T1() {
        int i = SDKInviteDialog.X;
        CharSequence charSequence = this.y;
        CharSequence charSequence2 = this.A;
        CharSequence charSequence3 = this.z;
        SDKInviteDialog sDKInviteDialog = new SDKInviteDialog();
        Bundle bundle = new Bundle();
        bundle.putCharSequence("com.vkontakte.android.sdk.extra_message", charSequence);
        bundle.putCharSequence("com.vkontakte.android.sdk.extra_link", charSequence2);
        bundle.putCharSequence("com.vkontakte.android.sdk.extra_photo", charSequence3);
        sDKInviteDialog.setArguments(bundle);
        sDKInviteDialog.Fn(n(), null);
    }

    public final void U1(UserProfile userProfile) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("dialog_id", a.a(userProfile.c));
        n().q().c(R.id.content, new FragmentEntry(ChatFragment.class, bundle).Ab());
        if (this.w) {
            return;
        }
        T1();
    }

    public final void V1(long[] jArr) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("select", true);
        bundle.putString("title", getString(com.vkontakte.android.R.string.sdk_invite_dialog_title));
        bundle.putBoolean("global_search", false);
        UserId y = q6r0.f().y();
        fkq0.a.invoke();
        bundle.putInt("uid", (int) y.b);
        bundle.putLongArray("com.vkontakte.android.sdk.extra_ids", jArr);
        Intent intent = new Intent(this, (Class<?>) SDKFriendPickerActivity.class);
        intent.putExtra("args", bundle);
        startActivityForResult(intent, 42);
    }

    @Override // com.vkontakte.android.sdk.SDKInviteDialog.a
    public final void c1() {
        V1(this.x);
    }

    @Override // com.vkontakte.android.VKActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 42) {
            if (i2 != -1) {
                finish();
                return;
            }
            UserProfile userProfile = (UserProfile) intent.getParcelableExtra("user");
            this.v = userProfile;
            U1(userProfile);
            return;
        }
        if (i == 100) {
            if (i2 == -1) {
                V1(this.x);
            } else {
                setResult(0);
                finish();
            }
        }
    }

    @Override // com.vkontakte.android.VKActivity, com.vk.core.ui.themes.ThemableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x = getIntent().getLongArrayExtra("com.vkontakte.android.sdk.extra_ids");
        this.y = getIntent().getCharSequenceExtra("com.vkontakte.android.sdk.extra_message");
        this.z = getIntent().getCharSequenceExtra("com.vkontakte.android.sdk.extra_photo");
        this.A = getIntent().getCharSequenceExtra("com.vkontakte.android.sdk.extra_link");
        this.B = getIntent().getIntExtra("com.vkontakte.android.sdk.extra_app_id", 0);
        if (this.x == null) {
            setResult(0);
            finish();
        } else {
            if (!q6r0.f().A()) {
                startActivityForResult(new Intent(this, (Class<?>) AuthActivity.class), 100);
                return;
            }
            UserProfile userProfile = this.v;
            if (userProfile == null) {
                V1(this.x);
            } else {
                U1(userProfile);
            }
        }
    }

    @Override // com.vkontakte.android.sdk.SDKInviteDialog.a
    public final void s0(Editable editable, CharSequence charSequence, CharSequence charSequence2) {
        UserId userId = this.v.c;
        String str = editable.toString() + '\n' + charSequence2.toString();
        String charSequence3 = charSequence.toString();
        int i = this.B;
        qf3 qf3Var = new qf3("apps.sendRequest", 0);
        qf3Var.F(userId, "user_id");
        qf3Var.K("message", str);
        qf3Var.K("type", "invite");
        qf3Var.K(SharedKt.PARAM_ATTACHMENT, "photo" + charSequence3);
        qf3Var.C(i, "id");
        jx2 jx2Var = new jx2(qf3Var, new fvj(this, userId));
        jx2Var.g = this;
        jx2Var.a();
    }
}
