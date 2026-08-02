package xsna;

import java.util.UUID;

/* compiled from: UuidGenerator.kt */
/* loaded from: classes.dex */
public final class f4r0 implements e4r0 {
    public static final f4r0 a = new f4r0();

    @Override // xsna.e4r0
    public final UUID next() {
        return UUID.randomUUID();
    }
}
