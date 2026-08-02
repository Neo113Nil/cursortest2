package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljqw0;", "", "Companion", "hqw0", "iqw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class jqw0 {
    public static final iqw0 Companion = new iqw0();
    public final FormattedText a;
    public final FormattedText b;
    public final eqw0 c;
    public final String d;
    public final String e;
    public final osw0 f;
    public final bqw0 g;

    public /* synthetic */ jqw0(int i, FormattedText formattedText, FormattedText formattedText2, eqw0 eqw0Var, String str, String str2, osw0 osw0Var, bqw0 bqw0Var) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = new eqw0(0);
        } else {
            this.c = eqw0Var;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = new osw0(0);
        } else {
            this.f = osw0Var;
        }
        if ((i & 64) == 0) {
            this.g = new bqw0(0);
        } else {
            this.g = bqw0Var;
        }
    }

    public jqw0() {
        this(0);
    }

    public jqw0(int i) {
        FormattedText formattedText = FormattedText.c;
        eqw0 eqw0Var = new eqw0(0);
        osw0 osw0Var = new osw0(0);
        bqw0 bqw0Var = new bqw0(0);
        this.a = formattedText;
        this.b = formattedText;
        this.c = eqw0Var;
        this.d = "";
        this.e = "";
        this.f = osw0Var;
        this.g = bqw0Var;
    }
}
