package xsna;

import java.nio.ByteBuffer;
import xsna.w220;
import xsna.x220;

/* compiled from: MemoryMappedAccessors.kt */
/* loaded from: classes6.dex */
public final class cdy implements x220.a<w220.a> {
    @Override // xsna.x220.a
    public final int a(w220.a aVar, ByteBuffer byteBuffer) {
        CharSequence charSequence = aVar.a;
        byte length = (byte) charSequence.length();
        byteBuffer.put(length);
        byteBuffer.position(1);
        w65.s(charSequence, byteBuffer.slice());
        byteBuffer.position(length + 1);
        return 32;
    }

    @Override // xsna.x220.a
    public final w220.a read(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        byteBuffer.position(1);
        z220 z220Var = new z220(b, byteBuffer.slice());
        byteBuffer.position(b + 1);
        return new w220.a(z220Var);
    }
}
