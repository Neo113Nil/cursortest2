package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmn6;", "", "Companion", "kn6", "ln6", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class mn6 {
    public static final ln6 Companion = new ln6();
    public static final i3y[] d = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(2)), null};
    public final FormattedText a;
    public final jsq0 b;
    public final pn6 c;

    public /* synthetic */ mn6(int i, FormattedText formattedText, jsq0 jsq0Var, pn6 pn6Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = formattedText;
        }
        if ((i & 2) == 0) {
            this.b = ksq0.a;
        } else {
            this.b = jsq0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = pn6Var;
        }
    }

    public mn6() {
        jsq0 jsq0Var = ksq0.a;
        this.a = null;
        this.b = jsq0Var;
        this.c = null;
    }
}
