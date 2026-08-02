package xsna;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import xsna.e9r;

/* compiled from: FileLoader.java */
/* loaded from: classes12.dex */
public final class g9r implements e9r.d<InputStream> {
    @Override // xsna.e9r.d
    public final void a(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // xsna.e9r.d
    public final Class<InputStream> b() {
        return InputStream.class;
    }

    @Override // xsna.e9r.d
    public final InputStream c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }
}
