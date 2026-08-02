package defpackage;

import androidx.compose.ui.semantics.c;
import java.util.List;

/* loaded from: classes.dex */
public final class inq0 {
    public final cnq0 a;
    public final xx40 b;

    public inq0(c cVar, x5w x5wVar) {
        this.a = cVar.d;
        List j = c.j(cVar, 4);
        this.b = new xx40(j.size());
        int size = j.size();
        for (int i = 0; i < size; i++) {
            c cVar2 = (c) j.get(i);
            if (x5wVar.a(cVar2.f)) {
                this.b.a(cVar2.f);
            }
        }
    }
}
