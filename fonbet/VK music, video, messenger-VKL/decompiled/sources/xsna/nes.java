package xsna;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: FragmentedMp4SampleList.java */
/* loaded from: classes13.dex */
public final class nes implements f0h0 {
    public final /* synthetic */ long a;
    public final /* synthetic */ ByteBuffer b;
    public final /* synthetic */ int c;

    public nes(long j, int i, ByteBuffer byteBuffer) {
        this.a = j;
        this.b = byteBuffer;
        this.c = i;
    }

    @Override // xsna.f0h0
    public final void a(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write((ByteBuffer) ((ByteBuffer) this.b.position(this.c)).slice().limit(up2.p(this.a)));
    }

    @Override // xsna.f0h0
    public final long getSize() {
        return this.a;
    }
}
