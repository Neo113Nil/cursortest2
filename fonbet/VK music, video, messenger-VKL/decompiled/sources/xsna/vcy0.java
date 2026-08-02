package xsna;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.f;

/* compiled from: EncryptedExtensions.java */
/* loaded from: classes8.dex */
public final class vcy0 extends bdy0 {
    public List<pt50> a;
    public byte[] b;

    public vcy0() {
        List<pt50> list = Collections.EMPTY_LIST;
        this.a = list;
        List list2 = (List) list.stream().map(new f4l(1)).collect(Collectors.toList());
        int sum = list2.stream().mapToInt(new tcy0()).sum();
        byte[] bArr = new byte[sum + 6];
        this.b = bArr;
        final ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putInt((sum + 2) | 134217728);
        wrap.putShort((short) sum);
        list2.forEach(new Consumer() { // from class: xsna.ucy0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wrap.put((byte[]) obj);
            }
        });
    }

    @Override // xsna.bdy0
    public final f.d c() {
        return f.d.encrypted_extensions;
    }

    @Override // xsna.bdy0
    public final byte[] d() {
        return this.b;
    }
}
