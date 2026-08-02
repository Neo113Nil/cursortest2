package xsna;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.calls.sdk_private.f;

/* compiled from: ClientHelloPreSharedKeyExtension.java */
/* loaded from: classes8.dex */
public final class sky extends ame0 {
    public List<b> a;
    public ArrayList b;
    public int c;

    /* compiled from: ClientHelloPreSharedKeyExtension.java */
    public static class a {
        public final byte[] a;

        public a(byte[] bArr) {
            this.a = bArr;
        }
    }

    /* compiled from: ClientHelloPreSharedKeyExtension.java */
    public static class b {
        public final byte[] a;
        public final long b;

        public b(long j, byte[] bArr) {
            this.a = bArr;
            this.b = j;
        }
    }

    @Override // xsna.pt50
    public final byte[] b() {
        int sum = this.a.stream().mapToInt(new lky()).sum();
        int sum2 = this.b.stream().mapToInt(new mky()).sum();
        int i = sum + 4 + sum2;
        ByteBuffer allocate = ByteBuffer.allocate(i + 4);
        allocate.putShort(f.c.pre_shared_key.k);
        allocate.putShort((short) i);
        allocate.putShort((short) sum);
        for (b bVar : this.a) {
            allocate.putShort((short) bVar.a.length);
            allocate.put(bVar.a);
            allocate.putInt((int) bVar.b);
        }
        this.c = allocate.position();
        allocate.putShort((short) sum2);
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            allocate.put((byte) aVar.a.length);
            allocate.put(aVar.a);
        }
        byte[] bArr = new byte[allocate.position()];
        allocate.get(bArr);
        return bArr;
    }
}
