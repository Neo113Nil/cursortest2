package xsna;

import android.net.Uri;
import kotlin.Result;
import one.video.player.model.FrameSize;
import xsna.n640;

/* compiled from: VideoSourcesRotator.kt */
/* loaded from: classes2.dex */
public final class vht0 {
    public static final n640.a a(Uri uri, FrameSize frameSize) {
        if (uri != null) {
            return new n640.a(uri, frameSize);
        }
        return null;
    }

    public static final Uri b(String str) {
        Object failure;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            failure = Uri.parse(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (Uri) (failure instanceof Result.Failure ? null : failure);
    }
}
