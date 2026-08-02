package ru.mail.libverify.utils.permissions;

import android.app.Activity;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* loaded from: classes9.dex */
public class ShadowActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String[] stringArrayExtra = getIntent().getStringArrayExtra(SignalingProtocol.KEY_PERMISSIONS);
            int intExtra = getIntent().getIntExtra(CommonUrlParts.REQUEST_ID, 0);
            if (stringArrayExtra != null) {
                requestPermissions(stringArrayExtra, intExtra);
            }
        }
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        a.a(i, strArr, iArr);
        finish();
    }
}
