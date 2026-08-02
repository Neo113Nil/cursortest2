package defpackage;

import kotlin.Pair;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class p3w extends un0 {
    public boolean c;

    public p3w(b bVar) {
        super("mapkit", bVar);
    }

    @Override // defpackage.un0
    public final synchronized c a(c cVar) {
        if (!this.c) {
            this.c = true;
            cVar = new c(kotlin.collections.b.o(cVar, new Pair(this.a, this.b)));
        }
        return cVar;
    }
}
