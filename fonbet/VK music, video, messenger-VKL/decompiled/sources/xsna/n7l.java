package xsna;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* compiled from: DecodeBufferHelper.java */
/* loaded from: classes.dex */
public final class n7l implements svb0<ByteBuffer> {
    public static final a a = new a();

    /* compiled from: DecodeBufferHelper.java */
    public class a extends ThreadLocal<ByteBuffer> {
        @Override // java.lang.ThreadLocal
        public final ByteBuffer initialValue() {
            a aVar = n7l.a;
            return ByteBuffer.allocate(16384);
        }
    }

    @Override // xsna.svb0
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer) {
        return true;
    }

    @Override // xsna.svb0
    @Nullable
    public final ByteBuffer c() {
        return a.get();
    }
}
