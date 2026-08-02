package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Liiz0;", "", "Companion", "fiz0", "giz0", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class iiz0 {
    public static final giz0 Companion = new giz0();
    public static final i3y[] d = {a.b(LazyThreadSafetyMode.PUBLICATION, new pyy0(17)), null, null};
    public final List a;
    public final String b;
    public final FormattedText c;

    public /* synthetic */ iiz0(int i, List list, String str, FormattedText formattedText) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText;
        }
    }

    public iiz0() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
