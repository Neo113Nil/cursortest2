package xsna;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import one.video.calls.sdk_private.f;

/* compiled from: PskKeyExchangeModesExtension.java */
/* loaded from: classes8.dex */
public final class wse0 extends pt50 {
    public final ArrayList a;

    public wse0(f.EnumC2174f enumC2174f) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.add(enumC2174f);
    }

    @Override // xsna.pt50
    public final byte[] b() {
        ArrayList arrayList = this.a;
        short size = (short) (arrayList.size() + 1);
        final ByteBuffer allocate = ByteBuffer.allocate(size + 4);
        allocate.putShort(f.c.psk_key_exchange_modes.k);
        allocate.putShort(size);
        allocate.put((byte) arrayList.size());
        arrayList.forEach(new Consumer() { // from class: xsna.vse0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                allocate.put(((f.EnumC2174f) obj).c);
            }
        });
        return allocate.array();
    }

    public wse0(f.EnumC2174f... enumC2174fArr) {
        this.a = new ArrayList();
        for (int i = 0; i < 2; i++) {
            this.a.add(enumC2174fArr[i]);
        }
    }

    public wse0(ByteBuffer byteBuffer) throws one.video.calls.sdk_private.j {
        this.a = new ArrayList();
        int a = a(byteBuffer, f.c.psk_key_exchange_modes.k, 2);
        byte b = byteBuffer.get();
        if (a != b + 1) {
            throw new one.video.calls.sdk_private.j("inconsistent length");
        }
        for (int i = 0; i < b; i++) {
            final byte b2 = byteBuffer.get();
            Arrays.stream(f.EnumC2174f.values()).filter(new Predicate() { // from class: xsna.xuy0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((f.EnumC2174f) obj).c == b2;
                }
            }).findFirst().ifPresent(new Consumer() { // from class: xsna.use0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    wse0.this.a.add((f.EnumC2174f) obj);
                }
            });
        }
    }
}
