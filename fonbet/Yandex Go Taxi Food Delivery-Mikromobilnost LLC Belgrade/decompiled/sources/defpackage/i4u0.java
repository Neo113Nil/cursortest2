package defpackage;

import kotlin.Pair;
import kotlin.collections.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.domesticroots.certificatetransparency.internal.loglist.model.v2.State;

/* loaded from: classes4.dex */
public final class i4u0 extends jex {
    public i4u0() {
        super(State.INSTANCE.serializer());
    }

    @Override // defpackage.jex
    public final b a(b bVar) {
        if (!(bVar instanceof c)) {
            return bVar;
        }
        c cVar = (c) bVar;
        String str = (String) a.O(cVar.a.keySet());
        return new c(kotlin.collections.b.o((c) cVar.get(str), new Pair("type", qcx.c(str))));
    }
}
