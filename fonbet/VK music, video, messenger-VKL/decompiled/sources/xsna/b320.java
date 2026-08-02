package xsna;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import java.io.InputStream;

/* compiled from: MemoryPooledByteBufferFactory.kt */
/* loaded from: classes.dex */
public final class b320 {
    public final com.facebook.imagepipeline.memory.b a;
    public final mvb0 b;

    public b320(com.facebook.imagepipeline.memory.b bVar, mvb0 mvb0Var) {
        this.a = bVar;
        this.b = mvb0Var;
    }

    public final a320 a(InputStream inputStream, int i) {
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(this.a, i);
        try {
            this.b.a(inputStream, memoryPooledByteBufferOutputStream);
            return memoryPooledByteBufferOutputStream.p();
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    public final MemoryPooledByteBufferOutputStream b() {
        return new MemoryPooledByteBufferOutputStream(this.a);
    }
}
