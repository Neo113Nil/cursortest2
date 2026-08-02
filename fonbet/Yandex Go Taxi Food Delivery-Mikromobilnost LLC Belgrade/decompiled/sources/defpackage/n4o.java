package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public abstract class n4o extends h9 {
    public final i3y e = a.b(LazyThreadSafetyMode.PUBLICATION, new sbc(21, this));

    public abstract KSerializer g();

    public final tls h() {
        return (tls) this.e.getValue();
    }
}
