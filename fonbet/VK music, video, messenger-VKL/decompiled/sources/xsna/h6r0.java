package xsna;

import com.facebook.soloader.MinElf;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import one.video.calls.sdk_private.f;

/* compiled from: SupportedGroupsExtension.java */
/* loaded from: classes8.dex */
public final class h6r0 extends pt50 {
    public final ArrayList a;

    public h6r0(f.e eVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(eVar);
    }

    @Override // xsna.pt50
    public final byte[] b() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() << 1;
        int i = size + 2;
        ByteBuffer allocate = ByteBuffer.allocate(size + 6);
        allocate.putShort(f.c.supported_groups.k);
        allocate.putShort((short) i);
        allocate.putShort((short) (arrayList.size() << 1));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.putShort(((f.e) it.next()).f);
        }
        return allocate.array();
    }

    public final String toString() {
        return "SupportedGroupsExtension" + this.a;
    }

    public h6r0(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.j {
        this.a = new ArrayList();
        int a = a(byteBuffer, f.c.supported_groups.k, 4);
        short s = byteBuffer.getShort();
        if (a == s + 2) {
            if (s % 2 != 0) {
                throw new one.video.calls.sdk_private.j("invalid group length");
            }
            for (int i = 0; i < s; i += 2) {
                Arrays.stream(f.e.values()).filter(new wuy0(byteBuffer.getShort() % MinElf.PN_XNUM)).findFirst().ifPresent(new Consumer() { // from class: xsna.b6r0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        h6r0.this.a.add((f.e) obj);
                    }
                });
            }
            return;
        }
        throw new one.video.calls.sdk_private.j("inconsistent length");
    }
}
