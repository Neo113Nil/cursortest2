package sg.bigo.ads.bq;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.URL;
import java.nio.ByteBuffer;
import sg.bigo.ads.an.g;

/* loaded from: classes9.dex */
public final class b {
    final sg.bigo.ads.bs.c<?> a;

    @Nullable
    final g b;
    URL c;
    boolean d = false;

    public static final class a extends UploadDataProvider {
        private final byte[] a;
        private int b = 0;

        public a(@NonNull byte[] bArr) {
            this.a = bArr;
        }

        public final long getLength() {
            return this.a.length;
        }

        public final void read(@NonNull UploadDataSink uploadDataSink, @NonNull ByteBuffer byteBuffer) {
            int min = Math.min(byteBuffer.remaining(), this.a.length - this.b);
            byteBuffer.put(this.a, this.b, min);
            this.b += min;
            uploadDataSink.onReadSucceeded(false);
        }

        public final void rewind(@NonNull UploadDataSink uploadDataSink) {
            this.b = 0;
            uploadDataSink.onRewindSucceeded();
        }
    }

    public b(@NonNull sg.bigo.ads.bs.c<?> cVar, @Nullable g gVar) {
        this.a = cVar;
        this.b = gVar;
    }

    @NonNull
    public final String toString() {
        return "requestUrl=" + this.a.g();
    }
}
