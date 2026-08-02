package xsna;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import com.vk.auth.avatarpicker.AuthAvatarPickerActivity;
import com.vk.contacts.ContactsSyncActivity;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.provider.SakFileProvider;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class s15 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ AppCompatActivity c;

    public /* synthetic */ s15(AppCompatActivity appCompatActivity, int i) {
        this.b = i;
        this.c = appCompatActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        AppCompatActivity appCompatActivity = this.c;
        switch (i2) {
            case 0:
                AuthAvatarPickerActivity authAvatarPickerActivity = (AuthAvatarPickerActivity) appCompatActivity;
                int i3 = AuthAvatarPickerActivity.a.$EnumSwitchMapping$0[authAvatarPickerActivity.f.get(i).ordinal()];
                if (i3 == 1) {
                    Intent intent = new Intent("android.intent.action.PICK");
                    intent.setType("image/*");
                    authAvatarPickerActivity.startActivityForResult(intent, 2);
                    return;
                }
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    authAvatarPickerActivity.R1(null);
                    return;
                }
                File O1 = authAvatarPickerActivity.O1();
                authAvatarPickerActivity.h = O1;
                SakFileProvider.a aVar = SakFileProvider.b;
                Context applicationContext = authAvatarPickerActivity.getApplicationContext();
                aVar.getClass();
                authAvatarPickerActivity.g = FileProvider.getUriForFile(authAvatarPickerActivity, SakFileProvider.a.a(applicationContext), O1);
                Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                intent2.putExtra("output", authAvatarPickerActivity.g);
                PermissionHelper permissionHelper = PermissionHelper.a;
                permissionHelper.getClass();
                PermissionHelper.h(permissionHelper, authAvatarPickerActivity, PermissionHelper.l, R.string.vk_auth_avatar_permissions, R.string.vk_auth_avatar_permissions_settings, new a94(1, authAvatarPickerActivity, intent2), new mb(authAvatarPickerActivity, 7), 64);
                return;
            default:
                int i4 = ContactsSyncActivity.f;
                ((ContactsSyncActivity) appCompatActivity).finish();
                return;
        }
    }
}
