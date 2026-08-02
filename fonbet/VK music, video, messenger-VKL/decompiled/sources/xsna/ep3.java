package xsna;

import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;

/* compiled from: ArticlePickerState.kt */
/* loaded from: classes5.dex */
public final class ep3 implements km50 {
    public final UserId b;
    public final wia0<Article> c;
    public final boolean d;
    public final ewp e;

    public ep3(UserId userId, wia0<Article> wia0Var, boolean z, ewp ewpVar) {
        this.b = userId;
        this.c = wia0Var;
        this.d = z;
        this.e = ewpVar;
    }

    public static ep3 a(ep3 ep3Var, wia0 wia0Var, boolean z, ewp ewpVar, int i) {
        UserId userId = ep3Var.b;
        if ((i & 2) != 0) {
            wia0Var = ep3Var.c;
        }
        if ((i & 8) != 0) {
            ewpVar = ep3Var.e;
        }
        ep3Var.getClass();
        return new ep3(userId, wia0Var, z, ewpVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ep3)) {
            return false;
        }
        ep3 ep3Var = (ep3) obj;
        return epx.f(this.b, ep3Var.b) && epx.f(this.c, ep3Var.c) && this.d == ep3Var.d && epx.f(this.e, ep3Var.e);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        wia0<Article> wia0Var = this.c;
        int b = qoy.b((hashCode + (wia0Var == null ? 0 : wia0Var.hashCode())) * 31, 31, this.d);
        ewp ewpVar = this.e;
        return b + (ewpVar != null ? ewpVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "ArticlePickerState(ownerId=" + this.b + ", article=" + this.c + ", isLoading=" + this.d + ", errorLoading=" + this.e + ')';
    }
}
