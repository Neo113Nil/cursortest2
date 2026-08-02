package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.Map;

/* loaded from: classes.dex */
public final class ep60 implements b70 {
    public final b70 a;
    public final boolean b;

    public ep60(b70 b70Var, boolean z) {
        this.a = b70Var;
        this.b = z;
    }

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        boolean z = this.b;
        b70 b70Var = this.a;
        if (!z || (bfxVar instanceof ek00)) {
            bfxVar.u();
            b70Var.a(bfxVar, cVar, obj);
            bfxVar.y();
        } else {
            ek00 ek00Var = new ek00();
            ek00Var.u();
            b70Var.a(ek00Var, cVar, obj);
            ek00Var.y();
            uga1.f(bfxVar, ek00Var.c());
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        if (this.b) {
            if (xdxVar instanceof zj00) {
                xdxVar = (zj00) xdxVar;
            } else {
                JsonReader$Token peek = xdxVar.peek();
                if (peek != JsonReader$Token.BEGIN_OBJECT) {
                    yci0.n("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `", peek, "` json token");
                    return null;
                }
                xdxVar = new zj00((Map) ooc.y(xdxVar), xdxVar.getPath());
            }
        }
        xdxVar.u();
        Object b = this.a.b(xdxVar, cVar);
        xdxVar.y();
        return b;
    }
}
