package defpackage;

import java.io.File;
import java.io.FileFilter;

/* loaded from: classes11.dex */
public final /* synthetic */ class fsa1 implements FileFilter {
    public static final /* synthetic */ fsa1 a = new fsa1();

    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.getName().endsWith(".apk");
    }
}
