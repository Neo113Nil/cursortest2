package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Le670;", "Lhf40;", "Companion", "c670", "d670", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class e670 extends hf40 {
    public static final d670 Companion = new d670();
    public static final i3y[] d = {null, null, a.b(LazyThreadSafetyMode.PUBLICATION, new y570(1))};
    public final FormattedText a;
    public final FormattedText b;
    public final List c;

    public /* synthetic */ e670(int i, List list, FormattedText formattedText, FormattedText formattedText2) {
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
            this.c = EmptyList.a;
        } else {
            this.c = list;
        }
    }

    public e670() {
        this.a = null;
        this.b = null;
        this.c = EmptyList.a;
    }
}
