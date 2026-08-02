package xsna;

import java.io.File;
import kotlin.jvm.internal.Lambda;

/* compiled from: FileStorage.kt */
/* loaded from: classes12.dex */
public final class mar extends Lambda implements izs<File, uax> {
    public static final mar i = new mar(1);

    @Override // xsna.izs
    public final uax invoke(File file) {
        file.getCanonicalFile().getAbsolutePath();
        return new rvj0();
    }
}
