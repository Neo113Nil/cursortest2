package xsna;

import java.io.File;
import java.io.FilenameFilter;

/* compiled from: ReLinkerInstance.java */
/* loaded from: classes12.dex */
public final class aze0 implements FilenameFilter {
    public final /* synthetic */ String a;

    public aze0(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
