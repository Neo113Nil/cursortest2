package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ljud0;", "Litd0;", "Companion", "iud0", "hud0", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class jud0 extends itd0 {
    public static final iud0 Companion = new iud0();
    public final FormattedText a;

    static {
        new jud0(0);
    }

    public jud0(int i, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = FormattedText.c;
        } else {
            this.a = formattedText;
        }
    }

    public jud0() {
        this(0);
    }

    public jud0(int i) {
        this.a = FormattedText.c;
    }
}
