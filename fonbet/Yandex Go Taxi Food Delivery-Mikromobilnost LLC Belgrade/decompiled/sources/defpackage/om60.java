package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;

/* loaded from: classes.dex */
public final class om60 implements b70 {
    public final b70 a;

    public om60(b70 b70Var) {
        this.a = b70Var;
        if (b70Var instanceof om60) {
            ny61.r("The adapter is already nullable");
            throw null;
        }
    }

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        if (obj == null) {
            bfxVar.k2();
        } else {
            this.a.a(bfxVar, cVar, obj);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        if (xdxVar.peek() != JsonReader$Token.NULL) {
            return this.a.b(xdxVar, cVar);
        }
        xdxVar.skipValue();
        return null;
    }
}
