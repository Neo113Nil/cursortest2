package xsna;

import android.content.Intent;
import one.video.calls.sdk.upload.FileUploadEvent;

/* compiled from: IntentCompat.java */
/* loaded from: classes11.dex */
public final class lax {
    public static Object a(Intent intent) {
        return intent.getParcelableExtra("eventKey", FileUploadEvent.class);
    }
}
