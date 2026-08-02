package androidx.compose.ui.text.input;

import android.os.Build;
import defpackage.tls;

/* loaded from: classes10.dex */
public abstract class c {
    public static final NullableInputConnectionWrapper a(androidx.compose.foundation.text.input.internal.RecordingInputConnection recordingInputConnection, tls tlsVar) {
        return Build.VERSION.SDK_INT >= 34 ? new NullableInputConnectionWrapperApi34(recordingInputConnection, tlsVar) : new NullableInputConnectionWrapperApi25(recordingInputConnection, tlsVar);
    }
}
