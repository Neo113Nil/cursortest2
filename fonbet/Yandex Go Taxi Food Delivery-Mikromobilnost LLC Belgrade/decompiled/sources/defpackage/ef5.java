package defpackage;

import java.nio.ByteBuffer;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes10.dex */
public final class ef5 extends nyg {
    public long B;
    public int C;
    public int D;

    public ef5() {
        super(2);
        this.D = 32;
    }

    @Override // defpackage.nyg
    public final void d() {
        super.d();
        this.C = 0;
    }

    public final boolean k(nyg nygVar) {
        ByteBuffer byteBuffer;
        d6z.l(!nygVar.b(1073741824));
        d6z.l(!nygVar.b(SelfTester_JCP.IMITA));
        d6z.l(!nygVar.b(4));
        if (l()) {
            if (this.C >= this.D) {
                return false;
            }
            ByteBuffer byteBuffer2 = nygVar.w;
            if (byteBuffer2 != null && (byteBuffer = this.w) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.C;
        this.C = i + 1;
        if (i == 0) {
            this.y = nygVar.y;
            if (nygVar.b(1)) {
                this.a = 1;
            }
        }
        ByteBuffer byteBuffer3 = nygVar.w;
        if (byteBuffer3 != null) {
            f(byteBuffer3.remaining());
            this.w.put(byteBuffer3);
        }
        this.B = nygVar.y;
        return true;
    }

    public final boolean l() {
        return this.C > 0;
    }
}
