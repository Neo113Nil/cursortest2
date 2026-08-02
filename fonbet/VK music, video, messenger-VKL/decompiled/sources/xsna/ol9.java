package xsna;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import com.vk.upload.impl.tasks.cover.CoverVideoUploadTask;
import java.util.List;
import ru.ok.proto.PublisherConfiguration;
import xsna.sj9;

/* compiled from: CameraSettingsApi2.kt */
/* loaded from: classes16.dex */
public final class ol9 {
    public final CameraCharacteristics a;
    public Size b;
    public final Size c;
    public final int[] d;
    public volatile List<sj9.a> e;
    public int f;
    public String g;
    public int h;

    public ol9(CameraCharacteristics cameraCharacteristics) {
        Size size = new Size(CoverVideoUploadTask.y, PublisherConfiguration.DEFAULT_MAX_RES);
        this.a = cameraCharacteristics;
        this.b = null;
        this.c = size;
        this.d = new int[]{0, 0};
        this.g = "off";
    }
}
