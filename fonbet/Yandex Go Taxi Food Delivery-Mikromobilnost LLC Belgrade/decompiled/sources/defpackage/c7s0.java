package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lc7s0;", "Lka40;", "Companion", "a7s0", "b7s0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class c7s0 extends ka40 {
    public static final b7s0 Companion = new b7s0();
    public final FormattedText a;
    public final FormattedText b;
    public final qx20 c;
    public final String d;
    public final String e;
    public final String f;

    public c7s0(int i, FormattedText formattedText, FormattedText formattedText2, qx20 qx20Var, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = qx20Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    public c7s0() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
