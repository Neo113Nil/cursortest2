package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.Set;
import kotlin.a;

/* loaded from: classes15.dex */
public final class fs51 {
    public final q0h a;
    public final av51 b;
    public final a5c c;
    public final Set d;
    public final Set e;
    public final i4h f;
    public final i3y g = a.a(new ec31(28, this));

    public fs51(q0h q0hVar, av51 av51Var, a5c a5cVar, Set set, Set set2, i4h i4hVar) {
        this.a = q0hVar;
        this.b = av51Var;
        this.c = a5cVar;
        this.d = set;
        this.e = set2;
        this.f = i4hVar;
    }

    public final boolean a(String str) {
        av51 av51Var;
        zu51 zu51Var;
        q5u b;
        String queryParameter;
        Uri parse = Uri.parse(str);
        zlm0 zlm0Var = ("scanned_qr".equalsIgnoreCase(parse.getAuthority()) && (queryParameter = parse.getQueryParameter("url")) != null) ? new zlm0(queryParameter) : null;
        if (zlm0Var != null) {
            parse = Uri.parse(zlm0Var.a);
        } else if (this.a.a(parse) == null) {
            parse = null;
        }
        if (parse == null) {
            return false;
        }
        Iterator it = this.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            l530 a = ((f6p0) it.next()).a(parse);
            if (a instanceof k530) {
                parse = ((k530) a).a;
                break;
            }
        }
        Iterator it2 = ((Set) this.g.getValue()).iterator();
        do {
            boolean hasNext = it2.hasNext();
            av51Var = this.b;
            if (!hasNext) {
                av51Var.a(parse, false);
                return false;
            }
            zu51Var = (zu51) it2.next();
            b = zu51Var.b(parse);
        } while (!(b instanceof p5u));
        p5u p5uVar = (p5u) b;
        zu51Var.a(p5uVar.a);
        if (p5uVar.b) {
            this.c.a.g(zy11.a);
        }
        av51Var.a(parse, true);
        return true;
    }
}
