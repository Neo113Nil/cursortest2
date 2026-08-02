package defpackage;

import java.io.File;
import java.io.FilenameFilter;

/* loaded from: classes10.dex */
public final class eai0 implements FilenameFilter {
    public final /* synthetic */ String a;

    public eai0(String str) {
        this.a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.a);
    }
}
