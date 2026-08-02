package xsna;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferRewinder.java */
/* loaded from: classes12.dex */
public final class cu8 implements com.bumptech.glide.load.data.a<ByteBuffer> {
    public final ByteBuffer a;

    /* compiled from: ByteBufferRewinder.java */
    public static class a implements a.InterfaceC0098a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.a.InterfaceC0098a
        @NonNull
        public final Class<ByteBuffer> b() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.a.InterfaceC0098a
        @NonNull
        public final com.bumptech.glide.load.data.a<ByteBuffer> build(ByteBuffer byteBuffer) {
            return new cu8(byteBuffer);
        }
    }

    public cu8(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    @NonNull
    public final ByteBuffer b() throws IOException {
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.a
    public final void a() {
    }
}
