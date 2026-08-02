package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lam6;", "Lxl6;", "Companion", "yl6", "zl6", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class am6 extends xl6 {
    public static final zl6 Companion = new zl6();
    public final FormattedText a;

    public /* synthetic */ am6(int i, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = new FormattedText(0);
        } else {
            this.a = formattedText;
        }
    }

    /* renamed from: a, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    public am6() {
        this.a = new FormattedText(0);
    }
}
