package xsna;

import java.io.File;
import java.io.FileFilter;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class pn6 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isFile() && drm0.D(file.getName(), "single_file_pref", false);
    }
}
