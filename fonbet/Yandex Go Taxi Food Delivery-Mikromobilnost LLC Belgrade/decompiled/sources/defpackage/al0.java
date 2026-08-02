package defpackage;

import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lal0;", "", "Companion", "yk0", "zk0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class al0 {
    public static final zk0 Companion = new zk0();
    public final FormattedText a;
    public final FormattedText b;
    public final uk0 c;

    public /* synthetic */ al0(int i, FormattedText formattedText, FormattedText formattedText2, uk0 uk0Var) {
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
            this.c = uk0Var;
        }
    }

    public al0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
