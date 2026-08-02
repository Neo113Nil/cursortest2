package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lakz0;", "", "Companion", "xjz0", "yjz0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class akz0 {
    public static final yjz0 Companion = new yjz0();
    public final boolean a;
    public final gkz0 b;
    public final gkz0 c;

    public /* synthetic */ akz0(int i, boolean z, gkz0 gkz0Var, gkz0 gkz0Var2) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = new gkz0(0);
        } else {
            this.b = gkz0Var;
        }
        if ((i & 4) == 0) {
            this.c = new gkz0(0);
        } else {
            this.c = gkz0Var2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akz0)) {
            return false;
        }
        akz0 akz0Var = (akz0) obj;
        return this.a == akz0Var.a && jl40.l(this.b, akz0Var.b) && jl40.l(this.c, akz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Toggle(isSelected=" + this.a + ", enabledActions=" + this.b + ", disabledActions=" + this.c + Extension.C_BRAKE;
    }

    public akz0() {
        gkz0 gkz0Var = new gkz0(0);
        gkz0 gkz0Var2 = new gkz0(0);
        this.a = false;
        this.b = gkz0Var;
        this.c = gkz0Var2;
    }
}
