package xsna;

import androidx.media3.datasource.cache.CacheDataSink;
import java.io.IOException;

/* compiled from: DataSink.java */
/* loaded from: classes12.dex */
public interface wuk {

    /* compiled from: DataSink.java */
    public interface a {
        CacheDataSink createDataSink();
    }

    void close() throws IOException;

    void open(evk evkVar) throws IOException;

    void write(byte[] bArr, int i, int i2) throws IOException;
}
