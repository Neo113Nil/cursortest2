package xsna;

import androidx.core.app.NotificationCompat;
import java.io.File;
import java.io.FilenameFilter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class q5k implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(NotificationCompat.CATEGORY_EVENT);
    }
}
