package xsna;

import android.media.MediaCodecInfo;
import android.os.strictmode.CredentialProtectedWhileLockedViolation;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import ru.ok.proto.PublisherConfiguration;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class g32 {
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint d() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(CoverVideoUploadTask.y, PublisherConfiguration.DEFAULT_MAX_RES, 60);
    }

    public static /* bridge */ /* synthetic */ Class e() {
        return CredentialProtectedWhileLockedViolation.class;
    }
}
