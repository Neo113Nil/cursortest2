package xsna;

import com.vk.toggle.b;
import java.nio.ByteBuffer;
import xsna.x220;

/* compiled from: MemoryMappedAccessors.kt */
/* loaded from: classes6.dex */
public final class bkr0 implements x220.a<b.d> {
    @Override // xsna.x220.a
    public final int a(b.d dVar, ByteBuffer byteBuffer) {
        b.d dVar2 = dVar;
        CharSequence charSequence = dVar2.b;
        byteBuffer.putInt(charSequence.toString().length());
        byteBuffer.position(4);
        int s = w65.s(charSequence.toString(), byteBuffer.slice());
        byteBuffer.position(4 + s);
        byteBuffer.put(dVar2.a ? (byte) 1 : (byte) 0);
        byteBuffer.position(s + 5);
        String obj = dVar2.c.toString();
        byteBuffer.putInt(obj != null ? obj.length() : 0);
        int i = s + 9;
        byteBuffer.position(i);
        String obj2 = dVar2.c.toString();
        return i + (obj2 != null ? w65.s(obj2, byteBuffer.slice()) : 0);
    }

    @Override // xsna.x220.a
    public final b.d read(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        byteBuffer.position(4);
        z220 z220Var = new z220(i, byteBuffer.slice());
        byteBuffer.position(4 + i);
        boolean z = byteBuffer.get() != 0;
        byteBuffer.position(i + 5);
        int i2 = byteBuffer.getInt();
        byteBuffer.position(i + 9);
        ByteBuffer slice = byteBuffer.slice();
        if (i2 <= slice.capacity()) {
            return new b.d(z220Var, new z220(i2, slice), z);
        }
        throw new IllegalArgumentException("length cannot be bigger than buffer capacity, length=" + slice + ", buffer=" + slice.capacity());
    }
}
