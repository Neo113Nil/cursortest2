package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.surge.models.dto.ButtonStyle;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ll07;", "", "Companion", "j07", "k07", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class l07 {
    public static final k07 Companion = new k07();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(14)), null};
    public final String a;
    public final ButtonStyle b;
    public final kvw0 c;

    public /* synthetic */ l07(int i, String str, ButtonStyle buttonStyle, kvw0 kvw0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = ButtonStyle.DEFAULT;
        } else {
            this.b = buttonStyle;
        }
        if ((i & 4) == 0) {
            this.c = jvw0.INSTANCE;
        } else {
            this.c = kvw0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l07)) {
            return false;
        }
        l07 l07Var = (l07) obj;
        return jl40.l(this.a, l07Var.a) && this.b == l07Var.b && jl40.l(this.c, l07Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ButtonItem(title=" + this.a + ", style=" + this.b + ", action=" + this.c + Extension.C_BRAKE;
    }

    public l07() {
        ButtonStyle buttonStyle = ButtonStyle.DEFAULT;
        jvw0 jvw0Var = jvw0.INSTANCE;
        this.a = "";
        this.b = buttonStyle;
        this.c = jvw0Var;
    }
}
