package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldm6;", "Lxl6;", "Companion", "bm6", "cm6", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class dm6 extends xl6 {
    public static final cm6 Companion = new cm6();
    public final FormattedText a;
    public final FormattedText b;

    public /* synthetic */ dm6(int i, FormattedText formattedText, FormattedText formattedText2) {
        this.a = (i & 1) == 0 ? new FormattedText(0) : formattedText;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = formattedText2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final FormattedText getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final FormattedText getA() {
        return this.a;
    }

    public dm6() {
        this.a = new FormattedText(0);
        this.b = null;
    }
}
