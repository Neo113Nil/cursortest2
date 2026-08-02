package defpackage;

import java.io.File;
import java.io.FileFilter;
import kotlin.io.b;

/* loaded from: classes11.dex */
public final /* synthetic */ class o5 implements FileFilter {
    @Override // java.io.FileFilter
    public final boolean accept(File file) {
        return file.isFile() && b.m(file).equals("txt");
    }
}
