package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhtq;", "", "Companion", "ftq", "gtq", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class htq {
    public static final gtq Companion = new gtq();
    public final int a;
    public final FormattedText b;

    public /* synthetic */ htq(int i, int i2, FormattedText formattedText) {
        this.a = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
    }

    public htq() {
        FormattedText formattedText = FormattedText.c;
        this.a = -1;
        this.b = formattedText;
    }
}
