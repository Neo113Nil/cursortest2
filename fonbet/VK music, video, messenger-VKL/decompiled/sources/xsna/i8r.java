package xsna;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;

/* compiled from: FileDecoder.java */
/* loaded from: classes12.dex */
public final class i8r implements mag0<File, File> {
    @Override // xsna.mag0
    public final hag0<File> a(@NonNull File file, int i, int i2, @NonNull au80 au80Var) throws IOException {
        return new car(file);
    }

    @Override // xsna.mag0
    public final /* bridge */ /* synthetic */ boolean b(@NonNull File file, @NonNull au80 au80Var) throws IOException {
        return true;
    }
}
