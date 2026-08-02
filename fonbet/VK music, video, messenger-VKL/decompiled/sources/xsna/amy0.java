package xsna;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import one.video.calls.sdk_private.aF;
import one.video.calls.sdk_private.aG;
import one.video.calls.sdk_private.bB;
import one.video.calls.sdk_private.bC$a;
import one.video.calls.sdk_private.bE;
import one.video.calls.sdk_private.bF;
import one.video.calls.sdk_private.bN;
import one.video.calls.sdk_private.by;

/* compiled from: VersionNegotiationPacket.java */
/* loaded from: classes8.dex */
public final class amy0 extends tly0 {
    public static final Random j = new Random();
    public byte[] g;
    public int h;
    public final ArrayList i = new ArrayList();

    public amy0(kgy0 kgy0Var) {
        this.a = kgy0Var;
    }

    @Override // xsna.tly0
    public final int b(int i) {
        throw new bB();
    }

    @Override // xsna.tly0
    public final bC$a d(bF bFVar, com.vk.movika.sdk.base.data.converter.c cVar) {
        bE bEVar = (bE) bFVar;
        if (bEVar.P || this.i.contains(bEVar.a.a)) {
            return bC$a.a;
        }
        lgy0 lgy0Var = bEVar.a;
        Objects.toString(lgy0Var);
        throw new bN();
    }

    @Override // xsna.tly0
    public final void h(ByteBuffer byteBuffer, nby0 nby0Var, long j2, sp spVar, int i) throws one.video.calls.sdk_private.bt, one.video.calls.sdk_private.bz {
        int limit = byteBuffer.limit() - byteBuffer.position();
        if (limit < 11) {
            throw new one.video.calls.sdk_private.bz();
        }
        byteBuffer.get();
        if (byteBuffer.getInt() != 0) {
            throw new by();
        }
        int i2 = byteBuffer.get() & 255;
        int i3 = 11 + i2;
        if (limit < i3) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte[] bArr = new byte[i2];
        this.e = bArr;
        byteBuffer.get(bArr);
        int i4 = byteBuffer.get() & 255;
        if (limit < i3 + i4) {
            throw new one.video.calls.sdk_private.bz();
        }
        byte[] bArr2 = new byte[i4];
        this.g = bArr2;
        byteBuffer.get(bArr2);
        while (byteBuffer.remaining() >= 4) {
            kgy0 kgy0Var = new kgy0(byteBuffer.getInt());
            this.i.add(kgy0Var);
            kgy0Var.toString();
        }
        this.h = byteBuffer.limit();
    }

    @Override // xsna.tly0
    public final byte[] j(nby0 nby0Var) {
        int length = this.e.length + 7 + this.g.length;
        ArrayList arrayList = this.i;
        final ByteBuffer allocate = ByteBuffer.allocate((arrayList.size() * 4) + length);
        allocate.put((byte) (((byte) j.nextInt(256)) | 192));
        allocate.putInt(0);
        allocate.put((byte) this.e.length);
        allocate.put(this.e);
        allocate.put((byte) this.g.length);
        allocate.put(this.g);
        arrayList.forEach(new Consumer() { // from class: xsna.zly0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                allocate.put(((kgy0) obj).a());
            }
        });
        return allocate.array();
    }

    @Override // xsna.tly0
    public final aF n() {
        return null;
    }

    @Override // xsna.tly0
    public final aG o() {
        return null;
    }

    @Override // xsna.tly0
    public final Long p() {
        return null;
    }

    @Override // xsna.tly0
    public final boolean r() {
        return false;
    }

    public final String toString() {
        int i = this.h;
        return "Packet V|-|V|" + (i >= 0 ? Integer.valueOf(i) : ".") + "|0  " + ((String) this.i.stream().map(new yly0()).collect(Collectors.joining(", ")));
    }
}
