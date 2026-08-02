package xsna;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import xsna.e9r;

/* compiled from: FileLoader.java */
/* loaded from: classes12.dex */
public final class f9r implements e9r.d<ParcelFileDescriptor> {
    @Override // xsna.e9r.d
    public final void a(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // xsna.e9r.d
    public final Class<ParcelFileDescriptor> b() {
        return ParcelFileDescriptor.class;
    }

    @Override // xsna.e9r.d
    public final ParcelFileDescriptor c(File file) throws FileNotFoundException {
        return ParcelFileDescriptor.open(file, 268435456);
    }
}
