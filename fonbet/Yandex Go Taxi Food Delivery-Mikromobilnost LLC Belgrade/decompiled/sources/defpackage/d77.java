package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public class d77 implements bpg {
    @Override // defpackage.bpg
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.bpg
    public final cpg build(Object obj) {
        return new e77((ByteBuffer) obj, 0);
    }
}
