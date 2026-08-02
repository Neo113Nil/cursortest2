package xsna;

import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* compiled from: TypefaceEmojiRasterizer.java */
/* loaded from: classes12.dex */
public final class jup0 {
    public static final ThreadLocal<ri20> d = new ThreadLocal<>();
    public final int a;

    @NonNull
    public final androidx.emoji2.text.g b;
    public volatile int c = 0;

    public jup0(@NonNull androidx.emoji2.text.g gVar, int i) {
        this.b = gVar;
        this.a = i;
    }

    public final int a(int i) {
        ri20 b = b();
        int a = b.a(16);
        if (a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = b.b;
        int i2 = a + b.a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    public final ri20 b() {
        ThreadLocal<ri20> threadLocal = d;
        ri20 ri20Var = threadLocal.get();
        if (ri20Var == null) {
            ri20Var = new ri20();
            threadLocal.set(ri20Var);
        }
        si20 si20Var = this.b.a;
        int a = si20Var.a(6);
        if (a != 0) {
            int i = a + si20Var.a;
            int i2 = (this.a * 4) + si20Var.b.getInt(i) + i + 4;
            int i3 = si20Var.b.getInt(i2) + i2;
            ByteBuffer byteBuffer = si20Var.b;
            ri20Var.b = byteBuffer;
            if (byteBuffer != null) {
                ri20Var.a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                ri20Var.c = i4;
                ri20Var.d = ri20Var.b.getShort(i4);
                return ri20Var;
            }
            ri20Var.a = 0;
            ri20Var.c = 0;
            ri20Var.d = 0;
        }
        return ri20Var;
    }

    @NonNull
    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        ri20 b = b();
        int a = b.a(4);
        sb.append(Integer.toHexString(a != 0 ? b.b.getInt(a + b.a) : 0));
        sb.append(", codepoints:");
        ri20 b2 = b();
        int a2 = b2.a(16);
        if (a2 != 0) {
            int i2 = a2 + b2.a;
            i = b2.b.getInt(b2.b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
