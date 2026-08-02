package xsna;

import androidx.annotation.NonNull;
import com.google.android.gms.cast.SessionState;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class pxi0 {
    public static final int TRANSFER_FAILED_REASON_STORE_SESSION_STATE = 100;
    public static final int TRANSFER_FAILED_REASON_TRANSFER_TIMEOUT = 101;
    public static final int TRANSFER_TYPE_FROM_REMOTE_TO_LOCAL = 1;
    public static final int TRANSFER_TYPE_UNKNOWN = 0;

    public void onTransferring(int i) {
    }

    public void onTransferFailed(int i, int i2) {
    }

    public void onTransferred(int i, @NonNull SessionState sessionState) {
    }
}
