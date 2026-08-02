package xsna;

import com.googlecode.mp4parser.BasicContainer;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;

/* compiled from: AbstractBoxParser.java */
/* loaded from: classes12.dex */
public abstract class vc implements pa8 {
    public static final Logger b = Logger.getLogger(vc.class.getName());
    public final a a = new a();

    /* compiled from: AbstractBoxParser.java */
    public class a extends ThreadLocal<ByteBuffer> {
        @Override // java.lang.ThreadLocal
        public final ByteBuffer initialValue() {
            return ByteBuffer.allocate(32);
        }
    }

    public abstract ga8 a(String str, byte[] bArr, String str2);

    /* JADX WARN: Multi-variable type inference failed */
    public final ga8 b(xuk xukVar, BasicContainer basicContainer) throws IOException {
        long size;
        vc vcVar = this;
        long position = xukVar.position();
        a aVar = vcVar.a;
        aVar.get().rewind().limit(8);
        while (true) {
            int read = xukVar.read(aVar.get());
            if (read == 8) {
                aVar.get().rewind();
                long w = crx0.w(aVar.get());
                byte[] bArr = null;
                if (w < 8 && w > 1) {
                    b.severe("Plausibility check failed: size < 8 (size = " + w + "). Stop parsing!");
                    return null;
                }
                String n = crx0.n(aVar.get());
                if (w == 1) {
                    aVar.get().limit(16);
                    xukVar.read(aVar.get());
                    aVar.get().position(8);
                    size = crx0.x(aVar.get()) - 16;
                } else {
                    size = w == 0 ? xukVar.size() - xukVar.position() : w - 8;
                }
                if ("uuid".equals(n)) {
                    aVar.get().limit(aVar.get().limit() + 16);
                    xukVar.read(aVar.get());
                    byte[] bArr2 = new byte[16];
                    for (int position2 = aVar.get().position() - 16; position2 < aVar.get().position(); position2++) {
                        bArr2[position2 - (aVar.get().position() - 16)] = aVar.get().get(position2);
                    }
                    size -= 16;
                    bArr = bArr2;
                }
                ga8 a2 = vcVar.a(n, bArr, basicContainer instanceof ga8 ? ((ga8) basicContainer).getType() : "");
                a2.setParent(basicContainer);
                aVar.get().rewind();
                a2.parse(xukVar, aVar.get(), size, vcVar);
                return a2;
            }
            if (read < 0) {
                xukVar.position(position);
                throw new EOFException();
            }
            vcVar = this;
        }
    }
}
