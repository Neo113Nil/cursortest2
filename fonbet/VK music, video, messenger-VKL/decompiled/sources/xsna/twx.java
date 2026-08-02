package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import one.video.calls.sdk_private.f;

/* compiled from: ApplicationLayerProtocolNegotiationExtension.java */
/* loaded from: classes8.dex */
public final class twx extends pt50 {
    public final List<String> a;

    public twx(String str) {
        if (str == null || str.trim().isEmpty()) {
            throw new IllegalArgumentException("protocol cannot be empty");
        }
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{str}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // xsna.pt50
    public final byte[] b() {
        List<String> list = this.a;
        int size = list.size() + 6 + list.stream().mapToInt(new pwx()).sum();
        final ByteBuffer allocate = ByteBuffer.allocate(size);
        allocate.putShort(f.c.application_layer_protocol_negotiation.k);
        allocate.putShort((short) (size - 4));
        allocate.putShort((short) (size - 6));
        list.forEach(new Consumer() { // from class: xsna.qwx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                byte[] bytes = ((String) obj).getBytes(Charset.forName(C.UTF8_NAME));
                byte length = (byte) bytes.length;
                ByteBuffer byteBuffer = allocate;
                byteBuffer.put(length);
                byteBuffer.put(bytes);
            }
        });
        return allocate.array();
    }

    public final String toString() {
        return go9.c("AlpnExtension ", this.a);
    }

    public twx(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.j {
        int a = a(byteBuffer, f.c.application_layer_protocol_negotiation.k, 3);
        int i = byteBuffer.getShort();
        if (i == a - 2) {
            this.a = new ArrayList();
            while (i > 0) {
                int i2 = byteBuffer.get() & 255;
                if (i2 <= i - 1) {
                    byte[] bArr = new byte[i2];
                    byteBuffer.get(bArr);
                    this.a.add(new String(bArr));
                    i -= i2 + 1;
                } else {
                    throw new one.video.calls.sdk_private.j("incorrect length");
                }
            }
            return;
        }
        throw new one.video.calls.sdk_private.j("inconsistent lengths");
    }
}
