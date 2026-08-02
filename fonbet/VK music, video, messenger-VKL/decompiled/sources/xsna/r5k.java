package xsna;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class r5k implements FilenameFilter {
    public final /* synthetic */ int a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.a) {
            case 0:
                return str.startsWith(NotificationCompat.CATEGORY_EVENT) && !str.endsWith(BundleUtil.UNDERLINE_TAG);
            default:
                return str.endsWith(".mp3");
        }
    }
}
