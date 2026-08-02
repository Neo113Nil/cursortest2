package defpackage;

import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlinx.serialization.json.c;

@gsq0
/* loaded from: classes9.dex */
public final class mx {
    public static final lx Companion = new lx();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ar(10)), null};
    public final String a;
    public final Map b;
    public final c c;

    public /* synthetic */ mx(int i, String str, Map map, c cVar) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, kx.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = map;
        this.c = cVar;
    }
}
