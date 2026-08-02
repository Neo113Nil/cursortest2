package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhar;", "", "Companion", "far", "gar", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class har {
    public static final gar Companion = new gar();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final er d;

    public /* synthetic */ har(int i, String str, FormattedText formattedText, FormattedText formattedText2, er erVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = erVar;
        }
    }

    public har() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
