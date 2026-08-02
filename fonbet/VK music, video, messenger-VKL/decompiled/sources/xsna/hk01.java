package xsna;

import java.io.File;
import java.io.FileFilter;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final /* synthetic */ class hk01 implements FileFilter {
    public static final /* synthetic */ hk01 a = new hk01();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        int i = vjq.p;
        return file.getName().endsWith(".apk");
    }
}
