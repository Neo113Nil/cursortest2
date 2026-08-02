package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhs60;", "", "Companion", "fs60", "gs60", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class hs60 {
    public static final gs60 Companion = new gs60();
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final er d;

    public /* synthetic */ hs60(int i, FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, er erVar) {
        this.a = (i & 1) == 0 ? FormattedText.c : formattedText;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = erVar;
        }
    }

    public hs60() {
        FormattedText formattedText = FormattedText.c;
        this.a = formattedText;
        this.b = formattedText;
        this.c = null;
        this.d = null;
    }
}
