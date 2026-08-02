package sg.bigo.ads.cj;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes9.dex */
public final class p {
    public final List<a> a = new ArrayList();

    public static abstract class a {
        private a() {
        }

        public abstract int a();

        public abstract void a(ByteBuffer byteBuffer);

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public final void a(final int i) {
        this.a.add(new a() { // from class: sg.bigo.ads.cj.p.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((byte) 0);
            }

            @Override // sg.bigo.ads.cj.p.a
            public final int a() {
                return 4;
            }

            @Override // sg.bigo.ads.cj.p.a
            public final void a(ByteBuffer byteBuffer) {
                byteBuffer.putInt(i);
            }
        });
    }

    public final void a(String str) {
        this.a.add(new a(str) { // from class: sg.bigo.ads.cj.p.1
            final byte[] a;
            final /* synthetic */ String b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((byte) 0);
                byte[] bArr;
                this.b = str;
                try {
                    bArr = str.getBytes(C.UTF8_NAME);
                } catch (Exception unused) {
                    bArr = new byte[0];
                }
                this.a = bArr;
            }

            @Override // sg.bigo.ads.cj.p.a
            public final int a() {
                return this.a.length + 4;
            }

            @Override // sg.bigo.ads.cj.p.a
            public final void a(ByteBuffer byteBuffer) {
                byteBuffer.putInt(this.a.length);
                byteBuffer.put(this.a);
            }
        });
    }
}
