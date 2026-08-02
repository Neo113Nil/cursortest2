package xsna;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import one.video.calls.sdk_private.f;

/* compiled from: SignatureAlgorithmsExtension.java */
/* loaded from: classes8.dex */
public final class rvp0 extends pt50 {
    public List<f.g> a;

    public rvp0() {
        this.a = new ArrayList();
        this.a = Collections.EMPTY_LIST;
    }

    @Override // xsna.pt50
    public final byte[] b() {
        List<f.g> list = this.a;
        int size = list.size() << 1;
        int i = size + 2;
        ByteBuffer allocate = ByteBuffer.allocate(size + 6);
        allocate.putShort(f.c.signature_algorithms.k);
        allocate.putShort((short) i);
        allocate.putShort((short) (list.size() << 1));
        Iterator<f.g> it = list.iterator();
        while (it.hasNext()) {
            allocate.putShort(it.next().g);
        }
        return allocate.array();
    }
}
