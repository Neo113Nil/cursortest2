package defpackage;

import java.util.LinkedHashMap;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class oex extends lex {
    public String i;
    public boolean j;

    @Override // defpackage.lex, defpackage.f8
    public final b Y() {
        return new c((LinkedHashMap) this.h);
    }

    @Override // defpackage.lex, defpackage.f8
    public final void Z(String str, b bVar) {
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                str2 = null;
            }
            linkedHashMap.put(str2, bVar);
            this.j = true;
            return;
        }
        if (bVar instanceof d) {
            this.i = ((d) bVar).a();
            this.j = false;
        } else {
            if (bVar instanceof c) {
                throw qje.a(mdx.b);
            }
            if (bVar instanceof a) {
                throw qje.a(zbx.b);
            }
            w511.b();
        }
    }
}
