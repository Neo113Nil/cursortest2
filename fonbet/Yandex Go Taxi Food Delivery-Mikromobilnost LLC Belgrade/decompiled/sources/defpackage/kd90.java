package defpackage;

import java.util.HashMap;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public class kd90 {
    public final HashMap a = new HashMap();

    static {
        new kd90();
    }

    public final void a(String str, KSerializer kSerializer) {
        this.a.put(str, kSerializer);
    }
}
