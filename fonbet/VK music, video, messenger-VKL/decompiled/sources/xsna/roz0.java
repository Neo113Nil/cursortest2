package xsna;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.GoogleApiActivity;
import ru.ok.android.webrtc.PeerVideoSettingsBitrateTable;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class roz0 implements DialogInterface.OnClickListener {
    public static hoz0 b(@Nullable Intent intent, GoogleApiActivity googleApiActivity) {
        return new hoz0(intent, googleApiActivity);
    }

    public static ooz0 c(@Nullable Intent intent, @NonNull t4z t4zVar) {
        return new ooz0(intent, t4zVar);
    }

    public abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains(PeerVideoSettingsBitrateTable.CODEC_GENERIC) ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
