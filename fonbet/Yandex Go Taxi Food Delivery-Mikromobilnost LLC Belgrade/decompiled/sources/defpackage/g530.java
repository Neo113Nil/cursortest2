package defpackage;

import androidx.compose.ui.node.s;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class g530 {
    public final f530 a;
    public final s b;
    public final Object c;

    public g530(f530 f530Var, s sVar, j390 j390Var) {
        this.a = f530Var;
        this.b = sVar;
        this.c = j390Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ModifierInfo(");
        sb.append(this.a);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.b);
        sb.append(Extension.FIX_SPACE);
        return qv10.r(sb, this.c, ')');
    }
}
