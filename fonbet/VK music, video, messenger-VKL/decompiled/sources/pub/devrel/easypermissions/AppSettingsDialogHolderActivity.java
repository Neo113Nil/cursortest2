package pub.devrel.easypermissions;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.d;
import com.vkontakte.android.R;
import xsna.lhg;

/* loaded from: classes9.dex */
public class AppSettingsDialogHolderActivity extends AppCompatActivity implements DialogInterface.OnClickListener {
    public d f;
    public int g;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2, intent);
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            Intent data = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", getPackageName(), null));
            data.addFlags(this.g);
            startActivityForResult(data, 7534);
        } else {
            if (i != -2) {
                throw new IllegalStateException(lhg.a(i, "Unknown button type: "));
            }
            setResult(0);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AppSettingsDialogHolderActivity appSettingsDialogHolderActivity;
        super.onCreate(bundle);
        Intent intent = getIntent();
        AppSettingsDialog appSettingsDialog = (AppSettingsDialog) intent.getParcelableExtra("extra_app_settings");
        if (appSettingsDialog == null) {
            Log.e("EasyPermissions", "Intent contains null value for EXTRA_APP_SETTINGS: intent=" + intent + ", extras=" + intent.getExtras());
            appSettingsDialogHolderActivity = this;
            appSettingsDialog = new AppSettingsDialog(appSettingsDialogHolderActivity, TextUtils.isEmpty(null) ? getString(R.string.rationale_ask_again) : null, TextUtils.isEmpty(null) ? getString(R.string.title_settings_dialog) : null, TextUtils.isEmpty(null) ? getString(android.R.string.ok) : null, TextUtils.isEmpty(null) ? getString(android.R.string.cancel) : null, 16061);
        } else {
            appSettingsDialogHolderActivity = this;
        }
        appSettingsDialogHolderActivity.g = appSettingsDialog.h;
        int i = appSettingsDialog.b;
        appSettingsDialogHolderActivity.f = (i != -1 ? new d.a(this, i) : new d.a(this)).a(false).setTitle(appSettingsDialog.d).d(appSettingsDialog.c).j(appSettingsDialog.e, this).f(appSettingsDialog.f, this).m();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        d dVar = this.f;
        if (dVar == null || !dVar.isShowing()) {
            return;
        }
        this.f.dismiss();
    }
}
