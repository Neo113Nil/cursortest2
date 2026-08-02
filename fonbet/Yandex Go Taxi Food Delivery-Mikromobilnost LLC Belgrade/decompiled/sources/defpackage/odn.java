package defpackage;

import com.yandex.go.permission.b;
import ru.yandex.taxi.eatskit.dto.GrantResult;

/* loaded from: classes5.dex */
public final class odn {
    public final ty5 a;
    public final v7j0 b;

    public odn(ty5 ty5Var, v7j0 v7j0Var) {
        this.a = ty5Var;
        this.b = v7j0Var;
    }

    public final GrantResult a(String str) {
        b bVar = (b) this.b;
        if (androidx.core.app.b.M(bVar.b.b, str)) {
            return GrantResult.DENIED;
        }
        cne0 cne0Var = bVar.b.c.a;
        StringBuilder sb = new StringBuilder("was_");
        sb.append(str);
        sb.append("_dialog_shown");
        return cne0Var.g(sb.toString(), false) ? GrantResult.DONT_ASK_AGAIN : GrantResult.DENIED;
    }
}
