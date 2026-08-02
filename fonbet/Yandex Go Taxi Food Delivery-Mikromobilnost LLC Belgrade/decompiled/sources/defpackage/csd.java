package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class csd implements gkm0 {
    public final Map a;

    public csd(Map map) {
        this.a = map;
    }

    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        return (KSerializer) this.a.get(str);
    }
}
