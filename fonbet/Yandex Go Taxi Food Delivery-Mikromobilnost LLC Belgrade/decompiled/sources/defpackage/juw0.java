package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljuw0;", "Lluw0;", "Companion", "huw0", "iuw0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class juw0 extends luw0 {
    public static final iuw0 Companion = new iuw0();
    public final FormattedText a;
    public final boolean b;

    public juw0(int i, FormattedText formattedText, boolean z) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = true;
        } else {
            this.b = z;
        }
    }

    public juw0() {
        this.a = FormattedText.c;
        this.b = true;
    }
}
